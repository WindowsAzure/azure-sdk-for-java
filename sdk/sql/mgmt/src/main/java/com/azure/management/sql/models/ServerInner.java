// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.sql.ResourceIdentity;
import com.azure.management.sql.ServerPrivateEndpointConnection;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The Server model.
 */
@JsonFlatten
@Fluent
public class ServerInner extends Resource {
    /*
     * Azure Active Directory identity configuration for a resource.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * Kind of sql server. This is metadata used for the Azure portal
     * experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Administrator username for the server. Once created it cannot be
     * changed.
     */
    @JsonProperty(value = "properties.administratorLogin")
    private String administratorLogin;

    /*
     * The administrator login password (required for server creation).
     */
    @JsonProperty(value = "properties.administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * The version of the server.
     */
    @JsonProperty(value = "properties.version")
    private String version;

    /*
     * The state of the server.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * The fully qualified domain name of the server.
     */
    @JsonProperty(value = "properties.fullyQualifiedDomainName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullyQualifiedDomainName;

    /*
     * List of private endpoint connections on a server
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServerPrivateEndpointConnection> privateEndpointConnections;

    /*
     * Minimal TLS version. Allowed values: '1.0', '1.1', '1.2'
     */
    @JsonProperty(value = "properties.minimalTlsVersion")
    private String minimalTlsVersion;

    /**
     * Get the identity property: Azure Active Directory identity configuration
     * for a resource.
     * 
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Azure Active Directory identity configuration
     * for a resource.
     * 
     * @param identity the identity value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the kind property: Kind of sql server. This is metadata used for the
     * Azure portal experience.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the administratorLogin property: Administrator username for the
     * server. Once created it cannot be changed.
     * 
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: Administrator username for the
     * server. Once created it cannot be changed.
     * 
     * @param administratorLogin the administratorLogin value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The administrator login
     * password (required for server creation).
     * 
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The administrator login
     * password (required for server creation).
     * 
     * @param administratorLoginPassword the administratorLoginPassword value
     * to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the version property: The version of the server.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of the server.
     * 
     * @param version the version value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the state property: The state of the server.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the fullyQualifiedDomainName property: The fully qualified domain
     * name of the server.
     * 
     * @return the fullyQualifiedDomainName value.
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint
     * connections on a server.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<ServerPrivateEndpointConnection> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the minimalTlsVersion property: Minimal TLS version. Allowed values:
     * '1.0', '1.1', '1.2'.
     * 
     * @return the minimalTlsVersion value.
     */
    public String minimalTlsVersion() {
        return this.minimalTlsVersion;
    }

    /**
     * Set the minimalTlsVersion property: Minimal TLS version. Allowed values:
     * '1.0', '1.1', '1.2'.
     * 
     * @param minimalTlsVersion the minimalTlsVersion value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withMinimalTlsVersion(String minimalTlsVersion) {
        this.minimalTlsVersion = minimalTlsVersion;
        return this;
    }
}
