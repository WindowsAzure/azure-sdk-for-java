/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2019_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OfferType.
 */
public final class OfferType extends ExpandableStringEnum<OfferType> {
    /** Static value MS-AZR-0017P for OfferType. */
    public static final OfferType MS_AZR_0017P = fromString("MS-AZR-0017P");

    /** Static value MS-AZR-0148P for OfferType. */
    public static final OfferType MS_AZR_0148P = fromString("MS-AZR-0148P");

    /**
     * Creates or finds a OfferType from its string representation.
     * @param name a name to look for
     * @return the corresponding OfferType
     */
    @JsonCreator
    public static OfferType fromString(String name) {
        return fromString(name, OfferType.class);
    }

    /**
     * @return known OfferType values
     */
    public static Collection<OfferType> values() {
        return values(OfferType.class);
    }
}
