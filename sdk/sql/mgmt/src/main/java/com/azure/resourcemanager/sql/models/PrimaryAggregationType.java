// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PrimaryAggregationType. */
public final class PrimaryAggregationType extends ExpandableStringEnum<PrimaryAggregationType> {
    /** Static value None for PrimaryAggregationType. */
    public static final PrimaryAggregationType NONE = fromString("None");

    /** Static value Average for PrimaryAggregationType. */
    public static final PrimaryAggregationType AVERAGE = fromString("Average");

    /** Static value Count for PrimaryAggregationType. */
    public static final PrimaryAggregationType COUNT = fromString("Count");

    /** Static value Minimum for PrimaryAggregationType. */
    public static final PrimaryAggregationType MINIMUM = fromString("Minimum");

    /** Static value Maximum for PrimaryAggregationType. */
    public static final PrimaryAggregationType MAXIMUM = fromString("Maximum");

    /** Static value Total for PrimaryAggregationType. */
    public static final PrimaryAggregationType TOTAL = fromString("Total");

    /**
     * Creates or finds a PrimaryAggregationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrimaryAggregationType.
     */
    @JsonCreator
    public static PrimaryAggregationType fromString(String name) {
        return fromString(name, PrimaryAggregationType.class);
    }

    /** @return known PrimaryAggregationType values. */
    public static Collection<PrimaryAggregationType> values() {
        return values(PrimaryAggregationType.class);
    }
}
