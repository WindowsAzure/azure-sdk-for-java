// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for StreamingPolicies List. */
public final class StreamingPoliciesListSamples {
    /**
     * Sample code: Lists Streaming Policies.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listsStreamingPolicies(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager.streamingPolicies().list("contoso", "contosomedia", null, null, null, Context.NONE);
    }
}
