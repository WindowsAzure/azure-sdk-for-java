// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.CassandraResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.CassandraKeyspaceGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.CassandraTableGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.ThroughputSettingsGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.CassandraKeyspaceGetResults;
import com.azure.resourcemanager.cosmos.generated.models.CassandraResources;
import com.azure.resourcemanager.cosmos.generated.models.CassandraTableGetResults;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsGetResults;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsUpdateParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CassandraResourcesImpl implements CassandraResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CassandraResourcesImpl.class);

    private final CassandraResourcesClient innerClient;

    private final CosmosDBManager serviceManager;

    public CassandraResourcesImpl(CassandraResourcesClient innerClient, CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CassandraKeyspaceGetResults> listCassandraKeyspaces(
        String resourceGroupName, String accountName) {
        PagedIterable<CassandraKeyspaceGetResultsInner> inner =
            this.serviceClient().listCassandraKeyspaces(resourceGroupName, accountName);
        return inner.mapPage(inner1 -> new CassandraKeyspaceGetResultsImpl(inner1, this.manager()));
    }

    public PagedIterable<CassandraKeyspaceGetResults> listCassandraKeyspaces(
        String resourceGroupName, String accountName, Context context) {
        PagedIterable<CassandraKeyspaceGetResultsInner> inner =
            this.serviceClient().listCassandraKeyspaces(resourceGroupName, accountName, context);
        return inner.mapPage(inner1 -> new CassandraKeyspaceGetResultsImpl(inner1, this.manager()));
    }

    public CassandraKeyspaceGetResults getCassandraKeyspace(
        String resourceGroupName, String accountName, String keyspaceName) {
        CassandraKeyspaceGetResultsInner inner =
            this.serviceClient().getCassandraKeyspace(resourceGroupName, accountName, keyspaceName);
        if (inner != null) {
            return new CassandraKeyspaceGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CassandraKeyspaceGetResults> getCassandraKeyspaceWithResponse(
        String resourceGroupName, String accountName, String keyspaceName, Context context) {
        Response<CassandraKeyspaceGetResultsInner> inner =
            this
                .serviceClient()
                .getCassandraKeyspaceWithResponse(resourceGroupName, accountName, keyspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CassandraKeyspaceGetResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteCassandraKeyspace(String resourceGroupName, String accountName, String keyspaceName) {
        this.serviceClient().deleteCassandraKeyspace(resourceGroupName, accountName, keyspaceName);
    }

    public void deleteCassandraKeyspace(
        String resourceGroupName, String accountName, String keyspaceName, Context context) {
        this.serviceClient().deleteCassandraKeyspace(resourceGroupName, accountName, keyspaceName, context);
    }

    public ThroughputSettingsGetResults getCassandraKeyspaceThroughput(
        String resourceGroupName, String accountName, String keyspaceName) {
        ThroughputSettingsGetResultsInner inner =
            this.serviceClient().getCassandraKeyspaceThroughput(resourceGroupName, accountName, keyspaceName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ThroughputSettingsGetResults> getCassandraKeyspaceThroughputWithResponse(
        String resourceGroupName, String accountName, String keyspaceName, Context context) {
        Response<ThroughputSettingsGetResultsInner> inner =
            this
                .serviceClient()
                .getCassandraKeyspaceThroughputWithResponse(resourceGroupName, accountName, keyspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ThroughputSettingsGetResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults updateCassandraKeyspaceThroughput(
        String resourceGroupName,
        String accountName,
        String keyspaceName,
        ThroughputSettingsUpdateParameters updateThroughputParameters) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateCassandraKeyspaceThroughput(
                    resourceGroupName, accountName, keyspaceName, updateThroughputParameters);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults updateCassandraKeyspaceThroughput(
        String resourceGroupName,
        String accountName,
        String keyspaceName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateCassandraKeyspaceThroughput(
                    resourceGroupName, accountName, keyspaceName, updateThroughputParameters, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateCassandraKeyspaceToAutoscale(
        String resourceGroupName, String accountName, String keyspaceName) {
        ThroughputSettingsGetResultsInner inner =
            this.serviceClient().migrateCassandraKeyspaceToAutoscale(resourceGroupName, accountName, keyspaceName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateCassandraKeyspaceToAutoscale(
        String resourceGroupName, String accountName, String keyspaceName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateCassandraKeyspaceToAutoscale(resourceGroupName, accountName, keyspaceName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateCassandraKeyspaceToManualThroughput(
        String resourceGroupName, String accountName, String keyspaceName) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateCassandraKeyspaceToManualThroughput(resourceGroupName, accountName, keyspaceName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateCassandraKeyspaceToManualThroughput(
        String resourceGroupName, String accountName, String keyspaceName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateCassandraKeyspaceToManualThroughput(resourceGroupName, accountName, keyspaceName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<CassandraTableGetResults> listCassandraTables(
        String resourceGroupName, String accountName, String keyspaceName) {
        PagedIterable<CassandraTableGetResultsInner> inner =
            this.serviceClient().listCassandraTables(resourceGroupName, accountName, keyspaceName);
        return inner.mapPage(inner1 -> new CassandraTableGetResultsImpl(inner1, this.manager()));
    }

    public PagedIterable<CassandraTableGetResults> listCassandraTables(
        String resourceGroupName, String accountName, String keyspaceName, Context context) {
        PagedIterable<CassandraTableGetResultsInner> inner =
            this.serviceClient().listCassandraTables(resourceGroupName, accountName, keyspaceName, context);
        return inner.mapPage(inner1 -> new CassandraTableGetResultsImpl(inner1, this.manager()));
    }

    public CassandraTableGetResults getCassandraTable(
        String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        CassandraTableGetResultsInner inner =
            this.serviceClient().getCassandraTable(resourceGroupName, accountName, keyspaceName, tableName);
        if (inner != null) {
            return new CassandraTableGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CassandraTableGetResults> getCassandraTableWithResponse(
        String resourceGroupName, String accountName, String keyspaceName, String tableName, Context context) {
        Response<CassandraTableGetResultsInner> inner =
            this
                .serviceClient()
                .getCassandraTableWithResponse(resourceGroupName, accountName, keyspaceName, tableName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CassandraTableGetResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteCassandraTable(
        String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        this.serviceClient().deleteCassandraTable(resourceGroupName, accountName, keyspaceName, tableName);
    }

    public void deleteCassandraTable(
        String resourceGroupName, String accountName, String keyspaceName, String tableName, Context context) {
        this.serviceClient().deleteCassandraTable(resourceGroupName, accountName, keyspaceName, tableName, context);
    }

    public ThroughputSettingsGetResults getCassandraTableThroughput(
        String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        ThroughputSettingsGetResultsInner inner =
            this.serviceClient().getCassandraTableThroughput(resourceGroupName, accountName, keyspaceName, tableName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ThroughputSettingsGetResults> getCassandraTableThroughputWithResponse(
        String resourceGroupName, String accountName, String keyspaceName, String tableName, Context context) {
        Response<ThroughputSettingsGetResultsInner> inner =
            this
                .serviceClient()
                .getCassandraTableThroughputWithResponse(
                    resourceGroupName, accountName, keyspaceName, tableName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ThroughputSettingsGetResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults updateCassandraTableThroughput(
        String resourceGroupName,
        String accountName,
        String keyspaceName,
        String tableName,
        ThroughputSettingsUpdateParameters updateThroughputParameters) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateCassandraTableThroughput(
                    resourceGroupName, accountName, keyspaceName, tableName, updateThroughputParameters);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults updateCassandraTableThroughput(
        String resourceGroupName,
        String accountName,
        String keyspaceName,
        String tableName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateCassandraTableThroughput(
                    resourceGroupName, accountName, keyspaceName, tableName, updateThroughputParameters, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateCassandraTableToAutoscale(
        String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateCassandraTableToAutoscale(resourceGroupName, accountName, keyspaceName, tableName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateCassandraTableToAutoscale(
        String resourceGroupName, String accountName, String keyspaceName, String tableName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateCassandraTableToAutoscale(resourceGroupName, accountName, keyspaceName, tableName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateCassandraTableToManualThroughput(
        String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateCassandraTableToManualThroughput(resourceGroupName, accountName, keyspaceName, tableName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateCassandraTableToManualThroughput(
        String resourceGroupName, String accountName, String keyspaceName, String tableName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateCassandraTableToManualThroughput(
                    resourceGroupName, accountName, keyspaceName, tableName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CassandraKeyspaceGetResults getCassandraKeyspaceById(String id) {
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
        String keyspaceName = Utils.getValueFromIdByName(id, "cassandraKeyspaces");
        if (keyspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cassandraKeyspaces'.", id)));
        }
        return this
            .getCassandraKeyspaceWithResponse(resourceGroupName, accountName, keyspaceName, Context.NONE)
            .getValue();
    }

    public Response<CassandraKeyspaceGetResults> getCassandraKeyspaceByIdWithResponse(String id, Context context) {
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
        String keyspaceName = Utils.getValueFromIdByName(id, "cassandraKeyspaces");
        if (keyspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cassandraKeyspaces'.", id)));
        }
        return this.getCassandraKeyspaceWithResponse(resourceGroupName, accountName, keyspaceName, context);
    }

    public CassandraTableGetResults getCassandraTableById(String id) {
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
        String keyspaceName = Utils.getValueFromIdByName(id, "cassandraKeyspaces");
        if (keyspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cassandraKeyspaces'.", id)));
        }
        String tableName = Utils.getValueFromIdByName(id, "tables");
        if (tableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tables'.", id)));
        }
        return this
            .getCassandraTableWithResponse(resourceGroupName, accountName, keyspaceName, tableName, Context.NONE)
            .getValue();
    }

    public Response<CassandraTableGetResults> getCassandraTableByIdWithResponse(String id, Context context) {
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
        String keyspaceName = Utils.getValueFromIdByName(id, "cassandraKeyspaces");
        if (keyspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cassandraKeyspaces'.", id)));
        }
        String tableName = Utils.getValueFromIdByName(id, "tables");
        if (tableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tables'.", id)));
        }
        return this.getCassandraTableWithResponse(resourceGroupName, accountName, keyspaceName, tableName, context);
    }

    public void deleteCassandraKeyspaceById(String id) {
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
        String keyspaceName = Utils.getValueFromIdByName(id, "cassandraKeyspaces");
        if (keyspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cassandraKeyspaces'.", id)));
        }
        this.deleteCassandraKeyspace(resourceGroupName, accountName, keyspaceName, Context.NONE);
    }

    public void deleteCassandraKeyspaceByIdWithResponse(String id, Context context) {
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
        String keyspaceName = Utils.getValueFromIdByName(id, "cassandraKeyspaces");
        if (keyspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cassandraKeyspaces'.", id)));
        }
        this.deleteCassandraKeyspace(resourceGroupName, accountName, keyspaceName, context);
    }

    public void deleteCassandraTableById(String id) {
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
        String keyspaceName = Utils.getValueFromIdByName(id, "cassandraKeyspaces");
        if (keyspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cassandraKeyspaces'.", id)));
        }
        String tableName = Utils.getValueFromIdByName(id, "tables");
        if (tableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tables'.", id)));
        }
        this.deleteCassandraTable(resourceGroupName, accountName, keyspaceName, tableName, Context.NONE);
    }

    public void deleteCassandraTableByIdWithResponse(String id, Context context) {
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
        String keyspaceName = Utils.getValueFromIdByName(id, "cassandraKeyspaces");
        if (keyspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'cassandraKeyspaces'.", id)));
        }
        String tableName = Utils.getValueFromIdByName(id, "tables");
        if (tableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tables'.", id)));
        }
        this.deleteCassandraTable(resourceGroupName, accountName, keyspaceName, tableName, context);
    }

    private CassandraResourcesClient serviceClient() {
        return this.innerClient;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }

    public CassandraKeyspaceGetResultsImpl defineUpdateCassandraKeyspace(String name) {
        return new CassandraKeyspaceGetResultsImpl(name, this.manager());
    }

    public CassandraTableGetResultsImpl defineUpdateCassandraTable(String name) {
        return new CassandraTableGetResultsImpl(name, this.manager());
    }
}
