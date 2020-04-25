/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The QueueStatus of Agent Pool.
 */
public class AgentPoolQueueStatusInner {
    /**
     * The number of pending runs in the queue.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Get the number of pending runs in the queue.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the number of pending runs in the queue.
     *
     * @param count the count value to set
     * @return the AgentPoolQueueStatusInner object itself.
     */
    public AgentPoolQueueStatusInner withCount(Integer count) {
        this.count = count;
        return this;
    }

}
