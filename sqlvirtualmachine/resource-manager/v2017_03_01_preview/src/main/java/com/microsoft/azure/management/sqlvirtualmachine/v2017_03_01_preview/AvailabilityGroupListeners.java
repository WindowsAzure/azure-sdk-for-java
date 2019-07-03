/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation.AvailabilityGroupListenersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AvailabilityGroupListeners.
 */
public interface AvailabilityGroupListeners extends SupportsCreating<AvailabilityGroupListener.DefinitionStages.Blank>, HasInner<AvailabilityGroupListenersInner> {
    /**
     * Gets an availability group listener.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailabilityGroupListener> getAsync(String resourceGroupName, String sqlVirtualMachineGroupName, String availabilityGroupListenerName);

    /**
     * Lists all availability group listeners in a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailabilityGroupListener> listByGroupAsync(final String resourceGroupName, final String sqlVirtualMachineGroupName);

    /**
     * Deletes an availability group listener.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String sqlVirtualMachineGroupName, String availabilityGroupListenerName);

}
