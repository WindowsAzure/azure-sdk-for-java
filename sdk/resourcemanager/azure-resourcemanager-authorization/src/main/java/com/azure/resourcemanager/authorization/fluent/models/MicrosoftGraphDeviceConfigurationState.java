// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Device Configuration State for a given device. */
@Fluent
public final class MicrosoftGraphDeviceConfigurationState extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphDeviceConfigurationState.class);

    /*
     * The name of the policy for this policyBase
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The platformType property.
     */
    @JsonProperty(value = "platformType")
    private MicrosoftGraphPolicyPlatformType platformType;

    /*
     * Count of how many setting a policy holds
     */
    @JsonProperty(value = "settingCount")
    private Integer settingCount;

    /*
     * The settingStates property.
     */
    @JsonProperty(value = "settingStates")
    private List<MicrosoftGraphDeviceConfigurationSettingState> settingStates;

    /*
     * The state property.
     */
    @JsonProperty(value = "state")
    private MicrosoftGraphComplianceStatus state;

    /*
     * The version of the policy
     */
    @JsonProperty(value = "version")
    private Integer version;

    /*
     * Device Configuration State for a given device.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the displayName property: The name of the policy for this policyBase.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the policy for this policyBase.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphDeviceConfigurationState object itself.
     */
    public MicrosoftGraphDeviceConfigurationState withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the platformType property: The platformType property.
     *
     * @return the platformType value.
     */
    public MicrosoftGraphPolicyPlatformType platformType() {
        return this.platformType;
    }

    /**
     * Set the platformType property: The platformType property.
     *
     * @param platformType the platformType value to set.
     * @return the MicrosoftGraphDeviceConfigurationState object itself.
     */
    public MicrosoftGraphDeviceConfigurationState withPlatformType(MicrosoftGraphPolicyPlatformType platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * Get the settingCount property: Count of how many setting a policy holds.
     *
     * @return the settingCount value.
     */
    public Integer settingCount() {
        return this.settingCount;
    }

    /**
     * Set the settingCount property: Count of how many setting a policy holds.
     *
     * @param settingCount the settingCount value to set.
     * @return the MicrosoftGraphDeviceConfigurationState object itself.
     */
    public MicrosoftGraphDeviceConfigurationState withSettingCount(Integer settingCount) {
        this.settingCount = settingCount;
        return this;
    }

    /**
     * Get the settingStates property: The settingStates property.
     *
     * @return the settingStates value.
     */
    public List<MicrosoftGraphDeviceConfigurationSettingState> settingStates() {
        return this.settingStates;
    }

    /**
     * Set the settingStates property: The settingStates property.
     *
     * @param settingStates the settingStates value to set.
     * @return the MicrosoftGraphDeviceConfigurationState object itself.
     */
    public MicrosoftGraphDeviceConfigurationState withSettingStates(
        List<MicrosoftGraphDeviceConfigurationSettingState> settingStates) {
        this.settingStates = settingStates;
        return this;
    }

    /**
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    public MicrosoftGraphComplianceStatus state() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     *
     * @param state the state value to set.
     * @return the MicrosoftGraphDeviceConfigurationState object itself.
     */
    public MicrosoftGraphDeviceConfigurationState withState(MicrosoftGraphComplianceStatus state) {
        this.state = state;
        return this;
    }

    /**
     * Get the version property: The version of the policy.
     *
     * @return the version value.
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Set the version property: The version of the policy.
     *
     * @param version the version value to set.
     * @return the MicrosoftGraphDeviceConfigurationState object itself.
     */
    public MicrosoftGraphDeviceConfigurationState withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * Get the additionalProperties property: Device Configuration State for a given device.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Device Configuration State for a given device.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDeviceConfigurationState object itself.
     */
    public MicrosoftGraphDeviceConfigurationState withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDeviceConfigurationState withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (settingStates() != null) {
            settingStates().forEach(e -> e.validate());
        }
    }
}
