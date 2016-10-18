/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
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
 * in ElasticPoolsDatabaseActivitys.
 */
public final class ElasticPoolsDatabaseActivitysInner {
    /** The Retrofit service to perform REST calls. */
    private ElasticPoolsDatabaseActivitysService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ElasticPoolsDatabaseActivitysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ElasticPoolsDatabaseActivitysInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(ElasticPoolsDatabaseActivitysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ElasticPoolsDatabaseActivitys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ElasticPoolsDatabaseActivitysService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/elasticPools/{elasticPoolName}/elasticPoolDatabaseActivity")
        Observable<Response<ResponseBody>> list(@Path("elasticPoolName") String elasticPoolName, @Path("subscriptionId") UUID subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns information about activity on Azure SQL databases inside of an Azure SQL elastic pool.
     *
     * @param elasticPoolName The name of the Azure SQL Elastic Pool.
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @return the List&lt;ElasticPoolDatabaseActivityInner&gt; object if successful.
     */
    public List<ElasticPoolDatabaseActivityInner> list(String elasticPoolName, String resourceGroupName, String serverName) {
        return listWithServiceResponseAsync(elasticPoolName, resourceGroupName, serverName).toBlocking().single().getBody();
    }

    /**
     * Returns information about activity on Azure SQL databases inside of an Azure SQL elastic pool.
     *
     * @param elasticPoolName The name of the Azure SQL Elastic Pool.
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<ElasticPoolDatabaseActivityInner>> listAsync(String elasticPoolName, String resourceGroupName, String serverName, final ServiceCallback<List<ElasticPoolDatabaseActivityInner>> serviceCallback) {
        return ServiceCall.create(listWithServiceResponseAsync(elasticPoolName, resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Returns information about activity on Azure SQL databases inside of an Azure SQL elastic pool.
     *
     * @param elasticPoolName The name of the Azure SQL Elastic Pool.
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @return the observable to the List&lt;ElasticPoolDatabaseActivityInner&gt; object
     */
    public Observable<List<ElasticPoolDatabaseActivityInner>> listAsync(String elasticPoolName, String resourceGroupName, String serverName) {
        return listWithServiceResponseAsync(elasticPoolName, resourceGroupName, serverName).map(new Func1<ServiceResponse<List<ElasticPoolDatabaseActivityInner>>, List<ElasticPoolDatabaseActivityInner>>() {
            @Override
            public List<ElasticPoolDatabaseActivityInner> call(ServiceResponse<List<ElasticPoolDatabaseActivityInner>> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Returns information about activity on Azure SQL databases inside of an Azure SQL elastic pool.
     *
     * @param elasticPoolName The name of the Azure SQL Elastic Pool.
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Server
     * @return the observable to the List&lt;ElasticPoolDatabaseActivityInner&gt; object
     */
    public Observable<ServiceResponse<List<ElasticPoolDatabaseActivityInner>>> listWithServiceResponseAsync(String elasticPoolName, String resourceGroupName, String serverName) {
        if (elasticPoolName == null) {
            throw new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        final String apiVersion = "2014-04-01";
        return service.list(elasticPoolName, this.client.subscriptionId(), resourceGroupName, serverName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ElasticPoolDatabaseActivityInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ElasticPoolDatabaseActivityInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ElasticPoolDatabaseActivityInner>> result = listDelegate(response);
                        ServiceResponse<List<ElasticPoolDatabaseActivityInner>> clientResponse = new ServiceResponse<List<ElasticPoolDatabaseActivityInner>>(result.getBody().getItems(), result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ElasticPoolDatabaseActivityInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl1<ElasticPoolDatabaseActivityInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl1<ElasticPoolDatabaseActivityInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
