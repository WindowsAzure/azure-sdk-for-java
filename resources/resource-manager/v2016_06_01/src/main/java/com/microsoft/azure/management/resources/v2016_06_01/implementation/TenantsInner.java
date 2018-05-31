/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_06_01.implementation;

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
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Tenants.
 */
public class TenantsInner {
    /** The Retrofit service to perform REST calls. */
    private TenantsService service;
    /** The service client containing this operation class. */
    private SubscriptionClientImpl client;

    /**
     * Initializes an instance of TenantsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TenantsInner(Retrofit retrofit, SubscriptionClientImpl client) {
        this.service = retrofit.create(TenantsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Tenants to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TenantsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2016_06_01.Tenants list" })
        @GET("tenants")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2016_06_01.Tenants listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the tenants for your account.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TenantIdDescriptionInner&gt; object if successful.
     */
    public PagedList<TenantIdDescriptionInner> list() {
        ServiceResponse<Page<TenantIdDescriptionInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<TenantIdDescriptionInner>(response.body()) {
            @Override
            public Page<TenantIdDescriptionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the tenants for your account.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<TenantIdDescriptionInner>> listAsync(final ListOperationCallback<TenantIdDescriptionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the tenants for your account.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TenantIdDescriptionInner&gt; object
     */
    public Observable<Page<TenantIdDescriptionInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<TenantIdDescriptionInner>>, Page<TenantIdDescriptionInner>>() {
                @Override
                public Page<TenantIdDescriptionInner> call(ServiceResponse<Page<TenantIdDescriptionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the tenants for your account.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TenantIdDescriptionInner&gt; object
     */
    public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<TenantIdDescriptionInner>>, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(ServiceResponse<Page<TenantIdDescriptionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the tenants for your account.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;TenantIdDescriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<TenantIdDescriptionInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<TenantIdDescriptionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<TenantIdDescriptionInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<TenantIdDescriptionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<TenantIdDescriptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the tenants for your account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TenantIdDescriptionInner&gt; object if successful.
     */
    public PagedList<TenantIdDescriptionInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<TenantIdDescriptionInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<TenantIdDescriptionInner>(response.body()) {
            @Override
            public Page<TenantIdDescriptionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the tenants for your account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<TenantIdDescriptionInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<TenantIdDescriptionInner>> serviceFuture, final ListOperationCallback<TenantIdDescriptionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the tenants for your account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TenantIdDescriptionInner&gt; object
     */
    public Observable<Page<TenantIdDescriptionInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<TenantIdDescriptionInner>>, Page<TenantIdDescriptionInner>>() {
                @Override
                public Page<TenantIdDescriptionInner> call(ServiceResponse<Page<TenantIdDescriptionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the tenants for your account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TenantIdDescriptionInner&gt; object
     */
    public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<TenantIdDescriptionInner>>, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(ServiceResponse<Page<TenantIdDescriptionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the tenants for your account.
     *
    ServiceResponse<PageImpl1<TenantIdDescriptionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;TenantIdDescriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<TenantIdDescriptionInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<TenantIdDescriptionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<TenantIdDescriptionInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<TenantIdDescriptionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<TenantIdDescriptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
