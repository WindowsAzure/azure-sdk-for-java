// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.MongoDBResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MongoDBCollectionGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MongoDBDatabaseGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.ThroughputSettingsGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBCollectionGetResults;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBDatabaseGetResults;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBResources;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsGetResults;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsUpdateParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MongoDBResourcesImpl implements MongoDBResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MongoDBResourcesImpl.class);

    private final MongoDBResourcesClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public MongoDBResourcesImpl(
        MongoDBResourcesClient innerClient, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MongoDBDatabaseGetResults> listMongoDBDatabases(String resourceGroupName, String accountName) {
        PagedIterable<MongoDBDatabaseGetResultsInner> inner =
            this.serviceClient().listMongoDBDatabases(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new MongoDBDatabaseGetResultsImpl(inner1, this.manager()));
    }

    public PagedIterable<MongoDBDatabaseGetResults> listMongoDBDatabases(
        String resourceGroupName, String accountName, Context context) {
        PagedIterable<MongoDBDatabaseGetResultsInner> inner =
            this.serviceClient().listMongoDBDatabases(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new MongoDBDatabaseGetResultsImpl(inner1, this.manager()));
    }

    public MongoDBDatabaseGetResults getMongoDBDatabase(
        String resourceGroupName, String accountName, String databaseName) {
        MongoDBDatabaseGetResultsInner inner =
            this.serviceClient().getMongoDBDatabase(resourceGroupName, accountName, databaseName);
        if (inner != null) {
            return new MongoDBDatabaseGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MongoDBDatabaseGetResults> getMongoDBDatabaseWithResponse(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        Response<MongoDBDatabaseGetResultsInner> inner =
            this.serviceClient().getMongoDBDatabaseWithResponse(resourceGroupName, accountName, databaseName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MongoDBDatabaseGetResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteMongoDBDatabase(String resourceGroupName, String accountName, String databaseName) {
        this.serviceClient().deleteMongoDBDatabase(resourceGroupName, accountName, databaseName);
    }

    public void deleteMongoDBDatabase(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        this.serviceClient().deleteMongoDBDatabase(resourceGroupName, accountName, databaseName, context);
    }

    public ThroughputSettingsGetResults getMongoDBDatabaseThroughput(
        String resourceGroupName, String accountName, String databaseName) {
        ThroughputSettingsGetResultsInner inner =
            this.serviceClient().getMongoDBDatabaseThroughput(resourceGroupName, accountName, databaseName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ThroughputSettingsGetResults> getMongoDBDatabaseThroughputWithResponse(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        Response<ThroughputSettingsGetResultsInner> inner =
            this
                .serviceClient()
                .getMongoDBDatabaseThroughputWithResponse(resourceGroupName, accountName, databaseName, context);
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

    public ThroughputSettingsGetResults updateMongoDBDatabaseThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        ThroughputSettingsUpdateParameters updateThroughputParameters) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateMongoDBDatabaseThroughput(
                    resourceGroupName, accountName, databaseName, updateThroughputParameters);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults updateMongoDBDatabaseThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateMongoDBDatabaseThroughput(
                    resourceGroupName, accountName, databaseName, updateThroughputParameters, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateMongoDBDatabaseToAutoscale(
        String resourceGroupName, String accountName, String databaseName) {
        ThroughputSettingsGetResultsInner inner =
            this.serviceClient().migrateMongoDBDatabaseToAutoscale(resourceGroupName, accountName, databaseName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateMongoDBDatabaseToAutoscale(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateMongoDBDatabaseToAutoscale(resourceGroupName, accountName, databaseName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateMongoDBDatabaseToManualThroughput(
        String resourceGroupName, String accountName, String databaseName) {
        ThroughputSettingsGetResultsInner inner =
            this.serviceClient().migrateMongoDBDatabaseToManualThroughput(resourceGroupName, accountName, databaseName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateMongoDBDatabaseToManualThroughput(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateMongoDBDatabaseToManualThroughput(resourceGroupName, accountName, databaseName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<MongoDBCollectionGetResults> listMongoDBCollections(
        String resourceGroupName, String accountName, String databaseName) {
        PagedIterable<MongoDBCollectionGetResultsInner> inner =
            this.serviceClient().listMongoDBCollections(resourceGroupName, accountName, databaseName);
        return Utils.mapPage(inner, inner1 -> new MongoDBCollectionGetResultsImpl(inner1, this.manager()));
    }

    public PagedIterable<MongoDBCollectionGetResults> listMongoDBCollections(
        String resourceGroupName, String accountName, String databaseName, Context context) {
        PagedIterable<MongoDBCollectionGetResultsInner> inner =
            this.serviceClient().listMongoDBCollections(resourceGroupName, accountName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new MongoDBCollectionGetResultsImpl(inner1, this.manager()));
    }

    public MongoDBCollectionGetResults getMongoDBCollection(
        String resourceGroupName, String accountName, String databaseName, String collectionName) {
        MongoDBCollectionGetResultsInner inner =
            this.serviceClient().getMongoDBCollection(resourceGroupName, accountName, databaseName, collectionName);
        if (inner != null) {
            return new MongoDBCollectionGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MongoDBCollectionGetResults> getMongoDBCollectionWithResponse(
        String resourceGroupName, String accountName, String databaseName, String collectionName, Context context) {
        Response<MongoDBCollectionGetResultsInner> inner =
            this
                .serviceClient()
                .getMongoDBCollectionWithResponse(
                    resourceGroupName, accountName, databaseName, collectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MongoDBCollectionGetResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteMongoDBCollection(
        String resourceGroupName, String accountName, String databaseName, String collectionName) {
        this.serviceClient().deleteMongoDBCollection(resourceGroupName, accountName, databaseName, collectionName);
    }

    public void deleteMongoDBCollection(
        String resourceGroupName, String accountName, String databaseName, String collectionName, Context context) {
        this
            .serviceClient()
            .deleteMongoDBCollection(resourceGroupName, accountName, databaseName, collectionName, context);
    }

    public ThroughputSettingsGetResults getMongoDBCollectionThroughput(
        String resourceGroupName, String accountName, String databaseName, String collectionName) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .getMongoDBCollectionThroughput(resourceGroupName, accountName, databaseName, collectionName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ThroughputSettingsGetResults> getMongoDBCollectionThroughputWithResponse(
        String resourceGroupName, String accountName, String databaseName, String collectionName, Context context) {
        Response<ThroughputSettingsGetResultsInner> inner =
            this
                .serviceClient()
                .getMongoDBCollectionThroughputWithResponse(
                    resourceGroupName, accountName, databaseName, collectionName, context);
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

    public ThroughputSettingsGetResults updateMongoDBCollectionThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        String collectionName,
        ThroughputSettingsUpdateParameters updateThroughputParameters) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateMongoDBCollectionThroughput(
                    resourceGroupName, accountName, databaseName, collectionName, updateThroughputParameters);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults updateMongoDBCollectionThroughput(
        String resourceGroupName,
        String accountName,
        String databaseName,
        String collectionName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .updateMongoDBCollectionThroughput(
                    resourceGroupName, accountName, databaseName, collectionName, updateThroughputParameters, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateMongoDBCollectionToAutoscale(
        String resourceGroupName, String accountName, String databaseName, String collectionName) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateMongoDBCollectionToAutoscale(resourceGroupName, accountName, databaseName, collectionName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateMongoDBCollectionToAutoscale(
        String resourceGroupName, String accountName, String databaseName, String collectionName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateMongoDBCollectionToAutoscale(
                    resourceGroupName, accountName, databaseName, collectionName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateMongoDBCollectionToManualThroughput(
        String resourceGroupName, String accountName, String databaseName, String collectionName) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateMongoDBCollectionToManualThroughput(
                    resourceGroupName, accountName, databaseName, collectionName);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ThroughputSettingsGetResults migrateMongoDBCollectionToManualThroughput(
        String resourceGroupName, String accountName, String databaseName, String collectionName, Context context) {
        ThroughputSettingsGetResultsInner inner =
            this
                .serviceClient()
                .migrateMongoDBCollectionToManualThroughput(
                    resourceGroupName, accountName, databaseName, collectionName, context);
        if (inner != null) {
            return new ThroughputSettingsGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MongoDBDatabaseGetResults getMongoDBDatabaseById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "mongodbDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'mongodbDatabases'.", id)));
        }
        return this
            .getMongoDBDatabaseWithResponse(resourceGroupName, accountName, databaseName, Context.NONE)
            .getValue();
    }

    public Response<MongoDBDatabaseGetResults> getMongoDBDatabaseByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "mongodbDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'mongodbDatabases'.", id)));
        }
        return this.getMongoDBDatabaseWithResponse(resourceGroupName, accountName, databaseName, context);
    }

    public MongoDBCollectionGetResults getMongoDBCollectionById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "mongodbDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'mongodbDatabases'.", id)));
        }
        String collectionName = Utils.getValueFromIdByName(id, "collections");
        if (collectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'collections'.", id)));
        }
        return this
            .getMongoDBCollectionWithResponse(
                resourceGroupName, accountName, databaseName, collectionName, Context.NONE)
            .getValue();
    }

    public Response<MongoDBCollectionGetResults> getMongoDBCollectionByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "mongodbDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'mongodbDatabases'.", id)));
        }
        String collectionName = Utils.getValueFromIdByName(id, "collections");
        if (collectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'collections'.", id)));
        }
        return this
            .getMongoDBCollectionWithResponse(resourceGroupName, accountName, databaseName, collectionName, context);
    }

    public void deleteMongoDBDatabaseById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "mongodbDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'mongodbDatabases'.", id)));
        }
        this.deleteMongoDBDatabase(resourceGroupName, accountName, databaseName, Context.NONE);
    }

    public void deleteMongoDBDatabaseByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "mongodbDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'mongodbDatabases'.", id)));
        }
        this.deleteMongoDBDatabase(resourceGroupName, accountName, databaseName, context);
    }

    public void deleteMongoDBCollectionById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "mongodbDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'mongodbDatabases'.", id)));
        }
        String collectionName = Utils.getValueFromIdByName(id, "collections");
        if (collectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'collections'.", id)));
        }
        this.deleteMongoDBCollection(resourceGroupName, accountName, databaseName, collectionName, Context.NONE);
    }

    public void deleteMongoDBCollectionByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "mongodbDatabases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'mongodbDatabases'.", id)));
        }
        String collectionName = Utils.getValueFromIdByName(id, "collections");
        if (collectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'collections'.", id)));
        }
        this.deleteMongoDBCollection(resourceGroupName, accountName, databaseName, collectionName, context);
    }

    private MongoDBResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    public MongoDBDatabaseGetResultsImpl defineUpdateMongoDBDatabase(String name) {
        return new MongoDBDatabaseGetResultsImpl(name, this.manager());
    }

    public MongoDBCollectionGetResultsImpl defineUpdateMongoDBCollection(String name) {
        return new MongoDBCollectionGetResultsImpl(name, this.manager());
    }
}
