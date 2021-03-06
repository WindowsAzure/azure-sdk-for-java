// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub;

import com.azure.core.util.Context;

/** Samples for WebPubSub List. */
public final class WebPubSubListSamples {
    /**
     * Sample code: WebPubSub_ListBySubscription.
     *
     * @param webPubSubManager Entry point to WebPubSubManager. REST API for Azure WebPubSub Service.
     */
    public static void webPubSubListBySubscription(
        com.azure.resourcemanager.webpubsub.WebPubSubManager webPubSubManager) {
        webPubSubManager.webPubSubs().list(Context.NONE);
    }
}
