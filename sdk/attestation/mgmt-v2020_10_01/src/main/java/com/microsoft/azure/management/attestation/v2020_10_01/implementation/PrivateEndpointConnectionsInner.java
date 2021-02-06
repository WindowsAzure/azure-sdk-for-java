/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.attestation.v2020_10_01.PrivateEndpointConnectionProvisioningState;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
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
 * in PrivateEndpointConnections.
 */
public class PrivateEndpointConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private PrivateEndpointConnectionsService service;
    /** The service client containing this operation class. */
    private AttestationManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateEndpointConnectionsInner(Retrofit retrofit, AttestationManagementClientImpl client) {
        this.service = retrofit.create(PrivateEndpointConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateEndpointConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateEndpointConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.attestation.v2020_10_01.PrivateEndpointConnections list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Attestation/attestationProvider/{providerName}/privateEndpointConnections")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("providerName") String providerName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.attestation.v2020_10_01.PrivateEndpointConnections get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Attestation/attestationProviders/{providerName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("providerName") String providerName, @Path("subscriptionId") String subscriptionId, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.attestation.v2020_10_01.PrivateEndpointConnections create" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Attestation/attestationProviders/{providerName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> create(@Path("resourceGroupName") String resourceGroupName, @Path("providerName") String providerName, @Path("subscriptionId") String subscriptionId, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body PrivateEndpointConnectionInner properties, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.attestation.v2020_10_01.PrivateEndpointConnections delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Attestation/attestationProviders/{providerName}/privateEndpointConnections/{privateEndpointConnectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("providerName") String providerName, @Path("subscriptionId") String subscriptionId, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List all the private endpoint connections associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PrivateEndpointConnectionInner&gt; object if successful.
     */
    public List<PrivateEndpointConnectionInner> list(String resourceGroupName, String providerName) {
        return listWithServiceResponseAsync(resourceGroupName, providerName).toBlocking().single().body();
    }

    /**
     * List all the private endpoint connections associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PrivateEndpointConnectionInner>> listAsync(String resourceGroupName, String providerName, final ServiceCallback<List<PrivateEndpointConnectionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, providerName), serviceCallback);
    }

    /**
     * List all the private endpoint connections associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PrivateEndpointConnectionInner&gt; object
     */
    public Observable<List<PrivateEndpointConnectionInner>> listAsync(String resourceGroupName, String providerName) {
        return listWithServiceResponseAsync(resourceGroupName, providerName).map(new Func1<ServiceResponse<List<PrivateEndpointConnectionInner>>, List<PrivateEndpointConnectionInner>>() {
            @Override
            public List<PrivateEndpointConnectionInner> call(ServiceResponse<List<PrivateEndpointConnectionInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * List all the private endpoint connections associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PrivateEndpointConnectionInner&gt; object
     */
    public Observable<ServiceResponse<List<PrivateEndpointConnectionInner>>> listWithServiceResponseAsync(String resourceGroupName, String providerName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (providerName == null) {
            throw new IllegalArgumentException("Parameter providerName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceGroupName, providerName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<PrivateEndpointConnectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<PrivateEndpointConnectionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PrivateEndpointConnectionInner>> result = listDelegate(response);
                        List<PrivateEndpointConnectionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<PrivateEndpointConnectionInner>> clientResponse = new ServiceResponse<List<PrivateEndpointConnectionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PrivateEndpointConnectionInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PrivateEndpointConnectionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PrivateEndpointConnectionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner get(String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Gets the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Gets the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName).map(new Func1<ServiceResponse<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponse<PrivateEndpointConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionInner>> getWithServiceResponseAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (providerName == null) {
            throw new IllegalArgumentException("Parameter providerName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, providerName, this.client.subscriptionId(), privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateEndpointConnectionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update the state of specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner create(String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        return createWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Update the state of specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> createAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Update the state of specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<PrivateEndpointConnectionInner> createAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        return createWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName).map(new Func1<ServiceResponse<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponse<PrivateEndpointConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update the state of specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionInner>> createWithServiceResponseAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (providerName == null) {
            throw new IllegalArgumentException("Parameter providerName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final PrivateEndpointConnectionProvisioningState provisioningState = null;
        PrivateEndpointConnectionInner properties = new PrivateEndpointConnectionInner();
        properties.withProvisioningState(null);
        return service.create(resourceGroupName, providerName, this.client.subscriptionId(), privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), properties, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update the state of specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @param provisioningState Provisioning state of the private endpoint connection. Possible values include: 'Succeeded', 'Creating', 'Deleting', 'Failed'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner create(String resourceGroupName, String providerName, String privateEndpointConnectionName, PrivateEndpointConnectionProvisioningState provisioningState) {
        return createWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName, provisioningState).toBlocking().single().body();
    }

    /**
     * Update the state of specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @param provisioningState Provisioning state of the private endpoint connection. Possible values include: 'Succeeded', 'Creating', 'Deleting', 'Failed'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> createAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName, PrivateEndpointConnectionProvisioningState provisioningState, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName, provisioningState), serviceCallback);
    }

    /**
     * Update the state of specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @param provisioningState Provisioning state of the private endpoint connection. Possible values include: 'Succeeded', 'Creating', 'Deleting', 'Failed'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<PrivateEndpointConnectionInner> createAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName, PrivateEndpointConnectionProvisioningState provisioningState) {
        return createWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName, provisioningState).map(new Func1<ServiceResponse<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponse<PrivateEndpointConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update the state of specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @param provisioningState Provisioning state of the private endpoint connection. Possible values include: 'Succeeded', 'Creating', 'Deleting', 'Failed'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionInner>> createWithServiceResponseAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName, PrivateEndpointConnectionProvisioningState provisioningState) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (providerName == null) {
            throw new IllegalArgumentException("Parameter providerName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        PrivateEndpointConnectionInner properties = new PrivateEndpointConnectionInner();
        properties.withProvisioningState(provisioningState);
        return service.create(resourceGroupName, providerName, this.client.subscriptionId(), privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), properties, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateEndpointConnectionInner> createDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        deleteWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Deletes the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Deletes the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, providerName, privateEndpointConnectionName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the attestation providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (providerName == null) {
            throw new IllegalArgumentException("Parameter providerName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, providerName, this.client.subscriptionId(), privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
