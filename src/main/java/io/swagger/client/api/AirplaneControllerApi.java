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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;


import com.google.gson.reflect.TypeToken;

import java.io.IOException;




import io.swagger.client.model.AirplaneRegisterRequestDTO;
import io.swagger.client.model.AirplaneRegisterResponseDTO;


import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class AirplaneControllerApi {
    private ApiClient apiClient;

    public AirplaneControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AirplaneControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Build call for register1
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
        
     */
    public com.squareup.okhttp.Call register1Call(AirplaneRegisterRequestDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/airplane/register";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call register1ValidateBeforeCall(AirplaneRegisterRequestDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling register1(Async)");
        }
        
        
        com.squareup.okhttp.Call call = register1Call(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
        
        
    }

    /**
     * At first, please register yor Airplane. Name and color are unique. Color means HTML color e.g. #CCC, #ABABAB etc.
     * 
     * @param body  (required)
     * @return AirplaneRegisterResponseDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public AirplaneRegisterResponseDTO register1(AirplaneRegisterRequestDTO body) throws ApiException {
        ApiResponse<AirplaneRegisterResponseDTO> resp = register1WithHttpInfo(body);
        return resp.getData();
    }

    /**
     * At first, please register yor Airplane. Name and color are unique. Color means HTML color e.g. #CCC, #ABABAB etc.
     * 
     * @param body  (required)
     * @return ApiResponse&lt;AirplaneRegisterResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public ApiResponse<AirplaneRegisterResponseDTO> register1WithHttpInfo(AirplaneRegisterRequestDTO body) throws ApiException {
        com.squareup.okhttp.Call call = register1ValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<AirplaneRegisterResponseDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * At first, please register yor Airplane. Name and color are unique. Color means HTML color e.g. #CCC, #ABABAB etc. (asynchronously)
     * 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
        
     */
    public com.squareup.okhttp.Call register1Async(AirplaneRegisterRequestDTO body, final ApiCallback<AirplaneRegisterResponseDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = register1ValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AirplaneRegisterResponseDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
}
