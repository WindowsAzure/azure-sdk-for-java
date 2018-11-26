/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database file specific information.
 */
public class DatabaseFileInfo {
    /**
     * Name of the database.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * Unique identifier for database file.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Logical name of the file.
     */
    @JsonProperty(value = "logicalName")
    private String logicalName;

    /**
     * Operating-system full path of the file.
     */
    @JsonProperty(value = "physicalFullName")
    private String physicalFullName;

    /**
     * Suggested full path of the file for restoring.
     */
    @JsonProperty(value = "restoreFullName")
    private String restoreFullName;

    /**
     * Database file type. Possible values include: 'Rows', 'Log',
     * 'Filestream', 'NotSupported', 'Fulltext'.
     */
    @JsonProperty(value = "fileType")
    private DatabaseFileType fileType;

    /**
     * Size of the file in megabytes.
     */
    @JsonProperty(value = "sizeMB")
    private Double sizeMB;

    /**
     * Get name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set name of the database.
     *
     * @param databaseName the databaseName value to set
     * @return the DatabaseFileInfo object itself.
     */
    public DatabaseFileInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get unique identifier for database file.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set unique identifier for database file.
     *
     * @param id the id value to set
     * @return the DatabaseFileInfo object itself.
     */
    public DatabaseFileInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get logical name of the file.
     *
     * @return the logicalName value
     */
    public String logicalName() {
        return this.logicalName;
    }

    /**
     * Set logical name of the file.
     *
     * @param logicalName the logicalName value to set
     * @return the DatabaseFileInfo object itself.
     */
    public DatabaseFileInfo withLogicalName(String logicalName) {
        this.logicalName = logicalName;
        return this;
    }

    /**
     * Get operating-system full path of the file.
     *
     * @return the physicalFullName value
     */
    public String physicalFullName() {
        return this.physicalFullName;
    }

    /**
     * Set operating-system full path of the file.
     *
     * @param physicalFullName the physicalFullName value to set
     * @return the DatabaseFileInfo object itself.
     */
    public DatabaseFileInfo withPhysicalFullName(String physicalFullName) {
        this.physicalFullName = physicalFullName;
        return this;
    }

    /**
     * Get suggested full path of the file for restoring.
     *
     * @return the restoreFullName value
     */
    public String restoreFullName() {
        return this.restoreFullName;
    }

    /**
     * Set suggested full path of the file for restoring.
     *
     * @param restoreFullName the restoreFullName value to set
     * @return the DatabaseFileInfo object itself.
     */
    public DatabaseFileInfo withRestoreFullName(String restoreFullName) {
        this.restoreFullName = restoreFullName;
        return this;
    }

    /**
     * Get database file type. Possible values include: 'Rows', 'Log', 'Filestream', 'NotSupported', 'Fulltext'.
     *
     * @return the fileType value
     */
    public DatabaseFileType fileType() {
        return this.fileType;
    }

    /**
     * Set database file type. Possible values include: 'Rows', 'Log', 'Filestream', 'NotSupported', 'Fulltext'.
     *
     * @param fileType the fileType value to set
     * @return the DatabaseFileInfo object itself.
     */
    public DatabaseFileInfo withFileType(DatabaseFileType fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Get size of the file in megabytes.
     *
     * @return the sizeMB value
     */
    public Double sizeMB() {
        return this.sizeMB;
    }

    /**
     * Set size of the file in megabytes.
     *
     * @param sizeMB the sizeMB value to set
     * @return the DatabaseFileInfo object itself.
     */
    public DatabaseFileInfo withSizeMB(Double sizeMB) {
        this.sizeMB = sizeMB;
        return this;
    }

}
