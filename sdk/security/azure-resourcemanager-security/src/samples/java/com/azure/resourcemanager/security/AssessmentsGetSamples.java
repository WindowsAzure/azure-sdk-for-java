// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.models.ExpandEnum;

/** Samples for Assessments Get. */
public final class AssessmentsGetSamples {
    /**
     * Sample code: Get security recommendation task from security data location with expand parameter.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getSecurityRecommendationTaskFromSecurityDataLocationWithExpandParameter(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .assessments()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myRg/providers/Microsoft.Compute/virtualMachineScaleSets/vmss2",
                "21300918-b2e3-0346-785f-c77ff57d243b",
                ExpandEnum.LINKS,
                Context.NONE);
    }

    /**
     * Sample code: Get security recommendation task from security data location.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getSecurityRecommendationTaskFromSecurityDataLocation(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .assessments()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myRg/providers/Microsoft.Compute/virtualMachineScaleSets/vmss2",
                "21300918-b2e3-0346-785f-c77ff57d243b",
                null,
                Context.NONE);
    }
}
