// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.models.AmqpAddress;
import com.azure.core.amqp.models.AmqpAnnotatedMessage;
import com.azure.core.amqp.models.AmqpMessageBody;
import com.azure.core.amqp.models.AmqpMessageHeader;
import com.azure.core.amqp.models.AmqpMessageId;
import com.azure.core.amqp.models.AmqpMessageProperties;
import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.amqp.messaging.DeliveryAnnotations;
import org.apache.qpid.proton.amqp.messaging.Footer;
import org.apache.qpid.proton.amqp.messaging.MessageAnnotations;
import org.apache.qpid.proton.amqp.messaging.Properties;
import org.apache.qpid.proton.amqp.messaging.Section;
import org.apache.qpid.proton.message.Message;

import java.time.Duration;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Converts {@link AmqpAnnotatedMessage messages} to and from proton-j messages.
 */
final class MessageUtils {
    private static final ClientLogger LOGGER = new ClientLogger(MessageUtils.class);
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    /**
     * Converts an {@link AmqpAnnotatedMessage} to a proton-j message.
     *
     * @param message The message to convert.
     *
     * @return The corresponding proton-j message.
     *
     * @throws NullPointerException if {@code message} is null.
     */
    static Message toProtonJMessage(AmqpAnnotatedMessage message) {
        Objects.requireNonNull(message, "'message' to serialize cannot be null.");

        final Message protonJMessage = Proton.message();

        //TODO (conniey): support AMQP sequence and AMQP value.
        final AmqpMessageBody body = message.getBody();
        switch (body.getBodyType()) {
            case DATA:
                protonJMessage.setBody(new Data(new Binary(body.getFirstData())));
                break;
            case VALUE:
            case SEQUENCE:
            default:
                throw LOGGER.logExceptionAsError(new UnsupportedOperationException(
                    "bodyType [" + body.getBodyType() + "] is not supported yet."));
        }

        // Setting message properties.
        final AmqpMessageProperties properties = message.getProperties();
        if (properties.getMessageId() != null) {
            protonJMessage.setMessageId(properties.getMessageId().toString());
        }

        if (properties.getContentType() != null) {
            protonJMessage.setContentType(properties.getContentType());
        }

        if (properties.getCorrelationId() != null) {
            protonJMessage.setCorrelationId(properties.getCorrelationId().toString());
        }

        if (properties.getSubject() != null) {
            protonJMessage.setSubject(properties.getSubject());
        }

        final AmqpAddress replyTo = properties.getReplyTo();
        if (replyTo != null) {
            protonJMessage.setReplyTo(replyTo.toString());
        }

        if (properties.getReplyToGroupId() != null) {
            protonJMessage.setReplyToGroupId(properties.getReplyToGroupId());
        }

        if (properties.getGroupId() != null) {
            protonJMessage.setGroupId(properties.getGroupId());
        }

        if (properties.getContentEncoding() != null) {
            protonJMessage.setContentEncoding(properties.getContentEncoding());
        }

        if (properties.getGroupSequence() != null) {
            protonJMessage.setGroupSequence(properties.getGroupSequence());
        }

        if (properties.getTo() != null) {
            if (protonJMessage.getProperties() == null) {
                protonJMessage.setProperties(new Properties());
            }

            protonJMessage.getProperties().setTo(properties.getTo().toString());
        }

        // The default is byte[0] when getting a user id that has not been set.
        if (properties.getUserId() != null && properties.getUserId().length > 0) {
            if (protonJMessage.getProperties() == null) {
                protonJMessage.setProperties(new Properties());
            }

            protonJMessage.getProperties().setUserId(new Binary(properties.getUserId()));
        }

        if (properties.getAbsoluteExpiryTime() != null) {
            if (protonJMessage.getProperties() == null) {
                protonJMessage.setProperties(new Properties());
            }

            protonJMessage.getProperties().setAbsoluteExpiryTime(
                Date.from(properties.getAbsoluteExpiryTime().toInstant()));
        }

        if (properties.getCreationTime() != null) {
            if (protonJMessage.getProperties() == null) {
                protonJMessage.setProperties(new Properties());
            }

            protonJMessage.getProperties().setCreationTime(Date.from(properties.getCreationTime().toInstant()));
        }

        // Set header
        final AmqpMessageHeader header = message.getHeader();
        if (header.getTimeToLive() != null) {
            protonJMessage.setTtl(header.getTimeToLive().toMillis());
        }
        if (header.getDeliveryCount() != null) {
            protonJMessage.setDeliveryCount(header.getDeliveryCount());
        }
        if (header.getPriority() != null) {
            protonJMessage.setPriority(header.getPriority());
        }
        if (header.isDurable() != null) {
            protonJMessage.setDurable(header.isDurable());
        }
        if (header.isFirstAcquirer() != null) {
            protonJMessage.setFirstAcquirer(header.isFirstAcquirer());
        }
        if (header.getTimeToLive() != null) {
            protonJMessage.setTtl(header.getTimeToLive().toMillis());
        }

        // Set footer
        if (!message.getFooter().isEmpty()) {
            protonJMessage.setFooter(new Footer(message.getFooter()));
        }

        // Set message annotations.
        final Map<Symbol, Object> messageAnnotations = convert(message.getMessageAnnotations());
        if (!messageAnnotations.isEmpty()) {
            protonJMessage.setMessageAnnotations(new MessageAnnotations(messageAnnotations));
        }

        // Set Delivery Annotations.
        final Map<Symbol, Object> deliveryAnnotations = convert(message.getDeliveryAnnotations());
        if (!deliveryAnnotations.isEmpty()) {
            protonJMessage.setDeliveryAnnotations(new DeliveryAnnotations(deliveryAnnotations));
        }

        // Set application properties
        if (!message.getApplicationProperties().isEmpty()) {
            protonJMessage.setApplicationProperties(new ApplicationProperties(message.getApplicationProperties()));
        }

        return protonJMessage;
    }

    /**
     * Converts a proton-j message to {@link AmqpAnnotatedMessage}.
     *
     * @param message The message to convert.
     *
     * @return The corresponding {@link AmqpAnnotatedMessage message}.
     *
     * @throws NullPointerException if {@code message} is null.
     */
    static AmqpAnnotatedMessage toAmqpAnnotatedMessage(Message message) {
        Objects.requireNonNull(message, "'message' cannot be null");

        final byte[] bytes;
        final Section body = message.getBody();
        if (body != null) {
            //TODO (conniey): Support other AMQP types like AmqpValue and AmqpSequence.
            if (body instanceof Data) {
                final Binary messageData = ((Data) body).getValue();
                bytes = messageData.getArray();
            } else {
                LOGGER.warning("Message not of type Data. Actual: {}",
                    body.getType());
                bytes = EMPTY_BYTE_ARRAY;
            }
        } else {
            LOGGER.warning("Message does not have a body.");
            bytes = EMPTY_BYTE_ARRAY;
        }

        final AmqpAnnotatedMessage response = new AmqpAnnotatedMessage(AmqpMessageBody.fromData(bytes));

        // Application properties
        final ApplicationProperties applicationProperties = message.getApplicationProperties();
        if (applicationProperties != null) {
            final Map<String, Object> propertiesValue = applicationProperties.getValue();
            response.getApplicationProperties().putAll(propertiesValue);
        }

        // Header
        final AmqpMessageHeader responseHeader = response.getHeader();
        responseHeader.setTimeToLive(Duration.ofMillis(message.getTtl()));
        responseHeader.setDeliveryCount(message.getDeliveryCount());
        responseHeader.setPriority(message.getPriority());

        if (message.getHeader() != null) {
            responseHeader.setDurable(message.getHeader().getDurable());
            responseHeader.setFirstAcquirer(message.getHeader().getFirstAcquirer());
        }

        // Footer
        final Footer footer = message.getFooter();
        if (footer != null && footer.getValue() != null) {
            @SuppressWarnings("unchecked") final Map<Symbol, Object> footerValue = footer.getValue();

            setValues(footerValue, response.getFooter());
        }

        // Properties
        final AmqpMessageProperties responseProperties = response.getProperties();
        responseProperties.setReplyToGroupId(message.getReplyToGroupId());
        final String replyTo = message.getReplyTo();
        if (replyTo != null) {
            responseProperties.setReplyTo(new AmqpAddress(message.getReplyTo()));
        }
        final Object messageId = message.getMessageId();
        if (messageId != null) {
            responseProperties.setMessageId(new AmqpMessageId(messageId.toString()));
        }

        responseProperties.setContentType(message.getContentType());
        final Object correlationId = message.getCorrelationId();
        if (correlationId != null) {
            responseProperties.setCorrelationId(new AmqpMessageId(correlationId.toString()));
        }

        final Properties amqpProperties = message.getProperties();
        if (amqpProperties != null) {
            final String to = amqpProperties.getTo();
            if (to != null) {
                responseProperties.setTo(new AmqpAddress(amqpProperties.getTo()));
            }

            if (amqpProperties.getAbsoluteExpiryTime() != null) {
                responseProperties.setAbsoluteExpiryTime(amqpProperties.getAbsoluteExpiryTime().toInstant()
                    .atOffset(ZoneOffset.UTC));
            }
            if (amqpProperties.getCreationTime() != null) {
                responseProperties.setCreationTime(amqpProperties.getCreationTime().toInstant()
                    .atOffset(ZoneOffset.UTC));
            }
        }

        responseProperties.setSubject(message.getSubject());
        responseProperties.setGroupId(message.getGroupId());
        responseProperties.setContentEncoding(message.getContentEncoding());
        responseProperties.setGroupSequence(message.getGroupSequence());
        responseProperties.setUserId(message.getUserId());

        // DeliveryAnnotations
        final DeliveryAnnotations deliveryAnnotations = message.getDeliveryAnnotations();
        if (deliveryAnnotations != null) {
            setValues(deliveryAnnotations.getValue(), response.getDeliveryAnnotations());
        }

        // Message Annotations
        final MessageAnnotations messageAnnotations = message.getMessageAnnotations();
        if (messageAnnotations != null) {
            setValues(messageAnnotations.getValue(), response.getMessageAnnotations());
        }

        return response;
    }

    /**
     * Converts a map from it's string keys to use {@link Symbol}.
     *
     * @param sourceMap Source map.
     *
     * @return A map with corresponding keys as symbols.
     */
    static Map<Symbol, Object> convert(Map<String, Object> sourceMap) {
        if (sourceMap == null) {
            return null;
        }

        return sourceMap.entrySet().stream()
            .collect(HashMap::new,
                (existing, entry) -> existing.put(Symbol.valueOf(entry.getKey()), entry.getValue()),
                (HashMap::putAll));
    }

    private static void setValues(Map<Symbol, Object> sourceMap, Map<String, Object> targetMap) {
        if (sourceMap == null) {
            return;
        }

        for (Map.Entry<Symbol, Object> entry : sourceMap.entrySet()) {
            targetMap.put(entry.getKey().toString(), entry.getValue());
        }
    }

    /**
     * Private constructor.
     */
    private MessageUtils() {
    }
}
