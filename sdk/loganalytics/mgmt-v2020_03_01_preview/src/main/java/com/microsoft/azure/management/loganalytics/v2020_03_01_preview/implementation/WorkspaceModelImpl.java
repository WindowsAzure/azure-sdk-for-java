/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.WorkspaceModel;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.PrivateLinkScopedResource;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.WorkspaceEntityStatus;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.PublicNetworkAccessType;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.WorkspaceSku;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.WorkspaceCapping;

class WorkspaceModelImpl extends GroupableResourceCoreImpl<WorkspaceModel, WorkspaceInner, WorkspaceModelImpl, LogAnalyticsManager> implements WorkspaceModel {
    WorkspaceModelImpl(String name, WorkspaceInner inner, LogAnalyticsManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<WorkspaceModel> createResourceAsync() {
        DeletedWorkspacesInner client = this.manager().inner().deletedWorkspaces();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<WorkspaceModel> updateResourceAsync() {
        DeletedWorkspacesInner client = this.manager().inner().deletedWorkspaces();
        return null; // NOP updateResourceAsync implementation as update is not supported
    }

    @Override
    protected Observable<WorkspaceInner> getInnerAsync() {
        DeletedWorkspacesInner client = this.manager().inner().deletedWorkspaces();
        return null; // NOP getInnerAsync implementation as get is not supported
    }



    @Override
    public String customerId() {
        return this.inner().customerId();
    }

    @Override
    public String eTag() {
        return this.inner().eTag();
    }

    @Override
    public List<PrivateLinkScopedResource> privateLinkScopedResources() {
        return this.inner().privateLinkScopedResources();
    }

    @Override
    public WorkspaceEntityStatus provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PublicNetworkAccessType publicNetworkAccessForIngestion() {
        return this.inner().publicNetworkAccessForIngestion();
    }

    @Override
    public PublicNetworkAccessType publicNetworkAccessForQuery() {
        return this.inner().publicNetworkAccessForQuery();
    }

    @Override
    public Integer retentionInDays() {
        return this.inner().retentionInDays();
    }

    @Override
    public WorkspaceSku sku() {
        return this.inner().sku();
    }

    @Override
    public WorkspaceCapping workspaceCapping() {
        return this.inner().workspaceCapping();
    }

}
