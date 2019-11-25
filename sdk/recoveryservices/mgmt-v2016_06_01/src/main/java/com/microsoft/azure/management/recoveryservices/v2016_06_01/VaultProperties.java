/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the vault.
 */
public class VaultProperties {
    /**
     * Provisioning State.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The upgradeDetails property.
     */
    @JsonProperty(value = "upgradeDetails")
    private UpgradeDetails upgradeDetails;

    /**
     * Get provisioning State.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the upgradeDetails value.
     *
     * @return the upgradeDetails value
     */
    public UpgradeDetails upgradeDetails() {
        return this.upgradeDetails;
    }

    /**
     * Set the upgradeDetails value.
     *
     * @param upgradeDetails the upgradeDetails value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withUpgradeDetails(UpgradeDetails upgradeDetails) {
        this.upgradeDetails = upgradeDetails;
        return this;
    }

}
