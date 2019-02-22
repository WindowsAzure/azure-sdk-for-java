/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A representation of the name of an object in a database.
 */
public class DatabaseObjectName {
    /**
     * The unescaped name of the database containing the object.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /**
     * The unescaped name of the object.
     */
    @JsonProperty(value = "objectName", access = JsonProperty.Access.WRITE_ONLY)
    private String objectName;

    /**
     * The unescaped name of the schema containing the object.
     */
    @JsonProperty(value = "schemaName", access = JsonProperty.Access.WRITE_ONLY)
    private String schemaName;

    /**
     * Type of the object in the database. Possible values include:
     * 'StoredProcedures', 'Table', 'User', 'View', 'Function'.
     */
    @JsonProperty(value = "objectType")
    private ObjectType objectType;

    /**
     * Get the unescaped name of the database containing the object.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the unescaped name of the object.
     *
     * @return the objectName value
     */
    public String objectName() {
        return this.objectName;
    }

    /**
     * Get the unescaped name of the schema containing the object.
     *
     * @return the schemaName value
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Get type of the object in the database. Possible values include: 'StoredProcedures', 'Table', 'User', 'View', 'Function'.
     *
     * @return the objectType value
     */
    public ObjectType objectType() {
        return this.objectType;
    }

    /**
     * Set type of the object in the database. Possible values include: 'StoredProcedures', 'Table', 'User', 'View', 'Function'.
     *
     * @param objectType the objectType value to set
     * @return the DatabaseObjectName object itself.
     */
    public DatabaseObjectName withObjectType(ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

}
