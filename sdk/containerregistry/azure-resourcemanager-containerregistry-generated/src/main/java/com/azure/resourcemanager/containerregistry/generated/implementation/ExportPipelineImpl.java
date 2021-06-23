// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.ExportPipelineInner;
import com.azure.resourcemanager.containerregistry.generated.models.ExportPipeline;
import com.azure.resourcemanager.containerregistry.generated.models.ExportPipelineTargetProperties;
import com.azure.resourcemanager.containerregistry.generated.models.IdentityProperties;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineOptions;
import com.azure.resourcemanager.containerregistry.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class ExportPipelineImpl implements ExportPipeline, ExportPipeline.Definition {
    private ExportPipelineInner innerObject;

    private final com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager;

    ExportPipelineImpl(
        ExportPipelineInner innerObject,
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

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

    public IdentityProperties identity() {
        return this.innerModel().identity();
    }

    public ExportPipelineTargetProperties target() {
        return this.innerModel().target();
    }

    public List<PipelineOptions> options() {
        List<PipelineOptions> inner = this.innerModel().options();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ExportPipelineInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String registryName;

    private String exportPipelineName;

    public ExportPipelineImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    public ExportPipeline create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExportPipelines()
                .create(resourceGroupName, registryName, exportPipelineName, this.innerModel(), Context.NONE);
        return this;
    }

    public ExportPipeline create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExportPipelines()
                .create(resourceGroupName, registryName, exportPipelineName, this.innerModel(), context);
        return this;
    }

    ExportPipelineImpl(
        String name, com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerObject = new ExportPipelineInner();
        this.serviceManager = serviceManager;
        this.exportPipelineName = name;
    }

    public ExportPipeline refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExportPipelines()
                .getWithResponse(resourceGroupName, registryName, exportPipelineName, Context.NONE)
                .getValue();
        return this;
    }

    public ExportPipeline refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExportPipelines()
                .getWithResponse(resourceGroupName, registryName, exportPipelineName, context)
                .getValue();
        return this;
    }

    public ExportPipelineImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ExportPipelineImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ExportPipelineImpl withIdentity(IdentityProperties identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public ExportPipelineImpl withTarget(ExportPipelineTargetProperties target) {
        this.innerModel().withTarget(target);
        return this;
    }

    public ExportPipelineImpl withOptions(List<PipelineOptions> options) {
        this.innerModel().withOptions(options);
        return this;
    }
}
