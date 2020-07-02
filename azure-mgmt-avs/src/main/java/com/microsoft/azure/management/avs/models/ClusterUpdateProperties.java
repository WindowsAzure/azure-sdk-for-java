/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a cluster that may be updated.
 */
public class ClusterUpdateProperties {
    /**
     * The cluster size.
     */
    @JsonProperty(value = "clusterSize")
    private Integer clusterSize;

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
     * @return the ClusterUpdateProperties object itself.
     */
    public ClusterUpdateProperties withClusterSize(Integer clusterSize) {
        this.clusterSize = clusterSize;
        return this;
    }

}
