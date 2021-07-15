// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql;

/** Samples for VirtualNetworkRules CreateOrUpdate. */
public final class VirtualNetworkRulesCreateOrUpdateSamples {
    /**
     * Sample code: Create or update a virtual network rule.
     *
     * @param mySqlManager Entry point to MySqlManager. The Microsoft Azure management API provides create, read,
     *     update, and delete functionality for Azure MySQL resources including servers, databases, firewall rules, VNET
     *     rules, log files and configurations with new business model.
     */
    public static void createOrUpdateAVirtualNetworkRule(com.azure.resourcemanager.mysql.MySqlManager mySqlManager) {
        mySqlManager
            .virtualNetworkRules()
            .define("vnet-firewall-rule")
            .withExistingServer("TestGroup", "vnet-test-svr")
            .withVirtualNetworkSubnetId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestGroup/providers/Microsoft.Network/virtualNetworks/testvnet/subnets/testsubnet")
            .withIgnoreMissingVnetServiceEndpoint(false)
            .create();
    }
}
