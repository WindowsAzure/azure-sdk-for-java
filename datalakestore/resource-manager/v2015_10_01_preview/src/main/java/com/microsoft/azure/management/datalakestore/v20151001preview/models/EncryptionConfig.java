/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EncryptionConfig model.
 */
public class EncryptionConfig {
    /**
     * The type of encryption configuration being used. Currently the only
     * supported types are 'UserManaged' and 'ServiceManaged'. Possible values
     * include: 'UserManaged', 'ServiceManaged'.
     */
    @JsonProperty(value = "type")
    private EncryptionConfigType type;

    /**
     * The Key vault information for connecting to user managed encryption
     * keys.
     */
    @JsonProperty(value = "keyVaultMetaInfo")
    private KeyVaultMetaInfo keyVaultMetaInfo;

    /**
     * Get the type of encryption configuration being used. Currently the only supported types are 'UserManaged' and 'ServiceManaged'. Possible values include: 'UserManaged', 'ServiceManaged'.
     *
     * @return the type value
     */
    public EncryptionConfigType type() {
        return this.type;
    }

    /**
     * Set the type of encryption configuration being used. Currently the only supported types are 'UserManaged' and 'ServiceManaged'. Possible values include: 'UserManaged', 'ServiceManaged'.
     *
     * @param type the type value to set
     * @return the EncryptionConfig object itself.
     */
    public EncryptionConfig withType(EncryptionConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the Key vault information for connecting to user managed encryption keys.
     *
     * @return the keyVaultMetaInfo value
     */
    public KeyVaultMetaInfo keyVaultMetaInfo() {
        return this.keyVaultMetaInfo;
    }

    /**
     * Set the Key vault information for connecting to user managed encryption keys.
     *
     * @param keyVaultMetaInfo the keyVaultMetaInfo value to set
     * @return the EncryptionConfig object itself.
     */
    public EncryptionConfig withKeyVaultMetaInfo(KeyVaultMetaInfo keyVaultMetaInfo) {
        this.keyVaultMetaInfo = keyVaultMetaInfo;
        return this;
    }

}
