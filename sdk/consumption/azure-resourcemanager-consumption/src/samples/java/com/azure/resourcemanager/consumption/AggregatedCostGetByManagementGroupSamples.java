// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

import com.azure.core.util.Context;

/** Samples for AggregatedCost GetByManagementGroup. */
public final class AggregatedCostGetByManagementGroupSamples {
    /**
     * Sample code: AggregatedCostByManagementGroupFilterByDate.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void aggregatedCostByManagementGroupFilterByDate(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .aggregatedCosts()
            .getByManagementGroupWithResponse(
                "managementGroupForTest",
                "usageStart ge '2018-08-15' and properties/usageStart le '2018-08-31'",
                Context.NONE);
    }

    /**
     * Sample code: AggregatedCostByManagementGroup.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void aggregatedCostByManagementGroup(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .aggregatedCosts()
            .getByManagementGroupWithResponse("managementGroupForTest", null, Context.NONE);
    }
}
