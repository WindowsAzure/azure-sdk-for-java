/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
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
 * in IntegrationRuntimeMonitoringDatas.
 */
public class IntegrationRuntimeMonitoringDatasInner {
    /** The Retrofit service to perform REST calls. */
    private IntegrationRuntimeMonitoringDatasService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationRuntimeMonitoringDatasInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntegrationRuntimeMonitoringDatasInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(IntegrationRuntimeMonitoringDatasService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for IntegrationRuntimeMonitoringDatas to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntegrationRuntimeMonitoringDatasService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeMonitoringDatas list" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/monitoringData")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("integrationRuntimeName") String integrationRuntimeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get integration runtime monitoring data.
     * Get monitoring data for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IntegrationRuntimeMonitoringDataInner object if successful.
     */
    public IntegrationRuntimeMonitoringDataInner list(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName).toBlocking().single().body();
    }

    /**
     * Get integration runtime monitoring data.
     * Get monitoring data for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<IntegrationRuntimeMonitoringDataInner> listAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, final ServiceCallback<IntegrationRuntimeMonitoringDataInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName), serviceCallback);
    }

    /**
     * Get integration runtime monitoring data.
     * Get monitoring data for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IntegrationRuntimeMonitoringDataInner object
     */
    public Observable<IntegrationRuntimeMonitoringDataInner> listAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName).map(new Func1<ServiceResponse<IntegrationRuntimeMonitoringDataInner>, IntegrationRuntimeMonitoringDataInner>() {
            @Override
            public IntegrationRuntimeMonitoringDataInner call(ServiceResponse<IntegrationRuntimeMonitoringDataInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get integration runtime monitoring data.
     * Get monitoring data for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IntegrationRuntimeMonitoringDataInner object
     */
    public Observable<ServiceResponse<IntegrationRuntimeMonitoringDataInner>> listWithServiceResponseAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, workspaceName, integrationRuntimeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<IntegrationRuntimeMonitoringDataInner>>>() {
                @Override
                public Observable<ServiceResponse<IntegrationRuntimeMonitoringDataInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<IntegrationRuntimeMonitoringDataInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<IntegrationRuntimeMonitoringDataInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<IntegrationRuntimeMonitoringDataInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<IntegrationRuntimeMonitoringDataInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
