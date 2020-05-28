/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.WorkerPools;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2018_02_01.ComputeModeOptions;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.SkuDescription;

class WorkerPoolsImpl extends CreatableUpdatableImpl<WorkerPools, WorkerPoolResourceInner, WorkerPoolsImpl> implements WorkerPools, WorkerPools.Definition, WorkerPools.Update {
    private final CertificateRegistrationManager manager;
    private String resourceGroupName;
    private String name;
    private String workerPoolName;

    WorkerPoolsImpl(String name, CertificateRegistrationManager manager) {
        super(name, new WorkerPoolResourceInner());
        this.manager = manager;
        // Set resource name
        this.workerPoolName = name;
        //
    }

    WorkerPoolsImpl(WorkerPoolResourceInner inner, CertificateRegistrationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.workerPoolName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "hostingEnvironments");
        this.workerPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "workerPools");
        //
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<WorkerPools> createResourceAsync() {
        AppServiceEnvironmentsInner client = this.manager().inner().appServiceEnvironments();
        return client.createOrUpdateWorkerPoolAsync(this.resourceGroupName, this.name, this.workerPoolName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<WorkerPools> updateResourceAsync() {
        AppServiceEnvironmentsInner client = this.manager().inner().appServiceEnvironments();
        return client.updateWorkerPoolAsync(this.resourceGroupName, this.name, this.workerPoolName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<WorkerPoolResourceInner> getInnerAsync() {
        AppServiceEnvironmentsInner client = this.manager().inner().appServiceEnvironments();
        return client.getWorkerPoolAsync(this.resourceGroupName, this.name, this.workerPoolName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public ComputeModeOptions computeMode() {
        return this.inner().computeMode();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<String> instanceNames() {
        return this.inner().instanceNames();
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
    public SkuDescription sku() {
        return this.inner().sku();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Integer workerCount() {
        return this.inner().workerCount();
    }

    @Override
    public String workerSize() {
        return this.inner().workerSize();
    }

    @Override
    public Integer workerSizeId() {
        return this.inner().workerSizeId();
    }

    @Override
    public WorkerPoolsImpl withExistingHostingEnvironment(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    @Override
    public WorkerPoolsImpl withComputeMode(ComputeModeOptions computeMode) {
        this.inner().withComputeMode(computeMode);
        return this;
    }

    @Override
    public WorkerPoolsImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public WorkerPoolsImpl withSku(SkuDescription sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public WorkerPoolsImpl withWorkerCount(Integer workerCount) {
        this.inner().withWorkerCount(workerCount);
        return this;
    }

    @Override
    public WorkerPoolsImpl withWorkerSize(String workerSize) {
        this.inner().withWorkerSize(workerSize);
        return this;
    }

    @Override
    public WorkerPoolsImpl withWorkerSizeId(Integer workerSizeId) {
        this.inner().withWorkerSizeId(workerSizeId);
        return this;
    }

}
