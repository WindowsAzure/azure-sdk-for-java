/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database specific information for SQL to SQL migration task inputs.
 */
public class MigrateSqlServerSqlServerDatabaseInput {
    /**
     * Name of the database.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Name of the database at destination.
     */
    @JsonProperty(value = "restoreDatabaseName")
    private String restoreDatabaseName;

    /**
     * Backup file share information for this database.
     */
    @JsonProperty(value = "backupFileShare")
    private FileShare backupFileShare;

    /**
     * The list of database files.
     */
    @JsonProperty(value = "databaseFiles")
    private List<DatabaseFileInput> databaseFiles;

    /**
     * Get name of the database.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the database.
     *
     * @param name the name value to set
     * @return the MigrateSqlServerSqlServerDatabaseInput object itself.
     */
    public MigrateSqlServerSqlServerDatabaseInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name of the database at destination.
     *
     * @return the restoreDatabaseName value
     */
    public String restoreDatabaseName() {
        return this.restoreDatabaseName;
    }

    /**
     * Set name of the database at destination.
     *
     * @param restoreDatabaseName the restoreDatabaseName value to set
     * @return the MigrateSqlServerSqlServerDatabaseInput object itself.
     */
    public MigrateSqlServerSqlServerDatabaseInput withRestoreDatabaseName(String restoreDatabaseName) {
        this.restoreDatabaseName = restoreDatabaseName;
        return this;
    }

    /**
     * Get backup file share information for this database.
     *
     * @return the backupFileShare value
     */
    public FileShare backupFileShare() {
        return this.backupFileShare;
    }

    /**
     * Set backup file share information for this database.
     *
     * @param backupFileShare the backupFileShare value to set
     * @return the MigrateSqlServerSqlServerDatabaseInput object itself.
     */
    public MigrateSqlServerSqlServerDatabaseInput withBackupFileShare(FileShare backupFileShare) {
        this.backupFileShare = backupFileShare;
        return this;
    }

    /**
     * Get the list of database files.
     *
     * @return the databaseFiles value
     */
    public List<DatabaseFileInput> databaseFiles() {
        return this.databaseFiles;
    }

    /**
     * Set the list of database files.
     *
     * @param databaseFiles the databaseFiles value to set
     * @return the MigrateSqlServerSqlServerDatabaseInput object itself.
     */
    public MigrateSqlServerSqlServerDatabaseInput withDatabaseFiles(List<DatabaseFileInput> databaseFiles) {
        this.databaseFiles = databaseFiles;
        return this;
    }

}
