// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.azure.storage.blob.models.Block;

/**
 * Represents a single block in a block blob.
 */
public final class BlockItem {
    /* Internal block object. */
    private com.azure.storage.blob.models.Block block;

    private boolean isCommitted;

    /**
     * Creates an instance of a BlobItem.
     * @param block the API blob object
     * @param isCommitted if the blob is committed
     */
    public BlockItem(Block block, boolean isCommitted) {
        this.block = block;
        this.isCommitted = isCommitted;
    }

    /**
     * @return the base64 encoded block ID.
     */
    public String name() {
        return this.block.name();
    }

    /**
     * @return the block size in bytes.
     */
    public int size() {
        return this.block.size();
    }

    /**
     * @return if the block has been committed.
     */
    public boolean isCommitted() {
        return isCommitted;
    }
}
