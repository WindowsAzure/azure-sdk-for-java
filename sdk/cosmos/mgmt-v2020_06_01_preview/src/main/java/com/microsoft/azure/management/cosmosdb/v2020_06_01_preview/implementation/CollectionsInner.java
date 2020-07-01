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
 * in Collections.
 */
public class CollectionsInner {
    /** The Retrofit service to perform REST calls. */
    private CollectionsService service;
    /** The service client containing this operation class. */
    private CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of CollectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CollectionsInner(Retrofit retrofit, CosmosDBManagementClientImpl client) {
        this.service = retrofit.create(CollectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Collections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CollectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.Collections listMetrics" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/databases/{databaseRid}/collections/{collectionRid}/metrics")
        Observable<Response<ResponseBody>> listMetrics(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("databaseRid") String databaseRid, @Path("collectionRid") String collectionRid, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.Collections listUsages" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/databases/{databaseRid}/collections/{collectionRid}/usages")
        Observable<Response<ResponseBody>> listUsages(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("databaseRid") String databaseRid, @Path("collectionRid") String collectionRid, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.Collections listMetricDefinitions" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/databases/{databaseRid}/collections/{collectionRid}/metricDefinitions")
        Observable<Response<ResponseBody>> listMetricDefinitions(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("databaseRid") String databaseRid, @Path("collectionRid") String collectionRid, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves the metrics determined by the given filter for the given database account and collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;MetricInner&gt; object if successful.
     */
    public List<MetricInner> listMetrics(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return listMetricsWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter).toBlocking().single().body();
    }

    /**
     * Retrieves the metrics determined by the given filter for the given database account and collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MetricInner>> listMetricsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter, final ServiceCallback<List<MetricInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listMetricsWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter), serviceCallback);
    }

    /**
     * Retrieves the metrics determined by the given filter for the given database account and collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MetricInner&gt; object
     */
    public Observable<List<MetricInner>> listMetricsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return listMetricsWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter).map(new Func1<ServiceResponse<List<MetricInner>>, List<MetricInner>>() {
            @Override
            public List<MetricInner> call(ServiceResponse<List<MetricInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the metrics determined by the given filter for the given database account and collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MetricInner&gt; object
     */
    public Observable<ServiceResponse<List<MetricInner>>> listMetricsWithServiceResponseAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (databaseRid == null) {
            throw new IllegalArgumentException("Parameter databaseRid is required and cannot be null.");
        }
        if (collectionRid == null) {
            throw new IllegalArgumentException("Parameter collectionRid is required and cannot be null.");
        }
        if (filter == null) {
            throw new IllegalArgumentException("Parameter filter is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01-preview";
        return service.listMetrics(this.client.subscriptionId(), resourceGroupName, accountName, databaseRid, collectionRid, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<MetricInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<MetricInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<MetricInner>> result = listMetricsDelegate(response);
                        List<MetricInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<MetricInner>> clientResponse = new ServiceResponse<List<MetricInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<MetricInner>> listMetricsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<MetricInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<MetricInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;UsageInner&gt; object if successful.
     */
    public List<UsageInner> listUsages(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        return listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid).toBlocking().single().body();
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UsageInner>> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, final ServiceCallback<List<UsageInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid), serviceCallback);
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;UsageInner&gt; object
     */
    public Observable<List<UsageInner>> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        return listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid).map(new Func1<ServiceResponse<List<UsageInner>>, List<UsageInner>>() {
            @Override
            public List<UsageInner> call(ServiceResponse<List<UsageInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;UsageInner&gt; object
     */
    public Observable<ServiceResponse<List<UsageInner>>> listUsagesWithServiceResponseAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (databaseRid == null) {
            throw new IllegalArgumentException("Parameter databaseRid is required and cannot be null.");
        }
        if (collectionRid == null) {
            throw new IllegalArgumentException("Parameter collectionRid is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01-preview";
        final String filter = null;
        return service.listUsages(this.client.subscriptionId(), resourceGroupName, accountName, databaseRid, collectionRid, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<UsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<UsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<UsageInner>> result = listUsagesDelegate(response);
                        List<UsageInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<UsageInner>> clientResponse = new ServiceResponse<List<UsageInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is name.value (name of the metric, can have an or of multiple names).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;UsageInner&gt; object if successful.
     */
    public List<UsageInner> listUsages(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter).toBlocking().single().body();
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is name.value (name of the metric, can have an or of multiple names).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UsageInner>> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter, final ServiceCallback<List<UsageInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter), serviceCallback);
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is name.value (name of the metric, can have an or of multiple names).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;UsageInner&gt; object
     */
    public Observable<List<UsageInner>> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter).map(new Func1<ServiceResponse<List<UsageInner>>, List<UsageInner>>() {
            @Override
            public List<UsageInner> call(ServiceResponse<List<UsageInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is name.value (name of the metric, can have an or of multiple names).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;UsageInner&gt; object
     */
    public Observable<ServiceResponse<List<UsageInner>>> listUsagesWithServiceResponseAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (databaseRid == null) {
            throw new IllegalArgumentException("Parameter databaseRid is required and cannot be null.");
        }
        if (collectionRid == null) {
            throw new IllegalArgumentException("Parameter collectionRid is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01-preview";
        return service.listUsages(this.client.subscriptionId(), resourceGroupName, accountName, databaseRid, collectionRid, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<UsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<UsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<UsageInner>> result = listUsagesDelegate(response);
                        List<UsageInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<UsageInner>> clientResponse = new ServiceResponse<List<UsageInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<UsageInner>> listUsagesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<UsageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<UsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves metric definitions for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;MetricDefinitionInner&gt; object if successful.
     */
    public List<MetricDefinitionInner> listMetricDefinitions(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        return listMetricDefinitionsWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid).toBlocking().single().body();
    }

    /**
     * Retrieves metric definitions for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MetricDefinitionInner>> listMetricDefinitionsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, final ServiceCallback<List<MetricDefinitionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listMetricDefinitionsWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid), serviceCallback);
    }

    /**
     * Retrieves metric definitions for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MetricDefinitionInner&gt; object
     */
    public Observable<List<MetricDefinitionInner>> listMetricDefinitionsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        return listMetricDefinitionsWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid).map(new Func1<ServiceResponse<List<MetricDefinitionInner>>, List<MetricDefinitionInner>>() {
            @Override
            public List<MetricDefinitionInner> call(ServiceResponse<List<MetricDefinitionInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves metric definitions for the given collection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MetricDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<List<MetricDefinitionInner>>> listMetricDefinitionsWithServiceResponseAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (databaseRid == null) {
            throw new IllegalArgumentException("Parameter databaseRid is required and cannot be null.");
        }
        if (collectionRid == null) {
            throw new IllegalArgumentException("Parameter collectionRid is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01-preview";
        return service.listMetricDefinitions(this.client.subscriptionId(), resourceGroupName, accountName, databaseRid, collectionRid, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<MetricDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<MetricDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<MetricDefinitionInner>> result = listMetricDefinitionsDelegate(response);
                        List<MetricDefinitionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<MetricDefinitionInner>> clientResponse = new ServiceResponse<List<MetricDefinitionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<MetricDefinitionInner>> listMetricDefinitionsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<MetricDefinitionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<MetricDefinitionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
