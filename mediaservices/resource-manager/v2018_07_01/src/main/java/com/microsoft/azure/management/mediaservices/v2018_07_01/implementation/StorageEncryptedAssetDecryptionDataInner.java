/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_07_01.AssetFileEncryptionMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data needed to decrypt asset files encrypted with legacy storage encryption.
 */
public class StorageEncryptedAssetDecryptionDataInner {
    /**
     * The Asset File storage encryption key.
     */
    @JsonProperty(value = "key")
    private byte[] key;

    /**
     * Asset File encryption metadata.
     */
    @JsonProperty(value = "assetFileEncryptionMetadata")
    private List<AssetFileEncryptionMetadata> assetFileEncryptionMetadata;

    /**
     * Get the Asset File storage encryption key.
     *
     * @return the key value
     */
    public byte[] key() {
        return this.key;
    }

    /**
     * Set the Asset File storage encryption key.
     *
     * @param key the key value to set
     * @return the StorageEncryptedAssetDecryptionDataInner object itself.
     */
    public StorageEncryptedAssetDecryptionDataInner withKey(byte[] key) {
        this.key = key;
        return this;
    }

    /**
     * Get asset File encryption metadata.
     *
     * @return the assetFileEncryptionMetadata value
     */
    public List<AssetFileEncryptionMetadata> assetFileEncryptionMetadata() {
        return this.assetFileEncryptionMetadata;
    }

    /**
     * Set asset File encryption metadata.
     *
     * @param assetFileEncryptionMetadata the assetFileEncryptionMetadata value to set
     * @return the StorageEncryptedAssetDecryptionDataInner object itself.
     */
    public StorageEncryptedAssetDecryptionDataInner withAssetFileEncryptionMetadata(List<AssetFileEncryptionMetadata> assetFileEncryptionMetadata) {
        this.assetFileEncryptionMetadata = assetFileEncryptionMetadata;
        return this;
    }

}
