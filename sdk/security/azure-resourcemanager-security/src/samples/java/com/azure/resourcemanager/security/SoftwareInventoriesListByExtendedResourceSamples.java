// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for SoftwareInventories ListByExtendedResource. */
public final class SoftwareInventoriesListByExtendedResourceSamples {
    /**
     * Sample code: Gets the software inventory of the virtual machine.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getsTheSoftwareInventoryOfTheVirtualMachine(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .softwareInventories()
            .listByExtendedResource("EITAN-TESTS", "Microsoft.Compute", "virtualMachines", "Eitan-Test1", Context.NONE);
    }
}
