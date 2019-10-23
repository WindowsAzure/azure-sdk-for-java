/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2019_06_01.Operations;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.storage.v2019_06_01.Operation;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final StorageManager manager;

    OperationsImpl(StorageManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Operation> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<List<OperationInner>, Observable<OperationInner>>() {
            @Override
            public Observable<OperationInner> call(List<OperationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<OperationInner, Operation>() {
            @Override
            public Operation call(OperationInner inner) {
                return new OperationImpl(inner, manager());
            }
        });
    }

}
