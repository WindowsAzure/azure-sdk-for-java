// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.FlowLogFormatParameters;
import com.azure.resourcemanager.network.models.RetentionPolicyParameters;
import com.azure.resourcemanager.network.models.TrafficAnalyticsProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FlowLogInformation model. */
@JsonFlatten
@Fluent
public class FlowLogInformationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FlowLogInformationInner.class);

    /*
     * The ID of the resource to configure for flow log and traffic analytics
     * (optional) .
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /*
     * Parameters that define the configuration of traffic analytics.
     */
    @JsonProperty(value = "flowAnalyticsConfiguration")
    private TrafficAnalyticsProperties flowAnalyticsConfiguration;

    /*
     * ID of the storage account which is used to store the flow log.
     */
    @JsonProperty(value = "properties.storageId", required = true)
    private String storageId;

    /*
     * Flag to enable/disable flow logging.
     */
    @JsonProperty(value = "properties.enabled", required = true)
    private boolean enabled;

    /*
     * Parameters that define the retention policy for flow log.
     */
    @JsonProperty(value = "properties.retentionPolicy")
    private RetentionPolicyParameters retentionPolicy;

    /*
     * Parameters that define the flow log format.
     */
    @JsonProperty(value = "properties.format")
    private FlowLogFormatParameters format;

    /**
     * Get the targetResourceId property: The ID of the resource to configure for flow log and traffic analytics
     * (optional) .
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The ID of the resource to configure for flow log and traffic analytics
     * (optional) .
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     *
     * @return the flowAnalyticsConfiguration value.
     */
    public TrafficAnalyticsProperties flowAnalyticsConfiguration() {
        return this.flowAnalyticsConfiguration;
    }

    /**
     * Set the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     *
     * @param flowAnalyticsConfiguration the flowAnalyticsConfiguration value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withFlowAnalyticsConfiguration(
        TrafficAnalyticsProperties flowAnalyticsConfiguration) {
        this.flowAnalyticsConfiguration = flowAnalyticsConfiguration;
        return this;
    }

    /**
     * Get the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @return the storageId value.
     */
    public String storageId() {
        return this.storageId;
    }

    /**
     * Set the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @param storageId the storageId value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * Get the enabled property: Flag to enable/disable flow logging.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Flag to enable/disable flow logging.
     *
     * @param enabled the enabled value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicyParameters retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withRetentionPolicy(RetentionPolicyParameters retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get the format property: Parameters that define the flow log format.
     *
     * @return the format value.
     */
    public FlowLogFormatParameters format() {
        return this.format;
    }

    /**
     * Set the format property: Parameters that define the flow log format.
     *
     * @param format the format value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withFormat(FlowLogFormatParameters format) {
        this.format = format;
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
                        "Missing required property targetResourceId in model FlowLogInformationInner"));
        }
        if (flowAnalyticsConfiguration() != null) {
            flowAnalyticsConfiguration().validate();
        }
        if (storageId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageId in model FlowLogInformationInner"));
        }
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
        if (format() != null) {
            format().validate();
        }
    }
}
