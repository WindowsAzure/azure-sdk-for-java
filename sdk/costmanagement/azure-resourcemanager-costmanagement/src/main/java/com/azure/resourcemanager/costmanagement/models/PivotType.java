// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PivotType. */
public final class PivotType extends ExpandableStringEnum<PivotType> {
    /** Static value Dimension for PivotType. */
    public static final PivotType DIMENSION = fromString("Dimension");

    /** Static value TagKey for PivotType. */
    public static final PivotType TAG_KEY = fromString("TagKey");

    /**
     * Creates or finds a PivotType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PivotType.
     */
    @JsonCreator
    public static PivotType fromString(String name) {
        return fromString(name, PivotType.class);
    }

    /** @return known PivotType values. */
    public static Collection<PivotType> values() {
        return values(PivotType.class);
    }
}
