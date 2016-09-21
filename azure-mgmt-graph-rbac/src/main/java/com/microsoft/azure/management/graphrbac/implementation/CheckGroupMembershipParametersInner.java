/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request parameters for IsMemberOf API call.
 */
public class CheckGroupMembershipParametersInner {
    /**
     * The object ID of the group to check.
     */
    @JsonProperty(required = true)
    private String groupId;

    /**
     * The object ID of the contact, group, user, or service principal to
     * check for membership in the specified group.
     */
    @JsonProperty(required = true)
    private String memberId;

    /**
     * Get the groupId value.
     *
     * @return the groupId value
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId value.
     *
     * @param groupId the groupId value to set
     * @return the CheckGroupMembershipParametersInner object itself.
     */
    public CheckGroupMembershipParametersInner withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the memberId value.
     *
     * @return the memberId value
     */
    public String memberId() {
        return this.memberId;
    }

    /**
     * Set the memberId value.
     *
     * @param memberId the memberId value to set
     * @return the CheckGroupMembershipParametersInner object itself.
     */
    public CheckGroupMembershipParametersInner withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

}
