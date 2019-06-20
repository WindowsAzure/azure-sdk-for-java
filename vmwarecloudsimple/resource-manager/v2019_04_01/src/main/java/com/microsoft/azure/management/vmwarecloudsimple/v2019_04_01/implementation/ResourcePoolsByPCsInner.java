/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.CSRPErrorException;
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
 * in ResourcePoolsByPCs.
 */
public class ResourcePoolsByPCsInner {
    /** The Retrofit service to perform REST calls. */
    private ResourcePoolsByPCsService service;
    /** The service client containing this operation class. */
    private VMwareCloudSimpleClientImpl client;

    /**
     * Initializes an instance of ResourcePoolsByPCsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ResourcePoolsByPCsInner(Retrofit retrofit, VMwareCloudSimpleClientImpl client) {
        this.service = retrofit.create(ResourcePoolsByPCsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ResourcePoolsByPCs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ResourcePoolsByPCsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.ResourcePoolsByPCs list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.VMwareCloudSimple/locations/{regionId}/privateClouds/{pcName}/resourcePools")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("regionId") String regionId, @Path("pcName") String pcName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.ResourcePoolsByPCs listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Implements get of resource pools list.
     * Returns list of resource pools in region for private cloud.
     *
     * @param pcName The private cloud name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CSRPErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ResourcePoolInner&gt; object if successful.
     */
    public PagedList<ResourcePoolInner> list(final String pcName) {
        ServiceResponse<Page<ResourcePoolInner>> response = listSinglePageAsync(pcName).toBlocking().single();
        return new PagedList<ResourcePoolInner>(response.body()) {
            @Override
            public Page<ResourcePoolInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Implements get of resource pools list.
     * Returns list of resource pools in region for private cloud.
     *
     * @param pcName The private cloud name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ResourcePoolInner>> listAsync(final String pcName, final ListOperationCallback<ResourcePoolInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(pcName),
            new Func1<String, Observable<ServiceResponse<Page<ResourcePoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourcePoolInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Implements get of resource pools list.
     * Returns list of resource pools in region for private cloud.
     *
     * @param pcName The private cloud name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourcePoolInner&gt; object
     */
    public Observable<Page<ResourcePoolInner>> listAsync(final String pcName) {
        return listWithServiceResponseAsync(pcName)
            .map(new Func1<ServiceResponse<Page<ResourcePoolInner>>, Page<ResourcePoolInner>>() {
                @Override
                public Page<ResourcePoolInner> call(ServiceResponse<Page<ResourcePoolInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Implements get of resource pools list.
     * Returns list of resource pools in region for private cloud.
     *
     * @param pcName The private cloud name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourcePoolInner&gt; object
     */
    public Observable<ServiceResponse<Page<ResourcePoolInner>>> listWithServiceResponseAsync(final String pcName) {
        return listSinglePageAsync(pcName)
            .concatMap(new Func1<ServiceResponse<Page<ResourcePoolInner>>, Observable<ServiceResponse<Page<ResourcePoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourcePoolInner>>> call(ServiceResponse<Page<ResourcePoolInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Implements get of resource pools list.
     * Returns list of resource pools in region for private cloud.
     *
    ServiceResponse<PageImpl<ResourcePoolInner>> * @param pcName The private cloud name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ResourcePoolInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ResourcePoolInner>>> listSinglePageAsync(final String pcName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.regionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.regionId() is required and cannot be null.");
        }
        if (pcName == null) {
            throw new IllegalArgumentException("Parameter pcName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.regionId(), pcName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ResourcePoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourcePoolInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ResourcePoolInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ResourcePoolInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ResourcePoolInner>> listDelegate(Response<ResponseBody> response) throws CSRPErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ResourcePoolInner>, CSRPErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ResourcePoolInner>>() { }.getType())
                .registerError(CSRPErrorException.class)
                .build(response);
    }

    /**
     * Implements get of resource pools list.
     * Returns list of resource pools in region for private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CSRPErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ResourcePoolInner&gt; object if successful.
     */
    public PagedList<ResourcePoolInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ResourcePoolInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ResourcePoolInner>(response.body()) {
            @Override
            public Page<ResourcePoolInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Implements get of resource pools list.
     * Returns list of resource pools in region for private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ResourcePoolInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ResourcePoolInner>> serviceFuture, final ListOperationCallback<ResourcePoolInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ResourcePoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourcePoolInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Implements get of resource pools list.
     * Returns list of resource pools in region for private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourcePoolInner&gt; object
     */
    public Observable<Page<ResourcePoolInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ResourcePoolInner>>, Page<ResourcePoolInner>>() {
                @Override
                public Page<ResourcePoolInner> call(ServiceResponse<Page<ResourcePoolInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Implements get of resource pools list.
     * Returns list of resource pools in region for private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourcePoolInner&gt; object
     */
    public Observable<ServiceResponse<Page<ResourcePoolInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ResourcePoolInner>>, Observable<ServiceResponse<Page<ResourcePoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourcePoolInner>>> call(ServiceResponse<Page<ResourcePoolInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Implements get of resource pools list.
     * Returns list of resource pools in region for private cloud.
     *
    ServiceResponse<PageImpl<ResourcePoolInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ResourcePoolInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ResourcePoolInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ResourcePoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourcePoolInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ResourcePoolInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ResourcePoolInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ResourcePoolInner>> listNextDelegate(Response<ResponseBody> response) throws CSRPErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ResourcePoolInner>, CSRPErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ResourcePoolInner>>() { }.getType())
                .registerError(CSRPErrorException.class)
                .build(response);
    }

}
