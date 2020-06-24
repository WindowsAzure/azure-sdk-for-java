/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.AvailabilitySetsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2017_12_01.AvailabilitySetVirtualMachineSize;

/**
 * Type representing AvailabilitySets.
 */
public interface AvailabilitySets extends SupportsCreating<AvailabilitySet.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<AvailabilitySet>, SupportsListingByResourceGroup<AvailabilitySet>, HasInner<AvailabilitySetsInner> {
    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailabilitySetVirtualMachineSize> listAvailableSizesAsync(String resourceGroupName, String availabilitySetName);

}
