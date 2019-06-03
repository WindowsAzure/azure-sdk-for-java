/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.DeletedSite;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class DeletedSiteImpl extends IndexableRefreshableWrapperImpl<DeletedSite, DeletedSiteInner> implements DeletedSite {
    private final AppServiceManager manager;
    private String location;
    private String deletedSiteId;

    DeletedSiteImpl(DeletedSiteInner inner,  AppServiceManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.location = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
        this.deletedSiteId = IdParsingUtils.getValueFromIdByName(inner.id(), "deletedSites");
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DeletedSiteInner> getInnerAsync() {
        DeletedWebAppsInner client = this.manager().inner().deletedWebApps();
        return client.getDeletedWebAppByLocationAsync(this.location, this.deletedSiteId);
    }



    @Override
    public Integer deletedSiteId() {
        return this.inner().deletedSiteId();
    }

    @Override
    public String deletedSiteKind() {
        return this.inner().deletedSiteKind();
    }

    @Override
    public String deletedSiteName() {
        return this.inner().deletedSiteName();
    }

    @Override
    public String deletedTimestamp() {
        return this.inner().deletedTimestamp();
    }

    @Override
    public String geoRegionName() {
        return this.inner().geoRegionName();
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
    public String resourceGroup() {
        return this.inner().resourceGroup();
    }

    @Override
    public String slot() {
        return this.inner().slot();
    }

    @Override
    public String subscription() {
        return this.inner().subscription();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
