// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.implementation;

import com.azure.resourcemanager.containerinstance.generated.fluent.models.ContainerAttachResponseInner;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerAttachResponse;

public final class ContainerAttachResponseImpl implements ContainerAttachResponse {
    private ContainerAttachResponseInner innerObject;

    private final com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager serviceManager;

    ContainerAttachResponseImpl(
        ContainerAttachResponseInner innerObject,
        com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String webSocketUri() {
        return this.innerModel().webSocketUri();
    }

    public String password() {
        return this.innerModel().password();
    }

    public ContainerAttachResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager manager() {
        return this.serviceManager;
    }
}
