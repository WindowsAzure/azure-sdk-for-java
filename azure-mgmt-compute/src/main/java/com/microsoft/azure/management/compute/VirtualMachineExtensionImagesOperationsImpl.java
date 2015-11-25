/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.compute.models.VirtualMachineExtensionImage;
import com.microsoft.azure.management.compute.models.VirtualMachineImageResource;
import com.microsoft.rest.AzureServiceResponseBuilder;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.serializer.JacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.util.List;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class VirtualMachineExtensionImagesOperationsImpl implements VirtualMachineExtensionImagesOperations {
    private VirtualMachineExtensionImagesService service;
    ComputeManagementClient client;

    public VirtualMachineExtensionImagesOperationsImpl(Retrofit retrofit, ComputeManagementClient client) {
        this.service = retrofit.create(VirtualMachineExtensionImagesService.class);
        this.client = client;
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineExtensionImage object if successful.
     */
    public ServiceResponse<VirtualMachineExtensionImage> get(String location, String publisherName, String type, String version) throws ServiceException, IOException, IllegalArgumentException {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        if (version == null) {
            throw new IllegalArgumentException("Parameter version is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(location, publisherName, type, version, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute(), null);
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getAsync(String location, String publisherName, String type, String version, final ServiceCallback<VirtualMachineExtensionImage> serviceCallback) {
        if (location == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter location is required and cannot be null."));
            return null;
        }
        if (publisherName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
            return null;
        }
        if (type == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter type is required and cannot be null."));
            return null;
        }
        if (version == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter version is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.get(location, publisherName, type, version, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<VirtualMachineExtensionImage>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<VirtualMachineExtensionImage> getDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<VirtualMachineExtensionImage>(new AzureJacksonUtils())
                .register(200, new TypeToken<VirtualMachineExtensionImage>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location the String value
     * @param publisherName the String value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object if successful.
     */
    public ServiceResponse<List<VirtualMachineImageResource>> listTypes(String location, String publisherName) throws ServiceException, IOException, IllegalArgumentException {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listTypes(location, publisherName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listTypesDelegate(call.execute(), null);
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listTypesAsync(String location, String publisherName, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) {
        if (location == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter location is required and cannot be null."));
            return null;
        }
        if (publisherName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listTypes(location, publisherName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<List<VirtualMachineImageResource>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listTypesDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<List<VirtualMachineImageResource>> listTypesDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<List<VirtualMachineImageResource>>(new AzureJacksonUtils())
                .register(200, new TypeToken<List<VirtualMachineImageResource>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderBy the String value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object if successful.
     */
    public ServiceResponse<List<VirtualMachineImageResource>> listVersions(String location, String publisherName, String type, VirtualMachineImageResource filter, Integer top, String orderBy) throws ServiceException, IOException, IllegalArgumentException {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listVersions(location, publisherName, type, this.client.getSubscriptionId(), JacksonUtils.serializeRaw(filter), top, orderBy, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listVersionsDelegate(call.execute(), null);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderBy the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> listVersionsAsync(String location, String publisherName, String type, VirtualMachineImageResource filter, Integer top, String orderBy, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) {
        if (location == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter location is required and cannot be null."));
            return null;
        }
        if (publisherName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
            return null;
        }
        if (type == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter type is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listVersions(location, publisherName, type, this.client.getSubscriptionId(), JacksonUtils.serializeRaw(filter), top, orderBy, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<List<VirtualMachineImageResource>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listVersionsDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<List<VirtualMachineImageResource>> listVersionsDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<List<VirtualMachineImageResource>>(new AzureJacksonUtils())
                .register(200, new TypeToken<List<VirtualMachineImageResource>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

}
