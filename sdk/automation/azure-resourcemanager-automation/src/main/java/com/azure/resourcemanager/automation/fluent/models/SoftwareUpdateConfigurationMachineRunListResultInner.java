// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** result of listing all software update configuration machine runs. */
@Fluent
public final class SoftwareUpdateConfigurationMachineRunListResultInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(SoftwareUpdateConfigurationMachineRunListResultInner.class);

    /*
     * outer object returned when listing all software update configuration
     * machine runs
     */
    @JsonProperty(value = "value")
    private List<SoftwareUpdateConfigurationMachineRunInner> value;

    /*
     * link to next page of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: outer object returned when listing all software update configuration machine runs.
     *
     * @return the value value.
     */
    public List<SoftwareUpdateConfigurationMachineRunInner> value() {
        return this.value;
    }

    /**
     * Set the value property: outer object returned when listing all software update configuration machine runs.
     *
     * @param value the value value to set.
     * @return the SoftwareUpdateConfigurationMachineRunListResultInner object itself.
     */
    public SoftwareUpdateConfigurationMachineRunListResultInner withValue(
        List<SoftwareUpdateConfigurationMachineRunInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: link to next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: link to next page of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the SoftwareUpdateConfigurationMachineRunListResultInner object itself.
     */
    public SoftwareUpdateConfigurationMachineRunListResultInner withNextLink(String nextLink) {
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
