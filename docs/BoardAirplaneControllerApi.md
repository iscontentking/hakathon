# BoardAirplaneControllerApi

All URIs are relative to *https://airplane.szewczyk.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAirplane**](BoardAirplaneControllerApi.md#moveAirplane) | **PUT** /board/{boardId}/move/{direction} | Move your Airplane. Requires &#x27;register&#x27; and &#x27;start&#x27; methods before.
[**register**](BoardAirplaneControllerApi.md#register) | **POST** /board/{boardId}/register | Register your Airplane on the board to play a game. Returns Airplane&#x27;s start coordinates.
[**takePassenger**](BoardAirplaneControllerApi.md#takePassenger) | **PUT** /board/{boardId}/take/{passengerId} | Take the pasenger. You have to take the proper passenger from the proper place.




<a name="moveAirplane"></a>
# **moveAirplane**
> CurrentPositionDTO moveAirplane(airplaneId, boardId, direction)

Move your Airplane. Requires &#x27;register&#x27; and &#x27;start&#x27; methods before.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardAirplaneControllerApi;



BoardAirplaneControllerApi apiInstance = new BoardAirplaneControllerApi();

UUID airplaneId = Arrays.asList(new UUID()); // UUID | 

UUID boardId = Arrays.asList(new UUID()); // UUID | 

String direction = Arrays.asList("direction_example"); // String | 

try {
    CurrentPositionDTO result = apiInstance.moveAirplane(airplaneId, boardId, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardAirplaneControllerApi#moveAirplane");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **airplaneId** | [**UUID**](.md)|  |
 **boardId** | [**UUID**](.md)|  |
 **direction** | **String**|  | [enum: N, NE, E, SE, S, SW, W, NW]


### Return type

[**CurrentPositionDTO**](CurrentPositionDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


<a name="register"></a>
# **register**
> BoardRegisterResponseDTO register(airplaneId, boardId)

Register your Airplane on the board to play a game. Returns Airplane&#x27;s start coordinates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardAirplaneControllerApi;



BoardAirplaneControllerApi apiInstance = new BoardAirplaneControllerApi();

UUID airplaneId = Arrays.asList(new UUID()); // UUID | 

UUID boardId = Arrays.asList(new UUID()); // UUID | 

try {
    BoardRegisterResponseDTO result = apiInstance.register(airplaneId, boardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardAirplaneControllerApi#register");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **airplaneId** | [**UUID**](.md)|  |
 **boardId** | [**UUID**](.md)|  |


### Return type

[**BoardRegisterResponseDTO**](BoardRegisterResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


<a name="takePassenger"></a>
# **takePassenger**
> takePassenger(airplaneId, boardId, passengerId)

Take the pasenger. You have to take the proper passenger from the proper place.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardAirplaneControllerApi;



BoardAirplaneControllerApi apiInstance = new BoardAirplaneControllerApi();

UUID airplaneId = Arrays.asList(new UUID()); // UUID | 

UUID boardId = Arrays.asList(new UUID()); // UUID | 

UUID passengerId = Arrays.asList(new UUID()); // UUID | 

try {
    apiInstance.takePassenger(airplaneId, boardId, passengerId);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardAirplaneControllerApi#takePassenger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **airplaneId** | [**UUID**](.md)|  |
 **boardId** | [**UUID**](.md)|  |
 **passengerId** | [**UUID**](.md)|  |


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



