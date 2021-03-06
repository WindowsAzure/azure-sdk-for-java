// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.fluent.LocationBasedRecommendedActionSessionsResultsClient;
import com.azure.resourcemanager.mysql.fluent.models.RecommendationActionInner;
import com.azure.resourcemanager.mysql.models.LocationBasedRecommendedActionSessionsResults;
import com.azure.resourcemanager.mysql.models.RecommendationAction;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LocationBasedRecommendedActionSessionsResultsImpl
    implements LocationBasedRecommendedActionSessionsResults {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(LocationBasedRecommendedActionSessionsResultsImpl.class);

    private final LocationBasedRecommendedActionSessionsResultsClient innerClient;

    private final com.azure.resourcemanager.mysql.MySqlManager serviceManager;

    public LocationBasedRecommendedActionSessionsResultsImpl(
        LocationBasedRecommendedActionSessionsResultsClient innerClient,
        com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RecommendationAction> list(String locationName, String operationId) {
        PagedIterable<RecommendationActionInner> inner = this.serviceClient().list(locationName, operationId);
        return Utils.mapPage(inner, inner1 -> new RecommendationActionImpl(inner1, this.manager()));
    }

    public PagedIterable<RecommendationAction> list(String locationName, String operationId, Context context) {
        PagedIterable<RecommendationActionInner> inner = this.serviceClient().list(locationName, operationId, context);
        return Utils.mapPage(inner, inner1 -> new RecommendationActionImpl(inner1, this.manager()));
    }

    private LocationBasedRecommendedActionSessionsResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.MySqlManager manager() {
        return this.serviceManager;
    }
}
