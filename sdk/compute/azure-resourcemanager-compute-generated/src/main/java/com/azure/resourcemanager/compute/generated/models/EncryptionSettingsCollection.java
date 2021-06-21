// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Encryption settings for disk or snapshot. */
@Fluent
public final class EncryptionSettingsCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionSettingsCollection.class);

    /*
     * Set this flag to true and provide DiskEncryptionKey and optional
     * KeyEncryptionKey to enable encryption. Set this flag to false and remove
     * DiskEncryptionKey and KeyEncryptionKey to disable encryption. If
     * EncryptionSettings is null in the request object, the existing settings
     * remain unchanged.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * A collection of encryption settings, one for each disk volume.
     */
    @JsonProperty(value = "encryptionSettings")
    private List<EncryptionSettingsElement> encryptionSettings;

    /*
     * Describes what type of encryption is used for the disks. Once this field
     * is set, it cannot be overwritten. '1.0' corresponds to Azure Disk
     * Encryption with AAD app.'1.1' corresponds to Azure Disk Encryption.
     */
    @JsonProperty(value = "encryptionSettingsVersion")
    private String encryptionSettingsVersion;

    /**
     * Get the enabled property: Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to
     * enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable
     * encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to
     * enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable
     * encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
     *
     * @param enabled the enabled value to set.
     * @return the EncryptionSettingsCollection object itself.
     */
    public EncryptionSettingsCollection withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the encryptionSettings property: A collection of encryption settings, one for each disk volume.
     *
     * @return the encryptionSettings value.
     */
    public List<EncryptionSettingsElement> encryptionSettings() {
        return this.encryptionSettings;
    }

    /**
     * Set the encryptionSettings property: A collection of encryption settings, one for each disk volume.
     *
     * @param encryptionSettings the encryptionSettings value to set.
     * @return the EncryptionSettingsCollection object itself.
     */
    public EncryptionSettingsCollection withEncryptionSettings(List<EncryptionSettingsElement> encryptionSettings) {
        this.encryptionSettings = encryptionSettings;
        return this;
    }

    /**
     * Get the encryptionSettingsVersion property: Describes what type of encryption is used for the disks. Once this
     * field is set, it cannot be overwritten. '1.0' corresponds to Azure Disk Encryption with AAD app.'1.1' corresponds
     * to Azure Disk Encryption.
     *
     * @return the encryptionSettingsVersion value.
     */
    public String encryptionSettingsVersion() {
        return this.encryptionSettingsVersion;
    }

    /**
     * Set the encryptionSettingsVersion property: Describes what type of encryption is used for the disks. Once this
     * field is set, it cannot be overwritten. '1.0' corresponds to Azure Disk Encryption with AAD app.'1.1' corresponds
     * to Azure Disk Encryption.
     *
     * @param encryptionSettingsVersion the encryptionSettingsVersion value to set.
     * @return the EncryptionSettingsCollection object itself.
     */
    public EncryptionSettingsCollection withEncryptionSettingsVersion(String encryptionSettingsVersion) {
        this.encryptionSettingsVersion = encryptionSettingsVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryptionSettings() != null) {
            encryptionSettings().forEach(e -> e.validate());
        }
    }
}
