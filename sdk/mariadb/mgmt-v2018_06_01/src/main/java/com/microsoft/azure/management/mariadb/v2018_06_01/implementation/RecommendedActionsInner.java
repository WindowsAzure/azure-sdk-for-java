/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

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
 * in RecommendedActions.
 */
public class RecommendedActionsInner {
    /** The Retrofit service to perform REST calls. */
    private RecommendedActionsService service;
    /** The service client containing this operation class. */
    private MariaDBManagementClientImpl client;

    /**
     * Initializes an instance of RecommendedActionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RecommendedActionsInner(Retrofit retrofit, MariaDBManagementClientImpl client) {
        this.service = retrofit.create(RecommendedActionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RecommendedActions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RecommendedActionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2018_06_01.RecommendedActions get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMariaDB/servers/{serverName}/advisors/{advisorName}/recommendedActions/{recommendedActionName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("advisorName") String advisorName, @Path("recommendedActionName") String recommendedActionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2018_06_01.RecommendedActions listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMariaDB/servers/{serverName}/advisors/{advisorName}/recommendedActions")
        Observable<Response<ResponseBody>> listByServer(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("advisorName") String advisorName, @Query("api-version") String apiVersion, @Query("sessionId") String sessionId, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2018_06_01.RecommendedActions listByServerNext" })
        @GET
        Observable<Response<ResponseBody>> listByServerNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RecommendationActionInner object if successful.
     */
    public RecommendationActionInner get(String resourceGroupName, String serverName, String advisorName, String recommendedActionName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, advisorName, recommendedActionName).toBlocking().single().body();
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RecommendationActionInner> getAsync(String resourceGroupName, String serverName, String advisorName, String recommendedActionName, final ServiceCallback<RecommendationActionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, advisorName, recommendedActionName), serviceCallback);
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecommendationActionInner object
     */
    public Observable<RecommendationActionInner> getAsync(String resourceGroupName, String serverName, String advisorName, String recommendedActionName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, advisorName, recommendedActionName).map(new Func1<ServiceResponse<RecommendationActionInner>, RecommendationActionInner>() {
            @Override
            public RecommendationActionInner call(ServiceResponse<RecommendationActionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecommendationActionInner object
     */
    public Observable<ServiceResponse<RecommendationActionInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String advisorName, String recommendedActionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (recommendedActionName == null) {
            throw new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, advisorName, recommendedActionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RecommendationActionInner>>>() {
                @Override
                public Observable<ServiceResponse<RecommendationActionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RecommendationActionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RecommendationActionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RecommendationActionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RecommendationActionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RecommendationActionInner&gt; object if successful.
     */
    public PagedList<RecommendationActionInner> listByServer(final String resourceGroupName, final String serverName, final String advisorName) {
        ServiceResponse<Page<RecommendationActionInner>> response = listByServerSinglePageAsync(resourceGroupName, serverName, advisorName).toBlocking().single();
        return new PagedList<RecommendationActionInner>(response.body()) {
            @Override
            public Page<RecommendationActionInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecommendationActionInner>> listByServerAsync(final String resourceGroupName, final String serverName, final String advisorName, final ListOperationCallback<RecommendationActionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerSinglePageAsync(resourceGroupName, serverName, advisorName),
            new Func1<String, Observable<ServiceResponse<Page<RecommendationActionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecommendationActionInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecommendationActionInner&gt; object
     */
    public Observable<Page<RecommendationActionInner>> listByServerAsync(final String resourceGroupName, final String serverName, final String advisorName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName, advisorName)
            .map(new Func1<ServiceResponse<Page<RecommendationActionInner>>, Page<RecommendationActionInner>>() {
                @Override
                public Page<RecommendationActionInner> call(ServiceResponse<Page<RecommendationActionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecommendationActionInner&gt; object
     */
    public Observable<ServiceResponse<Page<RecommendationActionInner>>> listByServerWithServiceResponseAsync(final String resourceGroupName, final String serverName, final String advisorName) {
        return listByServerSinglePageAsync(resourceGroupName, serverName, advisorName)
            .concatMap(new Func1<ServiceResponse<Page<RecommendationActionInner>>, Observable<ServiceResponse<Page<RecommendationActionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecommendationActionInner>>> call(ServiceResponse<Page<RecommendationActionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RecommendationActionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RecommendationActionInner>>> listByServerSinglePageAsync(final String resourceGroupName, final String serverName, final String advisorName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String sessionId = null;
        return service.listByServer(this.client.subscriptionId(), resourceGroupName, serverName, advisorName, this.client.apiVersion(), sessionId, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RecommendationActionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecommendationActionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<RecommendationActionInner>> result = listByServerDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RecommendationActionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param sessionId The recommendation action session identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RecommendationActionInner&gt; object if successful.
     */
    public PagedList<RecommendationActionInner> listByServer(final String resourceGroupName, final String serverName, final String advisorName, final String sessionId) {
        ServiceResponse<Page<RecommendationActionInner>> response = listByServerSinglePageAsync(resourceGroupName, serverName, advisorName, sessionId).toBlocking().single();
        return new PagedList<RecommendationActionInner>(response.body()) {
            @Override
            public Page<RecommendationActionInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param sessionId The recommendation action session identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecommendationActionInner>> listByServerAsync(final String resourceGroupName, final String serverName, final String advisorName, final String sessionId, final ListOperationCallback<RecommendationActionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerSinglePageAsync(resourceGroupName, serverName, advisorName, sessionId),
            new Func1<String, Observable<ServiceResponse<Page<RecommendationActionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecommendationActionInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param sessionId The recommendation action session identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecommendationActionInner&gt; object
     */
    public Observable<Page<RecommendationActionInner>> listByServerAsync(final String resourceGroupName, final String serverName, final String advisorName, final String sessionId) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName, advisorName, sessionId)
            .map(new Func1<ServiceResponse<Page<RecommendationActionInner>>, Page<RecommendationActionInner>>() {
                @Override
                public Page<RecommendationActionInner> call(ServiceResponse<Page<RecommendationActionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param sessionId The recommendation action session identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecommendationActionInner&gt; object
     */
    public Observable<ServiceResponse<Page<RecommendationActionInner>>> listByServerWithServiceResponseAsync(final String resourceGroupName, final String serverName, final String advisorName, final String sessionId) {
        return listByServerSinglePageAsync(resourceGroupName, serverName, advisorName, sessionId)
            .concatMap(new Func1<ServiceResponse<Page<RecommendationActionInner>>, Observable<ServiceResponse<Page<RecommendationActionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecommendationActionInner>>> call(ServiceResponse<Page<RecommendationActionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
    ServiceResponse<PageImpl1<RecommendationActionInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl1<RecommendationActionInner>> * @param serverName The name of the server.
    ServiceResponse<PageImpl1<RecommendationActionInner>> * @param advisorName The advisor name for recommendation action.
    ServiceResponse<PageImpl1<RecommendationActionInner>> * @param sessionId The recommendation action session identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RecommendationActionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RecommendationActionInner>>> listByServerSinglePageAsync(final String resourceGroupName, final String serverName, final String advisorName, final String sessionId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByServer(this.client.subscriptionId(), resourceGroupName, serverName, advisorName, this.client.apiVersion(), sessionId, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RecommendationActionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecommendationActionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<RecommendationActionInner>> result = listByServerDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RecommendationActionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<RecommendationActionInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<RecommendationActionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<RecommendationActionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RecommendationActionInner&gt; object if successful.
     */
    public PagedList<RecommendationActionInner> listByServerNext(final String nextPageLink) {
        ServiceResponse<Page<RecommendationActionInner>> response = listByServerNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RecommendationActionInner>(response.body()) {
            @Override
            public Page<RecommendationActionInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecommendationActionInner>> listByServerNextAsync(final String nextPageLink, final ServiceFuture<List<RecommendationActionInner>> serviceFuture, final ListOperationCallback<RecommendationActionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RecommendationActionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecommendationActionInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecommendationActionInner&gt; object
     */
    public Observable<Page<RecommendationActionInner>> listByServerNextAsync(final String nextPageLink) {
        return listByServerNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RecommendationActionInner>>, Page<RecommendationActionInner>>() {
                @Override
                public Page<RecommendationActionInner> call(ServiceResponse<Page<RecommendationActionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RecommendationActionInner&gt; object
     */
    public Observable<ServiceResponse<Page<RecommendationActionInner>>> listByServerNextWithServiceResponseAsync(final String nextPageLink) {
        return listByServerNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RecommendationActionInner>>, Observable<ServiceResponse<Page<RecommendationActionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecommendationActionInner>>> call(ServiceResponse<Page<RecommendationActionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
    ServiceResponse<PageImpl1<RecommendationActionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RecommendationActionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RecommendationActionInner>>> listByServerNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByServerNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RecommendationActionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RecommendationActionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<RecommendationActionInner>> result = listByServerNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RecommendationActionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<RecommendationActionInner>> listByServerNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<RecommendationActionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<RecommendationActionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
