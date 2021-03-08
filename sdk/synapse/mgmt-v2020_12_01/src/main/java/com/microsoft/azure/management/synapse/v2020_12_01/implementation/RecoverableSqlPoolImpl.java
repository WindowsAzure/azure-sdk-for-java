/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.management.synapse.v2020_12_01.RecoverableSqlPool;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;

class RecoverableSqlPoolImpl extends IndexableRefreshableWrapperImpl<RecoverableSqlPool, RecoverableSqlPoolInner> implements RecoverableSqlPool {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String sqlPoolName;

    RecoverableSqlPoolImpl(RecoverableSqlPoolInner inner,  SynapseManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.sqlPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "recoverableSqlPools");
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<RecoverableSqlPoolInner> getInnerAsync() {
        WorkspaceManagedSqlServerRecoverableSqlPoolsInner client = this.manager().inner().workspaceManagedSqlServerRecoverableSqlPools();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName);
    }



    @Override
    public String edition() {
        return this.inner().edition();
    }

    @Override
    public String elasticPoolName() {
        return this.inner().elasticPoolName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastAvailableBackupDate() {
        return this.inner().lastAvailableBackupDate();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String serviceLevelObjective() {
        return this.inner().serviceLevelObjective();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
