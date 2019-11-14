/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TrackPropertyCompareOperation.
 */
public final class TrackPropertyCompareOperation extends ExpandableStringEnum<TrackPropertyCompareOperation> {
    /** Static value Unknown for TrackPropertyCompareOperation. */
    public static final TrackPropertyCompareOperation UNKNOWN = fromString("Unknown");

    /** Static value Equal for TrackPropertyCompareOperation. */
    public static final TrackPropertyCompareOperation EQUAL = fromString("Equal");

    /**
     * Creates or finds a TrackPropertyCompareOperation from its string representation.
     * @param name a name to look for
     * @return the corresponding TrackPropertyCompareOperation
     */
    @JsonCreator
    public static TrackPropertyCompareOperation fromString(String name) {
        return fromString(name, TrackPropertyCompareOperation.class);
    }

    /**
     * @return known TrackPropertyCompareOperation values
     */
    public static Collection<TrackPropertyCompareOperation> values() {
        return values(TrackPropertyCompareOperation.class);
    }
}
