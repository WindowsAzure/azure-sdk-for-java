// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the connection properties of a server. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ConnectionInfo.class)
@JsonTypeName("ConnectionInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SqlConnectionInfo", value = SqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "MySqlConnectionInfo", value = MySqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "PostgreSqlConnectionInfo", value = PostgreSqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "MiSqlConnectionInfo", value = MiSqlConnectionInfo.class)
})
@Fluent
public class ConnectionInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionInfo.class);

    /*
     * User name
     */
    @JsonProperty(value = "userName")
    private String username;

    /*
     * Password credential.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the username property: User name.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: User name.
     *
     * @param username the username value to set.
     * @return the ConnectionInfo object itself.
     */
    public ConnectionInfo withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password credential.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password credential.
     *
     * @param password the password value to set.
     * @return the ConnectionInfo object itself.
     */
    public ConnectionInfo withPassword(String password) {
        this.password = password;
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
