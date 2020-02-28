// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.amqp.AmqpMessageConstant;
import com.azure.core.amqp.exception.AmqpErrorCondition;
import com.azure.core.amqp.exception.AmqpException;

import com.azure.core.amqp.implementation.ErrorContextProvider;
import com.azure.core.amqp.implementation.TracerProvider;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.tracing.ProcessKind;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.amqp.messaging.MessageAnnotations;
import reactor.core.publisher.Signal;

import java.nio.BufferOverflowException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

import static com.azure.core.util.tracing.Tracer.DIAGNOSTIC_ID_KEY;
import static com.azure.core.util.tracing.Tracer.SPAN_CONTEXT_KEY;

/**
 * A class for aggregating {@link ServiceBusMessage} into a single, size-limited, batch. It is treated as
 * a single message when sent to the Azure Service Bus service.
 */
final class MessageBatch {
    private final ClientLogger logger = new ClientLogger(MessageBatch.class);
    private final Object lock = new Object();
    private final int maxMessageSize;
    private final ErrorContextProvider contextProvider;
    private final List<ServiceBusMessage> serviceBusMessageList;
    private final byte[] eventBytes;
    private int sizeInBytes;
    private final TracerProvider tracerProvider;

    MessageBatch(int maxMessageSize, ErrorContextProvider contextProvider,
                 TracerProvider tracerProvider) {
        this.maxMessageSize = maxMessageSize;

        this.contextProvider = contextProvider;
        this.serviceBusMessageList = new LinkedList<>();
        this.sizeInBytes = (maxMessageSize / 65536) * 1024; // reserve 1KB for every 64KB
        this.eventBytes = new byte[maxMessageSize];
        this.tracerProvider = tracerProvider;
    }

    /**
     * Gets the number of {@link ServiceBusMessage events} in the batch.
     *
     * @return The number of {@link ServiceBusMessage events} in the batch.
     */
    int getCount() {
        return serviceBusMessageList.size();
    }

    /**
     * Gets the maximum size, in bytes, of the {@link MessageBatch}.
     *
     * @return The maximum size, in bytes, of the {@link MessageBatch}.
     */
    int getMaxSizeInBytes() {
        return maxMessageSize;
    }

    /**
     * Gets the size of the {@link MessageBatch} in bytes.
     *
     * @return the size of the {@link MessageBatch} in bytes.
     */
    int getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Tries to add an {@link ServiceBusMessage message} to the batch.
     *
     * @param serviceBusMessage The {@link ServiceBusMessage} to add to the batch.
     * @return {@code true} if the message could be added to the batch; {@code false} if the event was too large
     * to fit in the batch.
     * @throws IllegalArgumentException if {@code message} is {@code null}.
     * @throws AmqpException if {@code message} is larger than the maximum size of the {@link MessageBatch}.
     */
    boolean tryAdd(final ServiceBusMessage serviceBusMessage) {
        if (serviceBusMessage == null) {
            throw logger.logExceptionAsWarning(new IllegalArgumentException("message cannot be null"));
        }
        ServiceBusMessage serviceBusMessageUpdated =
            tracerProvider.isEnabled() ? traceMessageSpan(serviceBusMessage) : serviceBusMessage;

        final int size;
        try {
            size = getSize(serviceBusMessageUpdated, serviceBusMessageList.isEmpty());
        } catch (BufferOverflowException exception) {
            throw logger.logExceptionAsWarning(new AmqpException(false, AmqpErrorCondition.LINK_PAYLOAD_SIZE_EXCEEDED,
                String.format(Locale.US, "Size of the payload exceeded maximum message size: %s kb",
                    maxMessageSize / 1024),
                contextProvider.getErrorContext()));
        }

        synchronized (lock) {
            if (this.sizeInBytes + size > this.maxMessageSize) {
                return false;
            }

            this.sizeInBytes += size;
        }

        this.serviceBusMessageList.add(serviceBusMessageUpdated);
        return true;
    }

    /**
     * Method to start and end a "Azure.EventHubs.message" span and add the "DiagnosticId" as a property of the message.
     *
     * @param serviceBusMessage The Message to add tracing span for.
     * @return the updated Message data object.
     */
    private ServiceBusMessage traceMessageSpan(ServiceBusMessage serviceBusMessage) {
        Optional<Object> eventContextData = serviceBusMessage.getContext().getData(SPAN_CONTEXT_KEY);
        if (eventContextData.isPresent()) {
            // if message has context (in case of retries), don't start a message span or add a new context
            return serviceBusMessage;
        } else {
            // Starting the span makes the sampling decision (nothing is logged at this time)
            Context eventSpanContext = tracerProvider.startSpan(serviceBusMessage.getContext(), ProcessKind.MESSAGE);
            Optional<Object> eventDiagnosticIdOptional = eventSpanContext.getData(DIAGNOSTIC_ID_KEY);
            if (eventDiagnosticIdOptional.isPresent()) {
                serviceBusMessage.getProperties().put(DIAGNOSTIC_ID_KEY, eventDiagnosticIdOptional.get().toString());
                tracerProvider.endSpan(eventSpanContext, Signal.complete());
                serviceBusMessage.addContext(SPAN_CONTEXT_KEY, eventSpanContext);
            }
        }

        return serviceBusMessage;
    }

    List<ServiceBusMessage> getServiceBusMessageList() {
        return serviceBusMessageList;
    }


    private int getSize(final ServiceBusMessage serviceBusMessage, final boolean isFirst) {
        Objects.requireNonNull(serviceBusMessage, "'eventData' cannot be null.");

        final org.apache.qpid.proton.message.Message amqpMessage = createAmqpMessage(serviceBusMessage);
        int eventSize = amqpMessage.encode(this.eventBytes, 0, maxMessageSize); // actual encoded bytes size
        eventSize += 16; // data section overhead

        if (isFirst) {
            amqpMessage.setBody(null);
            amqpMessage.setApplicationProperties(null);
            amqpMessage.setProperties(null);
            amqpMessage.setDeliveryAnnotations(null);

            eventSize += amqpMessage.encode(this.eventBytes, 0, maxMessageSize);
        }

        return eventSize;
    }

    /*
     * Creates the AMQP message represented by the event data
     */
    private org.apache.qpid.proton.message.Message createAmqpMessage(ServiceBusMessage event) {
        final org.apache.qpid.proton.message.Message message = Proton.message();

        if (event.getProperties() != null && !event.getProperties().isEmpty()) {
            final ApplicationProperties applicationProperties = new ApplicationProperties(event.getProperties());
            message.setApplicationProperties(applicationProperties);
        }

        if (event.getSystemProperties() != null) {
            event.getSystemProperties().forEach((key, value) -> {
                if (ServiceBusMessage.RESERVED_SYSTEM_PROPERTIES.contains(key)) {
                    return;
                }

                final AmqpMessageConstant constant = AmqpMessageConstant.fromString(key);

                if (constant != null) {
                    switch (constant) {
                        case MESSAGE_ID:
                            message.setMessageId(value);
                            break;
                        case USER_ID:
                            message.setUserId((byte[]) value);
                            break;
                        case TO:
                            message.setAddress((String) value);
                            break;
                        case SUBJECT:
                            message.setSubject((String) value);
                            break;
                        case REPLY_TO:
                            message.setReplyTo((String) value);
                            break;
                        case CORRELATION_ID:
                            message.setCorrelationId(value);
                            break;
                        case CONTENT_TYPE:
                            message.setContentType((String) value);
                            break;
                        case CONTENT_ENCODING:
                            message.setContentEncoding((String) value);
                            break;
                        case ABSOLUTE_EXPIRY_TIME:
                            message.setExpiryTime((long) value);
                            break;
                        case CREATION_TIME:
                            message.setCreationTime((long) value);
                            break;
                        case GROUP_ID:
                            message.setGroupId((String) value);
                            break;
                        case GROUP_SEQUENCE:
                            message.setGroupSequence((long) value);
                            break;
                        case REPLY_TO_GROUP_ID:
                            message.setReplyToGroupId((String) value);
                            break;
                        default:
                            throw logger.logExceptionAsWarning(new IllegalArgumentException(String.format(Locale.US,
                                "Property is not a recognized reserved property name: %s", key)));
                    }
                } else {
                    final MessageAnnotations messageAnnotations = (message.getMessageAnnotations() == null)
                        ? new MessageAnnotations(new HashMap<>())
                        : message.getMessageAnnotations();
                    messageAnnotations.getValue().put(Symbol.getSymbol(key), value);
                    message.setMessageAnnotations(messageAnnotations);
                }
            });
        }
        message.setBody(new Data(new Binary(event.getBody())));
        return message;
    }
}
