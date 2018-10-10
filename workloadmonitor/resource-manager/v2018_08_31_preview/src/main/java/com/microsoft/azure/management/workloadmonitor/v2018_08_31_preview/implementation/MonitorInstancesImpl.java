/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.MonitorInstances;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.MonitorInstance;
import java.util.UUID;

class MonitorInstancesImpl extends WrapperImpl<MonitorInstancesInner> implements MonitorInstances {
    private final WorkloadMonitorManager manager;

    MonitorInstancesImpl(WorkloadMonitorManager manager) {
        super(manager.inner().monitorInstances());
        this.manager = manager;
    }

    public WorkloadMonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<MonitorInstance> listByResourceAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName) {
        MonitorInstancesInner client = this.inner();
        return client.listByResourceAsync(resourceGroupName, resourceNamespace, resourceType, resourceName)
        .flatMapIterable(new Func1<Page<MonitorInstanceInner>, Iterable<MonitorInstanceInner>>() {
            @Override
            public Iterable<MonitorInstanceInner> call(Page<MonitorInstanceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MonitorInstanceInner, MonitorInstance>() {
            @Override
            public MonitorInstance call(MonitorInstanceInner inner) {
                return new MonitorInstanceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MonitorInstance> getAsync(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName, UUID monitorInstanceId) {
        MonitorInstancesInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceNamespace, resourceType, resourceName, monitorInstanceId)
        .map(new Func1<MonitorInstanceInner, MonitorInstance>() {
            @Override
            public MonitorInstance call(MonitorInstanceInner inner) {
                return new MonitorInstanceImpl(inner, manager());
            }
        });
    }

}
