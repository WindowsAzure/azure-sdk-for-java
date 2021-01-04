// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataConnectionKind. */
public final class DataConnectionKind extends ExpandableStringEnum<DataConnectionKind> {
    /** Static value EventHub for DataConnectionKind. */
    public static final DataConnectionKind EVENT_HUB = fromString("EventHub");

    /** Static value EventGrid for DataConnectionKind. */
    public static final DataConnectionKind EVENT_GRID = fromString("EventGrid");

    /** Static value IotHub for DataConnectionKind. */
    public static final DataConnectionKind IOT_HUB = fromString("IotHub");

    /**
     * Creates or finds a DataConnectionKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataConnectionKind.
     */
    @JsonCreator
    public static DataConnectionKind fromString(String name) {
        return fromString(name, DataConnectionKind.class);
    }

    /** @return known DataConnectionKind values. */
    public static Collection<DataConnectionKind> values() {
        return values(DataConnectionKind.class);
    }
}
