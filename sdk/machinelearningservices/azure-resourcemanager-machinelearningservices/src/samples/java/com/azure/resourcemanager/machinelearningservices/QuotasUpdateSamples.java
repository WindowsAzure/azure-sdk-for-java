// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices;

import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.models.QuotaBaseProperties;
import com.azure.resourcemanager.machinelearningservices.models.QuotaUnit;
import com.azure.resourcemanager.machinelearningservices.models.QuotaUpdateParameters;
import java.util.Arrays;

public final class QuotasUpdateSamples {
    public static void updateQuotas(
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager
            machineLearningServicesManager) {
        machineLearningServicesManager
            .quotas()
            .updateWithResponse(
                "eastus",
                new QuotaUpdateParameters()
                    .withValue(
                        Arrays
                            .asList(
                                new QuotaBaseProperties()
                                    .withId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg/providers/Microsoft.MachineLearningServices/workspaces/demo_workspace1/quotas/Standard_DSv2_Family_Cluster_Dedicated_vCPUs")
                                    .withType("Microsoft.MachineLearningServices/workspaces/quotas")
                                    .withLimit(100L)
                                    .withUnit(QuotaUnit.COUNT),
                                new QuotaBaseProperties()
                                    .withId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg/providers/Microsoft.MachineLearningServices/workspaces/demo_workspace2/quotas/Standard_DSv2_Family_Cluster_Dedicated_vCPUs")
                                    .withType("Microsoft.MachineLearningServices/workspaces/quotas")
                                    .withLimit(200L)
                                    .withUnit(QuotaUnit.COUNT))),
                Context.NONE);
    }
}
