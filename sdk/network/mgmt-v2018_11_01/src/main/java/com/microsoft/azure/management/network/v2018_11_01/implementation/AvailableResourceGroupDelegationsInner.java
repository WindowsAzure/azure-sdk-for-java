/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

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
 * in AvailableResourceGroupDelegations.
 */
public class AvailableResourceGroupDelegationsInner {
    /** The Retrofit service to perform REST calls. */
    private AvailableResourceGroupDelegationsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of AvailableResourceGroupDelegationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AvailableResourceGroupDelegationsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(AvailableResourceGroupDelegationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AvailableResourceGroupDelegations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AvailableResourceGroupDelegationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_11_01.AvailableResourceGroupDelegations list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/locations/{location}/availableDelegations")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_11_01.AvailableResourceGroupDelegations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AvailableDelegationInner&gt; object if successful.
     */
    public PagedList<AvailableDelegationInner> list(final String location, final String resourceGroupName) {
        ServiceResponse<Page<AvailableDelegationInner>> response = listSinglePageAsync(location, resourceGroupName).toBlocking().single();
        return new PagedList<AvailableDelegationInner>(response.body()) {
            @Override
            public Page<AvailableDelegationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailableDelegationInner>> listAsync(final String location, final String resourceGroupName, final ListOperationCallback<AvailableDelegationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(location, resourceGroupName),
            new Func1<String, Observable<ServiceResponse<Page<AvailableDelegationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableDelegationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableDelegationInner&gt; object
     */
    public Observable<Page<AvailableDelegationInner>> listAsync(final String location, final String resourceGroupName) {
        return listWithServiceResponseAsync(location, resourceGroupName)
            .map(new Func1<ServiceResponse<Page<AvailableDelegationInner>>, Page<AvailableDelegationInner>>() {
                @Override
                public Page<AvailableDelegationInner> call(ServiceResponse<Page<AvailableDelegationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableDelegationInner&gt; object
     */
    public Observable<ServiceResponse<Page<AvailableDelegationInner>>> listWithServiceResponseAsync(final String location, final String resourceGroupName) {
        return listSinglePageAsync(location, resourceGroupName)
            .concatMap(new Func1<ServiceResponse<Page<AvailableDelegationInner>>, Observable<ServiceResponse<Page<AvailableDelegationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableDelegationInner>>> call(ServiceResponse<Page<AvailableDelegationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
    ServiceResponse<PageImpl<AvailableDelegationInner>> * @param location The location of the domain name.
    ServiceResponse<PageImpl<AvailableDelegationInner>> * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AvailableDelegationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AvailableDelegationInner>>> listSinglePageAsync(final String location, final String resourceGroupName) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-11-01";
        return service.list(location, resourceGroupName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AvailableDelegationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableDelegationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailableDelegationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AvailableDelegationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailableDelegationInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailableDelegationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailableDelegationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AvailableDelegationInner&gt; object if successful.
     */
    public PagedList<AvailableDelegationInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<AvailableDelegationInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<AvailableDelegationInner>(response.body()) {
            @Override
            public Page<AvailableDelegationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailableDelegationInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<AvailableDelegationInner>> serviceFuture, final ListOperationCallback<AvailableDelegationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<AvailableDelegationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableDelegationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableDelegationInner&gt; object
     */
    public Observable<Page<AvailableDelegationInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<AvailableDelegationInner>>, Page<AvailableDelegationInner>>() {
                @Override
                public Page<AvailableDelegationInner> call(ServiceResponse<Page<AvailableDelegationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AvailableDelegationInner&gt; object
     */
    public Observable<ServiceResponse<Page<AvailableDelegationInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<AvailableDelegationInner>>, Observable<ServiceResponse<Page<AvailableDelegationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableDelegationInner>>> call(ServiceResponse<Page<AvailableDelegationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
    ServiceResponse<PageImpl<AvailableDelegationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AvailableDelegationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AvailableDelegationInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AvailableDelegationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AvailableDelegationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailableDelegationInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AvailableDelegationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailableDelegationInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailableDelegationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailableDelegationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
