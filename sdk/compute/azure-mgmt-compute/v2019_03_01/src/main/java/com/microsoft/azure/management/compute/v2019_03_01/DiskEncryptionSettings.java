/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a Encryption Settings for a Disk.
 */
public class DiskEncryptionSettings {
    /**
     * Specifies the location of the disk encryption key, which is a Key Vault
     * Secret.
     */
    @JsonProperty(value = "diskEncryptionKey")
    private KeyVaultSecretReference diskEncryptionKey;

    /**
     * Specifies the location of the key encryption key in Key Vault.
     */
    @JsonProperty(value = "keyEncryptionKey")
    private KeyVaultKeyReference keyEncryptionKey;

    /**
     * Specifies whether disk encryption should be enabled on the virtual
     * machine.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get specifies the location of the disk encryption key, which is a Key Vault Secret.
     *
     * @return the diskEncryptionKey value
     */
    public KeyVaultSecretReference diskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * Set specifies the location of the disk encryption key, which is a Key Vault Secret.
     *
     * @param diskEncryptionKey the diskEncryptionKey value to set
     * @return the DiskEncryptionSettings object itself.
     */
    public DiskEncryptionSettings withDiskEncryptionKey(KeyVaultSecretReference diskEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        return this;
    }

    /**
     * Get specifies the location of the key encryption key in Key Vault.
     *
     * @return the keyEncryptionKey value
     */
    public KeyVaultKeyReference keyEncryptionKey() {
        return this.keyEncryptionKey;
    }

    /**
     * Set specifies the location of the key encryption key in Key Vault.
     *
     * @param keyEncryptionKey the keyEncryptionKey value to set
     * @return the DiskEncryptionSettings object itself.
     */
    public DiskEncryptionSettings withKeyEncryptionKey(KeyVaultKeyReference keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
        return this;
    }

    /**
     * Get specifies whether disk encryption should be enabled on the virtual machine.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set specifies whether disk encryption should be enabled on the virtual machine.
     *
     * @param enabled the enabled value to set
     * @return the DiskEncryptionSettings object itself.
     */
    public DiskEncryptionSettings withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
