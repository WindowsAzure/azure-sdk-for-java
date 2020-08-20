/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

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
 * in LoadBalancerOutboundRules.
 */
public class LoadBalancerOutboundRulesInner {
    /** The Retrofit service to perform REST calls. */
    private LoadBalancerOutboundRulesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of LoadBalancerOutboundRulesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LoadBalancerOutboundRulesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(LoadBalancerOutboundRulesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LoadBalancerOutboundRules to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LoadBalancerOutboundRulesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_06_01.LoadBalancerOutboundRules list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/outboundRules")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("loadBalancerName") String loadBalancerName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_06_01.LoadBalancerOutboundRules get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/outboundRules/{outboundRuleName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("loadBalancerName") String loadBalancerName, @Path("outboundRuleName") String outboundRuleName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_06_01.LoadBalancerOutboundRules listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OutboundRuleInner&gt; object if successful.
     */
    public PagedList<OutboundRuleInner> list(final String resourceGroupName, final String loadBalancerName) {
        ServiceResponse<Page<OutboundRuleInner>> response = listSinglePageAsync(resourceGroupName, loadBalancerName).toBlocking().single();
        return new PagedList<OutboundRuleInner>(response.body()) {
            @Override
            public Page<OutboundRuleInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OutboundRuleInner>> listAsync(final String resourceGroupName, final String loadBalancerName, final ListOperationCallback<OutboundRuleInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, loadBalancerName),
            new Func1<String, Observable<ServiceResponse<Page<OutboundRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OutboundRuleInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OutboundRuleInner&gt; object
     */
    public Observable<Page<OutboundRuleInner>> listAsync(final String resourceGroupName, final String loadBalancerName) {
        return listWithServiceResponseAsync(resourceGroupName, loadBalancerName)
            .map(new Func1<ServiceResponse<Page<OutboundRuleInner>>, Page<OutboundRuleInner>>() {
                @Override
                public Page<OutboundRuleInner> call(ServiceResponse<Page<OutboundRuleInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OutboundRuleInner&gt; object
     */
    public Observable<ServiceResponse<Page<OutboundRuleInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String loadBalancerName) {
        return listSinglePageAsync(resourceGroupName, loadBalancerName)
            .concatMap(new Func1<ServiceResponse<Page<OutboundRuleInner>>, Observable<ServiceResponse<Page<OutboundRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OutboundRuleInner>>> call(ServiceResponse<Page<OutboundRuleInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
    ServiceResponse<PageImpl<OutboundRuleInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<OutboundRuleInner>> * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OutboundRuleInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OutboundRuleInner>>> listSinglePageAsync(final String resourceGroupName, final String loadBalancerName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (loadBalancerName == null) {
            throw new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01";
        return service.list(resourceGroupName, loadBalancerName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OutboundRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OutboundRuleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OutboundRuleInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OutboundRuleInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OutboundRuleInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OutboundRuleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OutboundRuleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OutboundRuleInner object if successful.
     */
    public OutboundRuleInner get(String resourceGroupName, String loadBalancerName, String outboundRuleName) {
        return getWithServiceResponseAsync(resourceGroupName, loadBalancerName, outboundRuleName).toBlocking().single().body();
    }

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OutboundRuleInner> getAsync(String resourceGroupName, String loadBalancerName, String outboundRuleName, final ServiceCallback<OutboundRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, loadBalancerName, outboundRuleName), serviceCallback);
    }

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OutboundRuleInner object
     */
    public Observable<OutboundRuleInner> getAsync(String resourceGroupName, String loadBalancerName, String outboundRuleName) {
        return getWithServiceResponseAsync(resourceGroupName, loadBalancerName, outboundRuleName).map(new Func1<ServiceResponse<OutboundRuleInner>, OutboundRuleInner>() {
            @Override
            public OutboundRuleInner call(ServiceResponse<OutboundRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specified load balancer outbound rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param outboundRuleName The name of the outbound rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OutboundRuleInner object
     */
    public Observable<ServiceResponse<OutboundRuleInner>> getWithServiceResponseAsync(String resourceGroupName, String loadBalancerName, String outboundRuleName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (loadBalancerName == null) {
            throw new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null.");
        }
        if (outboundRuleName == null) {
            throw new IllegalArgumentException("Parameter outboundRuleName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01";
        return service.get(resourceGroupName, loadBalancerName, outboundRuleName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OutboundRuleInner>>>() {
                @Override
                public Observable<ServiceResponse<OutboundRuleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OutboundRuleInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OutboundRuleInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OutboundRuleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OutboundRuleInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OutboundRuleInner&gt; object if successful.
     */
    public PagedList<OutboundRuleInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<OutboundRuleInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<OutboundRuleInner>(response.body()) {
            @Override
            public Page<OutboundRuleInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OutboundRuleInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<OutboundRuleInner>> serviceFuture, final ListOperationCallback<OutboundRuleInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<OutboundRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OutboundRuleInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OutboundRuleInner&gt; object
     */
    public Observable<Page<OutboundRuleInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<OutboundRuleInner>>, Page<OutboundRuleInner>>() {
                @Override
                public Page<OutboundRuleInner> call(ServiceResponse<Page<OutboundRuleInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OutboundRuleInner&gt; object
     */
    public Observable<ServiceResponse<Page<OutboundRuleInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<OutboundRuleInner>>, Observable<ServiceResponse<Page<OutboundRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OutboundRuleInner>>> call(ServiceResponse<Page<OutboundRuleInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the outbound rules in a load balancer.
     *
    ServiceResponse<PageImpl<OutboundRuleInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OutboundRuleInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OutboundRuleInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OutboundRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OutboundRuleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OutboundRuleInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OutboundRuleInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OutboundRuleInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OutboundRuleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OutboundRuleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
