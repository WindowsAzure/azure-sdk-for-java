// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OperationMetaMetricSpecification model. */
@Fluent
public final class OperationMetaMetricSpecification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationMetaMetricSpecification.class);

    /*
     * The name for OperationMetaMetricSpecification.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The displayName for OperationMetaMetricSpecification.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * The displayName for OperationMetaMetricSpecification.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The unit for OperationMetaMetricSpecification.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * The aggregationType for OperationMetaMetricSpecification.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /*
     * The availabilities for OperationMetaMetricSpecification.
     */
    @JsonProperty(value = "availabilities")
    private List<OperationMetaMetricAvailabilitiesSpecification> availabilities;

    /**
     * Get the name property: The name for OperationMetaMetricSpecification.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name for OperationMetaMetricSpecification.
     *
     * @param name the name value to set.
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayDescription property: The displayName for OperationMetaMetricSpecification.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: The displayName for OperationMetaMetricSpecification.
     *
     * @param displayDescription the displayDescription value to set.
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the displayName property: The displayName for OperationMetaMetricSpecification.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName for OperationMetaMetricSpecification.
     *
     * @param displayName the displayName value to set.
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the unit property: The unit for OperationMetaMetricSpecification.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit for OperationMetaMetricSpecification.
     *
     * @param unit the unit value to set.
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: The aggregationType for OperationMetaMetricSpecification.
     *
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: The aggregationType for OperationMetaMetricSpecification.
     *
     * @param aggregationType the aggregationType value to set.
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the availabilities property: The availabilities for OperationMetaMetricSpecification.
     *
     * @return the availabilities value.
     */
    public List<OperationMetaMetricAvailabilitiesSpecification> availabilities() {
        return this.availabilities;
    }

    /**
     * Set the availabilities property: The availabilities for OperationMetaMetricSpecification.
     *
     * @param availabilities the availabilities value to set.
     * @return the OperationMetaMetricSpecification object itself.
     */
    public OperationMetaMetricSpecification withAvailabilities(
        List<OperationMetaMetricAvailabilitiesSpecification> availabilities) {
        this.availabilities = availabilities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availabilities() != null) {
            availabilities().forEach(e -> e.validate());
        }
    }
}
