// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.DatabaseAccountRegionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MetricInner;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountRegions;
import com.azure.resourcemanager.cosmos.generated.models.Metric;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DatabaseAccountRegionsImpl implements DatabaseAccountRegions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseAccountRegionsImpl.class);

    private final DatabaseAccountRegionsClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public DatabaseAccountRegionsImpl(
        DatabaseAccountRegionsClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Metric> listMetrics(
        String resourceGroupName, String accountName, String region, String filter) {
        PagedIterable<MetricInner> inner =
            this.serviceClient().listMetrics(resourceGroupName, accountName, region, filter);
        return Utils.mapPage(inner, inner1 -> new MetricImpl(inner1, this.manager()));
    }

    public PagedIterable<Metric> listMetrics(
        String resourceGroupName, String accountName, String region, String filter, Context context) {
        PagedIterable<MetricInner> inner =
            this.serviceClient().listMetrics(resourceGroupName, accountName, region, filter, context);
        return Utils.mapPage(inner, inner1 -> new MetricImpl(inner1, this.manager()));
    }

    private DatabaseAccountRegionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
