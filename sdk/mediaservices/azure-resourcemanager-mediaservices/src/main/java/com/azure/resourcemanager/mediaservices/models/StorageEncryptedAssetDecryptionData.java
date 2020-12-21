// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.resourcemanager.mediaservices.fluent.models.StorageEncryptedAssetDecryptionDataInner;
import java.util.List;

/** An immutable client-side representation of StorageEncryptedAssetDecryptionData. */
public interface StorageEncryptedAssetDecryptionData {
    /**
     * Gets the key property: The Asset File storage encryption key.
     *
     * @return the key value.
     */
    byte[] key();

    /**
     * Gets the assetFileEncryptionMetadata property: Asset File encryption metadata.
     *
     * @return the assetFileEncryptionMetadata value.
     */
    List<AssetFileEncryptionMetadata> assetFileEncryptionMetadata();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.fluent.models.StorageEncryptedAssetDecryptionDataInner
     * object.
     *
     * @return the inner object.
     */
    StorageEncryptedAssetDecryptionDataInner innerModel();
}
