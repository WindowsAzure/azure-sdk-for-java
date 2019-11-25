/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.sql.v2017_10_01_preview.CapabilityGroup;
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
 * in Capabilities.
 */
public class CapabilitiesInner {
    /** The Retrofit service to perform REST calls. */
    private CapabilitiesService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of CapabilitiesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CapabilitiesInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(CapabilitiesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Capabilities to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CapabilitiesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_10_01_preview.Capabilities listByLocation" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Sql/locations/{locationName}/capabilities")
        Observable<Response<ResponseBody>> listByLocation(@Path("locationName") String locationName, @Path("subscriptionId") String subscriptionId, @Query("include") CapabilityGroup include, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocationCapabilitiesInner object if successful.
     */
    public LocationCapabilitiesInner listByLocation(String locationName) {
        return listByLocationWithServiceResponseAsync(locationName).toBlocking().single().body();
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocationCapabilitiesInner> listByLocationAsync(String locationName, final ServiceCallback<LocationCapabilitiesInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByLocationWithServiceResponseAsync(locationName), serviceCallback);
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocationCapabilitiesInner object
     */
    public Observable<LocationCapabilitiesInner> listByLocationAsync(String locationName) {
        return listByLocationWithServiceResponseAsync(locationName).map(new Func1<ServiceResponse<LocationCapabilitiesInner>, LocationCapabilitiesInner>() {
            @Override
            public LocationCapabilitiesInner call(ServiceResponse<LocationCapabilitiesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocationCapabilitiesInner object
     */
    public Observable<ServiceResponse<LocationCapabilitiesInner>> listByLocationWithServiceResponseAsync(String locationName) {
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final CapabilityGroup include = null;
        return service.listByLocation(locationName, this.client.subscriptionId(), include, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LocationCapabilitiesInner>>>() {
                @Override
                public Observable<ServiceResponse<LocationCapabilitiesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LocationCapabilitiesInner> clientResponse = listByLocationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item. Possible values include: 'supportedEditions', 'supportedElasticPoolEditions', 'supportedManagedInstanceVersions'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocationCapabilitiesInner object if successful.
     */
    public LocationCapabilitiesInner listByLocation(String locationName, CapabilityGroup include) {
        return listByLocationWithServiceResponseAsync(locationName, include).toBlocking().single().body();
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item. Possible values include: 'supportedEditions', 'supportedElasticPoolEditions', 'supportedManagedInstanceVersions'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocationCapabilitiesInner> listByLocationAsync(String locationName, CapabilityGroup include, final ServiceCallback<LocationCapabilitiesInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByLocationWithServiceResponseAsync(locationName, include), serviceCallback);
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item. Possible values include: 'supportedEditions', 'supportedElasticPoolEditions', 'supportedManagedInstanceVersions'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocationCapabilitiesInner object
     */
    public Observable<LocationCapabilitiesInner> listByLocationAsync(String locationName, CapabilityGroup include) {
        return listByLocationWithServiceResponseAsync(locationName, include).map(new Func1<ServiceResponse<LocationCapabilitiesInner>, LocationCapabilitiesInner>() {
            @Override
            public LocationCapabilitiesInner call(ServiceResponse<LocationCapabilitiesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item. Possible values include: 'supportedEditions', 'supportedElasticPoolEditions', 'supportedManagedInstanceVersions'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocationCapabilitiesInner object
     */
    public Observable<ServiceResponse<LocationCapabilitiesInner>> listByLocationWithServiceResponseAsync(String locationName, CapabilityGroup include) {
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByLocation(locationName, this.client.subscriptionId(), include, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LocationCapabilitiesInner>>>() {
                @Override
                public Observable<ServiceResponse<LocationCapabilitiesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LocationCapabilitiesInner> clientResponse = listByLocationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LocationCapabilitiesInner> listByLocationDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LocationCapabilitiesInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LocationCapabilitiesInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
