/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AttributeMappingType.
 */
public final class AttributeMappingType extends ExpandableStringEnum<AttributeMappingType> {
    /** Static value Constant for AttributeMappingType. */
    public static final AttributeMappingType CONSTANT = fromString("Constant");

    /** Static value Direct for AttributeMappingType. */
    public static final AttributeMappingType DIRECT = fromString("Direct");

    /** Static value DnPart for AttributeMappingType. */
    public static final AttributeMappingType DN_PART = fromString("DnPart");

    /** Static value Script for AttributeMappingType. */
    public static final AttributeMappingType SCRIPT = fromString("Script");

    /**
     * Creates or finds a AttributeMappingType from its string representation.
     * @param name a name to look for
     * @return the corresponding AttributeMappingType
     */
    @JsonCreator
    public static AttributeMappingType fromString(String name) {
        return fromString(name, AttributeMappingType.class);
    }

    /**
     * @return known AttributeMappingType values
     */
    public static Collection<AttributeMappingType> values() {
        return values(AttributeMappingType.class);
    }
}
