// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for HcxEnterpriseSites Get. */
public final class HcxEnterpriseSitesGetSamples {
    /**
     * Sample code: HcxEnterpriseSites_Get.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void hcxEnterpriseSitesGet(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.hcxEnterpriseSites().getWithResponse("group1", "cloud1", "site1", Context.NONE);
    }
}
