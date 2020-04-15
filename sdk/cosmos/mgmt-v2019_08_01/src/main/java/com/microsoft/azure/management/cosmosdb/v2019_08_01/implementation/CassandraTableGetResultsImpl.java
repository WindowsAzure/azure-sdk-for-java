/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2019_08_01.CassandraTableGetResults;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.CassandraTableCreateUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.CassandraTableGetPropertiesResource;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.CassandraTableResource;
import rx.functions.Func1;

class CassandraTableGetResultsImpl extends CreatableUpdatableImpl<CassandraTableGetResults, CassandraTableGetResultsInner, CassandraTableGetResultsImpl> implements CassandraTableGetResults, CassandraTableGetResults.Definition, CassandraTableGetResults.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String keyspaceName;
    private String tableName;
    private CassandraTableCreateUpdateParameters createOrUpdateParameter;

    CassandraTableGetResultsImpl(String name, CosmosDBManager manager) {
        super(name, new CassandraTableGetResultsInner());
        this.manager = manager;
        // Set resource name
        this.tableName = name;
        //
        this.createOrUpdateParameter = new CassandraTableCreateUpdateParameters();
    }

    CassandraTableGetResultsImpl(CassandraTableGetResultsInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.tableName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.keyspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "cassandraKeyspaces");
        this.tableName = IdParsingUtils.getValueFromIdByName(inner.id(), "tables");
        //
        this.createOrUpdateParameter = new CassandraTableCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CassandraTableGetResults> createResourceAsync() {
        CassandraResourcesInner client = this.manager().inner().cassandraResources();
        return client.createUpdateCassandraTableAsync(this.resourceGroupName, this.accountName, this.keyspaceName, this.tableName, this.createOrUpdateParameter)
            .map(new Func1<CassandraTableGetResultsInner, CassandraTableGetResultsInner>() {
               @Override
               public CassandraTableGetResultsInner call(CassandraTableGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CassandraTableGetResults> updateResourceAsync() {
        CassandraResourcesInner client = this.manager().inner().cassandraResources();
        return client.createUpdateCassandraTableAsync(this.resourceGroupName, this.accountName, this.keyspaceName, this.tableName, this.createOrUpdateParameter)
            .map(new Func1<CassandraTableGetResultsInner, CassandraTableGetResultsInner>() {
               @Override
               public CassandraTableGetResultsInner call(CassandraTableGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CassandraTableGetResultsInner> getInnerAsync() {
        CassandraResourcesInner client = this.manager().inner().cassandraResources();
        return client.getCassandraTableAsync(this.resourceGroupName, this.accountName, this.keyspaceName, this.tableName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new CassandraTableCreateUpdateParameters();
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
    public CassandraTableGetPropertiesResource resource() {
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
    public CassandraTableGetResultsImpl withExistingCassandraKeyspace(String resourceGroupName, String accountName, String keyspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.keyspaceName = keyspaceName;
        return this;
    }

    @Override
    public CassandraTableGetResultsImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public CassandraTableGetResultsImpl withOptions(Map<String, String> options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public CassandraTableGetResultsImpl withResource(CassandraTableResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

    @Override
    public CassandraTableGetResultsImpl withTags(Map<String, String> tags) {
        this.createOrUpdateParameter.withTags(tags);
        return this;
    }

}
