// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.changefeed;

import com.azure.storage.blob.changefeed.implementation.models.BlobChangefeedEventWrapper;
import com.azure.storage.blob.changefeed.implementation.models.ChangefeedCursor;
import com.azure.storage.blob.changefeed.models.BlobChangefeedEvent;
import com.azure.storage.common.implementation.StorageImplUtils;
import com.azure.storage.internal.avro.implementation.AvroReader;
import reactor.core.publisher.Flux;

/**
 * A class that represents a Chunk in Changefeed.
 *
 * A chunk is an append blob that contains avro encoded changefeed events.
 */
class Chunk {

    private final String chunkPath; /* Chunk path. */
    private final ChangefeedCursor shardCursor; /* Cursor associated with parent shard. */
    private final AvroReader avroReader; /* The AvroReader. */

    /**
     * Creates a new Chunk.
     */
    Chunk(String chunkPath, ChangefeedCursor shardCursor, AvroReader avroReader) {
        StorageImplUtils.assertNotNull("avroReader", avroReader);
        this.chunkPath = chunkPath;
        this.shardCursor = shardCursor;
        this.avroReader = avroReader;
    }

    /**
     * Get events for the Chunk.
     * @return A reactive stream of {@link BlobChangefeedEventWrapper}
     */
    Flux<BlobChangefeedEventWrapper> getEvents() {
            /* Read avro objects. The AvroReader will only return relevant objects. */
        return avroReader.readAvroObjects()
            /* Convert AvroObjects into BlobChangefeedEventWrappers. */
            .map(avroObject -> {
                /* Unwrap AvroObject. */
                long blockOffset = avroObject.getBlockOffset();
                long objectBlockIndex = avroObject.getObjectBlockIndex();
                Object object = avroObject.getObject();

                /* Get the event cursor associated with this event. */
                ChangefeedCursor eventCursor = shardCursor.toEventCursor(chunkPath, blockOffset, objectBlockIndex);
                BlobChangefeedEvent event = BlobChangefeedEvent.fromRecord(object);

                /* Wrap the event and cursor. */
                return new BlobChangefeedEventWrapper(event, eventCursor);
            });
    }
}
