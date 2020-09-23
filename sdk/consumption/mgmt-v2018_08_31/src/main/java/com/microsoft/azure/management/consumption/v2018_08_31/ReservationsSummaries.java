/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_08_31;

import rx.Observable;

/**
 * Type representing ReservationsSummaries.
 */
public interface ReservationsSummaries {
    /**
     * Lists the reservations summaries for daily or monthly grain.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param grain Can be daily or monthly. Possible values include: 'DailyGrain', 'MonthlyGrain'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReservationSummary> listByReservationOrderAsync(final String reservationOrderId, final Datagrain grain);

    /**
     * Lists the reservations summaries for daily or monthly grain.
     *
     * @param reservationOrderId Order Id of the reservation
     * @param reservationId Id of the reservation
     * @param grain Can be daily or monthly. Possible values include: 'DailyGrain', 'MonthlyGrain'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReservationSummary> listByReservationOrderAndReservationAsync(final String reservationOrderId, final String reservationId, final Datagrain grain);

}
