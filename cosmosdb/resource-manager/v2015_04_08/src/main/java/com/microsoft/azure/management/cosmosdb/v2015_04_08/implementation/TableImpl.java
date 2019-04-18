/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmosdb.v2015_04_08.Table;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.TableCreateUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.TableResource;
import rx.functions.Func1;

class TableImpl extends CreatableUpdatableImpl<Table, TableInner, TableImpl> implements Table, Table.Definition, Table.Update {
    private final DocumentDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String tableRid;
    private TableCreateUpdateParameters createOrUpdateParameter;

    TableImpl(String name, DocumentDBManager manager) {
        super(name, new TableInner());
        this.manager = manager;
        // Set resource name
        this.tableRid = name;
        //
        this.createOrUpdateParameter = new TableCreateUpdateParameters();
    }

    TableImpl(TableInner inner, DocumentDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.tableRid = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.tableRid = IdParsingUtils.getValueFromIdByName(inner.id(), "tables");
        //
        this.createOrUpdateParameter = new TableCreateUpdateParameters();
    }

    @Override
    public DocumentDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Table> createResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.createUpdateTableAsync(this.resourceGroupName, this.accountName, this.tableRid, this.createOrUpdateParameter)
            .map(new Func1<TableInner, TableInner>() {
               @Override
               public TableInner call(TableInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Table> updateResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.createUpdateTableAsync(this.resourceGroupName, this.accountName, this.tableRid, this.createOrUpdateParameter)
            .map(new Func1<TableInner, TableInner>() {
               @Override
               public TableInner call(TableInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TableInner> getInnerAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new TableCreateUpdateParameters();
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
    public String tableId() {
        return this.inner().tableId();
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
    public TableImpl withExistingApi(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public TableImpl withOptions(Map<String, String> options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public TableImpl withResource(TableResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

}
