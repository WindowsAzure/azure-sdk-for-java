/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.DefaultErrorResponseException;
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
 * in RestorableMongodbResources.
 */
public class RestorableMongodbResourcesInner {
    /** The Retrofit service to perform REST calls. */
    private RestorableMongodbResourcesService service;
    /** The service client containing this operation class. */
    private CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of RestorableMongodbResourcesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RestorableMongodbResourcesInner(Retrofit retrofit, CosmosDBManagementClientImpl client) {
        this.service = retrofit.create(RestorableMongodbResourcesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RestorableMongodbResources to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RestorableMongodbResourcesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestorableMongodbResources list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{instanceId}/restorableMongodbResources")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Path("instanceId") String instanceId, @Query("api-version") String apiVersion, @Query("restoreLocation") String restoreLocation, @Query("restoreTimestampInUtc") String restoreTimestampInUtc, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all the restorable Azure Cosmos DB MongoDB resources available for a specific database account at a given time and location.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws DefaultErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DatabaseRestoreResourceInner&gt; object if successful.
     */
    public List<DatabaseRestoreResourceInner> list(String location, String instanceId) {
        return listWithServiceResponseAsync(location, instanceId).toBlocking().single().body();
    }

    /**
     * Lists all the restorable Azure Cosmos DB MongoDB resources available for a specific database account at a given time and location.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DatabaseRestoreResourceInner>> listAsync(String location, String instanceId, final ServiceCallback<List<DatabaseRestoreResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(location, instanceId), serviceCallback);
    }

    /**
     * Lists all the restorable Azure Cosmos DB MongoDB resources available for a specific database account at a given time and location.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DatabaseRestoreResourceInner&gt; object
     */
    public Observable<List<DatabaseRestoreResourceInner>> listAsync(String location, String instanceId) {
        return listWithServiceResponseAsync(location, instanceId).map(new Func1<ServiceResponse<List<DatabaseRestoreResourceInner>>, List<DatabaseRestoreResourceInner>>() {
            @Override
            public List<DatabaseRestoreResourceInner> call(ServiceResponse<List<DatabaseRestoreResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all the restorable Azure Cosmos DB MongoDB resources available for a specific database account at a given time and location.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DatabaseRestoreResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<DatabaseRestoreResourceInner>>> listWithServiceResponseAsync(String location, String instanceId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01-preview";
        final String restoreLocation = null;
        final String restoreTimestampInUtc = null;
        return service.list(this.client.subscriptionId(), location, instanceId, apiVersion, restoreLocation, restoreTimestampInUtc, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<DatabaseRestoreResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<DatabaseRestoreResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DatabaseRestoreResourceInner>> result = listDelegate(response);
                        List<DatabaseRestoreResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<DatabaseRestoreResourceInner>> clientResponse = new ServiceResponse<List<DatabaseRestoreResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all the restorable Azure Cosmos DB MongoDB resources available for a specific database account at a given time and location.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restoreLocation The location where the restorable resources are located.
     * @param restoreTimestampInUtc The timestamp when the restorable resources existed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws DefaultErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DatabaseRestoreResourceInner&gt; object if successful.
     */
    public List<DatabaseRestoreResourceInner> list(String location, String instanceId, String restoreLocation, String restoreTimestampInUtc) {
        return listWithServiceResponseAsync(location, instanceId, restoreLocation, restoreTimestampInUtc).toBlocking().single().body();
    }

    /**
     * Lists all the restorable Azure Cosmos DB MongoDB resources available for a specific database account at a given time and location.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restoreLocation The location where the restorable resources are located.
     * @param restoreTimestampInUtc The timestamp when the restorable resources existed.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DatabaseRestoreResourceInner>> listAsync(String location, String instanceId, String restoreLocation, String restoreTimestampInUtc, final ServiceCallback<List<DatabaseRestoreResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(location, instanceId, restoreLocation, restoreTimestampInUtc), serviceCallback);
    }

    /**
     * Lists all the restorable Azure Cosmos DB MongoDB resources available for a specific database account at a given time and location.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restoreLocation The location where the restorable resources are located.
     * @param restoreTimestampInUtc The timestamp when the restorable resources existed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DatabaseRestoreResourceInner&gt; object
     */
    public Observable<List<DatabaseRestoreResourceInner>> listAsync(String location, String instanceId, String restoreLocation, String restoreTimestampInUtc) {
        return listWithServiceResponseAsync(location, instanceId, restoreLocation, restoreTimestampInUtc).map(new Func1<ServiceResponse<List<DatabaseRestoreResourceInner>>, List<DatabaseRestoreResourceInner>>() {
            @Override
            public List<DatabaseRestoreResourceInner> call(ServiceResponse<List<DatabaseRestoreResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all the restorable Azure Cosmos DB MongoDB resources available for a specific database account at a given time and location.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restoreLocation The location where the restorable resources are located.
     * @param restoreTimestampInUtc The timestamp when the restorable resources existed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DatabaseRestoreResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<DatabaseRestoreResourceInner>>> listWithServiceResponseAsync(String location, String instanceId, String restoreLocation, String restoreTimestampInUtc) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01-preview";
        return service.list(this.client.subscriptionId(), location, instanceId, apiVersion, restoreLocation, restoreTimestampInUtc, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<DatabaseRestoreResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<DatabaseRestoreResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DatabaseRestoreResourceInner>> result = listDelegate(response);
                        List<DatabaseRestoreResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<DatabaseRestoreResourceInner>> clientResponse = new ServiceResponse<List<DatabaseRestoreResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DatabaseRestoreResourceInner>> listDelegate(Response<ResponseBody> response) throws DefaultErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DatabaseRestoreResourceInner>, DefaultErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DatabaseRestoreResourceInner>>() { }.getType())
                .registerError(DefaultErrorResponseException.class)
                .build(response);
    }

}
