// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.fluent.DatabasePrincipalAssignmentsClient;
import com.azure.resourcemanager.kusto.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalAssignmentInner;
import com.azure.resourcemanager.kusto.models.CheckNameResult;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalAssignment;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalAssignmentCheckNameRequest;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalAssignments;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DatabasePrincipalAssignmentsImpl implements DatabasePrincipalAssignments {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabasePrincipalAssignmentsImpl.class);

    private final DatabasePrincipalAssignmentsClient innerClient;

    private final com.azure.resourcemanager.kusto.KustoManager serviceManager;

    public DatabasePrincipalAssignmentsImpl(
        DatabasePrincipalAssignmentsClient innerClient, com.azure.resourcemanager.kusto.KustoManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameResult checkNameAvailability(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DatabasePrincipalAssignmentCheckNameRequest principalAssignmentName) {
        CheckNameResultInner inner =
            this
                .serviceClient()
                .checkNameAvailability(resourceGroupName, clusterName, databaseName, principalAssignmentName);
        if (inner != null) {
            return new CheckNameResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DatabasePrincipalAssignmentCheckNameRequest principalAssignmentName,
        Context context) {
        Response<CheckNameResultInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(
                    resourceGroupName, clusterName, databaseName, principalAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatabasePrincipalAssignment get(
        String resourceGroupName, String clusterName, String databaseName, String principalAssignmentName) {
        DatabasePrincipalAssignmentInner inner =
            this.serviceClient().get(resourceGroupName, clusterName, databaseName, principalAssignmentName);
        if (inner != null) {
            return new DatabasePrincipalAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabasePrincipalAssignment> getWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String principalAssignmentName,
        Context context) {
        Response<DatabasePrincipalAssignmentInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, clusterName, databaseName, principalAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabasePrincipalAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String clusterName, String databaseName, String principalAssignmentName) {
        this.serviceClient().delete(resourceGroupName, clusterName, databaseName, principalAssignmentName);
    }

    public void delete(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String principalAssignmentName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, databaseName, principalAssignmentName, context);
    }

    public PagedIterable<DatabasePrincipalAssignment> list(
        String resourceGroupName, String clusterName, String databaseName) {
        PagedIterable<DatabasePrincipalAssignmentInner> inner =
            this.serviceClient().list(resourceGroupName, clusterName, databaseName);
        return Utils.mapPage(inner, inner1 -> new DatabasePrincipalAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabasePrincipalAssignment> list(
        String resourceGroupName, String clusterName, String databaseName, Context context) {
        PagedIterable<DatabasePrincipalAssignmentInner> inner =
            this.serviceClient().list(resourceGroupName, clusterName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new DatabasePrincipalAssignmentImpl(inner1, this.manager()));
    }

    public DatabasePrincipalAssignment getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, clusterName, databaseName, principalAssignmentName, Context.NONE)
            .getValue();
    }

    public Response<DatabasePrincipalAssignment> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, databaseName, principalAssignmentName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, databaseName, principalAssignmentName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, databaseName, principalAssignmentName, context);
    }

    private DatabasePrincipalAssignmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.kusto.KustoManager manager() {
        return this.serviceManager;
    }

    public DatabasePrincipalAssignmentImpl define(String name) {
        return new DatabasePrincipalAssignmentImpl(name, this.manager());
    }
}
