// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata;

import com.azure.core.util.Context;

/** Samples for DataControllers ListByResourceGroup. */
public final class DataControllersListByResourceGroupSamples {
    /**
     * Sample code: Gets all dataControllers in a resource group.
     *
     * @param azureArcDataManager Entry point to AzureArcDataManager. The AzureArcData management API provides a RESTful
     *     set of web APIs to manage Azure Data Services on Azure Arc Resources.
     */
    public static void getsAllDataControllersInAResourceGroup(
        com.azure.resourcemanager.azurearcdata.AzureArcDataManager azureArcDataManager) {
        azureArcDataManager.dataControllers().listByResourceGroup("testrg", Context.NONE);
    }
}
