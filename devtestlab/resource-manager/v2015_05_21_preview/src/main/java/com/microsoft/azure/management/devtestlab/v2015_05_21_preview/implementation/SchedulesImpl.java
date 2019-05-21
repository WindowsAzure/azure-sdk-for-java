/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.Schedules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.Schedule;

class SchedulesImpl extends WrapperImpl<SchedulesInner> implements Schedules {
    private final DevTestLabManager manager;

    SchedulesImpl(DevTestLabManager manager) {
        super(manager.inner().schedules());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public ScheduleImpl define(String name) {
        return wrapModel(name);
    }

    private ScheduleImpl wrapModel(ScheduleInner inner) {
        return  new ScheduleImpl(inner, manager());
    }

    private ScheduleImpl wrapModel(String name) {
        return new ScheduleImpl(name, this.manager());
    }

    @Override
    public Completable executeAsync(String resourceGroupName, String labName, String name) {
        SchedulesInner client = this.inner();
        return client.executeAsync(resourceGroupName, labName, name).toCompletable();
    }

    @Override
    public Observable<Schedule> listAsync(final String resourceGroupName, final String labName) {
        SchedulesInner client = this.inner();
        return client.listAsync(resourceGroupName, labName)
        .flatMapIterable(new Func1<Page<ScheduleInner>, Iterable<ScheduleInner>>() {
            @Override
            public Iterable<ScheduleInner> call(Page<ScheduleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ScheduleInner, Schedule>() {
            @Override
            public Schedule call(ScheduleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Schedule> getResourceAsync(String resourceGroupName, String labName, String name) {
        SchedulesInner client = this.inner();
        return client.getResourceAsync(resourceGroupName, labName, name)
        .map(new Func1<ScheduleInner, Schedule>() {
            @Override
            public Schedule call(ScheduleInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteResourceAsync(String resourceGroupName, String labName, String name) {
        SchedulesInner client = this.inner();
        return client.deleteResourceAsync(resourceGroupName, labName, name).toCompletable();
    }

}
