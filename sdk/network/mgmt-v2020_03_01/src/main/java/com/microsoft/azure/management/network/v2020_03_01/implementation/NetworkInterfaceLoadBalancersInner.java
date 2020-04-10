/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

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
 * in NetworkInterfaceLoadBalancers.
 */
public class NetworkInterfaceLoadBalancersInner {
    /** The Retrofit service to perform REST calls. */
    private NetworkInterfaceLoadBalancersService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of NetworkInterfaceLoadBalancersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NetworkInterfaceLoadBalancersInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(NetworkInterfaceLoadBalancersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkInterfaceLoadBalancers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NetworkInterfaceLoadBalancersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_03_01.NetworkInterfaceLoadBalancers list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkInterfaces/{networkInterfaceName}/loadBalancers")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("networkInterfaceName") String networkInterfaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_03_01.NetworkInterfaceLoadBalancers listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List all load balancers in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;LoadBalancerInner&gt; object if successful.
     */
    public PagedList<LoadBalancerInner> list(final String resourceGroupName, final String networkInterfaceName) {
        ServiceResponse<Page<LoadBalancerInner>> response = listSinglePageAsync(resourceGroupName, networkInterfaceName).toBlocking().single();
        return new PagedList<LoadBalancerInner>(response.body()) {
            @Override
            public Page<LoadBalancerInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<LoadBalancerInner>> listAsync(final String resourceGroupName, final String networkInterfaceName, final ListOperationCallback<LoadBalancerInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, networkInterfaceName),
            new Func1<String, Observable<ServiceResponse<Page<LoadBalancerInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancerInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;LoadBalancerInner&gt; object
     */
    public Observable<Page<LoadBalancerInner>> listAsync(final String resourceGroupName, final String networkInterfaceName) {
        return listWithServiceResponseAsync(resourceGroupName, networkInterfaceName)
            .map(new Func1<ServiceResponse<Page<LoadBalancerInner>>, Page<LoadBalancerInner>>() {
                @Override
                public Page<LoadBalancerInner> call(ServiceResponse<Page<LoadBalancerInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;LoadBalancerInner&gt; object
     */
    public Observable<ServiceResponse<Page<LoadBalancerInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String networkInterfaceName) {
        return listSinglePageAsync(resourceGroupName, networkInterfaceName)
            .concatMap(new Func1<ServiceResponse<Page<LoadBalancerInner>>, Observable<ServiceResponse<Page<LoadBalancerInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancerInner>>> call(ServiceResponse<Page<LoadBalancerInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List all load balancers in a network interface.
     *
    ServiceResponse<PageImpl<LoadBalancerInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<LoadBalancerInner>> * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;LoadBalancerInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<LoadBalancerInner>>> listSinglePageAsync(final String resourceGroupName, final String networkInterfaceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (networkInterfaceName == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-03-01";
        return service.list(resourceGroupName, networkInterfaceName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<LoadBalancerInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancerInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<LoadBalancerInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<LoadBalancerInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<LoadBalancerInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<LoadBalancerInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<LoadBalancerInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;LoadBalancerInner&gt; object if successful.
     */
    public PagedList<LoadBalancerInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<LoadBalancerInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<LoadBalancerInner>(response.body()) {
            @Override
            public Page<LoadBalancerInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<LoadBalancerInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<LoadBalancerInner>> serviceFuture, final ListOperationCallback<LoadBalancerInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<LoadBalancerInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancerInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;LoadBalancerInner&gt; object
     */
    public Observable<Page<LoadBalancerInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<LoadBalancerInner>>, Page<LoadBalancerInner>>() {
                @Override
                public Page<LoadBalancerInner> call(ServiceResponse<Page<LoadBalancerInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List all load balancers in a network interface.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;LoadBalancerInner&gt; object
     */
    public Observable<ServiceResponse<Page<LoadBalancerInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<LoadBalancerInner>>, Observable<ServiceResponse<Page<LoadBalancerInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancerInner>>> call(ServiceResponse<Page<LoadBalancerInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List all load balancers in a network interface.
     *
    ServiceResponse<PageImpl<LoadBalancerInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;LoadBalancerInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<LoadBalancerInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<LoadBalancerInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancerInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<LoadBalancerInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<LoadBalancerInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<LoadBalancerInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<LoadBalancerInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<LoadBalancerInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
