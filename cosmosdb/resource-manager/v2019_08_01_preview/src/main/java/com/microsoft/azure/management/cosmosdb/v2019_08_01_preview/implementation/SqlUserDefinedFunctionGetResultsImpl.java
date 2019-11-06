/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.SqlUserDefinedFunctionGetResults;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.SqlUserDefinedFunctionCreateUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.SqlUserDefinedFunctionResource;
import rx.functions.Func1;

class SqlUserDefinedFunctionGetResultsImpl extends CreatableUpdatableImpl<SqlUserDefinedFunctionGetResults, SqlUserDefinedFunctionGetResultsInner, SqlUserDefinedFunctionGetResultsImpl> implements SqlUserDefinedFunctionGetResults, SqlUserDefinedFunctionGetResults.Definition, SqlUserDefinedFunctionGetResults.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String databaseName;
    private String containerName;
    private String userDefinedFunctionName;
    private SqlUserDefinedFunctionCreateUpdateParameters createOrUpdateParameter;

    SqlUserDefinedFunctionGetResultsImpl(String name, CosmosDBManager manager) {
        super(name, new SqlUserDefinedFunctionGetResultsInner());
        this.manager = manager;
        // Set resource name
        this.userDefinedFunctionName = name;
        //
        this.createOrUpdateParameter = new SqlUserDefinedFunctionCreateUpdateParameters();
    }

    SqlUserDefinedFunctionGetResultsImpl(SqlUserDefinedFunctionGetResultsInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.userDefinedFunctionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "sqlDatabases");
        this.containerName = IdParsingUtils.getValueFromIdByName(inner.id(), "containers");
        this.userDefinedFunctionName = IdParsingUtils.getValueFromIdByName(inner.id(), "userDefinedFunctions");
        //
        this.createOrUpdateParameter = new SqlUserDefinedFunctionCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SqlUserDefinedFunctionGetResults> createResourceAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.createUpdateSqlUserDefinedFunctionAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.userDefinedFunctionName, this.createOrUpdateParameter)
            .map(new Func1<SqlUserDefinedFunctionGetResultsInner, SqlUserDefinedFunctionGetResultsInner>() {
               @Override
               public SqlUserDefinedFunctionGetResultsInner call(SqlUserDefinedFunctionGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SqlUserDefinedFunctionGetResults> updateResourceAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.createUpdateSqlUserDefinedFunctionAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.userDefinedFunctionName, this.createOrUpdateParameter)
            .map(new Func1<SqlUserDefinedFunctionGetResultsInner, SqlUserDefinedFunctionGetResultsInner>() {
               @Override
               public SqlUserDefinedFunctionGetResultsInner call(SqlUserDefinedFunctionGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlUserDefinedFunctionGetResultsInner> getInnerAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.getSqlUserDefinedFunctionAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.userDefinedFunctionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new SqlUserDefinedFunctionCreateUpdateParameters();
    }

    @Override
    public String _etag() {
        return this.inner()._etag();
    }

    @Override
    public String _rid() {
        return this.inner()._rid();
    }

    @Override
    public Object _ts() {
        return this.inner()._ts();
    }

    @Override
    public String body() {
        return this.inner().body();
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
    public String sqlUserDefinedFunctionGetResultsId() {
        return this.inner().sqlUserDefinedFunctionGetResultsId();
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
    public SqlUserDefinedFunctionGetResultsImpl withExistingContainer(String resourceGroupName, String accountName, String databaseName, String containerName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.databaseName = databaseName;
        this.containerName = containerName;
        return this;
    }

    @Override
    public SqlUserDefinedFunctionGetResultsImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public SqlUserDefinedFunctionGetResultsImpl withOptions(Map<String, String> options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public SqlUserDefinedFunctionGetResultsImpl withResource(SqlUserDefinedFunctionResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

    @Override
    public SqlUserDefinedFunctionGetResultsImpl withTags(Map<String, String> tags) {
        this.createOrUpdateParameter.withTags(tags);
        return this;
    }

}
