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
import java.util.Map;

/** settingSource. */
@Fluent
public final class MicrosoftGraphSettingSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphSettingSource.class);

    /*
     * Not yet documented
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Not yet documented
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * settingSource
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the displayName property: Not yet documented.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Not yet documented.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphSettingSource object itself.
     */
    public MicrosoftGraphSettingSource withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the id property: Not yet documented.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Not yet documented.
     *
     * @param id the id value to set.
     * @return the MicrosoftGraphSettingSource object itself.
     */
    public MicrosoftGraphSettingSource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the additionalProperties property: settingSource.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: settingSource.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSettingSource object itself.
     */
    public MicrosoftGraphSettingSource withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
