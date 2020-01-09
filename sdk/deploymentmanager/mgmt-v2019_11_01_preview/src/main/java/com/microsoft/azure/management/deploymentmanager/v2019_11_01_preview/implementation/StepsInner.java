/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsGet;
import com.microsoft.azure.arm.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
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
 * in Steps.
 */
public class StepsInner implements InnerSupportsGet<StepResourceInner>, InnerSupportsDelete<Void> {
    /** The Retrofit service to perform REST calls. */
    private StepsService service;
    /** The service client containing this operation class. */
    private AzureDeploymentManagerImpl client;

    /**
     * Initializes an instance of StepsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public StepsInner(Retrofit retrofit, AzureDeploymentManagerImpl client) {
        this.service = retrofit.create(StepsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Steps to be
     * used by Retrofit to perform actually REST calls.
     */
    interface StepsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Steps createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/steps/{stepName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("stepName") String stepName, @Query("api-version") String apiVersion, @Body StepResourceInner stepInfo, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Steps getByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/steps/{stepName}")
        Observable<Response<ResponseBody>> getByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("stepName") String stepName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Steps delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/steps/{stepName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("stepName") String stepName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Steps listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/steps")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates or updates a rollout step with the given step properties.
     * Synchronously creates a new step or updates an existing step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the StepResourceInner object if successful.
     */
    public StepResourceInner createOrUpdate(String resourceGroupName, String stepName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, stepName).toBlocking().single().body();
    }

    /**
     * Creates or updates a rollout step with the given step properties.
     * Synchronously creates a new step or updates an existing step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<StepResourceInner> createOrUpdateAsync(String resourceGroupName, String stepName, final ServiceCallback<StepResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, stepName), serviceCallback);
    }

    /**
     * Creates or updates a rollout step with the given step properties.
     * Synchronously creates a new step or updates an existing step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the StepResourceInner object
     */
    public Observable<StepResourceInner> createOrUpdateAsync(String resourceGroupName, String stepName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, stepName).map(new Func1<ServiceResponse<StepResourceInner>, StepResourceInner>() {
            @Override
            public StepResourceInner call(ServiceResponse<StepResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a rollout step with the given step properties.
     * Synchronously creates a new step or updates an existing step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the StepResourceInner object
     */
    public Observable<ServiceResponse<StepResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String stepName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (stepName == null) {
            throw new IllegalArgumentException("Parameter stepName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final StepResourceInner stepInfo = null;
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, stepName, this.client.apiVersion(), stepInfo, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<StepResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<StepResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<StepResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Creates or updates a rollout step with the given step properties.
     * Synchronously creates a new step or updates an existing step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @param stepInfo The step object.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the StepResourceInner object if successful.
     */
    public StepResourceInner createOrUpdate(String resourceGroupName, String stepName, StepResourceInner stepInfo) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, stepName, stepInfo).toBlocking().single().body();
    }

    /**
     * Creates or updates a rollout step with the given step properties.
     * Synchronously creates a new step or updates an existing step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @param stepInfo The step object.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<StepResourceInner> createOrUpdateAsync(String resourceGroupName, String stepName, StepResourceInner stepInfo, final ServiceCallback<StepResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, stepName, stepInfo), serviceCallback);
    }

    /**
     * Creates or updates a rollout step with the given step properties.
     * Synchronously creates a new step or updates an existing step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @param stepInfo The step object.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the StepResourceInner object
     */
    public Observable<StepResourceInner> createOrUpdateAsync(String resourceGroupName, String stepName, StepResourceInner stepInfo) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, stepName, stepInfo).map(new Func1<ServiceResponse<StepResourceInner>, StepResourceInner>() {
            @Override
            public StepResourceInner call(ServiceResponse<StepResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a rollout step with the given step properties.
     * Synchronously creates a new step or updates an existing step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @param stepInfo The step object.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the StepResourceInner object
     */
    public Observable<ServiceResponse<StepResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String stepName, StepResourceInner stepInfo) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (stepName == null) {
            throw new IllegalArgumentException("Parameter stepName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(stepInfo);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, stepName, this.client.apiVersion(), stepInfo, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<StepResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<StepResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<StepResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<StepResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<StepResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<StepResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the StepResourceInner object if successful.
     */
    public StepResourceInner getByResourceGroup(String resourceGroupName, String stepName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, stepName).toBlocking().single().body();
    }

    /**
     * Gets the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<StepResourceInner> getByResourceGroupAsync(String resourceGroupName, String stepName, final ServiceCallback<StepResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByResourceGroupWithServiceResponseAsync(resourceGroupName, stepName), serviceCallback);
    }

    /**
     * Gets the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the StepResourceInner object
     */
    public Observable<StepResourceInner> getByResourceGroupAsync(String resourceGroupName, String stepName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, stepName).map(new Func1<ServiceResponse<StepResourceInner>, StepResourceInner>() {
            @Override
            public StepResourceInner call(ServiceResponse<StepResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the StepResourceInner object
     */
    public Observable<ServiceResponse<StepResourceInner>> getByResourceGroupWithServiceResponseAsync(String resourceGroupName, String stepName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (stepName == null) {
            throw new IllegalArgumentException("Parameter stepName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByResourceGroup(this.client.subscriptionId(), resourceGroupName, stepName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<StepResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<StepResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<StepResourceInner> clientResponse = getByResourceGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<StepResourceInner> getByResourceGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<StepResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<StepResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String stepName) {
        deleteWithServiceResponseAsync(resourceGroupName, stepName).toBlocking().single().body();
    }

    /**
     * Deletes the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String stepName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, stepName), serviceCallback);
    }

    /**
     * Deletes the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String stepName) {
        return deleteWithServiceResponseAsync(resourceGroupName, stepName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the step.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param stepName The name of the deployment step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String stepName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (stepName == null) {
            throw new IllegalArgumentException("Parameter stepName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, stepName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists the steps in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @return the PagedList<StepResourceInner> object if successful.
     */
    public PagedList<StepResourceInner> listByResourceGroup(String resourceGroupName) {
        PageImpl<StepResourceInner> page = new PageImpl<>();
        page.setItems(listByResourceGroupWithServiceResponseAsync(resourceGroupName).toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<StepResourceInner>(page) {
            @Override
            public Page<StepResourceInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Lists the steps in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<StepResourceInner>> listByResourceGroupAsync(String resourceGroupName, final ServiceCallback<List<StepResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByResourceGroupWithServiceResponseAsync(resourceGroupName), serviceCallback);
    }

    /**
     * Lists the steps in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @return the observable to the List&lt;StepResourceInner&gt; object
     */
    public Observable<Page<StepResourceInner>> listByResourceGroupAsync(String resourceGroupName) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName).map(new Func1<ServiceResponse<List<StepResourceInner>>, Page<StepResourceInner>>() {
            @Override
            public Page<StepResourceInner> call(ServiceResponse<List<StepResourceInner>> response) {
                PageImpl<StepResourceInner> page = new PageImpl<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Lists the steps in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @return the observable to the List&lt;StepResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<StepResourceInner>>> listByResourceGroupWithServiceResponseAsync(String resourceGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByResourceGroup(this.client.subscriptionId(), resourceGroupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<StepResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<StepResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<StepResourceInner>> result = listByResourceGroupDelegate(response);
                        List<StepResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<StepResourceInner>> clientResponse = new ServiceResponse<List<StepResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<StepResourceInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<StepResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<StepResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
