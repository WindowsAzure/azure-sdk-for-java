/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2019_08_01.SqlContainerGetResults;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.SqlContainerCreateUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.SqlContainerGetPropertiesResource;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.SqlContainerResource;
import rx.functions.Func1;

class SqlContainerGetResultsImpl extends CreatableUpdatableImpl<SqlContainerGetResults, SqlContainerGetResultsInner, SqlContainerGetResultsImpl> implements SqlContainerGetResults, SqlContainerGetResults.Definition, SqlContainerGetResults.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String databaseName;
    private String containerName;
    private SqlContainerCreateUpdateParameters createOrUpdateParameter;

    SqlContainerGetResultsImpl(String name, CosmosDBManager manager) {
        super(name, new SqlContainerGetResultsInner());
        this.manager = manager;
        // Set resource name
        this.containerName = name;
        //
        this.createOrUpdateParameter = new SqlContainerCreateUpdateParameters();
    }

    SqlContainerGetResultsImpl(SqlContainerGetResultsInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.containerName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "sqlDatabases");
        this.containerName = IdParsingUtils.getValueFromIdByName(inner.id(), "containers");
        //
        this.createOrUpdateParameter = new SqlContainerCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SqlContainerGetResults> createResourceAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.createUpdateSqlContainerAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.createOrUpdateParameter)
            .map(new Func1<SqlContainerGetResultsInner, SqlContainerGetResultsInner>() {
               @Override
               public SqlContainerGetResultsInner call(SqlContainerGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SqlContainerGetResults> updateResourceAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.createUpdateSqlContainerAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.createOrUpdateParameter)
            .map(new Func1<SqlContainerGetResultsInner, SqlContainerGetResultsInner>() {
               @Override
               public SqlContainerGetResultsInner call(SqlContainerGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlContainerGetResultsInner> getInnerAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.getSqlContainerAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new SqlContainerCreateUpdateParameters();
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
    public SqlContainerGetPropertiesResource resource() {
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
    public SqlContainerGetResultsImpl withExistingSqlDatabasis(String resourceGroupName, String accountName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public SqlContainerGetResultsImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public SqlContainerGetResultsImpl withOptions(Map<String, String> options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public SqlContainerGetResultsImpl withResource(SqlContainerResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

    @Override
    public SqlContainerGetResultsImpl withTags(Map<String, String> tags) {
        this.createOrUpdateParameter.withTags(tags);
        return this;
    }

}
