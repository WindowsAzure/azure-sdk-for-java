// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices;

import com.azure.core.util.Context;

/** Samples for MachineLearningCompute Start. */
public final class MachineLearningComputeStartSamples {
    /**
     * Sample code: Start ComputeInstance Compute.
     *
     * @param machineLearningServicesManager Entry point to MachineLearningServicesManager. These APIs allow end users
     *     to operate on Azure Machine Learning Workspace resources.
     */
    public static void startComputeInstanceCompute(
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager
            machineLearningServicesManager) {
        machineLearningServicesManager
            .machineLearningComputes()
            .start("testrg123", "workspaces123", "compute123", Context.NONE);
    }
}
