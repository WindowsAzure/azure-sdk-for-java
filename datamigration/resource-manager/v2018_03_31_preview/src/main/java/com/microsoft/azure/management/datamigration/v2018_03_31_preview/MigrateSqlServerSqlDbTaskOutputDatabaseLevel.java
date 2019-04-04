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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The MigrateSqlServerSqlDbTaskOutputDatabaseLevel model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("DatabaseLevelOutput")
public class MigrateSqlServerSqlDbTaskOutputDatabaseLevel extends MigrateSqlServerSqlDbTaskOutput {
    /**
     * Name of the item.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

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
     * Current state of migration. Possible values include: 'None',
     * 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState state;

    /**
     * Migration stage that this database is in. Possible values include:
     * 'None', 'Initialize', 'Backup', 'FileCopy', 'Restore', 'Completed'.
     */
    @JsonProperty(value = "stage", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseMigrationStage stage;

    /**
     * Status message.
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String statusMessage;

    /**
     * Migration progress message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Number of objects.
     */
    @JsonProperty(value = "numberOfObjects", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfObjects;

    /**
     * Number of successfully completed objects.
     */
    @JsonProperty(value = "numberOfObjectsCompleted", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfObjectsCompleted;

    /**
     * Number of database/object errors.
     */
    @JsonProperty(value = "errorCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long errorCount;

    /**
     * Wildcard string prefix to use for querying all errors of the item.
     */
    @JsonProperty(value = "errorPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String errorPrefix;

    /**
     * Wildcard string prefix to use for querying all sub-tem results of the
     * item.
     */
    @JsonProperty(value = "resultPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String resultPrefix;

    /**
     * Migration exceptions and warnings.
     */
    @JsonProperty(value = "exceptionsAndWarnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> exceptionsAndWarnings;

    /**
     * Summary of object results in the migration.
     */
    @JsonProperty(value = "objectSummary", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, DataItemMigrationSummaryResult> objectSummary;

    /**
     * Get name of the item.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
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
     * Get current state of migration. Possible values include: 'None', 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     *
     * @return the state value
     */
    public MigrationState state() {
        return this.state;
    }

    /**
     * Get migration stage that this database is in. Possible values include: 'None', 'Initialize', 'Backup', 'FileCopy', 'Restore', 'Completed'.
     *
     * @return the stage value
     */
    public DatabaseMigrationStage stage() {
        return this.stage;
    }

    /**
     * Get status message.
     *
     * @return the statusMessage value
     */
    public String statusMessage() {
        return this.statusMessage;
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
     * Get number of objects.
     *
     * @return the numberOfObjects value
     */
    public Long numberOfObjects() {
        return this.numberOfObjects;
    }

    /**
     * Get number of successfully completed objects.
     *
     * @return the numberOfObjectsCompleted value
     */
    public Long numberOfObjectsCompleted() {
        return this.numberOfObjectsCompleted;
    }

    /**
     * Get number of database/object errors.
     *
     * @return the errorCount value
     */
    public Long errorCount() {
        return this.errorCount;
    }

    /**
     * Get wildcard string prefix to use for querying all errors of the item.
     *
     * @return the errorPrefix value
     */
    public String errorPrefix() {
        return this.errorPrefix;
    }

    /**
     * Get wildcard string prefix to use for querying all sub-tem results of the item.
     *
     * @return the resultPrefix value
     */
    public String resultPrefix() {
        return this.resultPrefix;
    }

    /**
     * Get migration exceptions and warnings.
     *
     * @return the exceptionsAndWarnings value
     */
    public List<ReportableException> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

    /**
     * Get summary of object results in the migration.
     *
     * @return the objectSummary value
     */
    public Map<String, DataItemMigrationSummaryResult> objectSummary() {
        return this.objectSummary;
    }

}
