/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ResolutionType.
 */
public final class ResolutionType extends ExpandableStringEnum<ResolutionType> {
    /** Static value Manual for ResolutionType. */
    public static final ResolutionType MANUAL = fromString("Manual");

    /** Static value Automatic for ResolutionType. */
    public static final ResolutionType AUTOMATIC = fromString("Automatic");

    /**
     * Creates or finds a ResolutionType from its string representation.
     * @param name a name to look for
     * @return the corresponding ResolutionType
     */
    @JsonCreator
    public static ResolutionType fromString(String name) {
        return fromString(name, ResolutionType.class);
    }

    /**
     * @return known ResolutionType values
     */
    public static Collection<ResolutionType> values() {
        return values(ResolutionType.class);
    }
}
