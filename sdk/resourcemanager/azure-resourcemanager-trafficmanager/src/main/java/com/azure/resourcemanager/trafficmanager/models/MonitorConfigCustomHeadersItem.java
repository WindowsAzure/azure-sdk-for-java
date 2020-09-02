// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MonitorConfigCustomHeadersItem model. */
public final class MonitorConfigCustomHeadersItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MonitorConfigCustomHeadersItem.class);

    /*
     * Header name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Header value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: Header name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Header name.
     *
     * @param name the name value to set.
     * @return the MonitorConfigCustomHeadersItem object itself.
     */
    public MonitorConfigCustomHeadersItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Header value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Header value.
     *
     * @param value the value value to set.
     * @return the MonitorConfigCustomHeadersItem object itself.
     */
    public MonitorConfigCustomHeadersItem withValue(String value) {
        this.value = value;
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
