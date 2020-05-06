/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.windowsiot.v2018_02_16_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.windowsiot.v2018_02_16_preview.ErrorDetailsException;
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
    private DeviceServicesImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, DeviceServicesImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.windowsiot.v2018_02_16_preview.Operations list" })
        @GET("providers/Microsoft.WindowsIoT/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.windowsiot.v2018_02_16_preview.Operations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all of the available Windows IoT Services REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorDetailsException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationEntityInner&gt; object if successful.
     */
    public PagedList<OperationEntityInner> list() {
        ServiceResponse<Page<OperationEntityInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<OperationEntityInner>(response.body()) {
            @Override
            public Page<OperationEntityInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the available Windows IoT Services REST API operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationEntityInner>> listAsync(final ListOperationCallback<OperationEntityInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<OperationEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationEntityInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the available Windows IoT Services REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationEntityInner&gt; object
     */
    public Observable<Page<OperationEntityInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<OperationEntityInner>>, Page<OperationEntityInner>>() {
                @Override
                public Page<OperationEntityInner> call(ServiceResponse<Page<OperationEntityInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the available Windows IoT Services REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationEntityInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationEntityInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<OperationEntityInner>>, Observable<ServiceResponse<Page<OperationEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationEntityInner>>> call(ServiceResponse<Page<OperationEntityInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the available Windows IoT Services REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationEntityInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationEntityInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationEntityInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationEntityInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationEntityInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationEntityInner>> listDelegate(Response<ResponseBody> response) throws ErrorDetailsException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationEntityInner>, ErrorDetailsException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationEntityInner>>() { }.getType())
                .registerError(ErrorDetailsException.class)
                .build(response);
    }

    /**
     * Lists all of the available Windows IoT Services REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorDetailsException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationEntityInner&gt; object if successful.
     */
    public PagedList<OperationEntityInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<OperationEntityInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<OperationEntityInner>(response.body()) {
            @Override
            public Page<OperationEntityInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the available Windows IoT Services REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationEntityInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<OperationEntityInner>> serviceFuture, final ListOperationCallback<OperationEntityInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<OperationEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationEntityInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the available Windows IoT Services REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationEntityInner&gt; object
     */
    public Observable<Page<OperationEntityInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<OperationEntityInner>>, Page<OperationEntityInner>>() {
                @Override
                public Page<OperationEntityInner> call(ServiceResponse<Page<OperationEntityInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the available Windows IoT Services REST API operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationEntityInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationEntityInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<OperationEntityInner>>, Observable<ServiceResponse<Page<OperationEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationEntityInner>>> call(ServiceResponse<Page<OperationEntityInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the available Windows IoT Services REST API operations.
     *
    ServiceResponse<PageImpl<OperationEntityInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationEntityInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationEntityInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationEntityInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationEntityInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationEntityInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationEntityInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorDetailsException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationEntityInner>, ErrorDetailsException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationEntityInner>>() { }.getType())
                .registerError(ErrorDetailsException.class)
                .build(response);
    }

}
