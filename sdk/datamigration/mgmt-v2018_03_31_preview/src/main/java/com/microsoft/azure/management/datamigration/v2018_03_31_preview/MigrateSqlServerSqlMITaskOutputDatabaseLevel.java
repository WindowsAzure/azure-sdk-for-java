/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The MigrateSqlServerSqlMITaskOutputDatabaseLevel model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("DatabaseLevelOutput")
public class MigrateSqlServerSqlMITaskOutputDatabaseLevel extends MigrateSqlServerSqlMITaskOutput {
    /**
     * Name of the database.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /**
     * Size of the database in megabytes.
     */
    @JsonProperty(value = "sizeMB", access = JsonProperty.Access.WRITE_ONLY)
    private Double sizeMB;

    /**
     * Current state of migration. Possible values include: 'None',
     * 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState state;

    /**
     * Current stage of migration. Possible values include: 'None',
     * 'Initialize', 'Backup', 'FileCopy', 'Restore', 'Completed'.
     */
    @JsonProperty(value = "stage", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseMigrationStage stage;

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
     * Migration progress message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Migration exceptions and warnings.
     */
    @JsonProperty(value = "exceptionsAndWarnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> exceptionsAndWarnings;

    /**
     * Get name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get size of the database in megabytes.
     *
     * @return the sizeMB value
     */
    public Double sizeMB() {
        return this.sizeMB;
    }

    /**
     * Get current state of migration. Possible values include: 'None', 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     *
     * @return the state value
     */
    public MigrationState state() {
        return this.state;
    }

    /**
     * Get current stage of migration. Possible values include: 'None', 'Initialize', 'Backup', 'FileCopy', 'Restore', 'Completed'.
     *
     * @return the stage value
     */
    public DatabaseMigrationStage stage() {
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
     * Get migration progress message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get migration exceptions and warnings.
     *
     * @return the exceptionsAndWarnings value
     */
    public List<ReportableException> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

}
