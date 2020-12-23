// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.TimeSeriesElement;
import com.azure.resourcemanager.monitor.generated.models.Unit;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result data of a query. */
@Fluent
public final class MetricInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricInner.class);

    /*
     * the metric Id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * the resource type of the metric resource.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * the name and the display name of the metric, i.e. it is localizable
     * string.
     */
    @JsonProperty(value = "name", required = true)
    private LocalizableStringInner name;

    /*
     * the unit of the metric.
     */
    @JsonProperty(value = "unit", required = true)
    private Unit unit;

    /*
     * the time series returned when a data query is performed.
     */
    @JsonProperty(value = "timeseries", required = true)
    private List<TimeSeriesElement> timeseries;

    /**
     * Get the id property: the metric Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: the metric Id.
     *
     * @param id the id value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: the resource type of the metric resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: the resource type of the metric resource.
     *
     * @param type the type value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: the name and the display name of the metric, i.e. it is localizable string.
     *
     * @return the name value.
     */
    public LocalizableStringInner name() {
        return this.name;
    }

    /**
     * Set the name property: the name and the display name of the metric, i.e. it is localizable string.
     *
     * @param name the name value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withName(LocalizableStringInner name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit property: the unit of the metric.
     *
     * @return the unit value.
     */
    public Unit unit() {
        return this.unit;
    }

    /**
     * Set the unit property: the unit of the metric.
     *
     * @param unit the unit value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withUnit(Unit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the timeseries property: the time series returned when a data query is performed.
     *
     * @return the timeseries value.
     */
    public List<TimeSeriesElement> timeseries() {
        return this.timeseries;
    }

    /**
     * Set the timeseries property: the time series returned when a data query is performed.
     *
     * @param timeseries the timeseries value to set.
     * @return the MetricInner object itself.
     */
    public MetricInner withTimeseries(List<TimeSeriesElement> timeseries) {
        this.timeseries = timeseries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property id in model MetricInner"));
        }
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model MetricInner"));
        }
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model MetricInner"));
        } else {
            name().validate();
        }
        if (unit() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property unit in model MetricInner"));
        }
        if (timeseries() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timeseries in model MetricInner"));
        } else {
            timeseries().forEach(e -> e.validate());
        }
    }
}
