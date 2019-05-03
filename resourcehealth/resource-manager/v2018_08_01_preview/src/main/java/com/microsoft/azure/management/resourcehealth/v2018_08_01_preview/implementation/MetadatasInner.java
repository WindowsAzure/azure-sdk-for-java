/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.implementation;

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
 * in Metadatas.
 */
public class MetadatasInner {
    /** The Retrofit service to perform REST calls. */
    private MetadatasService service;
    /** The service client containing this operation class. */
    private MicrosoftResourceHealthImpl client;

    /**
     * Initializes an instance of MetadatasInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MetadatasInner(Retrofit retrofit, MicrosoftResourceHealthImpl client) {
        this.service = retrofit.create(MetadatasService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Metadatas to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MetadatasService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.Metadatas get" })
        @GET("providers/Microsoft.ResourceHealth/metadata/{name}")
        Observable<Response<ResponseBody>> get(@Path("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.Metadatas list" })
        @GET("providers/Microsoft.ResourceHealth/metadata")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.Metadatas listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the metadata entity.
     *
     * @param name Name of metadata entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object get(String name) {
        return getWithServiceResponseAsync(name).toBlocking().single().body();
    }

    /**
     * Gets the metadata entity.
     *
     * @param name Name of metadata entity.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAsync(String name, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(name), serviceCallback);
    }

    /**
     * Gets the metadata entity.
     *
     * @param name Name of metadata entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAsync(String name) {
        return getWithServiceResponseAsync(name).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the metadata entity.
     *
     * @param name Name of metadata entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(name, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MetadataEntityInner>() { }.getType())
                .register(404, new TypeToken<ErrorResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the list of metadata entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;MetadataEntityInner&gt; object if successful.
     */
    public PagedList<MetadataEntityInner> list() {
        ServiceResponse<Page<MetadataEntityInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<MetadataEntityInner>(response.body()) {
            @Override
            public Page<MetadataEntityInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the list of metadata entities.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MetadataEntityInner>> listAsync(final ListOperationCallback<MetadataEntityInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<MetadataEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MetadataEntityInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the list of metadata entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;MetadataEntityInner&gt; object
     */
    public Observable<Page<MetadataEntityInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<MetadataEntityInner>>, Page<MetadataEntityInner>>() {
                @Override
                public Page<MetadataEntityInner> call(ServiceResponse<Page<MetadataEntityInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the list of metadata entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;MetadataEntityInner&gt; object
     */
    public Observable<ServiceResponse<Page<MetadataEntityInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<MetadataEntityInner>>, Observable<ServiceResponse<Page<MetadataEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MetadataEntityInner>>> call(ServiceResponse<Page<MetadataEntityInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the list of metadata entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;MetadataEntityInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<MetadataEntityInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<MetadataEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MetadataEntityInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<MetadataEntityInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<MetadataEntityInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<MetadataEntityInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<MetadataEntityInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<MetadataEntityInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the list of metadata entities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;MetadataEntityInner&gt; object if successful.
     */
    public PagedList<MetadataEntityInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<MetadataEntityInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<MetadataEntityInner>(response.body()) {
            @Override
            public Page<MetadataEntityInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the list of metadata entities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MetadataEntityInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<MetadataEntityInner>> serviceFuture, final ListOperationCallback<MetadataEntityInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<MetadataEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MetadataEntityInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the list of metadata entities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;MetadataEntityInner&gt; object
     */
    public Observable<Page<MetadataEntityInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<MetadataEntityInner>>, Page<MetadataEntityInner>>() {
                @Override
                public Page<MetadataEntityInner> call(ServiceResponse<Page<MetadataEntityInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the list of metadata entities.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;MetadataEntityInner&gt; object
     */
    public Observable<ServiceResponse<Page<MetadataEntityInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<MetadataEntityInner>>, Observable<ServiceResponse<Page<MetadataEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MetadataEntityInner>>> call(ServiceResponse<Page<MetadataEntityInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the list of metadata entities.
     *
    ServiceResponse<PageImpl<MetadataEntityInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;MetadataEntityInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<MetadataEntityInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<MetadataEntityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MetadataEntityInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<MetadataEntityInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<MetadataEntityInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<MetadataEntityInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<MetadataEntityInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<MetadataEntityInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
