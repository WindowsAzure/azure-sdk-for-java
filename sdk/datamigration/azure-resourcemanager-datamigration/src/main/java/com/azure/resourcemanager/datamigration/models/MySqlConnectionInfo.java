// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information for connecting to MySQL server. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MySqlConnectionInfo")
@Fluent
public final class MySqlConnectionInfo extends ConnectionInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MySqlConnectionInfo.class);

    /*
     * Name of the server
     */
    @JsonProperty(value = "serverName", required = true)
    private String serverName;

    /*
     * Port for Server
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /**
     * Get the serverName property: Name of the server.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set the serverName property: Name of the server.
     *
     * @param serverName the serverName value to set.
     * @return the MySqlConnectionInfo object itself.
     */
    public MySqlConnectionInfo withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the port property: Port for Server.
     *
     * @return the port value.
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port property: Port for Server.
     *
     * @param port the port value to set.
     * @return the MySqlConnectionInfo object itself.
     */
    public MySqlConnectionInfo withPort(int port) {
        this.port = port;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlConnectionInfo withUsername(String username) {
        super.withUsername(username);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlConnectionInfo withPassword(String password) {
        super.withPassword(password);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (serverName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property serverName in model MySqlConnectionInfo"));
        }
    }
}
