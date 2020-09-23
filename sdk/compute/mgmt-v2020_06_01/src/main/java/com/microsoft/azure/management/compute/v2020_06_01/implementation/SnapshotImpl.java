/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2020_06_01.Snapshot;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_06_01.SnapshotUpdate;
import com.microsoft.azure.management.compute.v2020_06_01.SnapshotSku;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2020_06_01.OperatingSystemTypes;
import com.microsoft.azure.management.compute.v2020_06_01.HyperVGeneration;
import com.microsoft.azure.management.compute.v2020_06_01.CreationData;
import com.microsoft.azure.management.compute.v2020_06_01.EncryptionSettingsCollection;
import com.microsoft.azure.management.compute.v2020_06_01.Encryption;
import com.microsoft.azure.management.compute.v2020_06_01.NetworkAccessPolicy;
import rx.functions.Func1;

class SnapshotImpl extends GroupableResourceCoreImpl<Snapshot, SnapshotInner, SnapshotImpl, ComputeManager> implements Snapshot, Snapshot.Definition, Snapshot.Update {
    private SnapshotUpdate updateParameter;
    SnapshotImpl(String name, SnapshotInner inner, ComputeManager manager) {
        super(name, inner, manager);
        this.updateParameter = new SnapshotUpdate();
    }

    @Override
    public Observable<Snapshot> createResourceAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<SnapshotInner, SnapshotInner>() {
               @Override
               public SnapshotInner call(SnapshotInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Snapshot> updateResourceAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<SnapshotInner, SnapshotInner>() {
               @Override
               public SnapshotInner call(SnapshotInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SnapshotInner> getInnerAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new SnapshotUpdate();
    }

    @Override
    public CreationData creationData() {
        return this.inner().creationData();
    }

    @Override
    public String diskAccessId() {
        return this.inner().diskAccessId();
    }

    @Override
    public Long diskSizeBytes() {
        return this.inner().diskSizeBytes();
    }

    @Override
    public Integer diskSizeGB() {
        return this.inner().diskSizeGB();
    }

    @Override
    public Encryption encryption() {
        return this.inner().encryption();
    }

    @Override
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.inner().encryptionSettingsCollection();
    }

    @Override
    public HyperVGeneration hyperVGeneration() {
        return this.inner().hyperVGeneration();
    }

    @Override
    public Boolean incremental() {
        return this.inner().incremental();
    }

    @Override
    public String managedBy() {
        return this.inner().managedBy();
    }

    @Override
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.inner().networkAccessPolicy();
    }

    @Override
    public OperatingSystemTypes osType() {
        return this.inner().osType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SnapshotSku sku() {
        return this.inner().sku();
    }

    @Override
    public DateTime timeCreated() {
        return this.inner().timeCreated();
    }

    @Override
    public String uniqueId() {
        return this.inner().uniqueId();
    }

    @Override
    public SnapshotImpl withCreationData(CreationData creationData) {
        this.inner().withCreationData(creationData);
        return this;
    }

    @Override
    public SnapshotImpl withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.inner().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    @Override
    public SnapshotImpl withIncremental(Boolean incremental) {
        this.inner().withIncremental(incremental);
        return this;
    }

    @Override
    public SnapshotImpl withDiskAccessId(String diskAccessId) {
        if (isInCreateMode()) {
            this.inner().withDiskAccessId(diskAccessId);
        } else {
            this.updateParameter.withDiskAccessId(diskAccessId);
        }
        return this;
    }

    @Override
    public SnapshotImpl withDiskSizeGB(Integer diskSizeGB) {
        if (isInCreateMode()) {
            this.inner().withDiskSizeGB(diskSizeGB);
        } else {
            this.updateParameter.withDiskSizeGB(diskSizeGB);
        }
        return this;
    }

    @Override
    public SnapshotImpl withEncryption(Encryption encryption) {
        if (isInCreateMode()) {
            this.inner().withEncryption(encryption);
        } else {
            this.updateParameter.withEncryption(encryption);
        }
        return this;
    }

    @Override
    public SnapshotImpl withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        if (isInCreateMode()) {
            this.inner().withEncryptionSettingsCollection(encryptionSettingsCollection);
        } else {
            this.updateParameter.withEncryptionSettingsCollection(encryptionSettingsCollection);
        }
        return this;
    }

    @Override
    public SnapshotImpl withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        if (isInCreateMode()) {
            this.inner().withNetworkAccessPolicy(networkAccessPolicy);
        } else {
            this.updateParameter.withNetworkAccessPolicy(networkAccessPolicy);
        }
        return this;
    }

    @Override
    public SnapshotImpl withOsType(OperatingSystemTypes osType) {
        if (isInCreateMode()) {
            this.inner().withOsType(osType);
        } else {
            this.updateParameter.withOsType(osType);
        }
        return this;
    }

    @Override
    public SnapshotImpl withSku(SnapshotSku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

}
