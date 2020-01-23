/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NumberLessThanOrEquals Advanced Filter.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operatorType", defaultImpl = NumberLessThanOrEqualsAdvancedFilter.class)
@JsonTypeName("NumberLessThanOrEquals")
public class NumberLessThanOrEqualsAdvancedFilter extends AdvancedFilter {
    /**
     * The filter value.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Get the filter value.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the filter value.
     *
     * @param value the value value to set
     * @return the NumberLessThanOrEqualsAdvancedFilter object itself.
     */
    public NumberLessThanOrEqualsAdvancedFilter withValue(Double value) {
        this.value = value;
        return this;
    }

}
