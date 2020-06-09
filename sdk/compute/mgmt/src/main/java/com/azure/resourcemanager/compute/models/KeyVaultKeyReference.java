// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KeyVaultKeyReference model. */
@Fluent
public final class KeyVaultKeyReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultKeyReference.class);

    /*
     * The URL referencing a key encryption key in Key Vault.
     */
    @JsonProperty(value = "keyUrl", required = true)
    private String keyUrl;

    /*
     * The relative URL of the Key Vault containing the key.
     */
    @JsonProperty(value = "sourceVault", required = true)
    private SubResource sourceVault;

    /**
     * Get the keyUrl property: The URL referencing a key encryption key in Key Vault.
     *
     * @return the keyUrl value.
     */
    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Set the keyUrl property: The URL referencing a key encryption key in Key Vault.
     *
     * @param keyUrl the keyUrl value to set.
     * @return the KeyVaultKeyReference object itself.
     */
    public KeyVaultKeyReference withKeyUrl(String keyUrl) {
        this.keyUrl = keyUrl;
        return this;
    }

    /**
     * Get the sourceVault property: The relative URL of the Key Vault containing the key.
     *
     * @return the sourceVault value.
     */
    public SubResource sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault property: The relative URL of the Key Vault containing the key.
     *
     * @param sourceVault the sourceVault value to set.
     * @return the KeyVaultKeyReference object itself.
     */
    public KeyVaultKeyReference withSourceVault(SubResource sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyUrl() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property keyUrl in model KeyVaultKeyReference"));
        }
        if (sourceVault() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceVault in model KeyVaultKeyReference"));
        }
    }
}
