// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.ReservationRecommendationDetailsClient;
import com.azure.resourcemanager.consumption.fluent.models.ReservationRecommendationDetailsModelInner;
import com.azure.resourcemanager.consumption.models.LookBackPeriod;
import com.azure.resourcemanager.consumption.models.ReservationRecommendationDetails;
import com.azure.resourcemanager.consumption.models.ReservationRecommendationDetailsModel;
import com.azure.resourcemanager.consumption.models.Scope;
import com.azure.resourcemanager.consumption.models.Term;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReservationRecommendationDetailsImpl implements ReservationRecommendationDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReservationRecommendationDetailsImpl.class);

    private final ReservationRecommendationDetailsClient innerClient;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    public ReservationRecommendationDetailsImpl(
        ReservationRecommendationDetailsClient innerClient,
        com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ReservationRecommendationDetailsModel get(
        String billingScope, Scope scope, String region, Term term, LookBackPeriod lookBackPeriod, String product) {
        ReservationRecommendationDetailsModelInner inner =
            this.serviceClient().get(billingScope, scope, region, term, lookBackPeriod, product);
        if (inner != null) {
            return new ReservationRecommendationDetailsModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ReservationRecommendationDetailsModel> getWithResponse(
        String billingScope,
        Scope scope,
        String region,
        Term term,
        LookBackPeriod lookBackPeriod,
        String product,
        Context context) {
        Response<ReservationRecommendationDetailsModelInner> inner =
            this.serviceClient().getWithResponse(billingScope, scope, region, term, lookBackPeriod, product, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ReservationRecommendationDetailsModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ReservationRecommendationDetailsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}