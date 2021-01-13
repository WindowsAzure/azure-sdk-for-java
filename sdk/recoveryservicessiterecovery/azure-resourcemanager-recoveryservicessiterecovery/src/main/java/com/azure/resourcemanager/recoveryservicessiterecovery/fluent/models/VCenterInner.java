// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VCenterProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** vCenter definition. */
@Fluent
public final class VCenterInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VCenterInner.class);

    /*
     * VCenter related data.
     */
    @JsonProperty(value = "properties")
    private VCenterProperties properties;

    /*
     * Resource Location
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the properties property: VCenter related data.
     *
     * @return the properties value.
     */
    public VCenterProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: VCenter related data.
     *
     * @param properties the properties value to set.
     * @return the VCenterInner object itself.
     */
    public VCenterInner withProperties(VCenterProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the location property: Resource Location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     *
     * @param location the location value to set.
     * @return the VCenterInner object itself.
     */
    public VCenterInner withLocation(String location) {
        this.location = location;
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
