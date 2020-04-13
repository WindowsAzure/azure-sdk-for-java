/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_03_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.implementation.ExpressRoutePortsLocationInner;

/**
 * Type representing ExpressRoutePortsLocation.
 */
public interface ExpressRoutePortsLocation extends HasInner<ExpressRoutePortsLocationInner>, Resource, GroupableResourceCore<NetworkManager, ExpressRoutePortsLocationInner>, HasResourceGroup, HasManager<NetworkManager> {
    /**
     * @return the address value.
     */
    String address();

    /**
     * @return the availableBandwidths value.
     */
    List<ExpressRoutePortsLocationBandwidths> availableBandwidths();

    /**
     * @return the contact value.
     */
    String contact();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

}
