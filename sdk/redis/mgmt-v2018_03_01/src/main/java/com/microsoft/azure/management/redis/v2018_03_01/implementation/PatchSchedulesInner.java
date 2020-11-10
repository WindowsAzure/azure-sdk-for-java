/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2018_03_01.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.redis.v2018_03_01.ScheduleEntry;
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
 * in PatchSchedules.
 */
public class PatchSchedulesInner implements InnerSupportsDelete<Void> {
    /** The Retrofit service to perform REST calls. */
    private PatchSchedulesService service;
    /** The service client containing this operation class. */
    private RedisManagementClientImpl client;

    /**
     * Initializes an instance of PatchSchedulesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PatchSchedulesInner(Retrofit retrofit, RedisManagementClientImpl client) {
        this.service = retrofit.create(PatchSchedulesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PatchSchedules to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PatchSchedulesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.redis.v2018_03_01.PatchSchedules listByRedisResource" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/Redis/{cacheName}/patchSchedules")
        Observable<Response<ResponseBody>> listByRedisResource(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("cacheName") String cacheName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.redis.v2018_03_01.PatchSchedules createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/Redis/{name}/patchSchedules/{default}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("default") String defaultParameter, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body RedisPatchScheduleInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.redis.v2018_03_01.PatchSchedules delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/Redis/{name}/patchSchedules/{default}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("default") String defaultParameter, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.redis.v2018_03_01.PatchSchedules get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/Redis/{name}/patchSchedules/{default}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("default") String defaultParameter, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.redis.v2018_03_01.PatchSchedules listByRedisResourceNext" })
        @GET
        Observable<Response<ResponseBody>> listByRedisResourceNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RedisPatchScheduleInner&gt; object if successful.
     */
    public PagedList<RedisPatchScheduleInner> listByRedisResource(final String resourceGroupName, final String cacheName) {
        ServiceResponse<Page<RedisPatchScheduleInner>> response = listByRedisResourceSinglePageAsync(resourceGroupName, cacheName).toBlocking().single();
        return new PagedList<RedisPatchScheduleInner>(response.body()) {
            @Override
            public Page<RedisPatchScheduleInner> nextPage(String nextPageLink) {
                return listByRedisResourceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RedisPatchScheduleInner>> listByRedisResourceAsync(final String resourceGroupName, final String cacheName, final ListOperationCallback<RedisPatchScheduleInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByRedisResourceSinglePageAsync(resourceGroupName, cacheName),
            new Func1<String, Observable<ServiceResponse<Page<RedisPatchScheduleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisPatchScheduleInner>>> call(String nextPageLink) {
                    return listByRedisResourceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RedisPatchScheduleInner&gt; object
     */
    public Observable<Page<RedisPatchScheduleInner>> listByRedisResourceAsync(final String resourceGroupName, final String cacheName) {
        return listByRedisResourceWithServiceResponseAsync(resourceGroupName, cacheName)
            .map(new Func1<ServiceResponse<Page<RedisPatchScheduleInner>>, Page<RedisPatchScheduleInner>>() {
                @Override
                public Page<RedisPatchScheduleInner> call(ServiceResponse<Page<RedisPatchScheduleInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RedisPatchScheduleInner&gt; object
     */
    public Observable<ServiceResponse<Page<RedisPatchScheduleInner>>> listByRedisResourceWithServiceResponseAsync(final String resourceGroupName, final String cacheName) {
        return listByRedisResourceSinglePageAsync(resourceGroupName, cacheName)
            .concatMap(new Func1<ServiceResponse<Page<RedisPatchScheduleInner>>, Observable<ServiceResponse<Page<RedisPatchScheduleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisPatchScheduleInner>>> call(ServiceResponse<Page<RedisPatchScheduleInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByRedisResourceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
    ServiceResponse<PageImpl<RedisPatchScheduleInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<RedisPatchScheduleInner>> * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RedisPatchScheduleInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RedisPatchScheduleInner>>> listByRedisResourceSinglePageAsync(final String resourceGroupName, final String cacheName) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RedisPatchScheduleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisPatchScheduleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RedisPatchScheduleInner>> result = listByRedisResourceDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RedisPatchScheduleInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RedisPatchScheduleInner>> listByRedisResourceDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RedisPatchScheduleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RedisPatchScheduleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create or replace the patching schedule for Redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param scheduleEntries List of patch schedules for a Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RedisPatchScheduleInner object if successful.
     */
    public RedisPatchScheduleInner createOrUpdate(String resourceGroupName, String name, List<ScheduleEntry> scheduleEntries) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, name, scheduleEntries).toBlocking().single().body();
    }

    /**
     * Create or replace the patching schedule for Redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param scheduleEntries List of patch schedules for a Redis cache.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RedisPatchScheduleInner> createOrUpdateAsync(String resourceGroupName, String name, List<ScheduleEntry> scheduleEntries, final ServiceCallback<RedisPatchScheduleInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, name, scheduleEntries), serviceCallback);
    }

    /**
     * Create or replace the patching schedule for Redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param scheduleEntries List of patch schedules for a Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RedisPatchScheduleInner object
     */
    public Observable<RedisPatchScheduleInner> createOrUpdateAsync(String resourceGroupName, String name, List<ScheduleEntry> scheduleEntries) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, name, scheduleEntries).map(new Func1<ServiceResponse<RedisPatchScheduleInner>, RedisPatchScheduleInner>() {
            @Override
            public RedisPatchScheduleInner call(ServiceResponse<RedisPatchScheduleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or replace the patching schedule for Redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param scheduleEntries List of patch schedules for a Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RedisPatchScheduleInner object
     */
    public Observable<ServiceResponse<RedisPatchScheduleInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String name, List<ScheduleEntry> scheduleEntries) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (scheduleEntries == null) {
            throw new IllegalArgumentException("Parameter scheduleEntries is required and cannot be null.");
        }
        Validator.validate(scheduleEntries);
        final String defaultParameter = "default";
        RedisPatchScheduleInner parameters = new RedisPatchScheduleInner();
        parameters.withScheduleEntries(scheduleEntries);
        return service.createOrUpdate(resourceGroupName, name, defaultParameter, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RedisPatchScheduleInner>>>() {
                @Override
                public Observable<ServiceResponse<RedisPatchScheduleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RedisPatchScheduleInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RedisPatchScheduleInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RedisPatchScheduleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RedisPatchScheduleInner>() { }.getType())
                .register(201, new TypeToken<RedisPatchScheduleInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String name) {
        deleteWithServiceResponseAsync(resourceGroupName, name).toBlocking().single().body();
    }

    /**
     * Deletes the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String name, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, name), serviceCallback);
    }

    /**
     * Deletes the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String name) {
        return deleteWithServiceResponseAsync(resourceGroupName, name).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String name) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String defaultParameter = "default";
        return service.delete(resourceGroupName, name, defaultParameter, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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
     * Gets the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RedisPatchScheduleInner object if successful.
     */
    public RedisPatchScheduleInner get(String resourceGroupName, String name) {
        return getWithServiceResponseAsync(resourceGroupName, name).toBlocking().single().body();
    }

    /**
     * Gets the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RedisPatchScheduleInner> getAsync(String resourceGroupName, String name, final ServiceCallback<RedisPatchScheduleInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, name), serviceCallback);
    }

    /**
     * Gets the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RedisPatchScheduleInner object
     */
    public Observable<RedisPatchScheduleInner> getAsync(String resourceGroupName, String name) {
        return getWithServiceResponseAsync(resourceGroupName, name).map(new Func1<ServiceResponse<RedisPatchScheduleInner>, RedisPatchScheduleInner>() {
            @Override
            public RedisPatchScheduleInner call(ServiceResponse<RedisPatchScheduleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RedisPatchScheduleInner object
     */
    public Observable<ServiceResponse<RedisPatchScheduleInner>> getWithServiceResponseAsync(String resourceGroupName, String name) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String defaultParameter = "default";
        return service.get(resourceGroupName, name, defaultParameter, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RedisPatchScheduleInner>>>() {
                @Override
                public Observable<ServiceResponse<RedisPatchScheduleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RedisPatchScheduleInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RedisPatchScheduleInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RedisPatchScheduleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RedisPatchScheduleInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RedisPatchScheduleInner&gt; object if successful.
     */
    public PagedList<RedisPatchScheduleInner> listByRedisResourceNext(final String nextPageLink) {
        ServiceResponse<Page<RedisPatchScheduleInner>> response = listByRedisResourceNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RedisPatchScheduleInner>(response.body()) {
            @Override
            public Page<RedisPatchScheduleInner> nextPage(String nextPageLink) {
                return listByRedisResourceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RedisPatchScheduleInner>> listByRedisResourceNextAsync(final String nextPageLink, final ServiceFuture<List<RedisPatchScheduleInner>> serviceFuture, final ListOperationCallback<RedisPatchScheduleInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByRedisResourceNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RedisPatchScheduleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisPatchScheduleInner>>> call(String nextPageLink) {
                    return listByRedisResourceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RedisPatchScheduleInner&gt; object
     */
    public Observable<Page<RedisPatchScheduleInner>> listByRedisResourceNextAsync(final String nextPageLink) {
        return listByRedisResourceNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RedisPatchScheduleInner>>, Page<RedisPatchScheduleInner>>() {
                @Override
                public Page<RedisPatchScheduleInner> call(ServiceResponse<Page<RedisPatchScheduleInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RedisPatchScheduleInner&gt; object
     */
    public Observable<ServiceResponse<Page<RedisPatchScheduleInner>>> listByRedisResourceNextWithServiceResponseAsync(final String nextPageLink) {
        return listByRedisResourceNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RedisPatchScheduleInner>>, Observable<ServiceResponse<Page<RedisPatchScheduleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisPatchScheduleInner>>> call(ServiceResponse<Page<RedisPatchScheduleInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByRedisResourceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
    ServiceResponse<PageImpl<RedisPatchScheduleInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RedisPatchScheduleInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RedisPatchScheduleInner>>> listByRedisResourceNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByRedisResourceNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RedisPatchScheduleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RedisPatchScheduleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RedisPatchScheduleInner>> result = listByRedisResourceNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RedisPatchScheduleInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RedisPatchScheduleInner>> listByRedisResourceNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RedisPatchScheduleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RedisPatchScheduleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
