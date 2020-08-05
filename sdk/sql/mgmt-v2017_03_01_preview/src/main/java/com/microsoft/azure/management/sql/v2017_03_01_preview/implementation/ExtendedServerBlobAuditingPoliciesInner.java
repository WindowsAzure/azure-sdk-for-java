/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

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
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ExtendedServerBlobAuditingPolicies.
 */
public class ExtendedServerBlobAuditingPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private ExtendedServerBlobAuditingPoliciesService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ExtendedServerBlobAuditingPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ExtendedServerBlobAuditingPoliciesInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(ExtendedServerBlobAuditingPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ExtendedServerBlobAuditingPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExtendedServerBlobAuditingPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ExtendedServerBlobAuditingPolicies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/extendedAuditingSettings/{blobAuditingPolicyName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("blobAuditingPolicyName") String blobAuditingPolicyName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ExtendedServerBlobAuditingPolicies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/extendedAuditingSettings/{blobAuditingPolicyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("blobAuditingPolicyName") String blobAuditingPolicyName, @Path("subscriptionId") String subscriptionId, @Body ExtendedServerBlobAuditingPolicyInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ExtendedServerBlobAuditingPolicies beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/extendedAuditingSettings/{blobAuditingPolicyName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("blobAuditingPolicyName") String blobAuditingPolicyName, @Path("subscriptionId") String subscriptionId, @Body ExtendedServerBlobAuditingPolicyInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ExtendedServerBlobAuditingPolicies listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/extendedAuditingSettings")
        Observable<Response<ResponseBody>> listByServer(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ExtendedServerBlobAuditingPolicies listByServerNext" })
        @GET
        Observable<Response<ResponseBody>> listByServerNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExtendedServerBlobAuditingPolicyInner object if successful.
     */
    public ExtendedServerBlobAuditingPolicyInner get(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExtendedServerBlobAuditingPolicyInner> getAsync(String resourceGroupName, String serverName, final ServiceCallback<ExtendedServerBlobAuditingPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExtendedServerBlobAuditingPolicyInner object
     */
    public Observable<ExtendedServerBlobAuditingPolicyInner> getAsync(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<ExtendedServerBlobAuditingPolicyInner>, ExtendedServerBlobAuditingPolicyInner>() {
            @Override
            public ExtendedServerBlobAuditingPolicyInner call(ServiceResponse<ExtendedServerBlobAuditingPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExtendedServerBlobAuditingPolicyInner object
     */
    public Observable<ServiceResponse<ExtendedServerBlobAuditingPolicyInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String blobAuditingPolicyName = "default";
        return service.get(resourceGroupName, serverName, blobAuditingPolicyName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExtendedServerBlobAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ExtendedServerBlobAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExtendedServerBlobAuditingPolicyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExtendedServerBlobAuditingPolicyInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ExtendedServerBlobAuditingPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ExtendedServerBlobAuditingPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters Properties of extended blob auditing policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExtendedServerBlobAuditingPolicyInner object if successful.
     */
    public ExtendedServerBlobAuditingPolicyInner createOrUpdate(String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters).toBlocking().last().body();
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters Properties of extended blob auditing policy
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExtendedServerBlobAuditingPolicyInner> createOrUpdateAsync(String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters, final ServiceCallback<ExtendedServerBlobAuditingPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters), serviceCallback);
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters Properties of extended blob auditing policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ExtendedServerBlobAuditingPolicyInner> createOrUpdateAsync(String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters).map(new Func1<ServiceResponse<ExtendedServerBlobAuditingPolicyInner>, ExtendedServerBlobAuditingPolicyInner>() {
            @Override
            public ExtendedServerBlobAuditingPolicyInner call(ServiceResponse<ExtendedServerBlobAuditingPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters Properties of extended blob auditing policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ExtendedServerBlobAuditingPolicyInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
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
        final String blobAuditingPolicyName = "default";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, serverName, blobAuditingPolicyName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<ExtendedServerBlobAuditingPolicyInner>() { }.getType());
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters Properties of extended blob auditing policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExtendedServerBlobAuditingPolicyInner object if successful.
     */
    public ExtendedServerBlobAuditingPolicyInner beginCreateOrUpdate(String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters Properties of extended blob auditing policy
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExtendedServerBlobAuditingPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters, final ServiceCallback<ExtendedServerBlobAuditingPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters), serviceCallback);
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters Properties of extended blob auditing policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExtendedServerBlobAuditingPolicyInner object
     */
    public Observable<ExtendedServerBlobAuditingPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters).map(new Func1<ServiceResponse<ExtendedServerBlobAuditingPolicyInner>, ExtendedServerBlobAuditingPolicyInner>() {
            @Override
            public ExtendedServerBlobAuditingPolicyInner call(ServiceResponse<ExtendedServerBlobAuditingPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters Properties of extended blob auditing policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExtendedServerBlobAuditingPolicyInner object
     */
    public Observable<ServiceResponse<ExtendedServerBlobAuditingPolicyInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
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
        final String blobAuditingPolicyName = "default";
        return service.beginCreateOrUpdate(resourceGroupName, serverName, blobAuditingPolicyName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExtendedServerBlobAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ExtendedServerBlobAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExtendedServerBlobAuditingPolicyInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExtendedServerBlobAuditingPolicyInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ExtendedServerBlobAuditingPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ExtendedServerBlobAuditingPolicyInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists extended auditing settings of a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExtendedServerBlobAuditingPolicyInner&gt; object if successful.
     */
    public PagedList<ExtendedServerBlobAuditingPolicyInner> listByServer(final String resourceGroupName, final String serverName) {
        ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>> response = listByServerSinglePageAsync(resourceGroupName, serverName).toBlocking().single();
        return new PagedList<ExtendedServerBlobAuditingPolicyInner>(response.body()) {
            @Override
            public Page<ExtendedServerBlobAuditingPolicyInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists extended auditing settings of a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExtendedServerBlobAuditingPolicyInner>> listByServerAsync(final String resourceGroupName, final String serverName, final ListOperationCallback<ExtendedServerBlobAuditingPolicyInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerSinglePageAsync(resourceGroupName, serverName),
            new Func1<String, Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists extended auditing settings of a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExtendedServerBlobAuditingPolicyInner&gt; object
     */
    public Observable<Page<ExtendedServerBlobAuditingPolicyInner>> listByServerAsync(final String resourceGroupName, final String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName)
            .map(new Func1<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>, Page<ExtendedServerBlobAuditingPolicyInner>>() {
                @Override
                public Page<ExtendedServerBlobAuditingPolicyInner> call(ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists extended auditing settings of a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExtendedServerBlobAuditingPolicyInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>> listByServerWithServiceResponseAsync(final String resourceGroupName, final String serverName) {
        return listByServerSinglePageAsync(resourceGroupName, serverName)
            .concatMap(new Func1<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>, Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>> call(ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists extended auditing settings of a server.
     *
    ServiceResponse<PageImpl<ExtendedServerBlobAuditingPolicyInner>> * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
    ServiceResponse<PageImpl<ExtendedServerBlobAuditingPolicyInner>> * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExtendedServerBlobAuditingPolicyInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>> listByServerSinglePageAsync(final String resourceGroupName, final String serverName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByServer(resourceGroupName, serverName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExtendedServerBlobAuditingPolicyInner>> result = listByServerDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExtendedServerBlobAuditingPolicyInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ExtendedServerBlobAuditingPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ExtendedServerBlobAuditingPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists extended auditing settings of a server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExtendedServerBlobAuditingPolicyInner&gt; object if successful.
     */
    public PagedList<ExtendedServerBlobAuditingPolicyInner> listByServerNext(final String nextPageLink) {
        ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>> response = listByServerNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ExtendedServerBlobAuditingPolicyInner>(response.body()) {
            @Override
            public Page<ExtendedServerBlobAuditingPolicyInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists extended auditing settings of a server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExtendedServerBlobAuditingPolicyInner>> listByServerNextAsync(final String nextPageLink, final ServiceFuture<List<ExtendedServerBlobAuditingPolicyInner>> serviceFuture, final ListOperationCallback<ExtendedServerBlobAuditingPolicyInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists extended auditing settings of a server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExtendedServerBlobAuditingPolicyInner&gt; object
     */
    public Observable<Page<ExtendedServerBlobAuditingPolicyInner>> listByServerNextAsync(final String nextPageLink) {
        return listByServerNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>, Page<ExtendedServerBlobAuditingPolicyInner>>() {
                @Override
                public Page<ExtendedServerBlobAuditingPolicyInner> call(ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists extended auditing settings of a server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExtendedServerBlobAuditingPolicyInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>> listByServerNextWithServiceResponseAsync(final String nextPageLink) {
        return listByServerNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>, Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>> call(ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists extended auditing settings of a server.
     *
    ServiceResponse<PageImpl<ExtendedServerBlobAuditingPolicyInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExtendedServerBlobAuditingPolicyInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>> listByServerNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByServerNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExtendedServerBlobAuditingPolicyInner>> result = listByServerNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExtendedServerBlobAuditingPolicyInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExtendedServerBlobAuditingPolicyInner>> listByServerNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ExtendedServerBlobAuditingPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ExtendedServerBlobAuditingPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
