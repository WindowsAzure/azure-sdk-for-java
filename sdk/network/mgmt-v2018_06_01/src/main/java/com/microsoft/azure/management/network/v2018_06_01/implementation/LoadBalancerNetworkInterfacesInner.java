/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01.implementation;

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
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in LoadBalancerNetworkInterfaces.
 */
public class LoadBalancerNetworkInterfacesInner {
    /** The Retrofit service to perform REST calls. */
    private LoadBalancerNetworkInterfacesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of LoadBalancerNetworkInterfacesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LoadBalancerNetworkInterfacesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(LoadBalancerNetworkInterfacesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LoadBalancerNetworkInterfaces to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LoadBalancerNetworkInterfacesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_06_01.LoadBalancerNetworkInterfaces list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/networkInterfaces")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("loadBalancerName") String loadBalancerName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_06_01.LoadBalancerNetworkInterfaces listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets associated load balancer network interfaces.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NetworkInterfaceInner&gt; object if successful.
     */
    public PagedList<NetworkInterfaceInner> list(final String resourceGroupName, final String loadBalancerName) {
        ServiceResponse<Page<NetworkInterfaceInner>> response = listSinglePageAsync(resourceGroupName, loadBalancerName).toBlocking().single();
        return new PagedList<NetworkInterfaceInner>(response.body()) {
            @Override
            public Page<NetworkInterfaceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets associated load balancer network interfaces.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<NetworkInterfaceInner>> listAsync(final String resourceGroupName, final String loadBalancerName, final ListOperationCallback<NetworkInterfaceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, loadBalancerName),
            new Func1<String, Observable<ServiceResponse<Page<NetworkInterfaceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets associated load balancer network interfaces.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkInterfaceInner&gt; object
     */
    public Observable<Page<NetworkInterfaceInner>> listAsync(final String resourceGroupName, final String loadBalancerName) {
        return listWithServiceResponseAsync(resourceGroupName, loadBalancerName)
            .map(new Func1<ServiceResponse<Page<NetworkInterfaceInner>>, Page<NetworkInterfaceInner>>() {
                @Override
                public Page<NetworkInterfaceInner> call(ServiceResponse<Page<NetworkInterfaceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets associated load balancer network interfaces.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkInterfaceInner&gt; object
     */
    public Observable<ServiceResponse<Page<NetworkInterfaceInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String loadBalancerName) {
        return listSinglePageAsync(resourceGroupName, loadBalancerName)
            .concatMap(new Func1<ServiceResponse<Page<NetworkInterfaceInner>>, Observable<ServiceResponse<Page<NetworkInterfaceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceInner>>> call(ServiceResponse<Page<NetworkInterfaceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets associated load balancer network interfaces.
     *
    ServiceResponse<PageImpl<NetworkInterfaceInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<NetworkInterfaceInner>> * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;NetworkInterfaceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<NetworkInterfaceInner>>> listSinglePageAsync(final String resourceGroupName, final String loadBalancerName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (loadBalancerName == null) {
            throw new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.list(resourceGroupName, loadBalancerName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<NetworkInterfaceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<NetworkInterfaceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<NetworkInterfaceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<NetworkInterfaceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<NetworkInterfaceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<NetworkInterfaceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets associated load balancer network interfaces.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NetworkInterfaceInner&gt; object if successful.
     */
    public PagedList<NetworkInterfaceInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<NetworkInterfaceInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<NetworkInterfaceInner>(response.body()) {
            @Override
            public Page<NetworkInterfaceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets associated load balancer network interfaces.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<NetworkInterfaceInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<NetworkInterfaceInner>> serviceFuture, final ListOperationCallback<NetworkInterfaceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<NetworkInterfaceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets associated load balancer network interfaces.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkInterfaceInner&gt; object
     */
    public Observable<Page<NetworkInterfaceInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<NetworkInterfaceInner>>, Page<NetworkInterfaceInner>>() {
                @Override
                public Page<NetworkInterfaceInner> call(ServiceResponse<Page<NetworkInterfaceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets associated load balancer network interfaces.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkInterfaceInner&gt; object
     */
    public Observable<ServiceResponse<Page<NetworkInterfaceInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<NetworkInterfaceInner>>, Observable<ServiceResponse<Page<NetworkInterfaceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceInner>>> call(ServiceResponse<Page<NetworkInterfaceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets associated load balancer network interfaces.
     *
    ServiceResponse<PageImpl<NetworkInterfaceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;NetworkInterfaceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<NetworkInterfaceInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<NetworkInterfaceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<NetworkInterfaceInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<NetworkInterfaceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<NetworkInterfaceInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<NetworkInterfaceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<NetworkInterfaceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
