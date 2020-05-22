/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2015_12_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.batch.v2015_12_01.BatchAccount;
import rx.Observable;
import com.microsoft.azure.management.batch.v2015_12_01.BatchAccountUpdateParameters;
import com.microsoft.azure.management.batch.v2015_12_01.BatchAccountCreateParameters;
import com.microsoft.azure.management.batch.v2015_12_01.AutoStorageProperties;
import com.microsoft.azure.management.batch.v2015_12_01.ProvisioningState;
import com.microsoft.azure.management.batch.v2015_12_01.AutoStorageBaseProperties;
import rx.functions.Func1;

class BatchAccountImpl extends GroupableResourceCoreImpl<BatchAccount, BatchAccountInner, BatchAccountImpl, BatchManager> implements BatchAccount, BatchAccount.Definition, BatchAccount.Update {
    private BatchAccountCreateParameters createParameter;
    private BatchAccountUpdateParameters updateParameter;
    BatchAccountImpl(String name, BatchAccountInner inner, BatchManager manager) {
        super(name, inner, manager);
        this.createParameter = new BatchAccountCreateParameters();
        this.updateParameter = new BatchAccountUpdateParameters();
    }

    @Override
    public Observable<BatchAccount> createResourceAsync() {
        BatchAccountsInner client = this.manager().inner().batchAccounts();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<BatchAccountInner, BatchAccountInner>() {
               @Override
               public BatchAccountInner call(BatchAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BatchAccount> updateResourceAsync() {
        BatchAccountsInner client = this.manager().inner().batchAccounts();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<BatchAccountInner, BatchAccountInner>() {
               @Override
               public BatchAccountInner call(BatchAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BatchAccountInner> getInnerAsync() {
        BatchAccountsInner client = this.manager().inner().batchAccounts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new BatchAccountCreateParameters();
        this.updateParameter = new BatchAccountUpdateParameters();
    }

    @Override
    public String accountEndpoint() {
        return this.inner().accountEndpoint();
    }

    @Override
    public int activeJobAndJobScheduleQuota() {
        return this.inner().activeJobAndJobScheduleQuota();
    }

    @Override
    public AutoStorageProperties autoStorage() {
        return this.inner().autoStorage();
    }

    @Override
    public int coreQuota() {
        return this.inner().coreQuota();
    }

    @Override
    public int poolQuota() {
        return this.inner().poolQuota();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public BatchAccountImpl withAutoStorage(AutoStorageBaseProperties autoStorage) {
        if (isInCreateMode()) {
            this.createParameter.withAutoStorage(autoStorage);
        } else {
            this.updateParameter.withAutoStorage(autoStorage);
        }
        return this;
    }

}
