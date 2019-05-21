/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

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
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ProtectionContainerOperationResults.
 */
public class ProtectionContainerOperationResultsInner {
    /** The Retrofit service to perform REST calls. */
    private ProtectionContainerOperationResultsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ProtectionContainerOperationResultsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProtectionContainerOperationResultsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(ProtectionContainerOperationResultsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProtectionContainerOperationResults to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProtectionContainerOperationResultsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectionContainerOperationResults get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/operationResults/{operationId}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Path("containerName") String containerName, @Path("operationId") String operationId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the result of any operation on the container.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the container.
     * @param containerName The container name used for this GET operation.
     * @param operationId The operation ID used for this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProtectionContainerResourceInner object if successful.
     */
    public ProtectionContainerResourceInner get(String vaultName, String resourceGroupName, String fabricName, String containerName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, operationId).toBlocking().single().body();
    }

    /**
     * Gets the result of any operation on the container.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the container.
     * @param containerName The container name used for this GET operation.
     * @param operationId The operation ID used for this GET operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProtectionContainerResourceInner> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String operationId, final ServiceCallback<ProtectionContainerResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, operationId), serviceCallback);
    }

    /**
     * Gets the result of any operation on the container.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the container.
     * @param containerName The container name used for this GET operation.
     * @param operationId The operation ID used for this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionContainerResourceInner object
     */
    public Observable<ProtectionContainerResourceInner> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, operationId).map(new Func1<ServiceResponse<ProtectionContainerResourceInner>, ProtectionContainerResourceInner>() {
            @Override
            public ProtectionContainerResourceInner call(ServiceResponse<ProtectionContainerResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the result of any operation on the container.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the container.
     * @param containerName The container name used for this GET operation.
     * @param operationId The operation ID used for this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionContainerResourceInner object
     */
    public Observable<ServiceResponse<ProtectionContainerResourceInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String operationId) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (fabricName == null) {
            throw new IllegalArgumentException("Parameter fabricName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, containerName, operationId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProtectionContainerResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ProtectionContainerResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProtectionContainerResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProtectionContainerResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProtectionContainerResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProtectionContainerResourceInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
