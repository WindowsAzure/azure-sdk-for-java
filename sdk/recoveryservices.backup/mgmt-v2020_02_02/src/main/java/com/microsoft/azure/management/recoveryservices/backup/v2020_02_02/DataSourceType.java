/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DataSourceType.
 */
public final class DataSourceType extends ExpandableStringEnum<DataSourceType> {
    /** Static value Invalid for DataSourceType. */
    public static final DataSourceType INVALID = fromString("Invalid");

    /** Static value VM for DataSourceType. */
    public static final DataSourceType VM = fromString("VM");

    /** Static value FileFolder for DataSourceType. */
    public static final DataSourceType FILE_FOLDER = fromString("FileFolder");

    /** Static value AzureSqlDb for DataSourceType. */
    public static final DataSourceType AZURE_SQL_DB = fromString("AzureSqlDb");

    /** Static value SQLDB for DataSourceType. */
    public static final DataSourceType SQLDB = fromString("SQLDB");

    /** Static value Exchange for DataSourceType. */
    public static final DataSourceType EXCHANGE = fromString("Exchange");

    /** Static value Sharepoint for DataSourceType. */
    public static final DataSourceType SHAREPOINT = fromString("Sharepoint");

    /** Static value VMwareVM for DataSourceType. */
    public static final DataSourceType VMWARE_VM = fromString("VMwareVM");

    /** Static value SystemState for DataSourceType. */
    public static final DataSourceType SYSTEM_STATE = fromString("SystemState");

    /** Static value Client for DataSourceType. */
    public static final DataSourceType CLIENT = fromString("Client");

    /** Static value GenericDataSource for DataSourceType. */
    public static final DataSourceType GENERIC_DATA_SOURCE = fromString("GenericDataSource");

    /** Static value SQLDataBase for DataSourceType. */
    public static final DataSourceType SQLDATA_BASE = fromString("SQLDataBase");

    /** Static value AzureFileShare for DataSourceType. */
    public static final DataSourceType AZURE_FILE_SHARE = fromString("AzureFileShare");

    /** Static value SAPHanaDatabase for DataSourceType. */
    public static final DataSourceType SAPHANA_DATABASE = fromString("SAPHanaDatabase");

    /** Static value SAPAseDatabase for DataSourceType. */
    public static final DataSourceType SAPASE_DATABASE = fromString("SAPAseDatabase");

    /**
     * Creates or finds a DataSourceType from its string representation.
     * @param name a name to look for
     * @return the corresponding DataSourceType
     */
    @JsonCreator
    public static DataSourceType fromString(String name) {
        return fromString(name, DataSourceType.class);
    }

    /**
     * @return known DataSourceType values
     */
    public static Collection<DataSourceType> values() {
        return values(DataSourceType.class);
    }
}
