/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.implementation.RolesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Roles.
 */
public interface Roles extends SupportsCreating<Role.DefinitionStages.Blank>, HasInner<RolesInner> {
    /**
     * Gets a specific role by name.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Role> getAsync(String deviceName, String name, String resourceGroupName);

    /**
     * Lists all the roles configured in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Role> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName);

    /**
     * Deletes the role on the device.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String deviceName, String name, String resourceGroupName);

}
