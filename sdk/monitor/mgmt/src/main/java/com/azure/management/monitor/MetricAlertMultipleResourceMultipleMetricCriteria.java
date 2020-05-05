// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import java.util.List;

/** The MetricAlertMultipleResourceMultipleMetricCriteria model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria")
@JsonTypeResolver(OdataTypeDiscriminatorTypeResolver.class)
@Fluent
public final class MetricAlertMultipleResourceMultipleMetricCriteria extends MetricAlertCriteria {
    /*
     * the list of multiple metric criteria for this 'all of' operation.
     */
    @JsonProperty(value = "allOf")
    private List<MultiMetricCriteria> allOf;

    /**
     * Get the allOf property: the list of multiple metric criteria for this 'all of' operation.
     *
     * @return the allOf value.
     */
    public List<MultiMetricCriteria> allOf() {
        return this.allOf;
    }

    /**
     * Set the allOf property: the list of multiple metric criteria for this 'all of' operation.
     *
     * @param allOf the allOf value to set.
     * @return the MetricAlertMultipleResourceMultipleMetricCriteria object itself.
     */
    public MetricAlertMultipleResourceMultipleMetricCriteria withAllOf(List<MultiMetricCriteria> allOf) {
        this.allOf = allOf;
        return this;
    }
}
