// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.azure.storage.blob.BlobClient;

/**
 * Defines values for ConcurrencyControl.
 * {@link #NONE}
 * {@link #ETAG}
 * {@link #VERSION_ID}
 */
public enum ConcurrencyControl {
    /**
     * No concurrency control. 'requestConditions.ifMatch' and 'client.versionId' must not be set.
     */
    NONE,

    /**
     * Default value. Concurrency control based on eTag.
     * If {@link BlobRequestConditions#getIfMatch()} is set, the client will honor this value.
     * Otherwise, {@link BlobRequestConditions#getIfMatch()} is set to the latest eTag.
     */
    ETAG,

    /**
     * Concurrency control based on versionId. NOTE: Versioning must be supported by the account to use this value.
     * If {@link BlobClient#getVersionId()} is set, the client will honor this value.
     * Otherwise, {@link BlobClient#getVersionId()} is set to the latest versionId.
     */
    VERSION_ID
}
