// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the IoTHub event source that are required on create or update requests. */
@Fluent
public final class IoTHubEventSourceCreationProperties extends IoTHubEventSourceCommonProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IoTHubEventSourceCreationProperties.class);

    /*
     * The value of the Shared Access Policy key that grants the Time Series
     * Insights service read access to the iot hub. This property is not shown
     * in event source responses.
     */
    @JsonProperty(value = "sharedAccessKey", required = true)
    private String sharedAccessKey;

    /**
     * Get the sharedAccessKey property: The value of the Shared Access Policy key that grants the Time Series Insights
     * service read access to the iot hub. This property is not shown in event source responses.
     *
     * @return the sharedAccessKey value.
     */
    public String sharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Set the sharedAccessKey property: The value of the Shared Access Policy key that grants the Time Series Insights
     * service read access to the iot hub. This property is not shown in event source responses.
     *
     * @param sharedAccessKey the sharedAccessKey value to set.
     * @return the IoTHubEventSourceCreationProperties object itself.
     */
    public IoTHubEventSourceCreationProperties withSharedAccessKey(String sharedAccessKey) {
        this.sharedAccessKey = sharedAccessKey;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IoTHubEventSourceCreationProperties withIotHubName(String iotHubName) {
        super.withIotHubName(iotHubName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IoTHubEventSourceCreationProperties withConsumerGroupName(String consumerGroupName) {
        super.withConsumerGroupName(consumerGroupName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IoTHubEventSourceCreationProperties withKeyName(String keyName) {
        super.withKeyName(keyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IoTHubEventSourceCreationProperties withEventSourceResourceId(String eventSourceResourceId) {
        super.withEventSourceResourceId(eventSourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IoTHubEventSourceCreationProperties withTimestampPropertyName(String timestampPropertyName) {
        super.withTimestampPropertyName(timestampPropertyName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (sharedAccessKey() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sharedAccessKey in model IoTHubEventSourceCreationProperties"));
        }
    }
}
