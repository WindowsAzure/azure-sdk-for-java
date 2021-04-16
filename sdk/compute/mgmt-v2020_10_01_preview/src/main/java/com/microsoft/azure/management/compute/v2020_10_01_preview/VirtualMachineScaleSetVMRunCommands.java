/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.VirtualMachineScaleSetVMRunCommandsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualMachineScaleSetVMRunCommands.
 */
public interface VirtualMachineScaleSetVMRunCommands extends SupportsCreating<VirtualMachineScaleSetVirtualMachineRunCommand.DefinitionStages.Blank>, HasInner<VirtualMachineScaleSetVMRunCommandsInner> {
    /**
     * The operation to get the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetVirtualMachineRunCommand> getAsync(String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName);

    /**
     * The operation to get all run commands of an instance in Virtual Machine Scaleset.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetVirtualMachineRunCommand> listAsync(final String resourceGroupName, final String vmScaleSetName, final String instanceId);

    /**
     * The operation to delete the VMSS VM run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param runCommandName The name of the virtual machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName);

}
