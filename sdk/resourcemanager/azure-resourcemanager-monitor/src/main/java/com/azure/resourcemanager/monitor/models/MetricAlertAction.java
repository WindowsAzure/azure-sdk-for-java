// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An alert action. */
@Fluent
public final class MetricAlertAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricAlertAction.class);

    /*
     * the id of the action group to use.
     */
    @JsonProperty(value = "actionGroupId")
    private String actionGroupId;

    /*
     * This field allows specifying custom properties, which would be appended
     * to the alert payload sent as input to the webhook.
     */
    @JsonProperty(value = "webHookProperties")
    private Map<String, String> webhookProperties;

    /**
     * Get the actionGroupId property: the id of the action group to use.
     *
     * @return the actionGroupId value.
     */
    public String actionGroupId() {
        return this.actionGroupId;
    }

    /**
     * Set the actionGroupId property: the id of the action group to use.
     *
     * @param actionGroupId the actionGroupId value to set.
     * @return the MetricAlertAction object itself.
     */
    public MetricAlertAction withActionGroupId(String actionGroupId) {
        this.actionGroupId = actionGroupId;
        return this;
    }

    /**
     * Get the webhookProperties property: This field allows specifying custom properties, which would be appended to
     * the alert payload sent as input to the webhook.
     *
     * @return the webhookProperties value.
     */
    public Map<String, String> webhookProperties() {
        return this.webhookProperties;
    }

    /**
     * Set the webhookProperties property: This field allows specifying custom properties, which would be appended to
     * the alert payload sent as input to the webhook.
     *
     * @param webhookProperties the webhookProperties value to set.
     * @return the MetricAlertAction object itself.
     */
    public MetricAlertAction withWebhookProperties(Map<String, String> webhookProperties) {
        this.webhookProperties = webhookProperties;
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
