/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network Virtual Appliance Sku Properties.
 */
public class Office365PolicyProperties {
    /**
     * Office 365 breakout categories.
     */
    @JsonProperty(value = "breakOutCategories")
    private BreakOutCategoryPolicies breakOutCategories;

    /**
     * Get office 365 breakout categories.
     *
     * @return the breakOutCategories value
     */
    public BreakOutCategoryPolicies breakOutCategories() {
        return this.breakOutCategories;
    }

    /**
     * Set office 365 breakout categories.
     *
     * @param breakOutCategories the breakOutCategories value to set
     * @return the Office365PolicyProperties object itself.
     */
    public Office365PolicyProperties withBreakOutCategories(BreakOutCategoryPolicies breakOutCategories) {
        this.breakOutCategories = breakOutCategories;
        return this;
    }

}
