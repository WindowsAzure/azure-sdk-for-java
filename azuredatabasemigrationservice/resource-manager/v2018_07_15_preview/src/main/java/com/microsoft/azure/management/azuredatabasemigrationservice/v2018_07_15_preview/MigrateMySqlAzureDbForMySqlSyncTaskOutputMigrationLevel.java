/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("MigrationLevelOutput")
public class MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel extends MigrateMySqlAzureDbForMySqlSyncTaskOutput {
    /**
     * Migration start time.
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startedOn;

    /**
     * Migration end time.
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endedOn;

    /**
     * Source server version.
     */
    @JsonProperty(value = "sourceServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerVersion;

    /**
     * Source server name.
     */
    @JsonProperty(value = "sourceServer", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServer;

    /**
     * Target server version.
     */
    @JsonProperty(value = "targetServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerVersion;

    /**
     * Target server name.
     */
    @JsonProperty(value = "targetServer", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServer;

    /**
     * Get migration start time.
     *
     * @return the startedOn value
     */
    public DateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get migration end time.
     *
     * @return the endedOn value
     */
    public DateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get source server version.
     *
     * @return the sourceServerVersion value
     */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Get source server name.
     *
     * @return the sourceServer value
     */
    public String sourceServer() {
        return this.sourceServer;
    }

    /**
     * Get target server version.
     *
     * @return the targetServerVersion value
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Get target server name.
     *
     * @return the targetServer value
     */
    public String targetServer() {
        return this.targetServer;
    }

}
