/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the IoTHub event source.
 */
public class IoTHubEventSourceCommonProperties extends AzureEventSourceProperties {
    /**
     * The name of the iot hub.
     */
    @JsonProperty(value = "iotHubName", required = true)
    private String iotHubName;

    /**
     * The name of the iot hub's consumer group that holds the partitions from
     * which events will be read.
     */
    @JsonProperty(value = "consumerGroupName", required = true)
    private String consumerGroupName;

    /**
     * The name of the Shared Access Policy key that grants the Time Series
     * Insights service access to the iot hub. This shared access policy key
     * must grant 'service connect' permissions to the iot hub.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * Get the name of the iot hub.
     *
     * @return the iotHubName value
     */
    public String iotHubName() {
        return this.iotHubName;
    }

    /**
     * Set the name of the iot hub.
     *
     * @param iotHubName the iotHubName value to set
     * @return the IoTHubEventSourceCommonProperties object itself.
     */
    public IoTHubEventSourceCommonProperties withIotHubName(String iotHubName) {
        this.iotHubName = iotHubName;
        return this;
    }

    /**
     * Get the name of the iot hub's consumer group that holds the partitions from which events will be read.
     *
     * @return the consumerGroupName value
     */
    public String consumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * Set the name of the iot hub's consumer group that holds the partitions from which events will be read.
     *
     * @param consumerGroupName the consumerGroupName value to set
     * @return the IoTHubEventSourceCommonProperties object itself.
     */
    public IoTHubEventSourceCommonProperties withConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }

    /**
     * Get the name of the Shared Access Policy key that grants the Time Series Insights service access to the iot hub. This shared access policy key must grant 'service connect' permissions to the iot hub.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the name of the Shared Access Policy key that grants the Time Series Insights service access to the iot hub. This shared access policy key must grant 'service connect' permissions to the iot hub.
     *
     * @param keyName the keyName value to set
     * @return the IoTHubEventSourceCommonProperties object itself.
     */
    public IoTHubEventSourceCommonProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

}
