// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.EventSourceResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.Map;

/** An event source that receives its data from an Azure EventHub. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Microsoft.EventHub")
@JsonFlatten
@Fluent
public class EventHubEventSourceResource extends EventSourceResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventHubEventSourceResource.class);

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The time the resource was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or
     * empty-string is specified, the event creation time will be used.
     */
    @JsonProperty(value = "properties.timestampPropertyName")
    private String timestampPropertyName;

    /*
     * The resource id of the event source in Azure Resource Manager.
     */
    @JsonProperty(value = "properties.eventSourceResourceId", required = true)
    private String eventSourceResourceId;

    /*
     * The name of the service bus that contains the event hub.
     */
    @JsonProperty(value = "properties.serviceBusNamespace", required = true)
    private String serviceBusNamespace;

    /*
     * The name of the event hub.
     */
    @JsonProperty(value = "properties.eventHubName", required = true)
    private String eventHubName;

    /*
     * The name of the event hub's consumer group that holds the partitions
     * from which events will be read.
     */
    @JsonProperty(value = "properties.consumerGroupName", required = true)
    private String consumerGroupName;

    /*
     * The name of the SAS key that grants the Time Series Insights service
     * access to the event hub. The shared access policies for this key must
     * grant 'Listen' permissions to the event hub.
     */
    @JsonProperty(value = "properties.keyName", required = true)
    private String keyName;

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the creationTime property: The time the resource was created.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the timestampPropertyName property: The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation
     * time will be used.
     *
     * @return the timestampPropertyName value.
     */
    public String timestampPropertyName() {
        return this.timestampPropertyName;
    }

    /**
     * Set the timestampPropertyName property: The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation
     * time will be used.
     *
     * @param timestampPropertyName the timestampPropertyName value to set.
     * @return the EventHubEventSourceResource object itself.
     */
    public EventHubEventSourceResource withTimestampPropertyName(String timestampPropertyName) {
        this.timestampPropertyName = timestampPropertyName;
        return this;
    }

    /**
     * Get the eventSourceResourceId property: The resource id of the event source in Azure Resource Manager.
     *
     * @return the eventSourceResourceId value.
     */
    public String eventSourceResourceId() {
        return this.eventSourceResourceId;
    }

    /**
     * Set the eventSourceResourceId property: The resource id of the event source in Azure Resource Manager.
     *
     * @param eventSourceResourceId the eventSourceResourceId value to set.
     * @return the EventHubEventSourceResource object itself.
     */
    public EventHubEventSourceResource withEventSourceResourceId(String eventSourceResourceId) {
        this.eventSourceResourceId = eventSourceResourceId;
        return this;
    }

    /**
     * Get the serviceBusNamespace property: The name of the service bus that contains the event hub.
     *
     * @return the serviceBusNamespace value.
     */
    public String serviceBusNamespace() {
        return this.serviceBusNamespace;
    }

    /**
     * Set the serviceBusNamespace property: The name of the service bus that contains the event hub.
     *
     * @param serviceBusNamespace the serviceBusNamespace value to set.
     * @return the EventHubEventSourceResource object itself.
     */
    public EventHubEventSourceResource withServiceBusNamespace(String serviceBusNamespace) {
        this.serviceBusNamespace = serviceBusNamespace;
        return this;
    }

    /**
     * Get the eventHubName property: The name of the event hub.
     *
     * @return the eventHubName value.
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * Set the eventHubName property: The name of the event hub.
     *
     * @param eventHubName the eventHubName value to set.
     * @return the EventHubEventSourceResource object itself.
     */
    public EventHubEventSourceResource withEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Get the consumerGroupName property: The name of the event hub's consumer group that holds the partitions from
     * which events will be read.
     *
     * @return the consumerGroupName value.
     */
    public String consumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * Set the consumerGroupName property: The name of the event hub's consumer group that holds the partitions from
     * which events will be read.
     *
     * @param consumerGroupName the consumerGroupName value to set.
     * @return the EventHubEventSourceResource object itself.
     */
    public EventHubEventSourceResource withConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }

    /**
     * Get the keyName property: The name of the SAS key that grants the Time Series Insights service access to the
     * event hub. The shared access policies for this key must grant 'Listen' permissions to the event hub.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of the SAS key that grants the Time Series Insights service access to the
     * event hub. The shared access policies for this key must grant 'Listen' permissions to the event hub.
     *
     * @param keyName the keyName value to set.
     * @return the EventHubEventSourceResource object itself.
     */
    public EventHubEventSourceResource withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventHubEventSourceResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventHubEventSourceResource withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (eventSourceResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property eventSourceResourceId in model EventHubEventSourceResource"));
        }
        if (serviceBusNamespace() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serviceBusNamespace in model EventHubEventSourceResource"));
        }
        if (eventHubName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property eventHubName in model EventHubEventSourceResource"));
        }
        if (consumerGroupName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property consumerGroupName in model EventHubEventSourceResource"));
        }
        if (keyName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyName in model EventHubEventSourceResource"));
        }
    }
}
