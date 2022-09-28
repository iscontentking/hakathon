package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AirplaneDTO;
import io.swagger.client.model.BoardDetailsDTO;
import io.swagger.client.model.CurrentPositionDTO;
import io.swagger.client.model.PassengerDTO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class ClientTest {

    public static final UUID AIRPLINE_ID = UUID.fromString("b1117889-796f-4230-bb32-bcc3a66a1dd2");
    public static final UUID BOARD_ID = UUID.fromString("00400291-a307-4d75-b3d7-f66784d977cf");

    static BoardAirplaneControllerApi boardAirpaneControllerApi = new BoardAirplaneControllerApi();
    static BoardControllerApi boardControllerApi = new BoardControllerApi();


    @Test
    public void test() {


        while (true) {
            try {
                System.out.println(boardControllerApi.getScore(AIRPLINE_ID, BOARD_ID));
                move();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private void move() throws ApiException, InterruptedException {
        BoardDetailsDTO details = boardControllerApi.getDetails(AIRPLINE_ID, BOARD_ID);
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
                    boardAirpaneControllerApi.moveAirplane(AIRPLINE_ID, BOARD_ID, dir);
                } catch (ApiException e) {
                    e.printStackTrace();
                }
//            });
        });
//        EXECUTOR_SERVICE.shutdown();

//        String direction = getDirection(currentAirplane, nearestPassenger);


//        CurrentPositionDTO newPosition = boardAirpaneControllerApi.moveAirplane(AIRPLINE_ID, BOARD_ID, direction);

//        if (isOnPassenger(nearestPassenger, newPosition)) {
        boardAirpaneControllerApi.takePassenger(AIRPLINE_ID, BOARD_ID, nearestPassenger.getId());
//        }
    }

    private boolean isOnPassenger(PassengerDTO nearestPassenger, CurrentPositionDTO newPosition) {
        return nearestPassenger.getY().equals(newPosition.getY()) && nearestPassenger.getX().equals(newPosition.getX());
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

        String direction = yLetter + xLetter;
        return direction;
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

    private double distance(PassengerDTO passengerDTO, AirplaneDTO karakan) {
        int x = Math.abs(passengerDTO.getX() - karakan.getX());
        int y = Math.abs(passengerDTO.getY() - karakan.getY());
        return Math.max(x, y);
    }

    private AirplaneDTO getCurrentAirplane(BoardDetailsDTO detailsDTO) throws ApiException {
        return detailsDTO.getAirplanes()
                .stream()
                .filter(z -> z.getName().equals("karakan"))
                .findFirst().get();
    }

}
