/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2017_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * (Optional) The ID of the parent management group.
 */
public class ParentGroupInfo {
    /**
     * The fully qualified ID for the parent management group.  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "parentId")
    private String parentId;

    /**
     * The friendly name of the parent management group.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the parentId value
     */
    public String parentId() {
        return this.parentId;
    }

    /**
     * Set the fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @param parentId the parentId value to set
     * @return the ParentGroupInfo object itself.
     */
    public ParentGroupInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Get the friendly name of the parent management group.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the parent management group.
     *
     * @param displayName the displayName value to set
     * @return the ParentGroupInfo object itself.
     */
    public ParentGroupInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
