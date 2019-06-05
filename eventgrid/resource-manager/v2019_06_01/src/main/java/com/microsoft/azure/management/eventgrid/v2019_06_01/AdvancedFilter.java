/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * This is the base type that represents an advanced filter. To configure an
 * advanced filter, do not directly instantiate an object of this class.
 * Instead, instantiate an object of a derived class such as
 * BoolEqualsAdvancedFilter, NumberInAdvancedFilter, StringEqualsAdvancedFilter
 * etc. depending on the type of the key based on which you want to filter.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operatorType")
@JsonTypeName("AdvancedFilter")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "NumberIn", value = NumberInAdvancedFilter.class),
    @JsonSubTypes.Type(name = "NumberNotIn", value = NumberNotInAdvancedFilter.class),
    @JsonSubTypes.Type(name = "NumberLessThan", value = NumberLessThanAdvancedFilter.class),
    @JsonSubTypes.Type(name = "NumberGreaterThan", value = NumberGreaterThanAdvancedFilter.class),
    @JsonSubTypes.Type(name = "NumberLessThanOrEquals", value = NumberLessThanOrEqualsAdvancedFilter.class),
    @JsonSubTypes.Type(name = "NumberGreaterThanOrEquals", value = NumberGreaterThanOrEqualsAdvancedFilter.class),
    @JsonSubTypes.Type(name = "BoolEquals", value = BoolEqualsAdvancedFilter.class),
    @JsonSubTypes.Type(name = "StringIn", value = StringInAdvancedFilter.class),
    @JsonSubTypes.Type(name = "StringNotIn", value = StringNotInAdvancedFilter.class),
    @JsonSubTypes.Type(name = "StringBeginsWith", value = StringBeginsWithAdvancedFilter.class),
    @JsonSubTypes.Type(name = "StringEndsWith", value = StringEndsWithAdvancedFilter.class),
    @JsonSubTypes.Type(name = "StringContains", value = StringContainsAdvancedFilter.class)
})
public class AdvancedFilter {
    /**
     * The field/property in the event based on which you want to filter.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get the field/property in the event based on which you want to filter.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the field/property in the event based on which you want to filter.
     *
     * @param key the key value to set
     * @return the AdvancedFilter object itself.
     */
    public AdvancedFilter withKey(String key) {
        this.key = key;
        return this;
    }

}
