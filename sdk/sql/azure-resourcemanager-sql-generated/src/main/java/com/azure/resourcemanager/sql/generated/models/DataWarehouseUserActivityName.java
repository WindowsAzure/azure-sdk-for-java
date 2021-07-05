// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataWarehouseUserActivityName. */
public final class DataWarehouseUserActivityName extends ExpandableStringEnum<DataWarehouseUserActivityName> {
    /** Static value current for DataWarehouseUserActivityName. */
    public static final DataWarehouseUserActivityName CURRENT = fromString("current");

    /**
     * Creates or finds a DataWarehouseUserActivityName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataWarehouseUserActivityName.
     */
    @JsonCreator
    public static DataWarehouseUserActivityName fromString(String name) {
        return fromString(name, DataWarehouseUserActivityName.class);
    }

    /** @return known DataWarehouseUserActivityName values. */
    public static Collection<DataWarehouseUserActivityName> values() {
        return values(DataWarehouseUserActivityName.class);
    }
}
