// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.AddonProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An addon resource. */
@Fluent
public final class AddonInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AddonInner.class);

    /*
     * The properties of an addon resource
     */
    @JsonProperty(value = "properties")
    private AddonProperties properties;

    /**
     * Get the properties property: The properties of an addon resource.
     *
     * @return the properties value.
     */
    public AddonProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of an addon resource.
     *
     * @param properties the properties value to set.
     * @return the AddonInner object itself.
     */
    public AddonInner withProperties(AddonProperties properties) {
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
