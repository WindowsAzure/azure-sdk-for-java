// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Workspace active directory administrator. */
@JsonFlatten
@Fluent
public class WorkspaceAadAdminInfoInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceAadAdminInfoInner.class);

    /*
     * Tenant ID of the workspace active directory administrator
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /*
     * Login of the workspace active directory administrator
     */
    @JsonProperty(value = "properties.login")
    private String login;

    /*
     * Workspace active directory administrator type
     */
    @JsonProperty(value = "properties.administratorType")
    private String administratorType;

    /*
     * Object ID of the workspace active directory administrator
     */
    @JsonProperty(value = "properties.sid")
    private String sid;

    /**
     * Get the tenantId property: Tenant ID of the workspace active directory administrator.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant ID of the workspace active directory administrator.
     *
     * @param tenantId the tenantId value to set.
     * @return the WorkspaceAadAdminInfoInner object itself.
     */
    public WorkspaceAadAdminInfoInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the login property: Login of the workspace active directory administrator.
     *
     * @return the login value.
     */
    public String login() {
        return this.login;
    }

    /**
     * Set the login property: Login of the workspace active directory administrator.
     *
     * @param login the login value to set.
     * @return the WorkspaceAadAdminInfoInner object itself.
     */
    public WorkspaceAadAdminInfoInner withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the administratorType property: Workspace active directory administrator type.
     *
     * @return the administratorType value.
     */
    public String administratorType() {
        return this.administratorType;
    }

    /**
     * Set the administratorType property: Workspace active directory administrator type.
     *
     * @param administratorType the administratorType value to set.
     * @return the WorkspaceAadAdminInfoInner object itself.
     */
    public WorkspaceAadAdminInfoInner withAdministratorType(String administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get the sid property: Object ID of the workspace active directory administrator.
     *
     * @return the sid value.
     */
    public String sid() {
        return this.sid;
    }

    /**
     * Set the sid property: Object ID of the workspace active directory administrator.
     *
     * @param sid the sid value to set.
     * @return the WorkspaceAadAdminInfoInner object itself.
     */
    public WorkspaceAadAdminInfoInner withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
