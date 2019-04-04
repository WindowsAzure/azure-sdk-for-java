/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.privatedns.v2018_09_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.privatedns.v2018_09_01.PrivateZone;
import rx.Observable;
import com.microsoft.azure.management.privatedns.v2018_09_01.ProvisioningState;

class PrivateZoneImpl extends GroupableResourceCoreImpl<PrivateZone, PrivateZoneInner, PrivateZoneImpl, privatednsManager> implements PrivateZone, PrivateZone.Definition, PrivateZone.Update {
    private String cifMatch;
    private String cifNoneMatch;
    private String uifMatch;
    PrivateZoneImpl(String name, PrivateZoneInner inner, privatednsManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<PrivateZone> createResourceAsync() {
        PrivateZonesInner client = this.manager().inner().privateZones();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner(), this.cifMatch, this.cifNoneMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PrivateZone> updateResourceAsync() {
        PrivateZonesInner client = this.manager().inner().privateZones();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateZoneInner> getInnerAsync() {
        PrivateZonesInner client = this.manager().inner().privateZones();
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
    public Long maxNumberOfRecordSets() {
        return this.inner().maxNumberOfRecordSets();
    }

    @Override
    public Long maxNumberOfVirtualNetworkLinks() {
        return this.inner().maxNumberOfVirtualNetworkLinks();
    }

    @Override
    public Long maxNumberOfVirtualNetworkLinksWithRegistration() {
        return this.inner().maxNumberOfVirtualNetworkLinksWithRegistration();
    }

    @Override
    public Long numberOfRecordSets() {
        return this.inner().numberOfRecordSets();
    }

    @Override
    public Long numberOfVirtualNetworkLinks() {
        return this.inner().numberOfVirtualNetworkLinks();
    }

    @Override
    public Long numberOfVirtualNetworkLinksWithRegistration() {
        return this.inner().numberOfVirtualNetworkLinksWithRegistration();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PrivateZoneImpl withIfNoneMatch(String ifNoneMatch) {
        this.cifNoneMatch = ifNoneMatch;
        return this;
    }

    @Override
    public PrivateZoneImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public PrivateZoneImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

}
