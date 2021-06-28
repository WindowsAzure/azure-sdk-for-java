// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadmonitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.workloadmonitor.fluent.models.HealthMonitorInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about the current health statuses of the monitors. */
@Fluent
public final class HealthMonitorList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HealthMonitorList.class);

    /*
     * Array of health monitors of the virtual machine.
     */
    @JsonProperty(value = "value")
    private List<HealthMonitorInner> value;

    /*
     * Link to next page if the list is too long.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Array of health monitors of the virtual machine.
     *
     * @return the value value.
     */
    public List<HealthMonitorInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of health monitors of the virtual machine.
     *
     * @param value the value value to set.
     * @return the HealthMonitorList object itself.
     */
    public HealthMonitorList withValue(List<HealthMonitorInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page if the list is too long.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to next page if the list is too long.
     *
     * @param nextLink the nextLink value to set.
     * @return the HealthMonitorList object itself.
     */
    public HealthMonitorList withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
