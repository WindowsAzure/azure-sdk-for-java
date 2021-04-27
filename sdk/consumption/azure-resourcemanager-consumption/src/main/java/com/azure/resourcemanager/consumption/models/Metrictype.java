// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Metrictype. */
public final class Metrictype extends ExpandableStringEnum<Metrictype> {
    /** Static value actualcost for Metrictype. */
    public static final Metrictype ACTUALCOST = fromString("actualcost");

    /** Static value amortizedcost for Metrictype. */
    public static final Metrictype AMORTIZEDCOST = fromString("amortizedcost");

    /** Static value usage for Metrictype. */
    public static final Metrictype USAGE = fromString("usage");

    /**
     * Creates or finds a Metrictype from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Metrictype.
     */
    @JsonCreator
    public static Metrictype fromString(String name) {
        return fromString(name, Metrictype.class);
    }

    /** @return known Metrictype values. */
    public static Collection<Metrictype> values() {
        return values(Metrictype.class);
    }
}
