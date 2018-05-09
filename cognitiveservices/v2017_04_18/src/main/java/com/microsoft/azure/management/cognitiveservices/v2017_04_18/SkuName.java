/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuName.
 */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /** Static value F0 for SkuName. */
    public static final SkuName F0 = fromString("F0");

    /** Static value P0 for SkuName. */
    public static final SkuName P0 = fromString("P0");

    /** Static value P1 for SkuName. */
    public static final SkuName P1 = fromString("P1");

    /** Static value P2 for SkuName. */
    public static final SkuName P2 = fromString("P2");

    /** Static value S0 for SkuName. */
    public static final SkuName S0 = fromString("S0");

    /** Static value S1 for SkuName. */
    public static final SkuName S1 = fromString("S1");

    /** Static value S2 for SkuName. */
    public static final SkuName S2 = fromString("S2");

    /** Static value S3 for SkuName. */
    public static final SkuName S3 = fromString("S3");

    /** Static value S4 for SkuName. */
    public static final SkuName S4 = fromString("S4");

    /** Static value S5 for SkuName. */
    public static final SkuName S5 = fromString("S5");

    /** Static value S6 for SkuName. */
    public static final SkuName S6 = fromString("S6");

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
