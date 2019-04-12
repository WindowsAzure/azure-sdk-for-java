/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.servicebus.v2017_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.servicebus.v2017_04_01.MigrationConfigs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.servicebus.v2017_04_01.MigrationConfigProperties;

class MigrationConfigsImpl extends WrapperImpl<MigrationConfigsInner> implements MigrationConfigs {
    private final ServiceBusManager manager;

    MigrationConfigsImpl(ServiceBusManager manager) {
        super(manager.inner().migrationConfigs());
        this.manager = manager;
    }

    public ServiceBusManager manager() {
        return this.manager;
    }

    @Override
    public MigrationConfigPropertiesImpl define(String name) {
        return wrapModel(name);
    }

    private MigrationConfigPropertiesImpl wrapModel(MigrationConfigPropertiesInner inner) {
        return  new MigrationConfigPropertiesImpl(inner, manager());
    }

    private MigrationConfigPropertiesImpl wrapModel(String name) {
        return new MigrationConfigPropertiesImpl(name, this.manager());
    }

    @Override
    public Completable completeMigrationAsync(String resourceGroupName, String namespaceName) {
        MigrationConfigsInner client = this.inner();
        return client.completeMigrationAsync(resourceGroupName, namespaceName).toCompletable();
    }

    @Override
    public Completable revertAsync(String resourceGroupName, String namespaceName) {
        MigrationConfigsInner client = this.inner();
        return client.revertAsync(resourceGroupName, namespaceName).toCompletable();
    }

    @Override
    public Observable<MigrationConfigProperties> listAsync(final String resourceGroupName, final String namespaceName) {
        MigrationConfigsInner client = this.inner();
        return client.listAsync(resourceGroupName, namespaceName)
        .flatMapIterable(new Func1<Page<MigrationConfigPropertiesInner>, Iterable<MigrationConfigPropertiesInner>>() {
            @Override
            public Iterable<MigrationConfigPropertiesInner> call(Page<MigrationConfigPropertiesInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MigrationConfigPropertiesInner, MigrationConfigProperties>() {
            @Override
            public MigrationConfigProperties call(MigrationConfigPropertiesInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<MigrationConfigProperties> getAsync(String resourceGroupName, String namespaceName) {
        MigrationConfigsInner client = this.inner();
        return client.getAsync(resourceGroupName, namespaceName)
        .map(new Func1<MigrationConfigPropertiesInner, MigrationConfigProperties>() {
            @Override
            public MigrationConfigProperties call(MigrationConfigPropertiesInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String namespaceName) {
        MigrationConfigsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, namespaceName).toCompletable();
    }

}
