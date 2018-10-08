/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import com.microsoft.azure.management.mediaservices.v2018_07_01.StorageEncryptedAssetDecryptionData;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_07_01.AssetFileEncryptionMetadata;

class StorageEncryptedAssetDecryptionDataImpl extends WrapperImpl<StorageEncryptedAssetDecryptionDataInner> implements StorageEncryptedAssetDecryptionData {
    private final MediaManager manager;
    StorageEncryptedAssetDecryptionDataImpl(StorageEncryptedAssetDecryptionDataInner inner, MediaManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public List<AssetFileEncryptionMetadata> assetFileEncryptionMetadata() {
        return this.inner().assetFileEncryptionMetadata();
    }

    @Override
    public byte[] keyVal() {
        return this.inner().key();
    }

}
