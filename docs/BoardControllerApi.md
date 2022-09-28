# BoardControllerApi

All URIs are relative to *https://airplane.szewczyk.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllBoards**](BoardControllerApi.md#getAllBoards) | **GET** /board/all | Get general info about all boards.
[**getDetails**](BoardControllerApi.md#getDetails) | **GET** /board/{boardId} | Get detailed info about the board.
[**getNew**](BoardControllerApi.md#getNew) | **GET** /board/new | Create a new board, default size is 27x16 with 20 passengers.
[**getScore**](BoardControllerApi.md#getScore) | **GET** /board/{boardId}/score | Get current score for the board.
[**start**](BoardControllerApi.md#start) | **GET** /board/{boardId}/start | Start the game on the board.




<a name="getAllBoards"></a>
# **getAllBoards**
> BoardAllGeneralDTO getAllBoards(airplaneId)

Get general info about all boards.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardControllerApi;



BoardControllerApi apiInstance = new BoardControllerApi();

UUID airplaneId = Arrays.asList(new UUID()); // UUID | 

try {
    BoardAllGeneralDTO result = apiInstance.getAllBoards(airplaneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardControllerApi#getAllBoards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **airplaneId** | [**UUID**](.md)|  |


### Return type

[**BoardAllGeneralDTO**](BoardAllGeneralDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


<a name="getDetails"></a>
# **getDetails**
> BoardDetailsDTO getDetails(airplaneId, boardId)

Get detailed info about the board.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardControllerApi;



BoardControllerApi apiInstance = new BoardControllerApi();

UUID airplaneId = Arrays.asList(new UUID()); // UUID | 

UUID boardId = Arrays.asList(new UUID()); // UUID | 

try {
    BoardDetailsDTO result = apiInstance.getDetails(airplaneId, boardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardControllerApi#getDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **airplaneId** | [**UUID**](.md)|  |
 **boardId** | [**UUID**](.md)|  |


### Return type

[**BoardDetailsDTO**](BoardDetailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


<a name="getNew"></a>
# **getNew**
> BoardNewResponseDTO getNew(airplaneId, passengersAmount, width, height)

Create a new board, default size is 27x16 with 20 passengers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardControllerApi;



BoardControllerApi apiInstance = new BoardControllerApi();

UUID airplaneId = Arrays.asList(new UUID()); // UUID | 

Integer passengersAmount = Arrays.asList(56); // Integer | 

Integer width = Arrays.asList(56); // Integer | 

Integer height = Arrays.asList(56); // Integer | 

try {
    BoardNewResponseDTO result = apiInstance.getNew(airplaneId, passengersAmount, width, height);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardControllerApi#getNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **airplaneId** | [**UUID**](.md)|  |
 **passengersAmount** | **Integer**|  | [optional]
 **width** | **Integer**|  | [optional]
 **height** | **Integer**|  | [optional]


### Return type

[**BoardNewResponseDTO**](BoardNewResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


<a name="getScore"></a>
# **getScore**
> BoardScoresDTO getScore(airplaneId, boardId)

Get current score for the board.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardControllerApi;



BoardControllerApi apiInstance = new BoardControllerApi();

UUID airplaneId = Arrays.asList(new UUID()); // UUID | 

UUID boardId = Arrays.asList(new UUID()); // UUID | 

try {
    BoardScoresDTO result = apiInstance.getScore(airplaneId, boardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardControllerApi#getScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **airplaneId** | [**UUID**](.md)|  |
 **boardId** | [**UUID**](.md)|  |


### Return type

[**BoardScoresDTO**](BoardScoresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


<a name="start"></a>
# **start**
> start(airplaneId, boardId)

Start the game on the board.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoardControllerApi;



BoardControllerApi apiInstance = new BoardControllerApi();

UUID airplaneId = Arrays.asList(new UUID()); // UUID | 

UUID boardId = Arrays.asList(new UUID()); // UUID | 

try {
    apiInstance.start(airplaneId, boardId);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardControllerApi#start");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **airplaneId** | [**UUID**](.md)|  |
 **boardId** | [**UUID**](.md)|  |


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



