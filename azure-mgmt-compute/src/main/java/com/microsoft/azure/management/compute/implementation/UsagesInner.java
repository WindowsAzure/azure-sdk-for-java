/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceCall;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCall;
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
 * in Usages.
 */
public final class UsagesInner {
    /** The Retrofit service to perform REST calls. */
    private UsagesService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of UsagesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UsagesInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(UsagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Usages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UsagesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/usages")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{nextLink}")
        Observable<Response<ResponseBody>> listNext(@Path(value = "nextLink", encoded = true) String nextPageLink, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists compute usages for a subscription.
     *
     * @param location The location upon which resource usage is queried.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PagedList&lt;UsageInner&gt; object if successful.
     */
    public PagedList<UsageInner> list(final String location) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<UsageInner>> response = listSinglePageAsync(location).toBlocking().single();
        return new PagedList<UsageInner>(response.getBody()) {
            @Override
            public Page<UsageInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
    }

    /**
     * Lists compute usages for a subscription.
     *
     * @param location The location upon which resource usage is queried.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<UsageInner>> listAsync(final String location, final ListOperationCallback<UsageInner> serviceCallback) {
        return AzureServiceCall.create(
            listSinglePageAsync(location),
            new Func1<String, Observable<ServiceResponse<Page<UsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists compute usages for a subscription.
     *
     * @param location The location upon which resource usage is queried.
     * @return the observable to the PagedList&lt;UsageInner&gt; object
     */
    public Observable<Page<UsageInner>> listAsync(final String location) {
        return listWithServiceResponseAsync(location)
            .map(new Func1<ServiceResponse<Page<UsageInner>>, Page<UsageInner>>() {
                @Override
                public Page<UsageInner> call(ServiceResponse<Page<UsageInner>> response) {
                    return response.getBody();
                }
            });
    }

    /**
     * Lists compute usages for a subscription.
     *
     * @param location The location upon which resource usage is queried.
     * @return the observable to the PagedList&lt;UsageInner&gt; object
     */
    public Observable<ServiceResponse<Page<UsageInner>>> listWithServiceResponseAsync(final String location) {
        return listSinglePageAsync(location)
            .concatMap(new Func1<ServiceResponse<Page<UsageInner>>, Observable<ServiceResponse<Page<UsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageInner>>> call(ServiceResponse<Page<UsageInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists compute usages for a subscription.
     *
    ServiceResponse<PageImpl1<UsageInner>> * @param location The location upon which resource usage is queried.
     * @return the PagedList&lt;UsageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<UsageInner>>> listSinglePageAsync(final String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(location, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<UsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<UsageInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<UsageInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<UsageInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl1<UsageInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl1<UsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists compute usages for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PagedList&lt;UsageInner&gt; object if successful.
     */
    public PagedList<UsageInner> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<UsageInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<UsageInner>(response.getBody()) {
            @Override
            public Page<UsageInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
    }

    /**
     * Lists compute usages for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<UsageInner>> listNextAsync(final String nextPageLink, final ServiceCall<List<UsageInner>> serviceCall, final ListOperationCallback<UsageInner> serviceCallback) {
        return AzureServiceCall.create(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<UsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists compute usages for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the PagedList&lt;UsageInner&gt; object
     */
    public Observable<Page<UsageInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<UsageInner>>, Page<UsageInner>>() {
                @Override
                public Page<UsageInner> call(ServiceResponse<Page<UsageInner>> response) {
                    return response.getBody();
                }
            });
    }

    /**
     * Lists compute usages for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the PagedList&lt;UsageInner&gt; object
     */
    public Observable<ServiceResponse<Page<UsageInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<UsageInner>>, Observable<ServiceResponse<Page<UsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageInner>>> call(ServiceResponse<Page<UsageInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists compute usages for a subscription.
     *
    ServiceResponse<PageImpl1<UsageInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PagedList&lt;UsageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<UsageInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        return service.listNext(nextPageLink, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<UsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<UsageInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<UsageInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<UsageInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl1<UsageInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl1<UsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
