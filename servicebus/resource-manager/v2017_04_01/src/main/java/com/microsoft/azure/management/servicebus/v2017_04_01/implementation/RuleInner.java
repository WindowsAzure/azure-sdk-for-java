/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01.implementation;

import com.microsoft.azure.management.servicebus.v2017_04_01.Action;
import com.microsoft.azure.management.servicebus.v2017_04_01.FilterType;
import com.microsoft.azure.management.servicebus.v2017_04_01.SqlFilter;
import com.microsoft.azure.management.servicebus.v2017_04_01.CorrelationFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Description of Rule Resource.
 */
@JsonFlatten
public class RuleInner extends ProxyResource {
    /**
     * Represents the filter actions which are allowed for the transformation
     * of a message that have been matched by a filter expression.
     */
    @JsonProperty(value = "properties.action")
    private Action action;

    /**
     * Filter type that is evaluated against a BrokeredMessage. Possible values
     * include: 'SqlFilter', 'CorrelationFilter'.
     */
    @JsonProperty(value = "properties.filterType")
    private FilterType filterType;

    /**
     * Properties of sqlFilter.
     */
    @JsonProperty(value = "properties.sqlFilter")
    private SqlFilter sqlFilter;

    /**
     * Properties of correlationFilter.
     */
    @JsonProperty(value = "properties.correlationFilter")
    private CorrelationFilter correlationFilter;

    /**
     * Get represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression.
     *
     * @return the action value
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression.
     *
     * @param action the action value to set
     * @return the RuleInner object itself.
     */
    public RuleInner withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Get filter type that is evaluated against a BrokeredMessage. Possible values include: 'SqlFilter', 'CorrelationFilter'.
     *
     * @return the filterType value
     */
    public FilterType filterType() {
        return this.filterType;
    }

    /**
     * Set filter type that is evaluated against a BrokeredMessage. Possible values include: 'SqlFilter', 'CorrelationFilter'.
     *
     * @param filterType the filterType value to set
     * @return the RuleInner object itself.
     */
    public RuleInner withFilterType(FilterType filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * Get properties of sqlFilter.
     *
     * @return the sqlFilter value
     */
    public SqlFilter sqlFilter() {
        return this.sqlFilter;
    }

    /**
     * Set properties of sqlFilter.
     *
     * @param sqlFilter the sqlFilter value to set
     * @return the RuleInner object itself.
     */
    public RuleInner withSqlFilter(SqlFilter sqlFilter) {
        this.sqlFilter = sqlFilter;
        return this;
    }

    /**
     * Get properties of correlationFilter.
     *
     * @return the correlationFilter value
     */
    public CorrelationFilter correlationFilter() {
        return this.correlationFilter;
    }

    /**
     * Set properties of correlationFilter.
     *
     * @param correlationFilter the correlationFilter value to set
     * @return the RuleInner object itself.
     */
    public RuleInner withCorrelationFilter(CorrelationFilter correlationFilter) {
        this.correlationFilter = correlationFilter;
        return this;
    }

}
