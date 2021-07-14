// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

import com.azure.core.util.Context;

/** Samples for Balances GetByBillingAccount. */
public final class BalancesGetByBillingAccountSamples {
    /**
     * Sample code: Balances.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void balances(com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager.balances().getByBillingAccountWithResponse("123456", Context.NONE);
    }
}
