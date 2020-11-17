/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PersonalDesktopAssignmentType.
 */
public final class PersonalDesktopAssignmentType extends ExpandableStringEnum<PersonalDesktopAssignmentType> {
    /** Static value Automatic for PersonalDesktopAssignmentType. */
    public static final PersonalDesktopAssignmentType AUTOMATIC = fromString("Automatic");

    /** Static value Direct for PersonalDesktopAssignmentType. */
    public static final PersonalDesktopAssignmentType DIRECT = fromString("Direct");

    /**
     * Creates or finds a PersonalDesktopAssignmentType from its string representation.
     * @param name a name to look for
     * @return the corresponding PersonalDesktopAssignmentType
     */
    @JsonCreator
    public static PersonalDesktopAssignmentType fromString(String name) {
        return fromString(name, PersonalDesktopAssignmentType.class);
    }

    /**
     * @return known PersonalDesktopAssignmentType values
     */
    public static Collection<PersonalDesktopAssignmentType> values() {
        return values(PersonalDesktopAssignmentType.class);
    }
}
