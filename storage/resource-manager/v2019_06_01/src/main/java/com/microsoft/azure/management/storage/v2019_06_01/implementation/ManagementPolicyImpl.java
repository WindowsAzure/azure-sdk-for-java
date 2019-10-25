/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.ManagementPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.storage.v2019_06_01.ManagementPolicySchema;
import java.util.List;
import org.joda.time.DateTime;
import rx.functions.Func1;

class ManagementPolicyImpl extends CreatableUpdatableImpl<ManagementPolicy, ManagementPolicyInner, ManagementPolicyImpl> implements ManagementPolicy, ManagementPolicy.Definition, ManagementPolicy.Update {
    private final StorageManager manager;
    private String resourceGroupName;
    private String accountName;
    private ManagementPolicySchema cpolicy;
    private ManagementPolicySchema upolicy;

    ManagementPolicyImpl(String name, StorageManager manager) {
        super(name, new ManagementPolicyInner());
        this.manager = manager;
        // Set resource name
        this.accountName = name;
        //
        this.cpolicy = new ManagementPolicySchema();
        this.upolicy = new ManagementPolicySchema();
    }

    ManagementPolicyImpl(ManagementPolicyInner inner, StorageManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.accountName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageAccounts");
        //
        this.cpolicy = new ManagementPolicySchema();
        this.upolicy = new ManagementPolicySchema();
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagementPolicy> createResourceAsync() {
        ManagementPoliciesInner client = this.manager().inner().managementPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.cpolicy)
            .map(new Func1<ManagementPolicyInner, ManagementPolicyInner>() {
               @Override
               public ManagementPolicyInner call(ManagementPolicyInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ManagementPolicy> updateResourceAsync() {
        ManagementPoliciesInner client = this.manager().inner().managementPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.upolicy)
            .map(new Func1<ManagementPolicyInner, ManagementPolicyInner>() {
               @Override
               public ManagementPolicyInner call(ManagementPolicyInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagementPolicyInner> getInnerAsync() {
        ManagementPoliciesInner client = this.manager().inner().managementPolicies();
        return client.getAsync(this.resourceGroupName, this.accountName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cpolicy = new ManagementPolicySchema();
        this.upolicy = new ManagementPolicySchema();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ManagementPolicySchema policy() {
        return this.inner().policy();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ManagementPolicyImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public ManagementPolicyImpl withPolicy(ManagementPolicySchema policy) {
        if (isInCreateMode()) {
            this.cpolicy = policy;
        } else {
            this.upolicy = policy;
        }
        return this;
    }

}
