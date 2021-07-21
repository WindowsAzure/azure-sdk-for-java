// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration;

import com.azure.core.util.Context;

/** Samples for ConfigurationStores GetByResourceGroup. */
public final class ConfigurationStoresGetByResourceGroupSamples {
    /**
     * Sample code: ConfigurationStores_Get.
     *
     * @param appConfigurationManager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresGet(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager appConfigurationManager) {
        appConfigurationManager
            .configurationStores()
            .getByResourceGroupWithResponse("myResourceGroup", "contoso", Context.NONE);
    }
}
