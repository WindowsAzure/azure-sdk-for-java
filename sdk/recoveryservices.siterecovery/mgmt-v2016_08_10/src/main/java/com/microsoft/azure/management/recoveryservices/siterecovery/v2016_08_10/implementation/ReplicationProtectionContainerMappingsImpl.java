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
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationProtectionContainerMappings;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ProtectionContainerMapping;

class ReplicationProtectionContainerMappingsImpl extends WrapperImpl<ReplicationProtectionContainerMappingsInner> implements ReplicationProtectionContainerMappings {
    private final RecoveryServicesManager manager;

    ReplicationProtectionContainerMappingsImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationProtectionContainerMappings());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public ProtectionContainerMappingImpl define(String name) {
        return wrapModel(name);
    }

    private ProtectionContainerMappingImpl wrapModel(ProtectionContainerMappingInner inner) {
        return  new ProtectionContainerMappingImpl(inner, manager());
    }

    private ProtectionContainerMappingImpl wrapModel(String name) {
        return new ProtectionContainerMappingImpl(name, this.manager());
    }

    @Override
    public Completable deleteAsync(String fabricName, String protectionContainerName, String mappingName) {
        ReplicationProtectionContainerMappingsInner client = this.inner();
        return client.deleteAsync(fabricName, protectionContainerName, mappingName).toCompletable();
    }

    @Override
    public Observable<ProtectionContainerMapping> listAsync() {
        ReplicationProtectionContainerMappingsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ProtectionContainerMappingInner>, Iterable<ProtectionContainerMappingInner>>() {
            @Override
            public Iterable<ProtectionContainerMappingInner> call(Page<ProtectionContainerMappingInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProtectionContainerMappingInner, ProtectionContainerMapping>() {
            @Override
            public ProtectionContainerMapping call(ProtectionContainerMappingInner inner) {
                return new ProtectionContainerMappingImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProtectionContainerMapping> listByReplicationProtectionContainersAsync(final String fabricName, final String protectionContainerName) {
        ReplicationProtectionContainerMappingsInner client = this.inner();
        return client.listByReplicationProtectionContainersAsync(fabricName, protectionContainerName)
        .flatMapIterable(new Func1<Page<ProtectionContainerMappingInner>, Iterable<ProtectionContainerMappingInner>>() {
            @Override
            public Iterable<ProtectionContainerMappingInner> call(Page<ProtectionContainerMappingInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProtectionContainerMappingInner, ProtectionContainerMapping>() {
            @Override
            public ProtectionContainerMapping call(ProtectionContainerMappingInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ProtectionContainerMapping> getAsync(String fabricName, String protectionContainerName, String mappingName) {
        ReplicationProtectionContainerMappingsInner client = this.inner();
        return client.getAsync(fabricName, protectionContainerName, mappingName)
        .flatMap(new Func1<ProtectionContainerMappingInner, Observable<ProtectionContainerMapping>>() {
            @Override
            public Observable<ProtectionContainerMapping> call(ProtectionContainerMappingInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ProtectionContainerMapping)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable purgeAsync(String fabricName, String protectionContainerName, String mappingName) {
        ReplicationProtectionContainerMappingsInner client = this.inner();
        return client.purgeAsync(fabricName, protectionContainerName, mappingName).toCompletable();
    }

}
