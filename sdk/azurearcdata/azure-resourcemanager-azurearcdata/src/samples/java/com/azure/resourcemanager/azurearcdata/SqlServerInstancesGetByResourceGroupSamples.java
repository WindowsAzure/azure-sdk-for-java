// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata;

import com.azure.core.util.Context;

/** Samples for SqlServerInstances GetByResourceGroup. */
public final class SqlServerInstancesGetByResourceGroupSamples {
    /**
     * Sample code: Updates a SQL Server Instance tags.
     *
     * @param azureArcDataManager Entry point to AzureArcDataManager. The AzureArcData management API provides a RESTful
     *     set of web APIs to manage Azure Data Services on Azure Arc Resources.
     */
    public static void updatesASQLServerInstanceTags(
        com.azure.resourcemanager.azurearcdata.AzureArcDataManager azureArcDataManager) {
        azureArcDataManager
            .sqlServerInstances()
            .getByResourceGroupWithResponse("testrg", "testsqlServerInstance", Context.NONE);
    }
}
