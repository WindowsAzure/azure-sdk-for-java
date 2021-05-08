// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/** Properties used to create a Gen1 environment. */
@Fluent
public class Gen1EnvironmentCreationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Gen1EnvironmentCreationProperties.class);

    /*
     * ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     */
    @JsonProperty(value = "dataRetentionTime", required = true)
    private Duration dataRetentionTime;

    /*
     * The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is
     * specified, new events will not be read from the event source. If
     * "PurgeOldData" is specified, new events will continue to be read and old
     * events will be deleted from the environment. The default behavior is
     * PurgeOldData.
     */
    @JsonProperty(value = "storageLimitExceededBehavior")
    private StorageLimitExceededBehavior storageLimitExceededBehavior;

    /*
     * The list of event properties which will be used to partition data in the
     * environment. Currently, only a single partition key property is
     * supported.
     */
    @JsonProperty(value = "partitionKeyProperties")
    private List<TimeSeriesIdProperty> partitionKeyProperties;

    /**
     * Get the dataRetentionTime property: ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     *
     * @return the dataRetentionTime value.
     */
    public Duration dataRetentionTime() {
        return this.dataRetentionTime;
    }

    /**
     * Set the dataRetentionTime property: ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     *
     * @param dataRetentionTime the dataRetentionTime value to set.
     * @return the Gen1EnvironmentCreationProperties object itself.
     */
    public Gen1EnvironmentCreationProperties withDataRetentionTime(Duration dataRetentionTime) {
        this.dataRetentionTime = dataRetentionTime;
        return this;
    }

    /**
     * Get the storageLimitExceededBehavior property: The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the
     * event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted
     * from the environment. The default behavior is PurgeOldData.
     *
     * @return the storageLimitExceededBehavior value.
     */
    public StorageLimitExceededBehavior storageLimitExceededBehavior() {
        return this.storageLimitExceededBehavior;
    }

    /**
     * Set the storageLimitExceededBehavior property: The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the
     * event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted
     * from the environment. The default behavior is PurgeOldData.
     *
     * @param storageLimitExceededBehavior the storageLimitExceededBehavior value to set.
     * @return the Gen1EnvironmentCreationProperties object itself.
     */
    public Gen1EnvironmentCreationProperties withStorageLimitExceededBehavior(
        StorageLimitExceededBehavior storageLimitExceededBehavior) {
        this.storageLimitExceededBehavior = storageLimitExceededBehavior;
        return this;
    }

    /**
     * Get the partitionKeyProperties property: The list of event properties which will be used to partition data in the
     * environment. Currently, only a single partition key property is supported.
     *
     * @return the partitionKeyProperties value.
     */
    public List<TimeSeriesIdProperty> partitionKeyProperties() {
        return this.partitionKeyProperties;
    }

    /**
     * Set the partitionKeyProperties property: The list of event properties which will be used to partition data in the
     * environment. Currently, only a single partition key property is supported.
     *
     * @param partitionKeyProperties the partitionKeyProperties value to set.
     * @return the Gen1EnvironmentCreationProperties object itself.
     */
    public Gen1EnvironmentCreationProperties withPartitionKeyProperties(
        List<TimeSeriesIdProperty> partitionKeyProperties) {
        this.partitionKeyProperties = partitionKeyProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataRetentionTime() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataRetentionTime in model Gen1EnvironmentCreationProperties"));
        }
        if (partitionKeyProperties() != null) {
            partitionKeyProperties().forEach(e -> e.validate());
        }
    }
}
