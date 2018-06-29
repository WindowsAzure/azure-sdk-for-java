/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ILRRequestResource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
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
 * in ItemLevelRecoveryConnections.
 */
public class ItemLevelRecoveryConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private ItemLevelRecoveryConnectionsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ItemLevelRecoveryConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ItemLevelRecoveryConnectionsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(ItemLevelRecoveryConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ItemLevelRecoveryConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ItemLevelRecoveryConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ItemLevelRecoveryConnections revoke" })
        @POST("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/protectedItems/{protectedItemName}/recoveryPoints/{recoveryPointId}/revokeInstantItemRecovery")
        Observable<Response<ResponseBody>> revoke(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Path("containerName") String containerName, @Path("protectedItemName") String protectedItemName, @Path("recoveryPointId") String recoveryPointId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ItemLevelRecoveryConnections provision" })
        @POST("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/protectedItems/{protectedItemName}/recoveryPoints/{recoveryPointId}/provisionInstantItemRecovery")
        Observable<Response<ResponseBody>> provision(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Path("containerName") String containerName, @Path("protectedItemName") String protectedItemName, @Path("recoveryPointId") String recoveryPointId, @Query("api-version") String apiVersion, @Body ILRRequestResource resourceILRRequest, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup items. The value allowed is Azure.
     * @param containerName The container name associated with the backup items.
     * @param protectedItemName The name of the backup items whose files or folders will be restored.
     * @param recoveryPointId The string that identifies the recovery point. The iSCSI connection will be revoked for this protected data.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void revoke(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId) {
        revokeWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId).toBlocking().single().body();
    }

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup items. The value allowed is Azure.
     * @param containerName The container name associated with the backup items.
     * @param protectedItemName The name of the backup items whose files or folders will be restored.
     * @param recoveryPointId The string that identifies the recovery point. The iSCSI connection will be revoked for this protected data.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> revokeAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(revokeWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId), serviceCallback);
    }

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup items. The value allowed is Azure.
     * @param containerName The container name associated with the backup items.
     * @param protectedItemName The name of the backup items whose files or folders will be restored.
     * @param recoveryPointId The string that identifies the recovery point. The iSCSI connection will be revoked for this protected data.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> revokeAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId) {
        return revokeWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup items. The value allowed is Azure.
     * @param containerName The container name associated with the backup items.
     * @param protectedItemName The name of the backup items whose files or folders will be restored.
     * @param recoveryPointId The string that identifies the recovery point. The iSCSI connection will be revoked for this protected data.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> revokeWithServiceResponseAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId) {
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
        if (protectedItemName == null) {
            throw new IllegalArgumentException("Parameter protectedItemName is required and cannot be null.");
        }
        if (recoveryPointId == null) {
            throw new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.revoke(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, containerName, protectedItemName, recoveryPointId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = revokeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> revokeDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens File Explorer which displays the recoverable files and folders. This is an asynchronous operation. To get the provisioning status, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup items.
     * @param containerName The container name associated with the backup items.
     * @param protectedItemName The name of the backup item whose files or folders are to be restored.
     * @param recoveryPointId The recovery point ID for backup data. The iSCSI connection will be provisioned for this backup data.
     * @param resourceILRRequest The resource Item Level Recovery (ILR) request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void provision(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId, ILRRequestResource resourceILRRequest) {
        provisionWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId, resourceILRRequest).toBlocking().single().body();
    }

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens File Explorer which displays the recoverable files and folders. This is an asynchronous operation. To get the provisioning status, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup items.
     * @param containerName The container name associated with the backup items.
     * @param protectedItemName The name of the backup item whose files or folders are to be restored.
     * @param recoveryPointId The recovery point ID for backup data. The iSCSI connection will be provisioned for this backup data.
     * @param resourceILRRequest The resource Item Level Recovery (ILR) request.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> provisionAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId, ILRRequestResource resourceILRRequest, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(provisionWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId, resourceILRRequest), serviceCallback);
    }

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens File Explorer which displays the recoverable files and folders. This is an asynchronous operation. To get the provisioning status, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup items.
     * @param containerName The container name associated with the backup items.
     * @param protectedItemName The name of the backup item whose files or folders are to be restored.
     * @param recoveryPointId The recovery point ID for backup data. The iSCSI connection will be provisioned for this backup data.
     * @param resourceILRRequest The resource Item Level Recovery (ILR) request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> provisionAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId, ILRRequestResource resourceILRRequest) {
        return provisionWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId, resourceILRRequest).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens File Explorer which displays the recoverable files and folders. This is an asynchronous operation. To get the provisioning status, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup items.
     * @param containerName The container name associated with the backup items.
     * @param protectedItemName The name of the backup item whose files or folders are to be restored.
     * @param recoveryPointId The recovery point ID for backup data. The iSCSI connection will be provisioned for this backup data.
     * @param resourceILRRequest The resource Item Level Recovery (ILR) request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> provisionWithServiceResponseAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId, ILRRequestResource resourceILRRequest) {
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
        if (protectedItemName == null) {
            throw new IllegalArgumentException("Parameter protectedItemName is required and cannot be null.");
        }
        if (recoveryPointId == null) {
            throw new IllegalArgumentException("Parameter recoveryPointId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (resourceILRRequest == null) {
            throw new IllegalArgumentException("Parameter resourceILRRequest is required and cannot be null.");
        }
        Validator.validate(resourceILRRequest);
        return service.provision(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, containerName, protectedItemName, recoveryPointId, this.client.apiVersion(), resourceILRRequest, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = provisionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> provisionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
