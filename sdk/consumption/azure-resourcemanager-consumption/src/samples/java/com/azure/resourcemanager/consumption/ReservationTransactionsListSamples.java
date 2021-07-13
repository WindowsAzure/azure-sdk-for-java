// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

import com.azure.core.util.Context;

/** Samples for ReservationTransactions List. */
public final class ReservationTransactionsListSamples {
    /**
     * Sample code: ReservationTransactionsByEnrollmentNumber.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void reservationTransactionsByEnrollmentNumber(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .reservationTransactions()
            .list("123456", "properties/eventDate+ge+2020-05-20+AND+properties/eventDate+le+2020-05-30", Context.NONE);
    }
}
