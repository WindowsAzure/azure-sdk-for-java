/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.HybridRunbookWorkerGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.RunAsCredentialAssociationProperty;
import com.microsoft.azure.management.automation.v2015_10_31.GroupTypeEnum;
import java.util.List;
import com.microsoft.azure.management.automation.v2015_10_31.HybridRunbookWorker;

class HybridRunbookWorkerGroupImpl extends CreatableUpdatableImpl<HybridRunbookWorkerGroup, HybridRunbookWorkerGroupInner, HybridRunbookWorkerGroupImpl> implements HybridRunbookWorkerGroup, HybridRunbookWorkerGroup.Update {
    private final AutomationManager manager;
    private String resourceGroupName;
    private String automationAccountName;
    private String hybridRunbookWorkerGroupName;

    HybridRunbookWorkerGroupImpl(String name, AutomationManager manager) {
        super(name, new HybridRunbookWorkerGroupInner());
        this.manager = manager;
        // Set resource name
        this.hybridRunbookWorkerGroupName = name;
        //
    }

    HybridRunbookWorkerGroupImpl(HybridRunbookWorkerGroupInner inner, AutomationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.hybridRunbookWorkerGroupName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.automationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "automationAccounts");
        this.hybridRunbookWorkerGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "hybridRunbookWorkerGroups");
        //
    }

    @Override
    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<HybridRunbookWorkerGroup> createResourceAsync() {
        HybridRunbookWorkerGroupsInner client = this.manager().inner().hybridRunbookWorkerGroups();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<HybridRunbookWorkerGroup> updateResourceAsync() {
        HybridRunbookWorkerGroupsInner client = this.manager().inner().hybridRunbookWorkerGroups();
        return client.updateAsync(this.resourceGroupName, this.automationAccountName, this.hybridRunbookWorkerGroupName)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<HybridRunbookWorkerGroupInner> getInnerAsync() {
        HybridRunbookWorkerGroupsInner client = this.manager().inner().hybridRunbookWorkerGroups();
        return client.getAsync(this.resourceGroupName, this.automationAccountName, this.hybridRunbookWorkerGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public RunAsCredentialAssociationProperty credential() {
        return this.inner().credential();
    }

    @Override
    public GroupTypeEnum groupType() {
        return this.inner().groupType();
    }

    @Override
    public List<HybridRunbookWorker> hybridRunbookWorkers() {
        return this.inner().hybridRunbookWorkers();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
