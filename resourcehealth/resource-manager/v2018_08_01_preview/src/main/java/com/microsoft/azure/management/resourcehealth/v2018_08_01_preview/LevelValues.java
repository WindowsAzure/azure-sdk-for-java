/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LevelValues.
 */
public final class LevelValues extends ExpandableStringEnum<LevelValues> {
    /** Static value Critical for LevelValues. */
    public static final LevelValues CRITICAL = fromString("Critical");

    /** Static value Warning for LevelValues. */
    public static final LevelValues WARNING = fromString("Warning");

    /**
     * Creates or finds a LevelValues from its string representation.
     * @param name a name to look for
     * @return the corresponding LevelValues
     */
    @JsonCreator
    public static LevelValues fromString(String name) {
        return fromString(name, LevelValues.class);
    }

    /**
     * @return known LevelValues values
     */
    public static Collection<LevelValues> values() {
        return values(LevelValues.class);
    }
}
