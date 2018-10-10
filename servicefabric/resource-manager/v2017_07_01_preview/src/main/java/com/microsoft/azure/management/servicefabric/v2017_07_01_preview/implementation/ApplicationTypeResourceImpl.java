/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation;

import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ApplicationTypeResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class ApplicationTypeResourceImpl extends CreatableUpdatableImpl<ApplicationTypeResource, ApplicationTypeResourceInner, ApplicationTypeResourceImpl> implements ApplicationTypeResource, ApplicationTypeResource.Definition, ApplicationTypeResource.Update {
    private final ServiceFabricManager manager;
    private String subscriptionId;
    private String resourceGroupName;
    private String clusterName;
    private String applicationTypeName;
    private String capiVersion;
    private String clocation;
    private String uapiVersion;
    private String ulocation;

    ApplicationTypeResourceImpl(String name, ServiceFabricManager manager) {
        super(name, new ApplicationTypeResourceInner());
        this.manager = manager;
        // Set resource name
        this.applicationTypeName = name;
        //
    }

    ApplicationTypeResourceImpl(ApplicationTypeResourceInner inner, ServiceFabricManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.applicationTypeName = inner.name();
        // set resource ancestor and positional variables
        this.subscriptionId = IdParsingUtils.getValueFromIdByName(inner.id(), "subscriptions");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.clusterName = IdParsingUtils.getValueFromIdByName(inner.id(), "clusters");
        this.applicationTypeName = IdParsingUtils.getValueFromIdByName(inner.id(), "applicationTypes");
        //
    }

    @Override
    public ServiceFabricManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApplicationTypeResource> createResourceAsync() {
        ApplicationTypesInner client = this.manager().inner().applicationTypes();
        return client.putAsync(this.subscriptionId, this.resourceGroupName, this.clusterName, this.applicationTypeName, this.capiVersion, this.clocation)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApplicationTypeResource> updateResourceAsync() {
        ApplicationTypesInner client = this.manager().inner().applicationTypes();
        return client.putAsync(this.subscriptionId, this.resourceGroupName, this.clusterName, this.applicationTypeName, this.uapiVersion, this.ulocation)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApplicationTypeResourceInner> getInnerAsync() {
        ApplicationTypesInner client = this.manager().inner().applicationTypes();
        return client.getAsync(this.subscriptionId, this.resourceGroupName, this.clusterName, this.applicationTypeName);
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
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ApplicationTypeResourceImpl withExistingCluster(String subscriptionId, String resourceGroupName, String clusterName) {
        this.subscriptionId = subscriptionId;
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    @Override
    public ApplicationTypeResourceImpl withApiVersion(String apiVersion) {
        if (isInCreateMode()) {
            this.capiVersion = apiVersion;
        } else {
            this.uapiVersion = apiVersion;
        }
        return this;
    }

    @Override
    public ApplicationTypeResourceImpl withLocation(String location) {
        if (isInCreateMode()) {
            this.clocation = location;
        } else {
            this.ulocation = location;
        }
        return this;
    }

}
