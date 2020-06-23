/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
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
 * in OperationStatuses.
 */
public class OperationStatusesInner {
    /** The Retrofit service to perform REST calls. */
    private OperationStatusesService service;
    /** The service client containing this operation class. */
    private OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of OperationStatusesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationStatusesInner(Retrofit retrofit, OperationalInsightsManagementClientImpl client) {
        this.service = retrofit.create(OperationStatusesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for OperationStatuses to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationStatusesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_03_01_preview.OperationStatuses get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.OperationalInsights/locations/{location}/operationStatuses/{asyncOperationId}")
        Observable<Response<ResponseBody>> get(@Path("location") String location, @Path("asyncOperationId") String asyncOperationId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the status of a long running azure asynchronous operation.
     *
     * @param location The region name of operation.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatusInner object if successful.
     */
    public OperationStatusInner get(String location, String asyncOperationId) {
        return getWithServiceResponseAsync(location, asyncOperationId).toBlocking().single().body();
    }

    /**
     * Get the status of a long running azure asynchronous operation.
     *
     * @param location The region name of operation.
     * @param asyncOperationId The operation Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatusInner> getAsync(String location, String asyncOperationId, final ServiceCallback<OperationStatusInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(location, asyncOperationId), serviceCallback);
    }

    /**
     * Get the status of a long running azure asynchronous operation.
     *
     * @param location The region name of operation.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusInner object
     */
    public Observable<OperationStatusInner> getAsync(String location, String asyncOperationId) {
        return getWithServiceResponseAsync(location, asyncOperationId).map(new Func1<ServiceResponse<OperationStatusInner>, OperationStatusInner>() {
            @Override
            public OperationStatusInner call(ServiceResponse<OperationStatusInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the status of a long running azure asynchronous operation.
     *
     * @param location The region name of operation.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusInner object
     */
    public Observable<ServiceResponse<OperationStatusInner>> getWithServiceResponseAsync(String location, String asyncOperationId) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (asyncOperationId == null) {
            throw new IllegalArgumentException("Parameter asyncOperationId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(location, asyncOperationId, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatusInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatusInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatusInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatusInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatusInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatusInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
