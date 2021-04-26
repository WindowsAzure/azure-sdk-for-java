// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.ReservationsSummariesClient;
import com.azure.resourcemanager.consumption.fluent.models.ReservationSummaryInner;
import com.azure.resourcemanager.consumption.models.Datagrain;
import com.azure.resourcemanager.consumption.models.ReservationSummary;
import com.azure.resourcemanager.consumption.models.ReservationsSummaries;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReservationsSummariesImpl implements ReservationsSummaries {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReservationsSummariesImpl.class);

    private final ReservationsSummariesClient innerClient;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    public ReservationsSummariesImpl(
        ReservationsSummariesClient innerClient,
        com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ReservationSummary> listByReservationOrder(String reservationOrderId, Datagrain grain) {
        PagedIterable<ReservationSummaryInner> inner =
            this.serviceClient().listByReservationOrder(reservationOrderId, grain);
        return Utils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationSummary> listByReservationOrder(
        String reservationOrderId, Datagrain grain, String filter, Context context) {
        PagedIterable<ReservationSummaryInner> inner =
            this.serviceClient().listByReservationOrder(reservationOrderId, grain, filter, context);
        return Utils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationSummary> listByReservationOrderAndReservation(
        String reservationOrderId, String reservationId, Datagrain grain) {
        PagedIterable<ReservationSummaryInner> inner =
            this.serviceClient().listByReservationOrderAndReservation(reservationOrderId, reservationId, grain);
        return Utils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationSummary> listByReservationOrderAndReservation(
        String reservationOrderId, String reservationId, Datagrain grain, String filter, Context context) {
        PagedIterable<ReservationSummaryInner> inner =
            this
                .serviceClient()
                .listByReservationOrderAndReservation(reservationOrderId, reservationId, grain, filter, context);
        return Utils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationSummary> list(String scope, Datagrain grain) {
        PagedIterable<ReservationSummaryInner> inner = this.serviceClient().list(scope, grain);
        return Utils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationSummary> list(
        String scope,
        Datagrain grain,
        String startDate,
        String endDate,
        String filter,
        String reservationId,
        String reservationOrderId,
        Context context) {
        PagedIterable<ReservationSummaryInner> inner =
            this
                .serviceClient()
                .list(scope, grain, startDate, endDate, filter, reservationId, reservationOrderId, context);
        return Utils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    private ReservationsSummariesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
