/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IndexKind.
 */
public final class IndexKind extends ExpandableStringEnum<IndexKind> {
    /** Static value Hash for IndexKind. */
    public static final IndexKind HASH = fromString("Hash");

    /** Static value Range for IndexKind. */
    public static final IndexKind RANGE = fromString("Range");

    /** Static value Spatial for IndexKind. */
    public static final IndexKind SPATIAL = fromString("Spatial");

    /**
     * Creates or finds a IndexKind from its string representation.
     * @param name a name to look for
     * @return the corresponding IndexKind
     */
    @JsonCreator
    public static IndexKind fromString(String name) {
        return fromString(name, IndexKind.class);
    }

    /**
     * @return known IndexKind values
     */
    public static Collection<IndexKind> values() {
        return values(IndexKind.class);
    }
}
