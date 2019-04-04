/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.v2018_07_01.ErrorException;
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
 * in HubVirtualNetworkConnections.
 */
public class HubVirtualNetworkConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private HubVirtualNetworkConnectionsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of HubVirtualNetworkConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HubVirtualNetworkConnectionsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(HubVirtualNetworkConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for HubVirtualNetworkConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HubVirtualNetworkConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_07_01.HubVirtualNetworkConnections get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs/{virtualHubName}/hubVirtualNetworkConnections/{connectionName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("virtualHubName") String virtualHubName, @Path("connectionName") String connectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_07_01.HubVirtualNetworkConnections list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs/{virtualHubName}/hubVirtualNetworkConnections")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("virtualHubName") String virtualHubName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_07_01.HubVirtualNetworkConnections listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HubVirtualNetworkConnectionInner object if successful.
     */
    public HubVirtualNetworkConnectionInner get(String resourceGroupName, String virtualHubName, String connectionName) {
        return getWithServiceResponseAsync(resourceGroupName, virtualHubName, connectionName).toBlocking().single().body();
    }

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HubVirtualNetworkConnectionInner> getAsync(String resourceGroupName, String virtualHubName, String connectionName, final ServiceCallback<HubVirtualNetworkConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, virtualHubName, connectionName), serviceCallback);
    }

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HubVirtualNetworkConnectionInner object
     */
    public Observable<HubVirtualNetworkConnectionInner> getAsync(String resourceGroupName, String virtualHubName, String connectionName) {
        return getWithServiceResponseAsync(resourceGroupName, virtualHubName, connectionName).map(new Func1<ServiceResponse<HubVirtualNetworkConnectionInner>, HubVirtualNetworkConnectionInner>() {
            @Override
            public HubVirtualNetworkConnectionInner call(ServiceResponse<HubVirtualNetworkConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HubVirtualNetworkConnectionInner object
     */
    public Observable<ServiceResponse<HubVirtualNetworkConnectionInner>> getWithServiceResponseAsync(String resourceGroupName, String virtualHubName, String connectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualHubName == null) {
            throw new IllegalArgumentException("Parameter virtualHubName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        final String apiVersion = "2018-07-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, virtualHubName, connectionName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<HubVirtualNetworkConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<HubVirtualNetworkConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<HubVirtualNetworkConnectionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<HubVirtualNetworkConnectionInner> getDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<HubVirtualNetworkConnectionInner, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<HubVirtualNetworkConnectionInner>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;HubVirtualNetworkConnectionInner&gt; object if successful.
     */
    public PagedList<HubVirtualNetworkConnectionInner> list(final String resourceGroupName, final String virtualHubName) {
        ServiceResponse<Page<HubVirtualNetworkConnectionInner>> response = listSinglePageAsync(resourceGroupName, virtualHubName).toBlocking().single();
        return new PagedList<HubVirtualNetworkConnectionInner>(response.body()) {
            @Override
            public Page<HubVirtualNetworkConnectionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<HubVirtualNetworkConnectionInner>> listAsync(final String resourceGroupName, final String virtualHubName, final ListOperationCallback<HubVirtualNetworkConnectionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, virtualHubName),
            new Func1<String, Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HubVirtualNetworkConnectionInner&gt; object
     */
    public Observable<Page<HubVirtualNetworkConnectionInner>> listAsync(final String resourceGroupName, final String virtualHubName) {
        return listWithServiceResponseAsync(resourceGroupName, virtualHubName)
            .map(new Func1<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>, Page<HubVirtualNetworkConnectionInner>>() {
                @Override
                public Page<HubVirtualNetworkConnectionInner> call(ServiceResponse<Page<HubVirtualNetworkConnectionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HubVirtualNetworkConnectionInner&gt; object
     */
    public Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String virtualHubName) {
        return listSinglePageAsync(resourceGroupName, virtualHubName)
            .concatMap(new Func1<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>, Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>> call(ServiceResponse<Page<HubVirtualNetworkConnectionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
    ServiceResponse<PageImpl<HubVirtualNetworkConnectionInner>> * @param resourceGroupName The resource group name of the VirtualHub.
    ServiceResponse<PageImpl<HubVirtualNetworkConnectionInner>> * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;HubVirtualNetworkConnectionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>> listSinglePageAsync(final String resourceGroupName, final String virtualHubName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualHubName == null) {
            throw new IllegalArgumentException("Parameter virtualHubName is required and cannot be null.");
        }
        final String apiVersion = "2018-07-01";
        return service.list(this.client.subscriptionId(), resourceGroupName, virtualHubName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<HubVirtualNetworkConnectionInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<HubVirtualNetworkConnectionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<HubVirtualNetworkConnectionInner>> listDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<HubVirtualNetworkConnectionInner>, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<HubVirtualNetworkConnectionInner>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;HubVirtualNetworkConnectionInner&gt; object if successful.
     */
    public PagedList<HubVirtualNetworkConnectionInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<HubVirtualNetworkConnectionInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<HubVirtualNetworkConnectionInner>(response.body()) {
            @Override
            public Page<HubVirtualNetworkConnectionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<HubVirtualNetworkConnectionInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<HubVirtualNetworkConnectionInner>> serviceFuture, final ListOperationCallback<HubVirtualNetworkConnectionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HubVirtualNetworkConnectionInner&gt; object
     */
    public Observable<Page<HubVirtualNetworkConnectionInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>, Page<HubVirtualNetworkConnectionInner>>() {
                @Override
                public Page<HubVirtualNetworkConnectionInner> call(ServiceResponse<Page<HubVirtualNetworkConnectionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HubVirtualNetworkConnectionInner&gt; object
     */
    public Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>, Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>> call(ServiceResponse<Page<HubVirtualNetworkConnectionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
    ServiceResponse<PageImpl<HubVirtualNetworkConnectionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;HubVirtualNetworkConnectionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HubVirtualNetworkConnectionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<HubVirtualNetworkConnectionInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<HubVirtualNetworkConnectionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<HubVirtualNetworkConnectionInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<HubVirtualNetworkConnectionInner>, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<HubVirtualNetworkConnectionInner>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
