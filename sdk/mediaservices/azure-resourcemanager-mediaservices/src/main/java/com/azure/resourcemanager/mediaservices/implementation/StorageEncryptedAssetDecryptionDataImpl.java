// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.resourcemanager.mediaservices.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.fluent.models.StorageEncryptedAssetDecryptionDataInner;
import com.azure.resourcemanager.mediaservices.models.AssetFileEncryptionMetadata;
import com.azure.resourcemanager.mediaservices.models.StorageEncryptedAssetDecryptionData;
import java.util.Collections;
import java.util.List;

public final class StorageEncryptedAssetDecryptionDataImpl implements StorageEncryptedAssetDecryptionData {
    private StorageEncryptedAssetDecryptionDataInner innerObject;

    private final MediaservicesManager serviceManager;

    public StorageEncryptedAssetDecryptionDataImpl(
        StorageEncryptedAssetDecryptionDataInner innerObject, MediaservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public byte[] key() {
        return this.innerModel().key();
    }

    public List<AssetFileEncryptionMetadata> assetFileEncryptionMetadata() {
        List<AssetFileEncryptionMetadata> inner = this.innerModel().assetFileEncryptionMetadata();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StorageEncryptedAssetDecryptionDataInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }
}
