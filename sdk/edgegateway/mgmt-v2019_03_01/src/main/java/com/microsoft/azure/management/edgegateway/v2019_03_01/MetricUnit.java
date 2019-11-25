/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MetricUnit.
 */
public final class MetricUnit extends ExpandableStringEnum<MetricUnit> {
    /** Static value NotSpecified for MetricUnit. */
    public static final MetricUnit NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Percent for MetricUnit. */
    public static final MetricUnit PERCENT = fromString("Percent");

    /** Static value Count for MetricUnit. */
    public static final MetricUnit COUNT = fromString("Count");

    /** Static value Seconds for MetricUnit. */
    public static final MetricUnit SECONDS = fromString("Seconds");

    /** Static value Milliseconds for MetricUnit. */
    public static final MetricUnit MILLISECONDS = fromString("Milliseconds");

    /** Static value Bytes for MetricUnit. */
    public static final MetricUnit BYTES = fromString("Bytes");

    /** Static value BytesPerSecond for MetricUnit. */
    public static final MetricUnit BYTES_PER_SECOND = fromString("BytesPerSecond");

    /** Static value CountPerSecond for MetricUnit. */
    public static final MetricUnit COUNT_PER_SECOND = fromString("CountPerSecond");

    /**
     * Creates or finds a MetricUnit from its string representation.
     * @param name a name to look for
     * @return the corresponding MetricUnit
     */
    @JsonCreator
    public static MetricUnit fromString(String name) {
        return fromString(name, MetricUnit.class);
    }

    /**
     * @return known MetricUnit values
     */
    public static Collection<MetricUnit> values() {
        return values(MetricUnit.class);
    }
}
