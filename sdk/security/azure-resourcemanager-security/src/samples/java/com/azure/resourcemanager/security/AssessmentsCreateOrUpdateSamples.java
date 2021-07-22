// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.resourcemanager.security.models.AssessmentStatus;
import com.azure.resourcemanager.security.models.AssessmentStatusCode;
import com.azure.resourcemanager.security.models.AzureResourceDetails;

/** Samples for Assessments CreateOrUpdate. */
public final class AssessmentsCreateOrUpdateSamples {
    /**
     * Sample code: Create security recommendation task on a resource.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void createSecurityRecommendationTaskOnAResource(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .assessments()
            .define("8bb8be0a-6010-4789-812f-e4d661c4ed0e")
            .withExistingResourceId(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myRg/providers/Microsoft.Compute/virtualMachineScaleSets/vmss2")
            .withResourceDetails(new AzureResourceDetails())
            .withStatus(new AssessmentStatus().withCode(AssessmentStatusCode.HEALTHY))
            .create();
    }
}
