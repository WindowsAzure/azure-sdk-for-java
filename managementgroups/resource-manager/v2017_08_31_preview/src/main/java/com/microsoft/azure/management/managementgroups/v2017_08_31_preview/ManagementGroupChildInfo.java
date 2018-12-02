/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2017_08_31_preview;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The unique identifier (ID) of a management group.
 */
public class ManagementGroupChildInfo {
    /**
     * Management Group Child Info.
     * Possible values include: 'Enrollment', 'Department', 'Account',
     * 'Subscription'.
     */
    @JsonProperty(value = "childType")
    private String childType;

    /**
     * The ID of the child resource (management group or subscription). E.g.
     * /providers/Microsoft.Management/managementGroups/40000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "childId")
    private String childId;

    /**
     * The friendly name of the child resource.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * (Optional) The AAD Tenant ID associated with the child resource.
     */
    @JsonProperty(value = "tenantId")
    private UUID tenantId;

    /**
     * Get possible values include: 'Enrollment', 'Department', 'Account', 'Subscription'.
     *
     * @return the childType value
     */
    public String childType() {
        return this.childType;
    }

    /**
     * Set possible values include: 'Enrollment', 'Department', 'Account', 'Subscription'.
     *
     * @param childType the childType value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withChildType(String childType) {
        this.childType = childType;
        return this;
    }

    /**
     * Get the ID of the child resource (management group or subscription). E.g. /providers/Microsoft.Management/managementGroups/40000000-0000-0000-0000-000000000000.
     *
     * @return the childId value
     */
    public String childId() {
        return this.childId;
    }

    /**
     * Set the ID of the child resource (management group or subscription). E.g. /providers/Microsoft.Management/managementGroups/40000000-0000-0000-0000-000000000000.
     *
     * @param childId the childId value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withChildId(String childId) {
        this.childId = childId;
        return this;
    }

    /**
     * Get the friendly name of the child resource.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the child resource.
     *
     * @param displayName the displayName value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get (Optional) The AAD Tenant ID associated with the child resource.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set (Optional) The AAD Tenant ID associated with the child resource.
     *
     * @param tenantId the tenantId value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

}
