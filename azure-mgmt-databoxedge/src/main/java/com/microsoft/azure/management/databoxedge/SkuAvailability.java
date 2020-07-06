/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuAvailability.
 */
public final class SkuAvailability extends ExpandableStringEnum<SkuAvailability> {
    /** Static value Available for SkuAvailability. */
    public static final SkuAvailability AVAILABLE = fromString("Available");

    /** Static value Unavailable for SkuAvailability. */
    public static final SkuAvailability UNAVAILABLE = fromString("Unavailable");

    /**
     * Creates or finds a SkuAvailability from its string representation.
     * @param name a name to look for
     * @return the corresponding SkuAvailability
     */
    @JsonCreator
    public static SkuAvailability fromString(String name) {
        return fromString(name, SkuAvailability.class);
    }

    /**
     * @return known SkuAvailability values
     */
    public static Collection<SkuAvailability> values() {
        return values(SkuAvailability.class);
    }
}
