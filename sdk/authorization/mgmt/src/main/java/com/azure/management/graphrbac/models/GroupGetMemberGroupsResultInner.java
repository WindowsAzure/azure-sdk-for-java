// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The GroupGetMemberGroupsResult model.
 */
@Fluent
public final class GroupGetMemberGroupsResultInner {
    /*
     * A collection of group IDs of which the group is a member.
     */
    @JsonProperty(value = "value")
    private List<String> value;

    /**
     * Get the value property: A collection of group IDs of which the group is
     * a member.
     * 
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of group IDs of which the group is
     * a member.
     * 
     * @param value the value value to set.
     * @return the GroupGetMemberGroupsResultInner object itself.
     */
    public GroupGetMemberGroupsResultInner withValue(List<String> value) {
        this.value = value;
        return this;
    }
}
