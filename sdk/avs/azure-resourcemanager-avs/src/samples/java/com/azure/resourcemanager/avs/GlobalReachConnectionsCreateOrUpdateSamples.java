// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

/** Samples for GlobalReachConnections CreateOrUpdate. */
public final class GlobalReachConnectionsCreateOrUpdateSamples {
    /**
     * Sample code: GlobalReachConnections_CreateOrUpdate.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void globalReachConnectionsCreateOrUpdate(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager
            .globalReachConnections()
            .define("connection1")
            .withExistingPrivateCloud("group1", "cloud1")
            .withAuthorizationKey("01010101-0101-0101-0101-010101010101")
            .withPeerExpressRouteCircuit(
                "/subscriptions/12341234-1234-1234-1234-123412341234/resourceGroups/mygroup/providers/Microsoft.Network/expressRouteCircuits/mypeer")
            .create();
    }
}
