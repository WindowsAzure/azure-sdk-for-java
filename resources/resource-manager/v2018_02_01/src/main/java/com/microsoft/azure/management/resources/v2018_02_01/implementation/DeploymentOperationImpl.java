/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01.implementation;

import com.microsoft.azure.management.resources.v2018_02_01.DeploymentOperation;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.resources.v2018_02_01.DeploymentOperationProperties;

class DeploymentOperationImpl extends IndexableRefreshableWrapperImpl<DeploymentOperation, DeploymentOperationInner> implements DeploymentOperation {
    private final ResourcesManager manager;
    private String resourceGroupName;
    private String deploymentName;
    private String operationId;

    DeploymentOperationImpl(DeploymentOperationInner inner,  ResourcesManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.deploymentName = IdParsingUtils.getValueFromIdByName(inner.id(), "deployments");
        this.operationId = IdParsingUtils.getValueFromIdByName(inner.id(), "operations");
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DeploymentOperationInner> getInnerAsync() {
        DeploymentOperationsInner client = this.manager().inner().deploymentOperations();
        return client.getAsync(this.resourceGroupName, this.deploymentName, this.operationId);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String operationId() {
        return this.inner().operationId();
    }

    @Override
    public DeploymentOperationProperties properties() {
        return this.inner().properties();
    }

}
