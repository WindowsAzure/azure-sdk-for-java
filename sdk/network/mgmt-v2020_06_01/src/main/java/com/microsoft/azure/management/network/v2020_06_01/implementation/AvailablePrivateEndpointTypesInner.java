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
 * in AvailablePrivateEndpointTypes.
 */
public class AvailablePrivateEndpointTypesInner {
    /** The Retrofit service to perform REST calls. */
    private AvailablePrivateEndpointTypesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of AvailablePrivateEndpointTypesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AvailablePrivateEndpointTypesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(AvailablePrivateEndpointTypesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AvailablePrivateEndpointTypes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AvailablePrivateEndpointTypesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_06_01.AvailablePrivateEndpointTypes list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/locations/{location}/availablePrivateEndpointTypes")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_06_01.AvailablePrivateEndpointTypes listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/locations/{location}/availablePrivateEndpointTypes")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("location") String location, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_06_01.AvailablePrivateEndpointTypes listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_06_01.AvailablePrivateEndpointTypes listByResourceGroupNext" })
        @GET
        Observable<Response<ResponseBody>> listByResourceGroupNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object if successful.
     */
    public PagedList<AvailablePrivateEndpointTypeInner> list(final String location) {
        ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> response = listSinglePageAsync(location).toBlocking().single();
        return new PagedList<AvailablePrivateEndpointTypeInner>(response.body()) {
            @Override
            public Page<AvailablePrivateEndpointTypeInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailablePrivateEndpointTypeInner>> listAsync(final String location, final ListOperationCallback<AvailablePrivateEndpointTypeInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(location),
            new Func1<String, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object
     */
    public Observable<Page<AvailablePrivateEndpointTypeInner>> listAsync(final String location) {
        return listWithServiceResponseAsync(location)
            .map(new Func1<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>, Page<AvailablePrivateEndpointTypeInner>>() {
                @Override
                public Page<AvailablePrivateEndpointTypeInner> call(ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object
     */
    public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> listWithServiceResponseAsync(final String location) {
        return listSinglePageAsync(location)
            .concatMap(new Func1<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
    ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> listSinglePageAsync(final String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01";
        return service.list(location, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailablePrivateEndpointTypeInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailablePrivateEndpointTypeInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object if successful.
     */
    public PagedList<AvailablePrivateEndpointTypeInner> listByResourceGroup(final String location, final String resourceGroupName) {
        ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> response = listByResourceGroupSinglePageAsync(location, resourceGroupName).toBlocking().single();
        return new PagedList<AvailablePrivateEndpointTypeInner>(response.body()) {
            @Override
            public Page<AvailablePrivateEndpointTypeInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailablePrivateEndpointTypeInner>> listByResourceGroupAsync(final String location, final String resourceGroupName, final ListOperationCallback<AvailablePrivateEndpointTypeInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupSinglePageAsync(location, resourceGroupName),
            new Func1<String, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object
     */
    public Observable<Page<AvailablePrivateEndpointTypeInner>> listByResourceGroupAsync(final String location, final String resourceGroupName) {
        return listByResourceGroupWithServiceResponseAsync(location, resourceGroupName)
            .map(new Func1<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>, Page<AvailablePrivateEndpointTypeInner>>() {
                @Override
                public Page<AvailablePrivateEndpointTypeInner> call(ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object
     */
    public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> listByResourceGroupWithServiceResponseAsync(final String location, final String resourceGroupName) {
        return listByResourceGroupSinglePageAsync(location, resourceGroupName)
            .concatMap(new Func1<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
    ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> * @param location The location of the domain name.
    ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> listByResourceGroupSinglePageAsync(final String location, final String resourceGroupName) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01";
        return service.listByResourceGroup(location, resourceGroupName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> result = listByResourceGroupDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailablePrivateEndpointTypeInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailablePrivateEndpointTypeInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object if successful.
     */
    public PagedList<AvailablePrivateEndpointTypeInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<AvailablePrivateEndpointTypeInner>(response.body()) {
            @Override
            public Page<AvailablePrivateEndpointTypeInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailablePrivateEndpointTypeInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<AvailablePrivateEndpointTypeInner>> serviceFuture, final ListOperationCallback<AvailablePrivateEndpointTypeInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object
     */
    public Observable<Page<AvailablePrivateEndpointTypeInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>, Page<AvailablePrivateEndpointTypeInner>>() {
                @Override
                public Page<AvailablePrivateEndpointTypeInner> call(ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object
     */
    public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
    ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailablePrivateEndpointTypeInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailablePrivateEndpointTypeInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object if successful.
     */
    public PagedList<AvailablePrivateEndpointTypeInner> listByResourceGroupNext(final String nextPageLink) {
        ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> response = listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<AvailablePrivateEndpointTypeInner>(response.body()) {
            @Override
            public Page<AvailablePrivateEndpointTypeInner> nextPage(String nextPageLink) {
                return listByResourceGroupNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailablePrivateEndpointTypeInner>> listByResourceGroupNextAsync(final String nextPageLink, final ServiceFuture<List<AvailablePrivateEndpointTypeInner>> serviceFuture, final ListOperationCallback<AvailablePrivateEndpointTypeInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByResourceGroupNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(String nextPageLink) {
                    return listByResourceGroupNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object
     */
    public Observable<Page<AvailablePrivateEndpointTypeInner>> listByResourceGroupNextAsync(final String nextPageLink) {
        return listByResourceGroupNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>, Page<AvailablePrivateEndpointTypeInner>>() {
                @Override
                public Page<AvailablePrivateEndpointTypeInner> call(ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object
     */
    public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> listByResourceGroupNextWithServiceResponseAsync(final String nextPageLink) {
        return listByResourceGroupNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(ServiceResponse<Page<AvailablePrivateEndpointTypeInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByResourceGroupNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     *
    ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AvailablePrivateEndpointTypeInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> listByResourceGroupNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByResourceGroupNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> result = listByResourceGroupNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AvailablePrivateEndpointTypeInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailablePrivateEndpointTypeInner>> listByResourceGroupNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailablePrivateEndpointTypeInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailablePrivateEndpointTypeInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
