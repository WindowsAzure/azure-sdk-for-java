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
 * in JobDetails.
 */
public class JobDetailsInner {
    /** The Retrofit service to perform REST calls. */
    private JobDetailsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of JobDetailsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public JobDetailsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(JobDetailsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for JobDetails to be
     * used by Retrofit to perform actually REST calls.
     */
    interface JobDetailsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.JobDetails get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupJobs/{jobName}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("jobName") String jobName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets extended information associated with the job.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param jobName Name of the job associated with this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobResourceInner object if successful.
     */
    public JobResourceInner get(String vaultName, String resourceGroupName, String jobName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, jobName).toBlocking().single().body();
    }

    /**
     * Gets extended information associated with the job.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param jobName Name of the job associated with this GET operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<JobResourceInner> getAsync(String vaultName, String resourceGroupName, String jobName, final ServiceCallback<JobResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, jobName), serviceCallback);
    }

    /**
     * Gets extended information associated with the job.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param jobName Name of the job associated with this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobResourceInner object
     */
    public Observable<JobResourceInner> getAsync(String vaultName, String resourceGroupName, String jobName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, jobName).map(new Func1<ServiceResponse<JobResourceInner>, JobResourceInner>() {
            @Override
            public JobResourceInner call(ServiceResponse<JobResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets extended information associated with the job.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param jobName Name of the job associated with this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobResourceInner object
     */
    public Observable<ServiceResponse<JobResourceInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String jobName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (jobName == null) {
            throw new IllegalArgumentException("Parameter jobName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), jobName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<JobResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<JobResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<JobResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<JobResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<JobResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<JobResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
