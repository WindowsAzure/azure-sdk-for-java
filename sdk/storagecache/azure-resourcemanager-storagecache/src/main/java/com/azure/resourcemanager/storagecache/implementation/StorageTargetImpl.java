// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagecache.fluent.models.StorageTargetInner;
import com.azure.resourcemanager.storagecache.models.BlobNfsTarget;
import com.azure.resourcemanager.storagecache.models.ClfsTarget;
import com.azure.resourcemanager.storagecache.models.NamespaceJunction;
import com.azure.resourcemanager.storagecache.models.Nfs3Target;
import com.azure.resourcemanager.storagecache.models.ProvisioningStateType;
import com.azure.resourcemanager.storagecache.models.StorageTarget;
import com.azure.resourcemanager.storagecache.models.StorageTargetType;
import com.azure.resourcemanager.storagecache.models.SystemData;
import com.azure.resourcemanager.storagecache.models.UnknownTarget;
import java.util.Collections;
import java.util.List;

public final class StorageTargetImpl implements StorageTarget, StorageTarget.Definition, StorageTarget.Update {
    private StorageTargetInner innerObject;

    private final com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<NamespaceJunction> junctions() {
        List<NamespaceJunction> inner = this.innerModel().junctions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StorageTargetType targetType() {
        return this.innerModel().targetType();
    }

    public ProvisioningStateType provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Nfs3Target nfs3() {
        return this.innerModel().nfs3();
    }

    public ClfsTarget clfs() {
        return this.innerModel().clfs();
    }

    public UnknownTarget unknown() {
        return this.innerModel().unknown();
    }

    public BlobNfsTarget blobNfs() {
        return this.innerModel().blobNfs();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public StorageTargetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storagecache.StorageCacheManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String cacheName;

    private String storageTargetName;

    public StorageTargetImpl withExistingCache(String resourceGroupName, String cacheName) {
        this.resourceGroupName = resourceGroupName;
        this.cacheName = cacheName;
        return this;
    }

    public StorageTarget create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageTargets()
                .createOrUpdate(resourceGroupName, cacheName, storageTargetName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageTarget create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageTargets()
                .createOrUpdate(resourceGroupName, cacheName, storageTargetName, this.innerModel(), context);
        return this;
    }

    StorageTargetImpl(String name, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerObject = new StorageTargetInner();
        this.serviceManager = serviceManager;
        this.storageTargetName = name;
    }

    public StorageTargetImpl update() {
        return this;
    }

    public StorageTarget apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageTargets()
                .createOrUpdate(resourceGroupName, cacheName, storageTargetName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageTarget apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageTargets()
                .createOrUpdate(resourceGroupName, cacheName, storageTargetName, this.innerModel(), context);
        return this;
    }

    StorageTargetImpl(
        StorageTargetInner innerObject, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.cacheName = Utils.getValueFromIdByName(innerObject.id(), "caches");
        this.storageTargetName = Utils.getValueFromIdByName(innerObject.id(), "storageTargets");
    }

    public StorageTarget refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageTargets()
                .getWithResponse(resourceGroupName, cacheName, storageTargetName, Context.NONE)
                .getValue();
        return this;
    }

    public StorageTarget refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageTargets()
                .getWithResponse(resourceGroupName, cacheName, storageTargetName, context)
                .getValue();
        return this;
    }

    public void dnsRefresh() {
        serviceManager.storageTargets().dnsRefresh(resourceGroupName, cacheName, storageTargetName);
    }

    public void dnsRefresh(Context context) {
        serviceManager.storageTargets().dnsRefresh(resourceGroupName, cacheName, storageTargetName, context);
    }

    public StorageTargetImpl withJunctions(List<NamespaceJunction> junctions) {
        this.innerModel().withJunctions(junctions);
        return this;
    }

    public StorageTargetImpl withTargetType(StorageTargetType targetType) {
        this.innerModel().withTargetType(targetType);
        return this;
    }

    public StorageTargetImpl withProvisioningState(ProvisioningStateType provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }

    public StorageTargetImpl withNfs3(Nfs3Target nfs3) {
        this.innerModel().withNfs3(nfs3);
        return this;
    }

    public StorageTargetImpl withClfs(ClfsTarget clfs) {
        this.innerModel().withClfs(clfs);
        return this;
    }

    public StorageTargetImpl withUnknown(UnknownTarget unknown) {
        this.innerModel().withUnknown(unknown);
        return this;
    }

    public StorageTargetImpl withBlobNfs(BlobNfsTarget blobNfs) {
        this.innerModel().withBlobNfs(blobNfs);
        return this;
    }
}
