// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.loganalytics.models.PrivateLinkScopedResource;
import com.azure.resourcemanager.loganalytics.models.PublicNetworkAccessType;
import com.azure.resourcemanager.loganalytics.models.Workspace;
import com.azure.resourcemanager.loganalytics.models.WorkspaceCapping;
import com.azure.resourcemanager.loganalytics.models.WorkspaceEntityStatus;
import com.azure.resourcemanager.loganalytics.models.WorkspacePatch;
import com.azure.resourcemanager.loganalytics.models.WorkspaceSku;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class WorkspaceImpl implements Workspace, Workspace.Definition, Workspace.Update {
    private WorkspaceInner innerObject;

    private final LogAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public WorkspaceEntityStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String customerId() {
        return this.innerModel().customerId();
    }

    public WorkspaceSku sku() {
        return this.innerModel().sku();
    }

    public Integer retentionInDays() {
        return this.innerModel().retentionInDays();
    }

    public WorkspaceCapping workspaceCapping() {
        return this.innerModel().workspaceCapping();
    }

    public PublicNetworkAccessType publicNetworkAccessForIngestion() {
        return this.innerModel().publicNetworkAccessForIngestion();
    }

    public PublicNetworkAccessType publicNetworkAccessForQuery() {
        return this.innerModel().publicNetworkAccessForQuery();
    }

    public List<PrivateLinkScopedResource> privateLinkScopedResources() {
        List<PrivateLinkScopedResource> inner = this.innerModel().privateLinkScopedResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public WorkspaceInner innerModel() {
        return this.innerObject;
    }

    private LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private WorkspacePatch updateParameters;

    public WorkspaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Workspace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public Workspace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), context);
        return this;
    }

    public WorkspaceImpl(String name, LogAnalyticsManager serviceManager) {
        this.innerObject = new WorkspaceInner();
        this.serviceManager = serviceManager;
        this.workspaceName = name;
    }

    public WorkspaceImpl update() {
        this.updateParameters = new WorkspacePatch();
        return this;
    }

    public Workspace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateWithResponse(resourceGroupName, workspaceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Workspace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateWithResponse(resourceGroupName, workspaceName, updateParameters, context)
                .getValue();
        return this;
    }

    public WorkspaceImpl(WorkspaceInner innerObject, LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
    }

    public Workspace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, Context.NONE)
                .getValue();
        return this;
    }

    public Workspace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, context)
                .getValue();
        return this;
    }

    public WorkspaceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WorkspaceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WorkspaceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public WorkspaceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public WorkspaceImpl withProvisioningState(WorkspaceEntityStatus provisioningState) {
        if (isInCreateMode()) {
            this.innerModel().withProvisioningState(provisioningState);
            return this;
        } else {
            this.updateParameters.withProvisioningState(provisioningState);
            return this;
        }
    }

    public WorkspaceImpl withSku(WorkspaceSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public WorkspaceImpl withRetentionInDays(Integer retentionInDays) {
        if (isInCreateMode()) {
            this.innerModel().withRetentionInDays(retentionInDays);
            return this;
        } else {
            this.updateParameters.withRetentionInDays(retentionInDays);
            return this;
        }
    }

    public WorkspaceImpl withWorkspaceCapping(WorkspaceCapping workspaceCapping) {
        if (isInCreateMode()) {
            this.innerModel().withWorkspaceCapping(workspaceCapping);
            return this;
        } else {
            this.updateParameters.withWorkspaceCapping(workspaceCapping);
            return this;
        }
    }

    public WorkspaceImpl withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccessForIngestion(publicNetworkAccessForIngestion);
            return this;
        } else {
            this.updateParameters.withPublicNetworkAccessForIngestion(publicNetworkAccessForIngestion);
            return this;
        }
    }

    public WorkspaceImpl withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccessForQuery(publicNetworkAccessForQuery);
            return this;
        } else {
            this.updateParameters.withPublicNetworkAccessForQuery(publicNetworkAccessForQuery);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
