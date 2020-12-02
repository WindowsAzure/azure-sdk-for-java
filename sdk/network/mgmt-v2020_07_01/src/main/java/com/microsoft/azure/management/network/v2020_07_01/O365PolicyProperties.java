/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Office365 breakout policy.
 */
public class O365PolicyProperties {
    /**
     * Office365 breakout categories.
     */
    @JsonProperty(value = "breakOutCategories")
    private O365BreakOutCategoryPolicies breakOutCategories;

    /**
     * Get office365 breakout categories.
     *
     * @return the breakOutCategories value
     */
    public O365BreakOutCategoryPolicies breakOutCategories() {
        return this.breakOutCategories;
    }

    /**
     * Set office365 breakout categories.
     *
     * @param breakOutCategories the breakOutCategories value to set
     * @return the O365PolicyProperties object itself.
     */
    public O365PolicyProperties withBreakOutCategories(O365BreakOutCategoryPolicies breakOutCategories) {
        this.breakOutCategories = breakOutCategories;
        return this;
    }

}
