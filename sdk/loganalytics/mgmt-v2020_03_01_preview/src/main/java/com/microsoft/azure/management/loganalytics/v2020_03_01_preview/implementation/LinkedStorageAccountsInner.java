/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.DataSourceType;
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
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in LinkedStorageAccounts.
 */
public class LinkedStorageAccountsInner {
    /** The Retrofit service to perform REST calls. */
    private LinkedStorageAccountsService service;
    /** The service client containing this operation class. */
    private OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of LinkedStorageAccountsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LinkedStorageAccountsInner(Retrofit retrofit, OperationalInsightsManagementClientImpl client) {
        this.service = retrofit.create(LinkedStorageAccountsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LinkedStorageAccounts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LinkedStorageAccountsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_03_01_preview.LinkedStorageAccounts createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/linkedStorageAccounts/{dataSourceType}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("dataSourceType") DataSourceType dataSourceType1, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body LinkedStorageAccountsResourceInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_03_01_preview.LinkedStorageAccounts delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/linkedStorageAccounts/{dataSourceType}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("dataSourceType") DataSourceType dataSourceType1, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_03_01_preview.LinkedStorageAccounts get" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/linkedStorageAccounts/{dataSourceType}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("dataSourceType") DataSourceType dataSourceType1, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_03_01_preview.LinkedStorageAccounts listByWorkspace" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/linkedStorageAccounts")
        Observable<Response<ResponseBody>> listByWorkspace(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Create or Update a link relation between current workspace and a group of storage accounts of a specific data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LinkedStorageAccountsResourceInner object if successful.
     */
    public LinkedStorageAccountsResourceInner createOrUpdate(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType).toBlocking().single().body();
    }

    /**
     * Create or Update a link relation between current workspace and a group of storage accounts of a specific data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LinkedStorageAccountsResourceInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType, final ServiceCallback<LinkedStorageAccountsResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType), serviceCallback);
    }

    /**
     * Create or Update a link relation between current workspace and a group of storage accounts of a specific data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LinkedStorageAccountsResourceInner object
     */
    public Observable<LinkedStorageAccountsResourceInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType).map(new Func1<ServiceResponse<LinkedStorageAccountsResourceInner>, LinkedStorageAccountsResourceInner>() {
            @Override
            public LinkedStorageAccountsResourceInner call(ServiceResponse<LinkedStorageAccountsResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or Update a link relation between current workspace and a group of storage accounts of a specific data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LinkedStorageAccountsResourceInner object
     */
    public Observable<ServiceResponse<LinkedStorageAccountsResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (dataSourceType == null) {
            throw new IllegalArgumentException("Parameter dataSourceType is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final List<String> storageAccountIds = null;
        LinkedStorageAccountsResourceInner parameters = new LinkedStorageAccountsResourceInner();
        parameters.withStorageAccountIds(null);
        return service.createOrUpdate(resourceGroupName, workspaceName, dataSourceType, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LinkedStorageAccountsResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<LinkedStorageAccountsResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LinkedStorageAccountsResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create or Update a link relation between current workspace and a group of storage accounts of a specific data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @param storageAccountIds Linked storage accounts resources ids.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LinkedStorageAccountsResourceInner object if successful.
     */
    public LinkedStorageAccountsResourceInner createOrUpdate(String resourceGroupName, String workspaceName, DataSourceType dataSourceType, List<String> storageAccountIds) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType, storageAccountIds).toBlocking().single().body();
    }

    /**
     * Create or Update a link relation between current workspace and a group of storage accounts of a specific data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @param storageAccountIds Linked storage accounts resources ids.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LinkedStorageAccountsResourceInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType, List<String> storageAccountIds, final ServiceCallback<LinkedStorageAccountsResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType, storageAccountIds), serviceCallback);
    }

    /**
     * Create or Update a link relation between current workspace and a group of storage accounts of a specific data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @param storageAccountIds Linked storage accounts resources ids.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LinkedStorageAccountsResourceInner object
     */
    public Observable<LinkedStorageAccountsResourceInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType, List<String> storageAccountIds) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType, storageAccountIds).map(new Func1<ServiceResponse<LinkedStorageAccountsResourceInner>, LinkedStorageAccountsResourceInner>() {
            @Override
            public LinkedStorageAccountsResourceInner call(ServiceResponse<LinkedStorageAccountsResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or Update a link relation between current workspace and a group of storage accounts of a specific data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @param storageAccountIds Linked storage accounts resources ids.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LinkedStorageAccountsResourceInner object
     */
    public Observable<ServiceResponse<LinkedStorageAccountsResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType, List<String> storageAccountIds) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (dataSourceType == null) {
            throw new IllegalArgumentException("Parameter dataSourceType is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(storageAccountIds);
        LinkedStorageAccountsResourceInner parameters = new LinkedStorageAccountsResourceInner();
        parameters.withStorageAccountIds(storageAccountIds);
        return service.createOrUpdate(resourceGroupName, workspaceName, dataSourceType, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LinkedStorageAccountsResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<LinkedStorageAccountsResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LinkedStorageAccountsResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LinkedStorageAccountsResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LinkedStorageAccountsResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LinkedStorageAccountsResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes all linked storage accounts of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        deleteWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType).toBlocking().single().body();
    }

    /**
     * Deletes all linked storage accounts of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType), serviceCallback);
    }

    /**
     * Deletes all linked storage accounts of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        return deleteWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes all linked storage accounts of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (dataSourceType == null) {
            throw new IllegalArgumentException("Parameter dataSourceType is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, workspaceName, dataSourceType, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all linked storage account of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LinkedStorageAccountsResourceInner object if successful.
     */
    public LinkedStorageAccountsResourceInner get(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType).toBlocking().single().body();
    }

    /**
     * Gets all linked storage account of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LinkedStorageAccountsResourceInner> getAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType, final ServiceCallback<LinkedStorageAccountsResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType), serviceCallback);
    }

    /**
     * Gets all linked storage account of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LinkedStorageAccountsResourceInner object
     */
    public Observable<LinkedStorageAccountsResourceInner> getAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, dataSourceType).map(new Func1<ServiceResponse<LinkedStorageAccountsResourceInner>, LinkedStorageAccountsResourceInner>() {
            @Override
            public LinkedStorageAccountsResourceInner call(ServiceResponse<LinkedStorageAccountsResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all linked storage account of a specific data source type associated with the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param dataSourceType Linked storage accounts type. Possible values include: 'CustomLogs', 'AzureWatson'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LinkedStorageAccountsResourceInner object
     */
    public Observable<ServiceResponse<LinkedStorageAccountsResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, DataSourceType dataSourceType) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (dataSourceType == null) {
            throw new IllegalArgumentException("Parameter dataSourceType is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, workspaceName, dataSourceType, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LinkedStorageAccountsResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<LinkedStorageAccountsResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LinkedStorageAccountsResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LinkedStorageAccountsResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LinkedStorageAccountsResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LinkedStorageAccountsResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all linked storage accounts associated with the specified workspace, storage accounts will be sorted by their data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;LinkedStorageAccountsResourceInner&gt; object if successful.
     */
    public List<LinkedStorageAccountsResourceInner> listByWorkspace(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Gets all linked storage accounts associated with the specified workspace, storage accounts will be sorted by their data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<LinkedStorageAccountsResourceInner>> listByWorkspaceAsync(String resourceGroupName, String workspaceName, final ServiceCallback<List<LinkedStorageAccountsResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Gets all linked storage accounts associated with the specified workspace, storage accounts will be sorted by their data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LinkedStorageAccountsResourceInner&gt; object
     */
    public Observable<List<LinkedStorageAccountsResourceInner>> listByWorkspaceAsync(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<List<LinkedStorageAccountsResourceInner>>, List<LinkedStorageAccountsResourceInner>>() {
            @Override
            public List<LinkedStorageAccountsResourceInner> call(ServiceResponse<List<LinkedStorageAccountsResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all linked storage accounts associated with the specified workspace, storage accounts will be sorted by their data source type.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LinkedStorageAccountsResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<LinkedStorageAccountsResourceInner>>> listByWorkspaceWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<LinkedStorageAccountsResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<LinkedStorageAccountsResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<LinkedStorageAccountsResourceInner>> result = listByWorkspaceDelegate(response);
                        List<LinkedStorageAccountsResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<LinkedStorageAccountsResourceInner>> clientResponse = new ServiceResponse<List<LinkedStorageAccountsResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<LinkedStorageAccountsResourceInner>> listByWorkspaceDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<LinkedStorageAccountsResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<LinkedStorageAccountsResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
