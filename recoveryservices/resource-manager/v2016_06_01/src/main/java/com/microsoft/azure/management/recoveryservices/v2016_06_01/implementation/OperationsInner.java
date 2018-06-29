/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation;

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
 * in Operations.
 */
public class OperationsInner {
    /** The Retrofit service to perform REST calls. */
    private OperationsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, RecoveryServicesClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.v2016_06_01.Operations list" })
        @GET("providers/Microsoft.RecoveryServices/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.v2016_06_01.Operations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns the list of available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ClientDiscoveryValueForSingleApiInner&gt; object if successful.
     */
    public PagedList<ClientDiscoveryValueForSingleApiInner> list() {
        ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<ClientDiscoveryValueForSingleApiInner>(response.body()) {
            @Override
            public Page<ClientDiscoveryValueForSingleApiInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Returns the list of available operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ClientDiscoveryValueForSingleApiInner>> listAsync(final ListOperationCallback<ClientDiscoveryValueForSingleApiInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Returns the list of available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClientDiscoveryValueForSingleApiInner&gt; object
     */
    public Observable<Page<ClientDiscoveryValueForSingleApiInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>, Page<ClientDiscoveryValueForSingleApiInner>>() {
                @Override
                public Page<ClientDiscoveryValueForSingleApiInner> call(ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Returns the list of available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClientDiscoveryValueForSingleApiInner&gt; object
     */
    public Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>, Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>> call(ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Returns the list of available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ClientDiscoveryValueForSingleApiInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ClientDiscoveryValueForSingleApiInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ClientDiscoveryValueForSingleApiInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<ClientDiscoveryValueForSingleApiInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<ClientDiscoveryValueForSingleApiInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns the list of available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ClientDiscoveryValueForSingleApiInner&gt; object if successful.
     */
    public PagedList<ClientDiscoveryValueForSingleApiInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ClientDiscoveryValueForSingleApiInner>(response.body()) {
            @Override
            public Page<ClientDiscoveryValueForSingleApiInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Returns the list of available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ClientDiscoveryValueForSingleApiInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ClientDiscoveryValueForSingleApiInner>> serviceFuture, final ListOperationCallback<ClientDiscoveryValueForSingleApiInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Returns the list of available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClientDiscoveryValueForSingleApiInner&gt; object
     */
    public Observable<Page<ClientDiscoveryValueForSingleApiInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>, Page<ClientDiscoveryValueForSingleApiInner>>() {
                @Override
                public Page<ClientDiscoveryValueForSingleApiInner> call(ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Returns the list of available operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClientDiscoveryValueForSingleApiInner&gt; object
     */
    public Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>, Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>> call(ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Returns the list of available operations.
     *
    ServiceResponse<PageImpl1<ClientDiscoveryValueForSingleApiInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ClientDiscoveryValueForSingleApiInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ClientDiscoveryValueForSingleApiInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ClientDiscoveryValueForSingleApiInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ClientDiscoveryValueForSingleApiInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<ClientDiscoveryValueForSingleApiInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<ClientDiscoveryValueForSingleApiInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
