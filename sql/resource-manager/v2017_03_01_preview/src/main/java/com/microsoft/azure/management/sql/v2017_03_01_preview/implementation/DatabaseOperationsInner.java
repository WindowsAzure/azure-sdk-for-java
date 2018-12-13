/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DatabaseOperations.
 */
public class DatabaseOperationsInner {
    /** The Retrofit service to perform REST calls. */
    private DatabaseOperationsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseOperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DatabaseOperationsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(DatabaseOperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DatabaseOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DatabaseOperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.DatabaseOperations cancel" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/operations/{operationId}/cancel")
        Observable<Response<ResponseBody>> cancel(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("operationId") UUID operationId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.DatabaseOperations listByDatabase" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/operations")
        Observable<Response<ResponseBody>> listByDatabase(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.DatabaseOperations listByDatabaseNext" })
        @GET
        Observable<Response<ResponseBody>> listByDatabaseNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Cancels the asynchronous operation on the database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param operationId The operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void cancel(String resourceGroupName, String serverName, String databaseName, UUID operationId) {
        cancelWithServiceResponseAsync(resourceGroupName, serverName, databaseName, operationId).toBlocking().single().body();
    }

    /**
     * Cancels the asynchronous operation on the database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param operationId The operation identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> cancelAsync(String resourceGroupName, String serverName, String databaseName, UUID operationId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(cancelWithServiceResponseAsync(resourceGroupName, serverName, databaseName, operationId), serviceCallback);
    }

    /**
     * Cancels the asynchronous operation on the database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param operationId The operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> cancelAsync(String resourceGroupName, String serverName, String databaseName, UUID operationId) {
        return cancelWithServiceResponseAsync(resourceGroupName, serverName, databaseName, operationId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Cancels the asynchronous operation on the database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param operationId The operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> cancelWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, UUID operationId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.cancel(resourceGroupName, serverName, databaseName, operationId, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = cancelDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> cancelDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of operations performed on the database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DatabaseOperationInner&gt; object if successful.
     */
    public PagedList<DatabaseOperationInner> listByDatabase(final String resourceGroupName, final String serverName, final String databaseName) {
        ServiceResponse<Page<DatabaseOperationInner>> response = listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName).toBlocking().single();
        return new PagedList<DatabaseOperationInner>(response.body()) {
            @Override
            public Page<DatabaseOperationInner> nextPage(String nextPageLink) {
                return listByDatabaseNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of operations performed on the database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DatabaseOperationInner>> listByDatabaseAsync(final String resourceGroupName, final String serverName, final String databaseName, final ListOperationCallback<DatabaseOperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName),
            new Func1<String, Observable<ServiceResponse<Page<DatabaseOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatabaseOperationInner>>> call(String nextPageLink) {
                    return listByDatabaseNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of operations performed on the database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DatabaseOperationInner&gt; object
     */
    public Observable<Page<DatabaseOperationInner>> listByDatabaseAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        return listByDatabaseWithServiceResponseAsync(resourceGroupName, serverName, databaseName)
            .map(new Func1<ServiceResponse<Page<DatabaseOperationInner>>, Page<DatabaseOperationInner>>() {
                @Override
                public Page<DatabaseOperationInner> call(ServiceResponse<Page<DatabaseOperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of operations performed on the database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DatabaseOperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<DatabaseOperationInner>>> listByDatabaseWithServiceResponseAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        return listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName)
            .concatMap(new Func1<ServiceResponse<Page<DatabaseOperationInner>>, Observable<ServiceResponse<Page<DatabaseOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatabaseOperationInner>>> call(ServiceResponse<Page<DatabaseOperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByDatabaseNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of operations performed on the database.
     *
    ServiceResponse<PageImpl<DatabaseOperationInner>> * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
    ServiceResponse<PageImpl<DatabaseOperationInner>> * @param serverName The name of the server.
    ServiceResponse<PageImpl<DatabaseOperationInner>> * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DatabaseOperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DatabaseOperationInner>>> listByDatabaseSinglePageAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByDatabase(resourceGroupName, serverName, databaseName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DatabaseOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatabaseOperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DatabaseOperationInner>> result = listByDatabaseDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DatabaseOperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DatabaseOperationInner>> listByDatabaseDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DatabaseOperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DatabaseOperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of operations performed on the database.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DatabaseOperationInner&gt; object if successful.
     */
    public PagedList<DatabaseOperationInner> listByDatabaseNext(final String nextPageLink) {
        ServiceResponse<Page<DatabaseOperationInner>> response = listByDatabaseNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<DatabaseOperationInner>(response.body()) {
            @Override
            public Page<DatabaseOperationInner> nextPage(String nextPageLink) {
                return listByDatabaseNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of operations performed on the database.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DatabaseOperationInner>> listByDatabaseNextAsync(final String nextPageLink, final ServiceFuture<List<DatabaseOperationInner>> serviceFuture, final ListOperationCallback<DatabaseOperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByDatabaseNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<DatabaseOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatabaseOperationInner>>> call(String nextPageLink) {
                    return listByDatabaseNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of operations performed on the database.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DatabaseOperationInner&gt; object
     */
    public Observable<Page<DatabaseOperationInner>> listByDatabaseNextAsync(final String nextPageLink) {
        return listByDatabaseNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<DatabaseOperationInner>>, Page<DatabaseOperationInner>>() {
                @Override
                public Page<DatabaseOperationInner> call(ServiceResponse<Page<DatabaseOperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of operations performed on the database.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DatabaseOperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<DatabaseOperationInner>>> listByDatabaseNextWithServiceResponseAsync(final String nextPageLink) {
        return listByDatabaseNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<DatabaseOperationInner>>, Observable<ServiceResponse<Page<DatabaseOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatabaseOperationInner>>> call(ServiceResponse<Page<DatabaseOperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByDatabaseNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of operations performed on the database.
     *
    ServiceResponse<PageImpl<DatabaseOperationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DatabaseOperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DatabaseOperationInner>>> listByDatabaseNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByDatabaseNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DatabaseOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatabaseOperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DatabaseOperationInner>> result = listByDatabaseNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DatabaseOperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DatabaseOperationInner>> listByDatabaseNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DatabaseOperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DatabaseOperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
