/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create or Update Event Source operation for an
 * IoTHub event source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = IoTHubEventSourceCreateOrUpdateParameters.class)
@JsonTypeName("Microsoft.IoTHub")
@JsonFlatten
public class IoTHubEventSourceCreateOrUpdateParameters extends EventSourceCreateOrUpdateParameters {
    /**
     * Provisioning state of the resource. Possible values include: 'Accepted',
     * 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The time the resource was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or
     * empty-string is specified, the event creation time will be used.
     */
    @JsonProperty(value = "properties.timestampPropertyName")
    private String timestampPropertyName;

    /**
     * The resource id of the event source in Azure Resource Manager.
     */
    @JsonProperty(value = "properties.eventSourceResourceId", required = true)
    private String eventSourceResourceId;

    /**
     * The name of the iot hub.
     */
    @JsonProperty(value = "properties.iotHubName", required = true)
    private String iotHubName;

    /**
     * The name of the iot hub's consumer group that holds the partitions from
     * which events will be read.
     */
    @JsonProperty(value = "properties.consumerGroupName", required = true)
    private String consumerGroupName;

    /**
     * The name of the Shared Access Policy key that grants the Time Series
     * Insights service access to the iot hub. This shared access policy key
     * must grant 'service connect' permissions to the iot hub.
     */
    @JsonProperty(value = "properties.keyName", required = true)
    private String keyName;

    /**
     * The value of the Shared Access Policy key that grants the Time Series
     * Insights service read access to the iot hub. This property is not shown
     * in event source responses.
     */
    @JsonProperty(value = "properties.sharedAccessKey", required = true)
    private String sharedAccessKey;

    /**
     * Get provisioning state of the resource. Possible values include: 'Accepted', 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the resource. Possible values include: 'Accepted', 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the IoTHubEventSourceCreateOrUpdateParameters object itself.
     */
    public IoTHubEventSourceCreateOrUpdateParameters withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the time the resource was created.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the event property that will be used as the event source's timestamp. If a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     *
     * @return the timestampPropertyName value
     */
    public String timestampPropertyName() {
        return this.timestampPropertyName;
    }

    /**
     * Set the event property that will be used as the event source's timestamp. If a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     *
     * @param timestampPropertyName the timestampPropertyName value to set
     * @return the IoTHubEventSourceCreateOrUpdateParameters object itself.
     */
    public IoTHubEventSourceCreateOrUpdateParameters withTimestampPropertyName(String timestampPropertyName) {
        this.timestampPropertyName = timestampPropertyName;
        return this;
    }

    /**
     * Get the resource id of the event source in Azure Resource Manager.
     *
     * @return the eventSourceResourceId value
     */
    public String eventSourceResourceId() {
        return this.eventSourceResourceId;
    }

    /**
     * Set the resource id of the event source in Azure Resource Manager.
     *
     * @param eventSourceResourceId the eventSourceResourceId value to set
     * @return the IoTHubEventSourceCreateOrUpdateParameters object itself.
     */
    public IoTHubEventSourceCreateOrUpdateParameters withEventSourceResourceId(String eventSourceResourceId) {
        this.eventSourceResourceId = eventSourceResourceId;
        return this;
    }

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
     * @return the IoTHubEventSourceCreateOrUpdateParameters object itself.
     */
    public IoTHubEventSourceCreateOrUpdateParameters withIotHubName(String iotHubName) {
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
     * @return the IoTHubEventSourceCreateOrUpdateParameters object itself.
     */
    public IoTHubEventSourceCreateOrUpdateParameters withConsumerGroupName(String consumerGroupName) {
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
     * @return the IoTHubEventSourceCreateOrUpdateParameters object itself.
     */
    public IoTHubEventSourceCreateOrUpdateParameters withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the value of the Shared Access Policy key that grants the Time Series Insights service read access to the iot hub. This property is not shown in event source responses.
     *
     * @return the sharedAccessKey value
     */
    public String sharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Set the value of the Shared Access Policy key that grants the Time Series Insights service read access to the iot hub. This property is not shown in event source responses.
     *
     * @param sharedAccessKey the sharedAccessKey value to set
     * @return the IoTHubEventSourceCreateOrUpdateParameters object itself.
     */
    public IoTHubEventSourceCreateOrUpdateParameters withSharedAccessKey(String sharedAccessKey) {
        this.sharedAccessKey = sharedAccessKey;
        return this;
    }

}
