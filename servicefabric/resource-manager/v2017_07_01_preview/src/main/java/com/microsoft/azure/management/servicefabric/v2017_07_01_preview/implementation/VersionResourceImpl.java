/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation;

import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.VersionResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ApplicationParameter;

class VersionResourceImpl extends CreatableUpdatableImpl<VersionResource, VersionResourceInner, VersionResourceImpl> implements VersionResource, VersionResource.Definition, VersionResource.Update {
    private final ServiceFabricManager manager;
    private String subscriptionId;
    private String resourceGroupName;
    private String clusterName;
    private String applicationTypeName;
    private String version;
    private String capiVersion;
    private String uapiVersion;

    VersionResourceImpl(String name, ServiceFabricManager manager) {
        super(name, new VersionResourceInner());
        this.manager = manager;
        // Set resource name
        this.version = name;
        //
    }

    VersionResourceImpl(VersionResourceInner inner, ServiceFabricManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.version = inner.name();
        // set resource ancestor and positional variables
        this.subscriptionId = IdParsingUtils.getValueFromIdByName(inner.id(), "subscriptions");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.clusterName = IdParsingUtils.getValueFromIdByName(inner.id(), "clusters");
        this.applicationTypeName = IdParsingUtils.getValueFromIdByName(inner.id(), "applicationTypes");
        this.version = IdParsingUtils.getValueFromIdByName(inner.id(), "versions");
        //
    }

    @Override
    public ServiceFabricManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VersionResource> createResourceAsync() {
        VersionsInner client = this.manager().inner().versions();
        return client.putAsync(this.subscriptionId, this.resourceGroupName, this.clusterName, this.applicationTypeName, this.version, this.capiVersion, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VersionResource> updateResourceAsync() {
        VersionsInner client = this.manager().inner().versions();
        return client.putAsync(this.subscriptionId, this.resourceGroupName, this.clusterName, this.applicationTypeName, this.version, this.uapiVersion, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VersionResourceInner> getInnerAsync() {
        VersionsInner client = this.manager().inner().versions();
        return client.getAsync(this.subscriptionId, this.resourceGroupName, this.clusterName, this.applicationTypeName, this.version);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String appPackageUrl() {
        return this.inner().appPackageUrl();
    }

    @Override
    public List<ApplicationParameter> defaultParameterList() {
        return this.inner().defaultParameterList();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public VersionResourceImpl withExistingApplicationType(String subscriptionId, String resourceGroupName, String clusterName, String applicationTypeName) {
        this.subscriptionId = subscriptionId;
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    @Override
    public VersionResourceImpl withAppPackageUrl(String appPackageUrl) {
        this.inner().withAppPackageUrl(appPackageUrl);
        return this;
    }

    @Override
    public VersionResourceImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public VersionResourceImpl withApiVersion(String apiVersion) {
        if (isInCreateMode()) {
            this.capiVersion = apiVersion;
        } else {
            this.uapiVersion = apiVersion;
        }
        return this;
    }

}
