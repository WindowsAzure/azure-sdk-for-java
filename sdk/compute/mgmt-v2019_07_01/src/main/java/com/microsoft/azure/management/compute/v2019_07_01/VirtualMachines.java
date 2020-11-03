/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import rx.Observable;
import com.microsoft.azure.management.compute.v2019_07_01.VirtualMachine;
import rx.Completable;
import com.microsoft.azure.management.compute.v2019_07_01.VirtualMachineVirtualMachineSize;

/**
 * Type representing VirtualMachines.
 */
public interface VirtualMachines {
    /**
     * Begins definition for a new VirtualMachine resource.
     * @param name resource name.
     * @return the first stage of the new VirtualMachine definition.
     */
    VirtualMachine.DefinitionStages.Blank defineVirtualMachine(String name);

    /**
     * Gets all the virtual machines under the specified subscription for the specified location.
     *
     * @param location The location for which virtual machines under the subscription are queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachine> listByLocationAsync(final String location);

    /**
     * Captures the VM by copying virtual hard disks of the VM and outputs a template that can be used to create similar VMs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Capture Virtual Machine operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineCaptureResult> captureAsync(String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters);

    /**
     * The operation to delete a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String vmName);

    /**
     * Retrieves information about the model view or the instance view of a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachine> getByResourceGroupAsync(String resourceGroupName, String vmName);

    /**
     * Retrieves information about the run-time state of a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineInstanceView> instanceViewAsync(String resourceGroupName, String vmName);

    /**
     * Converts virtual machine disks from blob-based to managed disks. Virtual machine must be stop-deallocated before invoking this operation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable convertToManagedDisksAsync(String resourceGroupName, String vmName);

    /**
     * Shuts down the virtual machine and releases the compute resources. You are not billed for the compute resources that this virtual machine uses.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deallocateAsync(String resourceGroupName, String vmName);

    /**
     * Sets the OS state of the virtual machine to generalized. It is recommended to sysprep the virtual machine before performing this operation. &lt;br&gt;For Windows, please refer to [Create a managed image of a generalized VM in Azure](https://docs.microsoft.com/en-us/azure/virtual-machines/windows/capture-image-resource).&lt;br&gt;For Linux, please refer to [How to create an image of a virtual machine or VHD](https://docs.microsoft.com/en-us/azure/virtual-machines/linux/capture-image).
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable generalizeAsync(String resourceGroupName, String vmName);

    /**
     * The operation to power off (stop) a virtual machine. The virtual machine can be restarted with the same provisioned resources. You are still charged for this virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable powerOffAsync(String resourceGroupName, String vmName);

    /**
     * The operation to reapply a virtual machine's state.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable reapplyAsync(String resourceGroupName, String vmName);

    /**
     * The operation to restart a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable restartAsync(String resourceGroupName, String vmName);

    /**
     * The operation to start a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String resourceGroupName, String vmName);

    /**
     * Shuts down the virtual machine, moves it to a new node, and powers it back on.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable redeployAsync(String resourceGroupName, String vmName);

    /**
     * Reimages the virtual machine which has an ephemeral OS disk back to its initial state.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable reimageAsync(String resourceGroupName, String vmName);

    /**
     * The operation to perform maintenance on a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable performMaintenanceAsync(String resourceGroupName, String vmName);

    /**
     * Run command on the VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Run command operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RunCommandResult> runCommandAsync(String resourceGroupName, String vmName, RunCommandInput parameters);

    /**
     * Lists all of the virtual machines in the specified resource group. Use the nextLink property in the response to get the next page of virtual machines.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachine> listByResourceGroupAsync(final String resourceGroupName);

    /**
     * Lists all of the virtual machines in the specified subscription. Use the nextLink property in the response to get the next page of virtual machines.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachine> listAsync();

    /**
     * Lists all available virtual machine sizes to which the specified virtual machine can be resized.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineVirtualMachineSize> listAvailableSizesAsync(String resourceGroupName, String vmName);

}
