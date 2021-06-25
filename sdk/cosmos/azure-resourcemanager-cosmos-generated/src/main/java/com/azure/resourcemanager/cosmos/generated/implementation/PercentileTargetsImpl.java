// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.PercentileTargetsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PercentileMetricInner;
import com.azure.resourcemanager.cosmos.generated.models.PercentileMetric;
import com.azure.resourcemanager.cosmos.generated.models.PercentileTargets;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PercentileTargetsImpl implements PercentileTargets {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PercentileTargetsImpl.class);

    private final PercentileTargetsClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public PercentileTargetsImpl(
        PercentileTargetsClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PercentileMetric> listMetrics(
        String resourceGroupName, String accountName, String targetRegion, String filter) {
        PagedIterable<PercentileMetricInner> inner =
            this.serviceClient().listMetrics(resourceGroupName, accountName, targetRegion, filter);
        return Utils.mapPage(inner, inner1 -> new PercentileMetricImpl(inner1, this.manager()));
    }

    public PagedIterable<PercentileMetric> listMetrics(
        String resourceGroupName, String accountName, String targetRegion, String filter, Context context) {
        PagedIterable<PercentileMetricInner> inner =
            this.serviceClient().listMetrics(resourceGroupName, accountName, targetRegion, filter, context);
        return Utils.mapPage(inner, inner1 -> new PercentileMetricImpl(inner1, this.manager()));
    }

    private PercentileTargetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
