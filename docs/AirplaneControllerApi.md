# AirplaneControllerApi

All URIs are relative to *https://airplane.szewczyk.it*

Method | HTTP request | Description
------------- | ------------- | -------------
[**register1**](AirplaneControllerApi.md#register1) | **POST** /airplane/register | At first, please register yor Airplane. Name and color are unique. Color means HTML color e.g. #CCC, #ABABAB etc.




<a name="register1"></a>
# **register1**
> AirplaneRegisterResponseDTO register1(body)

At first, please register yor Airplane. Name and color are unique. Color means HTML color e.g. #CCC, #ABABAB etc.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AirplaneControllerApi;



AirplaneControllerApi apiInstance = new AirplaneControllerApi();

AirplaneRegisterRequestDTO body = new AirplaneRegisterRequestDTO(); // AirplaneRegisterRequestDTO | 

try {
    AirplaneRegisterResponseDTO result = apiInstance.register1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AirplaneControllerApi#register1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AirplaneRegisterRequestDTO**](AirplaneRegisterRequestDTO.md)|  |


### Return type

[**AirplaneRegisterResponseDTO**](AirplaneRegisterResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



