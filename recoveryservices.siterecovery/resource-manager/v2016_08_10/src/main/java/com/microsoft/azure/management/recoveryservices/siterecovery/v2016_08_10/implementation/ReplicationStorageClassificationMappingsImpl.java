/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationStorageClassificationMappings;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.StorageClassificationMapping;

class ReplicationStorageClassificationMappingsImpl extends WrapperImpl<ReplicationStorageClassificationMappingsInner> implements ReplicationStorageClassificationMappings {
    private final RecoveryServicesManager manager;

    ReplicationStorageClassificationMappingsImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationStorageClassificationMappings());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public StorageClassificationMappingImpl define(String name) {
        return wrapModel(name);
    }

    private StorageClassificationMappingImpl wrapModel(StorageClassificationMappingInner inner) {
        return  new StorageClassificationMappingImpl(inner, manager());
    }

    private StorageClassificationMappingImpl wrapModel(String name) {
        return new StorageClassificationMappingImpl(name, this.manager());
    }

    @Override
    public Observable<StorageClassificationMapping> listAsync() {
        ReplicationStorageClassificationMappingsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<StorageClassificationMappingInner>, Iterable<StorageClassificationMappingInner>>() {
            @Override
            public Iterable<StorageClassificationMappingInner> call(Page<StorageClassificationMappingInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StorageClassificationMappingInner, StorageClassificationMapping>() {
            @Override
            public StorageClassificationMapping call(StorageClassificationMappingInner inner) {
                return new StorageClassificationMappingImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<StorageClassificationMapping> listByReplicationStorageClassificationsAsync(final String fabricName, final String storageClassificationName) {
        ReplicationStorageClassificationMappingsInner client = this.inner();
        return client.listByReplicationStorageClassificationsAsync(fabricName, storageClassificationName)
        .flatMapIterable(new Func1<Page<StorageClassificationMappingInner>, Iterable<StorageClassificationMappingInner>>() {
            @Override
            public Iterable<StorageClassificationMappingInner> call(Page<StorageClassificationMappingInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StorageClassificationMappingInner, StorageClassificationMapping>() {
            @Override
            public StorageClassificationMapping call(StorageClassificationMappingInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<StorageClassificationMapping> getAsync(String fabricName, String storageClassificationName, String storageClassificationMappingName) {
        ReplicationStorageClassificationMappingsInner client = this.inner();
        return client.getAsync(fabricName, storageClassificationName, storageClassificationMappingName)
        .map(new Func1<StorageClassificationMappingInner, StorageClassificationMapping>() {
            @Override
            public StorageClassificationMapping call(StorageClassificationMappingInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String fabricName, String storageClassificationName, String storageClassificationMappingName) {
        ReplicationStorageClassificationMappingsInner client = this.inner();
        return client.deleteAsync(fabricName, storageClassificationName, storageClassificationMappingName).toCompletable();
    }

}
