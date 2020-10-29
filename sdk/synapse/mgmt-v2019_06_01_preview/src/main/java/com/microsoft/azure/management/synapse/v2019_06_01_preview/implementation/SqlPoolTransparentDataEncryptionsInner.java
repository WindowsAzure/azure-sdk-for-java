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
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ErrorContractException;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.TransparentDataEncryptionStatus;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
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
 * in SqlPoolTransparentDataEncryptions.
 */
public class SqlPoolTransparentDataEncryptionsInner {
    /** The Retrofit service to perform REST calls. */
    private SqlPoolTransparentDataEncryptionsService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolTransparentDataEncryptionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SqlPoolTransparentDataEncryptionsInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(SqlPoolTransparentDataEncryptionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlPoolTransparentDataEncryptions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SqlPoolTransparentDataEncryptionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolTransparentDataEncryptions get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/transparentDataEncryption/{transparentDataEncryptionName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("transparentDataEncryptionName") String transparentDataEncryptionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolTransparentDataEncryptions createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/transparentDataEncryption/{transparentDataEncryptionName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("transparentDataEncryptionName") String transparentDataEncryptionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body TransparentDataEncryptionInner parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a SQL pool's transparent data encryption configuration.
     * Get a SQL pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorContractException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransparentDataEncryptionInner object if successful.
     */
    public TransparentDataEncryptionInner get(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single().body();
    }

    /**
     * Get a SQL pool's transparent data encryption configuration.
     * Get a SQL pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransparentDataEncryptionInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, final ServiceCallback<TransparentDataEncryptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName), serviceCallback);
    }

    /**
     * Get a SQL pool's transparent data encryption configuration.
     * Get a SQL pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<TransparentDataEncryptionInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).map(new Func1<ServiceResponse<TransparentDataEncryptionInner>, TransparentDataEncryptionInner>() {
            @Override
            public TransparentDataEncryptionInner call(ServiceResponse<TransparentDataEncryptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a SQL pool's transparent data encryption configuration.
     * Get a SQL pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<ServiceResponse<TransparentDataEncryptionInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
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
        final String transparentDataEncryptionName = "current";
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, transparentDataEncryptionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TransparentDataEncryptionInner>>>() {
                @Override
                public Observable<ServiceResponse<TransparentDataEncryptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TransparentDataEncryptionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TransparentDataEncryptionInner> getDelegate(Response<ResponseBody> response) throws ErrorContractException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TransparentDataEncryptionInner, ErrorContractException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TransparentDataEncryptionInner>() { }.getType())
                .registerError(ErrorContractException.class)
                .build(response);
    }

    /**
     * Creates or updates a Sql pool's transparent data encryption configuration.
     * Creates or updates a Sql pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransparentDataEncryptionInner object if successful.
     */
    public TransparentDataEncryptionInner createOrUpdate(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single().body();
    }

    /**
     * Creates or updates a Sql pool's transparent data encryption configuration.
     * Creates or updates a Sql pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransparentDataEncryptionInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, final ServiceCallback<TransparentDataEncryptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName), serviceCallback);
    }

    /**
     * Creates or updates a Sql pool's transparent data encryption configuration.
     * Creates or updates a Sql pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<TransparentDataEncryptionInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).map(new Func1<ServiceResponse<TransparentDataEncryptionInner>, TransparentDataEncryptionInner>() {
            @Override
            public TransparentDataEncryptionInner call(ServiceResponse<TransparentDataEncryptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a Sql pool's transparent data encryption configuration.
     * Creates or updates a Sql pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<ServiceResponse<TransparentDataEncryptionInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
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
        final String transparentDataEncryptionName = "current";
        final TransparentDataEncryptionStatus status = null;
        TransparentDataEncryptionInner parameters = new TransparentDataEncryptionInner();
        parameters.withStatus(null);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, transparentDataEncryptionName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TransparentDataEncryptionInner>>>() {
                @Override
                public Observable<ServiceResponse<TransparentDataEncryptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TransparentDataEncryptionInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Creates or updates a Sql pool's transparent data encryption configuration.
     * Creates or updates a Sql pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param status The status of the database transparent data encryption. Possible values include: 'Enabled', 'Disabled'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransparentDataEncryptionInner object if successful.
     */
    public TransparentDataEncryptionInner createOrUpdate(String resourceGroupName, String workspaceName, String sqlPoolName, TransparentDataEncryptionStatus status) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, status).toBlocking().single().body();
    }

    /**
     * Creates or updates a Sql pool's transparent data encryption configuration.
     * Creates or updates a Sql pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param status The status of the database transparent data encryption. Possible values include: 'Enabled', 'Disabled'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransparentDataEncryptionInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, TransparentDataEncryptionStatus status, final ServiceCallback<TransparentDataEncryptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, status), serviceCallback);
    }

    /**
     * Creates or updates a Sql pool's transparent data encryption configuration.
     * Creates or updates a Sql pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param status The status of the database transparent data encryption. Possible values include: 'Enabled', 'Disabled'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<TransparentDataEncryptionInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, TransparentDataEncryptionStatus status) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, status).map(new Func1<ServiceResponse<TransparentDataEncryptionInner>, TransparentDataEncryptionInner>() {
            @Override
            public TransparentDataEncryptionInner call(ServiceResponse<TransparentDataEncryptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a Sql pool's transparent data encryption configuration.
     * Creates or updates a Sql pool's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param status The status of the database transparent data encryption. Possible values include: 'Enabled', 'Disabled'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<ServiceResponse<TransparentDataEncryptionInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, TransparentDataEncryptionStatus status) {
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
        final String transparentDataEncryptionName = "current";
        TransparentDataEncryptionInner parameters = new TransparentDataEncryptionInner();
        parameters.withStatus(status);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, transparentDataEncryptionName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TransparentDataEncryptionInner>>>() {
                @Override
                public Observable<ServiceResponse<TransparentDataEncryptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TransparentDataEncryptionInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TransparentDataEncryptionInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TransparentDataEncryptionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TransparentDataEncryptionInner>() { }.getType())
                .register(201, new TypeToken<TransparentDataEncryptionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
