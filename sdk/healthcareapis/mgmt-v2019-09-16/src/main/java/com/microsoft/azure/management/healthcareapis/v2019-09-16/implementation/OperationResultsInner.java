/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2019-09-16.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.healthcareapis.v2019-09-16.ErrorDetailsInnerException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in OperationResults.
 */
public class OperationResultsInner {
    /** The Retrofit service to perform REST calls. */
    private OperationResultsService service;
    /** The service client containing this operation class. */
    private HealthcareApisManagementClientImpl client;

    /**
     * Initializes an instance of OperationResultsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationResultsInner(Retrofit retrofit, HealthcareApisManagementClientImpl client) {
        this.service = retrofit.create(OperationResultsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for OperationResults to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationResultsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.healthcareapis.v2019-09-16.OperationResults get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.HealthcareApis/locations/{locationName}/operationresults/{operationResultId}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("locationName") String locationName, @Path("operationResultId") String operationResultId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the operation result for a long running operation.
     *
     * @param locationName The location of the operation.
     * @param operationResultId The ID of the operation result to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorDetailsInnerException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object get(String locationName, String operationResultId) {
        return getWithServiceResponseAsync(locationName, operationResultId).toBlocking().single().body();
    }

    /**
     * Get the operation result for a long running operation.
     *
     * @param locationName The location of the operation.
     * @param operationResultId The ID of the operation result to get.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAsync(String locationName, String operationResultId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(locationName, operationResultId), serviceCallback);
    }

    /**
     * Get the operation result for a long running operation.
     *
     * @param locationName The location of the operation.
     * @param operationResultId The ID of the operation result to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAsync(String locationName, String operationResultId) {
        return getWithServiceResponseAsync(locationName, operationResultId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the operation result for a long running operation.
     *
     * @param locationName The location of the operation.
     * @param operationResultId The ID of the operation result to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String locationName, String operationResultId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        if (operationResultId == null) {
            throw new IllegalArgumentException("Parameter operationResultId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), locationName, operationResultId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getDelegate(Response<ResponseBody> response) throws ErrorDetailsInnerException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, ErrorDetailsInnerException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationResultsDescriptionInner>() { }.getType())
                .register(404, new TypeToken<ErrorDetailsInner>() { }.getType())
                .registerError(ErrorDetailsInnerException.class)
                .build(response);
    }

}
