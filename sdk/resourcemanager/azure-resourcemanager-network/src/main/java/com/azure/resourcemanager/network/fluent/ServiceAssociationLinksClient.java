// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.ServiceAssociationLinksListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServiceAssociationLinksClient. */
public interface ServiceAssociationLinksClient {
    /**
     * Gets a list of service association links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service association links for a subnet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ServiceAssociationLinksListResultInner>> listWithResponseAsync(
        String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Gets a list of service association links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service association links for a subnet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServiceAssociationLinksListResultInner> listAsync(
        String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Gets a list of service association links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service association links for a subnet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceAssociationLinksListResultInner list(String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Gets a list of service association links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service association links for a subnet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceAssociationLinksListResultInner> listWithResponse(
        String resourceGroupName, String virtualNetworkName, String subnetName, Context context);
}
