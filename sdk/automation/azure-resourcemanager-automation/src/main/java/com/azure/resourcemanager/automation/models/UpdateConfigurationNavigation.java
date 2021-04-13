// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Software update configuration Run Navigation model. */
@Immutable
public final class UpdateConfigurationNavigation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateConfigurationNavigation.class);

    /*
     * Name of the software update configuration triggered the software update
     * configuration run
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Get the name property: Name of the software update configuration triggered the software update configuration run.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
