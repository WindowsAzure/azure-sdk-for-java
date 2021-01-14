// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the response of a provision trigger dependency operation. */
@Fluent
public final class TriggerDependencyProvisioningStatus {
    /*
     * Trigger name.
     */
    @JsonProperty(value = "triggerName", required = true)
    private String triggerName;

    /*
     * Provisioning status.
     */
    @JsonProperty(value = "provisioningStatus", required = true)
    private String provisioningStatus;

    /**
     * Get the triggerName property: Trigger name.
     *
     * @return the triggerName value.
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * Set the triggerName property: Trigger name.
     *
     * @param triggerName the triggerName value to set.
     * @return the TriggerDependencyProvisioningStatus object itself.
     */
    public TriggerDependencyProvisioningStatus setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    /**
     * Get the provisioningStatus property: Provisioning status.
     *
     * @return the provisioningStatus value.
     */
    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * Set the provisioningStatus property: Provisioning status.
     *
     * @param provisioningStatus the provisioningStatus value to set.
     * @return the TriggerDependencyProvisioningStatus object itself.
     */
    public TriggerDependencyProvisioningStatus setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }
}
