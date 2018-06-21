/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuName.
 */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /** Static value Basic for SkuName. */
    public static final SkuName BASIC = fromString("Basic");

    /** Static value Managed_Basic for SkuName. */
    public static final SkuName MANAGED_BASIC = fromString("Managed_Basic");

    /** Static value Managed_Standard for SkuName. */
    public static final SkuName MANAGED_STANDARD = fromString("Managed_Standard");

    /** Static value Managed_Premium for SkuName. */
    public static final SkuName MANAGED_PREMIUM = fromString("Managed_Premium");

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
