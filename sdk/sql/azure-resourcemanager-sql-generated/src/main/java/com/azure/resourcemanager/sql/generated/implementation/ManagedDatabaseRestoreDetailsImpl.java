// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ManagedDatabaseRestoreDetailsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedDatabaseRestoreDetailsResultInner;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseRestoreDetails;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseRestoreDetailsResult;
import com.azure.resourcemanager.sql.generated.models.RestoreDetailsName;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagedDatabaseRestoreDetailsImpl implements ManagedDatabaseRestoreDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedDatabaseRestoreDetailsImpl.class);

    private final ManagedDatabaseRestoreDetailsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ManagedDatabaseRestoreDetailsImpl(
        ManagedDatabaseRestoreDetailsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ManagedDatabaseRestoreDetailsResult get(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        RestoreDetailsName restoreDetailsName) {
        ManagedDatabaseRestoreDetailsResultInner inner =
            this.serviceClient().get(resourceGroupName, managedInstanceName, databaseName, restoreDetailsName);
        if (inner != null) {
            return new ManagedDatabaseRestoreDetailsResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedDatabaseRestoreDetailsResult> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        RestoreDetailsName restoreDetailsName,
        Context context) {
        Response<ManagedDatabaseRestoreDetailsResultInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, managedInstanceName, databaseName, restoreDetailsName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedDatabaseRestoreDetailsResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ManagedDatabaseRestoreDetailsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
