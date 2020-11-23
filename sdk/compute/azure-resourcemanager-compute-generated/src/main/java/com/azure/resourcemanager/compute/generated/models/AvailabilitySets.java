// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AvailabilitySets. */
public interface AvailabilitySets {
    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String availabilitySetName);

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String availabilitySetName, Context context);

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    AvailabilitySet getByResourceGroup(String resourceGroupName, String availabilitySetName);

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    Response<AvailabilitySet> getByResourceGroupWithResponse(
        String resourceGroupName, String availabilitySetName, Context context);

    /**
     * Lists all availability sets in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    PagedIterable<AvailabilitySet> list();

    /**
     * Lists all availability sets in a subscription.
     *
     * @param expand The expand expression to apply to the operation. Allowed values are 'instanceView'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    PagedIterable<AvailabilitySet> list(String expand, Context context);

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    PagedIterable<AvailabilitySet> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    PagedIterable<AvailabilitySet> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing
     * availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    PagedIterable<VirtualMachineSize> listAvailableSizes(String resourceGroupName, String availabilitySetName);

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing
     * availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    PagedIterable<VirtualMachineSize> listAvailableSizes(
        String resourceGroupName, String availabilitySetName, Context context);

    /**
     * Begins definition for a new AvailabilitySet resource.
     *
     * @param name resource name.
     * @return the first stage of the new AvailabilitySet definition.
     */
    AvailabilitySet.DefinitionStages.Blank define(String name);
}
