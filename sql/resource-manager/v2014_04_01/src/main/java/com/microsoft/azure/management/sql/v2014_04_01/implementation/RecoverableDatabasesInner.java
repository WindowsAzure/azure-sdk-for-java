/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

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
 * in RecoverableDatabases.
 */
public class RecoverableDatabasesInner {
    /** The Retrofit service to perform REST calls. */
    private RecoverableDatabasesService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of RecoverableDatabasesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RecoverableDatabasesInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(RecoverableDatabasesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoverableDatabases to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RecoverableDatabasesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.RecoverableDatabases get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/recoverableDatabases/{databaseName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.RecoverableDatabases listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/recoverableDatabases")
        Observable<Response<ResponseBody>> listByServer(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RecoverableDatabaseInner object if successful.
     */
    public RecoverableDatabaseInner get(String resourceGroupName, String serverName, String databaseName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName).toBlocking().single().body();
    }

    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RecoverableDatabaseInner> getAsync(String resourceGroupName, String serverName, String databaseName, final ServiceCallback<RecoverableDatabaseInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecoverableDatabaseInner object
     */
    public Observable<RecoverableDatabaseInner> getAsync(String resourceGroupName, String serverName, String databaseName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName).map(new Func1<ServiceResponse<RecoverableDatabaseInner>, RecoverableDatabaseInner>() {
            @Override
            public RecoverableDatabaseInner call(ServiceResponse<RecoverableDatabaseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecoverableDatabaseInner object
     */
    public Observable<ServiceResponse<RecoverableDatabaseInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RecoverableDatabaseInner>>>() {
                @Override
                public Observable<ServiceResponse<RecoverableDatabaseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RecoverableDatabaseInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RecoverableDatabaseInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RecoverableDatabaseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RecoverableDatabaseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of recoverable databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;RecoverableDatabaseInner&gt; object if successful.
     */
    public List<RecoverableDatabaseInner> listByServer(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Gets a list of recoverable databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecoverableDatabaseInner>> listByServerAsync(String resourceGroupName, String serverName, final ServiceCallback<List<RecoverableDatabaseInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByServerWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Gets a list of recoverable databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RecoverableDatabaseInner&gt; object
     */
    public Observable<List<RecoverableDatabaseInner>> listByServerAsync(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<List<RecoverableDatabaseInner>>, List<RecoverableDatabaseInner>>() {
            @Override
            public List<RecoverableDatabaseInner> call(ServiceResponse<List<RecoverableDatabaseInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of recoverable databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RecoverableDatabaseInner&gt; object
     */
    public Observable<ServiceResponse<List<RecoverableDatabaseInner>>> listByServerWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByServer(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<RecoverableDatabaseInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<RecoverableDatabaseInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RecoverableDatabaseInner>> result = listByServerDelegate(response);
                        List<RecoverableDatabaseInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<RecoverableDatabaseInner>> clientResponse = new ServiceResponse<List<RecoverableDatabaseInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RecoverableDatabaseInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RecoverableDatabaseInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RecoverableDatabaseInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
