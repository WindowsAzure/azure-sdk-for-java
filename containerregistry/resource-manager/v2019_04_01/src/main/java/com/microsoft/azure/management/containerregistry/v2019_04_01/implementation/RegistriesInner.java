/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.containerregistry.v2019_04_01.RunRequest;
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
 * in Registries.
 */
public class RegistriesInner {
    /** The Retrofit service to perform REST calls. */
    private RegistriesService service;
    /** The service client containing this operation class. */
    private ContainerRegistryManagementClientImpl client;

    /**
     * Initializes an instance of RegistriesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RegistriesInner(Retrofit retrofit, ContainerRegistryManagementClientImpl client) {
        this.service = retrofit.create(RegistriesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Registries to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RegistriesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerregistry.v2019_04_01.Registries scheduleRun" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerRegistry/registries/{registryName}/scheduleRun")
        Observable<Response<ResponseBody>> scheduleRun(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("registryName") String registryName, @Query("api-version") String apiVersion, @Body RunRequest runRequest, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerregistry.v2019_04_01.Registries beginScheduleRun" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerRegistry/registries/{registryName}/scheduleRun")
        Observable<Response<ResponseBody>> beginScheduleRun(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("registryName") String registryName, @Query("api-version") String apiVersion, @Body RunRequest runRequest, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerregistry.v2019_04_01.Registries getBuildSourceUploadUrl" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerRegistry/registries/{registryName}/listBuildSourceUploadUrl")
        Observable<Response<ResponseBody>> getBuildSourceUploadUrl(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("registryName") String registryName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runRequest The parameters of a run that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RunInner object if successful.
     */
    public RunInner scheduleRun(String resourceGroupName, String registryName, RunRequest runRequest) {
        return scheduleRunWithServiceResponseAsync(resourceGroupName, registryName, runRequest).toBlocking().last().body();
    }

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runRequest The parameters of a run that needs to scheduled.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RunInner> scheduleRunAsync(String resourceGroupName, String registryName, RunRequest runRequest, final ServiceCallback<RunInner> serviceCallback) {
        return ServiceFuture.fromResponse(scheduleRunWithServiceResponseAsync(resourceGroupName, registryName, runRequest), serviceCallback);
    }

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runRequest The parameters of a run that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<RunInner> scheduleRunAsync(String resourceGroupName, String registryName, RunRequest runRequest) {
        return scheduleRunWithServiceResponseAsync(resourceGroupName, registryName, runRequest).map(new Func1<ServiceResponse<RunInner>, RunInner>() {
            @Override
            public RunInner call(ServiceResponse<RunInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runRequest The parameters of a run that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<RunInner>> scheduleRunWithServiceResponseAsync(String resourceGroupName, String registryName, RunRequest runRequest) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (registryName == null) {
            throw new IllegalArgumentException("Parameter registryName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (runRequest == null) {
            throw new IllegalArgumentException("Parameter runRequest is required and cannot be null.");
        }
        Validator.validate(runRequest);
        Observable<Response<ResponseBody>> observable = service.scheduleRun(this.client.subscriptionId(), resourceGroupName, registryName, this.client.apiVersion(), runRequest, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<RunInner>() { }.getType());
    }

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runRequest The parameters of a run that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RunInner object if successful.
     */
    public RunInner beginScheduleRun(String resourceGroupName, String registryName, RunRequest runRequest) {
        return beginScheduleRunWithServiceResponseAsync(resourceGroupName, registryName, runRequest).toBlocking().single().body();
    }

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runRequest The parameters of a run that needs to scheduled.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RunInner> beginScheduleRunAsync(String resourceGroupName, String registryName, RunRequest runRequest, final ServiceCallback<RunInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginScheduleRunWithServiceResponseAsync(resourceGroupName, registryName, runRequest), serviceCallback);
    }

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runRequest The parameters of a run that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RunInner object
     */
    public Observable<RunInner> beginScheduleRunAsync(String resourceGroupName, String registryName, RunRequest runRequest) {
        return beginScheduleRunWithServiceResponseAsync(resourceGroupName, registryName, runRequest).map(new Func1<ServiceResponse<RunInner>, RunInner>() {
            @Override
            public RunInner call(ServiceResponse<RunInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runRequest The parameters of a run that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RunInner object
     */
    public Observable<ServiceResponse<RunInner>> beginScheduleRunWithServiceResponseAsync(String resourceGroupName, String registryName, RunRequest runRequest) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (registryName == null) {
            throw new IllegalArgumentException("Parameter registryName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (runRequest == null) {
            throw new IllegalArgumentException("Parameter runRequest is required and cannot be null.");
        }
        Validator.validate(runRequest);
        return service.beginScheduleRun(this.client.subscriptionId(), resourceGroupName, registryName, this.client.apiVersion(), runRequest, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RunInner>>>() {
                @Override
                public Observable<ServiceResponse<RunInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RunInner> clientResponse = beginScheduleRunDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RunInner> beginScheduleRunDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RunInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RunInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the upload location for the user to be able to upload the source.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SourceUploadDefinitionInner object if successful.
     */
    public SourceUploadDefinitionInner getBuildSourceUploadUrl(String resourceGroupName, String registryName) {
        return getBuildSourceUploadUrlWithServiceResponseAsync(resourceGroupName, registryName).toBlocking().single().body();
    }

    /**
     * Get the upload location for the user to be able to upload the source.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SourceUploadDefinitionInner> getBuildSourceUploadUrlAsync(String resourceGroupName, String registryName, final ServiceCallback<SourceUploadDefinitionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getBuildSourceUploadUrlWithServiceResponseAsync(resourceGroupName, registryName), serviceCallback);
    }

    /**
     * Get the upload location for the user to be able to upload the source.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SourceUploadDefinitionInner object
     */
    public Observable<SourceUploadDefinitionInner> getBuildSourceUploadUrlAsync(String resourceGroupName, String registryName) {
        return getBuildSourceUploadUrlWithServiceResponseAsync(resourceGroupName, registryName).map(new Func1<ServiceResponse<SourceUploadDefinitionInner>, SourceUploadDefinitionInner>() {
            @Override
            public SourceUploadDefinitionInner call(ServiceResponse<SourceUploadDefinitionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the upload location for the user to be able to upload the source.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SourceUploadDefinitionInner object
     */
    public Observable<ServiceResponse<SourceUploadDefinitionInner>> getBuildSourceUploadUrlWithServiceResponseAsync(String resourceGroupName, String registryName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (registryName == null) {
            throw new IllegalArgumentException("Parameter registryName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getBuildSourceUploadUrl(this.client.subscriptionId(), resourceGroupName, registryName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SourceUploadDefinitionInner>>>() {
                @Override
                public Observable<ServiceResponse<SourceUploadDefinitionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SourceUploadDefinitionInner> clientResponse = getBuildSourceUploadUrlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SourceUploadDefinitionInner> getBuildSourceUploadUrlDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SourceUploadDefinitionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SourceUploadDefinitionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
