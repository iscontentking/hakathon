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
import io.swagger.client.model.BoardAllGeneralDTO;
import io.swagger.client.model.BoardDetailsDTO;
import io.swagger.client.model.BoardNewResponseDTO;
import io.swagger.client.model.BoardScoresDTO;
import java.util.UUID;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BoardControllerApi
 */
@Ignore
public class BoardControllerApiTest {

    private final BoardControllerApi api = new BoardControllerApi();

    
    /**
     * Get general info about all boards.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllBoardsTest() throws ApiException {
        
        UUID airplaneId = null;
        
        BoardAllGeneralDTO response = api.getAllBoards(airplaneId);

        // TODO: test validations
    }
    
    /**
     * Get detailed info about the board.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        
        UUID airplaneId = null;
        
        UUID boardId = null;
        
        BoardDetailsDTO response = api.getDetails(airplaneId, boardId);

        // TODO: test validations
    }
    
    /**
     * Create a new board, default size is 27x16 with 20 passengers.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNewTest() throws ApiException {
        
        UUID airplaneId = null;
        
        Integer passengersAmount = null;
        
        Integer width = null;
        
        Integer height = null;
        
        BoardNewResponseDTO response = api.getNew(airplaneId, passengersAmount, width, height);

        // TODO: test validations
    }
    
    /**
     * Get current score for the board.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScoreTest() throws ApiException {
        
        UUID airplaneId = null;
        
        UUID boardId = null;
        
        BoardScoresDTO response = api.getScore(airplaneId, boardId);

        // TODO: test validations
    }
    
    /**
     * Start the game on the board.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startTest() throws ApiException {
        
        UUID airplaneId = null;
        
        UUID boardId = null;
        
        api.start(airplaneId, boardId);

        // TODO: test validations
    }
    
}