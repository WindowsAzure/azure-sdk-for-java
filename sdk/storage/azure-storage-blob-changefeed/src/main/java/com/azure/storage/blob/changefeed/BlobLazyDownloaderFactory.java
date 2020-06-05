// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.changefeed;

import com.azure.storage.blob.BlobAsyncClient;
import com.azure.storage.blob.BlobContainerAsyncClient;
import com.azure.storage.common.implementation.StorageImplUtils;

/**
 * Factory class for {@link BlobLazyDownloader}.
 */
class BlobLazyDownloaderFactory {

    private final BlobContainerAsyncClient client;

    /**
     * Creates a BlobLazyDownloaderFactory with the designated client.
     */
    BlobLazyDownloaderFactory(BlobContainerAsyncClient client) {
        StorageImplUtils.assertNotNull("client", client);
        this.client = client;
    }

    /**
     * Gets a new instance of a BlobLazyDownloader.
     *
     * @param blobPath The blob name.
     * @param blockSize The block size to download.
     * @param offset The offset to start downloading from.
     * @return {@link BlobLazyDownloader}
     */
    BlobLazyDownloader getBlobLazyDownloader(String blobPath, long blockSize, long offset) {
        StorageImplUtils.assertNotNull("blobPath", blobPath);

        BlobAsyncClient blobClient = this.client.getBlobAsyncClient(blobPath);

        return new BlobLazyDownloader(blobClient, blockSize, offset);
    }

    /**
     * Gets a new instance of a BlobLazyDownloader.
     *
     * @param blobPath The blob name.
     * @param totalSize The total size to download.
     * @return {@link BlobLazyDownloader}
     */
    BlobLazyDownloader getBlobLazyDownloader(String blobPath, long totalSize) {
        StorageImplUtils.assertNotNull("blobPath", blobPath);

        BlobAsyncClient blobClient = this.client.getBlobAsyncClient(blobPath);

        return new BlobLazyDownloader(blobClient, totalSize);
    }
}
