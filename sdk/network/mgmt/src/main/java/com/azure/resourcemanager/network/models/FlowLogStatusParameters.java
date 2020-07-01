// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FlowLogStatusParameters model. */
@Fluent
public final class FlowLogStatusParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FlowLogStatusParameters.class);

    /*
     * The target resource where getting the flow log and traffic analytics
     * (optional) status.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * Get the targetResourceId property: The target resource where getting the flow log and traffic analytics
     * (optional) status.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The target resource where getting the flow log and traffic analytics
     * (optional) status.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the FlowLogStatusParameters object itself.
     */
    public FlowLogStatusParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceId in model FlowLogStatusParameters"));
        }
    }
}
