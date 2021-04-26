// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents a Query Statistic. */
@JsonFlatten
@Fluent
public class QueryStatisticInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryStatisticInner.class);

    /*
     * Database query identifier.
     */
    @JsonProperty(value = "properties.queryId")
    private String queryId;

    /*
     * Observation start time.
     */
    @JsonProperty(value = "properties.startTime")
    private OffsetDateTime startTime;

    /*
     * Observation end time.
     */
    @JsonProperty(value = "properties.endTime")
    private OffsetDateTime endTime;

    /*
     * Aggregation function name.
     */
    @JsonProperty(value = "properties.aggregationFunction")
    private String aggregationFunction;

    /*
     * The list of database names.
     */
    @JsonProperty(value = "properties.databaseNames")
    private List<String> databaseNames;

    /*
     * Number of query executions in this time interval.
     */
    @JsonProperty(value = "properties.queryExecutionCount")
    private Long queryExecutionCount;

    /*
     * Metric name.
     */
    @JsonProperty(value = "properties.metricName")
    private String metricName;

    /*
     * Metric display name.
     */
    @JsonProperty(value = "properties.metricDisplayName")
    private String metricDisplayName;

    /*
     * Metric value.
     */
    @JsonProperty(value = "properties.metricValue")
    private Double metricValue;

    /*
     * Metric value unit.
     */
    @JsonProperty(value = "properties.metricValueUnit")
    private String metricValueUnit;

    /**
     * Get the queryId property: Database query identifier.
     *
     * @return the queryId value.
     */
    public String queryId() {
        return this.queryId;
    }

    /**
     * Set the queryId property: Database query identifier.
     *
     * @param queryId the queryId value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * Get the startTime property: Observation start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Observation start time.
     *
     * @param startTime the startTime value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Observation end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Observation end time.
     *
     * @param endTime the endTime value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the aggregationFunction property: Aggregation function name.
     *
     * @return the aggregationFunction value.
     */
    public String aggregationFunction() {
        return this.aggregationFunction;
    }

    /**
     * Set the aggregationFunction property: Aggregation function name.
     *
     * @param aggregationFunction the aggregationFunction value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withAggregationFunction(String aggregationFunction) {
        this.aggregationFunction = aggregationFunction;
        return this;
    }

    /**
     * Get the databaseNames property: The list of database names.
     *
     * @return the databaseNames value.
     */
    public List<String> databaseNames() {
        return this.databaseNames;
    }

    /**
     * Set the databaseNames property: The list of database names.
     *
     * @param databaseNames the databaseNames value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withDatabaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }

    /**
     * Get the queryExecutionCount property: Number of query executions in this time interval.
     *
     * @return the queryExecutionCount value.
     */
    public Long queryExecutionCount() {
        return this.queryExecutionCount;
    }

    /**
     * Set the queryExecutionCount property: Number of query executions in this time interval.
     *
     * @param queryExecutionCount the queryExecutionCount value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withQueryExecutionCount(Long queryExecutionCount) {
        this.queryExecutionCount = queryExecutionCount;
        return this;
    }

    /**
     * Get the metricName property: Metric name.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: Metric name.
     *
     * @param metricName the metricName value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the metricDisplayName property: Metric display name.
     *
     * @return the metricDisplayName value.
     */
    public String metricDisplayName() {
        return this.metricDisplayName;
    }

    /**
     * Set the metricDisplayName property: Metric display name.
     *
     * @param metricDisplayName the metricDisplayName value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricDisplayName(String metricDisplayName) {
        this.metricDisplayName = metricDisplayName;
        return this;
    }

    /**
     * Get the metricValue property: Metric value.
     *
     * @return the metricValue value.
     */
    public Double metricValue() {
        return this.metricValue;
    }

    /**
     * Set the metricValue property: Metric value.
     *
     * @param metricValue the metricValue value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricValue(Double metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * Get the metricValueUnit property: Metric value unit.
     *
     * @return the metricValueUnit value.
     */
    public String metricValueUnit() {
        return this.metricValueUnit;
    }

    /**
     * Set the metricValueUnit property: Metric value unit.
     *
     * @param metricValueUnit the metricValueUnit value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricValueUnit(String metricValueUnit) {
        this.metricValueUnit = metricValueUnit;
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
