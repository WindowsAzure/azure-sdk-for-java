/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationProtectableItems;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ProtectableItem;

class ReplicationProtectableItemsImpl extends WrapperImpl<ReplicationProtectableItemsInner> implements ReplicationProtectableItems {
    private final RecoveryServicesManager manager;

    ReplicationProtectableItemsImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationProtectableItems());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private ProtectableItemImpl wrapModel(ProtectableItemInner inner) {
        return  new ProtectableItemImpl(inner, manager());
    }

    @Override
    public Observable<ProtectableItem> listByReplicationProtectionContainersAsync(final String fabricName, final String protectionContainerName) {
        ReplicationProtectableItemsInner client = this.inner();
        return client.listByReplicationProtectionContainersAsync(fabricName, protectionContainerName)
        .flatMapIterable(new Func1<Page<ProtectableItemInner>, Iterable<ProtectableItemInner>>() {
            @Override
            public Iterable<ProtectableItemInner> call(Page<ProtectableItemInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProtectableItemInner, ProtectableItem>() {
            @Override
            public ProtectableItem call(ProtectableItemInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ProtectableItem> getAsync(String fabricName, String protectionContainerName, String protectableItemName) {
        ReplicationProtectableItemsInner client = this.inner();
        return client.getAsync(fabricName, protectionContainerName, protectableItemName)
        .flatMap(new Func1<ProtectableItemInner, Observable<ProtectableItem>>() {
            @Override
            public Observable<ProtectableItem> call(ProtectableItemInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ProtectableItem)wrapModel(inner));
                }
            }
       });
    }

}
