/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

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
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ServiceAssociationLinks.
 */
public class ServiceAssociationLinksInner {
    /** The Retrofit service to perform REST calls. */
    private ServiceAssociationLinksService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ServiceAssociationLinksInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServiceAssociationLinksInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(ServiceAssociationLinksService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceAssociationLinks to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServiceAssociationLinksService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_04_01.ServiceAssociationLinks list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}/ServiceAssociationLinks")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("virtualNetworkName") String virtualNetworkName, @Path("subnetName") String subnetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of service association links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServiceAssociationLinksListResultInner object if successful.
     */
    public ServiceAssociationLinksListResultInner list(String resourceGroupName, String virtualNetworkName, String subnetName) {
        return listWithServiceResponseAsync(resourceGroupName, virtualNetworkName, subnetName).toBlocking().single().body();
    }

    /**
     * Gets a list of service association links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServiceAssociationLinksListResultInner> listAsync(String resourceGroupName, String virtualNetworkName, String subnetName, final ServiceCallback<ServiceAssociationLinksListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, virtualNetworkName, subnetName), serviceCallback);
    }

    /**
     * Gets a list of service association links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceAssociationLinksListResultInner object
     */
    public Observable<ServiceAssociationLinksListResultInner> listAsync(String resourceGroupName, String virtualNetworkName, String subnetName) {
        return listWithServiceResponseAsync(resourceGroupName, virtualNetworkName, subnetName).map(new Func1<ServiceResponse<ServiceAssociationLinksListResultInner>, ServiceAssociationLinksListResultInner>() {
            @Override
            public ServiceAssociationLinksListResultInner call(ServiceResponse<ServiceAssociationLinksListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of service association links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceAssociationLinksListResultInner object
     */
    public Observable<ServiceResponse<ServiceAssociationLinksListResultInner>> listWithServiceResponseAsync(String resourceGroupName, String virtualNetworkName, String subnetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (subnetName == null) {
            throw new IllegalArgumentException("Parameter subnetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-04-01";
        return service.list(resourceGroupName, virtualNetworkName, subnetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServiceAssociationLinksListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ServiceAssociationLinksListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServiceAssociationLinksListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServiceAssociationLinksListResultInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServiceAssociationLinksListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServiceAssociationLinksListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
