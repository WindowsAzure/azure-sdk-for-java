/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2015_06_01;

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
    @JsonProperty(value = "vaultUri")
    private String vaultUri;

    /**
     * The Azure Active Directory tenant ID that should be used for
     * authenticating requests to the key vault.
     */
    @JsonProperty(value = "tenantId", required = true)
    private UUID tenantId;

    /**
     * SKU details.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /**
     * An array of 0 to 16 identities that have access to the key vault. All
     * identities in the array must use the same tenant ID as the key vault's
     * tenant ID.
     */
    @JsonProperty(value = "accessPolicies", required = true)
    private List<AccessPolicyEntry> accessPolicies;

    /**
     * Property to specify whether Azure Virtual Machines are permitted to
     * retrieve certificates stored as secrets from the key vault.
     */
    @JsonProperty(value = "enabledForDeployment")
    private Boolean enabledForDeployment;

    /**
     * Property to specify whether Azure Disk Encryption is permitted to
     * retrieve secrets from the vault and unwrap keys.
     */
    @JsonProperty(value = "enabledForDiskEncryption")
    private Boolean enabledForDiskEncryption;

    /**
     * Property to specify whether Azure Resource Manager is permitted to
     * retrieve secrets from the key vault.
     */
    @JsonProperty(value = "enabledForTemplateDeployment")
    private Boolean enabledForTemplateDeployment;

    /**
     * Property to specify whether the 'soft delete' functionality is enabled
     * for this key vault.
     */
    @JsonProperty(value = "enableSoftDelete")
    private Boolean enableSoftDelete;

    /**
     * Get the URI of the vault for performing operations on keys and secrets.
     *
     * @return the vaultUri value
     */
    public String vaultUri() {
        return this.vaultUri;
    }

    /**
     * Set the URI of the vault for performing operations on keys and secrets.
     *
     * @param vaultUri the vaultUri value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withVaultUri(String vaultUri) {
        this.vaultUri = vaultUri;
        return this;
    }

    /**
     * Get the Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     *
     * @param tenantId the tenantId value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get sKU details.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set sKU details.
     *
     * @param sku the sku value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get an array of 0 to 16 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault's tenant ID.
     *
     * @return the accessPolicies value
     */
    public List<AccessPolicyEntry> accessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Set an array of 0 to 16 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault's tenant ID.
     *
     * @param accessPolicies the accessPolicies value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withAccessPolicies(List<AccessPolicyEntry> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * Get property to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault.
     *
     * @return the enabledForDeployment value
     */
    public Boolean enabledForDeployment() {
        return this.enabledForDeployment;
    }

    /**
     * Set property to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault.
     *
     * @param enabledForDeployment the enabledForDeployment value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnabledForDeployment(Boolean enabledForDeployment) {
        this.enabledForDeployment = enabledForDeployment;
        return this;
    }

    /**
     * Get property to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys.
     *
     * @return the enabledForDiskEncryption value
     */
    public Boolean enabledForDiskEncryption() {
        return this.enabledForDiskEncryption;
    }

    /**
     * Set property to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys.
     *
     * @param enabledForDiskEncryption the enabledForDiskEncryption value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnabledForDiskEncryption(Boolean enabledForDiskEncryption) {
        this.enabledForDiskEncryption = enabledForDiskEncryption;
        return this;
    }

    /**
     * Get property to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault.
     *
     * @return the enabledForTemplateDeployment value
     */
    public Boolean enabledForTemplateDeployment() {
        return this.enabledForTemplateDeployment;
    }

    /**
     * Set property to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault.
     *
     * @param enabledForTemplateDeployment the enabledForTemplateDeployment value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnabledForTemplateDeployment(Boolean enabledForTemplateDeployment) {
        this.enabledForTemplateDeployment = enabledForTemplateDeployment;
        return this;
    }

    /**
     * Get property to specify whether the 'soft delete' functionality is enabled for this key vault.
     *
     * @return the enableSoftDelete value
     */
    public Boolean enableSoftDelete() {
        return this.enableSoftDelete;
    }

    /**
     * Set property to specify whether the 'soft delete' functionality is enabled for this key vault.
     *
     * @param enableSoftDelete the enableSoftDelete value to set
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEnableSoftDelete(Boolean enableSoftDelete) {
        this.enableSoftDelete = enableSoftDelete;
        return this;
    }

}
