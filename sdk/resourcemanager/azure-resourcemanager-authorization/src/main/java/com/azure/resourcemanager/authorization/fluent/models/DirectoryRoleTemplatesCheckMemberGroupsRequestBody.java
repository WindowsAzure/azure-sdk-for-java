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

/** The DirectoryRoleTemplatesCheckMemberGroupsRequestBody model. */
@Fluent
public final class DirectoryRoleTemplatesCheckMemberGroupsRequestBody {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(DirectoryRoleTemplatesCheckMemberGroupsRequestBody.class);

    /*
     * The groupIds property.
     */
    @JsonProperty(value = "groupIds")
    private List<String> groupIds;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the groupIds property: The groupIds property.
     *
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Set the groupIds property: The groupIds property.
     *
     * @param groupIds the groupIds value to set.
     * @return the DirectoryRoleTemplatesCheckMemberGroupsRequestBody object itself.
     */
    public DirectoryRoleTemplatesCheckMemberGroupsRequestBody withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the DirectoryRoleTemplatesCheckMemberGroupsRequestBody object itself.
     */
    public DirectoryRoleTemplatesCheckMemberGroupsRequestBody withAdditionalProperties(
        Map<String, Object> additionalProperties) {
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
