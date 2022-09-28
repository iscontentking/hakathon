package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AirplaneDTO;
import io.swagger.client.model.BoardDetailsDTO;
import io.swagger.client.model.PassengerDTO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class ClientTest {

    public static final UUID AIRPLANE_ID = UUID.fromString("b1117889-796f-4230-bb32-bcc3a66a1dd2");
    public static final UUID BOARD_ID = UUID.fromString("00400291-a307-4d75-b3d7-f66784d977cf");
    public static final String AIRPLANE_NAME = "karakan";

    static BoardAirplaneControllerApi boardAirpaneControllerApi = new BoardAirplaneControllerApi();
    static BoardControllerApi boardControllerApi = new BoardControllerApi();

    @Test
    public void test() {


        while (true) {
            try {
                System.out.println(boardControllerApi.getScore(AIRPLANE_ID, BOARD_ID));
                move();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private void move() throws ApiException {
        BoardDetailsDTO details = boardControllerApi.getDetails(AIRPLANE_ID, BOARD_ID);
        AirplaneDTO currentAirplane = getCurrentAirplane(details);


        System.out.println("----------------------------------------------");
        System.out.println(currentAirplane);

        PassengerDTO nearestPassenger = getNearestPassenger(currentAirplane, details)
                .get();

        ArrayList<String> directions = new ArrayList<>();


        while (!nearestPassenger.getY().equals(currentAirplane.getY()) || !nearestPassenger.getX().equals(currentAirplane.getX())) {
            directions.add(getDirection(currentAirplane, nearestPassenger));
        }

//        ExecutorService EXECUTOR_SERVICE = Executors.newCachedThreadPool();
        directions.forEach(dir -> {
//            EXECUTOR_SERVICE.submit(() -> {
                try {
                    boardAirpaneControllerApi.moveAirplane(AIRPLANE_ID, BOARD_ID, dir);
                } catch (ApiException e) {
                    e.printStackTrace();
                }
//            });
        });
//        EXECUTOR_SERVICE.shutdown();

        boardAirpaneControllerApi.takePassenger(AIRPLANE_ID, BOARD_ID, nearestPassenger.getId());
    }

    private String getDirection(AirplaneDTO currentAirplane, PassengerDTO nearestPassenger) {
        String xLetter = "";
        String yLetter = "";


        if (nearestPassenger.getX() < currentAirplane.getX()) {
            xLetter = "W";
            currentAirplane.setX(currentAirplane.getX() - 1);
        }
        if (nearestPassenger.getX() > currentAirplane.getX()) {
            xLetter = "E";
            currentAirplane.setX(currentAirplane.getX() + 1);
        }

        if (nearestPassenger.getY() < currentAirplane.getY()) {
            yLetter = "S";
            currentAirplane.setY(currentAirplane.getY() - 1);
        }
        if (nearestPassenger.getY() > currentAirplane.getY()) {
            currentAirplane.setY(currentAirplane.getY() + 1);
            yLetter = "N";
        }

        return yLetter + xLetter;
    }

    private Optional<PassengerDTO> getNearestPassenger(AirplaneDTO karakan, BoardDetailsDTO details) throws ApiException {
        return details
                .getPassengers().stream()
                .filter(z -> z.getTakenBy() == null)
                .sorted((a, b) -> compareDistance(a, b, karakan))
                .findFirst();
    }

    private int compareDistance(PassengerDTO passengerDTO, PassengerDTO passengerDTO1, AirplaneDTO karakan) {

        if (distance(passengerDTO, karakan) >= distance(passengerDTO1, karakan)) {
            return 1;
        } else {
            return -1;
        }

    }

    private double distance(PassengerDTO passengerDTO, AirplaneDTO airplane) {
        int x = Math.abs(passengerDTO.getX() - airplane.getX());
        int y = Math.abs(passengerDTO.getY() - airplane.getY());
        return Math.max(x, y);
    }

    private AirplaneDTO getCurrentAirplane(BoardDetailsDTO detailsDTO) {
        return detailsDTO.getAirplanes()
                .stream()
                .filter(z -> z.getName().equals(AIRPLANE_NAME))
                .findFirst().get();
    }

}
