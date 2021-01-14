// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineRunCommandInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List run command operation response. */
@Fluent
public final class VirtualMachineRunCommandsListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineRunCommandsListResult.class);

    /*
     * The list of run commands
     */
    @JsonProperty(value = "value", required = true)
    private List<VirtualMachineRunCommandInner> value;

    /*
     * The uri to fetch the next page of run commands.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of run commands.
     *
     * @return the value value.
     */
    public List<VirtualMachineRunCommandInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of run commands.
     *
     * @param value the value value to set.
     * @return the VirtualMachineRunCommandsListResult object itself.
     */
    public VirtualMachineRunCommandsListResult withValue(List<VirtualMachineRunCommandInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of run commands.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of run commands.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineRunCommandsListResult object itself.
     */
    public VirtualMachineRunCommandsListResult withNextLink(String nextLink) {
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
                    new IllegalArgumentException(
                        "Missing required property value in model VirtualMachineRunCommandsListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
