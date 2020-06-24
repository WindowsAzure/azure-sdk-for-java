/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PublicIPPrefixSkuName.
 */
public final class PublicIPPrefixSkuName extends ExpandableStringEnum<PublicIPPrefixSkuName> {
    /** Static value Standard for PublicIPPrefixSkuName. */
    public static final PublicIPPrefixSkuName STANDARD = fromString("Standard");

    /**
     * Creates or finds a PublicIPPrefixSkuName from its string representation.
     * @param name a name to look for
     * @return the corresponding PublicIPPrefixSkuName
     */
    @JsonCreator
    public static PublicIPPrefixSkuName fromString(String name) {
        return fromString(name, PublicIPPrefixSkuName.class);
    }

    /**
     * @return known PublicIPPrefixSkuName values
     */
    public static Collection<PublicIPPrefixSkuName> values() {
        return values(PublicIPPrefixSkuName.class);
    }
}
