// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The CheckGroupMembershipResult model. */
@Fluent
public final class CheckGroupMembershipResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckGroupMembershipResultInner.class);

    /*
     * True if the specified user, group, contact, or service principal has
     * either direct or transitive membership in the specified group;
     * otherwise, false.
     */
    @JsonProperty(value = "value")
    private Boolean value;

    /*
     * Server response for IsMemberOf API call
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the value property: True if the specified user, group, contact, or service principal has either direct or
     * transitive membership in the specified group; otherwise, false.
     *
     * @return the value value.
     */
    public Boolean value() {
        return this.value;
    }

    /**
     * Set the value property: True if the specified user, group, contact, or service principal has either direct or
     * transitive membership in the specified group; otherwise, false.
     *
     * @param value the value value to set.
     * @return the CheckGroupMembershipResultInner object itself.
     */
    public CheckGroupMembershipResultInner withValue(Boolean value) {
        this.value = value;
        return this;
    }

    /**
     * Get the additionalProperties property: Server response for IsMemberOf API call.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Server response for IsMemberOf API call.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the CheckGroupMembershipResultInner object itself.
     */
    public CheckGroupMembershipResultInner withAdditionalProperties(Map<String, Object> additionalProperties) {
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
