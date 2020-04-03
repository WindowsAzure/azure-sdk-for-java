// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for Enum15.
 */
public final class Enum15 extends ExpandableStringEnum<Enum15> {
    /**
     * Static value All for Enum15.
     */
    public static final Enum15 ALL = fromString("All");

    /**
     * Static value Error for Enum15.
     */
    public static final Enum15 ERROR = fromString("Error");

    /**
     * Static value Warning for Enum15.
     */
    public static final Enum15 WARNING = fromString("Warning");

    /**
     * Static value Success for Enum15.
     */
    public static final Enum15 SUCCESS = fromString("Success");

    /**
     * Creates or finds a Enum15 from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Enum15.
     */
    @JsonCreator
    public static Enum15 fromString(String name) {
        return fromString(name, Enum15.class);
    }

    /**
     * @return known Enum15 values.
     */
    public static Collection<Enum15> values() {
        return values(Enum15.class);
    }
}
