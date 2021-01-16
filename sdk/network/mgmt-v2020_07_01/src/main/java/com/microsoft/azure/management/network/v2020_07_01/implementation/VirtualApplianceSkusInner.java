/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

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
 * in VirtualApplianceSkus.
 */
public class VirtualApplianceSkusInner {
    /** The Retrofit service to perform REST calls. */
    private VirtualApplianceSkusService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VirtualApplianceSkusInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualApplianceSkusInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(VirtualApplianceSkusService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualApplianceSkus to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualApplianceSkusService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_07_01.VirtualApplianceSkus list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/networkVirtualApplianceSkus")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_07_01.VirtualApplianceSkus get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/networkVirtualApplianceSkus/{skuName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("skuName") String skuName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_07_01.VirtualApplianceSkus listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List all SKUs available for a virtual appliance.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NetworkVirtualApplianceSkuInner&gt; object if successful.
     */
    public PagedList<NetworkVirtualApplianceSkuInner> list() {
        ServiceResponse<Page<NetworkVirtualApplianceSkuInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<NetworkVirtualApplianceSkuInner>(response.body()) {
            @Override
            public Page<NetworkVirtualApplianceSkuInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List all SKUs available for a virtual appliance.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<NetworkVirtualApplianceSkuInner>> listAsync(final ListOperationCallback<NetworkVirtualApplianceSkuInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List all SKUs available for a virtual appliance.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkVirtualApplianceSkuInner&gt; object
     */
    public Observable<Page<NetworkVirtualApplianceSkuInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>, Page<NetworkVirtualApplianceSkuInner>>() {
                @Override
                public Page<NetworkVirtualApplianceSkuInner> call(ServiceResponse<Page<NetworkVirtualApplianceSkuInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List all SKUs available for a virtual appliance.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkVirtualApplianceSkuInner&gt; object
     */
    public Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>, Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>> call(ServiceResponse<Page<NetworkVirtualApplianceSkuInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List all SKUs available for a virtual appliance.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;NetworkVirtualApplianceSkuInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-07-01";
        return service.list(this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<NetworkVirtualApplianceSkuInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<NetworkVirtualApplianceSkuInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<NetworkVirtualApplianceSkuInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<NetworkVirtualApplianceSkuInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a single available sku for network virtual appliance.
     *
     * @param skuName Name of the Sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkVirtualApplianceSkuInner object if successful.
     */
    public NetworkVirtualApplianceSkuInner get(String skuName) {
        return getWithServiceResponseAsync(skuName).toBlocking().single().body();
    }

    /**
     * Retrieves a single available sku for network virtual appliance.
     *
     * @param skuName Name of the Sku.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkVirtualApplianceSkuInner> getAsync(String skuName, final ServiceCallback<NetworkVirtualApplianceSkuInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(skuName), serviceCallback);
    }

    /**
     * Retrieves a single available sku for network virtual appliance.
     *
     * @param skuName Name of the Sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkVirtualApplianceSkuInner object
     */
    public Observable<NetworkVirtualApplianceSkuInner> getAsync(String skuName) {
        return getWithServiceResponseAsync(skuName).map(new Func1<ServiceResponse<NetworkVirtualApplianceSkuInner>, NetworkVirtualApplianceSkuInner>() {
            @Override
            public NetworkVirtualApplianceSkuInner call(ServiceResponse<NetworkVirtualApplianceSkuInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves a single available sku for network virtual appliance.
     *
     * @param skuName Name of the Sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkVirtualApplianceSkuInner object
     */
    public Observable<ServiceResponse<NetworkVirtualApplianceSkuInner>> getWithServiceResponseAsync(String skuName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (skuName == null) {
            throw new IllegalArgumentException("Parameter skuName is required and cannot be null.");
        }
        final String apiVersion = "2020-07-01";
        return service.get(this.client.subscriptionId(), skuName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkVirtualApplianceSkuInner>>>() {
                @Override
                public Observable<ServiceResponse<NetworkVirtualApplianceSkuInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkVirtualApplianceSkuInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkVirtualApplianceSkuInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkVirtualApplianceSkuInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkVirtualApplianceSkuInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List all SKUs available for a virtual appliance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NetworkVirtualApplianceSkuInner&gt; object if successful.
     */
    public PagedList<NetworkVirtualApplianceSkuInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<NetworkVirtualApplianceSkuInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<NetworkVirtualApplianceSkuInner>(response.body()) {
            @Override
            public Page<NetworkVirtualApplianceSkuInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List all SKUs available for a virtual appliance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<NetworkVirtualApplianceSkuInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<NetworkVirtualApplianceSkuInner>> serviceFuture, final ListOperationCallback<NetworkVirtualApplianceSkuInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List all SKUs available for a virtual appliance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkVirtualApplianceSkuInner&gt; object
     */
    public Observable<Page<NetworkVirtualApplianceSkuInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>, Page<NetworkVirtualApplianceSkuInner>>() {
                @Override
                public Page<NetworkVirtualApplianceSkuInner> call(ServiceResponse<Page<NetworkVirtualApplianceSkuInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List all SKUs available for a virtual appliance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkVirtualApplianceSkuInner&gt; object
     */
    public Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>, Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>> call(ServiceResponse<Page<NetworkVirtualApplianceSkuInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List all SKUs available for a virtual appliance.
     *
    ServiceResponse<PageImpl<NetworkVirtualApplianceSkuInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;NetworkVirtualApplianceSkuInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<NetworkVirtualApplianceSkuInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<NetworkVirtualApplianceSkuInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<NetworkVirtualApplianceSkuInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<NetworkVirtualApplianceSkuInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<NetworkVirtualApplianceSkuInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
