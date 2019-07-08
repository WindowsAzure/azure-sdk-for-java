/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ScaleType.
 */
public final class ScaleType extends ExpandableStringEnum<ScaleType> {
    /** Static value HA for ScaleType. */
    public static final ScaleType HA = fromString("HA");

    /**
     * Creates or finds a ScaleType from its string representation.
     * @param name a name to look for
     * @return the corresponding ScaleType
     */
    @JsonCreator
    public static ScaleType fromString(String name) {
        return fromString(name, ScaleType.class);
    }

    /**
     * @return known ScaleType values
     */
    public static Collection<ScaleType> values() {
        return values(ScaleType.class);
    }
}
