// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for UnitDefinitionType.
 */
public final class UnitDefinitionType extends ExpandableStringEnum<UnitDefinitionType> {
    /**
     * Static value Count for UnitDefinitionType.
     */
    public static final UnitDefinitionType COUNT = fromString("Count");

    /**
     * Static value Bytes for UnitDefinitionType.
     */
    public static final UnitDefinitionType BYTES = fromString("Bytes");

    /**
     * Static value Seconds for UnitDefinitionType.
     */
    public static final UnitDefinitionType SECONDS = fromString("Seconds");

    /**
     * Static value Percent for UnitDefinitionType.
     */
    public static final UnitDefinitionType PERCENT = fromString("Percent");

    /**
     * Static value CountPerSecond for UnitDefinitionType.
     */
    public static final UnitDefinitionType COUNT_PER_SECOND = fromString("CountPerSecond");

    /**
     * Static value BytesPerSecond for UnitDefinitionType.
     */
    public static final UnitDefinitionType BYTES_PER_SECOND = fromString("BytesPerSecond");

    /**
     * Creates or finds a UnitDefinitionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UnitDefinitionType.
     */
    @JsonCreator
    public static UnitDefinitionType fromString(String name) {
        return fromString(name, UnitDefinitionType.class);
    }

    /**
     * @return known UnitDefinitionType values.
     */
    public static Collection<UnitDefinitionType> values() {
        return values(UnitDefinitionType.class);
    }
}
