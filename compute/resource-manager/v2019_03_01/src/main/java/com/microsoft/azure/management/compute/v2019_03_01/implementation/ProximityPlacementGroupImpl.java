/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2019_03_01.ProximityPlacementGroup;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.compute.v2019_03_01.ProximityPlacementGroupType;
import java.util.List;
import com.microsoft.azure.SubResource;

class ProximityPlacementGroupImpl extends GroupableResourceCoreImpl<ProximityPlacementGroup, ProximityPlacementGroupInner, ProximityPlacementGroupImpl, ComputeManager> implements ProximityPlacementGroup, ProximityPlacementGroup.Definition, ProximityPlacementGroup.Update {
    ProximityPlacementGroupImpl(String name, ProximityPlacementGroupInner inner, ComputeManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ProximityPlacementGroup> createResourceAsync() {
        ProximityPlacementGroupsInner client = this.manager().inner().proximityPlacementGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ProximityPlacementGroup> updateResourceAsync() {
        ProximityPlacementGroupsInner client = this.manager().inner().proximityPlacementGroups();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.tags())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ProximityPlacementGroupInner> getInnerAsync() {
        ProximityPlacementGroupsInner client = this.manager().inner().proximityPlacementGroups();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<SubResource> availabilitySets() {
        return this.inner().availabilitySets();
    }

    @Override
    public ProximityPlacementGroupType proximityPlacementGroupType() {
        return this.inner().proximityPlacementGroupType();
    }

    @Override
    public List<SubResource> virtualMachines() {
        return this.inner().virtualMachines();
    }

    @Override
    public List<SubResource> virtualMachineScaleSets() {
        return this.inner().virtualMachineScaleSets();
    }

    @Override
    public ProximityPlacementGroupImpl withProximityPlacementGroupType(ProximityPlacementGroupType proximityPlacementGroupType) {
        this.inner().withProximityPlacementGroupType(proximityPlacementGroupType);
        return this;
    }
}
