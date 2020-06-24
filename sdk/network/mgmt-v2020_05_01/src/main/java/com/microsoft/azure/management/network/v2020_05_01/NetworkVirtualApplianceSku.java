/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_05_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2020_05_01.implementation.NetworkVirtualApplianceSkuInner;

/**
 * Type representing NetworkVirtualApplianceSku.
 */
public interface NetworkVirtualApplianceSku extends HasInner<NetworkVirtualApplianceSkuInner>, Resource, GroupableResourceCore<NetworkManager, NetworkVirtualApplianceSkuInner>, HasResourceGroup, HasManager<NetworkManager> {
    /**
     * @return the availableScaleUnits value.
     */
    List<NetworkVirtualApplianceSkuInstances> availableScaleUnits();

    /**
     * @return the availableVersions value.
     */
    List<String> availableVersions();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the vendor value.
     */
    String vendor();

}
