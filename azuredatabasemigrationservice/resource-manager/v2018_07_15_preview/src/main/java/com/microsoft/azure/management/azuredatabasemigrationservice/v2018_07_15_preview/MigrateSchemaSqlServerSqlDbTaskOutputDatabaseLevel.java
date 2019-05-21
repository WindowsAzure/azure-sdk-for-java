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
 * The MigrateSchemaSqlServerSqlDbTaskOutputDatabaseLevel model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("DatabaseLevelOutput")
public class MigrateSchemaSqlServerSqlDbTaskOutputDatabaseLevel extends MigrateSchemaSqlServerSqlDbTaskOutput {
    /**
     * The name of the database.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /**
     * State of the schema migration for this database. Possible values
     * include: 'None', 'InProgress', 'Failed', 'Warning', 'Completed',
     * 'Skipped', 'Stopped'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState state;

    /**
     * Schema migration stage for this database. Possible values include:
     * 'NotStarted', 'ValidatingInputs', 'CollectingObjects',
     * 'DownloadingScript', 'GeneratingScript', 'UploadingScript',
     * 'DeployingSchema', 'Completed', 'CompletedWithWarnings', 'Failed'.
     */
    @JsonProperty(value = "stage", access = JsonProperty.Access.WRITE_ONLY)
    private SchemaMigrationStage stage;

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
     * Prefix string to use for querying errors for this database.
     */
    @JsonProperty(value = "databaseErrorResultPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseErrorResultPrefix;

    /**
     * Prefix string to use for querying schema errors for this database.
     */
    @JsonProperty(value = "schemaErrorResultPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String schemaErrorResultPrefix;

    /**
     * Number of successful operations for this database.
     */
    @JsonProperty(value = "numberOfSuccessfulOperations", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfSuccessfulOperations;

    /**
     * Number of failed operations for this database.
     */
    @JsonProperty(value = "numberOfFailedOperations", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfFailedOperations;

    /**
     * Identifier for the file resource containing the schema of this database.
     */
    @JsonProperty(value = "fileId", access = JsonProperty.Access.WRITE_ONLY)
    private String fileId;

    /**
     * Get the name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get state of the schema migration for this database. Possible values include: 'None', 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     *
     * @return the state value
     */
    public MigrationState state() {
        return this.state;
    }

    /**
     * Get schema migration stage for this database. Possible values include: 'NotStarted', 'ValidatingInputs', 'CollectingObjects', 'DownloadingScript', 'GeneratingScript', 'UploadingScript', 'DeployingSchema', 'Completed', 'CompletedWithWarnings', 'Failed'.
     *
     * @return the stage value
     */
    public SchemaMigrationStage stage() {
        return this.stage;
    }

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
     * Get prefix string to use for querying errors for this database.
     *
     * @return the databaseErrorResultPrefix value
     */
    public String databaseErrorResultPrefix() {
        return this.databaseErrorResultPrefix;
    }

    /**
     * Get prefix string to use for querying schema errors for this database.
     *
     * @return the schemaErrorResultPrefix value
     */
    public String schemaErrorResultPrefix() {
        return this.schemaErrorResultPrefix;
    }

    /**
     * Get number of successful operations for this database.
     *
     * @return the numberOfSuccessfulOperations value
     */
    public Long numberOfSuccessfulOperations() {
        return this.numberOfSuccessfulOperations;
    }

    /**
     * Get number of failed operations for this database.
     *
     * @return the numberOfFailedOperations value
     */
    public Long numberOfFailedOperations() {
        return this.numberOfFailedOperations;
    }

    /**
     * Get identifier for the file resource containing the schema of this database.
     *
     * @return the fileId value
     */
    public String fileId() {
        return this.fileId;
    }

}
