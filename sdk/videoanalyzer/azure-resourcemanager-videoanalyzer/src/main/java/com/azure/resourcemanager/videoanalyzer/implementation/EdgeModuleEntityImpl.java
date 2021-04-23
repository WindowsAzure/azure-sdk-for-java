// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.videoanalyzer.fluent.models.EdgeModuleEntityInner;
import com.azure.resourcemanager.videoanalyzer.models.EdgeModuleEntity;
import com.azure.resourcemanager.videoanalyzer.models.EdgeModuleProvisioningToken;
import com.azure.resourcemanager.videoanalyzer.models.ListProvisioningTokenInput;
import java.util.UUID;

public final class EdgeModuleEntityImpl
    implements EdgeModuleEntity, EdgeModuleEntity.Definition, EdgeModuleEntity.Update {
    private EdgeModuleEntityInner innerObject;

    private final com.azure.resourcemanager.videoanalyzer.VideoanalyzerManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public UUID edgeModuleId() {
        return this.innerModel().edgeModuleId();
    }

    public EdgeModuleEntityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoanalyzerManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String edgeModuleName;

    public EdgeModuleEntityImpl withExistingVideoAnalyzer(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public EdgeModuleEntity create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEdgeModules()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, edgeModuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public EdgeModuleEntity create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEdgeModules()
                .createOrUpdateWithResponse(resourceGroupName, accountName, edgeModuleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    EdgeModuleEntityImpl(String name, com.azure.resourcemanager.videoanalyzer.VideoanalyzerManager serviceManager) {
        this.innerObject = new EdgeModuleEntityInner();
        this.serviceManager = serviceManager;
        this.edgeModuleName = name;
    }

    public EdgeModuleEntityImpl update() {
        return this;
    }

    public EdgeModuleEntity apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEdgeModules()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, edgeModuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public EdgeModuleEntity apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEdgeModules()
                .createOrUpdateWithResponse(resourceGroupName, accountName, edgeModuleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    EdgeModuleEntityImpl(
        EdgeModuleEntityInner innerObject,
        com.azure.resourcemanager.videoanalyzer.VideoanalyzerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "videoAnalyzers");
        this.edgeModuleName = Utils.getValueFromIdByName(innerObject.id(), "edgeModules");
    }

    public EdgeModuleEntity refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEdgeModules()
                .getWithResponse(resourceGroupName, accountName, edgeModuleName, Context.NONE)
                .getValue();
        return this;
    }

    public EdgeModuleEntity refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEdgeModules()
                .getWithResponse(resourceGroupName, accountName, edgeModuleName, context)
                .getValue();
        return this;
    }

    public EdgeModuleProvisioningToken listProvisioningToken(ListProvisioningTokenInput parameters) {
        return serviceManager
            .edgeModules()
            .listProvisioningToken(resourceGroupName, accountName, edgeModuleName, parameters);
    }

    public Response<EdgeModuleProvisioningToken> listProvisioningTokenWithResponse(
        ListProvisioningTokenInput parameters, Context context) {
        return serviceManager
            .edgeModules()
            .listProvisioningTokenWithResponse(resourceGroupName, accountName, edgeModuleName, parameters, context);
    }
}
