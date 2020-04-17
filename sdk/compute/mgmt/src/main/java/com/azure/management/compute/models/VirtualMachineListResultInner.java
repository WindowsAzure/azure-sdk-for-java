// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineListResult model. */
@Fluent
public final class VirtualMachineListResultInner {
    /*
     * The list of virtual machines.
     */
    @JsonProperty(value = "value", required = true)
    private List<VirtualMachineInner> value;

    /*
     * The URI to fetch the next page of VMs. Call ListNext() with this URI to
     * fetch the next page of Virtual Machines.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of virtual machines.
     *
     * @return the value value.
     */
    public List<VirtualMachineInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of virtual machines.
     *
     * @param value the value value to set.
     * @return the VirtualMachineListResultInner object itself.
     */
    public VirtualMachineListResultInner withValue(List<VirtualMachineInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of VMs. Call ListNext() with this URI to fetch the next
     * page of Virtual Machines.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of VMs. Call ListNext() with this URI to fetch the next
     * page of Virtual Machines.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineListResultInner object itself.
     */
    public VirtualMachineListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
