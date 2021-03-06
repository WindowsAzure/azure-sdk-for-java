// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotSecuritySolution ListByResourceGroup. */
public final class IotSecuritySolutionListByResourceGroupSamples {
    /**
     * Sample code: List IoT Security solutions by resource group and IoT Hub.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void listIoTSecuritySolutionsByResourceGroupAndIoTHub(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .iotSecuritySolutions()
            .listByResourceGroup(
                "MyRg",
                "properties.iotHubs/any(i eq"
                    + " \"/subscriptions/075423e9-7d33-4166-8bdf-3920b04e3735/resourceGroups/myRg/providers/Microsoft.Devices/IotHubs/FirstIotHub\")",
                Context.NONE);
    }

    /**
     * Sample code: List IoT Security solutions by resource group.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void listIoTSecuritySolutionsByResourceGroup(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.iotSecuritySolutions().listByResourceGroup("MyGroup", null, Context.NONE);
    }
}
