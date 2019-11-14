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
 * Defines values for Priority.
 */
public final class Priority extends ExpandableStringEnum<Priority> {
    /** Static value Low for Priority. */
    public static final Priority LOW = fromString("Low");

    /** Static value Normal for Priority. */
    public static final Priority NORMAL = fromString("Normal");

    /** Static value High for Priority. */
    public static final Priority HIGH = fromString("High");

    /**
     * Creates or finds a Priority from its string representation.
     * @param name a name to look for
     * @return the corresponding Priority
     */
    @JsonCreator
    public static Priority fromString(String name) {
        return fromString(name, Priority.class);
    }

    /**
     * @return known Priority values
     */
    public static Collection<Priority> values() {
        return values(Priority.class);
    }
}
