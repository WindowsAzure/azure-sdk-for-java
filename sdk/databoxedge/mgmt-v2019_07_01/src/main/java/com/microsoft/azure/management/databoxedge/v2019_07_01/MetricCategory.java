/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MetricCategory.
 */
public final class MetricCategory extends ExpandableStringEnum<MetricCategory> {
    /** Static value Capacity for MetricCategory. */
    public static final MetricCategory CAPACITY = fromString("Capacity");

    /** Static value Transaction for MetricCategory. */
    public static final MetricCategory TRANSACTION = fromString("Transaction");

    /**
     * Creates or finds a MetricCategory from its string representation.
     * @param name a name to look for
     * @return the corresponding MetricCategory
     */
    @JsonCreator
    public static MetricCategory fromString(String name) {
        return fromString(name, MetricCategory.class);
    }

    /**
     * @return known MetricCategory values
     */
    public static Collection<MetricCategory> values() {
        return values(MetricCategory.class);
    }
}
