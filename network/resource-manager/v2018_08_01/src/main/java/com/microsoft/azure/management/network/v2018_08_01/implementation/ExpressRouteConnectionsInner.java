/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
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
 * in ExpressRouteConnections.
 */
public class ExpressRouteConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private ExpressRouteConnectionsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRouteConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRouteConnectionsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(ExpressRouteConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ExpressRouteConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExpressRouteConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_08_01.ExpressRouteConnections createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections/{connectionName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("expressRouteGatewayName") String expressRouteGatewayName, @Path("connectionName") String connectionName, @Path("subscriptionId") String subscriptionId, @Body ExpressRouteConnectionInner putExpressRouteConnectionParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_08_01.ExpressRouteConnections beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections/{connectionName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("expressRouteGatewayName") String expressRouteGatewayName, @Path("connectionName") String connectionName, @Path("subscriptionId") String subscriptionId, @Body ExpressRouteConnectionInner putExpressRouteConnectionParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_08_01.ExpressRouteConnections get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections/{connectionName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("expressRouteGatewayName") String expressRouteGatewayName, @Path("connectionName") String connectionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_08_01.ExpressRouteConnections delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections/{connectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("expressRouteGatewayName") String expressRouteGatewayName, @Path("connectionName") String connectionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_08_01.ExpressRouteConnections beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections/{connectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("resourceGroupName") String resourceGroupName, @Path("expressRouteGatewayName") String expressRouteGatewayName, @Path("connectionName") String connectionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2018_08_01.ExpressRouteConnections list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("expressRouteGatewayName") String expressRouteGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpressRouteConnectionInner object if successful.
     */
    public ExpressRouteConnectionInner createOrUpdate(String resourceGroupName, String expressRouteGatewayName, String connectionName, ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters).toBlocking().last().body();
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExpressRouteConnectionInner> createOrUpdateAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName, ExpressRouteConnectionInner putExpressRouteConnectionParameters, final ServiceCallback<ExpressRouteConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters), serviceCallback);
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ExpressRouteConnectionInner> createOrUpdateAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName, ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters).map(new Func1<ServiceResponse<ExpressRouteConnectionInner>, ExpressRouteConnectionInner>() {
            @Override
            public ExpressRouteConnectionInner call(ServiceResponse<ExpressRouteConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ExpressRouteConnectionInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName, ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (expressRouteGatewayName == null) {
            throw new IllegalArgumentException("Parameter expressRouteGatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (putExpressRouteConnectionParameters == null) {
            throw new IllegalArgumentException("Parameter putExpressRouteConnectionParameters is required and cannot be null.");
        }
        Validator.validate(putExpressRouteConnectionParameters);
        final String apiVersion = "2018-08-01";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, expressRouteGatewayName, connectionName, this.client.subscriptionId(), putExpressRouteConnectionParameters, apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<ExpressRouteConnectionInner>() { }.getType());
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpressRouteConnectionInner object if successful.
     */
    public ExpressRouteConnectionInner beginCreateOrUpdate(String resourceGroupName, String expressRouteGatewayName, String connectionName, ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters).toBlocking().single().body();
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExpressRouteConnectionInner> beginCreateOrUpdateAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName, ExpressRouteConnectionInner putExpressRouteConnectionParameters, final ServiceCallback<ExpressRouteConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters), serviceCallback);
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteConnectionInner object
     */
    public Observable<ExpressRouteConnectionInner> beginCreateOrUpdateAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName, ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters).map(new Func1<ServiceResponse<ExpressRouteConnectionInner>, ExpressRouteConnectionInner>() {
            @Override
            public ExpressRouteConnectionInner call(ServiceResponse<ExpressRouteConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters Parameters required in an ExpressRouteConnection PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteConnectionInner object
     */
    public Observable<ServiceResponse<ExpressRouteConnectionInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName, ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (expressRouteGatewayName == null) {
            throw new IllegalArgumentException("Parameter expressRouteGatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (putExpressRouteConnectionParameters == null) {
            throw new IllegalArgumentException("Parameter putExpressRouteConnectionParameters is required and cannot be null.");
        }
        Validator.validate(putExpressRouteConnectionParameters);
        final String apiVersion = "2018-08-01";
        return service.beginCreateOrUpdate(resourceGroupName, expressRouteGatewayName, connectionName, this.client.subscriptionId(), putExpressRouteConnectionParameters, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpressRouteConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<ExpressRouteConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpressRouteConnectionInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExpressRouteConnectionInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ExpressRouteConnectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ExpressRouteConnectionInner>() { }.getType())
                .register(201, new TypeToken<ExpressRouteConnectionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpressRouteConnectionInner object if successful.
     */
    public ExpressRouteConnectionInner get(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        return getWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName).toBlocking().single().body();
    }

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExpressRouteConnectionInner> getAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName, final ServiceCallback<ExpressRouteConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName), serviceCallback);
    }

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteConnectionInner object
     */
    public Observable<ExpressRouteConnectionInner> getAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        return getWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName).map(new Func1<ServiceResponse<ExpressRouteConnectionInner>, ExpressRouteConnectionInner>() {
            @Override
            public ExpressRouteConnectionInner call(ServiceResponse<ExpressRouteConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteConnectionInner object
     */
    public Observable<ServiceResponse<ExpressRouteConnectionInner>> getWithServiceResponseAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (expressRouteGatewayName == null) {
            throw new IllegalArgumentException("Parameter expressRouteGatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-08-01";
        return service.get(resourceGroupName, expressRouteGatewayName, connectionName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpressRouteConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<ExpressRouteConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpressRouteConnectionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExpressRouteConnectionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ExpressRouteConnectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ExpressRouteConnectionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        deleteWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName).toBlocking().last().body();
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName), serviceCallback);
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (expressRouteGatewayName == null) {
            throw new IllegalArgumentException("Parameter expressRouteGatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-08-01";
        Observable<Response<ResponseBody>> observable = service.delete(resourceGroupName, expressRouteGatewayName, connectionName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginDelete(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        beginDeleteWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName).toBlocking().single().body();
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginDeleteAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName), serviceCallback);
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginDeleteAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (expressRouteGatewayName == null) {
            throw new IllegalArgumentException("Parameter expressRouteGatewayName is required and cannot be null.");
        }
        if (connectionName == null) {
            throw new IllegalArgumentException("Parameter connectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-08-01";
        return service.beginDelete(resourceGroupName, expressRouteGatewayName, connectionName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
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

    private ServiceResponse<Void> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpressRouteConnectionListInner object if successful.
     */
    public ExpressRouteConnectionListInner list(String resourceGroupName, String expressRouteGatewayName) {
        return listWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName).toBlocking().single().body();
    }

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExpressRouteConnectionListInner> listAsync(String resourceGroupName, String expressRouteGatewayName, final ServiceCallback<ExpressRouteConnectionListInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName), serviceCallback);
    }

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteConnectionListInner object
     */
    public Observable<ExpressRouteConnectionListInner> listAsync(String resourceGroupName, String expressRouteGatewayName) {
        return listWithServiceResponseAsync(resourceGroupName, expressRouteGatewayName).map(new Func1<ServiceResponse<ExpressRouteConnectionListInner>, ExpressRouteConnectionListInner>() {
            @Override
            public ExpressRouteConnectionListInner call(ServiceResponse<ExpressRouteConnectionListInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteConnectionListInner object
     */
    public Observable<ServiceResponse<ExpressRouteConnectionListInner>> listWithServiceResponseAsync(String resourceGroupName, String expressRouteGatewayName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (expressRouteGatewayName == null) {
            throw new IllegalArgumentException("Parameter expressRouteGatewayName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-08-01";
        return service.list(resourceGroupName, expressRouteGatewayName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpressRouteConnectionListInner>>>() {
                @Override
                public Observable<ServiceResponse<ExpressRouteConnectionListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpressRouteConnectionListInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExpressRouteConnectionListInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ExpressRouteConnectionListInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ExpressRouteConnectionListInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
