// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotDefenderSettings Get. */
public final class IotDefenderSettingsGetSamples {
    /**
     * Sample code: Get IoT Defender settings.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getIoTDefenderSettings(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.iotDefenderSettings().getWithResponse(Context.NONE);
    }
}
