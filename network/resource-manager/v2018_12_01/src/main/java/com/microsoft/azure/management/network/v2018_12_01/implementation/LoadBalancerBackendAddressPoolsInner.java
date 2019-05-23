/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01.implementation;

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
 * in LoadBalancerBackendAddressPools.
 */
public class LoadBalancerBackendAddressPoolsInner {
    /** The Retrofit service to perform REST calls. */
    private LoadBalancerBackendAddressPoolsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of LoadBalancerBackendAddressPoolsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LoadBalancerBackendAddressPoolsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(LoadBalancerBackendAddressPoolsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LoadBalancerBackendAddressPools to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LoadBalancerBackendAddressPoolsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_12_01.LoadBalancerBackendAddressPools list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/backendAddressPools")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("loadBalancerName") String loadBalancerName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_12_01.LoadBalancerBackendAddressPools get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/backendAddressPools/{backendAddressPoolName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("loadBalancerName") String loadBalancerName, @Path("backendAddressPoolName") String backendAddressPoolName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_12_01.LoadBalancerBackendAddressPools listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;BackendAddressPoolInner&gt; object if successful.
     */
    public PagedList<BackendAddressPoolInner> list(final String resourceGroupName, final String loadBalancerName) {
        ServiceResponse<Page<BackendAddressPoolInner>> response = listSinglePageAsync(resourceGroupName, loadBalancerName).toBlocking().single();
        return new PagedList<BackendAddressPoolInner>(response.body()) {
            @Override
            public Page<BackendAddressPoolInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BackendAddressPoolInner>> listAsync(final String resourceGroupName, final String loadBalancerName, final ListOperationCallback<BackendAddressPoolInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, loadBalancerName),
            new Func1<String, Observable<ServiceResponse<Page<BackendAddressPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackendAddressPoolInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BackendAddressPoolInner&gt; object
     */
    public Observable<Page<BackendAddressPoolInner>> listAsync(final String resourceGroupName, final String loadBalancerName) {
        return listWithServiceResponseAsync(resourceGroupName, loadBalancerName)
            .map(new Func1<ServiceResponse<Page<BackendAddressPoolInner>>, Page<BackendAddressPoolInner>>() {
                @Override
                public Page<BackendAddressPoolInner> call(ServiceResponse<Page<BackendAddressPoolInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BackendAddressPoolInner&gt; object
     */
    public Observable<ServiceResponse<Page<BackendAddressPoolInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String loadBalancerName) {
        return listSinglePageAsync(resourceGroupName, loadBalancerName)
            .concatMap(new Func1<ServiceResponse<Page<BackendAddressPoolInner>>, Observable<ServiceResponse<Page<BackendAddressPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackendAddressPoolInner>>> call(ServiceResponse<Page<BackendAddressPoolInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the load balancer backed address pools.
     *
    ServiceResponse<PageImpl<BackendAddressPoolInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<BackendAddressPoolInner>> * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;BackendAddressPoolInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<BackendAddressPoolInner>>> listSinglePageAsync(final String resourceGroupName, final String loadBalancerName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (loadBalancerName == null) {
            throw new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-12-01";
        return service.list(resourceGroupName, loadBalancerName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<BackendAddressPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackendAddressPoolInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<BackendAddressPoolInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<BackendAddressPoolInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<BackendAddressPoolInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<BackendAddressPoolInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<BackendAddressPoolInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BackendAddressPoolInner object if successful.
     */
    public BackendAddressPoolInner get(String resourceGroupName, String loadBalancerName, String backendAddressPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, loadBalancerName, backendAddressPoolName).toBlocking().single().body();
    }

    /**
     * Gets load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BackendAddressPoolInner> getAsync(String resourceGroupName, String loadBalancerName, String backendAddressPoolName, final ServiceCallback<BackendAddressPoolInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, loadBalancerName, backendAddressPoolName), serviceCallback);
    }

    /**
     * Gets load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackendAddressPoolInner object
     */
    public Observable<BackendAddressPoolInner> getAsync(String resourceGroupName, String loadBalancerName, String backendAddressPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, loadBalancerName, backendAddressPoolName).map(new Func1<ServiceResponse<BackendAddressPoolInner>, BackendAddressPoolInner>() {
            @Override
            public BackendAddressPoolInner call(ServiceResponse<BackendAddressPoolInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BackendAddressPoolInner object
     */
    public Observable<ServiceResponse<BackendAddressPoolInner>> getWithServiceResponseAsync(String resourceGroupName, String loadBalancerName, String backendAddressPoolName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (loadBalancerName == null) {
            throw new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null.");
        }
        if (backendAddressPoolName == null) {
            throw new IllegalArgumentException("Parameter backendAddressPoolName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-12-01";
        return service.get(resourceGroupName, loadBalancerName, backendAddressPoolName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BackendAddressPoolInner>>>() {
                @Override
                public Observable<ServiceResponse<BackendAddressPoolInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BackendAddressPoolInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BackendAddressPoolInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BackendAddressPoolInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BackendAddressPoolInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;BackendAddressPoolInner&gt; object if successful.
     */
    public PagedList<BackendAddressPoolInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<BackendAddressPoolInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<BackendAddressPoolInner>(response.body()) {
            @Override
            public Page<BackendAddressPoolInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BackendAddressPoolInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<BackendAddressPoolInner>> serviceFuture, final ListOperationCallback<BackendAddressPoolInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<BackendAddressPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackendAddressPoolInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BackendAddressPoolInner&gt; object
     */
    public Observable<Page<BackendAddressPoolInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<BackendAddressPoolInner>>, Page<BackendAddressPoolInner>>() {
                @Override
                public Page<BackendAddressPoolInner> call(ServiceResponse<Page<BackendAddressPoolInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;BackendAddressPoolInner&gt; object
     */
    public Observable<ServiceResponse<Page<BackendAddressPoolInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<BackendAddressPoolInner>>, Observable<ServiceResponse<Page<BackendAddressPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackendAddressPoolInner>>> call(ServiceResponse<Page<BackendAddressPoolInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the load balancer backed address pools.
     *
    ServiceResponse<PageImpl<BackendAddressPoolInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;BackendAddressPoolInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<BackendAddressPoolInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<BackendAddressPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<BackendAddressPoolInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<BackendAddressPoolInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<BackendAddressPoolInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<BackendAddressPoolInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<BackendAddressPoolInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<BackendAddressPoolInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
