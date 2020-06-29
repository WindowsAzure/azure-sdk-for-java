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
 * in BgpServiceCommunities.
 */
public class BgpServiceCommunitiesInner {
    /** The Retrofit service to perform REST calls. */
    private BgpServiceCommunitiesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of BgpServiceCommunitiesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BgpServiceCommunitiesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(BgpServiceCommunitiesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BgpServiceCommunities to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BgpServiceCommunitiesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_05_01.BgpServiceCommunities list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/bgpServiceCommunities")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_05_01.BgpServiceCommunities listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all the available bgp service communities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;BgpServiceCommunityInner&gt; object if successful.
     */
    public PagedList<BgpServiceCommunityInner> list() {
        ServiceResponse<Page<BgpServiceCommunityInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<BgpServiceCommunityInner>(response.body()) {
            @Override
            public Page<BgpServiceCommunityInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the available bgp service communities.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BgpServiceCommunityInner>> listAsync(final ListOperationCallback<BgpServiceCommunityInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<BgpServiceCommunityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BgpServiceCommunityInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the available bgp service communities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BgpServiceCommunityInner&gt; object
     */
    public Observable<Page<BgpServiceCommunityInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<BgpServiceCommunityInner>>, Page<BgpServiceCommunityInner>>() {
                @Override
                public Page<BgpServiceCommunityInner> call(ServiceResponse<Page<BgpServiceCommunityInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the available bgp service communities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BgpServiceCommunityInner&gt; object
     */
    public Observable<ServiceResponse<Page<BgpServiceCommunityInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<BgpServiceCommunityInner>>, Observable<ServiceResponse<Page<BgpServiceCommunityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BgpServiceCommunityInner>>> call(ServiceResponse<Page<BgpServiceCommunityInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the available bgp service communities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;BgpServiceCommunityInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<BgpServiceCommunityInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-05-01";
        return service.list(this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<BgpServiceCommunityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BgpServiceCommunityInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<BgpServiceCommunityInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<BgpServiceCommunityInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<BgpServiceCommunityInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<BgpServiceCommunityInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<BgpServiceCommunityInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the available bgp service communities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;BgpServiceCommunityInner&gt; object if successful.
     */
    public PagedList<BgpServiceCommunityInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<BgpServiceCommunityInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<BgpServiceCommunityInner>(response.body()) {
            @Override
            public Page<BgpServiceCommunityInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the available bgp service communities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BgpServiceCommunityInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<BgpServiceCommunityInner>> serviceFuture, final ListOperationCallback<BgpServiceCommunityInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<BgpServiceCommunityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BgpServiceCommunityInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the available bgp service communities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BgpServiceCommunityInner&gt; object
     */
    public Observable<Page<BgpServiceCommunityInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<BgpServiceCommunityInner>>, Page<BgpServiceCommunityInner>>() {
                @Override
                public Page<BgpServiceCommunityInner> call(ServiceResponse<Page<BgpServiceCommunityInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the available bgp service communities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BgpServiceCommunityInner&gt; object
     */
    public Observable<ServiceResponse<Page<BgpServiceCommunityInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<BgpServiceCommunityInner>>, Observable<ServiceResponse<Page<BgpServiceCommunityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BgpServiceCommunityInner>>> call(ServiceResponse<Page<BgpServiceCommunityInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the available bgp service communities.
     *
    ServiceResponse<PageImpl<BgpServiceCommunityInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;BgpServiceCommunityInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<BgpServiceCommunityInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<BgpServiceCommunityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BgpServiceCommunityInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<BgpServiceCommunityInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<BgpServiceCommunityInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<BgpServiceCommunityInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<BgpServiceCommunityInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<BgpServiceCommunityInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
