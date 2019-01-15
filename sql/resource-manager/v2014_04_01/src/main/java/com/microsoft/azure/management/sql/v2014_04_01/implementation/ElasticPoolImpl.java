/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.ElasticPool;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolUpdate;
import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolState;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolEdition;
import rx.functions.Func1;

class ElasticPoolImpl extends CreatableUpdatableImpl<ElasticPool, ElasticPoolInner, ElasticPoolImpl> implements ElasticPool, ElasticPool.Definition, ElasticPool.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String elasticPoolName;
    private ElasticPoolUpdate updateParameter;

    ElasticPoolImpl(String name, SqlManager manager) {
        super(name, new ElasticPoolInner());
        this.manager = manager;
        // Set resource name
        this.elasticPoolName = name;
        //
        this.updateParameter = new ElasticPoolUpdate();
    }

    ElasticPoolImpl(ElasticPoolInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.elasticPoolName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.elasticPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "elasticPools");
        //
        this.updateParameter = new ElasticPoolUpdate();
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ElasticPool> createResourceAsync() {
        ElasticPoolsInner client = this.manager().inner().elasticPools();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.elasticPoolName, this.inner())
            .map(new Func1<ElasticPoolInner, ElasticPoolInner>() {
               @Override
               public ElasticPoolInner call(ElasticPoolInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ElasticPool> updateResourceAsync() {
        ElasticPoolsInner client = this.manager().inner().elasticPools();
        return client.updateAsync(this.resourceGroupName, this.serverName, this.elasticPoolName, this.updateParameter)
            .map(new Func1<ElasticPoolInner, ElasticPoolInner>() {
               @Override
               public ElasticPoolInner call(ElasticPoolInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ElasticPoolInner> getInnerAsync() {
        ElasticPoolsInner client = this.manager().inner().elasticPools();
        return client.getAsync(this.resourceGroupName, this.serverName, this.elasticPoolName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ElasticPoolUpdate();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public Integer databaseDtuMax() {
        return this.inner().databaseDtuMax();
    }

    @Override
    public Integer databaseDtuMin() {
        return this.inner().databaseDtuMin();
    }

    @Override
    public Integer dtu() {
        return this.inner().dtu();
    }

    @Override
    public ElasticPoolEdition edition() {
        return this.inner().edition();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
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
    public ElasticPoolState state() {
        return this.inner().state();
    }

    @Override
    public Integer storageMB() {
        return this.inner().storageMB();
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
    public Boolean zoneRedundant() {
        return this.inner().zoneRedundant();
    }

    @Override
    public ElasticPoolImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public ElasticPoolImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ElasticPoolImpl withDatabaseDtuMax(Integer databaseDtuMax) {
        if (isInCreateMode()) {
            this.inner().withDatabaseDtuMax(databaseDtuMax);
        } else {
            this.updateParameter.withDatabaseDtuMax(databaseDtuMax);
        }
        return this;
    }

    @Override
    public ElasticPoolImpl withDatabaseDtuMin(Integer databaseDtuMin) {
        if (isInCreateMode()) {
            this.inner().withDatabaseDtuMin(databaseDtuMin);
        } else {
            this.updateParameter.withDatabaseDtuMin(databaseDtuMin);
        }
        return this;
    }

    @Override
    public ElasticPoolImpl withDtu(Integer dtu) {
        if (isInCreateMode()) {
            this.inner().withDtu(dtu);
        } else {
            this.updateParameter.withDtu(dtu);
        }
        return this;
    }

    @Override
    public ElasticPoolImpl withEdition(ElasticPoolEdition edition) {
        if (isInCreateMode()) {
            this.inner().withEdition(edition);
        } else {
            this.updateParameter.withEdition(edition);
        }
        return this;
    }

    @Override
    public ElasticPoolImpl withStorageMB(Integer storageMB) {
        if (isInCreateMode()) {
            this.inner().withStorageMB(storageMB);
        } else {
            this.updateParameter.withStorageMB(storageMB);
        }
        return this;
    }

    @Override
    public ElasticPoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public ElasticPoolImpl withZoneRedundant(Boolean zoneRedundant) {
        if (isInCreateMode()) {
            this.inner().withZoneRedundant(zoneRedundant);
        } else {
            this.updateParameter.withZoneRedundant(zoneRedundant);
        }
        return this;
    }

}
