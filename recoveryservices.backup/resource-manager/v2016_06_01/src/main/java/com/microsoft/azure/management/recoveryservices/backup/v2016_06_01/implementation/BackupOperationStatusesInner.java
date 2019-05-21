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
 * in BackupOperationStatuses.
 */
public class BackupOperationStatusesInner {
    /** The Retrofit service to perform REST calls. */
    private BackupOperationStatusesService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupOperationStatusesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupOperationStatusesInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(BackupOperationStatusesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BackupOperationStatuses to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupOperationStatusesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.BackupOperationStatuses get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupOperations/{operationId}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("operationId") String operationId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the status of an operation such as triggering a backup or restore. The status can be In progress, Completed or Failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param operationId The ID of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatusInner object if successful.
     */
    public OperationStatusInner get(String vaultName, String resourceGroupName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, operationId).toBlocking().single().body();
    }

    /**
     * Gets the status of an operation such as triggering a backup or restore. The status can be In progress, Completed or Failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param operationId The ID of the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatusInner> getAsync(String vaultName, String resourceGroupName, String operationId, final ServiceCallback<OperationStatusInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, operationId), serviceCallback);
    }

    /**
     * Gets the status of an operation such as triggering a backup or restore. The status can be In progress, Completed or Failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param operationId The ID of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusInner object
     */
    public Observable<OperationStatusInner> getAsync(String vaultName, String resourceGroupName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, operationId).map(new Func1<ServiceResponse<OperationStatusInner>, OperationStatusInner>() {
            @Override
            public OperationStatusInner call(ServiceResponse<OperationStatusInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the status of an operation such as triggering a backup or restore. The status can be In progress, Completed or Failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param operationId The ID of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusInner object
     */
    public Observable<ServiceResponse<OperationStatusInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String operationId) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), operationId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatusInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatusInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatusInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatusInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatusInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatusInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
