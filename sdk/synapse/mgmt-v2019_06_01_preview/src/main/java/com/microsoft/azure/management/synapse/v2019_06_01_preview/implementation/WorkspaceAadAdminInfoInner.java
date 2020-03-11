/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Workspace active directory administrator.
 */
@JsonFlatten
public class WorkspaceAadAdminInfoInner extends ProxyResource {
    /**
     * Tenant ID of the workspace active directory administrator.
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /**
     * Login of the workspace active directory administrator.
     */
    @JsonProperty(value = "properties.login")
    private String login;

    /**
     * Workspace active directory administrator type.
     */
    @JsonProperty(value = "properties.administratorType")
    private String administratorType;

    /**
     * Object ID of the workspace active directory administrator.
     */
    @JsonProperty(value = "properties.sid")
    private String sid;

    /**
     * Get tenant ID of the workspace active directory administrator.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set tenant ID of the workspace active directory administrator.
     *
     * @param tenantId the tenantId value to set
     * @return the WorkspaceAadAdminInfoInner object itself.
     */
    public WorkspaceAadAdminInfoInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get login of the workspace active directory administrator.
     *
     * @return the login value
     */
    public String login() {
        return this.login;
    }

    /**
     * Set login of the workspace active directory administrator.
     *
     * @param login the login value to set
     * @return the WorkspaceAadAdminInfoInner object itself.
     */
    public WorkspaceAadAdminInfoInner withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get workspace active directory administrator type.
     *
     * @return the administratorType value
     */
    public String administratorType() {
        return this.administratorType;
    }

    /**
     * Set workspace active directory administrator type.
     *
     * @param administratorType the administratorType value to set
     * @return the WorkspaceAadAdminInfoInner object itself.
     */
    public WorkspaceAadAdminInfoInner withAdministratorType(String administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get object ID of the workspace active directory administrator.
     *
     * @return the sid value
     */
    public String sid() {
        return this.sid;
    }

    /**
     * Set object ID of the workspace active directory administrator.
     *
     * @param sid the sid value to set
     * @return the WorkspaceAadAdminInfoInner object itself.
     */
    public WorkspaceAadAdminInfoInner withSid(String sid) {
        this.sid = sid;
        return this;
    }

}
