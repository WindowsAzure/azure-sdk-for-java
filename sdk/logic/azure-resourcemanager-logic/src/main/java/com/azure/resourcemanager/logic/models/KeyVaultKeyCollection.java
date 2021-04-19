// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.models.KeyVaultKeyInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of key vault keys. */
@Fluent
public final class KeyVaultKeyCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultKeyCollection.class);

    /*
     * The key vault keys.
     */
    @JsonProperty(value = "value")
    private List<KeyVaultKeyInner> value;

    /*
     * The skip token.
     */
    @JsonProperty(value = "skipToken")
    private String skipToken;

    /**
     * Get the value property: The key vault keys.
     *
     * @return the value value.
     */
    public List<KeyVaultKeyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The key vault keys.
     *
     * @param value the value value to set.
     * @return the KeyVaultKeyCollection object itself.
     */
    public KeyVaultKeyCollection withValue(List<KeyVaultKeyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the skipToken property: The skip token.
     *
     * @return the skipToken value.
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set the skipToken property: The skip token.
     *
     * @param skipToken the skipToken value to set.
     * @return the KeyVaultKeyCollection object itself.
     */
    public KeyVaultKeyCollection withSkipToken(String skipToken) {
        this.skipToken = skipToken;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
