// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.changefeed;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.storage.blob.BlobContainerAsyncClient;
import com.azure.storage.blob.BlobContainerClientBuilder;
import com.azure.storage.blob.BlobServiceVersion;

import java.time.OffsetDateTime;

/**
 * This class provides a client that contains all operations that apply to Azure Storage Blob changefeed.
 *
 * @see BlobChangefeedClientBuilder
 */
@ServiceClient(builder = BlobChangefeedClientBuilder.class, isAsync = true)
public class BlobChangefeedAsyncClient {

    static final String CHANGEFEED_CONTAINER_NAME = "$blobchangefeed";

    private final BlobContainerAsyncClient client;

    /**
     * Package-private constructor for use by {@link BlobChangefeedClientBuilder}.
     *
     * @param pipeline The pipeline used to send and receive service requests.
     * @param url The endpoint where to send service requests.
     * @param version The version of the service to receive requests.
     */
    BlobChangefeedAsyncClient(HttpPipeline pipeline, String url, BlobServiceVersion version) {
        this.client = new BlobContainerClientBuilder()
            .endpoint(url)
            .containerName(CHANGEFEED_CONTAINER_NAME)
            .pipeline(pipeline)
            .serviceVersion(version)
            .buildAsyncClient();
    }

    /**
     * Returns a reactive Publisher emitting all the changefeed events for this account lazily as needed.
     *
     * <p>
     * Changefeed events are returned in approximate temporal order.
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/en-us/azure/storage/blobs/storage-blob-change-feed?tabs=azure-portal">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.changefeed.BlobChangefeedAsyncClient.getEvents}
     *
     * @return A reactive response emitting the changefeed events.
     */
    public BlobChangefeedPagedFlux getEvents() {
        return getEvents(null, null);
    }

    /**
     * Returns a reactive Publisher emitting all the changefeed events for this account lazily as needed.
     *
     * <p>
     * Changefeed events are returned in approximate temporal order.
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/en-us/azure/storage/blobs/storage-blob-change-feed?tabs=azure-portal">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.changefeed.BlobChangefeedAsyncClient.getEvents#OffsetDateTime-OffsetDateTime}
     *
     * @param startTime Filters the results to return events after the start time.
     * @param endTime Filters the results to return events before the end time.
     * @return A reactive response emitting the changefeed events.
     */
    public BlobChangefeedPagedFlux getEvents(OffsetDateTime startTime, OffsetDateTime endTime) {
        return new BlobChangefeedPagedFluxFactory().getBlobChangefeedPagedFlux(client, startTime, endTime);
    }

    /**
     * Returns a reactive Publisher emitting all the changefeed events for this account lazily as needed.
     *
     * <p>
     * Changefeed events are returned in approximate temporal order.
     *
     * <p>For more information, see the
     * <a href="https://docs.microsoft.com/en-us/azure/storage/blobs/storage-blob-change-feed?tabs=azure-portal">Azure Docs</a>.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.changefeed.BlobChangefeedAsyncClient.getEvents#String}
     *
     * @param cursor Identifies the portion of the events to be returned with the next get operation.
     * @return A reactive response emitting the changefeed events.
     */
    public BlobChangefeedPagedFlux getEvents(String cursor) {
        return new BlobChangefeedPagedFluxFactory().getBlobChangefeedPagedFlux(client, cursor);
    }

}
