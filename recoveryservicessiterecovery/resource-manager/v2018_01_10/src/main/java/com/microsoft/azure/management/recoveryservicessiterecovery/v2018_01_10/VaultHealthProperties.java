/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * class to define the health summary of the Vault.
 */
public class VaultHealthProperties {
    /**
     * The list of errors on the vault.
     */
    @JsonProperty(value = "vaultErrors")
    private List<HealthError> vaultErrors;

    /**
     * The list of the health detail of the protected items in the vault.
     */
    @JsonProperty(value = "protectedItemsHealth")
    private ResourceHealthSummary protectedItemsHealth;

    /**
     * The list of the health detail of the fabrics in the vault.
     */
    @JsonProperty(value = "fabricsHealth")
    private ResourceHealthSummary fabricsHealth;

    /**
     * Get the list of errors on the vault.
     *
     * @return the vaultErrors value
     */
    public List<HealthError> vaultErrors() {
        return this.vaultErrors;
    }

    /**
     * Set the list of errors on the vault.
     *
     * @param vaultErrors the vaultErrors value to set
     * @return the VaultHealthProperties object itself.
     */
    public VaultHealthProperties withVaultErrors(List<HealthError> vaultErrors) {
        this.vaultErrors = vaultErrors;
        return this;
    }

    /**
     * Get the list of the health detail of the protected items in the vault.
     *
     * @return the protectedItemsHealth value
     */
    public ResourceHealthSummary protectedItemsHealth() {
        return this.protectedItemsHealth;
    }

    /**
     * Set the list of the health detail of the protected items in the vault.
     *
     * @param protectedItemsHealth the protectedItemsHealth value to set
     * @return the VaultHealthProperties object itself.
     */
    public VaultHealthProperties withProtectedItemsHealth(ResourceHealthSummary protectedItemsHealth) {
        this.protectedItemsHealth = protectedItemsHealth;
        return this;
    }

    /**
     * Get the list of the health detail of the fabrics in the vault.
     *
     * @return the fabricsHealth value
     */
    public ResourceHealthSummary fabricsHealth() {
        return this.fabricsHealth;
    }

    /**
     * Set the list of the health detail of the fabrics in the vault.
     *
     * @param fabricsHealth the fabricsHealth value to set
     * @return the VaultHealthProperties object itself.
     */
    public VaultHealthProperties withFabricsHealth(ResourceHealthSummary fabricsHealth) {
        this.fabricsHealth = fabricsHealth;
        return this;
    }

}
