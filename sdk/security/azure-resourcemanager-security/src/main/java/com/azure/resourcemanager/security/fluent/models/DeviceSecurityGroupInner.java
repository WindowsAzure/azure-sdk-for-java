// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.AllowlistCustomAlertRule;
import com.azure.resourcemanager.security.models.DenylistCustomAlertRule;
import com.azure.resourcemanager.security.models.ThresholdCustomAlertRule;
import com.azure.resourcemanager.security.models.TimeWindowCustomAlertRule;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The device security group resource. */
@JsonFlatten
@Fluent
public class DeviceSecurityGroupInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeviceSecurityGroupInner.class);

    /*
     * The list of custom alert threshold rules.
     */
    @JsonProperty(value = "properties.thresholdRules")
    private List<ThresholdCustomAlertRule> thresholdRules;

    /*
     * The list of custom alert time-window rules.
     */
    @JsonProperty(value = "properties.timeWindowRules")
    private List<TimeWindowCustomAlertRule> timeWindowRules;

    /*
     * The allow-list custom alert rules.
     */
    @JsonProperty(value = "properties.allowlistRules")
    private List<AllowlistCustomAlertRule> allowlistRules;

    /*
     * The deny-list custom alert rules.
     */
    @JsonProperty(value = "properties.denylistRules")
    private List<DenylistCustomAlertRule> denylistRules;

    /**
     * Get the thresholdRules property: The list of custom alert threshold rules.
     *
     * @return the thresholdRules value.
     */
    public List<ThresholdCustomAlertRule> thresholdRules() {
        return this.thresholdRules;
    }

    /**
     * Set the thresholdRules property: The list of custom alert threshold rules.
     *
     * @param thresholdRules the thresholdRules value to set.
     * @return the DeviceSecurityGroupInner object itself.
     */
    public DeviceSecurityGroupInner withThresholdRules(List<ThresholdCustomAlertRule> thresholdRules) {
        this.thresholdRules = thresholdRules;
        return this;
    }

    /**
     * Get the timeWindowRules property: The list of custom alert time-window rules.
     *
     * @return the timeWindowRules value.
     */
    public List<TimeWindowCustomAlertRule> timeWindowRules() {
        return this.timeWindowRules;
    }

    /**
     * Set the timeWindowRules property: The list of custom alert time-window rules.
     *
     * @param timeWindowRules the timeWindowRules value to set.
     * @return the DeviceSecurityGroupInner object itself.
     */
    public DeviceSecurityGroupInner withTimeWindowRules(List<TimeWindowCustomAlertRule> timeWindowRules) {
        this.timeWindowRules = timeWindowRules;
        return this;
    }

    /**
     * Get the allowlistRules property: The allow-list custom alert rules.
     *
     * @return the allowlistRules value.
     */
    public List<AllowlistCustomAlertRule> allowlistRules() {
        return this.allowlistRules;
    }

    /**
     * Set the allowlistRules property: The allow-list custom alert rules.
     *
     * @param allowlistRules the allowlistRules value to set.
     * @return the DeviceSecurityGroupInner object itself.
     */
    public DeviceSecurityGroupInner withAllowlistRules(List<AllowlistCustomAlertRule> allowlistRules) {
        this.allowlistRules = allowlistRules;
        return this;
    }

    /**
     * Get the denylistRules property: The deny-list custom alert rules.
     *
     * @return the denylistRules value.
     */
    public List<DenylistCustomAlertRule> denylistRules() {
        return this.denylistRules;
    }

    /**
     * Set the denylistRules property: The deny-list custom alert rules.
     *
     * @param denylistRules the denylistRules value to set.
     * @return the DeviceSecurityGroupInner object itself.
     */
    public DeviceSecurityGroupInner withDenylistRules(List<DenylistCustomAlertRule> denylistRules) {
        this.denylistRules = denylistRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (thresholdRules() != null) {
            thresholdRules().forEach(e -> e.validate());
        }
        if (timeWindowRules() != null) {
            timeWindowRules().forEach(e -> e.validate());
        }
        if (allowlistRules() != null) {
            allowlistRules().forEach(e -> e.validate());
        }
        if (denylistRules() != null) {
            denylistRules().forEach(e -> e.validate());
        }
    }
}
