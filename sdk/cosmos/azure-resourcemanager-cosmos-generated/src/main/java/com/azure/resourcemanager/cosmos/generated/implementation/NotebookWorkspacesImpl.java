// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.NotebookWorkspacesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.NotebookWorkspaceConnectionInfoResultInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.NotebookWorkspaceInner;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspace;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspaceConnectionInfoResult;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspaceName;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspaces;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NotebookWorkspacesImpl implements NotebookWorkspaces {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NotebookWorkspacesImpl.class);

    private final NotebookWorkspacesClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public NotebookWorkspacesImpl(
        NotebookWorkspacesClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NotebookWorkspace> listByDatabaseAccount(String resourceGroupName, String accountName) {
        PagedIterable<NotebookWorkspaceInner> inner =
            this.serviceClient().listByDatabaseAccount(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new NotebookWorkspaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NotebookWorkspace> listByDatabaseAccount(
        String resourceGroupName, String accountName, Context context) {
        PagedIterable<NotebookWorkspaceInner> inner =
            this.serviceClient().listByDatabaseAccount(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new NotebookWorkspaceImpl(inner1, this.manager()));
    }

    public NotebookWorkspace get(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName) {
        NotebookWorkspaceInner inner = this.serviceClient().get(resourceGroupName, accountName, notebookWorkspaceName);
        if (inner != null) {
            return new NotebookWorkspaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NotebookWorkspace> getWithResponse(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context) {
        Response<NotebookWorkspaceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, notebookWorkspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NotebookWorkspaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName) {
        this.serviceClient().delete(resourceGroupName, accountName, notebookWorkspaceName);
    }

    public void delete(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, notebookWorkspaceName, context);
    }

    public NotebookWorkspaceConnectionInfoResult listConnectionInfo(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName) {
        NotebookWorkspaceConnectionInfoResultInner inner =
            this.serviceClient().listConnectionInfo(resourceGroupName, accountName, notebookWorkspaceName);
        if (inner != null) {
            return new NotebookWorkspaceConnectionInfoResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NotebookWorkspaceConnectionInfoResult> listConnectionInfoWithResponse(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context) {
        Response<NotebookWorkspaceConnectionInfoResultInner> inner =
            this
                .serviceClient()
                .listConnectionInfoWithResponse(resourceGroupName, accountName, notebookWorkspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NotebookWorkspaceConnectionInfoResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void regenerateAuthToken(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName) {
        this.serviceClient().regenerateAuthToken(resourceGroupName, accountName, notebookWorkspaceName);
    }

    public void regenerateAuthToken(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context) {
        this.serviceClient().regenerateAuthToken(resourceGroupName, accountName, notebookWorkspaceName, context);
    }

    public void start(String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName) {
        this.serviceClient().start(resourceGroupName, accountName, notebookWorkspaceName);
    }

    public void start(
        String resourceGroupName, String accountName, NotebookWorkspaceName notebookWorkspaceName, Context context) {
        this.serviceClient().start(resourceGroupName, accountName, notebookWorkspaceName, context);
    }

    public NotebookWorkspace getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "databaseAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'databaseAccounts'.", id)));
        }
        NotebookWorkspaceName notebookWorkspaceName =
            NotebookWorkspaceName.fromString(Utils.getValueFromIdByName(id, "notebookWorkspaces"));
        if (notebookWorkspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'notebookWorkspaces'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, notebookWorkspaceName, Context.NONE).getValue();
    }

    public Response<NotebookWorkspace> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "databaseAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'databaseAccounts'.", id)));
        }
        NotebookWorkspaceName notebookWorkspaceName =
            NotebookWorkspaceName.fromString(Utils.getValueFromIdByName(id, "notebookWorkspaces"));
        if (notebookWorkspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'notebookWorkspaces'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, notebookWorkspaceName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "databaseAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'databaseAccounts'.", id)));
        }
        NotebookWorkspaceName notebookWorkspaceName =
            NotebookWorkspaceName.fromString(Utils.getValueFromIdByName(id, "notebookWorkspaces"));
        if (notebookWorkspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'notebookWorkspaces'.", id)));
        }
        this.delete(resourceGroupName, accountName, notebookWorkspaceName, Context.NONE);
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
        String accountName = Utils.getValueFromIdByName(id, "databaseAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'databaseAccounts'.", id)));
        }
        NotebookWorkspaceName notebookWorkspaceName =
            NotebookWorkspaceName.fromString(Utils.getValueFromIdByName(id, "notebookWorkspaces"));
        if (notebookWorkspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'notebookWorkspaces'.", id)));
        }
        this.delete(resourceGroupName, accountName, notebookWorkspaceName, context);
    }

    private NotebookWorkspacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    public NotebookWorkspaceImpl define(NotebookWorkspaceName name) {
        return new NotebookWorkspaceImpl(name, this.manager());
    }
}
