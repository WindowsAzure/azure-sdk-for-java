/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.redis.RedisFirewallRuleCreateParameters;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in FirewallRules.
 */
public class FirewallRulesInner {
    /** The Retrofit service to perform REST calls. */
    private FirewallRulesService service;
    /** The service client containing this operation class. */
    private RedisManagementClientImpl client;

    /**
     * Initializes an instance of FirewallRulesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FirewallRulesInner(Retrofit retrofit, RedisManagementClientImpl client) {
        this.service = retrofit.create(FirewallRulesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for FirewallRules to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FirewallRulesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.redis.FirewallRules listByRedisResource" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/Redis/{cacheName}/firewallRules")
        Observable<Response<ResponseBody>> listByRedisResource(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("cacheName") String cacheName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.redis.FirewallRules createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/Redis/{cacheName}/firewallRules/{ruleName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("cacheName") String cacheName, @Path("ruleName") String ruleName, @Path("subscriptionId") String subscriptionId, @Body RedisFirewallRuleCreateParameters parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.redis.FirewallRules get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/Redis/{cacheName}/firewallRules/{ruleName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("cacheName") String cacheName, @Path("ruleName") String ruleName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.redis.FirewallRules delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/Redis/{cacheName}/firewallRules/{ruleName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("cacheName") String cacheName, @Path("ruleName") String ruleName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.redis.FirewallRules listByRedisResourceNext" })
        @GET
        Observable<Response<ResponseBody>> listByRedisResourceNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RedisFirewallRuleInner&gt; object if successful.
     */
    public PagedList<RedisFirewallRuleInner> listByRedisResource(final String resourceGroupName, final String cacheName) {
        ServiceResponse<Page<RedisFirewallRuleInner>> response = listByRedisResourceSinglePageAsync(resourceGroupName, cacheName).toBlocking().single();
        return new PagedList<RedisFirewallRuleInner>(response.body()) {
            @Override
            public Page<RedisFirewallRuleInner> nextPage(String nextPageLink) {
                return listByRedisResourceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RedisFirewallRuleInner>> listByRedisResourceAsync(final String resourceGroupName, final String cacheName, final ListOperationCallback<RedisFirewallRuleInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByRedisResourceSinglePageAsync(resourceGroupName, cacheName),
            new Func1<String, Observable<ServiceResponse<Page<RedisFirewallRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisFirewallRuleInner>>> call(String nextPageLink) {
                    return listByRedisResourceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RedisFirewallRuleInner&gt; object
     */
    public Observable<Page<RedisFirewallRuleInner>> listByRedisResourceAsync(final String resourceGroupName, final String cacheName) {
        return listByRedisResourceWithServiceResponseAsync(resourceGroupName, cacheName)
            .map(new Func1<ServiceResponse<Page<RedisFirewallRuleInner>>, Page<RedisFirewallRuleInner>>() {
                @Override
                public Page<RedisFirewallRuleInner> call(ServiceResponse<Page<RedisFirewallRuleInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RedisFirewallRuleInner&gt; object
     */
    public Observable<ServiceResponse<Page<RedisFirewallRuleInner>>> listByRedisResourceWithServiceResponseAsync(final String resourceGroupName, final String cacheName) {
        return listByRedisResourceSinglePageAsync(resourceGroupName, cacheName)
            .concatMap(new Func1<ServiceResponse<Page<RedisFirewallRuleInner>>, Observable<ServiceResponse<Page<RedisFirewallRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisFirewallRuleInner>>> call(ServiceResponse<Page<RedisFirewallRuleInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByRedisResourceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all firewall rules in the specified redis cache.
     *
    ServiceResponse<PageImpl<RedisFirewallRuleInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<RedisFirewallRuleInner>> * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RedisFirewallRuleInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RedisFirewallRuleInner>>> listByRedisResourceSinglePageAsync(final String resourceGroupName, final String cacheName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (cacheName == null) {
            throw new IllegalArgumentException("Parameter cacheName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByRedisResource(this.client.subscriptionId(), resourceGroupName, cacheName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RedisFirewallRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisFirewallRuleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RedisFirewallRuleInner>> result = listByRedisResourceDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RedisFirewallRuleInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RedisFirewallRuleInner>> listByRedisResourceDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RedisFirewallRuleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RedisFirewallRuleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create or update a redis cache firewall rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param parameters Parameters supplied to the create or update redis firewall rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RedisFirewallRuleInner object if successful.
     */
    public RedisFirewallRuleInner createOrUpdate(String resourceGroupName, String cacheName, String ruleName, RedisFirewallRuleCreateParameters parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, cacheName, ruleName, parameters).toBlocking().single().body();
    }

    /**
     * Create or update a redis cache firewall rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param parameters Parameters supplied to the create or update redis firewall rule operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RedisFirewallRuleInner> createOrUpdateAsync(String resourceGroupName, String cacheName, String ruleName, RedisFirewallRuleCreateParameters parameters, final ServiceCallback<RedisFirewallRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, cacheName, ruleName, parameters), serviceCallback);
    }

    /**
     * Create or update a redis cache firewall rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param parameters Parameters supplied to the create or update redis firewall rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RedisFirewallRuleInner object
     */
    public Observable<RedisFirewallRuleInner> createOrUpdateAsync(String resourceGroupName, String cacheName, String ruleName, RedisFirewallRuleCreateParameters parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, cacheName, ruleName, parameters).map(new Func1<ServiceResponse<RedisFirewallRuleInner>, RedisFirewallRuleInner>() {
            @Override
            public RedisFirewallRuleInner call(ServiceResponse<RedisFirewallRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update a redis cache firewall rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param parameters Parameters supplied to the create or update redis firewall rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RedisFirewallRuleInner object
     */
    public Observable<ServiceResponse<RedisFirewallRuleInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String cacheName, String ruleName, RedisFirewallRuleCreateParameters parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (cacheName == null) {
            throw new IllegalArgumentException("Parameter cacheName is required and cannot be null.");
        }
        if (ruleName == null) {
            throw new IllegalArgumentException("Parameter ruleName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createOrUpdate(resourceGroupName, cacheName, ruleName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RedisFirewallRuleInner>>>() {
                @Override
                public Observable<ServiceResponse<RedisFirewallRuleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RedisFirewallRuleInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RedisFirewallRuleInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RedisFirewallRuleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RedisFirewallRuleInner>() { }.getType())
                .register(201, new TypeToken<RedisFirewallRuleInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RedisFirewallRuleInner object if successful.
     */
    public RedisFirewallRuleInner get(String resourceGroupName, String cacheName, String ruleName) {
        return getWithServiceResponseAsync(resourceGroupName, cacheName, ruleName).toBlocking().single().body();
    }

    /**
     * Gets a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RedisFirewallRuleInner> getAsync(String resourceGroupName, String cacheName, String ruleName, final ServiceCallback<RedisFirewallRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, cacheName, ruleName), serviceCallback);
    }

    /**
     * Gets a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RedisFirewallRuleInner object
     */
    public Observable<RedisFirewallRuleInner> getAsync(String resourceGroupName, String cacheName, String ruleName) {
        return getWithServiceResponseAsync(resourceGroupName, cacheName, ruleName).map(new Func1<ServiceResponse<RedisFirewallRuleInner>, RedisFirewallRuleInner>() {
            @Override
            public RedisFirewallRuleInner call(ServiceResponse<RedisFirewallRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RedisFirewallRuleInner object
     */
    public Observable<ServiceResponse<RedisFirewallRuleInner>> getWithServiceResponseAsync(String resourceGroupName, String cacheName, String ruleName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (cacheName == null) {
            throw new IllegalArgumentException("Parameter cacheName is required and cannot be null.");
        }
        if (ruleName == null) {
            throw new IllegalArgumentException("Parameter ruleName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, cacheName, ruleName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RedisFirewallRuleInner>>>() {
                @Override
                public Observable<ServiceResponse<RedisFirewallRuleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RedisFirewallRuleInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RedisFirewallRuleInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RedisFirewallRuleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RedisFirewallRuleInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String cacheName, String ruleName) {
        deleteWithServiceResponseAsync(resourceGroupName, cacheName, ruleName).toBlocking().single().body();
    }

    /**
     * Deletes a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String cacheName, String ruleName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, cacheName, ruleName), serviceCallback);
    }

    /**
     * Deletes a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String cacheName, String ruleName) {
        return deleteWithServiceResponseAsync(resourceGroupName, cacheName, ruleName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String cacheName, String ruleName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (cacheName == null) {
            throw new IllegalArgumentException("Parameter cacheName is required and cannot be null.");
        }
        if (ruleName == null) {
            throw new IllegalArgumentException("Parameter ruleName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, cacheName, ruleName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RedisFirewallRuleInner&gt; object if successful.
     */
    public PagedList<RedisFirewallRuleInner> listByRedisResourceNext(final String nextPageLink) {
        ServiceResponse<Page<RedisFirewallRuleInner>> response = listByRedisResourceNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RedisFirewallRuleInner>(response.body()) {
            @Override
            public Page<RedisFirewallRuleInner> nextPage(String nextPageLink) {
                return listByRedisResourceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RedisFirewallRuleInner>> listByRedisResourceNextAsync(final String nextPageLink, final ServiceFuture<List<RedisFirewallRuleInner>> serviceFuture, final ListOperationCallback<RedisFirewallRuleInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByRedisResourceNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RedisFirewallRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisFirewallRuleInner>>> call(String nextPageLink) {
                    return listByRedisResourceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RedisFirewallRuleInner&gt; object
     */
    public Observable<Page<RedisFirewallRuleInner>> listByRedisResourceNextAsync(final String nextPageLink) {
        return listByRedisResourceNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RedisFirewallRuleInner>>, Page<RedisFirewallRuleInner>>() {
                @Override
                public Page<RedisFirewallRuleInner> call(ServiceResponse<Page<RedisFirewallRuleInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RedisFirewallRuleInner&gt; object
     */
    public Observable<ServiceResponse<Page<RedisFirewallRuleInner>>> listByRedisResourceNextWithServiceResponseAsync(final String nextPageLink) {
        return listByRedisResourceNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RedisFirewallRuleInner>>, Observable<ServiceResponse<Page<RedisFirewallRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisFirewallRuleInner>>> call(ServiceResponse<Page<RedisFirewallRuleInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByRedisResourceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all firewall rules in the specified redis cache.
     *
    ServiceResponse<PageImpl<RedisFirewallRuleInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RedisFirewallRuleInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RedisFirewallRuleInner>>> listByRedisResourceNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByRedisResourceNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RedisFirewallRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisFirewallRuleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RedisFirewallRuleInner>> result = listByRedisResourceNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RedisFirewallRuleInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RedisFirewallRuleInner>> listByRedisResourceNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RedisFirewallRuleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RedisFirewallRuleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
