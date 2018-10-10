/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.ErrorResponseException;
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
 * in NotificationSettings.
 */
public class NotificationSettingsInner {
    /** The Retrofit service to perform REST calls. */
    private NotificationSettingsService service;
    /** The service client containing this operation class. */
    private WorkloadMonitorAPIImpl client;

    /**
     * Initializes an instance of NotificationSettingsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NotificationSettingsInner(Retrofit retrofit, WorkloadMonitorAPIImpl client) {
        this.service = retrofit.create(NotificationSettingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NotificationSettings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NotificationSettingsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.NotificationSettings listByResource" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceNamespace}/{resourceType}/{resourceName}/providers/Microsoft.WorkloadMonitor/notificationSettings")
        Observable<Response<ResponseBody>> listByResource(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceNamespace") String resourceNamespace, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Query("$skiptoken") String skiptoken, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.NotificationSettings listByResourceNext" })
        @GET
        Observable<Response<ResponseBody>> listByResourceNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NotificationSettingInner&gt; object if successful.
     */
    public PagedList<NotificationSettingInner> listByResource(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName) {
        ServiceResponse<Page<NotificationSettingInner>> response = listByResourceSinglePageAsync(resourceGroupName, resourceNamespace, resourceType, resourceName).toBlocking().single();
        return new PagedList<NotificationSettingInner>(response.body()) {
            @Override
            public Page<NotificationSettingInner> nextPage(String nextPageLink) {
                return listByResourceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<NotificationSettingInner>> listByResourceAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName, final ListOperationCallback<NotificationSettingInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceSinglePageAsync(resourceGroupName, resourceNamespace, resourceType, resourceName),
            new Func1<String, Observable<ServiceResponse<Page<NotificationSettingInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NotificationSettingInner>>> call(String nextPageLink) {
                    return listByResourceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NotificationSettingInner&gt; object
     */
    public Observable<Page<NotificationSettingInner>> listByResourceAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName) {
        return listByResourceWithServiceResponseAsync(resourceGroupName, resourceNamespace, resourceType, resourceName)
            .map(new Func1<ServiceResponse<Page<NotificationSettingInner>>, Page<NotificationSettingInner>>() {
                @Override
                public Page<NotificationSettingInner> call(ServiceResponse<Page<NotificationSettingInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NotificationSettingInner&gt; object
     */
    public Observable<ServiceResponse<Page<NotificationSettingInner>>> listByResourceWithServiceResponseAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName) {
        return listByResourceSinglePageAsync(resourceGroupName, resourceNamespace, resourceType, resourceName)
            .concatMap(new Func1<ServiceResponse<Page<NotificationSettingInner>>, Observable<ServiceResponse<Page<NotificationSettingInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NotificationSettingInner>>> call(ServiceResponse<Page<NotificationSettingInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;NotificationSettingInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<NotificationSettingInner>>> listByResourceSinglePageAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceNamespace == null) {
            throw new IllegalArgumentException("Parameter resourceNamespace is required and cannot be null.");
        }
        if (resourceType == null) {
            throw new IllegalArgumentException("Parameter resourceType is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        final String skiptoken = null;
        return service.listByResource(this.client.subscriptionId(), resourceGroupName, resourceNamespace, resourceType, resourceName, this.client.apiVersion(), skiptoken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<NotificationSettingInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NotificationSettingInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<NotificationSettingInner>> result = listByResourceDelegate(response);
                        return Observable.just(new ServiceResponse<Page<NotificationSettingInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NotificationSettingInner&gt; object if successful.
     */
    public PagedList<NotificationSettingInner> listByResource(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName, final String skiptoken) {
        ServiceResponse<Page<NotificationSettingInner>> response = listByResourceSinglePageAsync(resourceGroupName, resourceNamespace, resourceType, resourceName, skiptoken).toBlocking().single();
        return new PagedList<NotificationSettingInner>(response.body()) {
            @Override
            public Page<NotificationSettingInner> nextPage(String nextPageLink) {
                return listByResourceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<NotificationSettingInner>> listByResourceAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName, final String skiptoken, final ListOperationCallback<NotificationSettingInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceSinglePageAsync(resourceGroupName, resourceNamespace, resourceType, resourceName, skiptoken),
            new Func1<String, Observable<ServiceResponse<Page<NotificationSettingInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NotificationSettingInner>>> call(String nextPageLink) {
                    return listByResourceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NotificationSettingInner&gt; object
     */
    public Observable<Page<NotificationSettingInner>> listByResourceAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName, final String skiptoken) {
        return listByResourceWithServiceResponseAsync(resourceGroupName, resourceNamespace, resourceType, resourceName, skiptoken)
            .map(new Func1<ServiceResponse<Page<NotificationSettingInner>>, Page<NotificationSettingInner>>() {
                @Override
                public Page<NotificationSettingInner> call(ServiceResponse<Page<NotificationSettingInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NotificationSettingInner&gt; object
     */
    public Observable<ServiceResponse<Page<NotificationSettingInner>>> listByResourceWithServiceResponseAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName, final String skiptoken) {
        return listByResourceSinglePageAsync(resourceGroupName, resourceNamespace, resourceType, resourceName, skiptoken)
            .concatMap(new Func1<ServiceResponse<Page<NotificationSettingInner>>, Observable<ServiceResponse<Page<NotificationSettingInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NotificationSettingInner>>> call(ServiceResponse<Page<NotificationSettingInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get list of notification settings for a resource.
     *
    ServiceResponse<PageImpl<NotificationSettingInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<NotificationSettingInner>> * @param resourceNamespace The Namespace of the resource.
    ServiceResponse<PageImpl<NotificationSettingInner>> * @param resourceType The type of the resource.
    ServiceResponse<PageImpl<NotificationSettingInner>> * @param resourceName Name of the resource.
    ServiceResponse<PageImpl<NotificationSettingInner>> * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;NotificationSettingInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<NotificationSettingInner>>> listByResourceSinglePageAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName, final String skiptoken) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceNamespace == null) {
            throw new IllegalArgumentException("Parameter resourceNamespace is required and cannot be null.");
        }
        if (resourceType == null) {
            throw new IllegalArgumentException("Parameter resourceType is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        return service.listByResource(this.client.subscriptionId(), resourceGroupName, resourceNamespace, resourceType, resourceName, this.client.apiVersion(), skiptoken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<NotificationSettingInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NotificationSettingInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<NotificationSettingInner>> result = listByResourceDelegate(response);
                        return Observable.just(new ServiceResponse<Page<NotificationSettingInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<NotificationSettingInner>> listByResourceDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<NotificationSettingInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<NotificationSettingInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NotificationSettingInner&gt; object if successful.
     */
    public PagedList<NotificationSettingInner> listByResourceNext(final String nextPageLink) {
        ServiceResponse<Page<NotificationSettingInner>> response = listByResourceNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<NotificationSettingInner>(response.body()) {
            @Override
            public Page<NotificationSettingInner> nextPage(String nextPageLink) {
                return listByResourceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<NotificationSettingInner>> listByResourceNextAsync(final String nextPageLink, final ServiceFuture<List<NotificationSettingInner>> serviceFuture, final ListOperationCallback<NotificationSettingInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<NotificationSettingInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NotificationSettingInner>>> call(String nextPageLink) {
                    return listByResourceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NotificationSettingInner&gt; object
     */
    public Observable<Page<NotificationSettingInner>> listByResourceNextAsync(final String nextPageLink) {
        return listByResourceNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<NotificationSettingInner>>, Page<NotificationSettingInner>>() {
                @Override
                public Page<NotificationSettingInner> call(ServiceResponse<Page<NotificationSettingInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NotificationSettingInner&gt; object
     */
    public Observable<ServiceResponse<Page<NotificationSettingInner>>> listByResourceNextWithServiceResponseAsync(final String nextPageLink) {
        return listByResourceNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<NotificationSettingInner>>, Observable<ServiceResponse<Page<NotificationSettingInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NotificationSettingInner>>> call(ServiceResponse<Page<NotificationSettingInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get list of notification settings for a resource.
     *
    ServiceResponse<PageImpl<NotificationSettingInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;NotificationSettingInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<NotificationSettingInner>>> listByResourceNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByResourceNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<NotificationSettingInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NotificationSettingInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<NotificationSettingInner>> result = listByResourceNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<NotificationSettingInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<NotificationSettingInner>> listByResourceNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<NotificationSettingInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<NotificationSettingInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
