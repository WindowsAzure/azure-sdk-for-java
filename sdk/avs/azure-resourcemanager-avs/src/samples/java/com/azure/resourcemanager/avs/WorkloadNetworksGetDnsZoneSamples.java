// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks GetDnsZone. */
public final class WorkloadNetworksGetDnsZoneSamples {
    /**
     * Sample code: WorkloadNetworks_GetDnsZone.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksGetDnsZone(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.workloadNetworks().getDnsZoneWithResponse("group1", "cloud1", "dnsZone1", Context.NONE);
    }
}
