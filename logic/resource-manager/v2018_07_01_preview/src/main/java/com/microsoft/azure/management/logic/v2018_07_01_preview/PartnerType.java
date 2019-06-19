/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PartnerType.
 */
public final class PartnerType extends ExpandableStringEnum<PartnerType> {
    /** Static value NotSpecified for PartnerType. */
    public static final PartnerType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value B2B for PartnerType. */
    public static final PartnerType B2B = fromString("B2B");

    /**
     * Creates or finds a PartnerType from its string representation.
     * @param name a name to look for
     * @return the corresponding PartnerType
     */
    @JsonCreator
    public static PartnerType fromString(String name) {
        return fromString(name, PartnerType.class);
    }

    /**
     * @return known PartnerType values
     */
    public static Collection<PartnerType> values() {
        return values(PartnerType.class);
    }
}
