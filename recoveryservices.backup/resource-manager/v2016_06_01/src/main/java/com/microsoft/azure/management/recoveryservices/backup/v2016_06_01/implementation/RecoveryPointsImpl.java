/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.RecoveryPoints;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.RecoveryPointResource;

class RecoveryPointsImpl extends WrapperImpl<RecoveryPointsInner> implements RecoveryPoints {
    private final RecoveryServicesManager manager;

    RecoveryPointsImpl(RecoveryServicesManager manager) {
        super(manager.inner().recoveryPoints());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private RecoveryPointResourceImpl wrapModel(RecoveryPointResourceInner inner) {
        return  new RecoveryPointResourceImpl(inner, manager());
    }

    @Override
    public Observable<RecoveryPointResource> listAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName) {
        RecoveryPointsInner client = this.inner();
        return client.listAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName)
        .flatMap(new Func1<List<RecoveryPointResourceInner>, Observable<RecoveryPointResourceInner>>() {
            @Override
            public Observable<RecoveryPointResourceInner> call(List<RecoveryPointResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<RecoveryPointResourceInner, RecoveryPointResource>() {
            @Override
            public RecoveryPointResource call(RecoveryPointResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<RecoveryPointResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId) {
        RecoveryPointsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId)
        .map(new Func1<RecoveryPointResourceInner, RecoveryPointResource>() {
            @Override
            public RecoveryPointResource call(RecoveryPointResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
