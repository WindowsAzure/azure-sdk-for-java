// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** The MetricAlertCriteria model. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "odata\\.type",
    defaultImpl = MetricAlertCriteria.class)
@JsonTypeName("MetricAlertCriteria")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria",
        value = MetricAlertSingleResourceMultipleMetricCriteria.class),
    @JsonSubTypes.Type(
        name = "Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria",
        value = MetricAlertMultipleResourceMultipleMetricCriteria.class)
})
@JsonFlatten
@Fluent
public class MetricAlertCriteria {
    /*
     * The rule criteria that defines the conditions of the alert rule.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the additionalProperties property: The rule criteria that defines the conditions of the alert rule.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The rule criteria that defines the conditions of the alert rule.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MetricAlertCriteria object itself.
     */
    public MetricAlertCriteria withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
