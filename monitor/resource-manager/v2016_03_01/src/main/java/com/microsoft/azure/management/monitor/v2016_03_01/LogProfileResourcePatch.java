/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2016_03_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The log profile resource for patch operations.
 */
@JsonFlatten
public class LogProfileResourcePatch {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * the resource id of the storage account to which you would like to send
     * the Activity Log.
     */
    @JsonProperty(value = "properties.storageAccountId")
    private String storageAccountId;

    /**
     * The service bus rule ID of the service bus namespace in which you would
     * like to have Event Hubs created for streaming the Activity Log. The rule
     * ID is of the format: '{service bus resource ID}/authorizationrules/{key
     * name}'.
     */
    @JsonProperty(value = "properties.serviceBusRuleId")
    private String serviceBusRuleId;

    /**
     * List of regions for which Activity Log events should be stored or
     * streamed. It is a comma separated list of valid ARM locations including
     * the 'global' location.
     */
    @JsonProperty(value = "properties.locations", required = true)
    private List<String> locations;

    /**
     * the categories of the logs. These categories are created as is
     * convenient to the user. Some values are: 'Write', 'Delete', and/or
     * 'Action.'.
     */
    @JsonProperty(value = "properties.categories", required = true)
    private List<String> categories;

    /**
     * the retention policy for the events in the log.
     */
    @JsonProperty(value = "properties.retentionPolicy", required = true)
    private RetentionPolicy retentionPolicy;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the LogProfileResourcePatch object itself.
     */
    public LogProfileResourcePatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the resource id of the storage account to which you would like to send the Activity Log.
     *
     * @return the storageAccountId value
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the resource id of the storage account to which you would like to send the Activity Log.
     *
     * @param storageAccountId the storageAccountId value to set
     * @return the LogProfileResourcePatch object itself.
     */
    public LogProfileResourcePatch withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the service bus rule ID of the service bus namespace in which you would like to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: '{service bus resource ID}/authorizationrules/{key name}'.
     *
     * @return the serviceBusRuleId value
     */
    public String serviceBusRuleId() {
        return this.serviceBusRuleId;
    }

    /**
     * Set the service bus rule ID of the service bus namespace in which you would like to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: '{service bus resource ID}/authorizationrules/{key name}'.
     *
     * @param serviceBusRuleId the serviceBusRuleId value to set
     * @return the LogProfileResourcePatch object itself.
     */
    public LogProfileResourcePatch withServiceBusRuleId(String serviceBusRuleId) {
        this.serviceBusRuleId = serviceBusRuleId;
        return this;
    }

    /**
     * Get list of regions for which Activity Log events should be stored or streamed. It is a comma separated list of valid ARM locations including the 'global' location.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set list of regions for which Activity Log events should be stored or streamed. It is a comma separated list of valid ARM locations including the 'global' location.
     *
     * @param locations the locations value to set
     * @return the LogProfileResourcePatch object itself.
     */
    public LogProfileResourcePatch withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the categories of the logs. These categories are created as is convenient to the user. Some values are: 'Write', 'Delete', and/or 'Action.'.
     *
     * @return the categories value
     */
    public List<String> categories() {
        return this.categories;
    }

    /**
     * Set the categories of the logs. These categories are created as is convenient to the user. Some values are: 'Write', 'Delete', and/or 'Action.'.
     *
     * @param categories the categories value to set
     * @return the LogProfileResourcePatch object itself.
     */
    public LogProfileResourcePatch withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the retention policy for the events in the log.
     *
     * @return the retentionPolicy value
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retention policy for the events in the log.
     *
     * @param retentionPolicy the retentionPolicy value to set
     * @return the LogProfileResourcePatch object itself.
     */
    public LogProfileResourcePatch withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

}
