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
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.ErrorContractException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DataCollectorLogs.
 */
public class DataCollectorLogsInner {
    /** The Retrofit service to perform REST calls. */
    private DataCollectorLogsService service;
    /** The service client containing this operation class. */
    private OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of DataCollectorLogsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DataCollectorLogsInner(Retrofit retrofit, OperationalInsightsManagementClientImpl client) {
        this.service = retrofit.create(DataCollectorLogsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DataCollectorLogs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DataCollectorLogsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_03_01_preview.DataCollectorLogs delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/dataCollectorLogs/{tableName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("tableName") String tableName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("force") Boolean force, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_03_01_preview.DataCollectorLogs get" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/dataCollectorLogs/{tableName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("tableName") String tableName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("force") Boolean force, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_03_01_preview.DataCollectorLogs listByWorkspace" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/dataCollectorLogs")
        Observable<Response<ResponseBody>> listByWorkspace(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Deletes a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorContractException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String workspaceName, String tableName) {
        deleteWithServiceResponseAsync(resourceGroupName, workspaceName, tableName).toBlocking().single().body();
    }

    /**
     * Deletes a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String workspaceName, String tableName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, workspaceName, tableName), serviceCallback);
    }

    /**
     * Deletes a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String workspaceName, String tableName) {
        return deleteWithServiceResponseAsync(resourceGroupName, workspaceName, tableName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String workspaceName, String tableName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (tableName == null) {
            throw new IllegalArgumentException("Parameter tableName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Boolean force = null;
        return service.delete(resourceGroupName, workspaceName, tableName, this.client.subscriptionId(), this.client.apiVersion(), force, this.client.acceptLanguage(), this.client.userAgent())
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

    /**
     * Deletes a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @param force When true, enables bypassing retention validation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorContractException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String workspaceName, String tableName, Boolean force) {
        deleteWithServiceResponseAsync(resourceGroupName, workspaceName, tableName, force).toBlocking().single().body();
    }

    /**
     * Deletes a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @param force When true, enables bypassing retention validation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String workspaceName, String tableName, Boolean force, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, workspaceName, tableName, force), serviceCallback);
    }

    /**
     * Deletes a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @param force When true, enables bypassing retention validation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String workspaceName, String tableName, Boolean force) {
        return deleteWithServiceResponseAsync(resourceGroupName, workspaceName, tableName, force).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @param force When true, enables bypassing retention validation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String workspaceName, String tableName, Boolean force) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (tableName == null) {
            throw new IllegalArgumentException("Parameter tableName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, workspaceName, tableName, this.client.subscriptionId(), this.client.apiVersion(), force, this.client.acceptLanguage(), this.client.userAgent())
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

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws ErrorContractException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorContractException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorContractException.class)
                .build(response);
    }

    /**
     * Retrieves a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorContractException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataCollectorLogInner object if successful.
     */
    public DataCollectorLogInner get(String resourceGroupName, String workspaceName, String tableName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, tableName).toBlocking().single().body();
    }

    /**
     * Retrieves a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataCollectorLogInner> getAsync(String resourceGroupName, String workspaceName, String tableName, final ServiceCallback<DataCollectorLogInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, tableName), serviceCallback);
    }

    /**
     * Retrieves a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataCollectorLogInner object
     */
    public Observable<DataCollectorLogInner> getAsync(String resourceGroupName, String workspaceName, String tableName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, tableName).map(new Func1<ServiceResponse<DataCollectorLogInner>, DataCollectorLogInner>() {
            @Override
            public DataCollectorLogInner call(ServiceResponse<DataCollectorLogInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataCollectorLogInner object
     */
    public Observable<ServiceResponse<DataCollectorLogInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String tableName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (tableName == null) {
            throw new IllegalArgumentException("Parameter tableName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Boolean force = null;
        return service.get(resourceGroupName, workspaceName, tableName, this.client.subscriptionId(), this.client.apiVersion(), force, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataCollectorLogInner>>>() {
                @Override
                public Observable<ServiceResponse<DataCollectorLogInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataCollectorLogInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Retrieves a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @param force When true, enables bypassing retention validation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorContractException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataCollectorLogInner object if successful.
     */
    public DataCollectorLogInner get(String resourceGroupName, String workspaceName, String tableName, Boolean force) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, tableName, force).toBlocking().single().body();
    }

    /**
     * Retrieves a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @param force When true, enables bypassing retention validation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataCollectorLogInner> getAsync(String resourceGroupName, String workspaceName, String tableName, Boolean force, final ServiceCallback<DataCollectorLogInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, tableName, force), serviceCallback);
    }

    /**
     * Retrieves a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @param force When true, enables bypassing retention validation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataCollectorLogInner object
     */
    public Observable<DataCollectorLogInner> getAsync(String resourceGroupName, String workspaceName, String tableName, Boolean force) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, tableName, force).map(new Func1<ServiceResponse<DataCollectorLogInner>, DataCollectorLogInner>() {
            @Override
            public DataCollectorLogInner call(ServiceResponse<DataCollectorLogInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves a specify data collector log table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param tableName DataCollector table name.
     * @param force When true, enables bypassing retention validation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataCollectorLogInner object
     */
    public Observable<ServiceResponse<DataCollectorLogInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String tableName, Boolean force) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (tableName == null) {
            throw new IllegalArgumentException("Parameter tableName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, workspaceName, tableName, this.client.subscriptionId(), this.client.apiVersion(), force, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataCollectorLogInner>>>() {
                @Override
                public Observable<ServiceResponse<DataCollectorLogInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataCollectorLogInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DataCollectorLogInner> getDelegate(Response<ResponseBody> response) throws ErrorContractException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DataCollectorLogInner, ErrorContractException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DataCollectorLogInner>() { }.getType())
                .registerError(ErrorContractException.class)
                .build(response);
    }

    /**
     * Listing all data collector log tables, being created via data collector endpoint and scoped to the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorContractException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DataCollectorLogInner&gt; object if successful.
     */
    public List<DataCollectorLogInner> listByWorkspace(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Listing all data collector log tables, being created via data collector endpoint and scoped to the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DataCollectorLogInner>> listByWorkspaceAsync(String resourceGroupName, String workspaceName, final ServiceCallback<List<DataCollectorLogInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Listing all data collector log tables, being created via data collector endpoint and scoped to the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DataCollectorLogInner&gt; object
     */
    public Observable<List<DataCollectorLogInner>> listByWorkspaceAsync(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<List<DataCollectorLogInner>>, List<DataCollectorLogInner>>() {
            @Override
            public List<DataCollectorLogInner> call(ServiceResponse<List<DataCollectorLogInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Listing all data collector log tables, being created via data collector endpoint and scoped to the specified workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DataCollectorLogInner&gt; object
     */
    public Observable<ServiceResponse<List<DataCollectorLogInner>>> listByWorkspaceWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<DataCollectorLogInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<DataCollectorLogInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DataCollectorLogInner>> result = listByWorkspaceDelegate(response);
                        List<DataCollectorLogInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<DataCollectorLogInner>> clientResponse = new ServiceResponse<List<DataCollectorLogInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DataCollectorLogInner>> listByWorkspaceDelegate(Response<ResponseBody> response) throws ErrorContractException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DataCollectorLogInner>, ErrorContractException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DataCollectorLogInner>>() { }.getType())
                .registerError(ErrorContractException.class)
                .build(response);
    }

}
