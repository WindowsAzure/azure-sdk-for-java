/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_06_01.DdosProtectionPlan;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.SubResource;

class DdosProtectionPlanImpl extends GroupableResourceCoreImpl<DdosProtectionPlan, DdosProtectionPlanInner, DdosProtectionPlanImpl, NetworkManager> implements DdosProtectionPlan, DdosProtectionPlan.Definition, DdosProtectionPlan.Update {
    DdosProtectionPlanImpl(String name, DdosProtectionPlanInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<DdosProtectionPlan> createResourceAsync() {
        DdosProtectionPlansInner client = this.manager().inner().ddosProtectionPlans();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DdosProtectionPlan> updateResourceAsync() {
        DdosProtectionPlansInner client = this.manager().inner().ddosProtectionPlans();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DdosProtectionPlanInner> getInnerAsync() {
        DdosProtectionPlansInner client = this.manager().inner().ddosProtectionPlans();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public List<SubResource> virtualNetworks() {
        return this.inner().virtualNetworks();
    }

}
