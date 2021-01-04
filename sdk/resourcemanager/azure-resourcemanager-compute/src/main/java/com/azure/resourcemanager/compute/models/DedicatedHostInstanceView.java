// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The instance view of a dedicated host. */
@Fluent
public class DedicatedHostInstanceView {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedHostInstanceView.class);

    /*
     * Specifies the unique id of the dedicated physical machine on which the
     * dedicated host resides.
     */
    @JsonProperty(value = "assetId", access = JsonProperty.Access.WRITE_ONLY)
    private String assetId;

    /*
     * Unutilized capacity of the dedicated host.
     */
    @JsonProperty(value = "availableCapacity")
    private DedicatedHostAvailableCapacity availableCapacity;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get the assetId property: Specifies the unique id of the dedicated physical machine on which the dedicated host
     * resides.
     *
     * @return the assetId value.
     */
    public String assetId() {
        return this.assetId;
    }

    /**
     * Get the availableCapacity property: Unutilized capacity of the dedicated host.
     *
     * @return the availableCapacity value.
     */
    public DedicatedHostAvailableCapacity availableCapacity() {
        return this.availableCapacity;
    }

    /**
     * Set the availableCapacity property: Unutilized capacity of the dedicated host.
     *
     * @param availableCapacity the availableCapacity value to set.
     * @return the DedicatedHostInstanceView object itself.
     */
    public DedicatedHostInstanceView withAvailableCapacity(DedicatedHostAvailableCapacity availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses property: The resource status information.
     *
     * @param statuses the statuses value to set.
     * @return the DedicatedHostInstanceView object itself.
     */
    public DedicatedHostInstanceView withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availableCapacity() != null) {
            availableCapacity().validate();
        }
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
