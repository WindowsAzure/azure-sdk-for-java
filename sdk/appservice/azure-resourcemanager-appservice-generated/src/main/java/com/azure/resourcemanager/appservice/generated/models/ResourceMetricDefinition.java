// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.ResourceMetricDefinitionInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ResourceMetricDefinition. */
public interface ResourceMetricDefinition {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the unit property: Unit of the metric.
     *
     * @return the unit value.
     */
    String unit();

    /**
     * Gets the primaryAggregationType property: Primary aggregation type.
     *
     * @return the primaryAggregationType value.
     */
    String primaryAggregationType();

    /**
     * Gets the metricAvailabilities property: List of time grains supported for the metric together with retention
     * period.
     *
     * @return the metricAvailabilities value.
     */
    List<ResourceMetricAvailability> metricAvailabilities();

    /**
     * Gets the resourceUri property: Resource URI.
     *
     * @return the resourceUri value.
     */
    String resourceUri();

    /**
     * Gets the properties property: Resource metric definition properties.
     *
     * @return the properties value.
     */
    Map<String, String> properties();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.ResourceMetricDefinitionInner object.
     *
     * @return the inner object.
     */
    ResourceMetricDefinitionInner innerModel();
}
