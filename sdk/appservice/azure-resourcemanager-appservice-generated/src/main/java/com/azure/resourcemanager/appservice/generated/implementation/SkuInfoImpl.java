// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.SkuInfoInner;
import com.azure.resourcemanager.appservice.generated.models.SkuCapacity;
import com.azure.resourcemanager.appservice.generated.models.SkuDescription;
import com.azure.resourcemanager.appservice.generated.models.SkuInfo;

public final class SkuInfoImpl implements SkuInfo {
    private SkuInfoInner innerObject;

    private final WebSiteManager serviceManager;

    SkuInfoImpl(SkuInfoInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public SkuDescription sku() {
        return this.innerModel().sku();
    }

    public SkuCapacity capacity() {
        return this.innerModel().capacity();
    }

    public SkuInfoInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
