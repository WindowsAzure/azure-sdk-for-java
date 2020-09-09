/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
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
 * in LocationBasedPerformanceTiers.
 */
public class LocationBasedPerformanceTiersInner {
    /** The Retrofit service to perform REST calls. */
    private LocationBasedPerformanceTiersService service;
    /** The service client containing this operation class. */
    private MySQLManagementClientImpl client;

    /**
     * Initializes an instance of LocationBasedPerformanceTiersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LocationBasedPerformanceTiersInner(Retrofit retrofit, MySQLManagementClientImpl client) {
        this.service = retrofit.create(LocationBasedPerformanceTiersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LocationBasedPerformanceTiers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LocationBasedPerformanceTiersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mysql.v2017_12_01.LocationBasedPerformanceTiers list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.DBForMySQL/locations/{locationName}/performanceTiers")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("locationName") String locationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PerformanceTierPropertiesInner&gt; object if successful.
     */
    public List<PerformanceTierPropertiesInner> list(String locationName) {
        return listWithServiceResponseAsync(locationName).toBlocking().single().body();
    }

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PerformanceTierPropertiesInner>> listAsync(String locationName, final ServiceCallback<List<PerformanceTierPropertiesInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(locationName), serviceCallback);
    }

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PerformanceTierPropertiesInner&gt; object
     */
    public Observable<List<PerformanceTierPropertiesInner>> listAsync(String locationName) {
        return listWithServiceResponseAsync(locationName).map(new Func1<ServiceResponse<List<PerformanceTierPropertiesInner>>, List<PerformanceTierPropertiesInner>>() {
            @Override
            public List<PerformanceTierPropertiesInner> call(ServiceResponse<List<PerformanceTierPropertiesInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PerformanceTierPropertiesInner&gt; object
     */
    public Observable<ServiceResponse<List<PerformanceTierPropertiesInner>>> listWithServiceResponseAsync(String locationName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), locationName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<PerformanceTierPropertiesInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<PerformanceTierPropertiesInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PerformanceTierPropertiesInner>> result = listDelegate(response);
                        List<PerformanceTierPropertiesInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<PerformanceTierPropertiesInner>> clientResponse = new ServiceResponse<List<PerformanceTierPropertiesInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PerformanceTierPropertiesInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PerformanceTierPropertiesInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PerformanceTierPropertiesInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
