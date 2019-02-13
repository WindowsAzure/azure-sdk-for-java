/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_09_15_preview;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the Event Subscription update.
 */
public class EventSubscriptionUpdateParameters {
    /**
     * Information about the destination where events have to be delivered for
     * the event subscription.
     */
    @JsonProperty(value = "destination")
    private EventSubscriptionDestination destination;

    /**
     * Information about the filter for the event subscription.
     */
    @JsonProperty(value = "filter")
    private EventSubscriptionFilter filter;

    /**
     * List of user defined labels.
     */
    @JsonProperty(value = "labels")
    private List<String> labels;

    /**
     * Information about the expiration time for the event subscription.
     */
    @JsonProperty(value = "expirationTimeUtc")
    private DateTime expirationTimeUtc;

    /**
     * The event delivery schema for the event subscription. Possible values
     * include: 'EventGridSchema', 'CloudEventV01Schema', 'CustomInputSchema'.
     */
    @JsonProperty(value = "eventDeliverySchema")
    private EventDeliverySchema eventDeliverySchema;

    /**
     * The retry policy for events. This can be used to configure maximum
     * number of delivery attempts and time to live for events.
     */
    @JsonProperty(value = "retryPolicy")
    private RetryPolicy retryPolicy;

    /**
     * The DeadLetter destination of the event subscription.
     */
    @JsonProperty(value = "deadLetterDestination")
    private DeadLetterDestination deadLetterDestination;

    /**
     * Get information about the destination where events have to be delivered for the event subscription.
     *
     * @return the destination value
     */
    public EventSubscriptionDestination destination() {
        return this.destination;
    }

    /**
     * Set information about the destination where events have to be delivered for the event subscription.
     *
     * @param destination the destination value to set
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withDestination(EventSubscriptionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get information about the filter for the event subscription.
     *
     * @return the filter value
     */
    public EventSubscriptionFilter filter() {
        return this.filter;
    }

    /**
     * Set information about the filter for the event subscription.
     *
     * @param filter the filter value to set
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withFilter(EventSubscriptionFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get list of user defined labels.
     *
     * @return the labels value
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set list of user defined labels.
     *
     * @param labels the labels value to set
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get information about the expiration time for the event subscription.
     *
     * @return the expirationTimeUtc value
     */
    public DateTime expirationTimeUtc() {
        return this.expirationTimeUtc;
    }

    /**
     * Set information about the expiration time for the event subscription.
     *
     * @param expirationTimeUtc the expirationTimeUtc value to set
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withExpirationTimeUtc(DateTime expirationTimeUtc) {
        this.expirationTimeUtc = expirationTimeUtc;
        return this;
    }

    /**
     * Get the event delivery schema for the event subscription. Possible values include: 'EventGridSchema', 'CloudEventV01Schema', 'CustomInputSchema'.
     *
     * @return the eventDeliverySchema value
     */
    public EventDeliverySchema eventDeliverySchema() {
        return this.eventDeliverySchema;
    }

    /**
     * Set the event delivery schema for the event subscription. Possible values include: 'EventGridSchema', 'CloudEventV01Schema', 'CustomInputSchema'.
     *
     * @param eventDeliverySchema the eventDeliverySchema value to set
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withEventDeliverySchema(EventDeliverySchema eventDeliverySchema) {
        this.eventDeliverySchema = eventDeliverySchema;
        return this;
    }

    /**
     * Get the retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
     *
     * @return the retryPolicy value
     */
    public RetryPolicy retryPolicy() {
        return this.retryPolicy;
    }

    /**
     * Set the retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
     *
     * @param retryPolicy the retryPolicy value to set
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Get the DeadLetter destination of the event subscription.
     *
     * @return the deadLetterDestination value
     */
    public DeadLetterDestination deadLetterDestination() {
        return this.deadLetterDestination;
    }

    /**
     * Set the DeadLetter destination of the event subscription.
     *
     * @param deadLetterDestination the deadLetterDestination value to set
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withDeadLetterDestination(DeadLetterDestination deadLetterDestination) {
        this.deadLetterDestination = deadLetterDestination;
        return this;
    }

}
