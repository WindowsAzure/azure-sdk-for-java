/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.servicefabricmesh.ErrorModelException;
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
    private ServiceFabricMeshManagementClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, ServiceFabricMeshManagementClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabricmesh.Operations list" })
        @GET("providers/Microsoft.ServiceFabricMesh/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabricmesh.Operations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all of the available operations.
     * Lists all the available operations provided by Service Fabric SeaBreeze resource provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationResultInner&gt; object if successful.
     */
    public PagedList<OperationResultInner> list() {
        ServiceResponse<Page<OperationResultInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<OperationResultInner>(response.body()) {
            @Override
            public Page<OperationResultInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the available operations.
     * Lists all the available operations provided by Service Fabric SeaBreeze resource provider.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationResultInner>> listAsync(final ListOperationCallback<OperationResultInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<OperationResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationResultInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the available operations.
     * Lists all the available operations provided by Service Fabric SeaBreeze resource provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationResultInner&gt; object
     */
    public Observable<Page<OperationResultInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<OperationResultInner>>, Page<OperationResultInner>>() {
                @Override
                public Page<OperationResultInner> call(ServiceResponse<Page<OperationResultInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the available operations.
     * Lists all the available operations provided by Service Fabric SeaBreeze resource provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationResultInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationResultInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<OperationResultInner>>, Observable<ServiceResponse<Page<OperationResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationResultInner>>> call(ServiceResponse<Page<OperationResultInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the available operations.
     * Lists all the available operations provided by Service Fabric SeaBreeze resource provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationResultInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationResultInner>>> listSinglePageAsync() {
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationResultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationResultInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationResultInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationResultInner>> listDelegate(Response<ResponseBody> response) throws ErrorModelException, IOException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationResultInner>, ErrorModelException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationResultInner>>() { }.getType())
                .registerError(ErrorModelException.class)
                .build(response);
    }

    /**
     * Lists all of the available operations.
     * Lists all the available operations provided by Service Fabric SeaBreeze resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationResultInner&gt; object if successful.
     */
    public PagedList<OperationResultInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<OperationResultInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<OperationResultInner>(response.body()) {
            @Override
            public Page<OperationResultInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the available operations.
     * Lists all the available operations provided by Service Fabric SeaBreeze resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationResultInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<OperationResultInner>> serviceFuture, final ListOperationCallback<OperationResultInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<OperationResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationResultInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the available operations.
     * Lists all the available operations provided by Service Fabric SeaBreeze resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationResultInner&gt; object
     */
    public Observable<Page<OperationResultInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<OperationResultInner>>, Page<OperationResultInner>>() {
                @Override
                public Page<OperationResultInner> call(ServiceResponse<Page<OperationResultInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the available operations.
     * Lists all the available operations provided by Service Fabric SeaBreeze resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationResultInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationResultInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<OperationResultInner>>, Observable<ServiceResponse<Page<OperationResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationResultInner>>> call(ServiceResponse<Page<OperationResultInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the available operations.
     * Lists all the available operations provided by Service Fabric SeaBreeze resource provider.
     *
    ServiceResponse<PageImpl<OperationResultInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationResultInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationResultInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationResultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationResultInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationResultInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationResultInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorModelException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationResultInner>, ErrorModelException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationResultInner>>() { }.getType())
                .registerError(ErrorModelException.class)
                .build(response);
    }

}
