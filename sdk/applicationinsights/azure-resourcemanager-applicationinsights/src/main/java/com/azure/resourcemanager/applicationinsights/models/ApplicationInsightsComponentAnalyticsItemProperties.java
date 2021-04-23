// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A set of properties that can be defined in the context of a specific item type. Each type may have its own
 * properties.
 */
@Fluent
public final class ApplicationInsightsComponentAnalyticsItemProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationInsightsComponentAnalyticsItemProperties.class);

    /*
     * A function alias, used when the type of the item is Function
     */
    @JsonProperty(value = "functionAlias")
    private String functionAlias;

    /**
     * Get the functionAlias property: A function alias, used when the type of the item is Function.
     *
     * @return the functionAlias value.
     */
    public String functionAlias() {
        return this.functionAlias;
    }

    /**
     * Set the functionAlias property: A function alias, used when the type of the item is Function.
     *
     * @param functionAlias the functionAlias value to set.
     * @return the ApplicationInsightsComponentAnalyticsItemProperties object itself.
     */
    public ApplicationInsightsComponentAnalyticsItemProperties withFunctionAlias(String functionAlias) {
        this.functionAlias = functionAlias;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
