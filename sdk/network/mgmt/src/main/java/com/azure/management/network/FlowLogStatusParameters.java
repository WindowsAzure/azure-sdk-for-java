// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FlowLogStatusParameters model.
 */
@Fluent
public final class FlowLogStatusParameters {
    /*
     * The target resource where getting the flow log and traffic analytics
     * (optional) status.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * Get the targetResourceId property: The target resource where getting the
     * flow log and traffic analytics (optional) status.
     * 
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The target resource where getting the
     * flow log and traffic analytics (optional) status.
     * 
     * @param targetResourceId the targetResourceId value to set.
     * @return the FlowLogStatusParameters object itself.
     */
    public FlowLogStatusParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }
}
