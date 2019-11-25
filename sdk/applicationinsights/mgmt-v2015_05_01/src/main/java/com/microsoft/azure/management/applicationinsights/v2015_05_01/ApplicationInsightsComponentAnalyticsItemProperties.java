/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A set of properties that can be defined in the context of a specific item
 * type. Each type may have its own properties.
 */
public class ApplicationInsightsComponentAnalyticsItemProperties {
    /**
     * A function alias, used when the type of the item is Function.
     */
    @JsonProperty(value = "functionAlias")
    private String functionAlias;

    /**
     * Get a function alias, used when the type of the item is Function.
     *
     * @return the functionAlias value
     */
    public String functionAlias() {
        return this.functionAlias;
    }

    /**
     * Set a function alias, used when the type of the item is Function.
     *
     * @param functionAlias the functionAlias value to set
     * @return the ApplicationInsightsComponentAnalyticsItemProperties object itself.
     */
    public ApplicationInsightsComponentAnalyticsItemProperties withFunctionAlias(String functionAlias) {
        this.functionAlias = functionAlias;
        return this;
    }

}
