// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.resourcemanager.customerinsights.fluent.models.ImageDefinitionInner;
import com.azure.resourcemanager.customerinsights.models.ImageDefinition;

public final class ImageDefinitionImpl implements ImageDefinition {
    private ImageDefinitionInner innerObject;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    ImageDefinitionImpl(
        ImageDefinitionInner innerObject,
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean imageExists() {
        return this.innerModel().imageExists();
    }

    public String contentUrl() {
        return this.innerModel().contentUrl();
    }

    public String relativePath() {
        return this.innerModel().relativePath();
    }

    public ImageDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }
}
