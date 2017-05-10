/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.ServerVersion;
import java.util.UUID;
import com.microsoft.azure.management.sql.ServerState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Represents a server.
 */
@JsonFlatten
public class ServerInner extends TrackedResourceInner {
    /**
     * Kind of sql server.  This is metadata used for the Azure portal
     * experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /**
     * The fully qualified domain name of the server.
     */
    @JsonProperty(value = "properties.fullyQualifiedDomainName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullyQualifiedDomainName;

    /**
     * The version of the server. Possible values include: '2.0', '12.0'.
     */
    @JsonProperty(value = "properties.version")
    private ServerVersion version;

    /**
     * Administrator username for the server. Can only be specified when the
     * server is being created (and is required for creation).
     */
    @JsonProperty(value = "properties.administratorLogin")
    private String administratorLogin;

    /**
     * The administrator login password (required for server creation).
     */
    @JsonProperty(value = "properties.administratorLoginPassword")
    private String administratorLoginPassword;

    /**
     * The ID of the Active Azure Directory object with admin permissions on
     * this server. Legacy parameter, always null. To check for Active
     * Directory admin, query .../servers/{serverName}/administrators.
     */
    @JsonProperty(value = "properties.externalAdministratorSid", access = JsonProperty.Access.WRITE_ONLY)
    private UUID externalAdministratorSid;

    /**
     * The display name of the Azure Active Directory object with admin
     * permissions on this server. Legacy parameter, always null. To check for
     * Active Directory admin, query .../servers/{serverName}/administrators.
     */
    @JsonProperty(value = "properties.externalAdministratorLogin", access = JsonProperty.Access.WRITE_ONLY)
    private String externalAdministratorLogin;

    /**
     * The state of the server. Possible values include: 'Ready', 'Disabled'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ServerState state;

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the fullyQualifiedDomainName value.
     *
     * @return the fullyQualifiedDomainName value
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get the administratorLogin value.
     *
     * @return the administratorLogin value
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin value.
     *
     * @param administratorLogin the administratorLogin value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword value.
     *
     * @return the administratorLoginPassword value
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword value.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set
     * @return the ServerInner object itself.
     */
    public ServerInner withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the externalAdministratorSid value.
     *
     * @return the externalAdministratorSid value
     */
    public UUID externalAdministratorSid() {
        return this.externalAdministratorSid;
    }

    /**
     * Get the externalAdministratorLogin value.
     *
     * @return the externalAdministratorLogin value
     */
    public String externalAdministratorLogin() {
        return this.externalAdministratorLogin;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public ServerState state() {
        return this.state;
    }

}
