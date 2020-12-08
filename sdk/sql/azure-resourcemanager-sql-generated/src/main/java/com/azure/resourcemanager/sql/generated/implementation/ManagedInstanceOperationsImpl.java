// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.ManagedInstanceOperationsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceOperationInner;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceOperation;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceOperations;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.UUID;

public final class ManagedInstanceOperationsImpl implements ManagedInstanceOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedInstanceOperationsImpl.class);

    private final ManagedInstanceOperationsClient innerClient;

    private final SqlManager serviceManager;

    public ManagedInstanceOperationsImpl(ManagedInstanceOperationsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void cancel(String resourceGroupName, String managedInstanceName, UUID operationId) {
        this.serviceClient().cancel(resourceGroupName, managedInstanceName, operationId);
    }

    public Response<Void> cancelWithResponse(
        String resourceGroupName, String managedInstanceName, UUID operationId, Context context) {
        return this.serviceClient().cancelWithResponse(resourceGroupName, managedInstanceName, operationId, context);
    }

    public PagedIterable<ManagedInstanceOperation> listByManagedInstance(
        String resourceGroupName, String managedInstanceName) {
        PagedIterable<ManagedInstanceOperationInner> inner =
            this.serviceClient().listByManagedInstance(resourceGroupName, managedInstanceName);
        return inner.mapPage(inner1 -> new ManagedInstanceOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedInstanceOperation> listByManagedInstance(
        String resourceGroupName, String managedInstanceName, Context context) {
        PagedIterable<ManagedInstanceOperationInner> inner =
            this.serviceClient().listByManagedInstance(resourceGroupName, managedInstanceName, context);
        return inner.mapPage(inner1 -> new ManagedInstanceOperationImpl(inner1, this.manager()));
    }

    public ManagedInstanceOperation get(String resourceGroupName, String managedInstanceName, UUID operationId) {
        ManagedInstanceOperationInner inner =
            this.serviceClient().get(resourceGroupName, managedInstanceName, operationId);
        if (inner != null) {
            return new ManagedInstanceOperationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedInstanceOperation> getWithResponse(
        String resourceGroupName, String managedInstanceName, UUID operationId, Context context) {
        Response<ManagedInstanceOperationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, managedInstanceName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedInstanceOperationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ManagedInstanceOperationsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
