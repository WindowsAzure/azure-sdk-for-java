/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2020_07_01.implementation.ContainerServiceManager;
import com.microsoft.azure.management.containerservice.v2020_07_01.implementation.ManagedClusterUpgradeProfileInner;
import java.util.List;

/**
 * Type representing ManagedClusterUpgradeProfile.
 */
public interface ManagedClusterUpgradeProfile extends HasInner<ManagedClusterUpgradeProfileInner>, HasManager<ContainerServiceManager> {
    /**
     * @return the agentPoolProfiles value.
     */
    List<ManagedClusterPoolUpgradeProfile> agentPoolProfiles();

    /**
     * @return the controlPlaneProfile value.
     */
    ManagedClusterPoolUpgradeProfile controlPlaneProfile();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}
