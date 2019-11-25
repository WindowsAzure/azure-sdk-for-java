/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WorkloadType.
 */
public final class WorkloadType extends ExpandableStringEnum<WorkloadType> {
    /** Static value Invalid for WorkloadType. */
    public static final WorkloadType INVALID = fromString("Invalid");

    /** Static value VM for WorkloadType. */
    public static final WorkloadType VM = fromString("VM");

    /** Static value FileFolder for WorkloadType. */
    public static final WorkloadType FILE_FOLDER = fromString("FileFolder");

    /** Static value AzureSqlDb for WorkloadType. */
    public static final WorkloadType AZURE_SQL_DB = fromString("AzureSqlDb");

    /** Static value SQLDB for WorkloadType. */
    public static final WorkloadType SQLDB = fromString("SQLDB");

    /** Static value Exchange for WorkloadType. */
    public static final WorkloadType EXCHANGE = fromString("Exchange");

    /** Static value Sharepoint for WorkloadType. */
    public static final WorkloadType SHAREPOINT = fromString("Sharepoint");

    /** Static value VMwareVM for WorkloadType. */
    public static final WorkloadType VMWARE_VM = fromString("VMwareVM");

    /** Static value SystemState for WorkloadType. */
    public static final WorkloadType SYSTEM_STATE = fromString("SystemState");

    /** Static value Client for WorkloadType. */
    public static final WorkloadType CLIENT = fromString("Client");

    /** Static value GenericDataSource for WorkloadType. */
    public static final WorkloadType GENERIC_DATA_SOURCE = fromString("GenericDataSource");

    /** Static value SQLDataBase for WorkloadType. */
    public static final WorkloadType SQLDATA_BASE = fromString("SQLDataBase");

    /** Static value AzureFileShare for WorkloadType. */
    public static final WorkloadType AZURE_FILE_SHARE = fromString("AzureFileShare");

    /** Static value SAPHanaDatabase for WorkloadType. */
    public static final WorkloadType SAPHANA_DATABASE = fromString("SAPHanaDatabase");

    /**
     * Creates or finds a WorkloadType from its string representation.
     * @param name a name to look for
     * @return the corresponding WorkloadType
     */
    @JsonCreator
    public static WorkloadType fromString(String name) {
        return fromString(name, WorkloadType.class);
    }

    /**
     * @return known WorkloadType values
     */
    public static Collection<WorkloadType> values() {
        return values(WorkloadType.class);
    }
}
