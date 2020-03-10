/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for JitSchedulingType.
 */
public final class JitSchedulingType extends ExpandableStringEnum<JitSchedulingType> {
    /** Static value NotSpecified for JitSchedulingType. */
    public static final JitSchedulingType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Once for JitSchedulingType. */
    public static final JitSchedulingType ONCE = fromString("Once");

    /** Static value Recurring for JitSchedulingType. */
    public static final JitSchedulingType RECURRING = fromString("Recurring");

    /**
     * Creates or finds a JitSchedulingType from its string representation.
     * @param name a name to look for
     * @return the corresponding JitSchedulingType
     */
    @JsonCreator
    public static JitSchedulingType fromString(String name) {
        return fromString(name, JitSchedulingType.class);
    }

    /**
     * @return known JitSchedulingType values
     */
    public static Collection<JitSchedulingType> values() {
        return values(JitSchedulingType.class);
    }
}
