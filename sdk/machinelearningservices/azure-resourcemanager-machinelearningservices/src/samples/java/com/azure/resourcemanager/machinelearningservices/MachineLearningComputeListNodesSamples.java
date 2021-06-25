// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices;

import com.azure.core.util.Context;

public final class MachineLearningComputeListNodesSamples {
    public static void getComputeNodesInformationForACompute(
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager
            machineLearningServicesManager) {
        machineLearningServicesManager
            .machineLearningComputes()
            .listNodes("testrg123", "workspaces123", "compute123", Context.NONE);
    }
}
