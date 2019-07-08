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
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.RecoveryPoints;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.RecoveryPoint;

class RecoveryPointsImpl extends WrapperImpl<RecoveryPointsInner> implements RecoveryPoints {
    private final RecoveryServicesManager manager;

    RecoveryPointsImpl(RecoveryServicesManager manager) {
        super(manager.inner().recoveryPoints());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private RecoveryPointImpl wrapModel(RecoveryPointInner inner) {
        return  new RecoveryPointImpl(inner, manager());
    }

    @Override
    public Observable<RecoveryPoint> listByReplicationProtectedItemsAsync(final String fabricName, final String protectionContainerName, final String replicatedProtectedItemName) {
        RecoveryPointsInner client = this.inner();
        return client.listByReplicationProtectedItemsAsync(fabricName, protectionContainerName, replicatedProtectedItemName)
        .flatMapIterable(new Func1<Page<RecoveryPointInner>, Iterable<RecoveryPointInner>>() {
            @Override
            public Iterable<RecoveryPointInner> call(Page<RecoveryPointInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecoveryPointInner, RecoveryPoint>() {
            @Override
            public RecoveryPoint call(RecoveryPointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<RecoveryPoint> getAsync(String fabricName, String protectionContainerName, String replicatedProtectedItemName, String recoveryPointName) {
        RecoveryPointsInner client = this.inner();
        return client.getAsync(fabricName, protectionContainerName, replicatedProtectedItemName, recoveryPointName)
        .map(new Func1<RecoveryPointInner, RecoveryPoint>() {
            @Override
            public RecoveryPoint call(RecoveryPointInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
