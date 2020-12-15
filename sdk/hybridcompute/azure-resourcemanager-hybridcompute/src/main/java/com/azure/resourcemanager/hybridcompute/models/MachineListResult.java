// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List hybrid machine operation response. */
@Fluent
public final class MachineListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MachineListResult.class);

    /*
     * The list of hybrid machines.
     */
    @JsonProperty(value = "value", required = true)
    private List<MachineInner> value;

    /*
     * The URI to fetch the next page of Machines. Call ListNext() with this
     * URI to fetch the next page of hybrid machines.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of hybrid machines.
     *
     * @return the value value.
     */
    public List<MachineInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of hybrid machines.
     *
     * @param value the value value to set.
     * @return the MachineListResult object itself.
     */
    public MachineListResult withValue(List<MachineInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of Machines. Call ListNext() with this URI to fetch the
     * next page of hybrid machines.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of Machines. Call ListNext() with this URI to fetch the
     * next page of hybrid machines.
     *
     * @param nextLink the nextLink value to set.
     * @return the MachineListResult object itself.
     */
    public MachineListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model MachineListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
