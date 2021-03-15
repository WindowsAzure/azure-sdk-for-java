// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Set of rules for sending logs for the Monitor resource. */
@Fluent
public final class LogRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LogRules.class);

    /*
     * Flag specifying if AAD logs should be sent for the Monitor resource.
     */
    @JsonProperty(value = "sendAadLogs")
    private Boolean sendAadLogs;

    /*
     * Flag specifying if subscription logs should be sent for the Monitor
     * resource.
     */
    @JsonProperty(value = "sendSubscriptionLogs")
    private Boolean sendSubscriptionLogs;

    /*
     * Flag specifying if activity logs from Azure resources should be sent for
     * the Monitor resource.
     */
    @JsonProperty(value = "sendActivityLogs")
    private Boolean sendActivityLogs;

    /*
     * List of filtering tags to be used for capturing logs. This only takes
     * effect if SendActivityLogs flag is enabled. If empty, all resources will
     * be captured. If only Exclude action is specified, the rules will apply
     * to the list of all available resources. If Include actions are
     * specified, the rules will only include resources with the associated
     * tags.
     */
    @JsonProperty(value = "filteringTags")
    private List<FilteringTag> filteringTags;

    /**
     * Get the sendAadLogs property: Flag specifying if AAD logs should be sent for the Monitor resource.
     *
     * @return the sendAadLogs value.
     */
    public Boolean sendAadLogs() {
        return this.sendAadLogs;
    }

    /**
     * Set the sendAadLogs property: Flag specifying if AAD logs should be sent for the Monitor resource.
     *
     * @param sendAadLogs the sendAadLogs value to set.
     * @return the LogRules object itself.
     */
    public LogRules withSendAadLogs(Boolean sendAadLogs) {
        this.sendAadLogs = sendAadLogs;
        return this;
    }

    /**
     * Get the sendSubscriptionLogs property: Flag specifying if subscription logs should be sent for the Monitor
     * resource.
     *
     * @return the sendSubscriptionLogs value.
     */
    public Boolean sendSubscriptionLogs() {
        return this.sendSubscriptionLogs;
    }

    /**
     * Set the sendSubscriptionLogs property: Flag specifying if subscription logs should be sent for the Monitor
     * resource.
     *
     * @param sendSubscriptionLogs the sendSubscriptionLogs value to set.
     * @return the LogRules object itself.
     */
    public LogRules withSendSubscriptionLogs(Boolean sendSubscriptionLogs) {
        this.sendSubscriptionLogs = sendSubscriptionLogs;
        return this;
    }

    /**
     * Get the sendActivityLogs property: Flag specifying if activity logs from Azure resources should be sent for the
     * Monitor resource.
     *
     * @return the sendActivityLogs value.
     */
    public Boolean sendActivityLogs() {
        return this.sendActivityLogs;
    }

    /**
     * Set the sendActivityLogs property: Flag specifying if activity logs from Azure resources should be sent for the
     * Monitor resource.
     *
     * @param sendActivityLogs the sendActivityLogs value to set.
     * @return the LogRules object itself.
     */
    public LogRules withSendActivityLogs(Boolean sendActivityLogs) {
        this.sendActivityLogs = sendActivityLogs;
        return this;
    }

    /**
     * Get the filteringTags property: List of filtering tags to be used for capturing logs. This only takes effect if
     * SendActivityLogs flag is enabled. If empty, all resources will be captured. If only Exclude action is specified,
     * the rules will apply to the list of all available resources. If Include actions are specified, the rules will
     * only include resources with the associated tags.
     *
     * @return the filteringTags value.
     */
    public List<FilteringTag> filteringTags() {
        return this.filteringTags;
    }

    /**
     * Set the filteringTags property: List of filtering tags to be used for capturing logs. This only takes effect if
     * SendActivityLogs flag is enabled. If empty, all resources will be captured. If only Exclude action is specified,
     * the rules will apply to the list of all available resources. If Include actions are specified, the rules will
     * only include resources with the associated tags.
     *
     * @param filteringTags the filteringTags value to set.
     * @return the LogRules object itself.
     */
    public LogRules withFilteringTags(List<FilteringTag> filteringTags) {
        this.filteringTags = filteringTags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filteringTags() != null) {
            filteringTags().forEach(e -> e.validate());
        }
    }
}
