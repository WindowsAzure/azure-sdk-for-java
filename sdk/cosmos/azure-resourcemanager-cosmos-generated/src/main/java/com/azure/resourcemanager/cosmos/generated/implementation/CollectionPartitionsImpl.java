// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.CollectionPartitionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PartitionMetricInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PartitionUsageInner;
import com.azure.resourcemanager.cosmos.generated.models.CollectionPartitions;
import com.azure.resourcemanager.cosmos.generated.models.PartitionMetric;
import com.azure.resourcemanager.cosmos.generated.models.PartitionUsage;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CollectionPartitionsImpl implements CollectionPartitions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CollectionPartitionsImpl.class);

    private final CollectionPartitionsClient innerClient;

    private final CosmosDBManager serviceManager;

    public CollectionPartitionsImpl(CollectionPartitionsClient innerClient, CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PartitionMetric> listMetrics(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        PagedIterable<PartitionMetricInner> inner =
            this.serviceClient().listMetrics(resourceGroupName, accountName, databaseRid, collectionRid, filter);
        return inner.mapPage(inner1 -> new PartitionMetricImpl(inner1, this.manager()));
    }

    public PagedIterable<PartitionMetric> listMetrics(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        PagedIterable<PartitionMetricInner> inner =
            this
                .serviceClient()
                .listMetrics(resourceGroupName, accountName, databaseRid, collectionRid, filter, context);
        return inner.mapPage(inner1 -> new PartitionMetricImpl(inner1, this.manager()));
    }

    public PagedIterable<PartitionUsage> listUsages(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        PagedIterable<PartitionUsageInner> inner =
            this.serviceClient().listUsages(resourceGroupName, accountName, databaseRid, collectionRid);
        return inner.mapPage(inner1 -> new PartitionUsageImpl(inner1, this.manager()));
    }

    public PagedIterable<PartitionUsage> listUsages(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        PagedIterable<PartitionUsageInner> inner =
            this
                .serviceClient()
                .listUsages(resourceGroupName, accountName, databaseRid, collectionRid, filter, context);
        return inner.mapPage(inner1 -> new PartitionUsageImpl(inner1, this.manager()));
    }

    private CollectionPartitionsClient serviceClient() {
        return this.innerClient;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }
}
