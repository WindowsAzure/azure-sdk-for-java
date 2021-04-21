// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.fluent.ArtifactsClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArmTemplateInfoInner;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArtifactInner;
import com.azure.resourcemanager.devtestlabs.models.ArmTemplateInfo;
import com.azure.resourcemanager.devtestlabs.models.Artifact;
import com.azure.resourcemanager.devtestlabs.models.Artifacts;
import com.azure.resourcemanager.devtestlabs.models.GenerateArmTemplateRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ArtifactsImpl implements Artifacts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ArtifactsImpl.class);

    private final ArtifactsClient innerClient;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public ArtifactsImpl(
        ArtifactsClient innerClient, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Artifact> list(String resourceGroupName, String labName, String artifactSourceName) {
        PagedIterable<ArtifactInner> inner = this.serviceClient().list(resourceGroupName, labName, artifactSourceName);
        return Utils.mapPage(inner, inner1 -> new ArtifactImpl(inner1, this.manager()));
    }

    public PagedIterable<Artifact> list(
        String resourceGroupName,
        String labName,
        String artifactSourceName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        PagedIterable<ArtifactInner> inner =
            this
                .serviceClient()
                .list(resourceGroupName, labName, artifactSourceName, expand, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new ArtifactImpl(inner1, this.manager()));
    }

    public Artifact get(String resourceGroupName, String labName, String artifactSourceName, String name) {
        ArtifactInner inner = this.serviceClient().get(resourceGroupName, labName, artifactSourceName, name);
        if (inner != null) {
            return new ArtifactImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Artifact> getWithResponse(
        String resourceGroupName,
        String labName,
        String artifactSourceName,
        String name,
        String expand,
        Context context) {
        Response<ArtifactInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, labName, artifactSourceName, name, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ArtifactImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ArmTemplateInfo generateArmTemplate(
        String resourceGroupName,
        String labName,
        String artifactSourceName,
        String name,
        GenerateArmTemplateRequest generateArmTemplateRequest) {
        ArmTemplateInfoInner inner =
            this
                .serviceClient()
                .generateArmTemplate(resourceGroupName, labName, artifactSourceName, name, generateArmTemplateRequest);
        if (inner != null) {
            return new ArmTemplateInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ArmTemplateInfo> generateArmTemplateWithResponse(
        String resourceGroupName,
        String labName,
        String artifactSourceName,
        String name,
        GenerateArmTemplateRequest generateArmTemplateRequest,
        Context context) {
        Response<ArmTemplateInfoInner> inner =
            this
                .serviceClient()
                .generateArmTemplateWithResponse(
                    resourceGroupName, labName, artifactSourceName, name, generateArmTemplateRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ArmTemplateInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ArtifactsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }
}
