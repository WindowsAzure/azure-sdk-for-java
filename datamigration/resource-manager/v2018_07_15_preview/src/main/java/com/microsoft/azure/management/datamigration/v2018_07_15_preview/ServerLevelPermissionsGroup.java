/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ServerLevelPermissionsGroup.
 */
public enum ServerLevelPermissionsGroup {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value MigrationFromSqlServerToAzureDB. */
    MIGRATION_FROM_SQL_SERVER_TO_AZURE_DB("MigrationFromSqlServerToAzureDB"),

    /** Enum value MigrationFromSqlServerToAzureMI. */
    MIGRATION_FROM_SQL_SERVER_TO_AZURE_MI("MigrationFromSqlServerToAzureMI"),

    /** Enum value MigrationFromMySQLToAzureDBForMySQL. */
    MIGRATION_FROM_MY_SQLTO_AZURE_DBFOR_MY_SQL("MigrationFromMySQLToAzureDBForMySQL");

    /** The actual serialized value for a ServerLevelPermissionsGroup instance. */
    private String value;

    ServerLevelPermissionsGroup(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ServerLevelPermissionsGroup instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ServerLevelPermissionsGroup object, or null if unable to parse.
     */
    @JsonCreator
    public static ServerLevelPermissionsGroup fromString(String value) {
        ServerLevelPermissionsGroup[] items = ServerLevelPermissionsGroup.values();
        for (ServerLevelPermissionsGroup item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
