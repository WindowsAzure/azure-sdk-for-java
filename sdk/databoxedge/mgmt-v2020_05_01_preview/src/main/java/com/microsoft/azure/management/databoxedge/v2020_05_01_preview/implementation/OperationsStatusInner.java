/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation;

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
 * in OperationsStatus.
 */
public class OperationsStatusInner {
    /** The Retrofit service to perform REST calls. */
    private OperationsStatusService service;
    /** The service client containing this operation class. */
    private DataBoxEdgeManagementClientImpl client;

    /**
     * Initializes an instance of OperationsStatusInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsStatusInner(Retrofit retrofit, DataBoxEdgeManagementClientImpl client) {
        this.service = retrofit.create(OperationsStatusService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for OperationsStatus to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsStatusService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.databoxedge.v2020_05_01_preview.OperationsStatus get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/{deviceName}/operationsStatus/{name}")
        Observable<Response<ResponseBody>> get(@Path("deviceName") String deviceName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobInner object if successful.
     */
    public JobInner get(String deviceName, String name, String resourceGroupName) {
        return getWithServiceResponseAsync(deviceName, name, resourceGroupName).toBlocking().single().body();
    }

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<JobInner> getAsync(String deviceName, String name, String resourceGroupName, final ServiceCallback<JobInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(deviceName, name, resourceGroupName), serviceCallback);
    }

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobInner object
     */
    public Observable<JobInner> getAsync(String deviceName, String name, String resourceGroupName) {
        return getWithServiceResponseAsync(deviceName, name, resourceGroupName).map(new Func1<ServiceResponse<JobInner>, JobInner>() {
            @Override
            public JobInner call(ServiceResponse<JobInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobInner object
     */
    public Observable<ServiceResponse<JobInner>> getWithServiceResponseAsync(String deviceName, String name, String resourceGroupName) {
        if (deviceName == null) {
            throw new IllegalArgumentException("Parameter deviceName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(deviceName, name, this.client.subscriptionId(), resourceGroupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<JobInner>>>() {
                @Override
                public Observable<ServiceResponse<JobInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<JobInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<JobInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<JobInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<JobInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
