/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ScenarioTarget.
 */
public final class ScenarioTarget extends ExpandableStringEnum<ScenarioTarget> {
    /** Static value SQLServer for ScenarioTarget. */
    public static final ScenarioTarget SQLSERVER = fromString("SQLServer");

    /** Static value SQLDB for ScenarioTarget. */
    public static final ScenarioTarget SQLDB = fromString("SQLDB");

    /** Static value SQLDW for ScenarioTarget. */
    public static final ScenarioTarget SQLDW = fromString("SQLDW");

    /** Static value SQLMI for ScenarioTarget. */
    public static final ScenarioTarget SQLMI = fromString("SQLMI");

    /** Static value AzureDBForMySql for ScenarioTarget. */
    public static final ScenarioTarget AZURE_DBFOR_MY_SQL = fromString("AzureDBForMySql");

    /** Static value AzureDBForPostgresSQL for ScenarioTarget. */
    public static final ScenarioTarget AZURE_DBFOR_POSTGRES_SQL = fromString("AzureDBForPostgresSQL");

    /** Static value MongoDB for ScenarioTarget. */
    public static final ScenarioTarget MONGO_DB = fromString("MongoDB");

    /**
     * Creates or finds a ScenarioTarget from its string representation.
     * @param name a name to look for
     * @return the corresponding ScenarioTarget
     */
    @JsonCreator
    public static ScenarioTarget fromString(String name) {
        return fromString(name, ScenarioTarget.class);
    }

    /**
     * @return known ScenarioTarget values
     */
    public static Collection<ScenarioTarget> values() {
        return values(ScenarioTarget.class);
    }
}
