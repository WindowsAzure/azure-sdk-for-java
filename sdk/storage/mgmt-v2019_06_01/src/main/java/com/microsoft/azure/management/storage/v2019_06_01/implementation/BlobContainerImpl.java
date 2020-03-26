/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.BlobContainer;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.storage.v2019_06_01.PublicAccess;
import org.joda.time.DateTime;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseStatus;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseState;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseDuration;
import java.util.Map;
import com.microsoft.azure.management.storage.v2019_06_01.ImmutabilityPolicyProperties;
import com.microsoft.azure.management.storage.v2019_06_01.LegalHoldProperties;

class BlobContainerImpl extends CreatableUpdatableImpl<BlobContainer, BlobContainerInner, BlobContainerImpl> implements BlobContainer, BlobContainer.Definition, BlobContainer.Update {
    private final StorageManager manager;
    private String resourceGroupName;
    private String accountName;
    private String containerName;

    BlobContainerImpl(String name, StorageManager manager) {
        super(name, new BlobContainerInner());
        this.manager = manager;
        // Set resource name
        this.containerName = name;
        //
    }

    BlobContainerImpl(BlobContainerInner inner, StorageManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.containerName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageAccounts");
        this.containerName = IdParsingUtils.getValueFromIdByName(inner.id(), "containers");
        //
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BlobContainer> createResourceAsync() {
        BlobContainersInner client = this.manager().inner().blobContainers();
        return client.createAsync(this.resourceGroupName, this.accountName, this.containerName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BlobContainer> updateResourceAsync() {
        BlobContainersInner client = this.manager().inner().blobContainers();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.containerName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BlobContainerInner> getInnerAsync() {
        BlobContainersInner client = this.manager().inner().blobContainers();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String defaultEncryptionScope() {
        return this.inner().defaultEncryptionScope();
    }

    @Override
    public Boolean denyEncryptionScopeOverride() {
        return this.inner().denyEncryptionScopeOverride();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public Boolean hasImmutabilityPolicy() {
        return this.inner().hasImmutabilityPolicy();
    }

    @Override
    public Boolean hasLegalHold() {
        return this.inner().hasLegalHold();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ImmutabilityPolicyProperties immutabilityPolicy() {
        return this.inner().immutabilityPolicy();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public LeaseDuration leaseDuration() {
        return this.inner().leaseDuration();
    }

    @Override
    public LeaseState leaseState() {
        return this.inner().leaseState();
    }

    @Override
    public LeaseStatus leaseStatus() {
        return this.inner().leaseStatus();
    }

    @Override
    public LegalHoldProperties legalHold() {
        return this.inner().legalHold();
    }

    @Override
    public Map<String, String> metadata() {
        return this.inner().metadata();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PublicAccess publicAccess() {
        return this.inner().publicAccess();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public BlobContainerImpl withExistingBlobService(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public BlobContainerImpl withDefaultEncryptionScope(String defaultEncryptionScope) {
        this.inner().withDefaultEncryptionScope(defaultEncryptionScope);
        return this;
    }

    @Override
    public BlobContainerImpl withDenyEncryptionScopeOverride(Boolean denyEncryptionScopeOverride) {
        this.inner().withDenyEncryptionScopeOverride(denyEncryptionScopeOverride);
        return this;
    }

    @Override
    public BlobContainerImpl withMetadata(Map<String, String> metadata) {
        this.inner().withMetadata(metadata);
        return this;
    }

    @Override
    public BlobContainerImpl withPublicAccess(PublicAccess publicAccess) {
        this.inner().withPublicAccess(publicAccess);
        return this;
    }

}
