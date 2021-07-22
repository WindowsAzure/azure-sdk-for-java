// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for Assessments Delete. */
public final class AssessmentsDeleteSamples {
    /**
     * Sample code: Delete a security recommendation task on a resource.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void deleteASecurityRecommendationTaskOnAResource(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .assessments()
            .deleteWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myRg/providers/Microsoft.Compute/virtualMachineScaleSets/vmss2",
                "8bb8be0a-6010-4789-812f-e4d661c4ed0e",
                Context.NONE);
    }
}
