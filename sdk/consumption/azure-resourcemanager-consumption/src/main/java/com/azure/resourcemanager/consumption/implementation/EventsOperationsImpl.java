// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.EventsOperationsClient;
import com.azure.resourcemanager.consumption.fluent.models.EventSummaryInner;
import com.azure.resourcemanager.consumption.models.EventSummary;
import com.azure.resourcemanager.consumption.models.EventsOperations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EventsOperationsImpl implements EventsOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventsOperationsImpl.class);

    private final EventsOperationsClient innerClient;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    public EventsOperationsImpl(
        EventsOperationsClient innerClient, com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EventSummary> list(String startDate, String endDate, String scope) {
        PagedIterable<EventSummaryInner> inner = this.serviceClient().list(startDate, endDate, scope);
        return Utils.mapPage(inner, inner1 -> new EventSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSummary> list(String startDate, String endDate, String scope, Context context) {
        PagedIterable<EventSummaryInner> inner = this.serviceClient().list(startDate, endDate, scope, context);
        return Utils.mapPage(inner, inner1 -> new EventSummaryImpl(inner1, this.manager()));
    }

    private EventsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
