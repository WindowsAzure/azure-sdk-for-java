/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.netapp.v2019_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.netapp.v2019_06_01.Volumes;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.netapp.v2019_06_01.Volume;

class VolumesImpl extends WrapperImpl<VolumesInner> implements Volumes {
    private final NetAppManager manager;

    VolumesImpl(NetAppManager manager) {
        super(manager.inner().volumes());
        this.manager = manager;
    }

    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public VolumeImpl define(String name) {
        return wrapModel(name);
    }

    private VolumeImpl wrapModel(VolumeInner inner) {
        return  new VolumeImpl(inner, manager());
    }

    private VolumeImpl wrapModel(String name) {
        return new VolumeImpl(name, this.manager());
    }

    @Override
    public Observable<Volume> listAsync(String resourceGroupName, String accountName, String poolName) {
        VolumesInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName, poolName)
        .flatMap(new Func1<List<VolumeInner>, Observable<VolumeInner>>() {
            @Override
            public Observable<VolumeInner> call(List<VolumeInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VolumeInner, Volume>() {
            @Override
            public Volume call(VolumeInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Volume> getAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, poolName, volumeName)
        .flatMap(new Func1<VolumeInner, Observable<Volume>>() {
            @Override
            public Observable<Volume> call(VolumeInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Volume)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String poolName, String volumeName) {
        VolumesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, poolName, volumeName).toCompletable();
    }

}
