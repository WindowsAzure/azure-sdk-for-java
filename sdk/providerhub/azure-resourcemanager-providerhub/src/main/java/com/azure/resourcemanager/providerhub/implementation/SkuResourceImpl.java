// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.ProviderhubManager;
import com.azure.resourcemanager.providerhub.fluent.models.SkuResourceInner;
import com.azure.resourcemanager.providerhub.models.ResourceTypeSku;
import com.azure.resourcemanager.providerhub.models.SkuResource;
import com.azure.resourcemanager.providerhub.models.SkuSetting;
import java.util.List;

public final class SkuResourceImpl implements SkuResource, SkuResource.Definition, SkuResource.Update {
    private SkuResourceInner innerObject;

    private final ProviderhubManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ResourceTypeSku properties() {
        return this.innerModel().properties();
    }

    public SkuResourceInner innerModel() {
        return this.innerObject;
    }

    private ProviderhubManager manager() {
        return this.serviceManager;
    }

    private String providerNamespace;

    private String resourceType;

    private String sku;

    private ResourceTypeSku createProperties;

    private ResourceTypeSku updateProperties;

    public SkuResourceImpl withExistingResourcetypeRegistration(String providerNamespace, String resourceType) {
        this.providerNamespace = providerNamespace;
        this.resourceType = resourceType;
        return this;
    }

    public SkuResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSkus()
                .createOrUpdateWithResponse(providerNamespace, resourceType, sku, createProperties, Context.NONE)
                .getValue();
        return this;
    }

    public SkuResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSkus()
                .createOrUpdateWithResponse(providerNamespace, resourceType, sku, createProperties, context)
                .getValue();
        return this;
    }

    SkuResourceImpl(String name, ProviderhubManager serviceManager) {
        this.innerObject = new SkuResourceInner();
        this.serviceManager = serviceManager;
        this.sku = name;
        this.createProperties = new ResourceTypeSku();
    }

    public SkuResourceImpl update() {
        this.updateProperties = new ResourceTypeSku();
        return this;
    }

    public SkuResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSkus()
                .createOrUpdateWithResponse(providerNamespace, resourceType, sku, updateProperties, Context.NONE)
                .getValue();
        return this;
    }

    public SkuResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSkus()
                .createOrUpdateWithResponse(providerNamespace, resourceType, sku, updateProperties, context)
                .getValue();
        return this;
    }

    SkuResourceImpl(SkuResourceInner innerObject, ProviderhubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.providerNamespace = Utils.getValueFromIdByName(innerObject.id(), "providerRegistrations");
        this.resourceType = Utils.getValueFromIdByName(innerObject.id(), "resourcetypeRegistrations");
        this.sku = Utils.getValueFromIdByName(innerObject.id(), "skus");
    }

    public SkuResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSkus()
                .getWithResponse(providerNamespace, resourceType, sku, Context.NONE)
                .getValue();
        return this;
    }

    public SkuResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSkus()
                .getWithResponse(providerNamespace, resourceType, sku, context)
                .getValue();
        return this;
    }

    public SkuResourceImpl withSkuSettings(List<SkuSetting> skuSettings) {
        if (isInCreateMode()) {
            this.createProperties.withSkuSettings(skuSettings);
            return this;
        } else {
            this.updateProperties.withSkuSettings(skuSettings);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
