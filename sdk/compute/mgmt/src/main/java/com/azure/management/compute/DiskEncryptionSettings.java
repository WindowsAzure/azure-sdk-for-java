// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DiskEncryptionSettings model. */
@Fluent
public final class DiskEncryptionSettings {
    /*
     * Specifies the location of the disk encryption key, which is a Key Vault
     * Secret.
     */
    @JsonProperty(value = "diskEncryptionKey")
    private KeyVaultSecretReference diskEncryptionKey;

    /*
     * Specifies the location of the key encryption key in Key Vault.
     */
    @JsonProperty(value = "keyEncryptionKey")
    private KeyVaultKeyReference keyEncryptionKey;

    /*
     * Specifies whether disk encryption should be enabled on the virtual
     * machine.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the diskEncryptionKey property: Specifies the location of the disk encryption key, which is a Key Vault
     * Secret.
     *
     * @return the diskEncryptionKey value.
     */
    public KeyVaultSecretReference diskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * Set the diskEncryptionKey property: Specifies the location of the disk encryption key, which is a Key Vault
     * Secret.
     *
     * @param diskEncryptionKey the diskEncryptionKey value to set.
     * @return the DiskEncryptionSettings object itself.
     */
    public DiskEncryptionSettings withDiskEncryptionKey(KeyVaultSecretReference diskEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        return this;
    }

    /**
     * Get the keyEncryptionKey property: Specifies the location of the key encryption key in Key Vault.
     *
     * @return the keyEncryptionKey value.
     */
    public KeyVaultKeyReference keyEncryptionKey() {
        return this.keyEncryptionKey;
    }

    /**
     * Set the keyEncryptionKey property: Specifies the location of the key encryption key in Key Vault.
     *
     * @param keyEncryptionKey the keyEncryptionKey value to set.
     * @return the DiskEncryptionSettings object itself.
     */
    public DiskEncryptionSettings withKeyEncryptionKey(KeyVaultKeyReference keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
        return this;
    }

    /**
     * Get the enabled property: Specifies whether disk encryption should be enabled on the virtual machine.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Specifies whether disk encryption should be enabled on the virtual machine.
     *
     * @param enabled the enabled value to set.
     * @return the DiskEncryptionSettings object itself.
     */
    public DiskEncryptionSettings withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
