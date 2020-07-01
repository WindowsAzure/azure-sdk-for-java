/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specific Databases to restore.
 */
public class DatabaseRestoreResource {
    /**
     * The name of the database to restore.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * The names of the collections to restore.
     */
    @JsonProperty(value = "collectionNames")
    private List<String> collectionNames;

    /**
     * Get the name of the database to restore.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database to restore.
     *
     * @param databaseName the databaseName value to set
     * @return the DatabaseRestoreResource object itself.
     */
    public DatabaseRestoreResource withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the names of the collections to restore.
     *
     * @return the collectionNames value
     */
    public List<String> collectionNames() {
        return this.collectionNames;
    }

    /**
     * Set the names of the collections to restore.
     *
     * @param collectionNames the collectionNames value to set
     * @return the DatabaseRestoreResource object itself.
     */
    public DatabaseRestoreResource withCollectionNames(List<String> collectionNames) {
        this.collectionNames = collectionNames;
        return this;
    }

}
