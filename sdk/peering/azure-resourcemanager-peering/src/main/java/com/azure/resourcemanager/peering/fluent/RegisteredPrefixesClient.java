// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.peering.fluent.models.PeeringRegisteredPrefixInner;

/** An instance of this class provides access to all the operations defined in RegisteredPrefixesClient. */
public interface RegisteredPrefixesClient {
    /**
     * Gets an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing registered prefix with the specified name under the given subscription, resource group and
     *     peering.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PeeringRegisteredPrefixInner get(String resourceGroupName, String peeringName, String registeredPrefixName);

    /**
     * Gets an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing registered prefix with the specified name under the given subscription, resource group and
     *     peering.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PeeringRegisteredPrefixInner> getWithResponse(
        String resourceGroupName, String peeringName, String registeredPrefixName, Context context);

    /**
     * Creates a new registered prefix with the specified name under the given subscription, resource group and peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @param registeredPrefix The properties needed to create a registered prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's prefix that is registered by the peering service provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PeeringRegisteredPrefixInner createOrUpdate(
        String resourceGroupName,
        String peeringName,
        String registeredPrefixName,
        PeeringRegisteredPrefixInner registeredPrefix);

    /**
     * Creates a new registered prefix with the specified name under the given subscription, resource group and peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @param registeredPrefix The properties needed to create a registered prefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's prefix that is registered by the peering service provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PeeringRegisteredPrefixInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String peeringName,
        String registeredPrefixName,
        PeeringRegisteredPrefixInner registeredPrefix,
        Context context);

    /**
     * Deletes an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String peeringName, String registeredPrefixName);

    /**
     * Deletes an existing registered prefix with the specified name under the given subscription, resource group and
     * peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param registeredPrefixName The name of the registered prefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String peeringName, String registeredPrefixName, Context context);

    /**
     * Lists all registered prefixes under the given subscription, resource group and peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peering registered prefixes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PeeringRegisteredPrefixInner> listByPeering(String resourceGroupName, String peeringName);

    /**
     * Lists all registered prefixes under the given subscription, resource group and peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peering registered prefixes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PeeringRegisteredPrefixInner> listByPeering(
        String resourceGroupName, String peeringName, Context context);
}
