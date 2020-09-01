/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

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
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;

/**
 * An instance of this class provides access to all the operations defined
 * in VpnServerConfigurationsAssociatedWithVirtualWans.
 */
public class VpnServerConfigurationsAssociatedWithVirtualWansInner {
    /** The Retrofit service to perform REST calls. */
    private VpnServerConfigurationsAssociatedWithVirtualWansService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnServerConfigurationsAssociatedWithVirtualWansInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VpnServerConfigurationsAssociatedWithVirtualWansInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(VpnServerConfigurationsAssociatedWithVirtualWansService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VpnServerConfigurationsAssociatedWithVirtualWans to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VpnServerConfigurationsAssociatedWithVirtualWansService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_06_01.VpnServerConfigurationsAssociatedWithVirtualWans list" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWANName}/vpnServerConfigurations")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("virtualWANName") String virtualWANName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_06_01.VpnServerConfigurationsAssociatedWithVirtualWans beginList" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWANName}/vpnServerConfigurations")
        Observable<Response<ResponseBody>> beginList(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("virtualWANName") String virtualWANName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpnServerConfigurationsResponseInner object if successful.
     */
    public VpnServerConfigurationsResponseInner list(String resourceGroupName, String virtualWANName) {
        return listWithServiceResponseAsync(resourceGroupName, virtualWANName).toBlocking().last().body();
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpnServerConfigurationsResponseInner> listAsync(String resourceGroupName, String virtualWANName, final ServiceCallback<VpnServerConfigurationsResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, virtualWANName), serviceCallback);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<VpnServerConfigurationsResponseInner> listAsync(String resourceGroupName, String virtualWANName) {
        return listWithServiceResponseAsync(resourceGroupName, virtualWANName).map(new Func1<ServiceResponse<VpnServerConfigurationsResponseInner>, VpnServerConfigurationsResponseInner>() {
            @Override
            public VpnServerConfigurationsResponseInner call(ServiceResponse<VpnServerConfigurationsResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<VpnServerConfigurationsResponseInner>> listWithServiceResponseAsync(String resourceGroupName, String virtualWANName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualWANName == null) {
            throw new IllegalArgumentException("Parameter virtualWANName is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01";
        Observable<Response<ResponseBody>> observable = service.list(this.client.subscriptionId(), resourceGroupName, virtualWANName, apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new LongRunningOperationOptions().withFinalStateVia(LongRunningFinalState.LOCATION), new TypeToken<VpnServerConfigurationsResponseInner>() { }.getType());
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpnServerConfigurationsResponseInner object if successful.
     */
    public VpnServerConfigurationsResponseInner beginList(String resourceGroupName, String virtualWANName) {
        return beginListWithServiceResponseAsync(resourceGroupName, virtualWANName).toBlocking().single().body();
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpnServerConfigurationsResponseInner> beginListAsync(String resourceGroupName, String virtualWANName, final ServiceCallback<VpnServerConfigurationsResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginListWithServiceResponseAsync(resourceGroupName, virtualWANName), serviceCallback);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpnServerConfigurationsResponseInner object
     */
    public Observable<VpnServerConfigurationsResponseInner> beginListAsync(String resourceGroupName, String virtualWANName) {
        return beginListWithServiceResponseAsync(resourceGroupName, virtualWANName).map(new Func1<ServiceResponse<VpnServerConfigurationsResponseInner>, VpnServerConfigurationsResponseInner>() {
            @Override
            public VpnServerConfigurationsResponseInner call(ServiceResponse<VpnServerConfigurationsResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpnServerConfigurationsResponseInner object
     */
    public Observable<ServiceResponse<VpnServerConfigurationsResponseInner>> beginListWithServiceResponseAsync(String resourceGroupName, String virtualWANName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualWANName == null) {
            throw new IllegalArgumentException("Parameter virtualWANName is required and cannot be null.");
        }
        final String apiVersion = "2020-06-01";
        return service.beginList(this.client.subscriptionId(), resourceGroupName, virtualWANName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpnServerConfigurationsResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<VpnServerConfigurationsResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpnServerConfigurationsResponseInner> clientResponse = beginListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VpnServerConfigurationsResponseInner> beginListDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VpnServerConfigurationsResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VpnServerConfigurationsResponseInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
