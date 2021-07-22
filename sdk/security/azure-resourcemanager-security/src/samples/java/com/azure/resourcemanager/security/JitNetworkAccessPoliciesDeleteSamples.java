// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for JitNetworkAccessPolicies Delete. */
public final class JitNetworkAccessPoliciesDeleteSamples {
    /**
     * Sample code: Delete a JIT network access policy.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void deleteAJITNetworkAccessPolicy(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.jitNetworkAccessPolicies().deleteWithResponse("myRg1", "westeurope", "default", Context.NONE);
    }
}
