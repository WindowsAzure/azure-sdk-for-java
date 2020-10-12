/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18.implementation;

import com.microsoft.azure.management.kusto.v2020_09_18.DatabasePrincipalRole;
import com.microsoft.azure.management.kusto.v2020_09_18.PrincipalType;
import com.microsoft.azure.management.kusto.v2020_09_18.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Class representing a database principal assignment.
 */
@JsonFlatten
public class DatabasePrincipalAssignmentInner extends ProxyResource {
    /**
     * The principal ID assigned to the database principal. It can be a user
     * email, application ID, or security group name.
     */
    @JsonProperty(value = "properties.principalId", required = true)
    private String principalId;

    /**
     * Database principal role. Possible values include: 'Admin', 'Ingestor',
     * 'Monitor', 'User', 'UnrestrictedViewers', 'Viewer'.
     */
    @JsonProperty(value = "properties.role", required = true)
    private DatabasePrincipalRole role;

    /**
     * The tenant id of the principal.
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /**
     * Principal type. Possible values include: 'App', 'Group', 'User'.
     */
    @JsonProperty(value = "properties.principalType", required = true)
    private PrincipalType principalType;

    /**
     * The tenant name of the principal.
     */
    @JsonProperty(value = "properties.tenantName", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantName;

    /**
     * The principal name.
     */
    @JsonProperty(value = "properties.principalName", access = JsonProperty.Access.WRITE_ONLY)
    private String principalName;

    /**
     * The provisioned state of the resource. Possible values include:
     * 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Moving'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     *
     * @param principalId the principalId value to set
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get database principal role. Possible values include: 'Admin', 'Ingestor', 'Monitor', 'User', 'UnrestrictedViewers', 'Viewer'.
     *
     * @return the role value
     */
    public DatabasePrincipalRole role() {
        return this.role;
    }

    /**
     * Set database principal role. Possible values include: 'Admin', 'Ingestor', 'Monitor', 'User', 'UnrestrictedViewers', 'Viewer'.
     *
     * @param role the role value to set
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withRole(DatabasePrincipalRole role) {
        this.role = role;
        return this;
    }

    /**
     * Get the tenant id of the principal.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenant id of the principal.
     *
     * @param tenantId the tenantId value to set
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get principal type. Possible values include: 'App', 'Group', 'User'.
     *
     * @return the principalType value
     */
    public PrincipalType principalType() {
        return this.principalType;
    }

    /**
     * Set principal type. Possible values include: 'App', 'Group', 'User'.
     *
     * @param principalType the principalType value to set
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get the tenant name of the principal.
     *
     * @return the tenantName value
     */
    public String tenantName() {
        return this.tenantName;
    }

    /**
     * Get the principal name.
     *
     * @return the principalName value
     */
    public String principalName() {
        return this.principalName;
    }

    /**
     * Get the provisioned state of the resource. Possible values include: 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Moving'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

}
