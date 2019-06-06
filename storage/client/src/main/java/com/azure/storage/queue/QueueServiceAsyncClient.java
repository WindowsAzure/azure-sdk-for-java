// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.storage.queue;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.VoidResponse;
import com.azure.core.util.Context;
import com.azure.storage.queue.implementation.AzureQueueStorageImpl;
import com.azure.storage.queue.models.ListQueuesSegmentResponse;
import com.azure.storage.queue.models.QueuesSegmentOptions;
import com.azure.storage.queue.models.StorageErrorCode;
import com.azure.storage.queue.models.StorageErrorException;
import com.azure.storage.queue.models.StorageServiceProperties;
import com.azure.storage.queue.models.StorageServiceStats;
import reactor.core.publisher.Mono;

import java.net.URL;
import java.util.Map;

/**
 * Queue service async client
 */
public final class QueueServiceAsyncClient {
    private final AzureQueueStorageImpl client;

    /**
     * Constructor used by the builder
     * @param endpoint URL of the storage account queue endpoint
     * @param httpPipeline Http pipeline
     */
    QueueServiceAsyncClient(URL endpoint, HttpPipeline httpPipeline) {
        this.client = new AzureQueueStorageImpl(httpPipeline).withUrl(endpoint.toString());
    }

    /**
     * @return a new client builder instance
     */
    public static QueueServiceAsyncClientBuilder builder() {
        return new QueueServiceAsyncClientBuilder();
    }

    /**
     * @return URL of the storage account queue endpoint
     */
    public String url() {
        return client.url();
    }

    /**
     * Gets a QueueAsyncClient that is targeting the specified queue
     * @param queueName Name of the queue
     * @return QueueAsyncClient that interacts with the specified queue
     */
    public QueueAsyncClient getQueueAsyncClient(String queueName) {
        return new QueueAsyncClient(client, queueName);
    }

    /**
     * Creates a new queue and returns the client to interact with it
     * @param queueName Name of the queue
     * @return the client to interact with the new queue
     */
    public QueueAsyncClient createQueue(String queueName) {
        return createQueue(queueName);
    }

    /**
     * Creates a new queue and returns the client to interact with it
     * @param queueName Name of the queue
     * @param metadata Metadata to set on the queue
     * @return the client to interact with the new queue
     * @throws StorageErrorException If the queue fails to be created
     */
    public QueueAsyncClient createQueue(String queueName, Map<String, String> metadata) {
        QueueAsyncClient queueAsyncClient = new QueueAsyncClient(client, queueName);

        try {
            queueAsyncClient.create(metadata).block();
        } catch (StorageErrorException ex) {
            if (!StorageErrorCode.QUEUE_ALREADY_EXISTS.equals(ex.value().message())) {
                throw ex;
            }
        }

        return queueAsyncClient;
    }

    /**
     * Deletes a queue in the storage account
     * @param queueName Name of the queue
     * @throws StorageErrorException If the queue fails to be deleted
     */
    public void deleteQueue(String queueName) {
        try {
            new QueueAsyncClient(client, queueName).delete();
        } catch (StorageErrorException ex) {
            if (!StorageErrorCode.QUEUE_NOT_FOUND.equals(ex.value().message())
                && !StorageErrorCode.QUEUE_BEING_DELETED.equals(ex.value().message())) {
                throw ex;
            }
        }
    }

    /**
     * Lists the queues in the storage account
     * @param marker Starting point to list the queues
     * @param options Filter for queue selection
     * @return Queues in the storage account that passed the filter and metadata to continue listing more queues
     */
    public Mono<Response<ListQueuesSegmentResponse>> listQueuesSegment(String marker, QueuesSegmentOptions options) {
        return client.services().listQueuesSegmentWithRestResponseAsync(options.prefix(), marker, options.maxResults(), options.includes(), null, null, Context.NONE)
            .map(response -> new SimpleResponse<>(response.request(), response.statusCode(), response.headers(), response.value()));
    }

    /**
     * @return Global queue properties in the storage account
     */
    public Mono<Response<StorageServiceProperties>> getProperties() {
        return client.services().getPropertiesWithRestResponseAsync(Context.NONE)
            .map(response -> new SimpleResponse<>(response.request(), response.statusCode(), response.headers(), response.value()));
    }

    /**
     * Sets global queue properties for the storage account
     * @param properties Queue properties
     * @return an empty response
     */
    public Mono<VoidResponse> setProperties(StorageServiceProperties properties) {
        return client.services().setPropertiesWithRestResponseAsync(properties, Context.NONE)
            .map(VoidResponse::new);
    }

    /**
     * @return global statics about queues in the storage account
     */
    public Mono<Response<StorageServiceStats>> getStatistics() {
        return client.services().getStatisticsWithRestResponseAsync(Context.NONE)
            .map(response -> new SimpleResponse<>(response.request(), response.statusCode(), response.headers(), response.value()));
    }
}
