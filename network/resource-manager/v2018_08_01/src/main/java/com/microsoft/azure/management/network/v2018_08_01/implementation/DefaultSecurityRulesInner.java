/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

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
 * in DefaultSecurityRules.
 */
public class DefaultSecurityRulesInner {
    /** The Retrofit service to perform REST calls. */
    private DefaultSecurityRulesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of DefaultSecurityRulesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DefaultSecurityRulesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(DefaultSecurityRulesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DefaultSecurityRules to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DefaultSecurityRulesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_08_01.DefaultSecurityRules list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}/defaultSecurityRules")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("networkSecurityGroupName") String networkSecurityGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_08_01.DefaultSecurityRules get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkSecurityGroups/{networkSecurityGroupName}/defaultSecurityRules/{defaultSecurityRuleName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("networkSecurityGroupName") String networkSecurityGroupName, @Path("defaultSecurityRuleName") String defaultSecurityRuleName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_08_01.DefaultSecurityRules listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SecurityRuleInner&gt; object if successful.
     */
    public PagedList<SecurityRuleInner> list(final String resourceGroupName, final String networkSecurityGroupName) {
        ServiceResponse<Page<SecurityRuleInner>> response = listSinglePageAsync(resourceGroupName, networkSecurityGroupName).toBlocking().single();
        return new PagedList<SecurityRuleInner>(response.body()) {
            @Override
            public Page<SecurityRuleInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SecurityRuleInner>> listAsync(final String resourceGroupName, final String networkSecurityGroupName, final ListOperationCallback<SecurityRuleInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, networkSecurityGroupName),
            new Func1<String, Observable<ServiceResponse<Page<SecurityRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SecurityRuleInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SecurityRuleInner&gt; object
     */
    public Observable<Page<SecurityRuleInner>> listAsync(final String resourceGroupName, final String networkSecurityGroupName) {
        return listWithServiceResponseAsync(resourceGroupName, networkSecurityGroupName)
            .map(new Func1<ServiceResponse<Page<SecurityRuleInner>>, Page<SecurityRuleInner>>() {
                @Override
                public Page<SecurityRuleInner> call(ServiceResponse<Page<SecurityRuleInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SecurityRuleInner&gt; object
     */
    public Observable<ServiceResponse<Page<SecurityRuleInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String networkSecurityGroupName) {
        return listSinglePageAsync(resourceGroupName, networkSecurityGroupName)
            .concatMap(new Func1<ServiceResponse<Page<SecurityRuleInner>>, Observable<ServiceResponse<Page<SecurityRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SecurityRuleInner>>> call(ServiceResponse<Page<SecurityRuleInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all default security rules in a network security group.
     *
    ServiceResponse<PageImpl<SecurityRuleInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<SecurityRuleInner>> * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SecurityRuleInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SecurityRuleInner>>> listSinglePageAsync(final String resourceGroupName, final String networkSecurityGroupName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (networkSecurityGroupName == null) {
            throw new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-08-01";
        return service.list(resourceGroupName, networkSecurityGroupName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SecurityRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SecurityRuleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SecurityRuleInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SecurityRuleInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SecurityRuleInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SecurityRuleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SecurityRuleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SecurityRuleInner object if successful.
     */
    public SecurityRuleInner get(String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName) {
        return getWithServiceResponseAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName).toBlocking().single().body();
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SecurityRuleInner> getAsync(String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName, final ServiceCallback<SecurityRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName), serviceCallback);
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecurityRuleInner object
     */
    public Observable<SecurityRuleInner> getAsync(String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName) {
        return getWithServiceResponseAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName).map(new Func1<ServiceResponse<SecurityRuleInner>, SecurityRuleInner>() {
            @Override
            public SecurityRuleInner call(ServiceResponse<SecurityRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the specified default network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param defaultSecurityRuleName The name of the default security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecurityRuleInner object
     */
    public Observable<ServiceResponse<SecurityRuleInner>> getWithServiceResponseAsync(String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (networkSecurityGroupName == null) {
            throw new IllegalArgumentException("Parameter networkSecurityGroupName is required and cannot be null.");
        }
        if (defaultSecurityRuleName == null) {
            throw new IllegalArgumentException("Parameter defaultSecurityRuleName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-08-01";
        return service.get(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SecurityRuleInner>>>() {
                @Override
                public Observable<ServiceResponse<SecurityRuleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SecurityRuleInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SecurityRuleInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SecurityRuleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SecurityRuleInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SecurityRuleInner&gt; object if successful.
     */
    public PagedList<SecurityRuleInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<SecurityRuleInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<SecurityRuleInner>(response.body()) {
            @Override
            public Page<SecurityRuleInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SecurityRuleInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<SecurityRuleInner>> serviceFuture, final ListOperationCallback<SecurityRuleInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SecurityRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SecurityRuleInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SecurityRuleInner&gt; object
     */
    public Observable<Page<SecurityRuleInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<SecurityRuleInner>>, Page<SecurityRuleInner>>() {
                @Override
                public Page<SecurityRuleInner> call(ServiceResponse<Page<SecurityRuleInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all default security rules in a network security group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SecurityRuleInner&gt; object
     */
    public Observable<ServiceResponse<Page<SecurityRuleInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SecurityRuleInner>>, Observable<ServiceResponse<Page<SecurityRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SecurityRuleInner>>> call(ServiceResponse<Page<SecurityRuleInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all default security rules in a network security group.
     *
    ServiceResponse<PageImpl<SecurityRuleInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SecurityRuleInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SecurityRuleInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SecurityRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SecurityRuleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SecurityRuleInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SecurityRuleInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SecurityRuleInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SecurityRuleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SecurityRuleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
