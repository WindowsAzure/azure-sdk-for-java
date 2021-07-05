// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ManagedDatabaseRecommendedSensitivityLabelsClient;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseRecommendedSensitivityLabels;
import com.azure.resourcemanager.sql.generated.models.RecommendedSensitivityLabelUpdateList;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagedDatabaseRecommendedSensitivityLabelsImpl
    implements ManagedDatabaseRecommendedSensitivityLabels {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ManagedDatabaseRecommendedSensitivityLabelsImpl.class);

    private final ManagedDatabaseRecommendedSensitivityLabelsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ManagedDatabaseRecommendedSensitivityLabelsImpl(
        ManagedDatabaseRecommendedSensitivityLabelsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void update(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        RecommendedSensitivityLabelUpdateList parameters) {
        this.serviceClient().update(resourceGroupName, managedInstanceName, databaseName, parameters);
    }

    public Response<Void> updateWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        RecommendedSensitivityLabelUpdateList parameters,
        Context context) {
        return this
            .serviceClient()
            .updateWithResponse(resourceGroupName, managedInstanceName, databaseName, parameters, context);
    }

    private ManagedDatabaseRecommendedSensitivityLabelsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
