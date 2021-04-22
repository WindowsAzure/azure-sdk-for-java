// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An existing operation for replacing the firewall rules. */
@Fluent
public final class ReplaceAllFirewallRulesOperationResponseInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ReplaceAllFirewallRulesOperationResponseInner.class);

    /*
     * The operation ID
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /**
     * Get the operationId property: The operation ID.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The operation ID.
     *
     * @param operationId the operationId value to set.
     * @return the ReplaceAllFirewallRulesOperationResponseInner object itself.
     */
    public ReplaceAllFirewallRulesOperationResponseInner withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}