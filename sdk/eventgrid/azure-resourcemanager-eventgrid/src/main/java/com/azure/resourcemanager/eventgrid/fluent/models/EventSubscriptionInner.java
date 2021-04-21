// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.models.DeadLetterDestination;
import com.azure.resourcemanager.eventgrid.models.EventDeliverySchema;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionDestination;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionFilter;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionProvisioningState;
import com.azure.resourcemanager.eventgrid.models.RetryPolicy;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Event Subscription. */
@JsonFlatten
@Fluent
public class EventSubscriptionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventSubscriptionInner.class);

    /*
     * The system metadata relating to Event Subscription resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Name of the topic of the event subscription.
     */
    @JsonProperty(value = "properties.topic", access = JsonProperty.Access.WRITE_ONLY)
    private String topic;

    /*
     * Provisioning state of the event subscription.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EventSubscriptionProvisioningState provisioningState;

    /*
     * Information about the destination where events have to be delivered for
     * the event subscription.
     */
    @JsonProperty(value = "properties.destination")
    private EventSubscriptionDestination destination;

    /*
     * Information about the filter for the event subscription.
     */
    @JsonProperty(value = "properties.filter")
    private EventSubscriptionFilter filter;

    /*
     * List of user defined labels.
     */
    @JsonProperty(value = "properties.labels")
    private List<String> labels;

    /*
     * Expiration time of the event subscription.
     */
    @JsonProperty(value = "properties.expirationTimeUtc")
    private OffsetDateTime expirationTimeUtc;

    /*
     * The event delivery schema for the event subscription.
     */
    @JsonProperty(value = "properties.eventDeliverySchema")
    private EventDeliverySchema eventDeliverySchema;

    /*
     * The retry policy for events. This can be used to configure maximum
     * number of delivery attempts and time to live for events.
     */
    @JsonProperty(value = "properties.retryPolicy")
    private RetryPolicy retryPolicy;

    /*
     * The DeadLetter destination of the event subscription.
     */
    @JsonProperty(value = "properties.deadLetterDestination")
    private DeadLetterDestination deadLetterDestination;

    /**
     * Get the systemData property: The system metadata relating to Event Subscription resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the topic property: Name of the topic of the event subscription.
     *
     * @return the topic value.
     */
    public String topic() {
        return this.topic;
    }

    /**
     * Get the provisioningState property: Provisioning state of the event subscription.
     *
     * @return the provisioningState value.
     */
    public EventSubscriptionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the destination property: Information about the destination where events have to be delivered for the event
     * subscription.
     *
     * @return the destination value.
     */
    public EventSubscriptionDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Information about the destination where events have to be delivered for the event
     * subscription.
     *
     * @param destination the destination value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withDestination(EventSubscriptionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the filter property: Information about the filter for the event subscription.
     *
     * @return the filter value.
     */
    public EventSubscriptionFilter filter() {
        return this.filter;
    }

    /**
     * Set the filter property: Information about the filter for the event subscription.
     *
     * @param filter the filter value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withFilter(EventSubscriptionFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the labels property: List of user defined labels.
     *
     * @return the labels value.
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the labels property: List of user defined labels.
     *
     * @param labels the labels value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the expirationTimeUtc property: Expiration time of the event subscription.
     *
     * @return the expirationTimeUtc value.
     */
    public OffsetDateTime expirationTimeUtc() {
        return this.expirationTimeUtc;
    }

    /**
     * Set the expirationTimeUtc property: Expiration time of the event subscription.
     *
     * @param expirationTimeUtc the expirationTimeUtc value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withExpirationTimeUtc(OffsetDateTime expirationTimeUtc) {
        this.expirationTimeUtc = expirationTimeUtc;
        return this;
    }

    /**
     * Get the eventDeliverySchema property: The event delivery schema for the event subscription.
     *
     * @return the eventDeliverySchema value.
     */
    public EventDeliverySchema eventDeliverySchema() {
        return this.eventDeliverySchema;
    }

    /**
     * Set the eventDeliverySchema property: The event delivery schema for the event subscription.
     *
     * @param eventDeliverySchema the eventDeliverySchema value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withEventDeliverySchema(EventDeliverySchema eventDeliverySchema) {
        this.eventDeliverySchema = eventDeliverySchema;
        return this;
    }

    /**
     * Get the retryPolicy property: The retry policy for events. This can be used to configure maximum number of
     * delivery attempts and time to live for events.
     *
     * @return the retryPolicy value.
     */
    public RetryPolicy retryPolicy() {
        return this.retryPolicy;
    }

    /**
     * Set the retryPolicy property: The retry policy for events. This can be used to configure maximum number of
     * delivery attempts and time to live for events.
     *
     * @param retryPolicy the retryPolicy value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Get the deadLetterDestination property: The DeadLetter destination of the event subscription.
     *
     * @return the deadLetterDestination value.
     */
    public DeadLetterDestination deadLetterDestination() {
        return this.deadLetterDestination;
    }

    /**
     * Set the deadLetterDestination property: The DeadLetter destination of the event subscription.
     *
     * @param deadLetterDestination the deadLetterDestination value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withDeadLetterDestination(DeadLetterDestination deadLetterDestination) {
        this.deadLetterDestination = deadLetterDestination;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (destination() != null) {
            destination().validate();
        }
        if (filter() != null) {
            filter().validate();
        }
        if (retryPolicy() != null) {
            retryPolicy().validate();
        }
        if (deadLetterDestination() != null) {
            deadLetterDestination().validate();
        }
    }
}
