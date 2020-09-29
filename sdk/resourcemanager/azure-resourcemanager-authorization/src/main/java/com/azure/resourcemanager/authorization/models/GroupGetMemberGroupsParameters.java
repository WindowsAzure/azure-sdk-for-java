// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Request parameters for GetMemberGroups API call. */
@Fluent
public final class GroupGetMemberGroupsParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GroupGetMemberGroupsParameters.class);

    /*
     * If true, only membership in security-enabled groups should be checked.
     * Otherwise, membership in all groups should be checked.
     */
    @JsonProperty(value = "securityEnabledOnly", required = true)
    private boolean securityEnabledOnly;

    /*
     * Request parameters for GetMemberGroups API call.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the securityEnabledOnly property: If true, only membership in security-enabled groups should be checked.
     * Otherwise, membership in all groups should be checked.
     *
     * @return the securityEnabledOnly value.
     */
    public boolean securityEnabledOnly() {
        return this.securityEnabledOnly;
    }

    /**
     * Set the securityEnabledOnly property: If true, only membership in security-enabled groups should be checked.
     * Otherwise, membership in all groups should be checked.
     *
     * @param securityEnabledOnly the securityEnabledOnly value to set.
     * @return the GroupGetMemberGroupsParameters object itself.
     */
    public GroupGetMemberGroupsParameters withSecurityEnabledOnly(boolean securityEnabledOnly) {
        this.securityEnabledOnly = securityEnabledOnly;
        return this;
    }

    /**
     * Get the additionalProperties property: Request parameters for GetMemberGroups API call.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Request parameters for GetMemberGroups API call.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the GroupGetMemberGroupsParameters object itself.
     */
    public GroupGetMemberGroupsParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
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
