// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.storage.queue;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.VoidResponse;
import com.azure.storage.common.credentials.SASTokenCredential;
import com.azure.storage.common.credentials.SharedKeyCredential;
import com.azure.storage.queue.models.DequeuedMessage;
import com.azure.storage.queue.models.EnqueuedMessage;
import com.azure.storage.queue.models.PeekedMessage;
import com.azure.storage.queue.models.QueueProperties;
import com.azure.storage.queue.models.SignedIdentifier;
import com.azure.storage.queue.models.StorageErrorException;
import com.azure.storage.queue.models.UpdatedMessage;

import java.time.Duration;
import java.util.List;
import java.util.Map;

/**
 * This class provides a client that contains all the operations for interacting with a queue in Azure Storage Queue.
 * Operations allowed by the client are creating and deleting the queue, retrieving and updating metadata and access
 * policies of the queue, and enqueuing, dequeuing, peeking, updating, and deleting messages.
 *
 * <p><strong>Instantiating an Synchronous Queue Client</strong></p>
 *
 * <pre>
 * QueueClient client = QueueClient.builder()
 *     .connectionString(connectionString)
 *     .endpoint(endpoint)
 *     .queueName(queueName)
 *     .buildSync();
 * </pre>
 *
 * <p>View {@link QueueClientBuilder this} for additional ways to construct the client.</p>
 *
 * @see QueueClientBuilder
 * @see QueueAsyncClient
 * @see SharedKeyCredential
 * @see SASTokenCredential
 */
public final class QueueClient {
    private final QueueAsyncClient client;

    /**
     * Creates a QueueClient that wraps a QueueAsyncClient and blocks requests.
     *
     * @param client QueueAsyncClient that is used to send requests
     */
    QueueClient(QueueAsyncClient client) {
        this.client = client;
    }

    /**
     * Creates a builder that can configure options for the QueueClient before creating an instance of it.
     *
     * @return A new {@link QueueClientBuilder} used create QueueClient instances.
     */
    public static QueueClientBuilder builder() {
        return new QueueClientBuilder();
    }

    /**
     * @return the URL of the storage queue
     */
    public String getUrl() {
        return client.getUrl();
    }

    /**
     * Creates a new queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Create a queue</p>
     *
     * <pre>
     * VoidResponse response = client.create();
     * System.out.printf("Create completed with status code %d", response.statusCode());
     * </pre>
     *
     * @return A response that only contains headers and response status code
     * @throws StorageErrorException If a queue with the same name already exists in the queue service.
     */
    public VoidResponse create() {
        return create(null);
    }

    /**
     * Creates a new queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Create a queue with metadata "queue:metadataMap"</p>
     *
     * <pre>
     * VoidResponse response = client.create(Collections.singletonMap("queue", "metadataMap"));
     * System.out.printf("Create completed with status code %d", response.statusCode());
     * </pre>
     *
     * @param metadata Metadata to associate with the queue
     * @return A response that only contains headers and response status code
     * @throws StorageErrorException If a queue with the same name and different metadata already exists in the queue service.
     */
    public VoidResponse create(Map<String, String> metadata) {
        return client.create(metadata).block();
    }

    /**
     * Permanently deletes the queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete a queue</p>
     *
     * <pre>
     * VoidResponse response = client.delete();
     * System.out.printf("Delete completed with status code %d", response.statusCode());
     * </pre>
     *
     * @return A response that only contains headers and response status code
     * @throws StorageErrorException If the queue doesn't exist
     */
    public VoidResponse delete() {
        return client.delete().block();
    }

    /**
     * Retrieves metadata and approximate message count of the queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Get the properties of the queue</p>
     *
     * <pre>
     * QueueProperties properties = client.getProperties().value();
     * System.out.printf("Metadata: %s, Approximate message count: %d", properties.metadata(), properties.approximateMessagesCount());
     * </pre>
     *
     * @return A response containing a {@link QueueProperties} value which contains the metadata and approximate
     * messages count of the queue.
     * @throws StorageErrorException If the queue doesn't exist
     */
    public Response<QueueProperties> getProperties() {
        return client.getProperties().block();
    }

    /**
     * Sets the metadata of the queue.
     *
     * Passing in a {@code null} value for metadata will clear the metadata associated with the queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Set the queue's metadata to "queue:metadataMap"</p>
     *
     * <pre>
     * VoidResponse response = client.setMetadata(Collections.singletonMap("queue", "metadataMap"));
     * System.out.printf("Setting metadata completed with status code %d", response.statusCode());
     * </pre>
     *
     * <p>Clear the queue's metadata</p>
     *
     * <pre>
     * VoidResponse response = client.setMetadata(null);
     * System.out.printf("Clearing metadata completed with status code %d", response.statusCode());
     * </pre>
     *
     * @param metadata Metadata to set on the queue
     * @return A response that only contains headers and response status code
     * @throws StorageErrorException If the queue doesn't exist
     */
    public VoidResponse setMetadata(Map<String, String> metadata) {
        return client.setMetadata(metadata).block();
    }

    /**
     * Retrieves stored access policies specified on the queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>List the stored access policies</p>
     *
     * <pre>
     * for (SignedIdentifier permission : client.getAccessPolicy()) {
     *     System.out.printf("Access policy %s allows these permissions: %s", permission.id(), permission.accessPolicy().permission());
     * }
     *
     * @return The stored access policies specified on the queue.
     * @throws StorageErrorException If the queue doesn't exist
     */
    public Iterable<SignedIdentifier> getAccessPolicy() {
        return client.getAccessPolicy().toIterable();
    }

    /**
     * Sets stored access policies on the queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Set a read only stored access policy</p>
     *
     * <pre>
     * AccessPolicy policy = new AccessPolicy().permission("r")
     *     .start(OffsetDateTime.now(ZoneOffset.UTC))
     *     .expiry(OffsetDateTime.now(ZoneOffset.UTC).addDays(10));
     *
     * SignedIdentifier permission = new SignedIdentifier().id("mypolicy").accessPolicy(accessPolicy);
     *
     * VoidResponse response = client.setAccessPolicy(Collections.singletonList(permission));
     * System.out.printf("Setting access policies completed with status code %d", response.statusCode());
     * </pre>
     *
     * @param permissions Access policies to set on the queue
     * @return A response that only contains headers and response status code
     * @throws StorageErrorException If the queue doesn't exist, a stored access policy doesn't have all fields filled out,
     * or the queue will have more than five policies.
     */
    public VoidResponse setAccessPolicy(List<SignedIdentifier> permissions) {
        return client.setAccessPolicy(permissions).block();
    }

    /**
     * Deletes all messages in the queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Clear the messages</p>
     *
     * <pre>
     * VoidResponse response = client.clear();
     * System.out.printf("Clearing messages completed with status code %d", response.statusCode());
     * </pre>
     *
     * @return A response that only contains headers and response status code
     * @throws StorageErrorException If the queue doesn't exist
     */
    public VoidResponse clearMessages() {
        return client.clearMessages().block();
    }

    /**
     * Enqueues a message that has a time-to-live of 7 days and is instantly visible.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Enqueue a message of "Hello, Azure"</p>
     *
     * <pre>
     * EnqueuedMessage enqueuedMessage = client.enqueueMessage("Hello, Azure");
     * System.out.printf("Message %s was enqueued at %s", enqueuedMessage.messageId(), enqueuedMessage.insertionTime());
     * </pre>
     *
     * @param messageText Message text
     * @return A {@link EnqueuedMessage} value that contains the {@link EnqueuedMessage#messageId() messageId} and
     * {@link EnqueuedMessage#popReceipt() popReceipt} that are used to interact with the message and other metadata
     * about the enqueued message.
     * @throws StorageErrorException If the queue doesn't exist
     */
    public Response<EnqueuedMessage> enqueueMessage(String messageText) {
        return enqueueMessage(messageText, Duration.ofSeconds(0), Duration.ofDays(7));
    }

    /**
     * Enqueues a message with a given time-to-live and a timeout period where the message is invisible in the queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Add a message of "Hello, Azure" that has a timeout of 5 seconds</p>
     *
     * <pre>
     * EnqueuedMessage enqueuedMessage = client.enqueueMessage("Hello, Azure", Duration.ofSeconds(5), null);
     * System.out.printf("Message %s becomes visible at %s", enqueuedMessage.messageId(), enqueuedMessage.timeNextVisible());
     * </pre>
     *
     * <p>Add a message of "Goodbye, Azure" that has a time to live of 5 seconds</p>
     *
     * <pre>
     * EnqueuedMessage enqueuedMessage = client.enqueueMessage("Goodbye, Azure", null, Duration.ofSeconds(5));
     * System.out.printf("Message %s expires at %s", enqueuedMessage.messageId(), enqueuedMessage.expirationTime());
     * </pre>
     *
     * @param messageText Message text
     * @param visibilityTimeout Optional. The timeout period for how long the message is invisible in the queue in seconds.
     * If unset the value will default to 0 and the message will be instantly visible. The timeout must be between 0
     * seconds and 7 days.
     * @param timeToLive Optional. How long the message will stay alive in the queue in seconds. If unset the value will
     * default to 7 days, if -1 is passed the message will not expire. The time to live must be -1 or any positive number.
     * @return A {@link EnqueuedMessage} value that contains the {@link EnqueuedMessage#messageId() messageId} and
     * {@link EnqueuedMessage#popReceipt() popReceipt} that are used to interact with the message and other metadata
     * about the enqueued message.
     * @throws StorageErrorException If the queue doesn't exist or the {@code visibilityTimeout} or {@code timeToLive}
     * are outside of the allowed limits.
     */
    public Response<EnqueuedMessage> enqueueMessage(String messageText, Duration visibilityTimeout, Duration timeToLive) {
        return client.enqueueMessage(messageText, visibilityTimeout, timeToLive).block();
    }

    /**
     * Retrieves the first message in the queue and hides it from other operations for 30 seconds.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Dequeue a message</p>
     *
     * <pre>
     * for (DequeuedMessage dequeuedMessage : client.dequeue()) {
     *     System.out.printf("Dequeued %s and it becomes visible at %s", dequeuedMessage.messageId(), dequeuedMessage.timeNextVisible());
     * }
     * </pre>
     *
     * @return The first {@link DequeuedMessage} in the queue, it contains
     * {@link DequeuedMessage#messageId() messageId} and {@link DequeuedMessage#popReceipt() popReceipt} used to interact
     * with the message, additionally it contains other metadata about the message.
     * @throws StorageErrorException If the queue doesn't exist
     */
    public Iterable<DequeuedMessage> dequeueMessages() {
        return dequeueMessages(1, Duration.ofSeconds(30));
    }

    /**
     * Retrieves up to the maximum number of messages from the queue and hides them from other operations for 30 seconds.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Dequeue up to 5 messages</p>
     *
     * <pre>
     * for (DequeuedMessage dequeuedMessage : client.dequeue(5)) {
     *     System.out.printf("Dequeued %s and it becomes visible at %s", dequeuedMessage.messageId(), dequeuedMessage.timeNextVisible());
     * }
     * </pre>
     *
     * @param maxMessages Optional. Maximum number of messages to get, if there are less messages exist in the queue than requested
     * all the messages will be returned. If left empty only 1 message will be retrieved, the allowed range is 1 to 32
     * messages.
     * @return Up to {@code maxMessages} {@link DequeuedMessage DequeuedMessages} from the queue. Each DequeuedMessage contains
     * {@link DequeuedMessage#messageId() messageId} and {@link DequeuedMessage#popReceipt() popReceipt} used to interact
     * with the message and other metadata about the message.
     * @throws StorageErrorException If the queue doesn't exist or {@code maxMessages} is outside of the allowed bounds
     */
    public Iterable<DequeuedMessage> dequeueMessages(Integer maxMessages) {
        return dequeueMessages(maxMessages, Duration.ofSeconds(30));
    }

    /**
     * Retrieves up to the maximum number of messages from the queue and hides them from other operations for the
     * timeout period.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Dequeue up to 5 messages and give them a 60 second timeout period</p>
     *
     * <pre>
     * for (DequeuedMessage dequeuedMessage : client.dequeue(5, Duration.ofSeconds(60))) {
     *     System.out.printf("Dequeued %s and it becomes visible at %s", dequeuedMessage.messageId(), dequeuedMessage.timeNextVisible());
     * }
     * </pre>
     *
     * @param maxMessages Optional. Maximum number of messages to get, if there are less messages exist in the queue than requested
     * all the messages will be returned. If left empty only 1 message will be retrieved, the allowed range is 1 to 32
     * messages.
     * @param visibilityTimeout Optional. The timeout period for how long the message is invisible in the queue in seconds.
     * If left empty the dequeued messages will be invisible for 30 seconds. The timeout must be between 1 second and 7 days.
     * @return Up to {@code maxMessages} {@link DequeuedMessage DequeuedMessages} from the queue. Each DeqeuedMessage contains
     * {@link DequeuedMessage#messageId() messageId} and {@link DequeuedMessage#popReceipt() popReceipt} used to interact
     * with the message and other metadata about the message.
     * @throws StorageErrorException If the queue doesn't exist or {@code maxMessages} or {@code visibilityTimeout} is
     * outside of the allowed bounds
     */
    public Iterable<DequeuedMessage> dequeueMessages(Integer maxMessages, Duration visibilityTimeout) {
        return client.dequeueMessages(maxMessages, visibilityTimeout).toIterable();
    }

    /**
     * Peeks the first message in the queue.
     *
     * Peeked messages don't contain the necessary information needed to interact with the message nor will it hide
     * messages from other operations on the queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Peek the first message</p>
     *
     * <pre>
     * for (PeekedMessage peekedMessage : client.peekMessages()) {
     *     System.out.printf("Peeked message %s has been dequeued %d times", peekedMessage.messageId(), peekedMessage.dequeueCount());
     * }
     * </pre>
     *
     * @return A {@link PeekedMessage} that contains metadata about the message.
     */
    public Iterable<PeekedMessage> peekMessages() {
        return peekMessages(1);
    }

    /**
     * Peek messages from the front of the queue up to the maximum number of messages.
     *
     * Peeked messages don't contain the necessary information needed to interact with the message nor will it hide
     * messages from other operations on the queue.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Peek up to the first five messages</p>
     *
     * <pre>
     * for (PeekedMessage peekedMessage : client.peekMessages(5)) {
     *     System.out.printf("Peeked message %s has been dequeued %d times", peekedMessage.messageId(), peekedMessage.dequeueCount());
     * }
     * </pre>
     *
     * @param maxMessages Optional. Maximum number of messages to peek, if there are less messages exist in the queue than requested
     * all the messages will be peeked. If left empty only 1 message will be peeked, the allowed range is 1 to 32
     * messages.
     * @return Up to {@code maxMessages} {@link PeekedMessage PeekedMessages} from the queue. Each PeekedMessage contains
     * metadata about the message.
     * @throws StorageErrorException If the queue doesn't exist or {@code maxMessages} is outside of the allowed bounds
     */
    public Iterable<PeekedMessage> peekMessages(Integer maxMessages) {
        return client.peekMessages(maxMessages).toIterable();
    }

    /**
     * Updates the specific message in the queue with a new message and resets the visibility timeout.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Dequeue the first message and update it to "Hello again, Azure" and hide it for 5 seconds</p>
     *
     * <pre>
     * DequeuedMessage dequeuedMessage = client.dequeueMessages().iterator().next();
     * UpdatedMessage updatedMessage client.updateMessage("Hello again, Azure", dequeuedMessage.messageId(), dequeuedMessage.popReceipt(), Duration.ofSeconds(5));
     * System.out.printf("Updated message popReceipt is %s and it'll be visible at %s", updatedMessage.popReceipt(), updatedMessage.timeNextVisible());
     * </pre>
     *
     * @param messageText Updated value for the message
     * @param messageId Id of the message to update
     * @param popReceipt Unique identifier that must match for the message to be updated
     * @param visibilityTimeout The timeout period for how long the message is invisible in the queue in seconds. The
     * timeout period must be between 1 second and 7 days.
     * @return A {@link UpdatedMessage} that contains the new {@link UpdatedMessage#popReceipt() popReceipt} to interact
     * with the message, additionally contains the updated metadata about the message.
     * @throws StorageErrorException If the queue or messageId don't exist, the popReceipt doesn't match on the message,
     * or the {@code visibilityTimeout} is outside the allowed bounds
     */
    public Response<UpdatedMessage> updateMessage(String messageText, String messageId, String popReceipt, Duration visibilityTimeout) {
        return client.updateMessage(messageText, messageId, popReceipt, visibilityTimeout).block();
    }

    /**
     * Deletes the specified message in the queue
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the first message</p>
     *
     * <pre>
     * DequeuedMessage deqeuedMessage = client.dequeueMessages().blockFirst();
     * VoidResponse response = client.deleteMessage(dequeuedMessage.messageId(), dequeuedMessage.popReceipt())
     * System.out.printf("Deleting a message completed with status code %d", response.statusCode());
     * </pre>
     *
     * @param messageId Id of the message to deleted
     * @param popReceipt Unique identifier that must match for the message to be deleted
     * @return A response that only contains headers and response status code
     * @throws StorageErrorException If the queue or messageId don't exist or the popReceipt doesn't match on the message
     */
    public VoidResponse deleteMessage(String messageId, String popReceipt) {
        return client.deleteMessage(messageId, popReceipt).block();
    }
}
