/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.StaticSiteBuildARMResource;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2019_08_01.BuildStatus;

class StaticSiteBuildARMResourceImpl extends IndexableRefreshableWrapperImpl<StaticSiteBuildARMResource, StaticSiteBuildARMResourceInner> implements StaticSiteBuildARMResource {
    private final CertificateRegistrationManager manager;
    private String resourceGroupName;
    private String name;
    private String prId;

    StaticSiteBuildARMResourceImpl(StaticSiteBuildARMResourceInner inner,  CertificateRegistrationManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "staticSites");
        this.prId = IdParsingUtils.getValueFromIdByName(inner.id(), "builds");
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<StaticSiteBuildARMResourceInner> getInnerAsync() {
        StaticSitesInner client = this.manager().inner().staticSites();
        return client.getStaticSiteBuildAsync(this.resourceGroupName, this.name, this.prId);
    }



    @Override
    public String buildId() {
        return this.inner().buildId();
    }

    @Override
    public DateTime createdTimeUtc() {
        return this.inner().createdTimeUtc();
    }

    @Override
    public String hostname() {
        return this.inner().hostname();
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
    public DateTime lastUpdatedOn() {
        return this.inner().lastUpdatedOn();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String pullRequestTitle() {
        return this.inner().pullRequestTitle();
    }

    @Override
    public String sourceBranch() {
        return this.inner().sourceBranch();
    }

    @Override
    public BuildStatus status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
