// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Office365 breakout policy. */
@Fluent
public final class O365PolicyProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(O365PolicyProperties.class);

    /*
     * Office365 breakout categories.
     */
    @JsonProperty(value = "breakOutCategories")
    private O365BreakOutCategoryPolicies breakOutCategories;

    /**
     * Get the breakOutCategories property: Office365 breakout categories.
     *
     * @return the breakOutCategories value.
     */
    public O365BreakOutCategoryPolicies breakOutCategories() {
        return this.breakOutCategories;
    }

    /**
     * Set the breakOutCategories property: Office365 breakout categories.
     *
     * @param breakOutCategories the breakOutCategories value to set.
     * @return the O365PolicyProperties object itself.
     */
    public O365PolicyProperties withBreakOutCategories(O365BreakOutCategoryPolicies breakOutCategories) {
        this.breakOutCategories = breakOutCategories;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (breakOutCategories() != null) {
            breakOutCategories().validate();
        }
    }
}
