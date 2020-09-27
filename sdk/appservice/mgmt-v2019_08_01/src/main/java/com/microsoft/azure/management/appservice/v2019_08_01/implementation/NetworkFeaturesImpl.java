/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.NetworkFeatures;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.ArrayList;
import com.microsoft.azure.management.appservice.v2019_08_01.RelayServiceConnectionEntity;
import java.util.List;
import com.microsoft.azure.management.appservice.v2019_08_01.SiteHybridConnection;
import com.microsoft.azure.management.appservice.v2019_08_01.SiteVnetInfo;

class NetworkFeaturesImpl extends IndexableRefreshableWrapperImpl<NetworkFeatures, NetworkFeaturesInner> implements NetworkFeatures {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String view;

    NetworkFeaturesImpl(NetworkFeaturesInner inner,  AppServiceManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.view = IdParsingUtils.getValueFromIdByName(inner.id(), "networkFeatures");
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<NetworkFeaturesInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.listNetworkFeaturesAsync(this.resourceGroupName, this.name, this.view);
    }



    @Override
    public List<RelayServiceConnectionEntity> hybridConnections() {
        List<RelayServiceConnectionEntity> lst = new ArrayList<RelayServiceConnectionEntity>();
        if (this.inner().hybridConnections() != null) {
            for (RelayServiceConnectionEntityInner inner : this.inner().hybridConnections()) {
                lst.add( new RelayServiceConnectionEntityImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<SiteHybridConnection> hybridConnectionsV2() {
        List<SiteHybridConnection> lst = new ArrayList<SiteHybridConnection>();
        if (this.inner().hybridConnectionsV2() != null) {
            for (HybridConnectionInner inner : this.inner().hybridConnectionsV2()) {
                lst.add( new SiteHybridConnectionImpl(inner, manager()));
            }
        }
        return lst;
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SiteVnetInfo virtualNetworkConnection() {
        VnetInfoInner inner = this.inner().virtualNetworkConnection();
        if (inner != null) {
            return  new SiteVnetInfoImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public String virtualNetworkName() {
        return this.inner().virtualNetworkName();
    }

}
