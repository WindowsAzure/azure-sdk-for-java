/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_05_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AzureSkuTier.
 */
public final class AzureSkuTier extends ExpandableStringEnum<AzureSkuTier> {
    /** Static value Basic for AzureSkuTier. */
    public static final AzureSkuTier BASIC = fromString("Basic");

    /** Static value Standard for AzureSkuTier. */
    public static final AzureSkuTier STANDARD = fromString("Standard");

    /**
     * Creates or finds a AzureSkuTier from its string representation.
     * @param name a name to look for
     * @return the corresponding AzureSkuTier
     */
    @JsonCreator
    public static AzureSkuTier fromString(String name) {
        return fromString(name, AzureSkuTier.class);
    }

    /**
     * @return known AzureSkuTier values
     */
    public static Collection<AzureSkuTier> values() {
        return values(AzureSkuTier.class);
    }
}
