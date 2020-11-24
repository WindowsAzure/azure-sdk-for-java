/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.PipelineRun;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.SystemData;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.PipelineRunRequest;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.PipelineRunResponse;

class PipelineRunImpl extends CreatableUpdatableImpl<PipelineRun, PipelineRunInner, PipelineRunImpl> implements PipelineRun, PipelineRun.Definition, PipelineRun.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String pipelineRunName;

    PipelineRunImpl(String name, ContainerRegistryManager manager) {
        super(name, new PipelineRunInner());
        this.manager = manager;
        // Set resource name
        this.pipelineRunName = name;
        //
    }

    PipelineRunImpl(PipelineRunInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.pipelineRunName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.pipelineRunName = IdParsingUtils.getValueFromIdByName(inner.id(), "pipelineRuns");
        //
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PipelineRun> createResourceAsync() {
        PipelineRunsInner client = this.manager().inner().pipelineRuns();
        return client.createAsync(this.resourceGroupName, this.registryName, this.pipelineRunName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PipelineRun> updateResourceAsync() {
        PipelineRunsInner client = this.manager().inner().pipelineRuns();
        return client.createAsync(this.resourceGroupName, this.registryName, this.pipelineRunName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PipelineRunInner> getInnerAsync() {
        PipelineRunsInner client = this.manager().inner().pipelineRuns();
        return client.getAsync(this.resourceGroupName, this.registryName, this.pipelineRunName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String forceUpdateTag() {
        return this.inner().forceUpdateTag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PipelineRunRequest request() {
        return this.inner().request();
    }

    @Override
    public PipelineRunResponse response() {
        return this.inner().response();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PipelineRunImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public PipelineRunImpl withForceUpdateTag(String forceUpdateTag) {
        this.inner().withForceUpdateTag(forceUpdateTag);
        return this;
    }

    @Override
    public PipelineRunImpl withRequest(PipelineRunRequest request) {
        this.inner().withRequest(request);
        return this;
    }

}
