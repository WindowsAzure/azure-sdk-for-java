// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for DataStatus.
 */
public final class DataStatus extends ExpandableStringEnum<DataStatus> {
    /**
     * Static value present for DataStatus.
     */
    public static final DataStatus PRESENT = fromString("present");

    /**
     * Static value notPresent for DataStatus.
     */
    public static final DataStatus NOT_PRESENT = fromString("notPresent");

    /**
     * Creates or finds a DataStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataStatus.
     */
    @JsonCreator
    public static DataStatus fromString(String name) {
        return fromString(name, DataStatus.class);
    }

    /**
     * @return known DataStatus values.
     */
    public static Collection<DataStatus> values() {
        return values(DataStatus.class);
    }
}
