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
 * in PartitionKeyRangeIdRegions.
 */
public class PartitionKeyRangeIdRegionsInner {
    /** The Retrofit service to perform REST calls. */
    private PartitionKeyRangeIdRegionsService service;
    /** The service client containing this operation class. */
    private CosmosDBImpl client;

    /**
     * Initializes an instance of PartitionKeyRangeIdRegionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PartitionKeyRangeIdRegionsInner(Retrofit retrofit, CosmosDBImpl client) {
        this.service = retrofit.create(PartitionKeyRangeIdRegionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PartitionKeyRangeIdRegions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PartitionKeyRangeIdRegionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2015_04_08.PartitionKeyRangeIdRegions listMetrics" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/region/{region}/databases/{databaseRid}/collections/{collectionRid}/partitionKeyRangeId/{partitionKeyRangeId}/metrics")
        Observable<Response<ResponseBody>> listMetrics(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("region") String region, @Path("databaseRid") String databaseRid, @Path("collectionRid") String collectionRid, @Path("partitionKeyRangeId") String partitionKeyRangeId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves the metrics determined by the given filter for the given partition key range id and region.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param partitionKeyRangeId Partition Key Range Id for which to get data.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PartitionMetricInner&gt; object if successful.
     */
    public List<PartitionMetricInner> listMetrics(String resourceGroupName, String accountName, String region, String databaseRid, String collectionRid, String partitionKeyRangeId, String filter) {
        return listMetricsWithServiceResponseAsync(resourceGroupName, accountName, region, databaseRid, collectionRid, partitionKeyRangeId, filter).toBlocking().single().body();
    }

    /**
     * Retrieves the metrics determined by the given filter for the given partition key range id and region.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param partitionKeyRangeId Partition Key Range Id for which to get data.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PartitionMetricInner>> listMetricsAsync(String resourceGroupName, String accountName, String region, String databaseRid, String collectionRid, String partitionKeyRangeId, String filter, final ServiceCallback<List<PartitionMetricInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listMetricsWithServiceResponseAsync(resourceGroupName, accountName, region, databaseRid, collectionRid, partitionKeyRangeId, filter), serviceCallback);
    }

    /**
     * Retrieves the metrics determined by the given filter for the given partition key range id and region.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param partitionKeyRangeId Partition Key Range Id for which to get data.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PartitionMetricInner&gt; object
     */
    public Observable<List<PartitionMetricInner>> listMetricsAsync(String resourceGroupName, String accountName, String region, String databaseRid, String collectionRid, String partitionKeyRangeId, String filter) {
        return listMetricsWithServiceResponseAsync(resourceGroupName, accountName, region, databaseRid, collectionRid, partitionKeyRangeId, filter).map(new Func1<ServiceResponse<List<PartitionMetricInner>>, List<PartitionMetricInner>>() {
            @Override
            public List<PartitionMetricInner> call(ServiceResponse<List<PartitionMetricInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the metrics determined by the given filter for the given partition key range id and region.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param partitionKeyRangeId Partition Key Range Id for which to get data.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PartitionMetricInner&gt; object
     */
    public Observable<ServiceResponse<List<PartitionMetricInner>>> listMetricsWithServiceResponseAsync(String resourceGroupName, String accountName, String region, String databaseRid, String collectionRid, String partitionKeyRangeId, String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (region == null) {
            throw new IllegalArgumentException("Parameter region is required and cannot be null.");
        }
        if (databaseRid == null) {
            throw new IllegalArgumentException("Parameter databaseRid is required and cannot be null.");
        }
        if (collectionRid == null) {
            throw new IllegalArgumentException("Parameter collectionRid is required and cannot be null.");
        }
        if (partitionKeyRangeId == null) {
            throw new IllegalArgumentException("Parameter partitionKeyRangeId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (filter == null) {
            throw new IllegalArgumentException("Parameter filter is required and cannot be null.");
        }
        return service.listMetrics(this.client.subscriptionId(), resourceGroupName, accountName, region, databaseRid, collectionRid, partitionKeyRangeId, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
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

}
