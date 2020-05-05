/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_03_01.MongoDBDatabaseGetResults;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.MongoDBDatabaseCreateUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.MongoDBDatabaseGetPropertiesOptions;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.MongoDBDatabaseGetPropertiesResource;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.CreateUpdateOptions;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.MongoDBDatabaseResource;
import rx.functions.Func1;

class MongoDBDatabaseGetResultsImpl extends CreatableUpdatableImpl<MongoDBDatabaseGetResults, MongoDBDatabaseGetResultsInner, MongoDBDatabaseGetResultsImpl> implements MongoDBDatabaseGetResults, MongoDBDatabaseGetResults.Definition, MongoDBDatabaseGetResults.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String databaseName;
    private MongoDBDatabaseCreateUpdateParameters createOrUpdateParameter;

    MongoDBDatabaseGetResultsImpl(String name, CosmosDBManager manager) {
        super(name, new MongoDBDatabaseGetResultsInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
        this.createOrUpdateParameter = new MongoDBDatabaseCreateUpdateParameters();
    }

    MongoDBDatabaseGetResultsImpl(MongoDBDatabaseGetResultsInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "mongodbDatabases");
        //
        this.createOrUpdateParameter = new MongoDBDatabaseCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<MongoDBDatabaseGetResults> createResourceAsync() {
        MongoDBResourcesInner client = this.manager().inner().mongoDBResources();
        return client.createUpdateMongoDBDatabaseAsync(this.resourceGroupName, this.accountName, this.databaseName, this.createOrUpdateParameter)
            .map(new Func1<MongoDBDatabaseGetResultsInner, MongoDBDatabaseGetResultsInner>() {
               @Override
               public MongoDBDatabaseGetResultsInner call(MongoDBDatabaseGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<MongoDBDatabaseGetResults> updateResourceAsync() {
        MongoDBResourcesInner client = this.manager().inner().mongoDBResources();
        return client.createUpdateMongoDBDatabaseAsync(this.resourceGroupName, this.accountName, this.databaseName, this.createOrUpdateParameter)
            .map(new Func1<MongoDBDatabaseGetResultsInner, MongoDBDatabaseGetResultsInner>() {
               @Override
               public MongoDBDatabaseGetResultsInner call(MongoDBDatabaseGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<MongoDBDatabaseGetResultsInner> getInnerAsync() {
        MongoDBResourcesInner client = this.manager().inner().mongoDBResources();
        return client.getMongoDBDatabaseAsync(this.resourceGroupName, this.accountName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new MongoDBDatabaseCreateUpdateParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public MongoDBDatabaseGetPropertiesOptions options() {
        return this.inner().options();
    }

    @Override
    public MongoDBDatabaseGetPropertiesResource resource() {
        return this.inner().resource();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public MongoDBDatabaseGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public MongoDBDatabaseGetResultsImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public MongoDBDatabaseGetResultsImpl withOptions(CreateUpdateOptions options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public MongoDBDatabaseGetResultsImpl withResource(MongoDBDatabaseResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

    @Override
    public MongoDBDatabaseGetResultsImpl withTags(Map<String, String> tags) {
        this.createOrUpdateParameter.withTags(tags);
        return this;
    }

}
