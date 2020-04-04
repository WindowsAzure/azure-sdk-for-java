// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The MetricAlertAction model.
 */
@Fluent
public final class MetricAlertAction {
    /*
     * the id of the action group to use.
     */
    @JsonProperty(value = "actionGroupId")
    private String actionGroupId;

    /*
     * The properties of a webhook object.
     */
    @JsonProperty(value = "webHookProperties")
    private Map<String, String> webHookProperties;

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
     * Get the webHookProperties property: The properties of a webhook object.
     * 
     * @return the webHookProperties value.
     */
    public Map<String, String> webHookProperties() {
        return this.webHookProperties;
    }

    /**
     * Set the webHookProperties property: The properties of a webhook object.
     * 
     * @param webHookProperties the webHookProperties value to set.
     * @return the MetricAlertAction object itself.
     */
    public MetricAlertAction withWebHookProperties(Map<String, String> webHookProperties) {
        this.webHookProperties = webHookProperties;
        return this;
    }
}
