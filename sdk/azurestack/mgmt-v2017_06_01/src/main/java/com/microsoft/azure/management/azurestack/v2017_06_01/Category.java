/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Category.
 */
public final class Category extends ExpandableStringEnum<Category> {
    /** Static value AzureAD for Category. */
    public static final Category AZURE_AD = fromString("AzureAD");

    /** Static value ADFS for Category. */
    public static final Category ADFS = fromString("ADFS");

    /**
     * Creates or finds a Category from its string representation.
     * @param name a name to look for
     * @return the corresponding Category
     */
    @JsonCreator
    public static Category fromString(String name) {
        return fromString(name, Category.class);
    }

    /**
     * @return known Category values
     */
    public static Collection<Category> values() {
        return values(Category.class);
    }
}
