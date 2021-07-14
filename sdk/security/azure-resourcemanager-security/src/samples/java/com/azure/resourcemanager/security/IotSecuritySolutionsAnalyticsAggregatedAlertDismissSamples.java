// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotSecuritySolutionsAnalyticsAggregatedAlert Dismiss. */
public final class IotSecuritySolutionsAnalyticsAggregatedAlertDismissSamples {
    /**
     * Sample code: Dismiss an aggregated IoT Security Solution Alert.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void dismissAnAggregatedIoTSecuritySolutionAlert(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .iotSecuritySolutionsAnalyticsAggregatedAlerts()
            .dismissWithResponse("IoTEdgeResources", "default", "IoT_Bruteforce_Fail/2019-02-02/dismiss", Context.NONE);
    }
}
