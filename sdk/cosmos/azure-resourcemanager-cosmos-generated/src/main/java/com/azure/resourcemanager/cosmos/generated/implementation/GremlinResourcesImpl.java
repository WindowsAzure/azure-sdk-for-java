// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.GremlinResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.GremlinDatabaseGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.GremlinGraphGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.ThroughputSettingsGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.GremlinDatabaseGetResults;
import com.azure.resourcemanager.cosmos.generated.models.GremlinGraphGetResults;
import com.azure.resourcemanager.cosmos.generated.models.GremlinResources;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsGetResults;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsUpdateParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GremlinResourcesImpl implements GremlinResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GremlinResourcesImpl.class);

    private final GremlinResourcesClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public GremlinResourcesImpl(
        GremlinResourcesClient innerClient, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GremlinDatabaseGetResults> listGremlinDatabases(String resourceGroupName, String accountName) {
        PagedIterable<GremlinDatabaseGetResultsInner> inner =
            this.serviceClient().listGremlinDatabases(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new GremlinDatabaseGetResultsImpl(inner1, this.manager()));
    }

    public PagedIterable<GremlinDatabaseGetResults> listGremlinDatabases(
        String resourceGroupName, String accountName, Context context) {
        PagedIterable<GremlinDatabaseGetResultsInner> inner =
            this.serviceClient().listGremlinDatabases(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new GremlinDatabaseGetResultsImpl(inner1, this.manager()));
    }

    public GremlinDatabaseGetResults getGremlinDatabase(
        String resourceGroupName, String accountName, String databaseName) {
        GremlinDatabaseGetResultsInner inner =
            this.serviceClient().getGremlinDatabase(resourceGroupName, accountName, databaseName);
        if (inner != null) {
            return new GremlinDatabaseGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GremlinDatabaseGetResults> getGremlinDatabaseWithResponse(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        Response<GremlinDatabaseGetResultsInner> inner =
            this.serviceClient().getGremlinDatabaseWithResponse(resourceGroupName, accountName, databaseName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GremlinDatabaseGetResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteGremlinDatabase(String resourceGroupName, String accountName, String databaseName) {
        this.serviceClient().deleteGremlinDatabase(resourceGroupName, accountName, databaseName);
    }

    public void deleteGremlinDatabase(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        this.serviceClient().deleteGremlinDatabase(resourceGroupName, accountName, databaseName, context);
    }

    public ThroughputSettingsGetResults getGremlinDatabaseThroughput(
        String resourceGroupName, String accountName, String databaseName) {
        ThroughputSettingsGetResultsInner inner =
            this.serviceClient().getGremlinDatabaseThroughput(resourceGroupName, accountName, databaseName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ThroughputSettingsGetResults> getGremlinDatabaseThroughputWithResponse(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        Response<ThroughputSettingsGetResultsInner> inner =
            this
                .serviceClient()
                .getGremlinDatabaseThroughputWithResponse(resourceGroupName, accountName, databaseName, context);
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

    public ThroughputSettingsGetResults updateGremlinDatabaseThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        ThroughputSettingsUpdateParameters updateThroughputParameters) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateGremlinDatabaseThroughput(
                    resourceGroupName, accountName, databaseName, updateThroughputParameters);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults updateGremlinDatabaseThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateGremlinDatabaseThroughput(
                    resourceGroupName, accountName, databaseName, updateThroughputParameters, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateGremlinDatabaseToAutoscale(
        String resourceGroupName, String accountName, String databaseName) {
        ThroughputSettingsGetResultsInner inner =
            this.serviceClient().migrateGremlinDatabaseToAutoscale(resourceGroupName, accountName, databaseName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateGremlinDatabaseToAutoscale(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateGremlinDatabaseToAutoscale(resourceGroupName, accountName, databaseName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateGremlinDatabaseToManualThroughput(
        String resourceGroupName, String accountName, String databaseName) {
        ThroughputSettingsGetResultsInner inner =
            this.serviceClient().migrateGremlinDatabaseToManualThroughput(resourceGroupName, accountName, databaseName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateGremlinDatabaseToManualThroughput(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateGremlinDatabaseToManualThroughput(resourceGroupName, accountName, databaseName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<GremlinGraphGetResults> listGremlinGraphs(
        String resourceGroupName, String accountName, String databaseName) {
        PagedIterable<GremlinGraphGetResultsInner> inner =
            this.serviceClient().listGremlinGraphs(resourceGroupName, accountName, databaseName);
        return Utils.mapPage(inner, inner1 -> new GremlinGraphGetResultsImpl(inner1, this.manager()));
    }

    public PagedIterable<GremlinGraphGetResults> listGremlinGraphs(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        PagedIterable<GremlinGraphGetResultsInner> inner =
            this.serviceClient().listGremlinGraphs(resourceGroupName, accountName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new GremlinGraphGetResultsImpl(inner1, this.manager()));
    }

    public GremlinGraphGetResults getGremlinGraph(
        String resourceGroupName, String accountName, String databaseName, String graphName) {
        GremlinGraphGetResultsInner inner =
            this.serviceClient().getGremlinGraph(resourceGroupName, accountName, databaseName, graphName);
        if (inner != null) {
            return new GremlinGraphGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GremlinGraphGetResults> getGremlinGraphWithResponse(
        String resourceGroupName, String accountName, String databaseName, String graphName, Context context) {
        Response<GremlinGraphGetResultsInner> inner =
            this
                .serviceClient()
                .getGremlinGraphWithResponse(resourceGroupName, accountName, databaseName, graphName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GremlinGraphGetResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteGremlinGraph(
        String resourceGroupName, String accountName, String databaseName, String graphName) {
        this.serviceClient().deleteGremlinGraph(resourceGroupName, accountName, databaseName, graphName);
    }

    public void deleteGremlinGraph(
        String resourceGroupName, String accountName, String databaseName, String graphName, Context context) {
        this.serviceClient().deleteGremlinGraph(resourceGroupName, accountName, databaseName, graphName, context);
    }

    public ThroughputSettingsGetResults getGremlinGraphThroughput(
        String resourceGroupName, String accountName, String databaseName, String graphName) {
        ThroughputSettingsGetResultsInner inner =
            this.serviceClient().getGremlinGraphThroughput(resourceGroupName, accountName, databaseName, graphName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ThroughputSettingsGetResults> getGremlinGraphThroughputWithResponse(
        String resourceGroupName, String accountName, String databaseName, String graphName, Context context) {
        Response<ThroughputSettingsGetResultsInner> inner =
            this
                .serviceClient()
                .getGremlinGraphThroughputWithResponse(
                    resourceGroupName, accountName, databaseName, graphName, context);
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

    public ThroughputSettingsGetResults updateGremlinGraphThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        String graphName,
        ThroughputSettingsUpdateParameters updateThroughputParameters) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateGremlinGraphThroughput(
                    resourceGroupName, accountName, databaseName, graphName, updateThroughputParameters);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults updateGremlinGraphThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        String graphName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateGremlinGraphThroughput(
                    resourceGroupName, accountName, databaseName, graphName, updateThroughputParameters, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateGremlinGraphToAutoscale(
        String resourceGroupName, String accountName, String databaseName, String graphName) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateGremlinGraphToAutoscale(resourceGroupName, accountName, databaseName, graphName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateGremlinGraphToAutoscale(
        String resourceGroupName, String accountName, String databaseName, String graphName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateGremlinGraphToAutoscale(resourceGroupName, accountName, databaseName, graphName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateGremlinGraphToManualThroughput(
        String resourceGroupName, String accountName, String databaseName, String graphName) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateGremlinGraphToManualThroughput(resourceGroupName, accountName, databaseName, graphName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateGremlinGraphToManualThroughput(
        String resourceGroupName, String accountName, String databaseName, String graphName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateGremlinGraphToManualThroughput(
                    resourceGroupName, accountName, databaseName, graphName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GremlinDatabaseGetResults getGremlinDatabaseById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "gremlinDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'gremlinDatabases'.", id)));
        }
        return this
            .getGremlinDatabaseWithResponse(resourceGroupName, accountName, databaseName, Context.NONE)
            .getValue();
    }

    public Response<GremlinDatabaseGetResults> getGremlinDatabaseByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "gremlinDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'gremlinDatabases'.", id)));
        }
        return this.getGremlinDatabaseWithResponse(resourceGroupName, accountName, databaseName, context);
    }

    public GremlinGraphGetResults getGremlinGraphById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "gremlinDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'gremlinDatabases'.", id)));
        }
        String graphName = Utils.getValueFromIdByName(id, "graphs");
        if (graphName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'graphs'.", id)));
        }
        return this
            .getGremlinGraphWithResponse(resourceGroupName, accountName, databaseName, graphName, Context.NONE)
            .getValue();
    }

    public Response<GremlinGraphGetResults> getGremlinGraphByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "gremlinDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'gremlinDatabases'.", id)));
        }
        String graphName = Utils.getValueFromIdByName(id, "graphs");
        if (graphName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'graphs'.", id)));
        }
        return this.getGremlinGraphWithResponse(resourceGroupName, accountName, databaseName, graphName, context);
    }

    public void deleteGremlinDatabaseById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "gremlinDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'gremlinDatabases'.", id)));
        }
        this.deleteGremlinDatabase(resourceGroupName, accountName, databaseName, Context.NONE);
    }

    public void deleteGremlinDatabaseByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "gremlinDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'gremlinDatabases'.", id)));
        }
        this.deleteGremlinDatabase(resourceGroupName, accountName, databaseName, context);
    }

    public void deleteGremlinGraphById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "gremlinDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'gremlinDatabases'.", id)));
        }
        String graphName = Utils.getValueFromIdByName(id, "graphs");
        if (graphName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'graphs'.", id)));
        }
        this.deleteGremlinGraph(resourceGroupName, accountName, databaseName, graphName, Context.NONE);
    }

    public void deleteGremlinGraphByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "gremlinDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'gremlinDatabases'.", id)));
        }
        String graphName = Utils.getValueFromIdByName(id, "graphs");
        if (graphName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'graphs'.", id)));
        }
        this.deleteGremlinGraph(resourceGroupName, accountName, databaseName, graphName, context);
    }

    private GremlinResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    public GremlinDatabaseGetResultsImpl defineUpdateGremlinDatabase(String name) {
        return new GremlinDatabaseGetResultsImpl(name, this.manager());
    }

    public GremlinGraphGetResultsImpl defineUpdateGremlinGraph(String name) {
        return new GremlinGraphGetResultsImpl(name, this.manager());
    }
}
