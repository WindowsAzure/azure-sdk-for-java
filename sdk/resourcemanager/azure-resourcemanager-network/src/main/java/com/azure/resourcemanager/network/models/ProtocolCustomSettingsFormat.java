// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DDoS custom policy properties. */
@Fluent
public final class ProtocolCustomSettingsFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtocolCustomSettingsFormat.class);

    /*
     * The protocol for which the DDoS protection policy is being customized.
     */
    @JsonProperty(value = "protocol")
    private DdosCustomPolicyProtocol protocol;

    /*
     * The customized DDoS protection trigger rate.
     */
    @JsonProperty(value = "triggerRateOverride")
    private String triggerRateOverride;

    /*
     * The customized DDoS protection source rate.
     */
    @JsonProperty(value = "sourceRateOverride")
    private String sourceRateOverride;

    /*
     * The customized DDoS protection trigger rate sensitivity degrees. High:
     * Trigger rate set with most sensitivity w.r.t. normal traffic. Default:
     * Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low:
     * Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed:
     * Trigger rate set with least sensitivity w.r.t. normal traffic.
     */
    @JsonProperty(value = "triggerSensitivityOverride")
    private DdosCustomPolicyTriggerSensitivityOverride triggerSensitivityOverride;

    /**
     * Get the protocol property: The protocol for which the DDoS protection policy is being customized.
     *
     * @return the protocol value.
     */
    public DdosCustomPolicyProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol for which the DDoS protection policy is being customized.
     *
     * @param protocol the protocol value to set.
     * @return the ProtocolCustomSettingsFormat object itself.
     */
    public ProtocolCustomSettingsFormat withProtocol(DdosCustomPolicyProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the triggerRateOverride property: The customized DDoS protection trigger rate.
     *
     * @return the triggerRateOverride value.
     */
    public String triggerRateOverride() {
        return this.triggerRateOverride;
    }

    /**
     * Set the triggerRateOverride property: The customized DDoS protection trigger rate.
     *
     * @param triggerRateOverride the triggerRateOverride value to set.
     * @return the ProtocolCustomSettingsFormat object itself.
     */
    public ProtocolCustomSettingsFormat withTriggerRateOverride(String triggerRateOverride) {
        this.triggerRateOverride = triggerRateOverride;
        return this;
    }

    /**
     * Get the sourceRateOverride property: The customized DDoS protection source rate.
     *
     * @return the sourceRateOverride value.
     */
    public String sourceRateOverride() {
        return this.sourceRateOverride;
    }

    /**
     * Set the sourceRateOverride property: The customized DDoS protection source rate.
     *
     * @param sourceRateOverride the sourceRateOverride value to set.
     * @return the ProtocolCustomSettingsFormat object itself.
     */
    public ProtocolCustomSettingsFormat withSourceRateOverride(String sourceRateOverride) {
        this.sourceRateOverride = sourceRateOverride;
        return this;
    }

    /**
     * Get the triggerSensitivityOverride property: The customized DDoS protection trigger rate sensitivity degrees.
     * High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate
     * sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed:
     * Trigger rate set with least sensitivity w.r.t. normal traffic.
     *
     * @return the triggerSensitivityOverride value.
     */
    public DdosCustomPolicyTriggerSensitivityOverride triggerSensitivityOverride() {
        return this.triggerSensitivityOverride;
    }

    /**
     * Set the triggerSensitivityOverride property: The customized DDoS protection trigger rate sensitivity degrees.
     * High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate
     * sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed:
     * Trigger rate set with least sensitivity w.r.t. normal traffic.
     *
     * @param triggerSensitivityOverride the triggerSensitivityOverride value to set.
     * @return the ProtocolCustomSettingsFormat object itself.
     */
    public ProtocolCustomSettingsFormat withTriggerSensitivityOverride(
        DdosCustomPolicyTriggerSensitivityOverride triggerSensitivityOverride) {
        this.triggerSensitivityOverride = triggerSensitivityOverride;
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
