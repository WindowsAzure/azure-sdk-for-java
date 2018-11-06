/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_07_01.implementation.VirtualNetworkUsageInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_07_01.implementation.NetworkManager;

/**
 * Type representing VirtualNetworkUsage.
 */
public interface VirtualNetworkUsage extends HasInner<VirtualNetworkUsageInner>, HasManager<NetworkManager> {
    /**
     * @return the currentValue value.
     */
    Double currentValue();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the limit value.
     */
    Double limit();

    /**
     * @return the name value.
     */
    VirtualNetworkUsageName name();

    /**
     * @return the unit value.
     */
    String unit();

}
