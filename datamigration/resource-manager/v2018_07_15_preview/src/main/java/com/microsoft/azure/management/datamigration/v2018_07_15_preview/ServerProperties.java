/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Server properties for MySQL type source.
 */
public class ServerProperties {
    /**
     * Name of the server platform.
     */
    @JsonProperty(value = "serverPlatform", access = JsonProperty.Access.WRITE_ONLY)
    private String serverPlatform;

    /**
     * Name of the server.
     */
    @JsonProperty(value = "serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /**
     * Version of the database server.
     */
    @JsonProperty(value = "serverVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String serverVersion;

    /**
     * Edition of the database server.
     */
    @JsonProperty(value = "serverEdition", access = JsonProperty.Access.WRITE_ONLY)
    private String serverEdition;

    /**
     * Version of the operating system.
     */
    @JsonProperty(value = "serverOperatingSystemVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String serverOperatingSystemVersion;

    /**
     * Number of databases in the server.
     */
    @JsonProperty(value = "serverDatabaseCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer serverDatabaseCount;

    /**
     * Get name of the server platform.
     *
     * @return the serverPlatform value
     */
    public String serverPlatform() {
        return this.serverPlatform;
    }

    /**
     * Get name of the server.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get version of the database server.
     *
     * @return the serverVersion value
     */
    public String serverVersion() {
        return this.serverVersion;
    }

    /**
     * Get edition of the database server.
     *
     * @return the serverEdition value
     */
    public String serverEdition() {
        return this.serverEdition;
    }

    /**
     * Get version of the operating system.
     *
     * @return the serverOperatingSystemVersion value
     */
    public String serverOperatingSystemVersion() {
        return this.serverOperatingSystemVersion;
    }

    /**
     * Get number of databases in the server.
     *
     * @return the serverDatabaseCount value
     */
    public Integer serverDatabaseCount() {
        return this.serverDatabaseCount;
    }

}
