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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

    final UUID AIRPLINE_ID = UUID.fromString("b1117889-796f-4230-bb32-bcc3a66a1dd2");
    final UUID BOARD_ID = UUID.fromString("adc41438-713f-4d11-b8f8-ed4f650e928d");

    static BoardAirplaneControllerApi boardAirpaneControllerApi = new BoardAirplaneControllerApi();
    static BoardControllerApi boardControllerApi = new BoardControllerApi();


    @Test
    public void test() {


        try {
            boardAirpaneControllerApi.register(AIRPLINE_ID, BOARD_ID);
            boardControllerApi.start(AIRPLINE_ID, BOARD_ID);

//            System.out.println(new BoardControllerApi().getScore(AIRPLINE_ID, BOARD_ID));


//            CurrentPositionDTO we = boardAirplaneControllerApi.moveAirplane(AIRPLINE_ID, BOARD_ID, "NE");

//            System.out.println(boardControllerApi.getDetails(AIRPLINE_ID, BOARD_ID));

            while (true) {
                try {
                    System.out.println(boardControllerApi.getScore(AIRPLINE_ID, BOARD_ID));
                    move();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        } catch (ApiException e) {
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
//        System.out.println(we);

    }

    private void move() throws ApiException, InterruptedException {
        BoardDetailsDTO details = boardControllerApi.getDetails(AIRPLINE_ID, BOARD_ID);
        AirplaneDTO currentAirplane = getCurrentAirplane(boardControllerApi, details);


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
        int x = (passengerDTO.getX() - karakan.getX()) * (passengerDTO.getX() - karakan.getX());
        int y = (passengerDTO.getY() - karakan.getY()) * (passengerDTO.getY() - karakan.getY());

        return Math.sqrt(x + y);
    }

    private AirplaneDTO getCurrentAirplane(BoardControllerApi boardControllerApi, BoardDetailsDTO detailsDTO) throws ApiException {
        return detailsDTO.getAirplanes()
                .stream()
                .filter(z -> z.getName().equals("karakan"))
                .findFirst().get();
    }

}
