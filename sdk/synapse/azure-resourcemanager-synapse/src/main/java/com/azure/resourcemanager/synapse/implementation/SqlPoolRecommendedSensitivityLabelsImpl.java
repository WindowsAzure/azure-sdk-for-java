// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.SqlPoolRecommendedSensitivityLabelsClient;
import com.azure.resourcemanager.synapse.models.RecommendedSensitivityLabelUpdateList;
import com.azure.resourcemanager.synapse.models.SqlPoolRecommendedSensitivityLabels;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlPoolRecommendedSensitivityLabelsImpl implements SqlPoolRecommendedSensitivityLabels {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolRecommendedSensitivityLabelsImpl.class);

    private final SqlPoolRecommendedSensitivityLabelsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public SqlPoolRecommendedSensitivityLabelsImpl(
        SqlPoolRecommendedSensitivityLabelsClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void update(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        RecommendedSensitivityLabelUpdateList parameters) {
        this.serviceClient().update(resourceGroupName, workspaceName, sqlPoolName, parameters);
    }

    public Response<Void> updateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        RecommendedSensitivityLabelUpdateList parameters,
        Context context) {
        return this
            .serviceClient()
            .updateWithResponse(resourceGroupName, workspaceName, sqlPoolName, parameters, context);
    }

    private SqlPoolRecommendedSensitivityLabelsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
