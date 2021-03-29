// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.ContentTypeContractInner;
import com.azure.resourcemanager.apimanagement.models.ContentTypeContract;

public final class ContentTypeContractImpl implements ContentTypeContract {
    private ContentTypeContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    ContentTypeContractImpl(
        ContentTypeContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
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

    public String idPropertiesId() {
        return this.innerModel().idPropertiesId();
    }

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Object schema() {
        return this.innerModel().schema();
    }

    public String version() {
        return this.innerModel().version();
    }

    public ContentTypeContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
