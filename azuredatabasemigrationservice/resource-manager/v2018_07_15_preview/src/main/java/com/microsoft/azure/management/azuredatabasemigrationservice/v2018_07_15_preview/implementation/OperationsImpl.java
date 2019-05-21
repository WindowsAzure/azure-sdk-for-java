/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.ServiceOperation;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final DataMigrationManager manager;

    OperationsImpl(DataMigrationManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public DataMigrationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServiceOperation> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ServiceOperationInner>, Iterable<ServiceOperationInner>>() {
            @Override
            public Iterable<ServiceOperationInner> call(Page<ServiceOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServiceOperationInner, ServiceOperation>() {
            @Override
            public ServiceOperation call(ServiceOperationInner inner) {
                return new ServiceOperationImpl(inner, manager());
            }
        });
    }

}
