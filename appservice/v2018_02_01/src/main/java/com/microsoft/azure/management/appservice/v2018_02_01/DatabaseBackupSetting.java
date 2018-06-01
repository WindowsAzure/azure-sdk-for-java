/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database backup settings.
 */
public class DatabaseBackupSetting {
    /**
     * Database type (e.g. SqlAzure / MySql). Possible values include:
     * 'SqlAzure', 'MySql', 'LocalMySql', 'PostgreSql'.
     */
    @JsonProperty(value = "databaseType", required = true)
    private DatabaseType databaseType;

    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Contains a connection string name that is linked to the
     * SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     */
    @JsonProperty(value = "connectionStringName")
    private String connectionStringName;

    /**
     * Contains a connection string to a database which is being backed up or
     * restored. If the restore should happen to a new database, the database
     * name inside is the new one.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /**
     * Get the databaseType value.
     *
     * @return the databaseType value
     */
    public DatabaseType databaseType() {
        return this.databaseType;
    }

    /**
     * Set the databaseType value.
     *
     * @param databaseType the databaseType value to set
     * @return the DatabaseBackupSetting object itself.
     */
    public DatabaseBackupSetting withDatabaseType(DatabaseType databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the DatabaseBackupSetting object itself.
     */
    public DatabaseBackupSetting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the connectionStringName value.
     *
     * @return the connectionStringName value
     */
    public String connectionStringName() {
        return this.connectionStringName;
    }

    /**
     * Set the connectionStringName value.
     *
     * @param connectionStringName the connectionStringName value to set
     * @return the DatabaseBackupSetting object itself.
     */
    public DatabaseBackupSetting withConnectionStringName(String connectionStringName) {
        this.connectionStringName = connectionStringName;
        return this;
    }

    /**
     * Get the connectionString value.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString value.
     *
     * @param connectionString the connectionString value to set
     * @return the DatabaseBackupSetting object itself.
     */
    public DatabaseBackupSetting withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

}
