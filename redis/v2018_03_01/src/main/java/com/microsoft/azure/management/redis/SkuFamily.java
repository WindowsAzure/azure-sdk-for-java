/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuFamily.
 */
public final class SkuFamily extends ExpandableStringEnum<SkuFamily> {
    /** Static value C for SkuFamily. */
    public static final SkuFamily C = fromString("C");

    /** Static value P for SkuFamily. */
    public static final SkuFamily P = fromString("P");

    /**
     * Creates or finds a SkuFamily from its string representation.
     * @param name a name to look for
     * @return the corresponding SkuFamily
     */
    @JsonCreator
    public static SkuFamily fromString(String name) {
        return fromString(name, SkuFamily.class);
    }

    /**
     * @return known SkuFamily values
     */
    public static Collection<SkuFamily> values() {
        return values(SkuFamily.class);
    }
}
