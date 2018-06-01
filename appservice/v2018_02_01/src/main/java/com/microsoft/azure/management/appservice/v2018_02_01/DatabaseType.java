/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DatabaseType.
 */
public final class DatabaseType extends ExpandableStringEnum<DatabaseType> {
    /** Static value SqlAzure for DatabaseType. */
    public static final DatabaseType SQL_AZURE = fromString("SqlAzure");

    /** Static value MySql for DatabaseType. */
    public static final DatabaseType MY_SQL = fromString("MySql");

    /** Static value LocalMySql for DatabaseType. */
    public static final DatabaseType LOCAL_MY_SQL = fromString("LocalMySql");

    /** Static value PostgreSql for DatabaseType. */
    public static final DatabaseType POSTGRE_SQL = fromString("PostgreSql");

    /**
     * Creates or finds a DatabaseType from its string representation.
     * @param name a name to look for
     * @return the corresponding DatabaseType
     */
    @JsonCreator
    public static DatabaseType fromString(String name) {
        return fromString(name, DatabaseType.class);
    }

    /**
     * @return known DatabaseType values
     */
    public static Collection<DatabaseType> values() {
        return values(DatabaseType.class);
    }
}
