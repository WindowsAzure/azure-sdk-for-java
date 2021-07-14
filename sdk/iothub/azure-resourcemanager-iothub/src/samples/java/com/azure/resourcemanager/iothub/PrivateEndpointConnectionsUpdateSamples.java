// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.iothub.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.iothub.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.iothub.models.PrivateLinkServiceConnectionStatus;

/** Samples for PrivateEndpointConnections Update. */
public final class PrivateEndpointConnectionsUpdateSamples {
    /**
     * Sample code: PrivateEndpointConnection_Update.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void privateEndpointConnectionUpdate(com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager
            .privateEndpointConnections()
            .update(
                "myResourceGroup",
                "testHub",
                "myPrivateEndpointConnection",
                new PrivateEndpointConnectionInner()
                    .withProperties(
                        new PrivateEndpointConnectionProperties()
                            .withPrivateLinkServiceConnectionState(
                                new PrivateLinkServiceConnectionState()
                                    .withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                                    .withDescription("Approved by johndoe@contoso.com"))),
                Context.NONE);
    }
}
