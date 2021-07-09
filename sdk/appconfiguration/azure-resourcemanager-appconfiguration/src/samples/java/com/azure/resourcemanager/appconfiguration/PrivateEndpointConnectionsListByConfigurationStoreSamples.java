// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections ListByConfigurationStore. */
public final class PrivateEndpointConnectionsListByConfigurationStoreSamples {
    /**
     * Sample code: PrivateEndpointConnection_List.
     *
     * @param appConfigurationManager Entry point to AppConfigurationManager.
     */
    public static void privateEndpointConnectionList(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager appConfigurationManager) {
        appConfigurationManager
            .privateEndpointConnections()
            .listByConfigurationStore("myResourceGroup", "contoso", Context.NONE);
    }
}
