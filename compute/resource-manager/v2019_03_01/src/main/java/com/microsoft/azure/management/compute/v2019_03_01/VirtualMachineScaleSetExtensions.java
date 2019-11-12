/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.compute.v2019_03_01.implementation.VirtualMachineScaleSetExtensionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualMachineScaleSetExtensions.
 */
public interface VirtualMachineScaleSetExtensions extends SupportsCreating<VirtualMachineScaleSetExtension.DefinitionStages.Blank>, HasInner<VirtualMachineScaleSetExtensionsInner> {
    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set containing the extension.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetExtension> getAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName);

    /**
     * Gets a list of all extensions in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set containing the extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetExtension> listAsync(final String resourceGroupName, final String vmScaleSetName);

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be deleted.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName);

}
