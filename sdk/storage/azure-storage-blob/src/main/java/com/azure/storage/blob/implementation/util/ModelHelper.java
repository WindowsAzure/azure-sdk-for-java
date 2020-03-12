// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.implementation.util;

import com.azure.storage.blob.BlobAsyncClient;
import com.azure.storage.blob.ProgressReceiver;
import com.azure.storage.blob.models.ParallelTransferOptions;
import com.azure.storage.blob.specialized.BlockBlobAsyncClient;

import java.util.regex.Pattern;

/**
 * This class provides helper methods for common model patterns.
 *
 * RESERVED FOR INTERNAL USE.
 */
public class ModelHelper {
    public static final Pattern IP_V4_URL_PATTERN = Pattern
        .compile("(?:\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|(?:localhost)");

    /**
     * Fills in default values for a ParallelTransferOptions where no value has been set. This will construct a new
     * object for safety.
     *
     * @param other The options to fill in defaults.
     * @return An object with defaults filled in for null values in the original.
     */
    public static ParallelTransferOptions populateAndApplyDefaults(ParallelTransferOptions other) {
        other = other == null ? new ParallelTransferOptions(null, null, null) : other;
        return new ParallelTransferOptions(
            other.getBlockSize() == null ? Integer.valueOf(BlobAsyncClient.BLOB_DEFAULT_UPLOAD_BLOCK_SIZE)
                : other.getBlockSize(),
            other.getNumBuffers() == null ? Integer.valueOf(BlobAsyncClient.BLOB_DEFAULT_NUMBER_OF_BUFFERS)
                : other.getNumBuffers(),
            other.getProgressReceiver(),
            other.getMaxSingleUploadSize() == null ? Integer.valueOf(BlockBlobAsyncClient.MAX_UPLOAD_BLOB_BYTES)
                : other.getMaxSingleUploadSize());
    }

    /**
     * Transforms a blob type into a common type.
     * @param blobOptions {@link ParallelTransferOptions}
     * @return {@link com.azure.storage.common.ParallelTransferOptions}
     */
    public static com.azure.storage.common.ParallelTransferOptions wrapBlobOptions(
        ParallelTransferOptions blobOptions) {
        Integer blockSize = blobOptions.getBlockSize();
        Integer numBuffers = blobOptions.getNumBuffers();
        com.azure.storage.common.ProgressReceiver wrappedReceiver = blobOptions.getProgressReceiver() == null
            ? null
            : blobOptions.getProgressReceiver()::reportProgress;
        Integer maxSingleUploadSize = blobOptions.getMaxSingleUploadSize();

        return new com.azure.storage.common.ParallelTransferOptions(blockSize, numBuffers, wrappedReceiver,
            maxSingleUploadSize);
    }
}
