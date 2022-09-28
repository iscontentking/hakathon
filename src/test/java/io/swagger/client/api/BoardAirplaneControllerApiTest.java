/*
 * Airplane Hackathon API
 * Airplane Hackathon API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BoardRegisterResponseDTO;
import io.swagger.client.model.CurrentPositionDTO;
import java.util.UUID;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BoardAirplaneControllerApi
 */
@Ignore
public class BoardAirplaneControllerApiTest {

    private final BoardAirplaneControllerApi api = new BoardAirplaneControllerApi();

    
    /**
     * Move your Airplane. Requires &#x27;register&#x27; and &#x27;start&#x27; methods before.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveAirplaneTest() throws ApiException {
        
        UUID airplaneId = null;
        
        UUID boardId = null;
        
        String direction = null;
        
        CurrentPositionDTO response = api.moveAirplane(airplaneId, boardId, direction);

        // TODO: test validations
    }
    
    /**
     * Register your Airplane on the board to play a game. Returns Airplane&#x27;s start coordinates.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerTest() throws ApiException {
        
        UUID airplaneId = null;
        
        UUID boardId = null;
        
        BoardRegisterResponseDTO response = api.register(airplaneId, boardId);

        // TODO: test validations
    }
    
    /**
     * Take the pasenger. You have to take the proper passenger from the proper place.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void takePassengerTest() throws ApiException {
        
        UUID airplaneId = null;
        
        UUID boardId = null;
        
        UUID passengerId = null;
        
        api.takePassenger(airplaneId, boardId, passengerId);

        // TODO: test validations
    }
    
}
