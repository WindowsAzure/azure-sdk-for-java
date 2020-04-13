// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ActivityLogAlertActionGroup model. */
@Fluent
public final class ActivityLogAlertActionGroup {
    /*
     * The resourceId of the action group. This cannot be null or empty.
     */
    @JsonProperty(value = "actionGroupId", required = true)
    private String actionGroupId;

    /*
     * the dictionary of custom properties to include with the post operation.
     * These data are appended to the webhook payload.
     */
    @JsonProperty(value = "webhookProperties")
    private Map<String, String> webhookProperties;

    /**
     * Get the actionGroupId property: The resourceId of the action group. This cannot be null or empty.
     *
     * @return the actionGroupId value.
     */
    public String actionGroupId() {
        return this.actionGroupId;
    }

    /**
     * Set the actionGroupId property: The resourceId of the action group. This cannot be null or empty.
     *
     * @param actionGroupId the actionGroupId value to set.
     * @return the ActivityLogAlertActionGroup object itself.
     */
    public ActivityLogAlertActionGroup withActionGroupId(String actionGroupId) {
        this.actionGroupId = actionGroupId;
        return this;
    }

    /**
     * Get the webhookProperties property: the dictionary of custom properties to include with the post operation. These
     * data are appended to the webhook payload.
     *
     * @return the webhookProperties value.
     */
    public Map<String, String> webhookProperties() {
        return this.webhookProperties;
    }

    /**
     * Set the webhookProperties property: the dictionary of custom properties to include with the post operation. These
     * data are appended to the webhook payload.
     *
     * @param webhookProperties the webhookProperties value to set.
     * @return the ActivityLogAlertActionGroup object itself.
     */
    public ActivityLogAlertActionGroup withWebhookProperties(Map<String, String> webhookProperties) {
        this.webhookProperties = webhookProperties;
        return this;
    }
}
