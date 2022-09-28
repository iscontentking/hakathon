package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;

import java.util.UUID;

public class Client2Test {

    final UUID AIRPLINE_ID = UUID.fromString("b1117889-796f-4230-bb32-bcc3a66a1dd2");
    final UUID BOARD_ID = UUID.fromString("e8134744-a4df-4d20-b795-3147c6936528");

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
