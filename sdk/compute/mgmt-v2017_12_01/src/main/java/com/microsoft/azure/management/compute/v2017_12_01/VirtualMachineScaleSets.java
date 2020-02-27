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
import com.microsoft.azure.arm.collection.SupportsListing;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.VirtualMachineScaleSetsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineScaleSetSku;

/**
 * Type representing VirtualMachineScaleSets.
 */
public interface VirtualMachineScaleSets extends SupportsCreating<VirtualMachineScaleSet.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<VirtualMachineScaleSet>, SupportsListingByResourceGroup<VirtualMachineScaleSet>, SupportsListing<VirtualMachineScaleSet>, HasInner<VirtualMachineScaleSetsInner> {
    /**
     * Deallocates specific virtual machines in a VM scale set. Shuts down the virtual machines and releases the compute resources. You are not billed for the compute resources that this virtual machine scale set deallocates.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> deallocateAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Deletes virtual machines in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceIds The virtual machine scale set instance ids.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> deleteInstancesAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds);

    /**
     * Gets the status of a VM scale set instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetInstanceView> getInstanceViewAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Gets list of OS upgrades on a VM scale set instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UpgradeOperationHistoricalStatusInfo> getOSUpgradeHistoryAsync(final String resourceGroupName, final String vmScaleSetName);

    /**
     * Power off (stop) one or more virtual machines in a VM scale set. Note that resources are still attached and you are getting charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> powerOffAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Restarts one or more virtual machines in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> restartAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Starts one or more virtual machines in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> startAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Shuts down all the virtual machines in the virtual machine scale set, moves them to a new node, and powers them back on.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> redeployAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Perform maintenance on one or more virtual machines in a VM scale set. Operation on instances which are not eligible for perform maintenance will be failed. Please refer to best practices for more details: https://docs.microsoft.com/en-us/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-maintenance-notifications.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> performMaintenanceAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Upgrades one or more virtual machines to the latest SKU set in the VM scale set model.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceIds The virtual machine scale set instance ids.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> updateInstancesAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds);

    /**
     * Reimages (upgrade the operating system) one or more virtual machines in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> reimageAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Reimages all the disks ( including data disks ) in the virtual machines in a VM scale set. This operation is only supported for managed disks.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationStatusResponse> reimageAllAsync(String resourceGroupName, String vmScaleSetName);

    /**
     * Manual platform update domain walk to update virtual machines in a service fabric virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param platformUpdateDomain The platform update domain for which a manual recovery walk is requested
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryWalkResponse> forceRecoveryServiceFabricPlatformUpdateDomainWalkAsync(String resourceGroupName, String vmScaleSetName, int platformUpdateDomain);

    /**
     * Gets a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed for each SKU.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetSku> listSkusAsync(final String resourceGroupName, final String vmScaleSetName);

}
