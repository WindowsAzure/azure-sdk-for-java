/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Project Database Details.
 */
public class DatabaseInfo {
    /**
     * Name of the database.
     */
    @JsonProperty(value = "sourceDatabaseName", required = true)
    private String sourceDatabaseName;

    /**
     * Get name of the database.
     *
     * @return the sourceDatabaseName value
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Set name of the database.
     *
     * @param sourceDatabaseName the sourceDatabaseName value to set
     * @return the DatabaseInfo object itself.
     */
    public DatabaseInfo withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

}
