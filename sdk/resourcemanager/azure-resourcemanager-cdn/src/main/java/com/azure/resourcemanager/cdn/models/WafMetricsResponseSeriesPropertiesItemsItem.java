// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WafMetricsResponseSeriesPropertiesItemsItem model. */
@Fluent
public final class WafMetricsResponseSeriesPropertiesItemsItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WafMetricsResponseSeriesPropertiesItemsItem.class);

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the WafMetricsResponseSeriesPropertiesItemsItem object itself.
     */
    public WafMetricsResponseSeriesPropertiesItemsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the WafMetricsResponseSeriesPropertiesItemsItem object itself.
     */
    public WafMetricsResponseSeriesPropertiesItemsItem withValue(String value) {
        this.value = value;
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
