/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A cluster resource.
 */
@JsonFlatten
public class Cluster extends ProxyResource {
    /**
     * The cluster SKU.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /**
     * The state of the cluster provisioning. Possible values include:
     * 'Succeeded', 'Failed', 'Cancelled', 'Deleting', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterProvisioningState provisioningState;

    /**
     * The cluster size.
     */
    @JsonProperty(value = "properties.clusterSize")
    private Integer clusterSize;

    /**
     * The identity.
     */
    @JsonProperty(value = "properties.clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer clusterId;

    /**
     * The hosts.
     */
    @JsonProperty(value = "properties.hosts", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hosts;

    /**
     * Get the cluster SKU.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the cluster SKU.
     *
     * @param sku the sku value to set
     * @return the Cluster object itself.
     */
    public Cluster withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the state of the cluster provisioning. Possible values include: 'Succeeded', 'Failed', 'Cancelled', 'Deleting', 'Updating'.
     *
     * @return the provisioningState value
     */
    public ClusterProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the cluster size.
     *
     * @return the clusterSize value
     */
    public Integer clusterSize() {
        return this.clusterSize;
    }

    /**
     * Set the cluster size.
     *
     * @param clusterSize the clusterSize value to set
     * @return the Cluster object itself.
     */
    public Cluster withClusterSize(Integer clusterSize) {
        this.clusterSize = clusterSize;
        return this;
    }

    /**
     * Get the identity.
     *
     * @return the clusterId value
     */
    public Integer clusterId() {
        return this.clusterId;
    }

    /**
     * Get the hosts.
     *
     * @return the hosts value
     */
    public List<String> hosts() {
        return this.hosts;
    }

}
