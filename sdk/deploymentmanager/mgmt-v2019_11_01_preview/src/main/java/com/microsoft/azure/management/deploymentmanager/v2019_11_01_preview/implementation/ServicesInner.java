/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
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
 * in Services.
 */
public class ServicesInner {
    /** The Retrofit service to perform REST calls. */
    private ServicesService service;
    /** The service client containing this operation class. */
    private AzureDeploymentManagerImpl client;

    /**
     * Initializes an instance of ServicesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServicesInner(Retrofit retrofit, AzureDeploymentManagerImpl client) {
        this.service = retrofit.create(ServicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Services to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Services createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/serviceTopologies/{serviceTopologyName}/services/{serviceName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serviceTopologyName") String serviceTopologyName, @Path("serviceName") String serviceName, @Query("api-version") String apiVersion, @Body ServiceResourceInner serviceInfo, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Services get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/serviceTopologies/{serviceTopologyName}/services/{serviceName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serviceTopologyName") String serviceTopologyName, @Path("serviceName") String serviceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Services delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/serviceTopologies/{serviceTopologyName}/services/{serviceName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serviceTopologyName") String serviceTopologyName, @Path("serviceName") String serviceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Services list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DeploymentManager/serviceTopologies/{serviceTopologyName}/services")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serviceTopologyName") String serviceTopologyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates or updates a service in the service topology.
     * Synchronously creates a new service or updates an existing service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceInfo The service object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServiceResourceInner object if successful.
     */
    public ServiceResourceInner createOrUpdate(String resourceGroupName, String serviceTopologyName, String serviceName, ServiceResourceInner serviceInfo) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceTopologyName, serviceName, serviceInfo).toBlocking().single().body();
    }

    /**
     * Creates or updates a service in the service topology.
     * Synchronously creates a new service or updates an existing service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceInfo The service object
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServiceResourceInner> createOrUpdateAsync(String resourceGroupName, String serviceTopologyName, String serviceName, ServiceResourceInner serviceInfo, final ServiceCallback<ServiceResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceTopologyName, serviceName, serviceInfo), serviceCallback);
    }

    /**
     * Creates or updates a service in the service topology.
     * Synchronously creates a new service or updates an existing service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceInfo The service object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceResourceInner object
     */
    public Observable<ServiceResourceInner> createOrUpdateAsync(String resourceGroupName, String serviceTopologyName, String serviceName, ServiceResourceInner serviceInfo) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceTopologyName, serviceName, serviceInfo).map(new Func1<ServiceResponse<ServiceResourceInner>, ServiceResourceInner>() {
            @Override
            public ServiceResourceInner call(ServiceResponse<ServiceResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a service in the service topology.
     * Synchronously creates a new service or updates an existing service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceInfo The service object
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceResourceInner object
     */
    public Observable<ServiceResponse<ServiceResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serviceTopologyName, String serviceName, ServiceResourceInner serviceInfo) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceTopologyName == null) {
            throw new IllegalArgumentException("Parameter serviceTopologyName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (serviceInfo == null) {
            throw new IllegalArgumentException("Parameter serviceInfo is required and cannot be null.");
        }
        Validator.validate(serviceInfo);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, serviceTopologyName, serviceName, this.client.apiVersion(), serviceInfo, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServiceResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ServiceResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServiceResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServiceResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServiceResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<ServiceResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServiceResourceInner object if successful.
     */
    public ServiceResourceInner get(String resourceGroupName, String serviceTopologyName, String serviceName) {
        return getWithServiceResponseAsync(resourceGroupName, serviceTopologyName, serviceName).toBlocking().single().body();
    }

    /**
     * Gets the service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServiceResourceInner> getAsync(String resourceGroupName, String serviceTopologyName, String serviceName, final ServiceCallback<ServiceResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serviceTopologyName, serviceName), serviceCallback);
    }

    /**
     * Gets the service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceResourceInner object
     */
    public Observable<ServiceResourceInner> getAsync(String resourceGroupName, String serviceTopologyName, String serviceName) {
        return getWithServiceResponseAsync(resourceGroupName, serviceTopologyName, serviceName).map(new Func1<ServiceResponse<ServiceResourceInner>, ServiceResourceInner>() {
            @Override
            public ServiceResourceInner call(ServiceResponse<ServiceResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceResourceInner object
     */
    public Observable<ServiceResponse<ServiceResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String serviceTopologyName, String serviceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceTopologyName == null) {
            throw new IllegalArgumentException("Parameter serviceTopologyName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, serviceTopologyName, serviceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServiceResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ServiceResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServiceResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServiceResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServiceResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServiceResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes the service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String serviceTopologyName, String serviceName) {
        deleteWithServiceResponseAsync(resourceGroupName, serviceTopologyName, serviceName).toBlocking().single().body();
    }

    /**
     * Deletes the service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String serviceTopologyName, String serviceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, serviceTopologyName, serviceName), serviceCallback);
    }

    /**
     * Deletes the service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String serviceTopologyName, String serviceName) {
        return deleteWithServiceResponseAsync(resourceGroupName, serviceTopologyName, serviceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String serviceTopologyName, String serviceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceTopologyName == null) {
            throw new IllegalArgumentException("Parameter serviceTopologyName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, serviceTopologyName, serviceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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
     * Lists the services in the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ServiceResourceInner&gt; object if successful.
     */
    public List<ServiceResourceInner> list(String resourceGroupName, String serviceTopologyName) {
        return listWithServiceResponseAsync(resourceGroupName, serviceTopologyName).toBlocking().single().body();
    }

    /**
     * Lists the services in the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServiceResourceInner>> listAsync(String resourceGroupName, String serviceTopologyName, final ServiceCallback<List<ServiceResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, serviceTopologyName), serviceCallback);
    }

    /**
     * Lists the services in the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServiceResourceInner&gt; object
     */
    public Observable<List<ServiceResourceInner>> listAsync(String resourceGroupName, String serviceTopologyName) {
        return listWithServiceResponseAsync(resourceGroupName, serviceTopologyName).map(new Func1<ServiceResponse<List<ServiceResourceInner>>, List<ServiceResourceInner>>() {
            @Override
            public List<ServiceResourceInner> call(ServiceResponse<List<ServiceResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the services in the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServiceResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<ServiceResourceInner>>> listWithServiceResponseAsync(String resourceGroupName, String serviceTopologyName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceTopologyName == null) {
            throw new IllegalArgumentException("Parameter serviceTopologyName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, serviceTopologyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ServiceResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ServiceResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<ServiceResourceInner>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<ServiceResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<ServiceResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<ServiceResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
