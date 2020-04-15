// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MetricTriggerType. */
public final class MetricTriggerType extends ExpandableStringEnum<MetricTriggerType> {
    /** Static value Consecutive for MetricTriggerType. */
    public static final MetricTriggerType CONSECUTIVE = fromString("Consecutive");

    /** Static value Total for MetricTriggerType. */
    public static final MetricTriggerType TOTAL = fromString("Total");

    /**
     * Creates or finds a MetricTriggerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MetricTriggerType.
     */
    @JsonCreator
    public static MetricTriggerType fromString(String name) {
        return fromString(name, MetricTriggerType.class);
    }

    /** @return known MetricTriggerType values. */
    public static Collection<MetricTriggerType> values() {
        return values(MetricTriggerType.class);
    }
}
