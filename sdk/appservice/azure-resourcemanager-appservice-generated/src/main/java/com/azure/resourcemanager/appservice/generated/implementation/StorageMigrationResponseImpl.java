// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.StorageMigrationResponseInner;
import com.azure.resourcemanager.appservice.generated.models.StorageMigrationResponse;
import com.azure.resourcemanager.appservice.generated.models.SystemData;

public final class StorageMigrationResponseImpl implements StorageMigrationResponse {
    private StorageMigrationResponseInner innerObject;

    private final WebSiteManager serviceManager;

    StorageMigrationResponseImpl(StorageMigrationResponseInner innerObject, WebSiteManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String operationId() {
        return this.innerModel().operationId();
    }

    public StorageMigrationResponseInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
