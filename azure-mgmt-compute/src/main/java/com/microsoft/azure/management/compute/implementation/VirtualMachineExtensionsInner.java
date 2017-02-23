/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
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
 * in VirtualMachineExtensions.
 */
public class VirtualMachineExtensionsInner {
    /** The Retrofit service to perform REST calls. */
    private VirtualMachineExtensionsService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineExtensionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineExtensionsInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(VirtualMachineExtensionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualMachineExtensions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineExtensionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineExtensions createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("vmExtensionName") String vmExtensionName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineExtensionInner extensionParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineExtensions beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("vmExtensionName") String vmExtensionName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineExtensionInner extensionParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineExtensions delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("vmExtensionName") String vmExtensionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineExtensions beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("vmExtensionName") String vmExtensionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineExtensions get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("vmExtensionName") String vmExtensionName, @Path("subscriptionId") String subscriptionId, @Query("$expand") String expand, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @return the VirtualMachineExtensionInner object if successful.
     */
    public VirtualMachineExtensionInner createOrUpdate(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters).toBlocking().last().body();
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VirtualMachineExtensionInner> createOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters, final ServiceCallback<VirtualMachineExtensionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters), serviceCallback);
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @return the observable for the request
     */
    public Observable<VirtualMachineExtensionInner> createOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters).map(new Func1<ServiceResponse<VirtualMachineExtensionInner>, VirtualMachineExtensionInner>() {
            @Override
            public VirtualMachineExtensionInner call(ServiceResponse<VirtualMachineExtensionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @return the observable for the request
     */
    public Observable<ServiceResponse<VirtualMachineExtensionInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (extensionParameters == null) {
            throw new IllegalArgumentException("Parameter extensionParameters is required and cannot be null.");
        }
        Validator.validate(extensionParameters);
        final String apiVersion = "2016-04-30-preview";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, vmName, vmExtensionName, this.client.subscriptionId(), extensionParameters, apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<VirtualMachineExtensionInner>() { }.getType());
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @return the VirtualMachineExtensionInner object if successful.
     */
    public VirtualMachineExtensionInner beginCreateOrUpdate(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters).toBlocking().single().body();
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VirtualMachineExtensionInner> beginCreateOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters, final ServiceCallback<VirtualMachineExtensionInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters), serviceCallback);
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @return the observable to the VirtualMachineExtensionInner object
     */
    public Observable<VirtualMachineExtensionInner> beginCreateOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters).map(new Func1<ServiceResponse<VirtualMachineExtensionInner>, VirtualMachineExtensionInner>() {
            @Override
            public VirtualMachineExtensionInner call(ServiceResponse<VirtualMachineExtensionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @return the observable to the VirtualMachineExtensionInner object
     */
    public Observable<ServiceResponse<VirtualMachineExtensionInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (extensionParameters == null) {
            throw new IllegalArgumentException("Parameter extensionParameters is required and cannot be null.");
        }
        Validator.validate(extensionParameters);
        final String apiVersion = "2016-04-30-preview";
        return service.beginCreateOrUpdate(resourceGroupName, vmName, vmExtensionName, this.client.subscriptionId(), extensionParameters, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VirtualMachineExtensionInner>>>() {
                @Override
                public Observable<ServiceResponse<VirtualMachineExtensionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VirtualMachineExtensionInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VirtualMachineExtensionInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VirtualMachineExtensionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VirtualMachineExtensionInner>() { }.getType())
                .register(201, new TypeToken<VirtualMachineExtensionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @return the OperationStatusResponseInner object if successful.
     */
    public OperationStatusResponseInner delete(String resourceGroupName, String vmName, String vmExtensionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName).toBlocking().last().body();
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatusResponseInner> deleteAsync(String resourceGroupName, String vmName, String vmExtensionName, final ServiceCallback<OperationStatusResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName), serviceCallback);
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @return the observable for the request
     */
    public Observable<OperationStatusResponseInner> deleteAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName).map(new Func1<ServiceResponse<OperationStatusResponseInner>, OperationStatusResponseInner>() {
            @Override
            public OperationStatusResponseInner call(ServiceResponse<OperationStatusResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @return the observable for the request
     */
    public Observable<ServiceResponse<OperationStatusResponseInner>> deleteWithServiceResponseAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        Observable<Response<ResponseBody>> observable = service.delete(resourceGroupName, vmName, vmExtensionName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<OperationStatusResponseInner>() { }.getType());
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @return the OperationStatusResponseInner object if successful.
     */
    public OperationStatusResponseInner beginDelete(String resourceGroupName, String vmName, String vmExtensionName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName).toBlocking().single().body();
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatusResponseInner> beginDeleteAsync(String resourceGroupName, String vmName, String vmExtensionName, final ServiceCallback<OperationStatusResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName), serviceCallback);
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @return the observable to the OperationStatusResponseInner object
     */
    public Observable<OperationStatusResponseInner> beginDeleteAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName).map(new Func1<ServiceResponse<OperationStatusResponseInner>, OperationStatusResponseInner>() {
            @Override
            public OperationStatusResponseInner call(ServiceResponse<OperationStatusResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @return the observable to the OperationStatusResponseInner object
     */
    public Observable<ServiceResponse<OperationStatusResponseInner>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.beginDelete(resourceGroupName, vmName, vmExtensionName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatusResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatusResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatusResponseInner> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatusResponseInner> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatusResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatusResponseInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @return the VirtualMachineExtensionInner object if successful.
     */
    public VirtualMachineExtensionInner get(String resourceGroupName, String vmName, String vmExtensionName) {
        return getWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName).toBlocking().single().body();
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VirtualMachineExtensionInner> getAsync(String resourceGroupName, String vmName, String vmExtensionName, final ServiceCallback<VirtualMachineExtensionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName), serviceCallback);
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @return the observable to the VirtualMachineExtensionInner object
     */
    public Observable<VirtualMachineExtensionInner> getAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        return getWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName).map(new Func1<ServiceResponse<VirtualMachineExtensionInner>, VirtualMachineExtensionInner>() {
            @Override
            public VirtualMachineExtensionInner call(ServiceResponse<VirtualMachineExtensionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @return the observable to the VirtualMachineExtensionInner object
     */
    public Observable<ServiceResponse<VirtualMachineExtensionInner>> getWithServiceResponseAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        final String expand = null;
        return service.get(resourceGroupName, vmName, vmExtensionName, this.client.subscriptionId(), expand, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VirtualMachineExtensionInner>>>() {
                @Override
                public Observable<ServiceResponse<VirtualMachineExtensionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VirtualMachineExtensionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @return the VirtualMachineExtensionInner object if successful.
     */
    public VirtualMachineExtensionInner get(String resourceGroupName, String vmName, String vmExtensionName, String expand) {
        return getWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName, expand).toBlocking().single().body();
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VirtualMachineExtensionInner> getAsync(String resourceGroupName, String vmName, String vmExtensionName, String expand, final ServiceCallback<VirtualMachineExtensionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName, expand), serviceCallback);
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @return the observable to the VirtualMachineExtensionInner object
     */
    public Observable<VirtualMachineExtensionInner> getAsync(String resourceGroupName, String vmName, String vmExtensionName, String expand) {
        return getWithServiceResponseAsync(resourceGroupName, vmName, vmExtensionName, expand).map(new Func1<ServiceResponse<VirtualMachineExtensionInner>, VirtualMachineExtensionInner>() {
            @Override
            public VirtualMachineExtensionInner call(ServiceResponse<VirtualMachineExtensionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @return the observable to the VirtualMachineExtensionInner object
     */
    public Observable<ServiceResponse<VirtualMachineExtensionInner>> getWithServiceResponseAsync(String resourceGroupName, String vmName, String vmExtensionName, String expand) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.get(resourceGroupName, vmName, vmExtensionName, this.client.subscriptionId(), expand, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VirtualMachineExtensionInner>>>() {
                @Override
                public Observable<ServiceResponse<VirtualMachineExtensionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VirtualMachineExtensionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VirtualMachineExtensionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VirtualMachineExtensionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VirtualMachineExtensionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
