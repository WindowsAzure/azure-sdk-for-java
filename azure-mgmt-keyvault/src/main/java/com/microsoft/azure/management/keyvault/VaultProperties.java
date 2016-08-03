/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the vault.
 */
public class VaultProperties {
    /**
     * The URI of the vault for performing operations on keys and secrets.
     */
    private String vaultUri;

    /**
     * The Azure Active Directory tenant ID that should be used for
     * authenticating requests to the key vault.
     */
    @JsonProperty(required = true)
    private UUID tenantId;

    /**
     * SKU details.
     */
    @JsonProperty(required = true)
    private Sku sku;

    /**
     * An array of 0 to 16 identities that have access to the key vault. All
     * identities in the array must use the same tenant ID as the key vault's
     * tenant ID.
     */
    @JsonProperty(required = true)
    private List<AccessPolicyEntry> accessPolicies;

    /**
     * Property to specify whether Azure Virtual Machines are permitted to
     * retrieve certificates stored as secrets from the key vault.
     */
    private Boolean enabledForDeployment;

    /**
     * Property to specify whether Azure Disk Encryption is permitted to
     * retrieve secrets from the vault and unwrap keys.
     */
    private Boolean enabledForDiskEncryption;

    /**
     * Property to specify whether Azure Resource Manager is permitted to
     * retrieve secrets from the key vault.
     */
    private Boolean enabledForTemplateDeployment;

    /**
     * Get the vaultUri value.
     *
     * @return the vaultUri value
     */
    public String vaultUri() {
        return this.vaultUri;
    }

    /**
     * Set the vaultUri value.
     *
     * @param vaultUri the vaultUri value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withVaultUri(String vaultUri) {
        this.vaultUri = vaultUri;
        return this;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the accessPolicies value.
     *
     * @return the accessPolicies value
     */
    public List<AccessPolicyEntry> accessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Set the accessPolicies value.
     *
     * @param accessPolicies the accessPolicies value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withAccessPolicies(List<AccessPolicyEntry> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * Get the enabledForDeployment value.
     *
     * @return the enabledForDeployment value
     */
    public Boolean enabledForDeployment() {
        return this.enabledForDeployment;
    }

    /**
     * Set the enabledForDeployment value.
     *
     * @param enabledForDeployment the enabledForDeployment value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnabledForDeployment(Boolean enabledForDeployment) {
        this.enabledForDeployment = enabledForDeployment;
        return this;
    }

    /**
     * Get the enabledForDiskEncryption value.
     *
     * @return the enabledForDiskEncryption value
     */
    public Boolean enabledForDiskEncryption() {
        return this.enabledForDiskEncryption;
    }

    /**
     * Set the enabledForDiskEncryption value.
     *
     * @param enabledForDiskEncryption the enabledForDiskEncryption value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnabledForDiskEncryption(Boolean enabledForDiskEncryption) {
        this.enabledForDiskEncryption = enabledForDiskEncryption;
        return this;
    }

    /**
     * Get the enabledForTemplateDeployment value.
     *
     * @return the enabledForTemplateDeployment value
     */
    public Boolean enabledForTemplateDeployment() {
        return this.enabledForTemplateDeployment;
    }

    /**
     * Set the enabledForTemplateDeployment value.
     *
     * @param enabledForTemplateDeployment the enabledForTemplateDeployment value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnabledForTemplateDeployment(Boolean enabledForTemplateDeployment) {
        this.enabledForTemplateDeployment = enabledForTemplateDeployment;
        return this;
    }

}
