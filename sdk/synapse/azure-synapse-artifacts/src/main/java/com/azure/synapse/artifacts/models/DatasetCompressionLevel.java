// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DatasetCompressionLevel. */
public final class DatasetCompressionLevel extends ExpandableStringEnum<DatasetCompressionLevel> {
    /** Static value Optimal for DatasetCompressionLevel. */
    public static final DatasetCompressionLevel OPTIMAL = fromString("Optimal");

    /** Static value Fastest for DatasetCompressionLevel. */
    public static final DatasetCompressionLevel FASTEST = fromString("Fastest");

    /**
     * Creates or finds a DatasetCompressionLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DatasetCompressionLevel.
     */
    @JsonCreator
    public static DatasetCompressionLevel fromString(String name) {
        return fromString(name, DatasetCompressionLevel.class);
    }

    /** @return known DatasetCompressionLevel values. */
    public static Collection<DatasetCompressionLevel> values() {
        return values(DatasetCompressionLevel.class);
    }
}
