/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of CMK for the factory.
 */
public class EncryptionConfiguration {
    /**
     * The name of the key in Azure Key Vault to use as Customer Managed Key.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * The url of the Azure Key Vault used for CMK.
     */
    @JsonProperty(value = "vaultBaseUrl", required = true)
    private String vaultBaseUrl;

    /**
     * The version of the key used for CMK. If not provided, latest version
     * will be used.
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /**
     * User assigned identity to use to authenticate to customer's key vault.
     * If not provided Managed Service Identity will be used.
     */
    @JsonProperty(value = "identity")
    private CMKIdentityDefinition identity;

    /**
     * Get the name of the key in Azure Key Vault to use as Customer Managed Key.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the name of the key in Azure Key Vault to use as Customer Managed Key.
     *
     * @param keyName the keyName value to set
     * @return the EncryptionConfiguration object itself.
     */
    public EncryptionConfiguration withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the url of the Azure Key Vault used for CMK.
     *
     * @return the vaultBaseUrl value
     */
    public String vaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    /**
     * Set the url of the Azure Key Vault used for CMK.
     *
     * @param vaultBaseUrl the vaultBaseUrl value to set
     * @return the EncryptionConfiguration object itself.
     */
    public EncryptionConfiguration withVaultBaseUrl(String vaultBaseUrl) {
        this.vaultBaseUrl = vaultBaseUrl;
        return this;
    }

    /**
     * Get the version of the key used for CMK. If not provided, latest version will be used.
     *
     * @return the keyVersion value
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the version of the key used for CMK. If not provided, latest version will be used.
     *
     * @param keyVersion the keyVersion value to set
     * @return the EncryptionConfiguration object itself.
     */
    public EncryptionConfiguration withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get user assigned identity to use to authenticate to customer's key vault. If not provided Managed Service Identity will be used.
     *
     * @return the identity value
     */
    public CMKIdentityDefinition identity() {
        return this.identity;
    }

    /**
     * Set user assigned identity to use to authenticate to customer's key vault. If not provided Managed Service Identity will be used.
     *
     * @param identity the identity value to set
     * @return the EncryptionConfiguration object itself.
     */
    public EncryptionConfiguration withIdentity(CMKIdentityDefinition identity) {
        this.identity = identity;
        return this;
    }

}
