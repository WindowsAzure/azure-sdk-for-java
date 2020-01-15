/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation;

import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.ServiceResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;

class ServiceResourceImpl extends CreatableUpdatableImpl<ServiceResource, ServiceResourceInner, ServiceResourceImpl> implements ServiceResource, ServiceResource.Definition, ServiceResource.Update {
    private final DeploymentManagerManager manager;
    private String resourceGroupName;
    private String serviceTopologyName;
    private String serviceName;

    ServiceResourceImpl(String name, DeploymentManagerManager manager) {
        super(name, new ServiceResourceInner());
        this.manager = manager;
        // Set resource name
        this.serviceName = name;
        //
    }

    ServiceResourceImpl(ServiceResourceInner inner, DeploymentManagerManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.serviceName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceTopologyName = IdParsingUtils.getValueFromIdByName(inner.id(), "serviceTopologies");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "services");
        //
    }

    @Override
    public DeploymentManagerManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServiceResource> createResourceAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceTopologyName, this.serviceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServiceResource> updateResourceAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceTopologyName, this.serviceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServiceResourceInner> getInnerAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.getAsync(this.resourceGroupName, this.serviceTopologyName, this.serviceName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
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
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String targetLocation() {
        return this.inner().targetLocation();
    }

    @Override
    public String targetSubscriptionId() {
        return this.inner().targetSubscriptionId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ServiceResourceImpl withExistingServiceTopology(String resourceGroupName, String serviceTopologyName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceTopologyName = serviceTopologyName;
        return this;
    }

    @Override
    public ServiceResourceImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ServiceResourceImpl withTargetLocation(String targetLocation) {
        this.inner().withTargetLocation(targetLocation);
        return this;
    }

    @Override
    public ServiceResourceImpl withTargetSubscriptionId(String targetSubscriptionId) {
        this.inner().withTargetSubscriptionId(targetSubscriptionId);
        return this;
    }

    @Override
    public ServiceResourceImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
