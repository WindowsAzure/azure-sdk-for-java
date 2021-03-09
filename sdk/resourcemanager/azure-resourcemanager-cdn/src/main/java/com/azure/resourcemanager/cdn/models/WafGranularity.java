// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WafGranularity. */
public final class WafGranularity extends ExpandableStringEnum<WafGranularity> {
    /** Static value PT5M for WafGranularity. */
    public static final WafGranularity PT5M = fromString("PT5M");

    /** Static value PT1H for WafGranularity. */
    public static final WafGranularity PT1H = fromString("PT1H");

    /** Static value P1D for WafGranularity. */
    public static final WafGranularity P1D = fromString("P1D");

    /**
     * Creates or finds a WafGranularity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WafGranularity.
     */
    @JsonCreator
    public static WafGranularity fromString(String name) {
        return fromString(name, WafGranularity.class);
    }

    /** @return known WafGranularity values. */
    public static Collection<WafGranularity> values() {
        return values(WafGranularity.class);
    }
}
