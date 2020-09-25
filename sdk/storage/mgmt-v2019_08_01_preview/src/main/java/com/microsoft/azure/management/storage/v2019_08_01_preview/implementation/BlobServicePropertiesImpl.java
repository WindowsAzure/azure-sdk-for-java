/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import com.microsoft.azure.management.storage.v2019_08_01_preview.BlobServiceProperties;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.storage.v2019_08_01_preview.CorsRules;
import com.microsoft.azure.management.storage.v2019_08_01_preview.DeleteRetentionPolicy;
import com.microsoft.azure.management.storage.v2019_08_01_preview.ChangeFeed;
import com.microsoft.azure.management.storage.v2019_08_01_preview.RestorePolicyProperties;

class BlobServicePropertiesImpl extends CreatableUpdatableImpl<BlobServiceProperties, BlobServicePropertiesInner, BlobServicePropertiesImpl> implements BlobServiceProperties, BlobServiceProperties.Definition, BlobServiceProperties.Update {
    private final StorageManager manager;
    private String resourceGroupName;
    private String accountName;

    BlobServicePropertiesImpl(String name, StorageManager manager) {
        super(name, new BlobServicePropertiesInner());
        this.manager = manager;
        // Set resource name
        this.accountName = name;
        //
    }

    BlobServicePropertiesImpl(BlobServicePropertiesInner inner, StorageManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.accountName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageAccounts");
        //
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BlobServiceProperties> createResourceAsync() {
        BlobServicesInner client = this.manager().inner().blobServices();
        return client.setServicePropertiesAsync(this.resourceGroupName, this.accountName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BlobServiceProperties> updateResourceAsync() {
        BlobServicesInner client = this.manager().inner().blobServices();
        return client.setServicePropertiesAsync(this.resourceGroupName, this.accountName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BlobServicePropertiesInner> getInnerAsync() {
        BlobServicesInner client = this.manager().inner().blobServices();
        return client.getServicePropertiesAsync(this.resourceGroupName, this.accountName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Boolean automaticSnapshotPolicyEnabled() {
        return this.inner().automaticSnapshotPolicyEnabled();
    }

    @Override
    public ChangeFeed changeFeed() {
        return this.inner().changeFeed();
    }

    @Override
    public DeleteRetentionPolicy containerDeleteRetentionPolicy() {
        return this.inner().containerDeleteRetentionPolicy();
    }

    @Override
    public CorsRules cors() {
        return this.inner().cors();
    }

    @Override
    public String defaultServiceVersion() {
        return this.inner().defaultServiceVersion();
    }

    @Override
    public DeleteRetentionPolicy deleteRetentionPolicy() {
        return this.inner().deleteRetentionPolicy();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isVersioningEnabled() {
        return this.inner().isVersioningEnabled();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public RestorePolicyProperties restorePolicy() {
        return this.inner().restorePolicy();
    }

    @Override
    public SkuInner sku() {
        return this.inner().sku();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public BlobServicePropertiesImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public BlobServicePropertiesImpl withAutomaticSnapshotPolicyEnabled(Boolean automaticSnapshotPolicyEnabled) {
        this.inner().withAutomaticSnapshotPolicyEnabled(automaticSnapshotPolicyEnabled);
        return this;
    }

    @Override
    public BlobServicePropertiesImpl withChangeFeed(ChangeFeed changeFeed) {
        this.inner().withChangeFeed(changeFeed);
        return this;
    }

    @Override
    public BlobServicePropertiesImpl withContainerDeleteRetentionPolicy(DeleteRetentionPolicy containerDeleteRetentionPolicy) {
        this.inner().withContainerDeleteRetentionPolicy(containerDeleteRetentionPolicy);
        return this;
    }

    @Override
    public BlobServicePropertiesImpl withCors(CorsRules cors) {
        this.inner().withCors(cors);
        return this;
    }

    @Override
    public BlobServicePropertiesImpl withDefaultServiceVersion(String defaultServiceVersion) {
        this.inner().withDefaultServiceVersion(defaultServiceVersion);
        return this;
    }

    @Override
    public BlobServicePropertiesImpl withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy) {
        this.inner().withDeleteRetentionPolicy(deleteRetentionPolicy);
        return this;
    }

    @Override
    public BlobServicePropertiesImpl withIsVersioningEnabled(Boolean isVersioningEnabled) {
        this.inner().withIsVersioningEnabled(isVersioningEnabled);
        return this;
    }

    @Override
    public BlobServicePropertiesImpl withRestorePolicy(RestorePolicyProperties restorePolicy) {
        this.inner().withRestorePolicy(restorePolicy);
        return this;
    }

}
