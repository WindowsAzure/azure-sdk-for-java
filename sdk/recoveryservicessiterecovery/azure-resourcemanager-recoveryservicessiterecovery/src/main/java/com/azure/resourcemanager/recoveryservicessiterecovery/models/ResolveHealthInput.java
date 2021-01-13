// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resolve health input. */
@Fluent
public final class ResolveHealthInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResolveHealthInput.class);

    /*
     * Disable resolve health input properties.
     */
    @JsonProperty(value = "properties")
    private ResolveHealthInputProperties properties;

    /**
     * Get the properties property: Disable resolve health input properties.
     *
     * @return the properties value.
     */
    public ResolveHealthInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Disable resolve health input properties.
     *
     * @param properties the properties value to set.
     * @return the ResolveHealthInput object itself.
     */
    public ResolveHealthInput withProperties(ResolveHealthInputProperties properties) {
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
