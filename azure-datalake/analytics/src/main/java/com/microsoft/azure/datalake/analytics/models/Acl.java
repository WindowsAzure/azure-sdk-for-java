/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog access control list (ACL) entry.
 */
public class Acl {
    /**
     * the access control list (ACL) entry type. UserObj and GroupObj denote
     * the owning user and group, respectively. Possible values include:
     * 'UserObj', 'GroupObj', 'Other', 'User', 'Group'.
     */
    @JsonProperty(value = "aceType", access = JsonProperty.Access.WRITE_ONLY)
    private AclType aceType;

    /**
     * the Azure AD object ID of the user or group being specified in the
     * access control list (ACL) entry.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /**
     * the permission type of the access control list (ACL) entry. Possible
     * values include: 'None', 'Use', 'Create', 'Drop', 'Alter', 'Write',
     * 'All'.
     */
    @JsonProperty(value = "permission", access = JsonProperty.Access.WRITE_ONLY)
    private PermissionType permission;

    /**
     * Get the access control list (ACL) entry type. UserObj and GroupObj denote the owning user and group, respectively. Possible values include: 'UserObj', 'GroupObj', 'Other', 'User', 'Group'.
     *
     * @return the aceType value
     */
    public AclType aceType() {
        return this.aceType;
    }

    /**
     * Get the Azure AD object ID of the user or group being specified in the access control list (ACL) entry.
     *
     * @return the principalId value
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the permission type of the access control list (ACL) entry. Possible values include: 'None', 'Use', 'Create', 'Drop', 'Alter', 'Write', 'All'.
     *
     * @return the permission value
     */
    public PermissionType permission() {
        return this.permission;
    }

}
