/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

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
 * in CollectionPartitions.
 */
public class CollectionPartitionsInner {
    /** The Retrofit service to perform REST calls. */
    private CollectionPartitionsService service;
    /** The service client containing this operation class. */
    private CosmosDBImpl client;

    /**
     * Initializes an instance of CollectionPartitionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CollectionPartitionsInner(Retrofit retrofit, CosmosDBImpl client) {
        this.service = retrofit.create(CollectionPartitionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for CollectionPartitions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CollectionPartitionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2015_04_08.CollectionPartitions listMetrics" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/databases/{databaseRid}/collections/{collectionRid}/partitions/metrics")
        Observable<Response<ResponseBody>> listMetrics(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("databaseRid") String databaseRid, @Path("collectionRid") String collectionRid, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2015_04_08.CollectionPartitions listUsages" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/databases/{databaseRid}/collections/{collectionRid}/partitions/usages")
        Observable<Response<ResponseBody>> listUsages(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("databaseRid") String databaseRid, @Path("collectionRid") String collectionRid, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PartitionMetricInner&gt; object if successful.
     */
    public List<PartitionMetricInner> listMetrics(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return listMetricsWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter).toBlocking().single().body();
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PartitionMetricInner>> listMetricsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter, final ServiceCallback<List<PartitionMetricInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listMetricsWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter), serviceCallback);
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PartitionMetricInner&gt; object
     */
    public Observable<List<PartitionMetricInner>> listMetricsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return listMetricsWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter).map(new Func1<ServiceResponse<List<PartitionMetricInner>>, List<PartitionMetricInner>>() {
            @Override
            public List<PartitionMetricInner> call(ServiceResponse<List<PartitionMetricInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PartitionMetricInner&gt; object
     */
    public Observable<ServiceResponse<List<PartitionMetricInner>>> listMetricsWithServiceResponseAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
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
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (filter == null) {
            throw new IllegalArgumentException("Parameter filter is required and cannot be null.");
        }
        return service.listMetrics(this.client.subscriptionId(), resourceGroupName, accountName, databaseRid, collectionRid, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<PartitionMetricInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<PartitionMetricInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PartitionMetricInner>> result = listMetricsDelegate(response);
                        List<PartitionMetricInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<PartitionMetricInner>> clientResponse = new ServiceResponse<List<PartitionMetricInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PartitionMetricInner>> listMetricsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PartitionMetricInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PartitionMetricInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PartitionUsageInner&gt; object if successful.
     */
    public List<PartitionUsageInner> listUsages(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        return listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid).toBlocking().single().body();
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PartitionUsageInner>> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, final ServiceCallback<List<PartitionUsageInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid), serviceCallback);
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PartitionUsageInner&gt; object
     */
    public Observable<List<PartitionUsageInner>> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        return listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid).map(new Func1<ServiceResponse<List<PartitionUsageInner>>, List<PartitionUsageInner>>() {
            @Override
            public List<PartitionUsageInner> call(ServiceResponse<List<PartitionUsageInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PartitionUsageInner&gt; object
     */
    public Observable<ServiceResponse<List<PartitionUsageInner>>> listUsagesWithServiceResponseAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
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
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.listUsages(this.client.subscriptionId(), resourceGroupName, accountName, databaseRid, collectionRid, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<PartitionUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<PartitionUsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PartitionUsageInner>> result = listUsagesDelegate(response);
                        List<PartitionUsageInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<PartitionUsageInner>> clientResponse = new ServiceResponse<List<PartitionUsageInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is name.value (name of the metric, can have an or of multiple names).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PartitionUsageInner&gt; object if successful.
     */
    public List<PartitionUsageInner> listUsages(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter).toBlocking().single().body();
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is name.value (name of the metric, can have an or of multiple names).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PartitionUsageInner>> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter, final ServiceCallback<List<PartitionUsageInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter), serviceCallback);
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is name.value (name of the metric, can have an or of multiple names).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PartitionUsageInner&gt; object
     */
    public Observable<List<PartitionUsageInner>> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        return listUsagesWithServiceResponseAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter).map(new Func1<ServiceResponse<List<PartitionUsageInner>>, List<PartitionUsageInner>>() {
            @Override
            public List<PartitionUsageInner> call(ServiceResponse<List<PartitionUsageInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the usages (most recent storage data) for the given collection, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is name.value (name of the metric, can have an or of multiple names).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PartitionUsageInner&gt; object
     */
    public Observable<ServiceResponse<List<PartitionUsageInner>>> listUsagesWithServiceResponseAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
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
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listUsages(this.client.subscriptionId(), resourceGroupName, accountName, databaseRid, collectionRid, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<PartitionUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<PartitionUsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PartitionUsageInner>> result = listUsagesDelegate(response);
                        List<PartitionUsageInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<PartitionUsageInner>> clientResponse = new ServiceResponse<List<PartitionUsageInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PartitionUsageInner>> listUsagesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PartitionUsageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PartitionUsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
