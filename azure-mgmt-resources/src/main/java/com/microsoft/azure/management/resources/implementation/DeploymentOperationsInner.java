/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
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
 * in DeploymentOperations.
 */
public final class DeploymentOperationsInner {
    /** The Retrofit service to perform REST calls. */
    private DeploymentOperationsService service;
    /** The service client containing this operation class. */
    private ResourceManagementClientImpl client;

    /**
     * Initializes an instance of DeploymentOperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DeploymentOperationsInner(Retrofit retrofit, ResourceManagementClientImpl client) {
        this.service = retrofit.create(DeploymentOperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DeploymentOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DeploymentOperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.DeploymentOperations get" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/deployments/{deploymentName}/operations/{operationId}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("operationId") String operationId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.DeploymentOperations list" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/deployments/{deploymentName}/operations")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("subscriptionId") String subscriptionId, @Query("$top") Integer top, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.DeploymentOperations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @return the DeploymentOperationInner object if successful.
     */
    public DeploymentOperationInner get(String resourceGroupName, String deploymentName, String operationId) {
        return getWithServiceResponseAsync(resourceGroupName, deploymentName, operationId).toBlocking().single().body();
    }

    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeploymentOperationInner> getAsync(String resourceGroupName, String deploymentName, String operationId, final ServiceCallback<DeploymentOperationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, deploymentName, operationId), serviceCallback);
    }

    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @return the observable to the DeploymentOperationInner object
     */
    public Observable<DeploymentOperationInner> getAsync(String resourceGroupName, String deploymentName, String operationId) {
        return getWithServiceResponseAsync(resourceGroupName, deploymentName, operationId).map(new Func1<ServiceResponse<DeploymentOperationInner>, DeploymentOperationInner>() {
            @Override
            public DeploymentOperationInner call(ServiceResponse<DeploymentOperationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @return the observable to the DeploymentOperationInner object
     */
    public Observable<ServiceResponse<DeploymentOperationInner>> getWithServiceResponseAsync(String resourceGroupName, String deploymentName, String operationId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (deploymentName == null) {
            throw new IllegalArgumentException("Parameter deploymentName is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, deploymentName, operationId, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeploymentOperationInner>>>() {
                @Override
                public Observable<ServiceResponse<DeploymentOperationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeploymentOperationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeploymentOperationInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DeploymentOperationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DeploymentOperationInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @return the PagedList&lt;DeploymentOperationInner&gt; object if successful.
     */
    public PagedList<DeploymentOperationInner> list(final String resourceGroupName, final String deploymentName) {
        ServiceResponse<Page<DeploymentOperationInner>> response = listSinglePageAsync(resourceGroupName, deploymentName).toBlocking().single();
        return new PagedList<DeploymentOperationInner>(response.body()) {
            @Override
            public Page<DeploymentOperationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DeploymentOperationInner>> listAsync(final String resourceGroupName, final String deploymentName, final ListOperationCallback<DeploymentOperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, deploymentName),
            new Func1<String, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<Page<DeploymentOperationInner>> listAsync(final String resourceGroupName, final String deploymentName) {
        return listWithServiceResponseAsync(resourceGroupName, deploymentName)
            .map(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Page<DeploymentOperationInner>>() {
                @Override
                public Page<DeploymentOperationInner> call(ServiceResponse<Page<DeploymentOperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String deploymentName) {
        return listSinglePageAsync(resourceGroupName, deploymentName)
            .concatMap(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(ServiceResponse<Page<DeploymentOperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @return the PagedList&lt;DeploymentOperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listSinglePageAsync(final String resourceGroupName, final String deploymentName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (deploymentName == null) {
            throw new IllegalArgumentException("Parameter deploymentName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Integer top = null;
        return service.list(resourceGroupName, deploymentName, this.client.subscriptionId(), top, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DeploymentOperationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DeploymentOperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @param top The number of results to return.
     * @return the PagedList&lt;DeploymentOperationInner&gt; object if successful.
     */
    public PagedList<DeploymentOperationInner> list(final String resourceGroupName, final String deploymentName, final Integer top) {
        ServiceResponse<Page<DeploymentOperationInner>> response = listSinglePageAsync(resourceGroupName, deploymentName, top).toBlocking().single();
        return new PagedList<DeploymentOperationInner>(response.body()) {
            @Override
            public Page<DeploymentOperationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @param top The number of results to return.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DeploymentOperationInner>> listAsync(final String resourceGroupName, final String deploymentName, final Integer top, final ListOperationCallback<DeploymentOperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, deploymentName, top),
            new Func1<String, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @param top The number of results to return.
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<Page<DeploymentOperationInner>> listAsync(final String resourceGroupName, final String deploymentName, final Integer top) {
        return listWithServiceResponseAsync(resourceGroupName, deploymentName, top)
            .map(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Page<DeploymentOperationInner>>() {
                @Override
                public Page<DeploymentOperationInner> call(ServiceResponse<Page<DeploymentOperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment with the operation to get.
     * @param top The number of results to return.
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String deploymentName, final Integer top) {
        return listSinglePageAsync(resourceGroupName, deploymentName, top)
            .concatMap(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(ServiceResponse<Page<DeploymentOperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
    ServiceResponse<PageImpl<DeploymentOperationInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<DeploymentOperationInner>> * @param deploymentName The name of the deployment with the operation to get.
    ServiceResponse<PageImpl<DeploymentOperationInner>> * @param top The number of results to return.
     * @return the PagedList&lt;DeploymentOperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listSinglePageAsync(final String resourceGroupName, final String deploymentName, final Integer top) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (deploymentName == null) {
            throw new IllegalArgumentException("Parameter deploymentName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceGroupName, deploymentName, this.client.subscriptionId(), top, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DeploymentOperationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DeploymentOperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DeploymentOperationInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DeploymentOperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DeploymentOperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PagedList&lt;DeploymentOperationInner&gt; object if successful.
     */
    public PagedList<DeploymentOperationInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<DeploymentOperationInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<DeploymentOperationInner>(response.body()) {
            @Override
            public Page<DeploymentOperationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DeploymentOperationInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<DeploymentOperationInner>> serviceFuture, final ListOperationCallback<DeploymentOperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<Page<DeploymentOperationInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Page<DeploymentOperationInner>>() {
                @Override
                public Page<DeploymentOperationInner> call(ServiceResponse<Page<DeploymentOperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the PagedList&lt;DeploymentOperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<DeploymentOperationInner>>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(ServiceResponse<Page<DeploymentOperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all deployments operations for a deployment.
     *
    ServiceResponse<PageImpl<DeploymentOperationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PagedList&lt;DeploymentOperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DeploymentOperationInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DeploymentOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeploymentOperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DeploymentOperationInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DeploymentOperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DeploymentOperationInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DeploymentOperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DeploymentOperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
