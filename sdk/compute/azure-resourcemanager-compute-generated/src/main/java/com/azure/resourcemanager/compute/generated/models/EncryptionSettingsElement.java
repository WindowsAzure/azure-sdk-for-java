// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Encryption settings for one disk volume. */
@Fluent
public final class EncryptionSettingsElement {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionSettingsElement.class);

    /*
     * Key Vault Secret Url and vault id of the disk encryption key
     */
    @JsonProperty(value = "diskEncryptionKey")
    private KeyVaultAndSecretReference diskEncryptionKey;

    /*
     * Key Vault Key Url and vault id of the key encryption key.
     * KeyEncryptionKey is optional and when provided is used to unwrap the
     * disk encryption key.
     */
    @JsonProperty(value = "keyEncryptionKey")
    private KeyVaultAndKeyReference keyEncryptionKey;

    /**
     * Get the diskEncryptionKey property: Key Vault Secret Url and vault id of the disk encryption key.
     *
     * @return the diskEncryptionKey value.
     */
    public KeyVaultAndSecretReference diskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * Set the diskEncryptionKey property: Key Vault Secret Url and vault id of the disk encryption key.
     *
     * @param diskEncryptionKey the diskEncryptionKey value to set.
     * @return the EncryptionSettingsElement object itself.
     */
    public EncryptionSettingsElement withDiskEncryptionKey(KeyVaultAndSecretReference diskEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        return this;
    }

    /**
     * Get the keyEncryptionKey property: Key Vault Key Url and vault id of the key encryption key. KeyEncryptionKey is
     * optional and when provided is used to unwrap the disk encryption key.
     *
     * @return the keyEncryptionKey value.
     */
    public KeyVaultAndKeyReference keyEncryptionKey() {
        return this.keyEncryptionKey;
    }

    /**
     * Set the keyEncryptionKey property: Key Vault Key Url and vault id of the key encryption key. KeyEncryptionKey is
     * optional and when provided is used to unwrap the disk encryption key.
     *
     * @param keyEncryptionKey the keyEncryptionKey value to set.
     * @return the EncryptionSettingsElement object itself.
     */
    public EncryptionSettingsElement withKeyEncryptionKey(KeyVaultAndKeyReference keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskEncryptionKey() != null) {
            diskEncryptionKey().validate();
        }
        if (keyEncryptionKey() != null) {
            keyEncryptionKey().validate();
        }
    }
}
