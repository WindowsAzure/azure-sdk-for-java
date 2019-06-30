/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2015_02_28;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines properties of an Azure Search service that can be modified.
 */
public class SearchServiceProperties {
    /**
     * The SKU of the Search Service, which determines price tier and capacity
     * limits.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * The number of replicas in the Search service. If specified, it must be a
     * value between 1 and 6 inclusive.
     */
    @JsonProperty(value = "replicaCount")
    private Integer replicaCount;

    /**
     * The number of partitions in the Search service; if specified, it can be
     * 1, 2, 3, 4, 6, or 12.
     */
    @JsonProperty(value = "partitionCount")
    private Integer partitionCount;

    /**
     * Get the SKU of the Search Service, which determines price tier and capacity limits.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the SKU of the Search Service, which determines price tier and capacity limits.
     *
     * @param sku the sku value to set
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the number of replicas in the Search service. If specified, it must be a value between 1 and 6 inclusive.
     *
     * @return the replicaCount value
     */
    public Integer replicaCount() {
        return this.replicaCount;
    }

    /**
     * Set the number of replicas in the Search service. If specified, it must be a value between 1 and 6 inclusive.
     *
     * @param replicaCount the replicaCount value to set
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * Get the number of partitions in the Search service; if specified, it can be 1, 2, 3, 4, 6, or 12.
     *
     * @return the partitionCount value
     */
    public Integer partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the number of partitions in the Search service; if specified, it can be 1, 2, 3, 4, 6, or 12.
     *
     * @param partitionCount the partitionCount value to set
     * @return the SearchServiceProperties object itself.
     */
    public SearchServiceProperties withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

}
