// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for Authorizations Get. */
public final class AuthorizationsGetSamples {
    /**
     * Sample code: Authorizations_Get.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void authorizationsGet(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.authorizations().getWithResponse("group1", "cloud1", "authorization1", Context.NONE);
    }
}
