/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation.MediaManager;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation.StorageEncryptedAssetDecryptionDataInner;
import java.util.List;

/**
 * Type representing StorageEncryptedAssetDecryptionData.
 */
public interface StorageEncryptedAssetDecryptionData extends HasInner<StorageEncryptedAssetDecryptionDataInner>, HasManager<MediaManager> {
    /**
     * @return the assetFileEncryptionMetadata value.
     */
    List<AssetFileEncryptionMetadata> assetFileEncryptionMetadata();

    /**
     * @return the key value.
     */
    byte[] keyVal();

}
