// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WorkloadItemType. */
public final class WorkloadItemType extends ExpandableStringEnum<WorkloadItemType> {
    /** Static value Invalid for WorkloadItemType. */
    public static final WorkloadItemType INVALID = fromString("Invalid");

    /** Static value SQLInstance for WorkloadItemType. */
    public static final WorkloadItemType SQLINSTANCE = fromString("SQLInstance");

    /** Static value SQLDataBase for WorkloadItemType. */
    public static final WorkloadItemType SQLDATA_BASE = fromString("SQLDataBase");

    /** Static value SAPHanaSystem for WorkloadItemType. */
    public static final WorkloadItemType SAPHANA_SYSTEM = fromString("SAPHanaSystem");

    /** Static value SAPHanaDatabase for WorkloadItemType. */
    public static final WorkloadItemType SAPHANA_DATABASE = fromString("SAPHanaDatabase");

    /** Static value SAPAseSystem for WorkloadItemType. */
    public static final WorkloadItemType SAPASE_SYSTEM = fromString("SAPAseSystem");

    /** Static value SAPAseDatabase for WorkloadItemType. */
    public static final WorkloadItemType SAPASE_DATABASE = fromString("SAPAseDatabase");

    /**
     * Creates or finds a WorkloadItemType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkloadItemType.
     */
    @JsonCreator
    public static WorkloadItemType fromString(String name) {
        return fromString(name, WorkloadItemType.class);
    }

    /** @return known WorkloadItemType values. */
    public static Collection<WorkloadItemType> values() {
        return values(WorkloadItemType.class);
    }
}
