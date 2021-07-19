// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for Transforms Delete. */
public final class TransformsDeleteSamples {
    /**
     * Sample code: Delete a Transform.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void deleteATransform(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .transforms()
            .deleteWithResponse("contosoresources", "contosomedia", "sampleTransform", Context.NONE);
    }
}
