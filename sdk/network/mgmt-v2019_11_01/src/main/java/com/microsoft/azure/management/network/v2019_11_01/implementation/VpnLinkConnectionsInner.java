/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
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
 * in VpnLinkConnections.
 */
public class VpnLinkConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private VpnLinkConnectionsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnLinkConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VpnLinkConnectionsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(VpnLinkConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VpnLinkConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VpnLinkConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_11_01.VpnLinkConnections listByVpnConnection" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}/vpnLinkConnections")
        Observable<Response<ResponseBody>> listByVpnConnection(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("gatewayName") String gatewayName, @Path("connectionName") String connectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_11_01.VpnLinkConnections listByVpnConnectionNext" })
        @GET
        Observable<Response<ResponseBody>> listByVpnConnectionNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;VpnSiteLinkConnectionInner&gt; object if successful.
     */
    public PagedList<VpnSiteLinkConnectionInner> listByVpnConnection(final String resourceGroupName, final String gatewayName, final String connectionName) {
        ServiceResponse<Page<VpnSiteLinkConnectionInner>> response = listByVpnConnectionSinglePageAsync(resourceGroupName, gatewayName, connectionName).toBlocking().single();
        return new PagedList<VpnSiteLinkConnectionInner>(response.body()) {
            @Override
            public Page<VpnSiteLinkConnectionInner> nextPage(String nextPageLink) {
                return listByVpnConnectionNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VpnSiteLinkConnectionInner>> listByVpnConnectionAsync(final String resourceGroupName, final String gatewayName, final String connectionName, final ListOperationCallback<VpnSiteLinkConnectionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByVpnConnectionSinglePageAsync(resourceGroupName, gatewayName, connectionName),
            new Func1<String, Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>> call(String nextPageLink) {
                    return listByVpnConnectionNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VpnSiteLinkConnectionInner&gt; object
     */
    public Observable<Page<VpnSiteLinkConnectionInner>> listByVpnConnectionAsync(final String resourceGroupName, final String gatewayName, final String connectionName) {
        return listByVpnConnectionWithServiceResponseAsync(resourceGroupName, gatewayName, connectionName)
            .map(new Func1<ServiceResponse<Page<VpnSiteLinkConnectionInner>>, Page<VpnSiteLinkConnectionInner>>() {
                @Override
                public Page<VpnSiteLinkConnectionInner> call(ServiceResponse<Page<VpnSiteLinkConnectionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VpnSiteLinkConnectionInner&gt; object
     */
    public Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>> listByVpnConnectionWithServiceResponseAsync(final String resourceGroupName, final String gatewayName, final String connectionName) {
        return listByVpnConnectionSinglePageAsync(resourceGroupName, gatewayName, connectionName)
            .concatMap(new Func1<ServiceResponse<Page<VpnSiteLinkConnectionInner>>, Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>> call(ServiceResponse<Page<VpnSiteLinkConnectionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByVpnConnectionNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
    ServiceResponse<PageImpl<VpnSiteLinkConnectionInner>> * @param resourceGroupName The resource group name of the VpnGateway.
    ServiceResponse<PageImpl<VpnSiteLinkConnectionInner>> * @param gatewayName The name of the gateway.
    ServiceResponse<PageImpl<VpnSiteLinkConnectionInner>> * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;VpnSiteLinkConnectionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>> listByVpnConnectionSinglePageAsync(final String resourceGroupName, final String gatewayName, final String connectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        final String apiVersion = "2019-11-01";
        return service.listByVpnConnection(this.client.subscriptionId(), resourceGroupName, gatewayName, connectionName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<VpnSiteLinkConnectionInner>> result = listByVpnConnectionDelegate(response);
                        return Observable.just(new ServiceResponse<Page<VpnSiteLinkConnectionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<VpnSiteLinkConnectionInner>> listByVpnConnectionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<VpnSiteLinkConnectionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<VpnSiteLinkConnectionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;VpnSiteLinkConnectionInner&gt; object if successful.
     */
    public PagedList<VpnSiteLinkConnectionInner> listByVpnConnectionNext(final String nextPageLink) {
        ServiceResponse<Page<VpnSiteLinkConnectionInner>> response = listByVpnConnectionNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<VpnSiteLinkConnectionInner>(response.body()) {
            @Override
            public Page<VpnSiteLinkConnectionInner> nextPage(String nextPageLink) {
                return listByVpnConnectionNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VpnSiteLinkConnectionInner>> listByVpnConnectionNextAsync(final String nextPageLink, final ServiceFuture<List<VpnSiteLinkConnectionInner>> serviceFuture, final ListOperationCallback<VpnSiteLinkConnectionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByVpnConnectionNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>> call(String nextPageLink) {
                    return listByVpnConnectionNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VpnSiteLinkConnectionInner&gt; object
     */
    public Observable<Page<VpnSiteLinkConnectionInner>> listByVpnConnectionNextAsync(final String nextPageLink) {
        return listByVpnConnectionNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<VpnSiteLinkConnectionInner>>, Page<VpnSiteLinkConnectionInner>>() {
                @Override
                public Page<VpnSiteLinkConnectionInner> call(ServiceResponse<Page<VpnSiteLinkConnectionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VpnSiteLinkConnectionInner&gt; object
     */
    public Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>> listByVpnConnectionNextWithServiceResponseAsync(final String nextPageLink) {
        return listByVpnConnectionNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<VpnSiteLinkConnectionInner>>, Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>> call(ServiceResponse<Page<VpnSiteLinkConnectionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByVpnConnectionNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
    ServiceResponse<PageImpl<VpnSiteLinkConnectionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;VpnSiteLinkConnectionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>> listByVpnConnectionNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByVpnConnectionNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkConnectionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<VpnSiteLinkConnectionInner>> result = listByVpnConnectionNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<VpnSiteLinkConnectionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<VpnSiteLinkConnectionInner>> listByVpnConnectionNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<VpnSiteLinkConnectionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<VpnSiteLinkConnectionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
