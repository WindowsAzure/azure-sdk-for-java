// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The CheckGroupMembershipResult model.
 */
@Fluent
public final class CheckGroupMembershipResultInner {
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
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Get the value property: True if the specified user, group, contact, or
     * service principal has either direct or transitive membership in the
     * specified group; otherwise, false.
     * 
     * @return the value value.
     */
    public Boolean isValue() {
        return this.value;
    }

    /**
     * Set the value property: True if the specified user, group, contact, or
     * service principal has either direct or transitive membership in the
     * specified group; otherwise, false.
     * 
     * @param value the value value to set.
     * @return the CheckGroupMembershipResultInner object itself.
     */
    public CheckGroupMembershipResultInner setValue(Boolean value) {
        this.value = value;
        return this;
    }

    /**
     * Get the additionalProperties property: Server response for IsMemberOf
     * API call.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Server response for IsMemberOf
     * API call.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the CheckGroupMembershipResultInner object itself.
     */
    public CheckGroupMembershipResultInner setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
}
