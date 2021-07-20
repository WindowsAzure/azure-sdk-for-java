// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr;

import com.azure.core.util.Context;

/** Samples for SignalRPrivateLinkResources List. */
public final class SignalRPrivateLinkResourcesListSamples {
    /**
     * Sample code: SignalRPrivateLinkResources_List.
     *
     * @param signalRManager Entry point to SignalRManager. REST API for Azure SignalR Service.
     */
    public static void signalRPrivateLinkResourcesList(
        com.azure.resourcemanager.signalr.SignalRManager signalRManager) {
        signalRManager.signalRPrivateLinkResources().list("myResourceGroup", "mySignalRService", Context.NONE);
    }
}
