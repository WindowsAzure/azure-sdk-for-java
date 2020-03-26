// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/**
 * The VaultProperties model.
 */
@Fluent
public final class VaultProperties {
    /*
     * The Azure Active Directory tenant ID that should be used for
     * authenticating requests to the key vault.
     */
    @JsonProperty(value = "tenantId", required = true)
    private UUID tenantId;

    /*
     * SKU details
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * An array of 0 to 16 identities that have access to the key vault. All
     * identities in the array must use the same tenant ID as the key vault's
     * tenant ID.
     */
    @JsonProperty(value = "accessPolicies")
    private List<AccessPolicyEntry> accessPolicies;

    /*
     * The URI of the vault for performing operations on keys and secrets.
     */
    @JsonProperty(value = "vaultUri")
    private String vaultUri;

    /*
     * Property to specify whether Azure Virtual Machines are permitted to
     * retrieve certificates stored as secrets from the key vault.
     */
    @JsonProperty(value = "enabledForDeployment")
    private Boolean enabledForDeployment;

    /*
     * Property to specify whether Azure Disk Encryption is permitted to
     * retrieve secrets from the vault and unwrap keys.
     */
    @JsonProperty(value = "enabledForDiskEncryption")
    private Boolean enabledForDiskEncryption;

    /*
     * Property to specify whether Azure Resource Manager is permitted to
     * retrieve secrets from the key vault.
     */
    @JsonProperty(value = "enabledForTemplateDeployment")
    private Boolean enabledForTemplateDeployment;

    /*
     * Property to specify whether the 'soft delete' functionality is enabled
     * for this key vault. It does not accept false value.
     */
    @JsonProperty(value = "enableSoftDelete")
    private Boolean enableSoftDelete;

    /*
     * The vault's create mode to indicate whether the vault need to be
     * recovered or not.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /*
     * Property specifying whether protection against purge is enabled for this
     * vault. Setting this property to true activates protection against purge
     * for this vault and its content - only the Key Vault service may initiate
     * a hard, irrecoverable deletion. The setting is effective only if soft
     * delete is also enabled. Enabling this functionality is irreversible -
     * that is, the property does not accept false as its value.
     */
    @JsonProperty(value = "enablePurgeProtection")
    private Boolean enablePurgeProtection;

    /*
     * A set of rules governing the network accessibility of a vault.
     */
    @JsonProperty(value = "networkAcls")
    private NetworkRuleSet networkAcls;

    /**
     * Get the tenantId property: The Azure Active Directory tenant ID that
     * should be used for authenticating requests to the key vault.
     * 
     * @return the tenantId value.
     */
    public UUID getTenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The Azure Active Directory tenant ID that
     * should be used for authenticating requests to the key vault.
     * 
     * @param tenantId the tenantId value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the sku property: SKU details.
     * 
     * @return the sku value.
     */
    public Sku getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU details.
     * 
     * @param sku the sku value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the accessPolicies property: An array of 0 to 16 identities that
     * have access to the key vault. All identities in the array must use the
     * same tenant ID as the key vault's tenant ID.
     * 
     * @return the accessPolicies value.
     */
    public List<AccessPolicyEntry> getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Set the accessPolicies property: An array of 0 to 16 identities that
     * have access to the key vault. All identities in the array must use the
     * same tenant ID as the key vault's tenant ID.
     * 
     * @param accessPolicies the accessPolicies value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setAccessPolicies(List<AccessPolicyEntry> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * Get the vaultUri property: The URI of the vault for performing
     * operations on keys and secrets.
     * 
     * @return the vaultUri value.
     */
    public String getVaultUri() {
        return this.vaultUri;
    }

    /**
     * Set the vaultUri property: The URI of the vault for performing
     * operations on keys and secrets.
     * 
     * @param vaultUri the vaultUri value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setVaultUri(String vaultUri) {
        this.vaultUri = vaultUri;
        return this;
    }

    /**
     * Get the enabledForDeployment property: Property to specify whether Azure
     * Virtual Machines are permitted to retrieve certificates stored as
     * secrets from the key vault.
     * 
     * @return the enabledForDeployment value.
     */
    public Boolean isEnabledForDeployment() {
        return this.enabledForDeployment;
    }

    /**
     * Set the enabledForDeployment property: Property to specify whether Azure
     * Virtual Machines are permitted to retrieve certificates stored as
     * secrets from the key vault.
     * 
     * @param enabledForDeployment the enabledForDeployment value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setEnabledForDeployment(Boolean enabledForDeployment) {
        this.enabledForDeployment = enabledForDeployment;
        return this;
    }

    /**
     * Get the enabledForDiskEncryption property: Property to specify whether
     * Azure Disk Encryption is permitted to retrieve secrets from the vault
     * and unwrap keys.
     * 
     * @return the enabledForDiskEncryption value.
     */
    public Boolean isEnabledForDiskEncryption() {
        return this.enabledForDiskEncryption;
    }

    /**
     * Set the enabledForDiskEncryption property: Property to specify whether
     * Azure Disk Encryption is permitted to retrieve secrets from the vault
     * and unwrap keys.
     * 
     * @param enabledForDiskEncryption the enabledForDiskEncryption value to
     * set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setEnabledForDiskEncryption(Boolean enabledForDiskEncryption) {
        this.enabledForDiskEncryption = enabledForDiskEncryption;
        return this;
    }

    /**
     * Get the enabledForTemplateDeployment property: Property to specify
     * whether Azure Resource Manager is permitted to retrieve secrets from the
     * key vault.
     * 
     * @return the enabledForTemplateDeployment value.
     */
    public Boolean isEnabledForTemplateDeployment() {
        return this.enabledForTemplateDeployment;
    }

    /**
     * Set the enabledForTemplateDeployment property: Property to specify
     * whether Azure Resource Manager is permitted to retrieve secrets from the
     * key vault.
     * 
     * @param enabledForTemplateDeployment the enabledForTemplateDeployment
     * value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setEnabledForTemplateDeployment(Boolean enabledForTemplateDeployment) {
        this.enabledForTemplateDeployment = enabledForTemplateDeployment;
        return this;
    }

    /**
     * Get the enableSoftDelete property: Property to specify whether the 'soft
     * delete' functionality is enabled for this key vault. It does not accept
     * false value.
     * 
     * @return the enableSoftDelete value.
     */
    public Boolean isEnableSoftDelete() {
        return this.enableSoftDelete;
    }

    /**
     * Set the enableSoftDelete property: Property to specify whether the 'soft
     * delete' functionality is enabled for this key vault. It does not accept
     * false value.
     * 
     * @param enableSoftDelete the enableSoftDelete value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setEnableSoftDelete(Boolean enableSoftDelete) {
        this.enableSoftDelete = enableSoftDelete;
        return this;
    }

    /**
     * Get the createMode property: The vault's create mode to indicate whether
     * the vault need to be recovered or not.
     * 
     * @return the createMode value.
     */
    public CreateMode getCreateMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The vault's create mode to indicate whether
     * the vault need to be recovered or not.
     * 
     * @param createMode the createMode value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the enablePurgeProtection property: Property specifying whether
     * protection against purge is enabled for this vault. Setting this
     * property to true activates protection against purge for this vault and
     * its content - only the Key Vault service may initiate a hard,
     * irrecoverable deletion. The setting is effective only if soft delete is
     * also enabled. Enabling this functionality is irreversible - that is, the
     * property does not accept false as its value.
     * 
     * @return the enablePurgeProtection value.
     */
    public Boolean isEnablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    /**
     * Set the enablePurgeProtection property: Property specifying whether
     * protection against purge is enabled for this vault. Setting this
     * property to true activates protection against purge for this vault and
     * its content - only the Key Vault service may initiate a hard,
     * irrecoverable deletion. The setting is effective only if soft delete is
     * also enabled. Enabling this functionality is irreversible - that is, the
     * property does not accept false as its value.
     * 
     * @param enablePurgeProtection the enablePurgeProtection value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setEnablePurgeProtection(Boolean enablePurgeProtection) {
        this.enablePurgeProtection = enablePurgeProtection;
        return this;
    }

    /**
     * Get the networkAcls property: A set of rules governing the network
     * accessibility of a vault.
     * 
     * @return the networkAcls value.
     */
    public NetworkRuleSet getNetworkAcls() {
        return this.networkAcls;
    }

    /**
     * Set the networkAcls property: A set of rules governing the network
     * accessibility of a vault.
     * 
     * @param networkAcls the networkAcls value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties setNetworkAcls(NetworkRuleSet networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }
}
