/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2018_03_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.CollectionFormat;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
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
 * in HeatMaps.
 */
public class HeatMapsInner {
    /** The Retrofit service to perform REST calls. */
    private HeatMapsService service;
    /** The service client containing this operation class. */
    private TrafficManagerManagementClientImpl client;

    /**
     * Initializes an instance of HeatMapsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HeatMapsInner(Retrofit retrofit, TrafficManagerManagementClientImpl client) {
        this.service = retrofit.create(HeatMapsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for HeatMaps to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HeatMapsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.v2018_03_01.HeatMaps get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficmanagerprofiles/{profileName}/heatMaps/{heatMapType}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("heatMapType") String heatMapType, @Query("topLeft") String topLeft, @Query("botRight") String botRight, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets latest heatmap for Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HeatMapModelInner object if successful.
     */
    public HeatMapModelInner get(String resourceGroupName, String profileName) {
        return getWithServiceResponseAsync(resourceGroupName, profileName).toBlocking().single().body();
    }

    /**
     * Gets latest heatmap for Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HeatMapModelInner> getAsync(String resourceGroupName, String profileName, final ServiceCallback<HeatMapModelInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, profileName), serviceCallback);
    }

    /**
     * Gets latest heatmap for Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HeatMapModelInner object
     */
    public Observable<HeatMapModelInner> getAsync(String resourceGroupName, String profileName) {
        return getWithServiceResponseAsync(resourceGroupName, profileName).map(new Func1<ServiceResponse<HeatMapModelInner>, HeatMapModelInner>() {
            @Override
            public HeatMapModelInner call(ServiceResponse<HeatMapModelInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets latest heatmap for Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HeatMapModelInner object
     */
    public Observable<ServiceResponse<HeatMapModelInner>> getWithServiceResponseAsync(String resourceGroupName, String profileName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String heatMapType = "default";
        final List<Double> topLeft = null;
        final List<Double> botRight = null;
        String topLeftConverted = this.client.serializerAdapter().serializeList(topLeft, CollectionFormat.CSV);String botRightConverted = this.client.serializerAdapter().serializeList(botRight, CollectionFormat.CSV);
        return service.get(this.client.subscriptionId(), resourceGroupName, profileName, heatMapType, topLeftConverted, botRightConverted, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<HeatMapModelInner>>>() {
                @Override
                public Observable<ServiceResponse<HeatMapModelInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<HeatMapModelInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets latest heatmap for Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @param topLeft The top left latitude,longitude pair of the rectangular viewport to query for.
     * @param botRight The bottom right latitude,longitude pair of the rectangular viewport to query for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HeatMapModelInner object if successful.
     */
    public HeatMapModelInner get(String resourceGroupName, String profileName, List<Double> topLeft, List<Double> botRight) {
        return getWithServiceResponseAsync(resourceGroupName, profileName, topLeft, botRight).toBlocking().single().body();
    }

    /**
     * Gets latest heatmap for Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @param topLeft The top left latitude,longitude pair of the rectangular viewport to query for.
     * @param botRight The bottom right latitude,longitude pair of the rectangular viewport to query for.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HeatMapModelInner> getAsync(String resourceGroupName, String profileName, List<Double> topLeft, List<Double> botRight, final ServiceCallback<HeatMapModelInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, profileName, topLeft, botRight), serviceCallback);
    }

    /**
     * Gets latest heatmap for Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @param topLeft The top left latitude,longitude pair of the rectangular viewport to query for.
     * @param botRight The bottom right latitude,longitude pair of the rectangular viewport to query for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HeatMapModelInner object
     */
    public Observable<HeatMapModelInner> getAsync(String resourceGroupName, String profileName, List<Double> topLeft, List<Double> botRight) {
        return getWithServiceResponseAsync(resourceGroupName, profileName, topLeft, botRight).map(new Func1<ServiceResponse<HeatMapModelInner>, HeatMapModelInner>() {
            @Override
            public HeatMapModelInner call(ServiceResponse<HeatMapModelInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets latest heatmap for Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager endpoint.
     * @param profileName The name of the Traffic Manager profile.
     * @param topLeft The top left latitude,longitude pair of the rectangular viewport to query for.
     * @param botRight The bottom right latitude,longitude pair of the rectangular viewport to query for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HeatMapModelInner object
     */
    public Observable<ServiceResponse<HeatMapModelInner>> getWithServiceResponseAsync(String resourceGroupName, String profileName, List<Double> topLeft, List<Double> botRight) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(topLeft);
        Validator.validate(botRight);
        final String heatMapType = "default";
        String topLeftConverted = this.client.serializerAdapter().serializeList(topLeft, CollectionFormat.CSV);String botRightConverted = this.client.serializerAdapter().serializeList(botRight, CollectionFormat.CSV);
        return service.get(this.client.subscriptionId(), resourceGroupName, profileName, heatMapType, topLeftConverted, botRightConverted, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<HeatMapModelInner>>>() {
                @Override
                public Observable<ServiceResponse<HeatMapModelInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<HeatMapModelInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<HeatMapModelInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<HeatMapModelInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<HeatMapModelInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
