/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2017_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuName.
 */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /** Static value Basic for SkuName. */
    public static final SkuName BASIC = fromString("Basic");

    /** Static value Standard for SkuName. */
    public static final SkuName STANDARD = fromString("Standard");

    /**
     * Creates or finds a SkuName from its string representation.
     * @param name a name to look for
     * @return the corresponding SkuName
     */
    @JsonCreator
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /**
     * @return known SkuName values
     */
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
