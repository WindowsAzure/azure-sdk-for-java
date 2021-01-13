// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Enable protection input. */
@Fluent
public final class EnableProtectionInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnableProtectionInput.class);

    /*
     * Enable protection input properties.
     */
    @JsonProperty(value = "properties")
    private EnableProtectionInputProperties properties;

    /**
     * Get the properties property: Enable protection input properties.
     *
     * @return the properties value.
     */
    public EnableProtectionInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Enable protection input properties.
     *
     * @param properties the properties value to set.
     * @return the EnableProtectionInput object itself.
     */
    public EnableProtectionInput withProperties(EnableProtectionInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
