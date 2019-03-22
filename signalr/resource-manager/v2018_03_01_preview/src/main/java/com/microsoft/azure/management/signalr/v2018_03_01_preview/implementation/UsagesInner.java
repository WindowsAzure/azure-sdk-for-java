/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview.implementation;

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
 * in Usages.
 */
public class UsagesInner {
    /** The Retrofit service to perform REST calls. */
    private UsagesService service;
    /** The service client containing this operation class. */
    private SignalRManagementClientImpl client;

    /**
     * Initializes an instance of UsagesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UsagesInner(Retrofit retrofit, SignalRManagementClientImpl client) {
        this.service = retrofit.create(UsagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Usages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UsagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.signalr.v2018_03_01_preview.Usages list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.SignalRService/locations/{location}/usages")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.signalr.v2018_03_01_preview.Usages listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List usage quotas for Azure SignalR service by location.
     *
     * @param location the location like "eastus"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SignalRUsageInner&gt; object if successful.
     */
    public PagedList<SignalRUsageInner> list(final String location) {
        ServiceResponse<Page<SignalRUsageInner>> response = listSinglePageAsync(location).toBlocking().single();
        return new PagedList<SignalRUsageInner>(response.body()) {
            @Override
            public Page<SignalRUsageInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List usage quotas for Azure SignalR service by location.
     *
     * @param location the location like "eastus"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SignalRUsageInner>> listAsync(final String location, final ListOperationCallback<SignalRUsageInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(location),
            new Func1<String, Observable<ServiceResponse<Page<SignalRUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SignalRUsageInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List usage quotas for Azure SignalR service by location.
     *
     * @param location the location like "eastus"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SignalRUsageInner&gt; object
     */
    public Observable<Page<SignalRUsageInner>> listAsync(final String location) {
        return listWithServiceResponseAsync(location)
            .map(new Func1<ServiceResponse<Page<SignalRUsageInner>>, Page<SignalRUsageInner>>() {
                @Override
                public Page<SignalRUsageInner> call(ServiceResponse<Page<SignalRUsageInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List usage quotas for Azure SignalR service by location.
     *
     * @param location the location like "eastus"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SignalRUsageInner&gt; object
     */
    public Observable<ServiceResponse<Page<SignalRUsageInner>>> listWithServiceResponseAsync(final String location) {
        return listSinglePageAsync(location)
            .concatMap(new Func1<ServiceResponse<Page<SignalRUsageInner>>, Observable<ServiceResponse<Page<SignalRUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SignalRUsageInner>>> call(ServiceResponse<Page<SignalRUsageInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List usage quotas for Azure SignalR service by location.
     *
    ServiceResponse<PageImpl<SignalRUsageInner>> * @param location the location like "eastus"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SignalRUsageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SignalRUsageInner>>> listSinglePageAsync(final String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.list(location, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SignalRUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SignalRUsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SignalRUsageInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SignalRUsageInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SignalRUsageInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SignalRUsageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SignalRUsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List usage quotas for Azure SignalR service by location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SignalRUsageInner&gt; object if successful.
     */
    public PagedList<SignalRUsageInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<SignalRUsageInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<SignalRUsageInner>(response.body()) {
            @Override
            public Page<SignalRUsageInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List usage quotas for Azure SignalR service by location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SignalRUsageInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<SignalRUsageInner>> serviceFuture, final ListOperationCallback<SignalRUsageInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SignalRUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SignalRUsageInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List usage quotas for Azure SignalR service by location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SignalRUsageInner&gt; object
     */
    public Observable<Page<SignalRUsageInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<SignalRUsageInner>>, Page<SignalRUsageInner>>() {
                @Override
                public Page<SignalRUsageInner> call(ServiceResponse<Page<SignalRUsageInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List usage quotas for Azure SignalR service by location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SignalRUsageInner&gt; object
     */
    public Observable<ServiceResponse<Page<SignalRUsageInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SignalRUsageInner>>, Observable<ServiceResponse<Page<SignalRUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SignalRUsageInner>>> call(ServiceResponse<Page<SignalRUsageInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List usage quotas for Azure SignalR service by location.
     *
    ServiceResponse<PageImpl<SignalRUsageInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SignalRUsageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SignalRUsageInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SignalRUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SignalRUsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SignalRUsageInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SignalRUsageInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SignalRUsageInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SignalRUsageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SignalRUsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
