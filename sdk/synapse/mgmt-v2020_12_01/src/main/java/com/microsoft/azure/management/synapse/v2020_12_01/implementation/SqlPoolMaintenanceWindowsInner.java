/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.synapse.v2020_12_01.ErrorResponseException;
import com.microsoft.azure.management.synapse.v2020_12_01.MaintenanceWindowTimeRange;
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
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SqlPoolMaintenanceWindows.
 */
public class SqlPoolMaintenanceWindowsInner {
    /** The Retrofit service to perform REST calls. */
    private SqlPoolMaintenanceWindowsService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolMaintenanceWindowsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SqlPoolMaintenanceWindowsInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(SqlPoolMaintenanceWindowsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlPoolMaintenanceWindows to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SqlPoolMaintenanceWindowsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolMaintenanceWindows get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/maintenancewindows/current")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Query("api-version") String apiVersion, @Query("maintenanceWindowName") String maintenanceWindowName, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolMaintenanceWindows createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/maintenancewindows/current")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Query("api-version") String apiVersion, @Query("maintenanceWindowName") String maintenanceWindowName, @Header("accept-language") String acceptLanguage, @Body MaintenanceWindowsInner parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a SQL pool's Maintenance Windows.
     * Get a SQL pool's Maintenance Windows.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MaintenanceWindowsInner object if successful.
     */
    public MaintenanceWindowsInner get(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName).toBlocking().single().body();
    }

    /**
     * Get a SQL pool's Maintenance Windows.
     * Get a SQL pool's Maintenance Windows.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MaintenanceWindowsInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName, final ServiceCallback<MaintenanceWindowsInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName), serviceCallback);
    }

    /**
     * Get a SQL pool's Maintenance Windows.
     * Get a SQL pool's Maintenance Windows.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MaintenanceWindowsInner object
     */
    public Observable<MaintenanceWindowsInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName).map(new Func1<ServiceResponse<MaintenanceWindowsInner>, MaintenanceWindowsInner>() {
            @Override
            public MaintenanceWindowsInner call(ServiceResponse<MaintenanceWindowsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a SQL pool's Maintenance Windows.
     * Get a SQL pool's Maintenance Windows.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MaintenanceWindowsInner object
     */
    public Observable<ServiceResponse<MaintenanceWindowsInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (maintenanceWindowName == null) {
            throw new IllegalArgumentException("Parameter maintenanceWindowName is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, this.client.apiVersion(), maintenanceWindowName, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MaintenanceWindowsInner>>>() {
                @Override
                public Observable<ServiceResponse<MaintenanceWindowsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MaintenanceWindowsInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MaintenanceWindowsInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MaintenanceWindowsInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MaintenanceWindowsInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Creates or updates a Sql pool's maintenance windows settings.
     * Creates or updates a Sql pool's maintenance windows settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void createOrUpdate(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName) {
        createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName).toBlocking().single().body();
    }

    /**
     * Creates or updates a Sql pool's maintenance windows settings.
     * Creates or updates a Sql pool's maintenance windows settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName), serviceCallback);
    }

    /**
     * Creates or updates a Sql pool's maintenance windows settings.
     * Creates or updates a Sql pool's maintenance windows settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a Sql pool's maintenance windows settings.
     * Creates or updates a Sql pool's maintenance windows settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (maintenanceWindowName == null) {
            throw new IllegalArgumentException("Parameter maintenanceWindowName is required and cannot be null.");
        }
        final List<MaintenanceWindowTimeRange> timeRanges = null;
        MaintenanceWindowsInner parameters = new MaintenanceWindowsInner();
        parameters.withTimeRanges(null);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, this.client.apiVersion(), maintenanceWindowName, this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Creates or updates a Sql pool's maintenance windows settings.
     * Creates or updates a Sql pool's maintenance windows settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @param timeRanges the List&lt;MaintenanceWindowTimeRange&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void createOrUpdate(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName, List<MaintenanceWindowTimeRange> timeRanges) {
        createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName, timeRanges).toBlocking().single().body();
    }

    /**
     * Creates or updates a Sql pool's maintenance windows settings.
     * Creates or updates a Sql pool's maintenance windows settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @param timeRanges the List&lt;MaintenanceWindowTimeRange&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName, List<MaintenanceWindowTimeRange> timeRanges, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName, timeRanges), serviceCallback);
    }

    /**
     * Creates or updates a Sql pool's maintenance windows settings.
     * Creates or updates a Sql pool's maintenance windows settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @param timeRanges the List&lt;MaintenanceWindowTimeRange&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName, List<MaintenanceWindowTimeRange> timeRanges) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName, timeRanges).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a Sql pool's maintenance windows settings.
     * Creates or updates a Sql pool's maintenance windows settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowName Maintenance window name.
     * @param timeRanges the List&lt;MaintenanceWindowTimeRange&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName, List<MaintenanceWindowTimeRange> timeRanges) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (maintenanceWindowName == null) {
            throw new IllegalArgumentException("Parameter maintenanceWindowName is required and cannot be null.");
        }
        Validator.validate(timeRanges);
        MaintenanceWindowsInner parameters = new MaintenanceWindowsInner();
        parameters.withTimeRanges(timeRanges);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, this.client.apiVersion(), maintenanceWindowName, this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
