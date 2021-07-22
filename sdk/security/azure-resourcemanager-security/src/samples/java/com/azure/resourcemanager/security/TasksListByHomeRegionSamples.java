// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for Tasks ListByHomeRegion. */
public final class TasksListByHomeRegionSamples {
    /**
     * Sample code: Get security recommendations tasks from security data location.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getSecurityRecommendationsTasksFromSecurityDataLocation(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.tasks().listByHomeRegion("westeurope", null, Context.NONE);
    }
}
