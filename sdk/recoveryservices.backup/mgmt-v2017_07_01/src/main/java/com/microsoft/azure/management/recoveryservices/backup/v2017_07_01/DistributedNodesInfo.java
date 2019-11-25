/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is used to represent the various nodes of the distributed container.
 */
public class DistributedNodesInfo {
    /**
     * Name of the node under a distributed container.
     */
    @JsonProperty(value = "nodeName")
    private String nodeName;

    /**
     * Status of this Node.
     * Failed | Succeeded.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Error Details if the Status is non-success.
     */
    @JsonProperty(value = "errorDetail")
    private ErrorDetail errorDetail;

    /**
     * Get name of the node under a distributed container.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set name of the node under a distributed container.
     *
     * @param nodeName the nodeName value to set
     * @return the DistributedNodesInfo object itself.
     */
    public DistributedNodesInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get status of this Node.
                 Failed | Succeeded.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set status of this Node.
                 Failed | Succeeded.
     *
     * @param status the status value to set
     * @return the DistributedNodesInfo object itself.
     */
    public DistributedNodesInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get error Details if the Status is non-success.
     *
     * @return the errorDetail value
     */
    public ErrorDetail errorDetail() {
        return this.errorDetail;
    }

    /**
     * Set error Details if the Status is non-success.
     *
     * @param errorDetail the errorDetail value to set
     * @return the DistributedNodesInfo object itself.
     */
    public DistributedNodesInfo withErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

}
