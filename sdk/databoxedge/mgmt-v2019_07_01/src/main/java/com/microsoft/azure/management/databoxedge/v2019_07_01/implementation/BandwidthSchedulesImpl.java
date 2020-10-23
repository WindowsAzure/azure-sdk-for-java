/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.databoxedge.v2019_07_01.BandwidthSchedules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.databoxedge.v2019_07_01.BandwidthSchedule;

class BandwidthSchedulesImpl extends WrapperImpl<BandwidthSchedulesInner> implements BandwidthSchedules {
    private final DataBoxEdgeManager manager;

    BandwidthSchedulesImpl(DataBoxEdgeManager manager) {
        super(manager.inner().bandwidthSchedules());
        this.manager = manager;
    }

    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public BandwidthScheduleImpl define(String name) {
        return wrapModel(name);
    }

    private BandwidthScheduleImpl wrapModel(BandwidthScheduleInner inner) {
        return  new BandwidthScheduleImpl(inner, manager());
    }

    private BandwidthScheduleImpl wrapModel(String name) {
        return new BandwidthScheduleImpl(name, this.manager());
    }

    @Override
    public Observable<BandwidthSchedule> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName) {
        BandwidthSchedulesInner client = this.inner();
        return client.listByDataBoxEdgeDeviceAsync(deviceName, resourceGroupName)
        .flatMapIterable(new Func1<Page<BandwidthScheduleInner>, Iterable<BandwidthScheduleInner>>() {
            @Override
            public Iterable<BandwidthScheduleInner> call(Page<BandwidthScheduleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BandwidthScheduleInner, BandwidthSchedule>() {
            @Override
            public BandwidthSchedule call(BandwidthScheduleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<BandwidthSchedule> getAsync(String deviceName, String name, String resourceGroupName) {
        BandwidthSchedulesInner client = this.inner();
        return client.getAsync(deviceName, name, resourceGroupName)
        .flatMap(new Func1<BandwidthScheduleInner, Observable<BandwidthSchedule>>() {
            @Override
            public Observable<BandwidthSchedule> call(BandwidthScheduleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BandwidthSchedule)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String deviceName, String name, String resourceGroupName) {
        BandwidthSchedulesInner client = this.inner();
        return client.deleteAsync(deviceName, name, resourceGroupName).toCompletable();
    }

}
