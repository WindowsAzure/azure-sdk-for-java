/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuTier.
 */
public final class SkuTier extends ExpandableStringEnum<SkuTier> {
    /** Static value Basic for SkuTier. */
    public static final SkuTier BASIC = fromString("Basic");

    /**
     * Creates or finds a SkuTier from its string representation.
     * @param name a name to look for
     * @return the corresponding SkuTier
     */
    @JsonCreator
    public static SkuTier fromString(String name) {
        return fromString(name, SkuTier.class);
    }

    /**
     * @return known SkuTier values
     */
    public static Collection<SkuTier> values() {
        return values(SkuTier.class);
    }
}
