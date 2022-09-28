package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AirplaneDTO;
import io.swagger.client.model.CurrentPositionDTO;
import io.swagger.client.model.PassengerDTO;
import org.junit.Test;

import java.util.Optional;
import java.util.UUID;

public class Client2Test {

    final UUID AIRPLINE_ID = UUID.fromString("b1117889-796f-4230-bb32-bcc3a66a1dd2");
    final UUID BOARD_ID = UUID.fromString("e8134744-a4df-4d20-b795-3147c6936528");

    static BoardAirplaneControllerApi boardAirpaneControllerApi = new BoardAirplaneControllerApi();
    static BoardControllerApi boardControllerApi = new BoardControllerApi();


    @Test
    public void test() {


        try {

//            boardAirpaneControllerApi.register(AIRPLINE_ID, BOARD_ID);
//            boardControllerApi.start(AIRPLINE_ID, BOARD_ID);
//            System.out.println(new BoardControllerApi().getScore(AIRPLINE_ID, BOARD_ID));


//            CurrentPositionDTO we = boardAirplaneControllerApi.moveAirplane(AIRPLINE_ID, BOARD_ID, "NE");

            System.out.println(boardControllerApi.getDetails(AIRPLINE_ID, BOARD_ID));

//            while (true) {
//                move();
//            }


        } catch (ApiException e) {
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
//        System.out.println(we);

    }

    private void move() throws ApiException {
        AirplaneDTO currentAirplane = getCurrentAirplane(boardControllerApi);


        System.out.println("----------------------------------------------");
        System.out.println(currentAirplane);

        PassengerDTO nearestPassenger = getNearestPassenger(currentAirplane)
                .get();


        String xLetter = "";
        String yLetter = "";


        if (nearestPassenger.getX() < currentAirplane.getX()) {
            xLetter = "W";
        }
        if (nearestPassenger.getX() > currentAirplane.getX()) {
            xLetter = "E";
        }

        if (nearestPassenger.getY() < currentAirplane.getY()) {
            yLetter = "S";
        }
        if (nearestPassenger.getY() > currentAirplane.getY()) {
            yLetter = "N";
        }

        String direction = yLetter + xLetter;


        CurrentPositionDTO newPosition = boardAirpaneControllerApi.moveAirplane(AIRPLINE_ID, BOARD_ID, direction);

        if (nearestPassenger.getY().equals(newPosition.getY()) && nearestPassenger.getX().equals(newPosition.getX())) {
            boardAirpaneControllerApi.takePassenger(AIRPLINE_ID, BOARD_ID, nearestPassenger.getId());
        }
    }

    private Optional<PassengerDTO> getNearestPassenger(AirplaneDTO karakan) throws ApiException {
        return boardControllerApi.getDetails(AIRPLINE_ID, BOARD_ID)
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

    private AirplaneDTO getCurrentAirplane(BoardControllerApi boardControllerApi) throws ApiException {
        return boardControllerApi.getDetails(AIRPLINE_ID, BOARD_ID).getAirplanes()
                .stream()
                .filter(z -> z.getName().equals("karakan"))
                .findFirst().get();
    }

}
