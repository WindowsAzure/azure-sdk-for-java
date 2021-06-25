// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.GremlinDatabaseGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.GremlinDatabaseCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.GremlinDatabaseGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.GremlinDatabaseGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.GremlinDatabaseGetResults;
import com.azure.resourcemanager.cosmos.generated.models.GremlinDatabaseResource;
import java.util.Collections;
import java.util.Map;

public final class GremlinDatabaseGetResultsImpl
    implements GremlinDatabaseGetResults, GremlinDatabaseGetResults.Definition, GremlinDatabaseGetResults.Update {
    private GremlinDatabaseGetResultsInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public GremlinDatabaseGetPropertiesResource resource() {
        return this.innerModel().resource();
    }

    public GremlinDatabaseGetPropertiesOptions options() {
        return this.innerModel().options();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public GremlinDatabaseGetResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String databaseName;

    private GremlinDatabaseCreateUpdateParameters createCreateUpdateGremlinDatabaseParameters;

    private GremlinDatabaseCreateUpdateParameters updateCreateUpdateGremlinDatabaseParameters;

    public GremlinDatabaseGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public GremlinDatabaseGetResults create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGremlinResources()
                .createUpdateGremlinDatabase(
                    resourceGroupName,
                    accountName,
                    databaseName,
                    createCreateUpdateGremlinDatabaseParameters,
                    Context.NONE);
        return this;
    }

    public GremlinDatabaseGetResults create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGremlinResources()
                .createUpdateGremlinDatabase(
                    resourceGroupName, accountName, databaseName, createCreateUpdateGremlinDatabaseParameters, context);
        return this;
    }

    GremlinDatabaseGetResultsImpl(
        String name, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = new GremlinDatabaseGetResultsInner();
        this.serviceManager = serviceManager;
        this.databaseName = name;
        this.createCreateUpdateGremlinDatabaseParameters = new GremlinDatabaseCreateUpdateParameters();
    }

    public GremlinDatabaseGetResultsImpl update() {
        this.updateCreateUpdateGremlinDatabaseParameters = new GremlinDatabaseCreateUpdateParameters();
        return this;
    }

    public GremlinDatabaseGetResults apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGremlinResources()
                .createUpdateGremlinDatabase(
                    resourceGroupName,
                    accountName,
                    databaseName,
                    updateCreateUpdateGremlinDatabaseParameters,
                    Context.NONE);
        return this;
    }

    public GremlinDatabaseGetResults apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGremlinResources()
                .createUpdateGremlinDatabase(
                    resourceGroupName, accountName, databaseName, updateCreateUpdateGremlinDatabaseParameters, context);
        return this;
    }

    GremlinDatabaseGetResultsImpl(
        GremlinDatabaseGetResultsInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "gremlinDatabases");
    }

    public GremlinDatabaseGetResults refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGremlinResources()
                .getGremlinDatabaseWithResponse(resourceGroupName, accountName, databaseName, Context.NONE)
                .getValue();
        return this;
    }

    public GremlinDatabaseGetResults refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGremlinResources()
                .getGremlinDatabaseWithResponse(resourceGroupName, accountName, databaseName, context)
                .getValue();
        return this;
    }

    public GremlinDatabaseGetResultsImpl withRegion(Region location) {
        this.createCreateUpdateGremlinDatabaseParameters.withLocation(location.toString());
        return this;
    }

    public GremlinDatabaseGetResultsImpl withRegion(String location) {
        this.createCreateUpdateGremlinDatabaseParameters.withLocation(location);
        return this;
    }

    public GremlinDatabaseGetResultsImpl withResource(GremlinDatabaseResource resource) {
        if (isInCreateMode()) {
            this.createCreateUpdateGremlinDatabaseParameters.withResource(resource);
            return this;
        } else {
            this.updateCreateUpdateGremlinDatabaseParameters.withResource(resource);
            return this;
        }
    }

    public GremlinDatabaseGetResultsImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createCreateUpdateGremlinDatabaseParameters.withTags(tags);
            return this;
        } else {
            this.updateCreateUpdateGremlinDatabaseParameters.withTags(tags);
            return this;
        }
    }

    public GremlinDatabaseGetResultsImpl withOptions(CreateUpdateOptions options) {
        if (isInCreateMode()) {
            this.createCreateUpdateGremlinDatabaseParameters.withOptions(options);
            return this;
        } else {
            this.updateCreateUpdateGremlinDatabaseParameters.withOptions(options);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
