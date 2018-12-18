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
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ServerTableAuditingPolicies.
 */
public class ServerTableAuditingPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private ServerTableAuditingPoliciesService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerTableAuditingPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServerTableAuditingPoliciesInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(ServerTableAuditingPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServerTableAuditingPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServerTableAuditingPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.ServerTableAuditingPolicies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/auditingPolicies/{tableAuditingPolicyName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("tableAuditingPolicyName") String tableAuditingPolicyName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.ServerTableAuditingPolicies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/auditingPolicies/{tableAuditingPolicyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("tableAuditingPolicyName") String tableAuditingPolicyName, @Path("subscriptionId") String subscriptionId, @Body ServerTableAuditingPolicyInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.ServerTableAuditingPolicies listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/auditingPolicies")
        Observable<Response<ResponseBody>> listByServer(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerTableAuditingPolicyInner object if successful.
     */
    public ServerTableAuditingPolicyInner get(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Gets a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerTableAuditingPolicyInner> getAsync(String resourceGroupName, String serverName, final ServiceCallback<ServerTableAuditingPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Gets a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerTableAuditingPolicyInner object
     */
    public Observable<ServerTableAuditingPolicyInner> getAsync(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<ServerTableAuditingPolicyInner>, ServerTableAuditingPolicyInner>() {
            @Override
            public ServerTableAuditingPolicyInner call(ServiceResponse<ServerTableAuditingPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a server's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerTableAuditingPolicyInner object
     */
    public Observable<ServiceResponse<ServerTableAuditingPolicyInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String tableAuditingPolicyName = "default";
        return service.get(resourceGroupName, serverName, tableAuditingPolicyName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerTableAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerTableAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerTableAuditingPolicyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerTableAuditingPolicyInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerTableAuditingPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerTableAuditingPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or updates a servers's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The server table auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerTableAuditingPolicyInner object if successful.
     */
    public ServerTableAuditingPolicyInner createOrUpdate(String resourceGroupName, String serverName, ServerTableAuditingPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates a servers's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The server table auditing policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerTableAuditingPolicyInner> createOrUpdateAsync(String resourceGroupName, String serverName, ServerTableAuditingPolicyInner parameters, final ServiceCallback<ServerTableAuditingPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a servers's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The server table auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerTableAuditingPolicyInner object
     */
    public Observable<ServerTableAuditingPolicyInner> createOrUpdateAsync(String resourceGroupName, String serverName, ServerTableAuditingPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters).map(new Func1<ServiceResponse<ServerTableAuditingPolicyInner>, ServerTableAuditingPolicyInner>() {
            @Override
            public ServerTableAuditingPolicyInner call(ServiceResponse<ServerTableAuditingPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a servers's table auditing policy. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The server table auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerTableAuditingPolicyInner object
     */
    public Observable<ServiceResponse<ServerTableAuditingPolicyInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, ServerTableAuditingPolicyInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String tableAuditingPolicyName = "default";
        return service.createOrUpdate(resourceGroupName, serverName, tableAuditingPolicyName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerTableAuditingPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerTableAuditingPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerTableAuditingPolicyInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerTableAuditingPolicyInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerTableAuditingPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerTableAuditingPolicyInner>() { }.getType())
                .register(201, new TypeToken<ServerTableAuditingPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists a servers's table auditing policies. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerTableAuditingPolicyListResultInner object if successful.
     */
    public ServerTableAuditingPolicyListResultInner listByServer(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Lists a servers's table auditing policies. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerTableAuditingPolicyListResultInner> listByServerAsync(String resourceGroupName, String serverName, final ServiceCallback<ServerTableAuditingPolicyListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByServerWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Lists a servers's table auditing policies. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerTableAuditingPolicyListResultInner object
     */
    public Observable<ServerTableAuditingPolicyListResultInner> listByServerAsync(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<ServerTableAuditingPolicyListResultInner>, ServerTableAuditingPolicyListResultInner>() {
            @Override
            public ServerTableAuditingPolicyListResultInner call(ServiceResponse<ServerTableAuditingPolicyListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists a servers's table auditing policies. Table auditing is deprecated, use blob auditing instead.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerTableAuditingPolicyListResultInner object
     */
    public Observable<ServiceResponse<ServerTableAuditingPolicyListResultInner>> listByServerWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByServer(resourceGroupName, serverName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerTableAuditingPolicyListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerTableAuditingPolicyListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerTableAuditingPolicyListResultInner> clientResponse = listByServerDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerTableAuditingPolicyListResultInner> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerTableAuditingPolicyListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerTableAuditingPolicyListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
