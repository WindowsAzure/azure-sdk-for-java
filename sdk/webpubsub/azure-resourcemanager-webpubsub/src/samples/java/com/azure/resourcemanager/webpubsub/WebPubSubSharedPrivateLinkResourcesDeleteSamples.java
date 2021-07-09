// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub;

import com.azure.core.util.Context;

/** Samples for WebPubSubSharedPrivateLinkResources Delete. */
public final class WebPubSubSharedPrivateLinkResourcesDeleteSamples {
    /**
     * Sample code: WebPubSubSharedPrivateLinkResources_Delete.
     *
     * @param webPubSubManager Entry point to WebPubSubManager. REST API for Azure WebPubSub Service.
     */
    public static void webPubSubSharedPrivateLinkResourcesDelete(
        com.azure.resourcemanager.webpubsub.WebPubSubManager webPubSubManager) {
        webPubSubManager
            .webPubSubSharedPrivateLinkResources()
            .delete("upstream", "myResourceGroup", "myWebPubSubService", Context.NONE);
    }
}
