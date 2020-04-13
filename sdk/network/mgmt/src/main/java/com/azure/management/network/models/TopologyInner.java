// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.network.TopologyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The Topology model. */
@Fluent
public final class TopologyInner {
    /*
     * GUID representing the operation id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The datetime when the topology was initially created for the resource
     * group.
     */
    @JsonProperty(value = "createdDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDateTime;

    /*
     * The datetime when the topology was last modified.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * A list of topology resources.
     */
    @JsonProperty(value = "resources")
    private List<TopologyResource> resources;

    /**
     * Get the id property: GUID representing the operation id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the createdDateTime property: The datetime when the topology was initially created for the resource group.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the lastModified property: The datetime when the topology was last modified.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the resources property: A list of topology resources.
     *
     * @return the resources value.
     */
    public List<TopologyResource> resources() {
        return this.resources;
    }

    /**
     * Set the resources property: A list of topology resources.
     *
     * @param resources the resources value to set.
     * @return the TopologyInner object itself.
     */
    public TopologyInner withResources(List<TopologyResource> resources) {
        this.resources = resources;
        return this;
    }
}
