// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for SecuritySolutions Get. */
public final class SecuritySolutionsGetSamples {
    /**
     * Sample code: Get a security solution from a security data location.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getASecuritySolutionFromASecurityDataLocation(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.securitySolutions().getWithResponse("myRg2", "centralus", "paloalto7", Context.NONE);
    }
}
