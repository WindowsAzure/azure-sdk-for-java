/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.synapse.v2020_12_01.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in WorkspaceSqlAadAdmins.
 */
public class WorkspaceSqlAadAdminsInner implements InnerSupportsDelete<Void> {
    /** The Retrofit service to perform REST calls. */
    private WorkspaceSqlAadAdminsService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of WorkspaceSqlAadAdminsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WorkspaceSqlAadAdminsInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(WorkspaceSqlAadAdminsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WorkspaceSqlAadAdmins to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WorkspaceSqlAadAdminsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.WorkspaceSqlAadAdmins get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlAdministrators/activeDirectory")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.WorkspaceSqlAadAdmins createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlAdministrators/activeDirectory")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Body WorkspaceAadAdminInfoInner aadAdminInfo, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.WorkspaceSqlAadAdmins beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlAdministrators/activeDirectory")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Body WorkspaceAadAdminInfoInner aadAdminInfo, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.WorkspaceSqlAadAdmins delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlAdministrators/activeDirectory", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.WorkspaceSqlAadAdmins beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlAdministrators/activeDirectory", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WorkspaceAadAdminInfoInner object if successful.
     */
    public WorkspaceAadAdminInfoInner get(String resourceGroupName, String workspaceName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Gets a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WorkspaceAadAdminInfoInner> getAsync(String resourceGroupName, String workspaceName, final ServiceCallback<WorkspaceAadAdminInfoInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Gets a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkspaceAadAdminInfoInner object
     */
    public Observable<WorkspaceAadAdminInfoInner> getAsync(String resourceGroupName, String workspaceName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<WorkspaceAadAdminInfoInner>, WorkspaceAadAdminInfoInner>() {
            @Override
            public WorkspaceAadAdminInfoInner call(ServiceResponse<WorkspaceAadAdminInfoInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkspaceAadAdminInfoInner object
     */
    public Observable<ServiceResponse<WorkspaceAadAdminInfoInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
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
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WorkspaceAadAdminInfoInner>>>() {
                @Override
                public Observable<ServiceResponse<WorkspaceAadAdminInfoInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WorkspaceAadAdminInfoInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WorkspaceAadAdminInfoInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WorkspaceAadAdminInfoInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WorkspaceAadAdminInfoInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Creates or updates a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param aadAdminInfo Workspace active directory administrator properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WorkspaceAadAdminInfoInner object if successful.
     */
    public WorkspaceAadAdminInfoInner createOrUpdate(String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, aadAdminInfo).toBlocking().last().body();
    }

    /**
     * Creates or updates a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param aadAdminInfo Workspace active directory administrator properties
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WorkspaceAadAdminInfoInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo, final ServiceCallback<WorkspaceAadAdminInfoInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, aadAdminInfo), serviceCallback);
    }

    /**
     * Creates or updates a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param aadAdminInfo Workspace active directory administrator properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<WorkspaceAadAdminInfoInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, aadAdminInfo).map(new Func1<ServiceResponse<WorkspaceAadAdminInfoInner>, WorkspaceAadAdminInfoInner>() {
            @Override
            public WorkspaceAadAdminInfoInner call(ServiceResponse<WorkspaceAadAdminInfoInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param aadAdminInfo Workspace active directory administrator properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<WorkspaceAadAdminInfoInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo) {
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
        if (aadAdminInfo == null) {
            throw new IllegalArgumentException("Parameter aadAdminInfo is required and cannot be null.");
        }
        Validator.validate(aadAdminInfo);
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, this.client.apiVersion(), aadAdminInfo, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<WorkspaceAadAdminInfoInner>() { }.getType());
    }

    /**
     * Creates or updates a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param aadAdminInfo Workspace active directory administrator properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WorkspaceAadAdminInfoInner object if successful.
     */
    public WorkspaceAadAdminInfoInner beginCreateOrUpdate(String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, aadAdminInfo).toBlocking().single().body();
    }

    /**
     * Creates or updates a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param aadAdminInfo Workspace active directory administrator properties
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WorkspaceAadAdminInfoInner> beginCreateOrUpdateAsync(String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo, final ServiceCallback<WorkspaceAadAdminInfoInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, aadAdminInfo), serviceCallback);
    }

    /**
     * Creates or updates a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param aadAdminInfo Workspace active directory administrator properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkspaceAadAdminInfoInner object
     */
    public Observable<WorkspaceAadAdminInfoInner> beginCreateOrUpdateAsync(String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, aadAdminInfo).map(new Func1<ServiceResponse<WorkspaceAadAdminInfoInner>, WorkspaceAadAdminInfoInner>() {
            @Override
            public WorkspaceAadAdminInfoInner call(ServiceResponse<WorkspaceAadAdminInfoInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param aadAdminInfo Workspace active directory administrator properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkspaceAadAdminInfoInner object
     */
    public Observable<ServiceResponse<WorkspaceAadAdminInfoInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo) {
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
        if (aadAdminInfo == null) {
            throw new IllegalArgumentException("Parameter aadAdminInfo is required and cannot be null.");
        }
        Validator.validate(aadAdminInfo);
        return service.beginCreateOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, this.client.apiVersion(), aadAdminInfo, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WorkspaceAadAdminInfoInner>>>() {
                @Override
                public Observable<ServiceResponse<WorkspaceAadAdminInfoInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WorkspaceAadAdminInfoInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WorkspaceAadAdminInfoInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WorkspaceAadAdminInfoInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WorkspaceAadAdminInfoInner>() { }.getType())
                .register(202, new TypeToken<WorkspaceAadAdminInfoInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Deletes a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String workspaceName) {
        deleteWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().last().body();
    }

    /**
     * Deletes a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String workspaceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Deletes a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String workspaceName) {
        return deleteWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
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
        Observable<Response<ResponseBody>> observable = service.delete(this.client.subscriptionId(), resourceGroupName, workspaceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Deletes a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginDelete(String resourceGroupName, String workspaceName) {
        beginDeleteWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Deletes a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginDeleteAsync(String resourceGroupName, String workspaceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Deletes a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginDeleteAsync(String resourceGroupName, String workspaceName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a workspace SQL active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
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
        return service.beginDelete(this.client.subscriptionId(), resourceGroupName, workspaceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginDeleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
