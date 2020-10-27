/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LiveEventEncodingType.
 */
public final class LiveEventEncodingType extends ExpandableStringEnum<LiveEventEncodingType> {
    /** Static value None for LiveEventEncodingType. */
    public static final LiveEventEncodingType NONE = fromString("None");

    /** Static value Standard for LiveEventEncodingType. */
    public static final LiveEventEncodingType STANDARD = fromString("Standard");

    /** Static value Premium1080p for LiveEventEncodingType. */
    public static final LiveEventEncodingType PREMIUM1080P = fromString("Premium1080p");

    /**
     * Creates or finds a LiveEventEncodingType from its string representation.
     * @param name a name to look for
     * @return the corresponding LiveEventEncodingType
     */
    @JsonCreator
    public static LiveEventEncodingType fromString(String name) {
        return fromString(name, LiveEventEncodingType.class);
    }

    /**
     * @return known LiveEventEncodingType values
     */
    public static Collection<LiveEventEncodingType> values() {
        return values(LiveEventEncodingType.class);
    }
}
