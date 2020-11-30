// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the response of a trigger subscription operation. */
@Immutable
public final class TriggerSubscriptionOperationStatus {
    /*
     * Trigger name.
     */
    @JsonProperty(value = "triggerName", access = JsonProperty.Access.WRITE_ONLY)
    private String triggerName;

    /*
     * Event Subscription Status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private EventSubscriptionStatus status;

    /**
     * Get the triggerName property: Trigger name.
     *
     * @return the triggerName value.
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * Get the status property: Event Subscription Status.
     *
     * @return the status value.
     */
    public EventSubscriptionStatus getStatus() {
        return this.status;
    }
}
