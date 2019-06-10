/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

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
 * in ResourceNavigationLinks.
 */
public class ResourceNavigationLinksInner {
    /** The Retrofit service to perform REST calls. */
    private ResourceNavigationLinksService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ResourceNavigationLinksInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ResourceNavigationLinksInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(ResourceNavigationLinksService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ResourceNavigationLinks to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ResourceNavigationLinksService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_04_01.ResourceNavigationLinks list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}/ResourceNavigationLinks")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("virtualNetworkName") String virtualNetworkName, @Path("subnetName") String subnetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of resource navigation links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceNavigationLinksListResultInner object if successful.
     */
    public ResourceNavigationLinksListResultInner list(String resourceGroupName, String virtualNetworkName, String subnetName) {
        return listWithServiceResponseAsync(resourceGroupName, virtualNetworkName, subnetName).toBlocking().single().body();
    }

    /**
     * Gets a list of resource navigation links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceNavigationLinksListResultInner> listAsync(String resourceGroupName, String virtualNetworkName, String subnetName, final ServiceCallback<ResourceNavigationLinksListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, virtualNetworkName, subnetName), serviceCallback);
    }

    /**
     * Gets a list of resource navigation links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceNavigationLinksListResultInner object
     */
    public Observable<ResourceNavigationLinksListResultInner> listAsync(String resourceGroupName, String virtualNetworkName, String subnetName) {
        return listWithServiceResponseAsync(resourceGroupName, virtualNetworkName, subnetName).map(new Func1<ServiceResponse<ResourceNavigationLinksListResultInner>, ResourceNavigationLinksListResultInner>() {
            @Override
            public ResourceNavigationLinksListResultInner call(ServiceResponse<ResourceNavigationLinksListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of resource navigation links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceNavigationLinksListResultInner object
     */
    public Observable<ServiceResponse<ResourceNavigationLinksListResultInner>> listWithServiceResponseAsync(String resourceGroupName, String virtualNetworkName, String subnetName) {
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
        final String apiVersion = "2019-04-01";
        return service.list(resourceGroupName, virtualNetworkName, subnetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceNavigationLinksListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ResourceNavigationLinksListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceNavigationLinksListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceNavigationLinksListResultInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ResourceNavigationLinksListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ResourceNavigationLinksListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
