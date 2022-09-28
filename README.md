# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AirplaneControllerApi;

import java.io.File;
import java.util.*;

public class AirplaneControllerApiExample {

    public static void main(String[] args) {
        

        AirplaneControllerApi apiInstance = new AirplaneControllerApi();
        
        AirplaneRegisterRequestDTO body = new AirplaneRegisterRequestDTO(); // AirplaneRegisterRequestDTO | 
        
        try {
            AirplaneRegisterResponseDTO result = apiInstance.register1(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AirplaneControllerApi#register1");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://airplane.szewczyk.it*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AirplaneControllerApi* | [**register1**](docs/AirplaneControllerApi.md#register1) | **POST** /airplane/register | At first, please register yor Airplane. Name and color are unique. Color means HTML color e.g. #CCC, #ABABAB etc.
*BoardAirplaneControllerApi* | [**moveAirplane**](docs/BoardAirplaneControllerApi.md#moveAirplane) | **PUT** /board/{boardId}/move/{direction} | Move your Airplane. Requires &#x27;register&#x27; and &#x27;start&#x27; methods before.
*BoardAirplaneControllerApi* | [**register**](docs/BoardAirplaneControllerApi.md#register) | **POST** /board/{boardId}/register | Register your Airplane on the board to play a game. Returns Airplane&#x27;s start coordinates.
*BoardAirplaneControllerApi* | [**takePassenger**](docs/BoardAirplaneControllerApi.md#takePassenger) | **PUT** /board/{boardId}/take/{passengerId} | Take the pasenger. You have to take the proper passenger from the proper place.
*BoardControllerApi* | [**getAllBoards**](docs/BoardControllerApi.md#getAllBoards) | **GET** /board/all | Get general info about all boards.
*BoardControllerApi* | [**getDetails**](docs/BoardControllerApi.md#getDetails) | **GET** /board/{boardId} | Get detailed info about the board.
*BoardControllerApi* | [**getNew**](docs/BoardControllerApi.md#getNew) | **GET** /board/new | Create a new board, default size is 27x16 with 20 passengers.
*BoardControllerApi* | [**getScore**](docs/BoardControllerApi.md#getScore) | **GET** /board/{boardId}/score | Get current score for the board.
*BoardControllerApi* | [**start**](docs/BoardControllerApi.md#start) | **GET** /board/{boardId}/start | Start the game on the board.


## Documentation for Models

 - [AirplaneDTO](docs/AirplaneDTO.md)
 - [AirplaneRegisterRequestDTO](docs/AirplaneRegisterRequestDTO.md)
 - [AirplaneRegisterResponseDTO](docs/AirplaneRegisterResponseDTO.md)
 - [BoardAllGeneralDTO](docs/BoardAllGeneralDTO.md)
 - [BoardDetailsDTO](docs/BoardDetailsDTO.md)
 - [BoardGeneralDTO](docs/BoardGeneralDTO.md)
 - [BoardNewResponseDTO](docs/BoardNewResponseDTO.md)
 - [BoardRegisterResponseDTO](docs/BoardRegisterResponseDTO.md)
 - [BoardScoreDTO](docs/BoardScoreDTO.md)
 - [BoardScoresDTO](docs/BoardScoresDTO.md)
 - [CurrentPositionDTO](docs/CurrentPositionDTO.md)
 - [PassengerDTO](docs/PassengerDTO.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



