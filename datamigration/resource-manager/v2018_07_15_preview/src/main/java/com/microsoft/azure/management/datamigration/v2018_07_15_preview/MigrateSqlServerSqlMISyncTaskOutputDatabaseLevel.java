/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The MigrateSqlServerSqlMISyncTaskOutputDatabaseLevel model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("DatabaseLevelOutput")
public class MigrateSqlServerSqlMISyncTaskOutputDatabaseLevel extends MigrateSqlServerSqlMISyncTaskOutput {
    /**
     * Name of the database.
     */
    @JsonProperty(value = "sourceDatabaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceDatabaseName;

    /**
     * Current state of database. Possible values include: 'UNDEFINED',
     * 'INITIAL', 'FULL_BACKUP_UPLOAD_START', 'LOG_SHIPPING_START',
     * 'UPLOAD_LOG_FILES_START', 'CUTOVER_START', 'POST_CUTOVER_COMPLETE',
     * 'COMPLETED', 'CANCELLED', 'FAILED'.
     */
    @JsonProperty(value = "migrationState", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseMigrationState migrationState;

    /**
     * Database migration start time.
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startedOn;

    /**
     * Database migration end time.
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endedOn;

    /**
     * Details of full backup set.
     */
    @JsonProperty(value = "fullBackupSetInfo", access = JsonProperty.Access.WRITE_ONLY)
    private BackupSetInfo fullBackupSetInfo;

    /**
     * Last applied backup set information.
     */
    @JsonProperty(value = "lastRestoredBackupSetInfo", access = JsonProperty.Access.WRITE_ONLY)
    private BackupSetInfo lastRestoredBackupSetInfo;

    /**
     * Backup sets that are currently active (Either being uploaded or getting
     * restored).
     */
    @JsonProperty(value = "activeBackupSets", access = JsonProperty.Access.WRITE_ONLY)
    private List<BackupSetInfo> activeBackupSets;

    /**
     * Name of container created in the Azure Storage account where backups are
     * copied to.
     */
    @JsonProperty(value = "containerName", access = JsonProperty.Access.WRITE_ONLY)
    private String containerName;

    /**
     * prefix string to use for querying errors for this database.
     */
    @JsonProperty(value = "errorPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String errorPrefix;

    /**
     * Whether full backup has been applied to the target database or not.
     */
    @JsonProperty(value = "isFullBackupRestored", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isFullBackupRestored;

    /**
     * Migration exceptions and warnings.
     */
    @JsonProperty(value = "exceptionsAndWarnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> exceptionsAndWarnings;

    /**
     * Get name of the database.
     *
     * @return the sourceDatabaseName value
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Get current state of database. Possible values include: 'UNDEFINED', 'INITIAL', 'FULL_BACKUP_UPLOAD_START', 'LOG_SHIPPING_START', 'UPLOAD_LOG_FILES_START', 'CUTOVER_START', 'POST_CUTOVER_COMPLETE', 'COMPLETED', 'CANCELLED', 'FAILED'.
     *
     * @return the migrationState value
     */
    public DatabaseMigrationState migrationState() {
        return this.migrationState;
    }

    /**
     * Get database migration start time.
     *
     * @return the startedOn value
     */
    public DateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get database migration end time.
     *
     * @return the endedOn value
     */
    public DateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get details of full backup set.
     *
     * @return the fullBackupSetInfo value
     */
    public BackupSetInfo fullBackupSetInfo() {
        return this.fullBackupSetInfo;
    }

    /**
     * Get last applied backup set information.
     *
     * @return the lastRestoredBackupSetInfo value
     */
    public BackupSetInfo lastRestoredBackupSetInfo() {
        return this.lastRestoredBackupSetInfo;
    }

    /**
     * Get backup sets that are currently active (Either being uploaded or getting restored).
     *
     * @return the activeBackupSets value
     */
    public List<BackupSetInfo> activeBackupSets() {
        return this.activeBackupSets;
    }

    /**
     * Get name of container created in the Azure Storage account where backups are copied to.
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Get prefix string to use for querying errors for this database.
     *
     * @return the errorPrefix value
     */
    public String errorPrefix() {
        return this.errorPrefix;
    }

    /**
     * Get whether full backup has been applied to the target database or not.
     *
     * @return the isFullBackupRestored value
     */
    public Boolean isFullBackupRestored() {
        return this.isFullBackupRestored;
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
