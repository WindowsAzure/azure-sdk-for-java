/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

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
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in WorkspaceManagedSqlServerRecoverableSqlPools.
 */
public class WorkspaceManagedSqlServerRecoverableSqlPoolsInner {
    /** The Retrofit service to perform REST calls. */
    private WorkspaceManagedSqlServerRecoverableSqlPoolsService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of WorkspaceManagedSqlServerRecoverableSqlPoolsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WorkspaceManagedSqlServerRecoverableSqlPoolsInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(WorkspaceManagedSqlServerRecoverableSqlPoolsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WorkspaceManagedSqlServerRecoverableSqlPools to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WorkspaceManagedSqlServerRecoverableSqlPoolsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.WorkspaceManagedSqlServerRecoverableSqlPools list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/recoverableSqlPools")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.WorkspaceManagedSqlServerRecoverableSqlPools get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/recoverableSqlPools/{sqlPoolName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.WorkspaceManagedSqlServerRecoverableSqlPools listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get list of recoverable sql pools for the server.
     * Get list of recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RecoverableSqlPoolInner&gt; object if successful.
     */
    public PagedList<RecoverableSqlPoolInner> list(final String resourceGroupName, final String workspaceName) {
        ServiceResponse<Page<RecoverableSqlPoolInner>> response = listSinglePageAsync(resourceGroupName, workspaceName).toBlocking().single();
        return new PagedList<RecoverableSqlPoolInner>(response.body()) {
            @Override
            public Page<RecoverableSqlPoolInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get list of recoverable sql pools for the server.
     * Get list of recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecoverableSqlPoolInner>> listAsync(final String resourceGroupName, final String workspaceName, final ListOperationCallback<RecoverableSqlPoolInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, workspaceName),
            new Func1<String, Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get list of recoverable sql pools for the server.
     * Get list of recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecoverableSqlPoolInner&gt; object
     */
    public Observable<Page<RecoverableSqlPoolInner>> listAsync(final String resourceGroupName, final String workspaceName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName)
            .map(new Func1<ServiceResponse<Page<RecoverableSqlPoolInner>>, Page<RecoverableSqlPoolInner>>() {
                @Override
                public Page<RecoverableSqlPoolInner> call(ServiceResponse<Page<RecoverableSqlPoolInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get list of recoverable sql pools for the server.
     * Get list of recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecoverableSqlPoolInner&gt; object
     */
    public Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String workspaceName) {
        return listSinglePageAsync(resourceGroupName, workspaceName)
            .concatMap(new Func1<ServiceResponse<Page<RecoverableSqlPoolInner>>, Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>> call(ServiceResponse<Page<RecoverableSqlPoolInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get list of recoverable sql pools for the server.
     * Get list of recoverable sql pools for workspace managed sql server.
     *
    ServiceResponse<PageImpl<RecoverableSqlPoolInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<RecoverableSqlPoolInner>> * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RecoverableSqlPoolInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>> listSinglePageAsync(final String resourceGroupName, final String workspaceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, workspaceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RecoverableSqlPoolInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RecoverableSqlPoolInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RecoverableSqlPoolInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RecoverableSqlPoolInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RecoverableSqlPoolInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get recoverable sql pools for the server.
     * Get recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName The name of the sql pool
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RecoverableSqlPoolInner object if successful.
     */
    public RecoverableSqlPoolInner get(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single().body();
    }

    /**
     * Get recoverable sql pools for the server.
     * Get recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName The name of the sql pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RecoverableSqlPoolInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, final ServiceCallback<RecoverableSqlPoolInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName), serviceCallback);
    }

    /**
     * Get recoverable sql pools for the server.
     * Get recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName The name of the sql pool
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecoverableSqlPoolInner object
     */
    public Observable<RecoverableSqlPoolInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).map(new Func1<ServiceResponse<RecoverableSqlPoolInner>, RecoverableSqlPoolInner>() {
            @Override
            public RecoverableSqlPoolInner call(ServiceResponse<RecoverableSqlPoolInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get recoverable sql pools for the server.
     * Get recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName The name of the sql pool
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecoverableSqlPoolInner object
     */
    public Observable<ServiceResponse<RecoverableSqlPoolInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RecoverableSqlPoolInner>>>() {
                @Override
                public Observable<ServiceResponse<RecoverableSqlPoolInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RecoverableSqlPoolInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RecoverableSqlPoolInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RecoverableSqlPoolInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RecoverableSqlPoolInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get list of recoverable sql pools for the server.
     * Get list of recoverable sql pools for workspace managed sql server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RecoverableSqlPoolInner&gt; object if successful.
     */
    public PagedList<RecoverableSqlPoolInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<RecoverableSqlPoolInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RecoverableSqlPoolInner>(response.body()) {
            @Override
            public Page<RecoverableSqlPoolInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get list of recoverable sql pools for the server.
     * Get list of recoverable sql pools for workspace managed sql server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecoverableSqlPoolInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<RecoverableSqlPoolInner>> serviceFuture, final ListOperationCallback<RecoverableSqlPoolInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get list of recoverable sql pools for the server.
     * Get list of recoverable sql pools for workspace managed sql server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecoverableSqlPoolInner&gt; object
     */
    public Observable<Page<RecoverableSqlPoolInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RecoverableSqlPoolInner>>, Page<RecoverableSqlPoolInner>>() {
                @Override
                public Page<RecoverableSqlPoolInner> call(ServiceResponse<Page<RecoverableSqlPoolInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get list of recoverable sql pools for the server.
     * Get list of recoverable sql pools for workspace managed sql server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecoverableSqlPoolInner&gt; object
     */
    public Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RecoverableSqlPoolInner>>, Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>> call(ServiceResponse<Page<RecoverableSqlPoolInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get list of recoverable sql pools for the server.
     * Get list of recoverable sql pools for workspace managed sql server.
     *
    ServiceResponse<PageImpl<RecoverableSqlPoolInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RecoverableSqlPoolInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecoverableSqlPoolInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RecoverableSqlPoolInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RecoverableSqlPoolInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RecoverableSqlPoolInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RecoverableSqlPoolInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RecoverableSqlPoolInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
