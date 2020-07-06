package com.azure.messaging.eventhubs;

import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.amqp.implementation.ErrorContextProvider;
import com.azure.core.amqp.implementation.TracerProvider;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.experimental.serializer.ObjectSerializer;
import reactor.core.publisher.Mono;

import java.io.ByteArrayOutputStream;
import java.util.Objects;

/**
 * A class for aggregating Java objects into a single, size-limited, batch. Objects are serialized into EventData
 * objects and are added to the batch.  It is treated as a single message when sent to the Azure Event Hubs service.
 *
 * @param <T> type of objects in the batch.  Multi-type batches are not permitted.
 */
public final class ObjectBatch<T> extends EventDataBatchBase {
    private final ClientLogger logger = new ClientLogger(ObjectBatch.class);
    private final Object lock = new Object();
    private final Class<T> batchType;
    private final ObjectSerializer objectSerializer;

    ObjectBatch(int maxMessageSize, String partitionId, String partitionKey, Class<T> batchType,
                    ErrorContextProvider contextProvider, TracerProvider tracerProvider,
                ObjectSerializer objectSerializer, String entityPath, String hostname) {
        super(maxMessageSize, partitionId, partitionKey, contextProvider, tracerProvider, entityPath, hostname);
        this.batchType = Objects.requireNonNull(batchType, "'batchType' cannot be null.");
        this.objectSerializer = Objects.requireNonNull(objectSerializer, "'objectSerializer' cannot be null.");
    }

    /**
     * Tries to add an object to the batch.
     *
     * @param object The object to add to the batch.
     * @return {@code true} if the object could be added to the batch; {@code false} if the serialized object
     *      was too large to fit in the batch.
     * @throws IllegalArgumentException if object is {@code null}.
     * @throws AmqpException if serialized object as {@link EventData} is larger than the maximum size
     *      of the {@link EventDataBatch}.
     */
    public Mono<Boolean> tryAdd(final T object) {
        if (object == null) {
            throw logger.logExceptionAsWarning(new IllegalArgumentException("object cannot be null"));
        }

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        return objectSerializer.serialize(outputStream, object).map(s -> {
            EventData eventData = new EventData(s.toByteArray());
            EventData event = tracerProvider.isEnabled() ? traceMessageSpan(eventData) : eventData;
            return tryAdd(event);
        });
    }
}
