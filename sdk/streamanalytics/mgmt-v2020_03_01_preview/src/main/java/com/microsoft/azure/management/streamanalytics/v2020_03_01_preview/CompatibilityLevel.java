/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CompatibilityLevel.
 */
public final class CompatibilityLevel extends ExpandableStringEnum<CompatibilityLevel> {
    /** Static value 1.0 for CompatibilityLevel. */
    public static final CompatibilityLevel ONE_FULL_STOP_ZERO = fromString("1.0");

    /**
     * Creates or finds a CompatibilityLevel from its string representation.
     * @param name a name to look for
     * @return the corresponding CompatibilityLevel
     */
    @JsonCreator
    public static CompatibilityLevel fromString(String name) {
        return fromString(name, CompatibilityLevel.class);
    }

    /**
     * @return known CompatibilityLevel values
     */
    public static Collection<CompatibilityLevel> values() {
        return values(CompatibilityLevel.class);
    }
}
