/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProductType.
 */
public final class ProductType extends ExpandableStringEnum<ProductType> {
    /** Static value AzureSubscription for ProductType. */
    public static final ProductType AZURE_SUBSCRIPTION = fromString("AzureSubscription");

    /** Static value AzureReservation for ProductType. */
    public static final ProductType AZURE_RESERVATION = fromString("AzureReservation");

    /**
     * Creates or finds a ProductType from its string representation.
     * @param name a name to look for
     * @return the corresponding ProductType
     */
    @JsonCreator
    public static ProductType fromString(String name) {
        return fromString(name, ProductType.class);
    }

    /**
     * @return known ProductType values
     */
    public static Collection<ProductType> values() {
        return values(ProductType.class);
    }
}
