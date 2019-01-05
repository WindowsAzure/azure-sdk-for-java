/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options for reimaging a compute node.
 */
public class NodeReimageParameter {
    /**
     * When to reimage the compute node and what to do with currently running
     * tasks.
     * The default value is requeue. Possible values include: 'requeue',
     * 'terminate', 'taskCompletion', 'retainedData'.
     */
    @JsonProperty(value = "nodeReimageOption")
    private ComputeNodeReimageOption nodeReimageOption;

    /**
     * Get the default value is requeue. Possible values include: 'requeue', 'terminate', 'taskCompletion', 'retainedData'.
     *
     * @return the nodeReimageOption value
     */
    public ComputeNodeReimageOption nodeReimageOption() {
        return this.nodeReimageOption;
    }

    /**
     * Set the default value is requeue. Possible values include: 'requeue', 'terminate', 'taskCompletion', 'retainedData'.
     *
     * @param nodeReimageOption the nodeReimageOption value to set
     * @return the NodeReimageParameter object itself.
     */
    public NodeReimageParameter withNodeReimageOption(ComputeNodeReimageOption nodeReimageOption) {
        this.nodeReimageOption = nodeReimageOption;
        return this;
    }

}
