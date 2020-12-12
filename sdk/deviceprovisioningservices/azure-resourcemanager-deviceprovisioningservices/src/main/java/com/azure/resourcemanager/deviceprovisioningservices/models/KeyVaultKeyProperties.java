// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the KeyVault key. */
@Fluent
public final class KeyVaultKeyProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultKeyProperties.class);

    /*
     * The identifier of the key.
     */
    @JsonProperty(value = "keyIdentifier")
    private String keyIdentifier;

    /**
     * Get the keyIdentifier property: The identifier of the key.
     *
     * @return the keyIdentifier value.
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the keyIdentifier property: The identifier of the key.
     *
     * @param keyIdentifier the keyIdentifier value to set.
     * @return the KeyVaultKeyProperties object itself.
     */
    public KeyVaultKeyProperties withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
