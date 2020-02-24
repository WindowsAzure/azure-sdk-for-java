/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
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
 * in ElasticPools.
 */
public class ElasticPoolsInner {
    /** The Retrofit service to perform REST calls. */
    private ElasticPoolsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ElasticPoolsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ElasticPoolsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(ElasticPoolsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ElasticPools to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ElasticPoolsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2018_06_01_preview.ElasticPools failover" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/elasticPools/{elasticPoolName}/failover")
        Observable<Response<ResponseBody>> failover(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("elasticPoolName") String elasticPoolName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2018_06_01_preview.ElasticPools beginFailover" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/elasticPools/{elasticPoolName}/failover")
        Observable<Response<ResponseBody>> beginFailover(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("elasticPoolName") String elasticPoolName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Failovers an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to failover.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void failover(String resourceGroupName, String serverName, String elasticPoolName) {
        failoverWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName).toBlocking().last().body();
    }

    /**
     * Failovers an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to failover.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> failoverAsync(String resourceGroupName, String serverName, String elasticPoolName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(failoverWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName), serviceCallback);
    }

    /**
     * Failovers an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to failover.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> failoverAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        return failoverWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Failovers an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to failover.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> failoverWithServiceResponseAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (elasticPoolName == null) {
            throw new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Observable<Response<ResponseBody>> observable = service.failover(resourceGroupName, serverName, elasticPoolName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Failovers an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to failover.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginFailover(String resourceGroupName, String serverName, String elasticPoolName) {
        beginFailoverWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName).toBlocking().single().body();
    }

    /**
     * Failovers an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to failover.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginFailoverAsync(String resourceGroupName, String serverName, String elasticPoolName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginFailoverWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName), serviceCallback);
    }

    /**
     * Failovers an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to failover.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginFailoverAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        return beginFailoverWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Failovers an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to failover.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginFailoverWithServiceResponseAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (elasticPoolName == null) {
            throw new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.beginFailover(resourceGroupName, serverName, elasticPoolName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginFailoverDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginFailoverDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
