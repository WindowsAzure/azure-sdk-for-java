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
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
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
 * in VirtualMachineImages.
 */
public final class VirtualMachineImagesInner {
    /** The Retrofit service to perform REST calls. */
    private VirtualMachineImagesService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineImagesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineImagesInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(VirtualMachineImagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualMachineImages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineImagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineImages get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus/{skus}/versions/{version}")
        Observable<Response<ResponseBody>> get(@Path("location") String location, @Path("publisherName") String publisherName, @Path("offer") String offer, @Path("skus") String skus, @Path("version") String version, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineImages list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus/{skus}/versions")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("publisherName") String publisherName, @Path("offer") String offer, @Path("skus") String skus, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("$orderby") String orderby, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineImages listOffers" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers")
        Observable<Response<ResponseBody>> listOffers(@Path("location") String location, @Path("publisherName") String publisherName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineImages listPublishers" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers")
        Observable<Response<ResponseBody>> listPublishers(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.VirtualMachineImages listSkus" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus")
        Observable<Response<ResponseBody>> listSkus(@Path("location") String location, @Path("publisherName") String publisherName, @Path("offer") String offer, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a virtual machine image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @return the VirtualMachineImageInner object if successful.
     */
    public VirtualMachineImageInner get(String location, String publisherName, String offer, String skus, String version) {
        return getWithServiceResponseAsync(location, publisherName, offer, skus, version).toBlocking().single().body();
    }

    /**
     * Gets a virtual machine image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VirtualMachineImageInner> getAsync(String location, String publisherName, String offer, String skus, String version, final ServiceCallback<VirtualMachineImageInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(location, publisherName, offer, skus, version), serviceCallback);
    }

    /**
     * Gets a virtual machine image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @return the observable to the VirtualMachineImageInner object
     */
    public Observable<VirtualMachineImageInner> getAsync(String location, String publisherName, String offer, String skus, String version) {
        return getWithServiceResponseAsync(location, publisherName, offer, skus, version).map(new Func1<ServiceResponse<VirtualMachineImageInner>, VirtualMachineImageInner>() {
            @Override
            public VirtualMachineImageInner call(ServiceResponse<VirtualMachineImageInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a virtual machine image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @return the observable to the VirtualMachineImageInner object
     */
    public Observable<ServiceResponse<VirtualMachineImageInner>> getWithServiceResponseAsync(String location, String publisherName, String offer, String skus, String version) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (offer == null) {
            throw new IllegalArgumentException("Parameter offer is required and cannot be null.");
        }
        if (skus == null) {
            throw new IllegalArgumentException("Parameter skus is required and cannot be null.");
        }
        if (version == null) {
            throw new IllegalArgumentException("Parameter version is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.get(location, publisherName, offer, skus, version, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VirtualMachineImageInner>>>() {
                @Override
                public Observable<ServiceResponse<VirtualMachineImageInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VirtualMachineImageInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VirtualMachineImageInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VirtualMachineImageInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VirtualMachineImageInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @return the List&lt;VirtualMachineImageResourceInner&gt; object if successful.
     */
    public List<VirtualMachineImageResourceInner> list(String location, String publisherName, String offer, String skus) {
        return listWithServiceResponseAsync(location, publisherName, offer, skus).toBlocking().single().body();
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VirtualMachineImageResourceInner>> listAsync(String location, String publisherName, String offer, String skus, final ServiceCallback<List<VirtualMachineImageResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(location, publisherName, offer, skus), serviceCallback);
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @return the observable to the List&lt;VirtualMachineImageResourceInner&gt; object
     */
    public Observable<List<VirtualMachineImageResourceInner>> listAsync(String location, String publisherName, String offer, String skus) {
        return listWithServiceResponseAsync(location, publisherName, offer, skus).map(new Func1<ServiceResponse<List<VirtualMachineImageResourceInner>>, List<VirtualMachineImageResourceInner>>() {
            @Override
            public List<VirtualMachineImageResourceInner> call(ServiceResponse<List<VirtualMachineImageResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @return the observable to the List&lt;VirtualMachineImageResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>> listWithServiceResponseAsync(String location, String publisherName, String offer, String skus) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (offer == null) {
            throw new IllegalArgumentException("Parameter offer is required and cannot be null.");
        }
        if (skus == null) {
            throw new IllegalArgumentException("Parameter skus is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        final String filter = null;
        final Integer top = null;
        final String orderby = null;
        return service.list(location, publisherName, offer, skus, this.client.subscriptionId(), filter, top, orderby, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<VirtualMachineImageResourceInner>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @return the List&lt;VirtualMachineImageResourceInner&gt; object if successful.
     */
    public List<VirtualMachineImageResourceInner> list(String location, String publisherName, String offer, String skus, String filter, Integer top, String orderby) {
        return listWithServiceResponseAsync(location, publisherName, offer, skus, filter, top, orderby).toBlocking().single().body();
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VirtualMachineImageResourceInner>> listAsync(String location, String publisherName, String offer, String skus, String filter, Integer top, String orderby, final ServiceCallback<List<VirtualMachineImageResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(location, publisherName, offer, skus, filter, top, orderby), serviceCallback);
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @return the observable to the List&lt;VirtualMachineImageResourceInner&gt; object
     */
    public Observable<List<VirtualMachineImageResourceInner>> listAsync(String location, String publisherName, String offer, String skus, String filter, Integer top, String orderby) {
        return listWithServiceResponseAsync(location, publisherName, offer, skus, filter, top, orderby).map(new Func1<ServiceResponse<List<VirtualMachineImageResourceInner>>, List<VirtualMachineImageResourceInner>>() {
            @Override
            public List<VirtualMachineImageResourceInner> call(ServiceResponse<List<VirtualMachineImageResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @return the observable to the List&lt;VirtualMachineImageResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>> listWithServiceResponseAsync(String location, String publisherName, String offer, String skus, String filter, Integer top, String orderby) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (offer == null) {
            throw new IllegalArgumentException("Parameter offer is required and cannot be null.");
        }
        if (skus == null) {
            throw new IllegalArgumentException("Parameter skus is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.list(location, publisherName, offer, skus, this.client.subscriptionId(), filter, top, orderby, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<VirtualMachineImageResourceInner>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<VirtualMachineImageResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<VirtualMachineImageResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<VirtualMachineImageResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of virtual machine image offers for the specified location and publisher.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @return the List&lt;VirtualMachineImageResourceInner&gt; object if successful.
     */
    public List<VirtualMachineImageResourceInner> listOffers(String location, String publisherName) {
        return listOffersWithServiceResponseAsync(location, publisherName).toBlocking().single().body();
    }

    /**
     * Gets a list of virtual machine image offers for the specified location and publisher.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VirtualMachineImageResourceInner>> listOffersAsync(String location, String publisherName, final ServiceCallback<List<VirtualMachineImageResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listOffersWithServiceResponseAsync(location, publisherName), serviceCallback);
    }

    /**
     * Gets a list of virtual machine image offers for the specified location and publisher.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @return the observable to the List&lt;VirtualMachineImageResourceInner&gt; object
     */
    public Observable<List<VirtualMachineImageResourceInner>> listOffersAsync(String location, String publisherName) {
        return listOffersWithServiceResponseAsync(location, publisherName).map(new Func1<ServiceResponse<List<VirtualMachineImageResourceInner>>, List<VirtualMachineImageResourceInner>>() {
            @Override
            public List<VirtualMachineImageResourceInner> call(ServiceResponse<List<VirtualMachineImageResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of virtual machine image offers for the specified location and publisher.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @return the observable to the List&lt;VirtualMachineImageResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>> listOffersWithServiceResponseAsync(String location, String publisherName) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.listOffers(location, publisherName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<VirtualMachineImageResourceInner>> clientResponse = listOffersDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<VirtualMachineImageResourceInner>> listOffersDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<VirtualMachineImageResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<VirtualMachineImageResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location.
     *
     * @param location The name of a supported Azure region.
     * @return the List&lt;VirtualMachineImageResourceInner&gt; object if successful.
     */
    public List<VirtualMachineImageResourceInner> listPublishers(String location) {
        return listPublishersWithServiceResponseAsync(location).toBlocking().single().body();
    }

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location.
     *
     * @param location The name of a supported Azure region.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VirtualMachineImageResourceInner>> listPublishersAsync(String location, final ServiceCallback<List<VirtualMachineImageResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listPublishersWithServiceResponseAsync(location), serviceCallback);
    }

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location.
     *
     * @param location The name of a supported Azure region.
     * @return the observable to the List&lt;VirtualMachineImageResourceInner&gt; object
     */
    public Observable<List<VirtualMachineImageResourceInner>> listPublishersAsync(String location) {
        return listPublishersWithServiceResponseAsync(location).map(new Func1<ServiceResponse<List<VirtualMachineImageResourceInner>>, List<VirtualMachineImageResourceInner>>() {
            @Override
            public List<VirtualMachineImageResourceInner> call(ServiceResponse<List<VirtualMachineImageResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location.
     *
     * @param location The name of a supported Azure region.
     * @return the observable to the List&lt;VirtualMachineImageResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>> listPublishersWithServiceResponseAsync(String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.listPublishers(location, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<VirtualMachineImageResourceInner>> clientResponse = listPublishersDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<VirtualMachineImageResourceInner>> listPublishersDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<VirtualMachineImageResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<VirtualMachineImageResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @return the List&lt;VirtualMachineImageResourceInner&gt; object if successful.
     */
    public List<VirtualMachineImageResourceInner> listSkus(String location, String publisherName, String offer) {
        return listSkusWithServiceResponseAsync(location, publisherName, offer).toBlocking().single().body();
    }

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VirtualMachineImageResourceInner>> listSkusAsync(String location, String publisherName, String offer, final ServiceCallback<List<VirtualMachineImageResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listSkusWithServiceResponseAsync(location, publisherName, offer), serviceCallback);
    }

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @return the observable to the List&lt;VirtualMachineImageResourceInner&gt; object
     */
    public Observable<List<VirtualMachineImageResourceInner>> listSkusAsync(String location, String publisherName, String offer) {
        return listSkusWithServiceResponseAsync(location, publisherName, offer).map(new Func1<ServiceResponse<List<VirtualMachineImageResourceInner>>, List<VirtualMachineImageResourceInner>>() {
            @Override
            public List<VirtualMachineImageResourceInner> call(ServiceResponse<List<VirtualMachineImageResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @return the observable to the List&lt;VirtualMachineImageResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>> listSkusWithServiceResponseAsync(String location, String publisherName, String offer) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (publisherName == null) {
            throw new IllegalArgumentException("Parameter publisherName is required and cannot be null.");
        }
        if (offer == null) {
            throw new IllegalArgumentException("Parameter offer is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.listSkus(location, publisherName, offer, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<VirtualMachineImageResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<VirtualMachineImageResourceInner>> clientResponse = listSkusDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<VirtualMachineImageResourceInner>> listSkusDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<VirtualMachineImageResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<VirtualMachineImageResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
