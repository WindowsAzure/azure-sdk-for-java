// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub;

import com.azure.core.util.Context;

/** Samples for WebPubSubPrivateEndpointConnections Delete. */
public final class WebPubSubPrivateEndpointConnectionsDeleteSamples {
    /**
     * Sample code: WebPubSubPrivateEndpointConnections_Delete.
     *
     * @param webPubSubManager Entry point to WebPubSubManager. REST API for Azure WebPubSub Service.
     */
    public static void webPubSubPrivateEndpointConnectionsDelete(
        com.azure.resourcemanager.webpubsub.WebPubSubManager webPubSubManager) {
        webPubSubManager
            .webPubSubPrivateEndpointConnections()
            .delete(
                "mywebpubsubservice.1fa229cd-bf3f-47f0-8c49-afb36723997e",
                "myResourceGroup",
                "myWebPubSubService",
                Context.NONE);
    }
}
