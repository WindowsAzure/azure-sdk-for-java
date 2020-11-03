/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.management.keyvault.v20190901.PrivateEndpointConnections;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.keyvault.v20190901.models.PrivateEndpointConnection;
import com.microsoft.azure.management.keyvault.v20190901.models.PrivateEndpointConnectionsDeleteHeaders;
import com.microsoft.azure.management.keyvault.v20190901.models.PrivateEndpointConnectionsPutHeaders;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
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
 * in PrivateEndpointConnections.
 */
public class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    /** The Retrofit service to perform REST calls. */
    private PrivateEndpointConnectionsService service;
    /** The service client containing this operation class. */
    private KeyVaultManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateEndpointConnectionsImpl(Retrofit retrofit, KeyVaultManagementClientImpl client) {
        this.service = retrofit.create(PrivateEndpointConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateEndpointConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateEndpointConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.keyvault.v20190901.PrivateEndpointConnections get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vaultName") String vaultName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.keyvault.v20190901.PrivateEndpointConnections put" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> put(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vaultName") String vaultName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Body PrivateEndpointConnection properties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.keyvault.v20190901.PrivateEndpointConnections delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vaultName") String vaultName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.keyvault.v20190901.PrivateEndpointConnections beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vaultName") String vaultName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnection object if successful.
     */
    public PrivateEndpointConnection get(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnection> getAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnection> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnection object
     */
    public Observable<PrivateEndpointConnection> getAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).map(new Func1<ServiceResponse<PrivateEndpointConnection>, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(ServiceResponse<PrivateEndpointConnection> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnection object
     */
    public Observable<ServiceResponse<PrivateEndpointConnection>> getWithServiceResponseAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, vaultName, privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnection>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnection>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnection> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateEndpointConnection> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnection, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnection object if successful.
     */
    public PrivateEndpointConnection put(String resourceGroupName, String vaultName, String privateEndpointConnectionName, PrivateEndpointConnection properties) {
        return putWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName, properties).toBlocking().single().body();
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnection> putAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, PrivateEndpointConnection properties, final ServiceCallback<PrivateEndpointConnection> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(putWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName, properties), serviceCallback);
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnection object
     */
    public Observable<PrivateEndpointConnection> putAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, PrivateEndpointConnection properties) {
        return putWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName, properties).map(new Func1<ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsPutHeaders>, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsPutHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnection object
     */
    public Observable<ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsPutHeaders>> putWithServiceResponseAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, PrivateEndpointConnection properties) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (properties == null) {
            throw new IllegalArgumentException("Parameter properties is required and cannot be null.");
        }
        Validator.validate(properties);
        return service.put(this.client.subscriptionId(), resourceGroupName, vaultName, privateEndpointConnectionName, this.client.apiVersion(), properties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsPutHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsPutHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsPutHeaders> clientResponse = putDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsPutHeaders> putDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnection, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnection>() { }.getType())
                .registerError(CloudException.class)
                .buildWithHeaders(response, PrivateEndpointConnectionsPutHeaders.class);
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnection object if successful.
     */
    public PrivateEndpointConnection delete(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).toBlocking().last().body();
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnection> deleteAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnection> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(deleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<PrivateEndpointConnection> deleteAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).map(new Func1<ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsDeleteHeaders>, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsDeleteHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsDeleteHeaders>> deleteWithServiceResponseAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Observable<Response<ResponseBody>> observable = service.delete(this.client.subscriptionId(), resourceGroupName, vaultName, privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultWithHeadersAsync(observable, new TypeToken<PrivateEndpointConnection>() { }.getType(), PrivateEndpointConnectionsDeleteHeaders.class);
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnection object if successful.
     */
    public PrivateEndpointConnection beginDelete(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnection> beginDeleteAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnection> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnection object
     */
    public Observable<PrivateEndpointConnection> beginDeleteAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName).map(new Func1<ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsDeleteHeaders>, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsDeleteHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnection object
     */
    public Observable<ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsDeleteHeaders>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.beginDelete(this.client.subscriptionId(), resourceGroupName, vaultName, privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsDeleteHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsDeleteHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsDeleteHeaders> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<PrivateEndpointConnection, PrivateEndpointConnectionsDeleteHeaders> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnection, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnection>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildWithHeaders(response, PrivateEndpointConnectionsDeleteHeaders.class);
    }

}
