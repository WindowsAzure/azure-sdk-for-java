/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto upgrade profile for a managed cluster.
 */
public class ManagedClusterAutoUpgradeProfile {
    /**
     * upgrade channel for auto upgrade. Possible values include: 'rapid',
     * 'stable', 'patch', 'none'.
     */
    @JsonProperty(value = "upgradeChannel")
    private UpgradeChannel upgradeChannel;

    /**
     * Get upgrade channel for auto upgrade. Possible values include: 'rapid', 'stable', 'patch', 'none'.
     *
     * @return the upgradeChannel value
     */
    public UpgradeChannel upgradeChannel() {
        return this.upgradeChannel;
    }

    /**
     * Set upgrade channel for auto upgrade. Possible values include: 'rapid', 'stable', 'patch', 'none'.
     *
     * @param upgradeChannel the upgradeChannel value to set
     * @return the ManagedClusterAutoUpgradeProfile object itself.
     */
    public ManagedClusterAutoUpgradeProfile withUpgradeChannel(UpgradeChannel upgradeChannel) {
        this.upgradeChannel = upgradeChannel;
        return this;
    }

}
