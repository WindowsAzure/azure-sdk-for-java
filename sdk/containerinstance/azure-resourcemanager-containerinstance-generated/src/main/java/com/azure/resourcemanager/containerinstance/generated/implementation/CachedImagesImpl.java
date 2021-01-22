// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.implementation;

import com.azure.resourcemanager.containerinstance.generated.ContainerInstanceManager;
import com.azure.resourcemanager.containerinstance.generated.fluent.models.CachedImagesInner;
import com.azure.resourcemanager.containerinstance.generated.models.CachedImages;

public final class CachedImagesImpl implements CachedImages {
    private CachedImagesInner innerObject;

    private final ContainerInstanceManager serviceManager;

    CachedImagesImpl(CachedImagesInner innerObject, ContainerInstanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String osType() {
        return this.innerModel().osType();
    }

    public String image() {
        return this.innerModel().image();
    }

    public CachedImagesInner innerModel() {
        return this.innerObject;
    }

    private ContainerInstanceManager manager() {
        return this.serviceManager;
    }
}
