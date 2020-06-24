/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
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
 * in VirtualMachineSizes.
 */
public class VirtualMachineSizesInner {
    /** The Retrofit service to perform REST calls. */
    private VirtualMachineSizesService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineSizesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineSizesInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(VirtualMachineSizesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualMachineSizes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineSizesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineSizes list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/vmSizes")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all available virtual machine sizes for a subscription in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;VirtualMachineSizeInner&gt; object if successful.
     */
    public List<VirtualMachineSizeInner> list(String location) {
        return listWithServiceResponseAsync(location).toBlocking().single().body();
    }

    /**
     * Lists all available virtual machine sizes for a subscription in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VirtualMachineSizeInner>> listAsync(String location, final ServiceCallback<List<VirtualMachineSizeInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(location), serviceCallback);
    }

    /**
     * Lists all available virtual machine sizes for a subscription in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;VirtualMachineSizeInner&gt; object
     */
    public Observable<List<VirtualMachineSizeInner>> listAsync(String location) {
        return listWithServiceResponseAsync(location).map(new Func1<ServiceResponse<List<VirtualMachineSizeInner>>, List<VirtualMachineSizeInner>>() {
            @Override
            public List<VirtualMachineSizeInner> call(ServiceResponse<List<VirtualMachineSizeInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all available virtual machine sizes for a subscription in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;VirtualMachineSizeInner&gt; object
     */
    public Observable<ServiceResponse<List<VirtualMachineSizeInner>>> listWithServiceResponseAsync(String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(location, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<VirtualMachineSizeInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<VirtualMachineSizeInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<VirtualMachineSizeInner>> result = listDelegate(response);
                        List<VirtualMachineSizeInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<VirtualMachineSizeInner>> clientResponse = new ServiceResponse<List<VirtualMachineSizeInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<VirtualMachineSizeInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<VirtualMachineSizeInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<VirtualMachineSizeInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
