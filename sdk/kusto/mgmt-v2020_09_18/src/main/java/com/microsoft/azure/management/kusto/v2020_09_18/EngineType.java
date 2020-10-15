/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EngineType.
 */
public final class EngineType extends ExpandableStringEnum<EngineType> {
    /** Static value V2 for EngineType. */
    public static final EngineType V2 = fromString("V2");

    /** Static value V3 for EngineType. */
    public static final EngineType V3 = fromString("V3");

    /**
     * Creates or finds a EngineType from its string representation.
     * @param name a name to look for
     * @return the corresponding EngineType
     */
    @JsonCreator
    public static EngineType fromString(String name) {
        return fromString(name, EngineType.class);
    }

    /**
     * @return known EngineType values
     */
    public static Collection<EngineType> values() {
        return values(EngineType.class);
    }
}
