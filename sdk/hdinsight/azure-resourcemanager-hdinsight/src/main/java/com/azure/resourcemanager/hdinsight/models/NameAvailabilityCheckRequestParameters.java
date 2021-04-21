// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request spec of checking name availability. */
@Fluent
public final class NameAvailabilityCheckRequestParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NameAvailabilityCheckRequestParameters.class);

    /*
     * The resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource type
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name property: The resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource name.
     *
     * @param name the name value to set.
     * @return the NameAvailabilityCheckRequestParameters object itself.
     */
    public NameAvailabilityCheckRequestParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type.
     *
     * @param type the type value to set.
     * @return the NameAvailabilityCheckRequestParameters object itself.
     */
    public NameAvailabilityCheckRequestParameters withType(String type) {
        this.type = type;
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
