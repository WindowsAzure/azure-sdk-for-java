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
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.UpdateIntegrationRuntimeNodeRequest;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in IntegrationRuntimeNodes.
 */
public class IntegrationRuntimeNodesInner {
    /** The Retrofit service to perform REST calls. */
    private IntegrationRuntimeNodesService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationRuntimeNodesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntegrationRuntimeNodesInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(IntegrationRuntimeNodesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for IntegrationRuntimeNodes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntegrationRuntimeNodesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeNodes get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/nodes/{nodeName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("integrationRuntimeName") String integrationRuntimeName, @Path("nodeName") String nodeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeNodes update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/nodes/{nodeName}")
        Observable<Response<ResponseBody>> update(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("integrationRuntimeName") String integrationRuntimeName, @Path("nodeName") String nodeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeNodes delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/nodes/{nodeName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("integrationRuntimeName") String integrationRuntimeName, @Path("nodeName") String nodeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get integration runtime node.
     * Get an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SelfHostedIntegrationRuntimeNodeInner object if successful.
     */
    public SelfHostedIntegrationRuntimeNodeInner get(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName).toBlocking().single().body();
    }

    /**
     * Get integration runtime node.
     * Get an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SelfHostedIntegrationRuntimeNodeInner> getAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName, final ServiceCallback<SelfHostedIntegrationRuntimeNodeInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName), serviceCallback);
    }

    /**
     * Get integration runtime node.
     * Get an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<SelfHostedIntegrationRuntimeNodeInner> getAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName).map(new Func1<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>, SelfHostedIntegrationRuntimeNodeInner>() {
            @Override
            public SelfHostedIntegrationRuntimeNodeInner call(ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get integration runtime node.
     * Get an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (nodeName == null) {
            throw new IllegalArgumentException("Parameter nodeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, integrationRuntimeName, nodeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>>>() {
                @Override
                public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SelfHostedIntegrationRuntimeNodeInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SelfHostedIntegrationRuntimeNodeInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create integration runtime node.
     * Create an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SelfHostedIntegrationRuntimeNodeInner object if successful.
     */
    public SelfHostedIntegrationRuntimeNodeInner update(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        return updateWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName).toBlocking().single().body();
    }

    /**
     * Create integration runtime node.
     * Create an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SelfHostedIntegrationRuntimeNodeInner> updateAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName, final ServiceCallback<SelfHostedIntegrationRuntimeNodeInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName), serviceCallback);
    }

    /**
     * Create integration runtime node.
     * Create an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<SelfHostedIntegrationRuntimeNodeInner> updateAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        return updateWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName).map(new Func1<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>, SelfHostedIntegrationRuntimeNodeInner>() {
            @Override
            public SelfHostedIntegrationRuntimeNodeInner call(ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create integration runtime node.
     * Create an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> updateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (nodeName == null) {
            throw new IllegalArgumentException("Parameter nodeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Integer concurrentJobsLimit = null;
        UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest = new UpdateIntegrationRuntimeNodeRequest();
        updateIntegrationRuntimeNodeRequest.withConcurrentJobsLimit(null);
        return service.update(this.client.subscriptionId(), resourceGroupName, workspaceName, integrationRuntimeName, nodeName, this.client.apiVersion(), this.client.acceptLanguage(), updateIntegrationRuntimeNodeRequest, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>>>() {
                @Override
                public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create integration runtime node.
     * Create an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @param concurrentJobsLimit The number of concurrent jobs permitted to run on the integration runtime node. Values between 1 and maxConcurrentJobs(inclusive) are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SelfHostedIntegrationRuntimeNodeInner object if successful.
     */
    public SelfHostedIntegrationRuntimeNodeInner update(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName, Integer concurrentJobsLimit) {
        return updateWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName, concurrentJobsLimit).toBlocking().single().body();
    }

    /**
     * Create integration runtime node.
     * Create an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @param concurrentJobsLimit The number of concurrent jobs permitted to run on the integration runtime node. Values between 1 and maxConcurrentJobs(inclusive) are allowed.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SelfHostedIntegrationRuntimeNodeInner> updateAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName, Integer concurrentJobsLimit, final ServiceCallback<SelfHostedIntegrationRuntimeNodeInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName, concurrentJobsLimit), serviceCallback);
    }

    /**
     * Create integration runtime node.
     * Create an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @param concurrentJobsLimit The number of concurrent jobs permitted to run on the integration runtime node. Values between 1 and maxConcurrentJobs(inclusive) are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<SelfHostedIntegrationRuntimeNodeInner> updateAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName, Integer concurrentJobsLimit) {
        return updateWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName, concurrentJobsLimit).map(new Func1<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>, SelfHostedIntegrationRuntimeNodeInner>() {
            @Override
            public SelfHostedIntegrationRuntimeNodeInner call(ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create integration runtime node.
     * Create an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @param concurrentJobsLimit The number of concurrent jobs permitted to run on the integration runtime node. Values between 1 and maxConcurrentJobs(inclusive) are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SelfHostedIntegrationRuntimeNodeInner object
     */
    public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> updateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName, Integer concurrentJobsLimit) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (nodeName == null) {
            throw new IllegalArgumentException("Parameter nodeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest = new UpdateIntegrationRuntimeNodeRequest();
        updateIntegrationRuntimeNodeRequest.withConcurrentJobsLimit(concurrentJobsLimit);
        return service.update(this.client.subscriptionId(), resourceGroupName, workspaceName, integrationRuntimeName, nodeName, this.client.apiVersion(), this.client.acceptLanguage(), updateIntegrationRuntimeNodeRequest, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>>>() {
                @Override
                public Observable<ServiceResponse<SelfHostedIntegrationRuntimeNodeInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SelfHostedIntegrationRuntimeNodeInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SelfHostedIntegrationRuntimeNodeInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SelfHostedIntegrationRuntimeNodeInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete integration runtime node.
     * Delete an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        deleteWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName).toBlocking().single().body();
    }

    /**
     * Delete integration runtime node.
     * Delete an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName), serviceCallback);
    }

    /**
     * Delete integration runtime node.
     * Delete an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        return deleteWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete integration runtime node.
     * Delete an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (nodeName == null) {
            throw new IllegalArgumentException("Parameter nodeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, workspaceName, integrationRuntimeName, nodeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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

}
