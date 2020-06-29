/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

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
 * in VpnSiteLinks.
 */
public class VpnSiteLinksInner {
    /** The Retrofit service to perform REST calls. */
    private VpnSiteLinksService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnSiteLinksInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VpnSiteLinksInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(VpnSiteLinksService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VpnSiteLinks to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VpnSiteLinksService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_05_01.VpnSiteLinks get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites/{vpnSiteName}/vpnSiteLinks/{vpnSiteLinkName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vpnSiteName") String vpnSiteName, @Path("vpnSiteLinkName") String vpnSiteLinkName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_05_01.VpnSiteLinks listByVpnSite" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites/{vpnSiteName}/vpnSiteLinks")
        Observable<Response<ResponseBody>> listByVpnSite(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vpnSiteName") String vpnSiteName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_05_01.VpnSiteLinks listByVpnSiteNext" })
        @GET
        Observable<Response<ResponseBody>> listByVpnSiteNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves the details of a VPN site link.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpnSiteLinkInner object if successful.
     */
    public VpnSiteLinkInner get(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName) {
        return getWithServiceResponseAsync(resourceGroupName, vpnSiteName, vpnSiteLinkName).toBlocking().single().body();
    }

    /**
     * Retrieves the details of a VPN site link.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpnSiteLinkInner> getAsync(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName, final ServiceCallback<VpnSiteLinkInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, vpnSiteName, vpnSiteLinkName), serviceCallback);
    }

    /**
     * Retrieves the details of a VPN site link.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpnSiteLinkInner object
     */
    public Observable<VpnSiteLinkInner> getAsync(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName) {
        return getWithServiceResponseAsync(resourceGroupName, vpnSiteName, vpnSiteLinkName).map(new Func1<ServiceResponse<VpnSiteLinkInner>, VpnSiteLinkInner>() {
            @Override
            public VpnSiteLinkInner call(ServiceResponse<VpnSiteLinkInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves the details of a VPN site link.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpnSiteLinkInner object
     */
    public Observable<ServiceResponse<VpnSiteLinkInner>> getWithServiceResponseAsync(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vpnSiteName == null) {
            throw new IllegalArgumentException("Parameter vpnSiteName is required and cannot be null.");
        }
        if (vpnSiteLinkName == null) {
            throw new IllegalArgumentException("Parameter vpnSiteLinkName is required and cannot be null.");
        }
        final String apiVersion = "2020-05-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, vpnSiteName, vpnSiteLinkName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpnSiteLinkInner>>>() {
                @Override
                public Observable<ServiceResponse<VpnSiteLinkInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpnSiteLinkInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VpnSiteLinkInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VpnSiteLinkInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VpnSiteLinkInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;VpnSiteLinkInner&gt; object if successful.
     */
    public PagedList<VpnSiteLinkInner> listByVpnSite(final String resourceGroupName, final String vpnSiteName) {
        ServiceResponse<Page<VpnSiteLinkInner>> response = listByVpnSiteSinglePageAsync(resourceGroupName, vpnSiteName).toBlocking().single();
        return new PagedList<VpnSiteLinkInner>(response.body()) {
            @Override
            public Page<VpnSiteLinkInner> nextPage(String nextPageLink) {
                return listByVpnSiteNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VpnSiteLinkInner>> listByVpnSiteAsync(final String resourceGroupName, final String vpnSiteName, final ListOperationCallback<VpnSiteLinkInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByVpnSiteSinglePageAsync(resourceGroupName, vpnSiteName),
            new Func1<String, Observable<ServiceResponse<Page<VpnSiteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkInner>>> call(String nextPageLink) {
                    return listByVpnSiteNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VpnSiteLinkInner&gt; object
     */
    public Observable<Page<VpnSiteLinkInner>> listByVpnSiteAsync(final String resourceGroupName, final String vpnSiteName) {
        return listByVpnSiteWithServiceResponseAsync(resourceGroupName, vpnSiteName)
            .map(new Func1<ServiceResponse<Page<VpnSiteLinkInner>>, Page<VpnSiteLinkInner>>() {
                @Override
                public Page<VpnSiteLinkInner> call(ServiceResponse<Page<VpnSiteLinkInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VpnSiteLinkInner&gt; object
     */
    public Observable<ServiceResponse<Page<VpnSiteLinkInner>>> listByVpnSiteWithServiceResponseAsync(final String resourceGroupName, final String vpnSiteName) {
        return listByVpnSiteSinglePageAsync(resourceGroupName, vpnSiteName)
            .concatMap(new Func1<ServiceResponse<Page<VpnSiteLinkInner>>, Observable<ServiceResponse<Page<VpnSiteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkInner>>> call(ServiceResponse<Page<VpnSiteLinkInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByVpnSiteNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
    ServiceResponse<PageImpl<VpnSiteLinkInner>> * @param resourceGroupName The resource group name of the VpnSite.
    ServiceResponse<PageImpl<VpnSiteLinkInner>> * @param vpnSiteName The name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;VpnSiteLinkInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<VpnSiteLinkInner>>> listByVpnSiteSinglePageAsync(final String resourceGroupName, final String vpnSiteName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vpnSiteName == null) {
            throw new IllegalArgumentException("Parameter vpnSiteName is required and cannot be null.");
        }
        final String apiVersion = "2020-05-01";
        return service.listByVpnSite(this.client.subscriptionId(), resourceGroupName, vpnSiteName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<VpnSiteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<VpnSiteLinkInner>> result = listByVpnSiteDelegate(response);
                        return Observable.just(new ServiceResponse<Page<VpnSiteLinkInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<VpnSiteLinkInner>> listByVpnSiteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<VpnSiteLinkInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<VpnSiteLinkInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;VpnSiteLinkInner&gt; object if successful.
     */
    public PagedList<VpnSiteLinkInner> listByVpnSiteNext(final String nextPageLink) {
        ServiceResponse<Page<VpnSiteLinkInner>> response = listByVpnSiteNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<VpnSiteLinkInner>(response.body()) {
            @Override
            public Page<VpnSiteLinkInner> nextPage(String nextPageLink) {
                return listByVpnSiteNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VpnSiteLinkInner>> listByVpnSiteNextAsync(final String nextPageLink, final ServiceFuture<List<VpnSiteLinkInner>> serviceFuture, final ListOperationCallback<VpnSiteLinkInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByVpnSiteNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<VpnSiteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkInner>>> call(String nextPageLink) {
                    return listByVpnSiteNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VpnSiteLinkInner&gt; object
     */
    public Observable<Page<VpnSiteLinkInner>> listByVpnSiteNextAsync(final String nextPageLink) {
        return listByVpnSiteNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<VpnSiteLinkInner>>, Page<VpnSiteLinkInner>>() {
                @Override
                public Page<VpnSiteLinkInner> call(ServiceResponse<Page<VpnSiteLinkInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VpnSiteLinkInner&gt; object
     */
    public Observable<ServiceResponse<Page<VpnSiteLinkInner>>> listByVpnSiteNextWithServiceResponseAsync(final String nextPageLink) {
        return listByVpnSiteNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<VpnSiteLinkInner>>, Observable<ServiceResponse<Page<VpnSiteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkInner>>> call(ServiceResponse<Page<VpnSiteLinkInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByVpnSiteNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
    ServiceResponse<PageImpl<VpnSiteLinkInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;VpnSiteLinkInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<VpnSiteLinkInner>>> listByVpnSiteNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByVpnSiteNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<VpnSiteLinkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VpnSiteLinkInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<VpnSiteLinkInner>> result = listByVpnSiteNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<VpnSiteLinkInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<VpnSiteLinkInner>> listByVpnSiteNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<VpnSiteLinkInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<VpnSiteLinkInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
