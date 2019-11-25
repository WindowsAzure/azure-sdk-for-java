/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.sql.v2014_04_01.TransparentDataEncryptionStatus;
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
 * in TransparentDataEncryptions.
 */
public class TransparentDataEncryptionsInner {
    /** The Retrofit service to perform REST calls. */
    private TransparentDataEncryptionsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of TransparentDataEncryptionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TransparentDataEncryptionsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(TransparentDataEncryptionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for TransparentDataEncryptions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TransparentDataEncryptionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.TransparentDataEncryptions createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/transparentDataEncryption/{transparentDataEncryptionName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("transparentDataEncryptionName") String transparentDataEncryptionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body TransparentDataEncryptionInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.TransparentDataEncryptions get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/transparentDataEncryption/{transparentDataEncryptionName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("transparentDataEncryptionName") String transparentDataEncryptionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates or updates a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which setting the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransparentDataEncryptionInner object if successful.
     */
    public TransparentDataEncryptionInner createOrUpdate(String resourceGroupName, String serverName, String databaseName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName).toBlocking().single().body();
    }

    /**
     * Creates or updates a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which setting the transparent data encryption applies.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransparentDataEncryptionInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, final ServiceCallback<TransparentDataEncryptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Creates or updates a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which setting the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<TransparentDataEncryptionInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName).map(new Func1<ServiceResponse<TransparentDataEncryptionInner>, TransparentDataEncryptionInner>() {
            @Override
            public TransparentDataEncryptionInner call(ServiceResponse<TransparentDataEncryptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which setting the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<ServiceResponse<TransparentDataEncryptionInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String transparentDataEncryptionName = "current";
        final TransparentDataEncryptionStatus status = null;
        TransparentDataEncryptionInner parameters = new TransparentDataEncryptionInner();
        parameters.withStatus(null);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, transparentDataEncryptionName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
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
     * Creates or updates a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which setting the transparent data encryption applies.
     * @param status The status of the database transparent data encryption. Possible values include: 'Enabled', 'Disabled'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransparentDataEncryptionInner object if successful.
     */
    public TransparentDataEncryptionInner createOrUpdate(String resourceGroupName, String serverName, String databaseName, TransparentDataEncryptionStatus status) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, status).toBlocking().single().body();
    }

    /**
     * Creates or updates a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which setting the transparent data encryption applies.
     * @param status The status of the database transparent data encryption. Possible values include: 'Enabled', 'Disabled'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransparentDataEncryptionInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, TransparentDataEncryptionStatus status, final ServiceCallback<TransparentDataEncryptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, status), serviceCallback);
    }

    /**
     * Creates or updates a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which setting the transparent data encryption applies.
     * @param status The status of the database transparent data encryption. Possible values include: 'Enabled', 'Disabled'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<TransparentDataEncryptionInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, TransparentDataEncryptionStatus status) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, status).map(new Func1<ServiceResponse<TransparentDataEncryptionInner>, TransparentDataEncryptionInner>() {
            @Override
            public TransparentDataEncryptionInner call(ServiceResponse<TransparentDataEncryptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which setting the transparent data encryption applies.
     * @param status The status of the database transparent data encryption. Possible values include: 'Enabled', 'Disabled'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<ServiceResponse<TransparentDataEncryptionInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, TransparentDataEncryptionStatus status) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String transparentDataEncryptionName = "current";
        TransparentDataEncryptionInner parameters = new TransparentDataEncryptionInner();
        parameters.withStatus(status);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, transparentDataEncryptionName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
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

    /**
     * Gets a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransparentDataEncryptionInner object if successful.
     */
    public TransparentDataEncryptionInner get(String resourceGroupName, String serverName, String databaseName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName).toBlocking().single().body();
    }

    /**
     * Gets a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransparentDataEncryptionInner> getAsync(String resourceGroupName, String serverName, String databaseName, final ServiceCallback<TransparentDataEncryptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Gets a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<TransparentDataEncryptionInner> getAsync(String resourceGroupName, String serverName, String databaseName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName).map(new Func1<ServiceResponse<TransparentDataEncryptionInner>, TransparentDataEncryptionInner>() {
            @Override
            public TransparentDataEncryptionInner call(ServiceResponse<TransparentDataEncryptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransparentDataEncryptionInner object
     */
    public Observable<ServiceResponse<TransparentDataEncryptionInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String transparentDataEncryptionName = "current";
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, transparentDataEncryptionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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

    private ServiceResponse<TransparentDataEncryptionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TransparentDataEncryptionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TransparentDataEncryptionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
