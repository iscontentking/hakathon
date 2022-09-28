package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;

import static io.swagger.client.api.ClientTest.AIRPLINE_ID;
import static io.swagger.client.api.ClientTest.BOARD_ID;

public class Client2Test {


    static BoardAirplaneControllerApi boardAirpaneControllerApi = new BoardAirplaneControllerApi();
    static BoardControllerApi boardControllerApi = new BoardControllerApi();


    @Test
    public void registerBoard() throws ApiException {
        boardControllerApi.start(AIRPLINE_ID, BOARD_ID);

    }

    @Test
    public void registerAirplane() throws ApiException {
        boardAirpaneControllerApi.register(AIRPLINE_ID, BOARD_ID);

    }

}
