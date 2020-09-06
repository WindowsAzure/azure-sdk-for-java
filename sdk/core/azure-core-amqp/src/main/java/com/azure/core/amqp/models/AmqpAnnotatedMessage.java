// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The representation of message as defined by AMQP protocol.
 *
 * @see <a href="http://docs.oasis-open.org/amqp/core/v1.0/os/amqp-core-messaging-v1.0-os.html#section-message-format">
 *     Amqp Message Format.</a>
 */
public final class AmqpAnnotatedMessage {
    private final AmqpMessageBody amqpMessageBody;
    private final Map<String, Object> applicationProperties;
    private final Map<String, Object> deliveryAnnotations;
    private final Map<String, Object> messageAnnotations;
    private final Map<String, Object> footer;
    private final AmqpMessageHeader header;
    private final AmqpMessageProperties properties;

    /**
     * Creates instance of {@link AmqpAnnotatedMessage} with given {@link AmqpMessageBody}.
     *
     * @param body to be set on amqp message.
     *
     * @throws NullPointerException if {@code body} is null.
     */
    public AmqpAnnotatedMessage(AmqpMessageBody body) {
        amqpMessageBody = Objects.requireNonNull(body, "'body' cannot be null.");

        applicationProperties = new HashMap<>();
        deliveryAnnotations = new HashMap<>();
        messageAnnotations = new HashMap<>();
        footer = new HashMap<>();
        header = new AmqpMessageHeader();
        properties = new AmqpMessageProperties();
    }

    /**
     * Creates instance of {@link AmqpAnnotatedMessage} with given {@link AmqpAnnotatedMessage} instance.
     *
     * @param message used to create another instance of {@link AmqpAnnotatedMessage}.
     *
     * @throws NullPointerException if {@code message} or {@link AmqpAnnotatedMessage#getBody() body} is null.
     */
    public AmqpAnnotatedMessage(AmqpAnnotatedMessage message) {
        Objects.requireNonNull(message, "'message' cannot be null.");
        amqpMessageBody = Objects.requireNonNull(message.getBody(), "'message.body' cannot be null.");

        applicationProperties = message.getApplicationProperties();
        deliveryAnnotations = message.getDeliveryAnnotations();
        messageAnnotations = message.getMessageAnnotations();
        header = message.getHeader();
        properties = message.getProperties();
        footer = message.getFooter();
    }

    /**
     * Gets the {@link Map} of application properties.
     * @return The application properties.
     */
    public Map<String, Object> getApplicationProperties() {
        return applicationProperties;
    }

    /**
     * Gets the {@link AmqpMessageBody} of an amqp message.
     *
     * @return the {@link AmqpMessageBody} object.
     */
    public AmqpMessageBody getBody() {
        return amqpMessageBody;
    }

    /**
     * Gets the {@link Map} representation of delivery annotations defined on an amqp message.
     *
     * @return the {@link Map} representation of delivery annotations.
     */
    public Map<String, Object> getDeliveryAnnotations() {
        return deliveryAnnotations;
    }

    /**
     * Gets the {@link Map} representation of footer defined on an amqp message.
     *
     * @return the {@link Map} representation of footer.
     */
    public Map<String, Object> getFooter() {
        return footer;
    }

    /**
     * Gets the {@link AmqpMessageHeader} defined on an amqp message.
     *
     * @return the {@link AmqpMessageHeader} object.
     */
    public AmqpMessageHeader getHeader() {
        return header;
    }

    /**
     * Gets the {@link Map} representation of message annotations defined on an amqp message.
     *
     * @return the {@link Map} representation of message annotations.
     */
    public Map<String, Object> getMessageAnnotations() {
        return messageAnnotations;
    }

    /**
     * Gets the {@link AmqpMessageProperties} defined on an amqp message.
     *
     * @return the {@link AmqpMessageProperties} object.
     */
    public AmqpMessageProperties getProperties() {
        return properties;
    }
}
