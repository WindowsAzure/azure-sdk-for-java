// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A customer-managed encryption key in Azure Key Vault. Keys that you create
 * and manage can be used to encrypt or decrypt data-at-rest in Azure Cognitive
 * Search, such as indexes and synonym maps.
 */
@Fluent
public final class EncryptionKey {
    /*
     * The name of your Azure Key Vault key to be used to encrypt your data at
     * rest.
     */
    @JsonProperty(value = "keyVaultKeyName", required = true)
    private String keyVaultKeyName;

    /*
     * The version of your Azure Key Vault key to be used to encrypt your data
     * at rest.
     */
    @JsonProperty(value = "keyVaultKeyVersion", required = true)
    private String keyVaultKeyVersion;

    /*
     * The URI of your Azure Key Vault, also referred to as DNS name, that
     * contains the key to be used to encrypt your data at rest. An example URI
     * might be https://my-keyvault-name.vault.azure.net.
     */
    @JsonProperty(value = "keyVaultUri", required = true)
    private String keyVaultUri;

    /*
     * Optional Azure Active Directory credentials used for accessing your
     * Azure Key Vault. Not required if using managed identity instead.
     */
    @JsonProperty(value = "accessCredentials")
    private AzureActiveDirectoryApplicationCredentials accessCredentials;

    /**
     * Get the keyVaultKeyName property: The name of your Azure Key Vault key
     * to be used to encrypt your data at rest.
     *
     * @return the keyVaultKeyName value.
     */
    public String getKeyVaultKeyName() {
        return this.keyVaultKeyName;
    }

    /**
     * Set the keyVaultKeyName property: The name of your Azure Key Vault key
     * to be used to encrypt your data at rest.
     *
     * @param keyVaultKeyName the keyVaultKeyName value to set.
     * @return the EncryptionKey object itself.
     */
    public EncryptionKey setKeyVaultKeyName(String keyVaultKeyName) {
        this.keyVaultKeyName = keyVaultKeyName;
        return this;
    }

    /**
     * Get the keyVaultKeyVersion property: The version of your Azure Key Vault
     * key to be used to encrypt your data at rest.
     *
     * @return the keyVaultKeyVersion value.
     */
    public String getKeyVaultKeyVersion() {
        return this.keyVaultKeyVersion;
    }

    /**
     * Set the keyVaultKeyVersion property: The version of your Azure Key Vault
     * key to be used to encrypt your data at rest.
     *
     * @param keyVaultKeyVersion the keyVaultKeyVersion value to set.
     * @return the EncryptionKey object itself.
     */
    public EncryptionKey setKeyVaultKeyVersion(String keyVaultKeyVersion) {
        this.keyVaultKeyVersion = keyVaultKeyVersion;
        return this;
    }

    /**
     * Get the keyVaultUri property: The URI of your Azure Key Vault, also
     * referred to as DNS name, that contains the key to be used to encrypt
     * your data at rest. An example URI might be
     * https://my-keyvault-name.vault.azure.net.
     *
     * @return the keyVaultUri value.
     */
    public String getKeyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: The URI of your Azure Key Vault, also
     * referred to as DNS name, that contains the key to be used to encrypt
     * your data at rest. An example URI might be
     * https://my-keyvault-name.vault.azure.net.
     *
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the EncryptionKey object itself.
     */
    public EncryptionKey setKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the accessCredentials property: Optional Azure Active Directory
     * credentials used for accessing your Azure Key Vault. Not required if
     * using managed identity instead.
     *
     * @return the accessCredentials value.
     */
    public AzureActiveDirectoryApplicationCredentials getAccessCredentials() {
        return this.accessCredentials;
    }

    /**
     * Set the accessCredentials property: Optional Azure Active Directory
     * credentials used for accessing your Azure Key Vault. Not required if
     * using managed identity instead.
     *
     * @param accessCredentials the accessCredentials value to set.
     * @return the EncryptionKey object itself.
     */
    public EncryptionKey setAccessCredentials(AzureActiveDirectoryApplicationCredentials accessCredentials) {
        this.accessCredentials = accessCredentials;
        return this;
    }
}
