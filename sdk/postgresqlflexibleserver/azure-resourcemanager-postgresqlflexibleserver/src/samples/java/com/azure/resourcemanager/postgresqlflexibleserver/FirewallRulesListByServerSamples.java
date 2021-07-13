// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver;

import com.azure.core.util.Context;

/** Samples for FirewallRules ListByServer. */
public final class FirewallRulesListByServerSamples {
    /**
     * Sample code: FirewallRuleList.
     *
     * @param postgreSqlManager Entry point to PostgreSqlManager. The Microsoft Azure management API provides create,
     *     read, update, and delete functionality for Azure PostgreSQL resources including servers, databases, firewall
     *     rules, VNET rules, security alert policies, log files and configurations with new business model.
     */
    public static void firewallRuleList(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager postgreSqlManager) {
        postgreSqlManager.firewallRules().listByServer("testrg", "testserver", Context.NONE);
    }
}
