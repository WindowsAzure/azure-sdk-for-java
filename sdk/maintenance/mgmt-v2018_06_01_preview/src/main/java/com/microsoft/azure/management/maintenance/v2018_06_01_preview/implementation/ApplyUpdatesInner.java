/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation;

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
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ApplyUpdates.
 */
public class ApplyUpdatesInner {
    /** The Retrofit service to perform REST calls. */
    private ApplyUpdatesService service;
    /** The service client containing this operation class. */
    private MaintenanceManagementClientImpl client;

    /**
     * Initializes an instance of ApplyUpdatesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ApplyUpdatesInner(Retrofit retrofit, MaintenanceManagementClientImpl client) {
        this.service = retrofit.create(ApplyUpdatesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ApplyUpdates to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApplyUpdatesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.maintenance.v2018_06_01_preview.ApplyUpdates getParent" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{providerName}/{resourceParentType}/{resourceParentName}/{resourceType}/{resourceName}/providers/Microsoft.Maintenance/applyUpdates/{applyUpdateName}")
        Observable<Response<ResponseBody>> getParent(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceParentType") String resourceParentType, @Path("resourceParentName") String resourceParentName, @Path("providerName") String providerName, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("applyUpdateName") String applyUpdateName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.maintenance.v2018_06_01_preview.ApplyUpdates get" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{providerName}/{resourceType}/{resourceName}/providers/Microsoft.Maintenance/applyUpdates/{applyUpdateName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("providerName") String providerName, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("applyUpdateName") String applyUpdateName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.maintenance.v2018_06_01_preview.ApplyUpdates createOrUpdateParent" })
        @PUT("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{providerName}/{resourceParentType}/{resourceParentName}/{resourceType}/{resourceName}/providers/Microsoft.Maintenance/applyUpdates/default")
        Observable<Response<ResponseBody>> createOrUpdateParent(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("providerName") String providerName, @Path("resourceParentType") String resourceParentType, @Path("resourceParentName") String resourceParentName, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.maintenance.v2018_06_01_preview.ApplyUpdates createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{providerName}/{resourceType}/{resourceName}/providers/Microsoft.Maintenance/applyUpdates/default")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("providerName") String providerName, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Track Updates to resource with parent.
     * Track maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name
     * @param resourceParentType Resource parent type
     * @param resourceParentName Resource parent identifier
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @param applyUpdateName applyUpdate Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplyUpdateInner object if successful.
     */
    public ApplyUpdateInner getParent(String resourceGroupName, String resourceParentType, String resourceParentName, String providerName, String resourceType, String resourceName, String applyUpdateName) {
        return getParentWithServiceResponseAsync(resourceGroupName, resourceParentType, resourceParentName, providerName, resourceType, resourceName, applyUpdateName).toBlocking().single().body();
    }

    /**
     * Track Updates to resource with parent.
     * Track maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name
     * @param resourceParentType Resource parent type
     * @param resourceParentName Resource parent identifier
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @param applyUpdateName applyUpdate Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplyUpdateInner> getParentAsync(String resourceGroupName, String resourceParentType, String resourceParentName, String providerName, String resourceType, String resourceName, String applyUpdateName, final ServiceCallback<ApplyUpdateInner> serviceCallback) {
        return ServiceFuture.fromResponse(getParentWithServiceResponseAsync(resourceGroupName, resourceParentType, resourceParentName, providerName, resourceType, resourceName, applyUpdateName), serviceCallback);
    }

    /**
     * Track Updates to resource with parent.
     * Track maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name
     * @param resourceParentType Resource parent type
     * @param resourceParentName Resource parent identifier
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @param applyUpdateName applyUpdate Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplyUpdateInner object
     */
    public Observable<ApplyUpdateInner> getParentAsync(String resourceGroupName, String resourceParentType, String resourceParentName, String providerName, String resourceType, String resourceName, String applyUpdateName) {
        return getParentWithServiceResponseAsync(resourceGroupName, resourceParentType, resourceParentName, providerName, resourceType, resourceName, applyUpdateName).map(new Func1<ServiceResponse<ApplyUpdateInner>, ApplyUpdateInner>() {
            @Override
            public ApplyUpdateInner call(ServiceResponse<ApplyUpdateInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Track Updates to resource with parent.
     * Track maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name
     * @param resourceParentType Resource parent type
     * @param resourceParentName Resource parent identifier
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @param applyUpdateName applyUpdate Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplyUpdateInner object
     */
    public Observable<ServiceResponse<ApplyUpdateInner>> getParentWithServiceResponseAsync(String resourceGroupName, String resourceParentType, String resourceParentName, String providerName, String resourceType, String resourceName, String applyUpdateName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceParentType == null) {
            throw new IllegalArgumentException("Parameter resourceParentType is required and cannot be null.");
        }
        if (resourceParentName == null) {
            throw new IllegalArgumentException("Parameter resourceParentName is required and cannot be null.");
        }
        if (providerName == null) {
            throw new IllegalArgumentException("Parameter providerName is required and cannot be null.");
        }
        if (resourceType == null) {
            throw new IllegalArgumentException("Parameter resourceType is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (applyUpdateName == null) {
            throw new IllegalArgumentException("Parameter applyUpdateName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getParent(this.client.subscriptionId(), resourceGroupName, resourceParentType, resourceParentName, providerName, resourceType, resourceName, applyUpdateName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplyUpdateInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplyUpdateInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplyUpdateInner> clientResponse = getParentDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplyUpdateInner> getParentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplyUpdateInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplyUpdateInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Track Updates to resource.
     * Track maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @param applyUpdateName applyUpdate Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplyUpdateInner object if successful.
     */
    public ApplyUpdateInner get(String resourceGroupName, String providerName, String resourceType, String resourceName, String applyUpdateName) {
        return getWithServiceResponseAsync(resourceGroupName, providerName, resourceType, resourceName, applyUpdateName).toBlocking().single().body();
    }

    /**
     * Track Updates to resource.
     * Track maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @param applyUpdateName applyUpdate Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplyUpdateInner> getAsync(String resourceGroupName, String providerName, String resourceType, String resourceName, String applyUpdateName, final ServiceCallback<ApplyUpdateInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, providerName, resourceType, resourceName, applyUpdateName), serviceCallback);
    }

    /**
     * Track Updates to resource.
     * Track maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @param applyUpdateName applyUpdate Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplyUpdateInner object
     */
    public Observable<ApplyUpdateInner> getAsync(String resourceGroupName, String providerName, String resourceType, String resourceName, String applyUpdateName) {
        return getWithServiceResponseAsync(resourceGroupName, providerName, resourceType, resourceName, applyUpdateName).map(new Func1<ServiceResponse<ApplyUpdateInner>, ApplyUpdateInner>() {
            @Override
            public ApplyUpdateInner call(ServiceResponse<ApplyUpdateInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Track Updates to resource.
     * Track maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @param applyUpdateName applyUpdate Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplyUpdateInner object
     */
    public Observable<ServiceResponse<ApplyUpdateInner>> getWithServiceResponseAsync(String resourceGroupName, String providerName, String resourceType, String resourceName, String applyUpdateName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (providerName == null) {
            throw new IllegalArgumentException("Parameter providerName is required and cannot be null.");
        }
        if (resourceType == null) {
            throw new IllegalArgumentException("Parameter resourceType is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (applyUpdateName == null) {
            throw new IllegalArgumentException("Parameter applyUpdateName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, providerName, resourceType, resourceName, applyUpdateName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplyUpdateInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplyUpdateInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplyUpdateInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplyUpdateInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplyUpdateInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplyUpdateInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Apply Updates to resource with parent.
     * Apply maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceParentType Resource parent type
     * @param resourceParentName Resource parent identifier
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplyUpdateInner object if successful.
     */
    public ApplyUpdateInner createOrUpdateParent(String resourceGroupName, String providerName, String resourceParentType, String resourceParentName, String resourceType, String resourceName) {
        return createOrUpdateParentWithServiceResponseAsync(resourceGroupName, providerName, resourceParentType, resourceParentName, resourceType, resourceName).toBlocking().single().body();
    }

    /**
     * Apply Updates to resource with parent.
     * Apply maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceParentType Resource parent type
     * @param resourceParentName Resource parent identifier
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplyUpdateInner> createOrUpdateParentAsync(String resourceGroupName, String providerName, String resourceParentType, String resourceParentName, String resourceType, String resourceName, final ServiceCallback<ApplyUpdateInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateParentWithServiceResponseAsync(resourceGroupName, providerName, resourceParentType, resourceParentName, resourceType, resourceName), serviceCallback);
    }

    /**
     * Apply Updates to resource with parent.
     * Apply maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceParentType Resource parent type
     * @param resourceParentName Resource parent identifier
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplyUpdateInner object
     */
    public Observable<ApplyUpdateInner> createOrUpdateParentAsync(String resourceGroupName, String providerName, String resourceParentType, String resourceParentName, String resourceType, String resourceName) {
        return createOrUpdateParentWithServiceResponseAsync(resourceGroupName, providerName, resourceParentType, resourceParentName, resourceType, resourceName).map(new Func1<ServiceResponse<ApplyUpdateInner>, ApplyUpdateInner>() {
            @Override
            public ApplyUpdateInner call(ServiceResponse<ApplyUpdateInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Apply Updates to resource with parent.
     * Apply maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceParentType Resource parent type
     * @param resourceParentName Resource parent identifier
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplyUpdateInner object
     */
    public Observable<ServiceResponse<ApplyUpdateInner>> createOrUpdateParentWithServiceResponseAsync(String resourceGroupName, String providerName, String resourceParentType, String resourceParentName, String resourceType, String resourceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (providerName == null) {
            throw new IllegalArgumentException("Parameter providerName is required and cannot be null.");
        }
        if (resourceParentType == null) {
            throw new IllegalArgumentException("Parameter resourceParentType is required and cannot be null.");
        }
        if (resourceParentName == null) {
            throw new IllegalArgumentException("Parameter resourceParentName is required and cannot be null.");
        }
        if (resourceType == null) {
            throw new IllegalArgumentException("Parameter resourceType is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.createOrUpdateParent(this.client.subscriptionId(), resourceGroupName, providerName, resourceParentType, resourceParentName, resourceType, resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplyUpdateInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplyUpdateInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplyUpdateInner> clientResponse = createOrUpdateParentDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplyUpdateInner> createOrUpdateParentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplyUpdateInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplyUpdateInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Apply Updates to resource.
     * Apply maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplyUpdateInner object if successful.
     */
    public ApplyUpdateInner createOrUpdate(String resourceGroupName, String providerName, String resourceType, String resourceName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, providerName, resourceType, resourceName).toBlocking().single().body();
    }

    /**
     * Apply Updates to resource.
     * Apply maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplyUpdateInner> createOrUpdateAsync(String resourceGroupName, String providerName, String resourceType, String resourceName, final ServiceCallback<ApplyUpdateInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, providerName, resourceType, resourceName), serviceCallback);
    }

    /**
     * Apply Updates to resource.
     * Apply maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplyUpdateInner object
     */
    public Observable<ApplyUpdateInner> createOrUpdateAsync(String resourceGroupName, String providerName, String resourceType, String resourceName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, providerName, resourceType, resourceName).map(new Func1<ServiceResponse<ApplyUpdateInner>, ApplyUpdateInner>() {
            @Override
            public ApplyUpdateInner call(ServiceResponse<ApplyUpdateInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Apply Updates to resource.
     * Apply maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name
     * @param providerName Resource provider name
     * @param resourceType Resource type
     * @param resourceName Resource identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplyUpdateInner object
     */
    public Observable<ServiceResponse<ApplyUpdateInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String providerName, String resourceType, String resourceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (providerName == null) {
            throw new IllegalArgumentException("Parameter providerName is required and cannot be null.");
        }
        if (resourceType == null) {
            throw new IllegalArgumentException("Parameter resourceType is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, providerName, resourceType, resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplyUpdateInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplyUpdateInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplyUpdateInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplyUpdateInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplyUpdateInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplyUpdateInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
