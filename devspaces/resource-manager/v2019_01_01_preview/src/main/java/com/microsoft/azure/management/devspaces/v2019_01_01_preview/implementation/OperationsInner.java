/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devspaces.v2019_01_01_preview.implementation;

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
    private DevSpacesManagementClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, DevSpacesManagementClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.devspaces.v2019_01_01_preview.Operations list" })
        @GET("providers/Microsoft.DevSpaces/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.devspaces.v2019_01_01_preview.Operations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists operations for the resource provider.
     * Lists all the supported operations by the Microsoft.DevSpaces resource provider along with their description.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ResourceProviderOperationDefinitionInner&gt; object if successful.
     */
    public PagedList<ResourceProviderOperationDefinitionInner> list() {
        ServiceResponse<Page<ResourceProviderOperationDefinitionInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<ResourceProviderOperationDefinitionInner>(response.body()) {
            @Override
            public Page<ResourceProviderOperationDefinitionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists operations for the resource provider.
     * Lists all the supported operations by the Microsoft.DevSpaces resource provider along with their description.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ResourceProviderOperationDefinitionInner>> listAsync(final ListOperationCallback<ResourceProviderOperationDefinitionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists operations for the resource provider.
     * Lists all the supported operations by the Microsoft.DevSpaces resource provider along with their description.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourceProviderOperationDefinitionInner&gt; object
     */
    public Observable<Page<ResourceProviderOperationDefinitionInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>, Page<ResourceProviderOperationDefinitionInner>>() {
                @Override
                public Page<ResourceProviderOperationDefinitionInner> call(ServiceResponse<Page<ResourceProviderOperationDefinitionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists operations for the resource provider.
     * Lists all the supported operations by the Microsoft.DevSpaces resource provider along with their description.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourceProviderOperationDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>, Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>> call(ServiceResponse<Page<ResourceProviderOperationDefinitionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists operations for the resource provider.
     * Lists all the supported operations by the Microsoft.DevSpaces resource provider along with their description.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ResourceProviderOperationDefinitionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ResourceProviderOperationDefinitionInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ResourceProviderOperationDefinitionInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ResourceProviderOperationDefinitionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ResourceProviderOperationDefinitionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists operations for the resource provider.
     * Lists all the supported operations by the Microsoft.DevSpaces resource provider along with their description.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ResourceProviderOperationDefinitionInner&gt; object if successful.
     */
    public PagedList<ResourceProviderOperationDefinitionInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ResourceProviderOperationDefinitionInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ResourceProviderOperationDefinitionInner>(response.body()) {
            @Override
            public Page<ResourceProviderOperationDefinitionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists operations for the resource provider.
     * Lists all the supported operations by the Microsoft.DevSpaces resource provider along with their description.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ResourceProviderOperationDefinitionInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ResourceProviderOperationDefinitionInner>> serviceFuture, final ListOperationCallback<ResourceProviderOperationDefinitionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists operations for the resource provider.
     * Lists all the supported operations by the Microsoft.DevSpaces resource provider along with their description.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourceProviderOperationDefinitionInner&gt; object
     */
    public Observable<Page<ResourceProviderOperationDefinitionInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>, Page<ResourceProviderOperationDefinitionInner>>() {
                @Override
                public Page<ResourceProviderOperationDefinitionInner> call(ServiceResponse<Page<ResourceProviderOperationDefinitionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists operations for the resource provider.
     * Lists all the supported operations by the Microsoft.DevSpaces resource provider along with their description.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourceProviderOperationDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>, Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>> call(ServiceResponse<Page<ResourceProviderOperationDefinitionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists operations for the resource provider.
     * Lists all the supported operations by the Microsoft.DevSpaces resource provider along with their description.
     *
    ServiceResponse<PageImpl<ResourceProviderOperationDefinitionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ResourceProviderOperationDefinitionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ResourceProviderOperationDefinitionInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ResourceProviderOperationDefinitionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ResourceProviderOperationDefinitionInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ResourceProviderOperationDefinitionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ResourceProviderOperationDefinitionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
