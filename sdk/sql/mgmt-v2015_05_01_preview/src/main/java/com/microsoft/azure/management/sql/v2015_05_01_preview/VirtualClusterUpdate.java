/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * An update request for an Azure SQL Database virtual cluster.
 */
@JsonFlatten
public class VirtualClusterUpdate {
    /**
     * Subnet resource ID for the virtual cluster.
     */
    @JsonProperty(value = "properties.subnetId", access = JsonProperty.Access.WRITE_ONLY)
    private String subnetId;

    /**
     * If the service has different generations of hardware, for the same SKU,
     * then that can be captured here.
     */
    @JsonProperty(value = "properties.family")
    private String family;

    /**
     * List of resources in this virtual cluster.
     */
    @JsonProperty(value = "properties.childResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> childResources;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get subnet resource ID for the virtual cluster.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Get if the service has different generations of hardware, for the same SKU, then that can be captured here.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Set if the service has different generations of hardware, for the same SKU, then that can be captured here.
     *
     * @param family the family value to set
     * @return the VirtualClusterUpdate object itself.
     */
    public VirtualClusterUpdate withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get list of resources in this virtual cluster.
     *
     * @return the childResources value
     */
    public List<String> childResources() {
        return this.childResources;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the VirtualClusterUpdate object itself.
     */
    public VirtualClusterUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
