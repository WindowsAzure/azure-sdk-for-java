/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.servicefabricmesh.ErrorModelException;
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
 * in CodePackages.
 */
public class CodePackagesInner {
    /** The Retrofit service to perform REST calls. */
    private CodePackagesService service;
    /** The service client containing this operation class. */
    private ServiceFabricMeshManagementClientImpl client;

    /**
     * Initializes an instance of CodePackagesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CodePackagesInner(Retrofit retrofit, ServiceFabricMeshManagementClientImpl client) {
        this.service = retrofit.create(CodePackagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for CodePackages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CodePackagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabricmesh.CodePackages getContainerLog" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ServiceFabricMesh/applications/{applicationName}/services/{serviceName}/replicas/{replicaName}/codePackages/{codePackageName}/logs")
        Observable<Response<ResponseBody>> getContainerLog(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path(value = "applicationName", encoded = true) String applicationName, @Path(value = "serviceName", encoded = true) String serviceName, @Path(value = "replicaName", encoded = true) String replicaName, @Path(value = "codePackageName", encoded = true) String codePackageName, @Query("api-version") String apiVersion, @Query("tail") Integer tail, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the logs for the container.
     * Get the logs for the container of a given code package of an application.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @param codePackageName The name of the code package.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ContainerLogsInner object if successful.
     */
    public ContainerLogsInner getContainerLog(String resourceGroupName, String applicationName, String serviceName, String replicaName, String codePackageName) {
        return getContainerLogWithServiceResponseAsync(resourceGroupName, applicationName, serviceName, replicaName, codePackageName).toBlocking().single().body();
    }

    /**
     * Gets the logs for the container.
     * Get the logs for the container of a given code package of an application.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @param codePackageName The name of the code package.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ContainerLogsInner> getContainerLogAsync(String resourceGroupName, String applicationName, String serviceName, String replicaName, String codePackageName, final ServiceCallback<ContainerLogsInner> serviceCallback) {
        return ServiceFuture.fromResponse(getContainerLogWithServiceResponseAsync(resourceGroupName, applicationName, serviceName, replicaName, codePackageName), serviceCallback);
    }

    /**
     * Gets the logs for the container.
     * Get the logs for the container of a given code package of an application.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @param codePackageName The name of the code package.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContainerLogsInner object
     */
    public Observable<ContainerLogsInner> getContainerLogAsync(String resourceGroupName, String applicationName, String serviceName, String replicaName, String codePackageName) {
        return getContainerLogWithServiceResponseAsync(resourceGroupName, applicationName, serviceName, replicaName, codePackageName).map(new Func1<ServiceResponse<ContainerLogsInner>, ContainerLogsInner>() {
            @Override
            public ContainerLogsInner call(ServiceResponse<ContainerLogsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the logs for the container.
     * Get the logs for the container of a given code package of an application.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @param codePackageName The name of the code package.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContainerLogsInner object
     */
    public Observable<ServiceResponse<ContainerLogsInner>> getContainerLogWithServiceResponseAsync(String resourceGroupName, String applicationName, String serviceName, String replicaName, String codePackageName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (applicationName == null) {
            throw new IllegalArgumentException("Parameter applicationName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (replicaName == null) {
            throw new IllegalArgumentException("Parameter replicaName is required and cannot be null.");
        }
        if (codePackageName == null) {
            throw new IllegalArgumentException("Parameter codePackageName is required and cannot be null.");
        }
        final Integer tail = null;
        return service.getContainerLog(this.client.subscriptionId(), resourceGroupName, applicationName, serviceName, replicaName, codePackageName, this.client.apiVersion(), tail, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ContainerLogsInner>>>() {
                @Override
                public Observable<ServiceResponse<ContainerLogsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ContainerLogsInner> clientResponse = getContainerLogDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the logs for the container.
     * Get the logs for the container of a given code package of an application.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @param codePackageName The name of the code package.
     * @param tail Number of lines to show from the end of the logs. Default is 100.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorModelException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ContainerLogsInner object if successful.
     */
    public ContainerLogsInner getContainerLog(String resourceGroupName, String applicationName, String serviceName, String replicaName, String codePackageName, Integer tail) {
        return getContainerLogWithServiceResponseAsync(resourceGroupName, applicationName, serviceName, replicaName, codePackageName, tail).toBlocking().single().body();
    }

    /**
     * Gets the logs for the container.
     * Get the logs for the container of a given code package of an application.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @param codePackageName The name of the code package.
     * @param tail Number of lines to show from the end of the logs. Default is 100.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ContainerLogsInner> getContainerLogAsync(String resourceGroupName, String applicationName, String serviceName, String replicaName, String codePackageName, Integer tail, final ServiceCallback<ContainerLogsInner> serviceCallback) {
        return ServiceFuture.fromResponse(getContainerLogWithServiceResponseAsync(resourceGroupName, applicationName, serviceName, replicaName, codePackageName, tail), serviceCallback);
    }

    /**
     * Gets the logs for the container.
     * Get the logs for the container of a given code package of an application.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @param codePackageName The name of the code package.
     * @param tail Number of lines to show from the end of the logs. Default is 100.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContainerLogsInner object
     */
    public Observable<ContainerLogsInner> getContainerLogAsync(String resourceGroupName, String applicationName, String serviceName, String replicaName, String codePackageName, Integer tail) {
        return getContainerLogWithServiceResponseAsync(resourceGroupName, applicationName, serviceName, replicaName, codePackageName, tail).map(new Func1<ServiceResponse<ContainerLogsInner>, ContainerLogsInner>() {
            @Override
            public ContainerLogsInner call(ServiceResponse<ContainerLogsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the logs for the container.
     * Get the logs for the container of a given code package of an application.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @param codePackageName The name of the code package.
     * @param tail Number of lines to show from the end of the logs. Default is 100.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContainerLogsInner object
     */
    public Observable<ServiceResponse<ContainerLogsInner>> getContainerLogWithServiceResponseAsync(String resourceGroupName, String applicationName, String serviceName, String replicaName, String codePackageName, Integer tail) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (applicationName == null) {
            throw new IllegalArgumentException("Parameter applicationName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (replicaName == null) {
            throw new IllegalArgumentException("Parameter replicaName is required and cannot be null.");
        }
        if (codePackageName == null) {
            throw new IllegalArgumentException("Parameter codePackageName is required and cannot be null.");
        }
        return service.getContainerLog(this.client.subscriptionId(), resourceGroupName, applicationName, serviceName, replicaName, codePackageName, this.client.apiVersion(), tail, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ContainerLogsInner>>>() {
                @Override
                public Observable<ServiceResponse<ContainerLogsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ContainerLogsInner> clientResponse = getContainerLogDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ContainerLogsInner> getContainerLogDelegate(Response<ResponseBody> response) throws ErrorModelException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ContainerLogsInner, ErrorModelException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ContainerLogsInner>() { }.getType())
                .registerError(ErrorModelException.class)
                .build(response);
    }

}
