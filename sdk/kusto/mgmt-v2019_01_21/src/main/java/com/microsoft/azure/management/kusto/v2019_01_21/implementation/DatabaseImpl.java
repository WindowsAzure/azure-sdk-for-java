/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_01_21.implementation;

import com.microsoft.azure.management.kusto.v2019_01_21.Database;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.kusto.v2019_01_21.DatabaseUpdate;
import org.joda.time.Period;
import com.microsoft.azure.management.kusto.v2019_01_21.ProvisioningState;
import com.microsoft.azure.management.kusto.v2019_01_21.DatabaseStatistics;
import rx.functions.Func1;

class DatabaseImpl extends CreatableUpdatableImpl<Database, DatabaseInner, DatabaseImpl> implements Database, Database.Definition, Database.Update {
    private final KustoManager manager;
    private String resourceGroupName;
    private String clusterName;
    private String databaseName;
    private DatabaseUpdate updateParameter;

    DatabaseImpl(String name, KustoManager manager) {
        super(name, new DatabaseInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
        this.updateParameter = new DatabaseUpdate();
    }

    DatabaseImpl(DatabaseInner inner, KustoManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.clusterName = IdParsingUtils.getValueFromIdByName(inner.id(), "clusters");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
        this.updateParameter = new DatabaseUpdate();
    }

    @Override
    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Database> createResourceAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.createOrUpdateAsync(this.resourceGroupName, this.clusterName, this.databaseName, this.inner())
            .map(new Func1<DatabaseInner, DatabaseInner>() {
               @Override
               public DatabaseInner call(DatabaseInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Database> updateResourceAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.updateAsync(this.resourceGroupName, this.clusterName, this.databaseName, this.updateParameter)
            .map(new Func1<DatabaseInner, DatabaseInner>() {
               @Override
               public DatabaseInner call(DatabaseInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DatabaseInner> getInnerAsync() {
        DatabasesInner client = this.manager().inner().databases();
        return client.getAsync(this.resourceGroupName, this.clusterName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new DatabaseUpdate();
    }

    @Override
    public Period hotCachePeriod() {
        return this.inner().hotCachePeriod();
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
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Period softDeletePeriod() {
        return this.inner().softDeletePeriod();
    }

    @Override
    public DatabaseStatistics statistics() {
        return this.inner().statistics();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DatabaseImpl withExistingCluster(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    @Override
    public DatabaseImpl withHotCachePeriod(Period hotCachePeriod) {
        if (isInCreateMode()) {
            this.inner().withHotCachePeriod(hotCachePeriod);
        } else {
            this.updateParameter.withHotCachePeriod(hotCachePeriod);
        }
        return this;
    }

    @Override
    public DatabaseImpl withLocation(String location) {
        if (isInCreateMode()) {
            this.inner().withLocation(location);
        } else {
            this.updateParameter.withLocation(location);
        }
        return this;
    }

    @Override
    public DatabaseImpl withSoftDeletePeriod(Period softDeletePeriod) {
        if (isInCreateMode()) {
            this.inner().withSoftDeletePeriod(softDeletePeriod);
        } else {
            this.updateParameter.withSoftDeletePeriod(softDeletePeriod);
        }
        return this;
    }

    @Override
    public DatabaseImpl withStatistics(DatabaseStatistics statistics) {
        if (isInCreateMode()) {
            this.inner().withStatistics(statistics);
        } else {
            this.updateParameter.withStatistics(statistics);
        }
        return this;
    }

}
