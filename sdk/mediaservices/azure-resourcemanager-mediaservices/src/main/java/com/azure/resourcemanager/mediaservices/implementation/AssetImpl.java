// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetInner;
import com.azure.resourcemanager.mediaservices.models.Asset;
import com.azure.resourcemanager.mediaservices.models.AssetStorageEncryptionFormat;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class AssetImpl implements Asset, Asset.Definition, Asset.Update {
    private AssetInner innerObject;

    private final MediaservicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public UUID assetId() {
        return this.innerModel().assetId();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
    }

    public String alternateId() {
        return this.innerModel().alternateId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String container() {
        return this.innerModel().container();
    }

    public String storageAccountName() {
        return this.innerModel().storageAccountName();
    }

    public AssetStorageEncryptionFormat storageEncryptionFormat() {
        return this.innerModel().storageEncryptionFormat();
    }

    public AssetInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String assetName;

    public AssetImpl withExistingMediaService(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public Asset create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAssets()
                .createOrUpdateWithResponse(resourceGroupName, accountName, assetName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Asset create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAssets()
                .createOrUpdateWithResponse(resourceGroupName, accountName, assetName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public AssetImpl(String name, MediaservicesManager serviceManager) {
        this.innerObject = new AssetInner();
        this.serviceManager = serviceManager;
        this.assetName = name;
    }

    public AssetImpl update() {
        return this;
    }

    public Asset apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAssets()
                .updateWithResponse(resourceGroupName, accountName, assetName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Asset apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAssets()
                .updateWithResponse(resourceGroupName, accountName, assetName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public AssetImpl(AssetInner innerObject, MediaservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "mediaServices");
        this.assetName = Utils.getValueFromIdByName(innerObject.id(), "assets");
    }

    public Asset refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAssets()
                .getWithResponse(resourceGroupName, accountName, assetName, Context.NONE)
                .getValue();
        return this;
    }

    public Asset refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAssets()
                .getWithResponse(resourceGroupName, accountName, assetName, context)
                .getValue();
        return this;
    }

    public AssetImpl withAlternateId(String alternateId) {
        this.innerModel().withAlternateId(alternateId);
        return this;
    }

    public AssetImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public AssetImpl withContainer(String container) {
        this.innerModel().withContainer(container);
        return this;
    }

    public AssetImpl withStorageAccountName(String storageAccountName) {
        this.innerModel().withStorageAccountName(storageAccountName);
        return this;
    }
}
