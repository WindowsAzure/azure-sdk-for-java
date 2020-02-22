/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview.implementation;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Azure Active Directory administrator.
 */
@JsonFlatten
public class ServerAzureADAdministratorInner extends ProxyResource {
    /**
     * Type of the sever administrator.
     */
    @JsonProperty(value = "properties.administratorType", required = true)
    private String administratorType;

    /**
     * Login name of the server administrator.
     */
    @JsonProperty(value = "properties.login", required = true)
    private String login;

    /**
     * SID (object ID) of the server administrator.
     */
    @JsonProperty(value = "properties.sid", required = true)
    private UUID sid;

    /**
     * Tenant ID of the administrator.
     */
    @JsonProperty(value = "properties.tenantId")
    private UUID tenantId;

    /**
     * Creates an instance of ServerAzureADAdministratorInner class.
     * @param login login name of the server administrator.
     * @param sid sID (object ID) of the server administrator.
     */
    public ServerAzureADAdministratorInner() {
        administratorType = "ActiveDirectory";
    }

    /**
     * Get type of the sever administrator.
     *
     * @return the administratorType value
     */
    public String administratorType() {
        return this.administratorType;
    }

    /**
     * Set type of the sever administrator.
     *
     * @param administratorType the administratorType value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withAdministratorType(String administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get login name of the server administrator.
     *
     * @return the login value
     */
    public String login() {
        return this.login;
    }

    /**
     * Set login name of the server administrator.
     *
     * @param login the login value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get sID (object ID) of the server administrator.
     *
     * @return the sid value
     */
    public UUID sid() {
        return this.sid;
    }

    /**
     * Set sID (object ID) of the server administrator.
     *
     * @param sid the sid value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withSid(UUID sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Get tenant ID of the administrator.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set tenant ID of the administrator.
     *
     * @param tenantId the tenantId value to set
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

}
