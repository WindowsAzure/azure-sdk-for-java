/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_06_01.implementation;

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
    private SubscriptionClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, SubscriptionClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2018_06_01.Operations list" })
        @GET("providers/Microsoft.Resources/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2018_06_01.Operations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all of the available Microsoft.Resources REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationInner&gt; object if successful.
     */
    public PagedList<OperationInner> list() {
        ServiceResponse<Page<OperationInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<OperationInner>(response.body()) {
            @Override
            public Page<OperationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the available Microsoft.Resources REST API operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationInner>> listAsync(final ListOperationCallback<OperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the available Microsoft.Resources REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<Page<OperationInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<OperationInner>>, Page<OperationInner>>() {
                @Override
                public Page<OperationInner> call(ServiceResponse<Page<OperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the available Microsoft.Resources REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<OperationInner>>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(ServiceResponse<Page<OperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the available Microsoft.Resources REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all of the available Microsoft.Resources REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationInner&gt; object if successful.
     */
    public PagedList<OperationInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<OperationInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<OperationInner>(response.body()) {
            @Override
            public Page<OperationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the available Microsoft.Resources REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<OperationInner>> serviceFuture, final ListOperationCallback<OperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the available Microsoft.Resources REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<Page<OperationInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<OperationInner>>, Page<OperationInner>>() {
                @Override
                public Page<OperationInner> call(ServiceResponse<Page<OperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the available Microsoft.Resources REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<OperationInner>>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(ServiceResponse<Page<OperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the available Microsoft.Resources REST API operations.
     *
    ServiceResponse<PageImpl<OperationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
