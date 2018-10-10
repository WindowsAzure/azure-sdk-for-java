/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.ClusterEventInner;

/**
 * Chaos Stopped event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosStopped")
public class ChaosStoppedEvent extends ClusterEventInner {
    /**
     * Describes reason.
     */
    @JsonProperty(value = "Reason", required = true)
    private String reason;

    /**
     * Get describes reason.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set describes reason.
     *
     * @param reason the reason value to set
     * @return the ChaosStoppedEvent object itself.
     */
    public ChaosStoppedEvent withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
