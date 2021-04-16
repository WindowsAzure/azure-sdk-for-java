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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
 * entity types.
 */
@Fluent
public class MicrosoftGraphPolicyBase extends MicrosoftGraphDirectoryObjectInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphPolicyBase.class);

    /*
     * Description for this policy.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Display name for this policy.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the description property: Description for this policy.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for this policy.
     *
     * @param description the description value to set.
     * @return the MicrosoftGraphPolicyBase object itself.
     */
    public MicrosoftGraphPolicyBase withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: Display name for this policy.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for this policy.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphPolicyBase object itself.
     */
    public MicrosoftGraphPolicyBase withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPolicyBase object itself.
     */
    public MicrosoftGraphPolicyBase withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphPolicyBase withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphPolicyBase withId(String id) {
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
    }
}
