/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_06_01.implementation.VirtualApplianceSitesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualApplianceSites.
 */
public interface VirtualApplianceSites extends SupportsCreating<VirtualApplianceSite.DefinitionStages.Blank>, HasInner<VirtualApplianceSitesInner> {
    /**
     * Gets the specified Virtual Appliance Site.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualApplianceSite> getAsync(String resourceGroupName, String networkVirtualApplianceName, String siteName);

    /**
     * Lists all Network Virtual Appliance Sites in a Network Virtual Appliance resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualApplianceSite> listAsync(final String resourceGroupName, final String networkVirtualApplianceName);

    /**
     * Deletes the specified site from a Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String networkVirtualApplianceName, String siteName);

}
