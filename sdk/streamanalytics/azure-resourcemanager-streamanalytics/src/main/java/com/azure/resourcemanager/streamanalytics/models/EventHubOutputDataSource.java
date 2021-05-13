// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes an Event Hub output data source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Microsoft.ServiceBus/EventHub")
@JsonFlatten
@Fluent
public class EventHubOutputDataSource extends OutputDataSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventHubOutputDataSource.class);

    /*
     * The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties.serviceBusNamespace")
    private String serviceBusNamespace;

    /*
     * The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.sharedAccessPolicyName")
    private String sharedAccessPolicyName;

    /*
     * The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.sharedAccessPolicyKey")
    private String sharedAccessPolicyKey;

    /*
     * Authentication Mode.
     */
    @JsonProperty(value = "properties.authenticationMode")
    private AuthenticationMode authenticationMode;

    /*
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.eventHubName")
    private String eventHubName;

    /*
     * The key/column that is used to determine to which partition to send
     * event data.
     */
    @JsonProperty(value = "properties.partitionKey")
    private String partitionKey;

    /*
     * The propertyColumns property.
     */
    @JsonProperty(value = "properties.propertyColumns")
    private List<String> propertyColumns;

    /**
     * Get the serviceBusNamespace property: The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @return the serviceBusNamespace value.
     */
    public String serviceBusNamespace() {
        return this.serviceBusNamespace;
    }

    /**
     * Set the serviceBusNamespace property: The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @param serviceBusNamespace the serviceBusNamespace value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withServiceBusNamespace(String serviceBusNamespace) {
        this.serviceBusNamespace = serviceBusNamespace;
        return this;
    }

    /**
     * Get the sharedAccessPolicyName property: The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @return the sharedAccessPolicyName value.
     */
    public String sharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }

    /**
     * Set the sharedAccessPolicyName property: The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @param sharedAccessPolicyName the sharedAccessPolicyName value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withSharedAccessPolicyName(String sharedAccessPolicyName) {
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        return this;
    }

    /**
     * Get the sharedAccessPolicyKey property: The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     *
     * @return the sharedAccessPolicyKey value.
     */
    public String sharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey;
    }

    /**
     * Set the sharedAccessPolicyKey property: The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     *
     * @param sharedAccessPolicyKey the sharedAccessPolicyKey value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withSharedAccessPolicyKey(String sharedAccessPolicyKey) {
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        return this;
    }

    /**
     * Get the authenticationMode property: Authentication Mode.
     *
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set the authenticationMode property: Authentication Mode.
     *
     * @param authenticationMode the authenticationMode value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    /**
     * Get the eventHubName property: The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     *
     * @return the eventHubName value.
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * Set the eventHubName property: The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     *
     * @param eventHubName the eventHubName value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Get the partitionKey property: The key/column that is used to determine to which partition to send event data.
     *
     * @return the partitionKey value.
     */
    public String partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set the partitionKey property: The key/column that is used to determine to which partition to send event data.
     *
     * @param partitionKey the partitionKey value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Get the propertyColumns property: The propertyColumns property.
     *
     * @return the propertyColumns value.
     */
    public List<String> propertyColumns() {
        return this.propertyColumns;
    }

    /**
     * Set the propertyColumns property: The propertyColumns property.
     *
     * @param propertyColumns the propertyColumns value to set.
     * @return the EventHubOutputDataSource object itself.
     */
    public EventHubOutputDataSource withPropertyColumns(List<String> propertyColumns) {
        this.propertyColumns = propertyColumns;
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
    }
}
