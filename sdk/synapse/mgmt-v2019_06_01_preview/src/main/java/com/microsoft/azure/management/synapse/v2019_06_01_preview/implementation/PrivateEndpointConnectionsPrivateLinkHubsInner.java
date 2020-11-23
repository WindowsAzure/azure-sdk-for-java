/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ErrorContractException;
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
 * in PrivateEndpointConnectionsPrivateLinkHubs.
 */
public class PrivateEndpointConnectionsPrivateLinkHubsInner {
    /** The Retrofit service to perform REST calls. */
    private PrivateEndpointConnectionsPrivateLinkHubsService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsPrivateLinkHubsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateEndpointConnectionsPrivateLinkHubsInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(PrivateEndpointConnectionsPrivateLinkHubsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateEndpointConnectionsPrivateLinkHubs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateEndpointConnectionsPrivateLinkHubsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateEndpointConnectionsPrivateLinkHubs list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/privateLinkHubs/{privateLinkHubName}/privateEndpointConnections")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("privateLinkHubName") String privateLinkHubName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateEndpointConnectionsPrivateLinkHubs listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorContractException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PrivateEndpointConnectionForPrivateLinkHubInner&gt; object if successful.
     */
    public PagedList<PrivateEndpointConnectionForPrivateLinkHubInner> list(final String resourceGroupName, final String privateLinkHubName) {
        ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>> response = listSinglePageAsync(resourceGroupName, privateLinkHubName).toBlocking().single();
        return new PagedList<PrivateEndpointConnectionForPrivateLinkHubInner>(response.body()) {
            @Override
            public Page<PrivateEndpointConnectionForPrivateLinkHubInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PrivateEndpointConnectionForPrivateLinkHubInner>> listAsync(final String resourceGroupName, final String privateLinkHubName, final ListOperationCallback<PrivateEndpointConnectionForPrivateLinkHubInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, privateLinkHubName),
            new Func1<String, Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PrivateEndpointConnectionForPrivateLinkHubInner&gt; object
     */
    public Observable<Page<PrivateEndpointConnectionForPrivateLinkHubInner>> listAsync(final String resourceGroupName, final String privateLinkHubName) {
        return listWithServiceResponseAsync(resourceGroupName, privateLinkHubName)
            .map(new Func1<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>, Page<PrivateEndpointConnectionForPrivateLinkHubInner>>() {
                @Override
                public Page<PrivateEndpointConnectionForPrivateLinkHubInner> call(ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PrivateEndpointConnectionForPrivateLinkHubInner&gt; object
     */
    public Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String privateLinkHubName) {
        return listSinglePageAsync(resourceGroupName, privateLinkHubName)
            .concatMap(new Func1<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>, Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>> call(ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
    ServiceResponse<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>> * @param privateLinkHubName Name of the privateLinkHub
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PrivateEndpointConnectionForPrivateLinkHubInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>> listSinglePageAsync(final String resourceGroupName, final String privateLinkHubName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (privateLinkHubName == null) {
            throw new IllegalArgumentException("Parameter privateLinkHubName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, privateLinkHubName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>> listDelegate(Response<ResponseBody> response) throws ErrorContractException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>, ErrorContractException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>>() { }.getType())
                .registerError(ErrorContractException.class)
                .build(response);
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorContractException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PrivateEndpointConnectionForPrivateLinkHubInner&gt; object if successful.
     */
    public PagedList<PrivateEndpointConnectionForPrivateLinkHubInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<PrivateEndpointConnectionForPrivateLinkHubInner>(response.body()) {
            @Override
            public Page<PrivateEndpointConnectionForPrivateLinkHubInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PrivateEndpointConnectionForPrivateLinkHubInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<PrivateEndpointConnectionForPrivateLinkHubInner>> serviceFuture, final ListOperationCallback<PrivateEndpointConnectionForPrivateLinkHubInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PrivateEndpointConnectionForPrivateLinkHubInner&gt; object
     */
    public Observable<Page<PrivateEndpointConnectionForPrivateLinkHubInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>, Page<PrivateEndpointConnectionForPrivateLinkHubInner>>() {
                @Override
                public Page<PrivateEndpointConnectionForPrivateLinkHubInner> call(ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PrivateEndpointConnectionForPrivateLinkHubInner&gt; object
     */
    public Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>, Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>> call(ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
    ServiceResponse<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PrivateEndpointConnectionForPrivateLinkHubInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PrivateEndpointConnectionForPrivateLinkHubInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorContractException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>, ErrorContractException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PrivateEndpointConnectionForPrivateLinkHubInner>>() { }.getType())
                .registerError(ErrorContractException.class)
                .build(response);
    }

}
