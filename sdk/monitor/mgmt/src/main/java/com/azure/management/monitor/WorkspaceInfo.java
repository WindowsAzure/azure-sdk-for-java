// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WorkspaceInfo model.
 */
@JsonFlatten
@Fluent
public class WorkspaceInfo {
    /*
     * Azure Resource Manager identifier of the Log Analytics Workspace.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Location of the Log Analytics workspace.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Log Analytics workspace identifier.
     */
    @JsonProperty(value = "properties.customerId", required = true)
    private String customerId;

    /**
     * Get the id property: Azure Resource Manager identifier of the Log
     * Analytics Workspace.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Azure Resource Manager identifier of the Log
     * Analytics Workspace.
     * 
     * @param id the id value to set.
     * @return the WorkspaceInfo object itself.
     */
    public WorkspaceInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the location property: Location of the Log Analytics workspace.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of the Log Analytics workspace.
     * 
     * @param location the location value to set.
     * @return the WorkspaceInfo object itself.
     */
    public WorkspaceInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the customerId property: Log Analytics workspace identifier.
     * 
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Set the customerId property: Log Analytics workspace identifier.
     * 
     * @param customerId the customerId value to set.
     * @return the WorkspaceInfo object itself.
     */
    public WorkspaceInfo withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
}
