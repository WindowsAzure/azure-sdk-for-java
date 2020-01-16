/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StringEndsWith Advanced Filter.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operatorType", defaultImpl = StringEndsWithAdvancedFilter.class)
@JsonTypeName("StringEndsWith")
public class StringEndsWithAdvancedFilter extends AdvancedFilter {
    /**
     * The set of filter values.
     */
    @JsonProperty(value = "values")
    private List<String> values;

    /**
     * Get the set of filter values.
     *
     * @return the values value
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the set of filter values.
     *
     * @param values the values value to set
     * @return the StringEndsWithAdvancedFilter object itself.
     */
    public StringEndsWithAdvancedFilter withValues(List<String> values) {
        this.values = values;
        return this;
    }

}
