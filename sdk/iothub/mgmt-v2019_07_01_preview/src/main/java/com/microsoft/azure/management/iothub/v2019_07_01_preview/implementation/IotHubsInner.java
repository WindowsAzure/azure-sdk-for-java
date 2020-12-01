/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.ErrorDetailsInnerException;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.FailoverInput;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in IotHubs.
 */
public class IotHubsInner {
    /** The Retrofit service to perform REST calls. */
    private IotHubsService service;
    /** The service client containing this operation class. */
    private IotHubClientImpl client;

    /**
     * Initializes an instance of IotHubsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IotHubsInner(Retrofit retrofit, IotHubClientImpl client) {
        this.service = retrofit.create(IotHubsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for IotHubs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IotHubsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.iothub.v2019_07_01_preview.IotHubs manualFailover" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Devices/IotHubs/{iotHubName}/failover")
        Observable<Response<ResponseBody>> manualFailover(@Path("iotHubName") String iotHubName, @Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body FailoverInput failoverInput, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.iothub.v2019_07_01_preview.IotHubs beginManualFailover" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Devices/IotHubs/{iotHubName}/failover")
        Observable<Response<ResponseBody>> beginManualFailover(@Path("iotHubName") String iotHubName, @Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body FailoverInput failoverInput, @Header("User-Agent") String userAgent);

    }

    /**
     * Manual Failover Fail over.
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param failoverRegion Region the hub will be failed over to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorDetailsInnerException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void manualFailover(String iotHubName, String resourceGroupName, String failoverRegion) {
        manualFailoverWithServiceResponseAsync(iotHubName, resourceGroupName, failoverRegion).toBlocking().last().body();
    }

    /**
     * Manual Failover Fail over.
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param failoverRegion Region the hub will be failed over to
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> manualFailoverAsync(String iotHubName, String resourceGroupName, String failoverRegion, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(manualFailoverWithServiceResponseAsync(iotHubName, resourceGroupName, failoverRegion), serviceCallback);
    }

    /**
     * Manual Failover Fail over.
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param failoverRegion Region the hub will be failed over to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> manualFailoverAsync(String iotHubName, String resourceGroupName, String failoverRegion) {
        return manualFailoverWithServiceResponseAsync(iotHubName, resourceGroupName, failoverRegion).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Manual Failover Fail over.
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param failoverRegion Region the hub will be failed over to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> manualFailoverWithServiceResponseAsync(String iotHubName, String resourceGroupName, String failoverRegion) {
        if (iotHubName == null) {
            throw new IllegalArgumentException("Parameter iotHubName is required and cannot be null.");
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
        if (failoverRegion == null) {
            throw new IllegalArgumentException("Parameter failoverRegion is required and cannot be null.");
        }
        FailoverInput failoverInput = new FailoverInput();
        failoverInput.withFailoverRegion(failoverRegion);
        Observable<Response<ResponseBody>> observable = service.manualFailover(iotHubName, this.client.subscriptionId(), resourceGroupName, this.client.apiVersion(), this.client.acceptLanguage(), failoverInput, this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Manual Failover Fail over.
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param failoverRegion Region the hub will be failed over to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorDetailsInnerException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginManualFailover(String iotHubName, String resourceGroupName, String failoverRegion) {
        beginManualFailoverWithServiceResponseAsync(iotHubName, resourceGroupName, failoverRegion).toBlocking().single().body();
    }

    /**
     * Manual Failover Fail over.
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param failoverRegion Region the hub will be failed over to
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginManualFailoverAsync(String iotHubName, String resourceGroupName, String failoverRegion, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginManualFailoverWithServiceResponseAsync(iotHubName, resourceGroupName, failoverRegion), serviceCallback);
    }

    /**
     * Manual Failover Fail over.
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param failoverRegion Region the hub will be failed over to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginManualFailoverAsync(String iotHubName, String resourceGroupName, String failoverRegion) {
        return beginManualFailoverWithServiceResponseAsync(iotHubName, resourceGroupName, failoverRegion).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Manual Failover Fail over.
     * Perform manual fail over of given hub.
     *
     * @param iotHubName IotHub to fail over
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param failoverRegion Region the hub will be failed over to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginManualFailoverWithServiceResponseAsync(String iotHubName, String resourceGroupName, String failoverRegion) {
        if (iotHubName == null) {
            throw new IllegalArgumentException("Parameter iotHubName is required and cannot be null.");
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
        if (failoverRegion == null) {
            throw new IllegalArgumentException("Parameter failoverRegion is required and cannot be null.");
        }
        FailoverInput failoverInput = new FailoverInput();
        failoverInput.withFailoverRegion(failoverRegion);
        return service.beginManualFailover(iotHubName, this.client.subscriptionId(), resourceGroupName, this.client.apiVersion(), this.client.acceptLanguage(), failoverInput, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginManualFailoverDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginManualFailoverDelegate(Response<ResponseBody> response) throws ErrorDetailsInnerException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorDetailsInnerException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorDetailsInnerException.class)
                .build(response);
    }

}
