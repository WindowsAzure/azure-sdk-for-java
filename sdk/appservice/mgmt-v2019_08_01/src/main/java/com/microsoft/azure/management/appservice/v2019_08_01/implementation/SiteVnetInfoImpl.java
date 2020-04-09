/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.SiteVnetInfo;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.azure.management.appservice.v2019_08_01.VnetRoute;

class SiteVnetInfoImpl extends CreatableUpdatableImpl<SiteVnetInfo, VnetInfoInner, SiteVnetInfoImpl> implements SiteVnetInfo, SiteVnetInfo.Definition, SiteVnetInfo.Update {
    private final CertificateRegistrationManager manager;
    private String resourceGroupName;
    private String name;
    private String vnetName;
    private String slot;

    SiteVnetInfoImpl(String name, CertificateRegistrationManager manager) {
        super(name, new VnetInfoInner());
        this.manager = manager;
        // Set resource name
        this.vnetName = name;
        //
    }

    SiteVnetInfoImpl(VnetInfoInner inner, CertificateRegistrationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.vnetName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.vnetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualNetworkConnections");
        this.slot = IdParsingUtils.getValueFromIdByName(inner.id(), "slots");
        //
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SiteVnetInfo> createResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createOrUpdateVnetConnectionSlotAsync(this.resourceGroupName, this.name, this.vnetName, this.slot, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SiteVnetInfo> updateResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.updateVnetConnectionSlotAsync(this.resourceGroupName, this.name, this.vnetName, this.slot, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VnetInfoInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getVnetConnectionSlotAsync(this.resourceGroupName, this.name, this.vnetName, this.slot);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String certBlob() {
        return this.inner().certBlob();
    }

    @Override
    public String certThumbprint() {
        return this.inner().certThumbprint();
    }

    @Override
    public String dnsServers() {
        return this.inner().dnsServers();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isSwift() {
        return this.inner().isSwift();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean resyncRequired() {
        return this.inner().resyncRequired();
    }

    @Override
    public List<VnetRoute> routes() {
        List<VnetRoute> lst = new ArrayList<VnetRoute>();
        if (this.inner().routes() != null) {
            for (VnetRouteInner inner : this.inner().routes()) {
                lst.add( new VnetRouteImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String vnetResourceId() {
        return this.inner().vnetResourceId();
    }

    @Override
    public SiteVnetInfoImpl withExistingSlot(String resourceGroupName, String name, String slot) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.slot = slot;
        return this;
    }

    @Override
    public SiteVnetInfoImpl withCertBlob(String certBlob) {
        this.inner().withCertBlob(certBlob);
        return this;
    }

    @Override
    public SiteVnetInfoImpl withDnsServers(String dnsServers) {
        this.inner().withDnsServers(dnsServers);
        return this;
    }

    @Override
    public SiteVnetInfoImpl withIsSwift(Boolean isSwift) {
        this.inner().withIsSwift(isSwift);
        return this;
    }

    @Override
    public SiteVnetInfoImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public SiteVnetInfoImpl withVnetResourceId(String vnetResourceId) {
        this.inner().withVnetResourceId(vnetResourceId);
        return this;
    }

}
