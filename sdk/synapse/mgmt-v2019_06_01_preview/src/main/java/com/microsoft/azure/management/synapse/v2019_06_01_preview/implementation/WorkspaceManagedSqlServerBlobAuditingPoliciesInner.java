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
 * in WorkspaceManagedSqlServerBlobAuditingPolicies.
 */
public class WorkspaceManagedSqlServerBlobAuditingPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private WorkspaceManagedSqlServerBlobAuditingPoliciesService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of WorkspaceManagedSqlServerBlobAuditingPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WorkspaceManagedSqlServerBlobAuditingPoliciesInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(WorkspaceManagedSqlServerBlobAuditingPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WorkspaceManagedSqlServerBlobAuditingPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WorkspaceManagedSqlServerBlobAuditingPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceManagedSqlServerBlobAuditingPolicies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/auditingSettings/{blobAuditingPolicyName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("blobAuditingPolicyName") String blobAuditingPolicyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceManagedSqlServerBlobAuditingPolicies listByWorkspace" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/auditingSettings")
        Observable<Response<ResponseBody>> listByWorkspace(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceManagedSqlServerBlobAuditingPolicies listByWorkspaceNext" })
        @GET
        Observable<Response<ResponseBody>> listByWorkspaceNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get server's blob auditing policy.
     * Get a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerBlobAuditingPolicyInner object if successful.
     */
    public ServerBlobAuditingPolicyInner get(String resourceGroupName, String workspaceName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Get server's blob auditing policy.
     * Get a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerBlobAuditingPolicyInner> getAsync(String resourceGroupName, String workspaceName, final ServiceCallback<ServerBlobAuditingPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Get server's blob auditing policy.
     * Get a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerBlobAuditingPolicyInner object
     */
    public Observable<ServerBlobAuditingPolicyInner> getAsync(String resourceGroupName, String workspaceName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<ServerBlobAuditingPolicyInner>, ServerBlobAuditingPolicyInner>() {
            @Override
            public ServerBlobAuditingPolicyInner call(ServiceResponse<ServerBlobAuditingPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get server's blob auditing policy.
     * Get a workspace managed sql server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerBlobAuditingPolicyInner object
     */
    public Observable<ServiceResponse<ServerBlobAuditingPolicyInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String blobAuditingPolicyName = "default";
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, blobAuditingPolicyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerBlobAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerBlobAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerBlobAuditingPolicyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerBlobAuditingPolicyInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerBlobAuditingPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerBlobAuditingPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ServerBlobAuditingPolicyInner&gt; object if successful.
     */
    public PagedList<ServerBlobAuditingPolicyInner> listByWorkspace(final String resourceGroupName, final String workspaceName) {
        ServiceResponse<Page<ServerBlobAuditingPolicyInner>> response = listByWorkspaceSinglePageAsync(resourceGroupName, workspaceName).toBlocking().single();
        return new PagedList<ServerBlobAuditingPolicyInner>(response.body()) {
            @Override
            public Page<ServerBlobAuditingPolicyInner> nextPage(String nextPageLink) {
                return listByWorkspaceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServerBlobAuditingPolicyInner>> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName, final ListOperationCallback<ServerBlobAuditingPolicyInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByWorkspaceSinglePageAsync(resourceGroupName, workspaceName),
            new Func1<String, Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>> call(String nextPageLink) {
                    return listByWorkspaceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServerBlobAuditingPolicyInner&gt; object
     */
    public Observable<Page<ServerBlobAuditingPolicyInner>> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName)
            .map(new Func1<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>, Page<ServerBlobAuditingPolicyInner>>() {
                @Override
                public Page<ServerBlobAuditingPolicyInner> call(ServiceResponse<Page<ServerBlobAuditingPolicyInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServerBlobAuditingPolicyInner&gt; object
     */
    public Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>> listByWorkspaceWithServiceResponseAsync(final String resourceGroupName, final String workspaceName) {
        return listByWorkspaceSinglePageAsync(resourceGroupName, workspaceName)
            .concatMap(new Func1<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>, Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>> call(ServiceResponse<Page<ServerBlobAuditingPolicyInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByWorkspaceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
    ServiceResponse<PageImpl<ServerBlobAuditingPolicyInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<ServerBlobAuditingPolicyInner>> * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ServerBlobAuditingPolicyInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>> listByWorkspaceSinglePageAsync(final String resourceGroupName, final String workspaceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByWorkspace(this.client.subscriptionId(), resourceGroupName, workspaceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ServerBlobAuditingPolicyInner>> result = listByWorkspaceDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ServerBlobAuditingPolicyInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ServerBlobAuditingPolicyInner>> listByWorkspaceDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ServerBlobAuditingPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ServerBlobAuditingPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ServerBlobAuditingPolicyInner&gt; object if successful.
     */
    public PagedList<ServerBlobAuditingPolicyInner> listByWorkspaceNext(final String nextPageLink) {
        ServiceResponse<Page<ServerBlobAuditingPolicyInner>> response = listByWorkspaceNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ServerBlobAuditingPolicyInner>(response.body()) {
            @Override
            public Page<ServerBlobAuditingPolicyInner> nextPage(String nextPageLink) {
                return listByWorkspaceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServerBlobAuditingPolicyInner>> listByWorkspaceNextAsync(final String nextPageLink, final ServiceFuture<List<ServerBlobAuditingPolicyInner>> serviceFuture, final ListOperationCallback<ServerBlobAuditingPolicyInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByWorkspaceNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>> call(String nextPageLink) {
                    return listByWorkspaceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServerBlobAuditingPolicyInner&gt; object
     */
    public Observable<Page<ServerBlobAuditingPolicyInner>> listByWorkspaceNextAsync(final String nextPageLink) {
        return listByWorkspaceNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>, Page<ServerBlobAuditingPolicyInner>>() {
                @Override
                public Page<ServerBlobAuditingPolicyInner> call(ServiceResponse<Page<ServerBlobAuditingPolicyInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServerBlobAuditingPolicyInner&gt; object
     */
    public Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>> listByWorkspaceNextWithServiceResponseAsync(final String nextPageLink) {
        return listByWorkspaceNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>, Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>> call(ServiceResponse<Page<ServerBlobAuditingPolicyInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByWorkspaceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List workspace server's blob auditing policies.
     * List workspace managed sql server's blob auditing policies.
     *
    ServiceResponse<PageImpl<ServerBlobAuditingPolicyInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ServerBlobAuditingPolicyInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>> listByWorkspaceNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByWorkspaceNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerBlobAuditingPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ServerBlobAuditingPolicyInner>> result = listByWorkspaceNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ServerBlobAuditingPolicyInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ServerBlobAuditingPolicyInner>> listByWorkspaceNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ServerBlobAuditingPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ServerBlobAuditingPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
