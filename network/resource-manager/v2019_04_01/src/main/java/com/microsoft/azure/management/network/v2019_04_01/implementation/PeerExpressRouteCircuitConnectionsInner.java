/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

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
 * in PeerExpressRouteCircuitConnections.
 */
public class PeerExpressRouteCircuitConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private PeerExpressRouteCircuitConnectionsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of PeerExpressRouteCircuitConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PeerExpressRouteCircuitConnectionsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(PeerExpressRouteCircuitConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PeerExpressRouteCircuitConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PeerExpressRouteCircuitConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_04_01.PeerExpressRouteCircuitConnections get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/peerConnections/{connectionName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("peeringName") String peeringName, @Path("connectionName") String connectionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_04_01.PeerExpressRouteCircuitConnections list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}/peerConnections")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("peeringName") String peeringName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_04_01.PeerExpressRouteCircuitConnections listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PeerExpressRouteCircuitConnectionInner object if successful.
     */
    public PeerExpressRouteCircuitConnectionInner get(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        return getWithServiceResponseAsync(resourceGroupName, circuitName, peeringName, connectionName).toBlocking().single().body();
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PeerExpressRouteCircuitConnectionInner> getAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName, final ServiceCallback<PeerExpressRouteCircuitConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, circuitName, peeringName, connectionName), serviceCallback);
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PeerExpressRouteCircuitConnectionInner object
     */
    public Observable<PeerExpressRouteCircuitConnectionInner> getAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        return getWithServiceResponseAsync(resourceGroupName, circuitName, peeringName, connectionName).map(new Func1<ServiceResponse<PeerExpressRouteCircuitConnectionInner>, PeerExpressRouteCircuitConnectionInner>() {
            @Override
            public PeerExpressRouteCircuitConnectionInner call(ServiceResponse<PeerExpressRouteCircuitConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PeerExpressRouteCircuitConnectionInner object
     */
    public Observable<ServiceResponse<PeerExpressRouteCircuitConnectionInner>> getWithServiceResponseAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-04-01";
        return service.get(resourceGroupName, circuitName, peeringName, connectionName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PeerExpressRouteCircuitConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PeerExpressRouteCircuitConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PeerExpressRouteCircuitConnectionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PeerExpressRouteCircuitConnectionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PeerExpressRouteCircuitConnectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PeerExpressRouteCircuitConnectionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PeerExpressRouteCircuitConnectionInner&gt; object if successful.
     */
    public PagedList<PeerExpressRouteCircuitConnectionInner> list(final String resourceGroupName, final String circuitName, final String peeringName) {
        ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>> response = listSinglePageAsync(resourceGroupName, circuitName, peeringName).toBlocking().single();
        return new PagedList<PeerExpressRouteCircuitConnectionInner>(response.body()) {
            @Override
            public Page<PeerExpressRouteCircuitConnectionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PeerExpressRouteCircuitConnectionInner>> listAsync(final String resourceGroupName, final String circuitName, final String peeringName, final ListOperationCallback<PeerExpressRouteCircuitConnectionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, circuitName, peeringName),
            new Func1<String, Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeerExpressRouteCircuitConnectionInner&gt; object
     */
    public Observable<Page<PeerExpressRouteCircuitConnectionInner>> listAsync(final String resourceGroupName, final String circuitName, final String peeringName) {
        return listWithServiceResponseAsync(resourceGroupName, circuitName, peeringName)
            .map(new Func1<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>, Page<PeerExpressRouteCircuitConnectionInner>>() {
                @Override
                public Page<PeerExpressRouteCircuitConnectionInner> call(ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeerExpressRouteCircuitConnectionInner&gt; object
     */
    public Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String circuitName, final String peeringName) {
        return listSinglePageAsync(resourceGroupName, circuitName, peeringName)
            .concatMap(new Func1<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>, Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>> call(ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
    ServiceResponse<PageImpl<PeerExpressRouteCircuitConnectionInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<PeerExpressRouteCircuitConnectionInner>> * @param circuitName The name of the circuit.
    ServiceResponse<PageImpl<PeerExpressRouteCircuitConnectionInner>> * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PeerExpressRouteCircuitConnectionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>> listSinglePageAsync(final String resourceGroupName, final String circuitName, final String peeringName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-04-01";
        return service.list(resourceGroupName, circuitName, peeringName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PeerExpressRouteCircuitConnectionInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PeerExpressRouteCircuitConnectionInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PeerExpressRouteCircuitConnectionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PeerExpressRouteCircuitConnectionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PeerExpressRouteCircuitConnectionInner&gt; object if successful.
     */
    public PagedList<PeerExpressRouteCircuitConnectionInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<PeerExpressRouteCircuitConnectionInner>(response.body()) {
            @Override
            public Page<PeerExpressRouteCircuitConnectionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PeerExpressRouteCircuitConnectionInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<PeerExpressRouteCircuitConnectionInner>> serviceFuture, final ListOperationCallback<PeerExpressRouteCircuitConnectionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeerExpressRouteCircuitConnectionInner&gt; object
     */
    public Observable<Page<PeerExpressRouteCircuitConnectionInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>, Page<PeerExpressRouteCircuitConnectionInner>>() {
                @Override
                public Page<PeerExpressRouteCircuitConnectionInner> call(ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeerExpressRouteCircuitConnectionInner&gt; object
     */
    public Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>, Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>> call(ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
    ServiceResponse<PageImpl<PeerExpressRouteCircuitConnectionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PeerExpressRouteCircuitConnectionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PeerExpressRouteCircuitConnectionInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PeerExpressRouteCircuitConnectionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PeerExpressRouteCircuitConnectionInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PeerExpressRouteCircuitConnectionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PeerExpressRouteCircuitConnectionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
