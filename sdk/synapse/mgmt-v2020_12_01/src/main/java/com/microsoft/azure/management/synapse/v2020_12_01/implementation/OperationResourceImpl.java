/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.management.synapse.v2020_12_01.OperationResource;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.synapse.v2020_12_01.ErrorDetail;
import com.microsoft.azure.management.synapse.v2020_12_01.OperationStatus;

class OperationResourceImpl extends IndexableRefreshableWrapperImpl<OperationResource, OperationResourceInner> implements OperationResource {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String operationId;

    OperationResourceImpl(OperationResourceInner inner,  SynapseManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.operationId = IdParsingUtils.getValueFromIdByName(inner.id(), "operationStatuses");
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<OperationResourceInner> getInnerAsync() {
        OperationsInner client = this.manager().inner().operations();
        return client.getAzureAsyncHeaderResultAsync(this.resourceGroupName, this.workspaceName, this.operationId);
    }



    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public ErrorDetail error() {
        return this.inner().error();
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
    public Double percentComplete() {
        return this.inner().percentComplete();
    }

    @Override
    public Object properties() {
        return this.inner().properties();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public OperationStatus status() {
        return this.inner().status();
    }

}
