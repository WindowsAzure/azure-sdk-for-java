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
 * in SkusAvailabilityWithinRegions.
 */
public class SkusAvailabilityWithinRegionsInner {
    /** The Retrofit service to perform REST calls. */
    private SkusAvailabilityWithinRegionsService service;
    /** The service client containing this operation class. */
    private VMwareCloudSimpleClientImpl client;

    /**
     * Initializes an instance of SkusAvailabilityWithinRegionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SkusAvailabilityWithinRegionsInner(Retrofit retrofit, VMwareCloudSimpleClientImpl client) {
        this.service = retrofit.create(SkusAvailabilityWithinRegionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SkusAvailabilityWithinRegions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SkusAvailabilityWithinRegionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.SkusAvailabilityWithinRegions list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.VMwareCloudSimple/locations/{regionId}/availabilities")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("regionId") String regionId, @Query("skuId") String skuId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.SkusAvailabilityWithinRegions listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CSRPErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SkuAvailabilityInner&gt; object if successful.
     */
    public PagedList<SkuAvailabilityInner> list() {
        ServiceResponse<Page<SkuAvailabilityInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<SkuAvailabilityInner>(response.body()) {
            @Override
            public Page<SkuAvailabilityInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SkuAvailabilityInner>> listAsync(final ListOperationCallback<SkuAvailabilityInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<SkuAvailabilityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SkuAvailabilityInner&gt; object
     */
    public Observable<Page<SkuAvailabilityInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<SkuAvailabilityInner>>, Page<SkuAvailabilityInner>>() {
                @Override
                public Page<SkuAvailabilityInner> call(ServiceResponse<Page<SkuAvailabilityInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SkuAvailabilityInner&gt; object
     */
    public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<SkuAvailabilityInner>>, Observable<ServiceResponse<Page<SkuAvailabilityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> call(ServiceResponse<Page<SkuAvailabilityInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SkuAvailabilityInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.regionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.regionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String skuId = null;
        return service.list(this.client.subscriptionId(), this.client.regionId(), skuId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SkuAvailabilityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SkuAvailabilityInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SkuAvailabilityInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @param skuId sku id, if no sku is passed availability for all skus will be returned
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CSRPErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SkuAvailabilityInner&gt; object if successful.
     */
    public PagedList<SkuAvailabilityInner> list(final String skuId) {
        ServiceResponse<Page<SkuAvailabilityInner>> response = listSinglePageAsync(skuId).toBlocking().single();
        return new PagedList<SkuAvailabilityInner>(response.body()) {
            @Override
            public Page<SkuAvailabilityInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @param skuId sku id, if no sku is passed availability for all skus will be returned
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SkuAvailabilityInner>> listAsync(final String skuId, final ListOperationCallback<SkuAvailabilityInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(skuId),
            new Func1<String, Observable<ServiceResponse<Page<SkuAvailabilityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @param skuId sku id, if no sku is passed availability for all skus will be returned
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SkuAvailabilityInner&gt; object
     */
    public Observable<Page<SkuAvailabilityInner>> listAsync(final String skuId) {
        return listWithServiceResponseAsync(skuId)
            .map(new Func1<ServiceResponse<Page<SkuAvailabilityInner>>, Page<SkuAvailabilityInner>>() {
                @Override
                public Page<SkuAvailabilityInner> call(ServiceResponse<Page<SkuAvailabilityInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @param skuId sku id, if no sku is passed availability for all skus will be returned
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SkuAvailabilityInner&gt; object
     */
    public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> listWithServiceResponseAsync(final String skuId) {
        return listSinglePageAsync(skuId)
            .concatMap(new Func1<ServiceResponse<Page<SkuAvailabilityInner>>, Observable<ServiceResponse<Page<SkuAvailabilityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> call(ServiceResponse<Page<SkuAvailabilityInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
    ServiceResponse<PageImpl<SkuAvailabilityInner>> * @param skuId sku id, if no sku is passed availability for all skus will be returned
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SkuAvailabilityInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> listSinglePageAsync(final String skuId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.regionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.regionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.regionId(), skuId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SkuAvailabilityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SkuAvailabilityInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SkuAvailabilityInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SkuAvailabilityInner>> listDelegate(Response<ResponseBody> response) throws CSRPErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SkuAvailabilityInner>, CSRPErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SkuAvailabilityInner>>() { }.getType())
                .registerError(CSRPErrorException.class)
                .build(response);
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CSRPErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SkuAvailabilityInner&gt; object if successful.
     */
    public PagedList<SkuAvailabilityInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<SkuAvailabilityInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<SkuAvailabilityInner>(response.body()) {
            @Override
            public Page<SkuAvailabilityInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SkuAvailabilityInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<SkuAvailabilityInner>> serviceFuture, final ListOperationCallback<SkuAvailabilityInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SkuAvailabilityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SkuAvailabilityInner&gt; object
     */
    public Observable<Page<SkuAvailabilityInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<SkuAvailabilityInner>>, Page<SkuAvailabilityInner>>() {
                @Override
                public Page<SkuAvailabilityInner> call(ServiceResponse<Page<SkuAvailabilityInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SkuAvailabilityInner&gt; object
     */
    public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SkuAvailabilityInner>>, Observable<ServiceResponse<Page<SkuAvailabilityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> call(ServiceResponse<Page<SkuAvailabilityInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Implements SkuAvailability List method.
     * Returns list of available resources in region.
     *
    ServiceResponse<PageImpl<SkuAvailabilityInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SkuAvailabilityInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SkuAvailabilityInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SkuAvailabilityInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SkuAvailabilityInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SkuAvailabilityInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SkuAvailabilityInner>> listNextDelegate(Response<ResponseBody> response) throws CSRPErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SkuAvailabilityInner>, CSRPErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SkuAvailabilityInner>>() { }.getType())
                .registerError(CSRPErrorException.class)
                .build(response);
    }

}
