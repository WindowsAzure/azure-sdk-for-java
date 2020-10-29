/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2020_05_01.implementation.MediaManager;
import com.microsoft.azure.management.mediaservices.v2020_05_01.implementation.ListContentKeysResponseInner;
import java.util.List;

/**
 * Type representing ListContentKeysResponse.
 */
public interface ListContentKeysResponse extends HasInner<ListContentKeysResponseInner>, HasManager<MediaManager> {
    /**
     * @return the contentKeys value.
     */
    List<StreamingLocatorContentKey> contentKeys();

}
