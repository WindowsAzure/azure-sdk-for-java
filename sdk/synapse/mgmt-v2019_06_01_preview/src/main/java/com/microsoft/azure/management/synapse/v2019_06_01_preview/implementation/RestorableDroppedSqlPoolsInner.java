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
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ErrorContractException;
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
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in RestorableDroppedSqlPools.
 */
public class RestorableDroppedSqlPoolsInner {
    /** The Retrofit service to perform REST calls. */
    private RestorableDroppedSqlPoolsService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of RestorableDroppedSqlPoolsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RestorableDroppedSqlPoolsInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(RestorableDroppedSqlPoolsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RestorableDroppedSqlPools to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RestorableDroppedSqlPoolsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.RestorableDroppedSqlPools get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/restorableDroppedSqlPools/{restorableDroppedSqlPoolId}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("restorableDroppedSqlPoolId") String restorableDroppedSqlPoolId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.RestorableDroppedSqlPools listByWorkspace" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/restorableDroppedSqlPools")
        Observable<Response<ResponseBody>> listByWorkspace(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a deleted sql pool that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of sqlPoolName,deletionTimeInFileTimeFormat
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorContractException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RestorableDroppedSqlPoolInner object if successful.
     */
    public RestorableDroppedSqlPoolInner get(String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, restorableDroppedSqlPoolId).toBlocking().single().body();
    }

    /**
     * Gets a deleted sql pool that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of sqlPoolName,deletionTimeInFileTimeFormat
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RestorableDroppedSqlPoolInner> getAsync(String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId, final ServiceCallback<RestorableDroppedSqlPoolInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, restorableDroppedSqlPoolId), serviceCallback);
    }

    /**
     * Gets a deleted sql pool that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of sqlPoolName,deletionTimeInFileTimeFormat
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RestorableDroppedSqlPoolInner object
     */
    public Observable<RestorableDroppedSqlPoolInner> getAsync(String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, restorableDroppedSqlPoolId).map(new Func1<ServiceResponse<RestorableDroppedSqlPoolInner>, RestorableDroppedSqlPoolInner>() {
            @Override
            public RestorableDroppedSqlPoolInner call(ServiceResponse<RestorableDroppedSqlPoolInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a deleted sql pool that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of sqlPoolName,deletionTimeInFileTimeFormat
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RestorableDroppedSqlPoolInner object
     */
    public Observable<ServiceResponse<RestorableDroppedSqlPoolInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (restorableDroppedSqlPoolId == null) {
            throw new IllegalArgumentException("Parameter restorableDroppedSqlPoolId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, restorableDroppedSqlPoolId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RestorableDroppedSqlPoolInner>>>() {
                @Override
                public Observable<ServiceResponse<RestorableDroppedSqlPoolInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RestorableDroppedSqlPoolInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RestorableDroppedSqlPoolInner> getDelegate(Response<ResponseBody> response) throws ErrorContractException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RestorableDroppedSqlPoolInner, ErrorContractException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RestorableDroppedSqlPoolInner>() { }.getType())
                .registerError(ErrorContractException.class)
                .build(response);
    }

    /**
     * Gets a list of deleted Sql pools that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorContractException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;RestorableDroppedSqlPoolInner&gt; object if successful.
     */
    public List<RestorableDroppedSqlPoolInner> listByWorkspace(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Gets a list of deleted Sql pools that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RestorableDroppedSqlPoolInner>> listByWorkspaceAsync(String resourceGroupName, String workspaceName, final ServiceCallback<List<RestorableDroppedSqlPoolInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Gets a list of deleted Sql pools that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RestorableDroppedSqlPoolInner&gt; object
     */
    public Observable<List<RestorableDroppedSqlPoolInner>> listByWorkspaceAsync(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<List<RestorableDroppedSqlPoolInner>>, List<RestorableDroppedSqlPoolInner>>() {
            @Override
            public List<RestorableDroppedSqlPoolInner> call(ServiceResponse<List<RestorableDroppedSqlPoolInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of deleted Sql pools that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RestorableDroppedSqlPoolInner&gt; object
     */
    public Observable<ServiceResponse<List<RestorableDroppedSqlPoolInner>>> listByWorkspaceWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<RestorableDroppedSqlPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<RestorableDroppedSqlPoolInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<RestorableDroppedSqlPoolInner>> result = listByWorkspaceDelegate(response);
                        List<RestorableDroppedSqlPoolInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<RestorableDroppedSqlPoolInner>> clientResponse = new ServiceResponse<List<RestorableDroppedSqlPoolInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<RestorableDroppedSqlPoolInner>> listByWorkspaceDelegate(Response<ResponseBody> response) throws ErrorContractException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<RestorableDroppedSqlPoolInner>, ErrorContractException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<RestorableDroppedSqlPoolInner>>() { }.getType())
                .registerError(ErrorContractException.class)
                .build(response);
    }

}
