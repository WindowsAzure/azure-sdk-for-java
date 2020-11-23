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
import com.microsoft.azure.management.synapse.v2019_06_01_preview.GetSsisObjectMetadataRequest;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in IntegrationRuntimeObjectMetadatas.
 */
public class IntegrationRuntimeObjectMetadatasInner {
    /** The Retrofit service to perform REST calls. */
    private IntegrationRuntimeObjectMetadatasService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationRuntimeObjectMetadatasInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntegrationRuntimeObjectMetadatasInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(IntegrationRuntimeObjectMetadatasService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for IntegrationRuntimeObjectMetadatas to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntegrationRuntimeObjectMetadatasService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeObjectMetadatas list" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/getObjectMetadata")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("integrationRuntimeName") String integrationRuntimeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body GetSsisObjectMetadataRequest getMetadataRequest, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeObjectMetadatas refresh" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/refreshObjectMetadata")
        Observable<Response<ResponseBody>> refresh(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("integrationRuntimeName") String integrationRuntimeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeObjectMetadatas beginRefresh" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/refreshObjectMetadata")
        Observable<Response<ResponseBody>> beginRefresh(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("integrationRuntimeName") String integrationRuntimeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get integration runtime object metadata.
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SsisObjectMetadataListResponseInner object if successful.
     */
    public SsisObjectMetadataListResponseInner list(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName).toBlocking().single().body();
    }

    /**
     * Get integration runtime object metadata.
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SsisObjectMetadataListResponseInner> listAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, final ServiceCallback<SsisObjectMetadataListResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName), serviceCallback);
    }

    /**
     * Get integration runtime object metadata.
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SsisObjectMetadataListResponseInner object
     */
    public Observable<SsisObjectMetadataListResponseInner> listAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName).map(new Func1<ServiceResponse<SsisObjectMetadataListResponseInner>, SsisObjectMetadataListResponseInner>() {
            @Override
            public SsisObjectMetadataListResponseInner call(ServiceResponse<SsisObjectMetadataListResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get integration runtime object metadata.
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SsisObjectMetadataListResponseInner object
     */
    public Observable<ServiceResponse<SsisObjectMetadataListResponseInner>> listWithServiceResponseAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
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
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String metadataPath = null;
        GetSsisObjectMetadataRequest getMetadataRequest = new GetSsisObjectMetadataRequest();
        getMetadataRequest.withMetadataPath(null);
        return service.list(this.client.subscriptionId(), resourceGroupName, workspaceName, integrationRuntimeName, this.client.apiVersion(), this.client.acceptLanguage(), getMetadataRequest, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SsisObjectMetadataListResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<SsisObjectMetadataListResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SsisObjectMetadataListResponseInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get integration runtime object metadata.
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @param metadataPath Metadata path.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SsisObjectMetadataListResponseInner object if successful.
     */
    public SsisObjectMetadataListResponseInner list(String resourceGroupName, String workspaceName, String integrationRuntimeName, String metadataPath) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, metadataPath).toBlocking().single().body();
    }

    /**
     * Get integration runtime object metadata.
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @param metadataPath Metadata path.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SsisObjectMetadataListResponseInner> listAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String metadataPath, final ServiceCallback<SsisObjectMetadataListResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, metadataPath), serviceCallback);
    }

    /**
     * Get integration runtime object metadata.
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @param metadataPath Metadata path.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SsisObjectMetadataListResponseInner object
     */
    public Observable<SsisObjectMetadataListResponseInner> listAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String metadataPath) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, metadataPath).map(new Func1<ServiceResponse<SsisObjectMetadataListResponseInner>, SsisObjectMetadataListResponseInner>() {
            @Override
            public SsisObjectMetadataListResponseInner call(ServiceResponse<SsisObjectMetadataListResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get integration runtime object metadata.
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @param metadataPath Metadata path.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SsisObjectMetadataListResponseInner object
     */
    public Observable<ServiceResponse<SsisObjectMetadataListResponseInner>> listWithServiceResponseAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String metadataPath) {
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
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        GetSsisObjectMetadataRequest getMetadataRequest = null;
        if (metadataPath != null) {
            getMetadataRequest = new GetSsisObjectMetadataRequest();
            getMetadataRequest.withMetadataPath(metadataPath);
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, workspaceName, integrationRuntimeName, this.client.apiVersion(), this.client.acceptLanguage(), getMetadataRequest, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SsisObjectMetadataListResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<SsisObjectMetadataListResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SsisObjectMetadataListResponseInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SsisObjectMetadataListResponseInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SsisObjectMetadataListResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SsisObjectMetadataListResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Refresh integration runtime object metadata.
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SsisObjectMetadataStatusResponseInner object if successful.
     */
    public SsisObjectMetadataStatusResponseInner refresh(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return refreshWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName).toBlocking().last().body();
    }

    /**
     * Refresh integration runtime object metadata.
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SsisObjectMetadataStatusResponseInner> refreshAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, final ServiceCallback<SsisObjectMetadataStatusResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(refreshWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName), serviceCallback);
    }

    /**
     * Refresh integration runtime object metadata.
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<SsisObjectMetadataStatusResponseInner> refreshAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return refreshWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName).map(new Func1<ServiceResponse<SsisObjectMetadataStatusResponseInner>, SsisObjectMetadataStatusResponseInner>() {
            @Override
            public SsisObjectMetadataStatusResponseInner call(ServiceResponse<SsisObjectMetadataStatusResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Refresh integration runtime object metadata.
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<SsisObjectMetadataStatusResponseInner>> refreshWithServiceResponseAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
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
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Observable<Response<ResponseBody>> observable = service.refresh(this.client.subscriptionId(), resourceGroupName, workspaceName, integrationRuntimeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<SsisObjectMetadataStatusResponseInner>() { }.getType());
    }

    /**
     * Refresh integration runtime object metadata.
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SsisObjectMetadataStatusResponseInner object if successful.
     */
    public SsisObjectMetadataStatusResponseInner beginRefresh(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return beginRefreshWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName).toBlocking().single().body();
    }

    /**
     * Refresh integration runtime object metadata.
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SsisObjectMetadataStatusResponseInner> beginRefreshAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, final ServiceCallback<SsisObjectMetadataStatusResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginRefreshWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName), serviceCallback);
    }

    /**
     * Refresh integration runtime object metadata.
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SsisObjectMetadataStatusResponseInner object
     */
    public Observable<SsisObjectMetadataStatusResponseInner> beginRefreshAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return beginRefreshWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName).map(new Func1<ServiceResponse<SsisObjectMetadataStatusResponseInner>, SsisObjectMetadataStatusResponseInner>() {
            @Override
            public SsisObjectMetadataStatusResponseInner call(ServiceResponse<SsisObjectMetadataStatusResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Refresh integration runtime object metadata.
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SsisObjectMetadataStatusResponseInner object
     */
    public Observable<ServiceResponse<SsisObjectMetadataStatusResponseInner>> beginRefreshWithServiceResponseAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
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
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.beginRefresh(this.client.subscriptionId(), resourceGroupName, workspaceName, integrationRuntimeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SsisObjectMetadataStatusResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<SsisObjectMetadataStatusResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SsisObjectMetadataStatusResponseInner> clientResponse = beginRefreshDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SsisObjectMetadataStatusResponseInner> beginRefreshDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SsisObjectMetadataStatusResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SsisObjectMetadataStatusResponseInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
