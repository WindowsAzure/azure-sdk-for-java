// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

import com.azure.core.util.Context;

/** Samples for ReservationsDetails ListByReservationOrder. */
public final class ReservationsDetailsListByReservationOrderSamples {
    /**
     * Sample code: ReservationDetails.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void reservationDetails(com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .reservationsDetails()
            .listByReservationOrder(
                "00000000-0000-0000-0000-000000000000",
                "properties/usageDate ge 2017-10-01 AND properties/usageDate le 2017-12-05",
                Context.NONE);
    }
}
