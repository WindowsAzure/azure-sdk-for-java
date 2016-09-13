/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines all the properties of an Azure Search service.
 */
public class SearchServiceReadableProperties {
    /**
     * The status of the Search service. Possible values include: 'running',
     * 'provisioning', 'deleting', 'degraded', 'disabled', 'error'.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private SearchServiceStatus status;

    /**
     * The details of the Search service status.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /**
     * The state of the last provisioning operation performed on the Search
     * service. Possible values include: 'succeeded', 'provisioning',
     * 'failed'.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The SKU of the Search Service, which determines price tier and capacity
     * limits.
     */
    private Sku sku;

    /**
     * The number of replicas in the Search service. If specified, it must be
     * a value between 1 and 6 inclusive.
     */
    private Integer replicaCount;

    /**
     * The number of partitions in the Search service; if specified, it can be
     * 1, 2, 3, 4, 6, or 12.
     */
    private Integer partitionCount;

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public SearchServiceStatus status() {
        return this.status;
    }

    /**
     * Get the statusDetails value.
     *
     * @return the statusDetails value
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the SearchServiceReadableProperties object itself.
     */
    public SearchServiceReadableProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the replicaCount value.
     *
     * @return the replicaCount value
     */
    public Integer replicaCount() {
        return this.replicaCount;
    }

    /**
     * Set the replicaCount value.
     *
     * @param replicaCount the replicaCount value to set
     * @return the SearchServiceReadableProperties object itself.
     */
    public SearchServiceReadableProperties withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * Get the partitionCount value.
     *
     * @return the partitionCount value
     */
    public Integer partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the partitionCount value.
     *
     * @param partitionCount the partitionCount value to set
     * @return the SearchServiceReadableProperties object itself.
     */
    public SearchServiceReadableProperties withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

}
