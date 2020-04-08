// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IndexingMode. */
public final class IndexingMode extends ExpandableStringEnum<IndexingMode> {
    /** Static value Consistent for IndexingMode. */
    public static final IndexingMode CONSISTENT = fromString("Consistent");

    /** Static value Lazy for IndexingMode. */
    public static final IndexingMode LAZY = fromString("Lazy");

    /** Static value None for IndexingMode. */
    public static final IndexingMode NONE = fromString("None");

    /**
     * Creates or finds a IndexingMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IndexingMode.
     */
    @JsonCreator
    public static IndexingMode fromString(String name) {
        return fromString(name, IndexingMode.class);
    }

    /** @return known IndexingMode values. */
    public static Collection<IndexingMode> values() {
        return values(IndexingMode.class);
    }
}
