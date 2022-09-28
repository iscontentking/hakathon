package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;

import static io.swagger.client.api.ClientTest.AIRPLANE_ID;
import static io.swagger.client.api.ClientTest.BOARD_ID;

public class Client2Test {


    static BoardAirplaneControllerApi boardAirpaneControllerApi = new BoardAirplaneControllerApi();
    static BoardControllerApi boardControllerApi = new BoardControllerApi();


    @Test
    public void startBoard() throws ApiException {
        boardControllerApi.start(AIRPLANE_ID, BOARD_ID);

    }

    @Test
    public void registerAirplane() throws ApiException {
        boardAirpaneControllerApi.register(AIRPLANE_ID, BOARD_ID);

    }

}
