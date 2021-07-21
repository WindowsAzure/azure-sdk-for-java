// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents a Query Statistic. */
@Fluent
public final class QueryStatisticInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryStatisticInner.class);

    /*
     * The properties of a query statistic.
     */
    @JsonProperty(value = "properties")
    private QueryStatisticProperties properties;

    /**
     * Get the properties property: The properties of a query statistic.
     *
     * @return the properties value.
     */
    private QueryStatisticProperties properties() {
        return this.properties;
    }

    /**
     * Get the queryId property: Database query identifier.
     *
     * @return the queryId value.
     */
    public String queryId() {
        return this.properties() == null ? null : this.properties().queryId();
    }

    /**
     * Set the queryId property: Database query identifier.
     *
     * @param queryId the queryId value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withQueryId(String queryId) {
        if (this.properties() == null) {
            this.properties = new QueryStatisticProperties();
        }
        this.properties().withQueryId(queryId);
        return this;
    }

    /**
     * Get the startTime property: Observation start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.properties() == null ? null : this.properties().startTime();
    }

    /**
     * Set the startTime property: Observation start time.
     *
     * @param startTime the startTime value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withStartTime(OffsetDateTime startTime) {
        if (this.properties() == null) {
            this.properties = new QueryStatisticProperties();
        }
        this.properties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: Observation end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.properties() == null ? null : this.properties().endTime();
    }

    /**
     * Set the endTime property: Observation end time.
     *
     * @param endTime the endTime value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withEndTime(OffsetDateTime endTime) {
        if (this.properties() == null) {
            this.properties = new QueryStatisticProperties();
        }
        this.properties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the aggregationFunction property: Aggregation function name.
     *
     * @return the aggregationFunction value.
     */
    public String aggregationFunction() {
        return this.properties() == null ? null : this.properties().aggregationFunction();
    }

    /**
     * Set the aggregationFunction property: Aggregation function name.
     *
     * @param aggregationFunction the aggregationFunction value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withAggregationFunction(String aggregationFunction) {
        if (this.properties() == null) {
            this.properties = new QueryStatisticProperties();
        }
        this.properties().withAggregationFunction(aggregationFunction);
        return this;
    }

    /**
     * Get the databaseNames property: The list of database names.
     *
     * @return the databaseNames value.
     */
    public List<String> databaseNames() {
        return this.properties() == null ? null : this.properties().databaseNames();
    }

    /**
     * Set the databaseNames property: The list of database names.
     *
     * @param databaseNames the databaseNames value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withDatabaseNames(List<String> databaseNames) {
        if (this.properties() == null) {
            this.properties = new QueryStatisticProperties();
        }
        this.properties().withDatabaseNames(databaseNames);
        return this;
    }

    /**
     * Get the queryExecutionCount property: Number of query executions in this time interval.
     *
     * @return the queryExecutionCount value.
     */
    public Long queryExecutionCount() {
        return this.properties() == null ? null : this.properties().queryExecutionCount();
    }

    /**
     * Set the queryExecutionCount property: Number of query executions in this time interval.
     *
     * @param queryExecutionCount the queryExecutionCount value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withQueryExecutionCount(Long queryExecutionCount) {
        if (this.properties() == null) {
            this.properties = new QueryStatisticProperties();
        }
        this.properties().withQueryExecutionCount(queryExecutionCount);
        return this;
    }

    /**
     * Get the metricName property: Metric name.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.properties() == null ? null : this.properties().metricName();
    }

    /**
     * Set the metricName property: Metric name.
     *
     * @param metricName the metricName value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricName(String metricName) {
        if (this.properties() == null) {
            this.properties = new QueryStatisticProperties();
        }
        this.properties().withMetricName(metricName);
        return this;
    }

    /**
     * Get the metricDisplayName property: Metric display name.
     *
     * @return the metricDisplayName value.
     */
    public String metricDisplayName() {
        return this.properties() == null ? null : this.properties().metricDisplayName();
    }

    /**
     * Set the metricDisplayName property: Metric display name.
     *
     * @param metricDisplayName the metricDisplayName value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricDisplayName(String metricDisplayName) {
        if (this.properties() == null) {
            this.properties = new QueryStatisticProperties();
        }
        this.properties().withMetricDisplayName(metricDisplayName);
        return this;
    }

    /**
     * Get the metricValue property: Metric value.
     *
     * @return the metricValue value.
     */
    public Double metricValue() {
        return this.properties() == null ? null : this.properties().metricValue();
    }

    /**
     * Set the metricValue property: Metric value.
     *
     * @param metricValue the metricValue value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricValue(Double metricValue) {
        if (this.properties() == null) {
            this.properties = new QueryStatisticProperties();
        }
        this.properties().withMetricValue(metricValue);
        return this;
    }

    /**
     * Get the metricValueUnit property: Metric value unit.
     *
     * @return the metricValueUnit value.
     */
    public String metricValueUnit() {
        return this.properties() == null ? null : this.properties().metricValueUnit();
    }

    /**
     * Set the metricValueUnit property: Metric value unit.
     *
     * @param metricValueUnit the metricValueUnit value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricValueUnit(String metricValueUnit) {
        if (this.properties() == null) {
            this.properties = new QueryStatisticProperties();
        }
        this.properties().withMetricValueUnit(metricValueUnit);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
