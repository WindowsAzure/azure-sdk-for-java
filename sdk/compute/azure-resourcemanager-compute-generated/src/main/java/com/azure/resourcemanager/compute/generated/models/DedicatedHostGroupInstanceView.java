// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DedicatedHostGroupInstanceView model. */
@Fluent
public final class DedicatedHostGroupInstanceView {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedHostGroupInstanceView.class);

    /*
     * List of instance view of the dedicated hosts under the dedicated host
     * group.
     */
    @JsonProperty(value = "hosts")
    private List<DedicatedHostInstanceViewWithName> hosts;

    /**
     * Get the hosts property: List of instance view of the dedicated hosts under the dedicated host group.
     *
     * @return the hosts value.
     */
    public List<DedicatedHostInstanceViewWithName> hosts() {
        return this.hosts;
    }

    /**
     * Set the hosts property: List of instance view of the dedicated hosts under the dedicated host group.
     *
     * @param hosts the hosts value to set.
     * @return the DedicatedHostGroupInstanceView object itself.
     */
    public DedicatedHostGroupInstanceView withHosts(List<DedicatedHostInstanceViewWithName> hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hosts() != null) {
            hosts().forEach(e -> e.validate());
        }
    }
}
