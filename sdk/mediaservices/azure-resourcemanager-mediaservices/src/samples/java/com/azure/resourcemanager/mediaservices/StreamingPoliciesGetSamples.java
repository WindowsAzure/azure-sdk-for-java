// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for StreamingPolicies Get. */
public final class StreamingPoliciesGetSamples {
    /**
     * Sample code: Get a Streaming Policy by name.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void getAStreamingPolicyByName(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .streamingPolicies()
            .getWithResponse("contoso", "contosomedia", "clearStreamingPolicy", Context.NONE);
    }
}
