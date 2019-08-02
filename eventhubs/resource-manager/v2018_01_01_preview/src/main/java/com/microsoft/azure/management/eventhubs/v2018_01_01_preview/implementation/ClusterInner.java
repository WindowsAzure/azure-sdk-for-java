/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.ClusterSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Single Event Hubs Cluster resource in List or Get operations.
 */
@JsonFlatten
@SkipParentValidation
public class ClusterInner extends Resource {
    /**
     * Properties of the cluster SKU.
     */
    @JsonProperty(value = "sku")
    private ClusterSku sku;

    /**
     * The UTC time when the Event Hubs Cluster was created.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private String created;

    /**
     * The UTC time when the Event Hubs Cluster was last updated.
     */
    @JsonProperty(value = "properties.updated", access = JsonProperty.Access.WRITE_ONLY)
    private String updated;

    /**
     * The metric ID of the cluster resource. Provided by the service and not
     * modifiable by the user.
     */
    @JsonProperty(value = "properties.metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /**
     * Status of the Cluster resource.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Get properties of the cluster SKU.
     *
     * @return the sku value
     */
    public ClusterSku sku() {
        return this.sku;
    }

    /**
     * Set properties of the cluster SKU.
     *
     * @param sku the sku value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSku(ClusterSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the UTC time when the Event Hubs Cluster was created.
     *
     * @return the created value
     */
    public String created() {
        return this.created;
    }

    /**
     * Get the UTC time when the Event Hubs Cluster was last updated.
     *
     * @return the updated value
     */
    public String updated() {
        return this.updated;
    }

    /**
     * Get the metric ID of the cluster resource. Provided by the service and not modifiable by the user.
     *
     * @return the metricId value
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get status of the Cluster resource.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

}
