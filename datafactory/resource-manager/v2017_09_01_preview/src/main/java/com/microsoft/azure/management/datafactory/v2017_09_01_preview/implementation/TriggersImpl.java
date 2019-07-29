/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.Triggers;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.TriggerResource;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.TriggerRun;

class TriggersImpl extends WrapperImpl<TriggersInner> implements Triggers {
    private final DataFactoryManager manager;

    TriggersImpl(DataFactoryManager manager) {
        super(manager.inner().triggers());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public TriggerResourceImpl define(String name) {
        return wrapModel(name);
    }

    private TriggerResourceImpl wrapModel(TriggerResourceInner inner) {
        return  new TriggerResourceImpl(inner, manager());
    }

    private TriggerResourceImpl wrapModel(String name) {
        return new TriggerResourceImpl(name, this.manager());
    }

    @Override
    public Completable startAsync(String resourceGroupName, String factoryName, String triggerName) {
        TriggersInner client = this.inner();
        return client.startAsync(resourceGroupName, factoryName, triggerName).toCompletable();
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String factoryName, String triggerName) {
        TriggersInner client = this.inner();
        return client.stopAsync(resourceGroupName, factoryName, triggerName).toCompletable();
    }

    @Override
    public Observable<TriggerResource> listByFactoryAsync(final String resourceGroupName, final String factoryName) {
        TriggersInner client = this.inner();
        return client.listByFactoryAsync(resourceGroupName, factoryName)
        .flatMapIterable(new Func1<Page<TriggerResourceInner>, Iterable<TriggerResourceInner>>() {
            @Override
            public Iterable<TriggerResourceInner> call(Page<TriggerResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TriggerResourceInner, TriggerResource>() {
            @Override
            public TriggerResource call(TriggerResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<TriggerResource> getAsync(String resourceGroupName, String factoryName, String triggerName) {
        TriggersInner client = this.inner();
        return client.getAsync(resourceGroupName, factoryName, triggerName)
        .map(new Func1<TriggerResourceInner, TriggerResource>() {
            @Override
            public TriggerResource call(TriggerResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String factoryName, String triggerName) {
        TriggersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, factoryName, triggerName).toCompletable();
    }

    private TriggerRunImpl wrapTriggerRunModel(TriggerRunInner inner) {
        return  new TriggerRunImpl(inner, manager());
    }

    @Override
    public Observable<TriggerRun> listRunsAsync(final String resourceGroupName, final String factoryName, final String triggerName, final DateTime startTime, final DateTime endTime) {
        TriggersInner client = this.inner();
        return client.listRunsAsync(resourceGroupName, factoryName, triggerName, startTime, endTime)
        .flatMapIterable(new Func1<Page<TriggerRunInner>, Iterable<TriggerRunInner>>() {
            @Override
            public Iterable<TriggerRunInner> call(Page<TriggerRunInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TriggerRunInner, TriggerRun>() {
            @Override
            public TriggerRun call(TriggerRunInner inner) {
                return wrapTriggerRunModel(inner);
            }
        });
    }

}
