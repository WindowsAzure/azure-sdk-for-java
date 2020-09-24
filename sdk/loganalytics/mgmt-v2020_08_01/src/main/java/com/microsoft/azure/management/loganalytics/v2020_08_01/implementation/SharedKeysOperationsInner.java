/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
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
 * in SharedKeysOperations.
 */
public class SharedKeysOperationsInner {
    /** The Retrofit service to perform REST calls. */
    private SharedKeysOperationsService service;
    /** The service client containing this operation class. */
    private OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of SharedKeysOperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SharedKeysOperationsInner(Retrofit retrofit, OperationalInsightsManagementClientImpl client) {
        this.service = retrofit.create(SharedKeysOperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SharedKeysOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SharedKeysOperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_08_01.SharedKeysOperations getSharedKeys" })
        @POST("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/sharedKeys")
        Observable<Response<ResponseBody>> getSharedKeys(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_08_01.SharedKeysOperations regenerate" })
        @POST("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/regenerateSharedKey")
        Observable<Response<ResponseBody>> regenerate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the shared keys for a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SharedKeysInner object if successful.
     */
    public SharedKeysInner getSharedKeys(String resourceGroupName, String workspaceName) {
        return getSharedKeysWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Gets the shared keys for a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SharedKeysInner> getSharedKeysAsync(String resourceGroupName, String workspaceName, final ServiceCallback<SharedKeysInner> serviceCallback) {
        return ServiceFuture.fromResponse(getSharedKeysWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Gets the shared keys for a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedKeysInner object
     */
    public Observable<SharedKeysInner> getSharedKeysAsync(String resourceGroupName, String workspaceName) {
        return getSharedKeysWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<SharedKeysInner>, SharedKeysInner>() {
            @Override
            public SharedKeysInner call(ServiceResponse<SharedKeysInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the shared keys for a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedKeysInner object
     */
    public Observable<ServiceResponse<SharedKeysInner>> getSharedKeysWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getSharedKeys(resourceGroupName, workspaceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SharedKeysInner>>>() {
                @Override
                public Observable<ServiceResponse<SharedKeysInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SharedKeysInner> clientResponse = getSharedKeysDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SharedKeysInner> getSharedKeysDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SharedKeysInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SharedKeysInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Regenerates the shared keys for a Log Analytics Workspace. These keys are used to connect Microsoft Operational Insights agents to the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SharedKeysInner object if successful.
     */
    public SharedKeysInner regenerate(String resourceGroupName, String workspaceName) {
        return regenerateWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Regenerates the shared keys for a Log Analytics Workspace. These keys are used to connect Microsoft Operational Insights agents to the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SharedKeysInner> regenerateAsync(String resourceGroupName, String workspaceName, final ServiceCallback<SharedKeysInner> serviceCallback) {
        return ServiceFuture.fromResponse(regenerateWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Regenerates the shared keys for a Log Analytics Workspace. These keys are used to connect Microsoft Operational Insights agents to the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedKeysInner object
     */
    public Observable<SharedKeysInner> regenerateAsync(String resourceGroupName, String workspaceName) {
        return regenerateWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<SharedKeysInner>, SharedKeysInner>() {
            @Override
            public SharedKeysInner call(ServiceResponse<SharedKeysInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Regenerates the shared keys for a Log Analytics Workspace. These keys are used to connect Microsoft Operational Insights agents to the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedKeysInner object
     */
    public Observable<ServiceResponse<SharedKeysInner>> regenerateWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
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
        return service.regenerate(this.client.subscriptionId(), resourceGroupName, workspaceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SharedKeysInner>>>() {
                @Override
                public Observable<ServiceResponse<SharedKeysInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SharedKeysInner> clientResponse = regenerateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SharedKeysInner> regenerateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SharedKeysInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SharedKeysInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
