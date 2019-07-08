/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ReplicationVaultHealths.
 */
public class ReplicationVaultHealthsInner {
    /** The Retrofit service to perform REST calls. */
    private ReplicationVaultHealthsService service;
    /** The service client containing this operation class. */
    private SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of ReplicationVaultHealthsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ReplicationVaultHealthsInner(Retrofit retrofit, SiteRecoveryManagementClientImpl client) {
        this.service = retrofit.create(ReplicationVaultHealthsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ReplicationVaultHealths to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ReplicationVaultHealthsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationVaultHealths get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{resourceName}/replicationVaultHealth")
        Observable<Response<ResponseBody>> get(@Path("resourceName") String resourceName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationVaultHealths refresh" })
        @POST("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{resourceName}/replicationVaultHealth/default/refresh")
        Observable<Response<ResponseBody>> refresh(@Path("resourceName") String resourceName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationVaultHealths beginRefresh" })
        @POST("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{resourceName}/replicationVaultHealth/default/refresh")
        Observable<Response<ResponseBody>> beginRefresh(@Path("resourceName") String resourceName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the health summary for the vault.
     * Gets the health details of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VaultHealthDetailsInner object if successful.
     */
    public VaultHealthDetailsInner get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the health summary for the vault.
     * Gets the health details of the vault.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VaultHealthDetailsInner> getAsync(final ServiceCallback<VaultHealthDetailsInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the health summary for the vault.
     * Gets the health details of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VaultHealthDetailsInner object
     */
    public Observable<VaultHealthDetailsInner> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<VaultHealthDetailsInner>, VaultHealthDetailsInner>() {
            @Override
            public VaultHealthDetailsInner call(ServiceResponse<VaultHealthDetailsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the health summary for the vault.
     * Gets the health details of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VaultHealthDetailsInner object
     */
    public Observable<ServiceResponse<VaultHealthDetailsInner>> getWithServiceResponseAsync() {
        if (this.client.resourceName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceName() is required and cannot be null.");
        }
        if (this.client.resourceGroupName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceGroupName() is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.resourceName(), this.client.resourceGroupName(), this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VaultHealthDetailsInner>>>() {
                @Override
                public Observable<ServiceResponse<VaultHealthDetailsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VaultHealthDetailsInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VaultHealthDetailsInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VaultHealthDetailsInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VaultHealthDetailsInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Refreshes health summary of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VaultHealthDetailsInner object if successful.
     */
    public VaultHealthDetailsInner refresh() {
        return refreshWithServiceResponseAsync().toBlocking().last().body();
    }

    /**
     * Refreshes health summary of the vault.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VaultHealthDetailsInner> refreshAsync(final ServiceCallback<VaultHealthDetailsInner> serviceCallback) {
        return ServiceFuture.fromResponse(refreshWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Refreshes health summary of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<VaultHealthDetailsInner> refreshAsync() {
        return refreshWithServiceResponseAsync().map(new Func1<ServiceResponse<VaultHealthDetailsInner>, VaultHealthDetailsInner>() {
            @Override
            public VaultHealthDetailsInner call(ServiceResponse<VaultHealthDetailsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Refreshes health summary of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<VaultHealthDetailsInner>> refreshWithServiceResponseAsync() {
        if (this.client.resourceName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceName() is required and cannot be null.");
        }
        if (this.client.resourceGroupName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceGroupName() is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Observable<Response<ResponseBody>> observable = service.refresh(this.client.resourceName(), this.client.resourceGroupName(), this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<VaultHealthDetailsInner>() { }.getType());
    }

    /**
     * Refreshes health summary of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VaultHealthDetailsInner object if successful.
     */
    public VaultHealthDetailsInner beginRefresh() {
        return beginRefreshWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Refreshes health summary of the vault.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VaultHealthDetailsInner> beginRefreshAsync(final ServiceCallback<VaultHealthDetailsInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginRefreshWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Refreshes health summary of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VaultHealthDetailsInner object
     */
    public Observable<VaultHealthDetailsInner> beginRefreshAsync() {
        return beginRefreshWithServiceResponseAsync().map(new Func1<ServiceResponse<VaultHealthDetailsInner>, VaultHealthDetailsInner>() {
            @Override
            public VaultHealthDetailsInner call(ServiceResponse<VaultHealthDetailsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Refreshes health summary of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VaultHealthDetailsInner object
     */
    public Observable<ServiceResponse<VaultHealthDetailsInner>> beginRefreshWithServiceResponseAsync() {
        if (this.client.resourceName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceName() is required and cannot be null.");
        }
        if (this.client.resourceGroupName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceGroupName() is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.beginRefresh(this.client.resourceName(), this.client.resourceGroupName(), this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VaultHealthDetailsInner>>>() {
                @Override
                public Observable<ServiceResponse<VaultHealthDetailsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VaultHealthDetailsInner> clientResponse = beginRefreshDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VaultHealthDetailsInner> beginRefreshDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VaultHealthDetailsInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VaultHealthDetailsInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
