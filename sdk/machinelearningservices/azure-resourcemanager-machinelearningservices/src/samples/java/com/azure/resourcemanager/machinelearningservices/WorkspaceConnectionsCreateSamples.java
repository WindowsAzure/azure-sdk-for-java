// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices;

public final class WorkspaceConnectionsCreateSamples {
    public static void createWorkspaceConnection(
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager
            machineLearningServicesManager) {
        machineLearningServicesManager
            .workspaceConnections()
            .define("connection-1")
            .withExistingWorkspace("resourceGroup-1", "workspace-1")
            .withName("connection-1")
            .withCategory("ACR")
            .withTarget("www.facebook.com")
            .withAuthType("PAT")
            .withValue("secrets")
            .create();
    }
}
