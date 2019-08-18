// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for AccessTierRequired.
 */
public final class AccessTierRequired extends ExpandableStringEnum<AccessTierRequired> {
    /**
     * Static value P4 for AccessTierRequired.
     */
    public static final AccessTierRequired P4 = fromString("P4");

    /**
     * Static value P6 for AccessTierRequired.
     */
    public static final AccessTierRequired P6 = fromString("P6");

    /**
     * Static value P10 for AccessTierRequired.
     */
    public static final AccessTierRequired P10 = fromString("P10");

    /**
     * Static value P20 for AccessTierRequired.
     */
    public static final AccessTierRequired P20 = fromString("P20");

    /**
     * Static value P30 for AccessTierRequired.
     */
    public static final AccessTierRequired P30 = fromString("P30");

    /**
     * Static value P40 for AccessTierRequired.
     */
    public static final AccessTierRequired P40 = fromString("P40");

    /**
     * Static value P50 for AccessTierRequired.
     */
    public static final AccessTierRequired P50 = fromString("P50");

    /**
     * Static value Hot for AccessTierRequired.
     */
    public static final AccessTierRequired HOT = fromString("Hot");

    /**
     * Static value Cool for AccessTierRequired.
     */
    public static final AccessTierRequired COOL = fromString("Cool");

    /**
     * Static value Archive for AccessTierRequired.
     */
    public static final AccessTierRequired ARCHIVE = fromString("Archive");

    /**
     * Creates or finds a AccessTierRequired from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccessTierRequired.
     */
    @JsonCreator
    public static AccessTierRequired fromString(String name) {
        return fromString(name, AccessTierRequired.class);
    }

    /**
     * @return known AccessTierRequired values.
     */
    public static Collection<AccessTierRequired> values() {
        return values(AccessTierRequired.class);
    }
}
