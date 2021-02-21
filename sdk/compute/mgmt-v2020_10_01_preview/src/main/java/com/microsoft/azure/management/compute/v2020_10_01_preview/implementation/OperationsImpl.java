/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_10_01_preview.Operations;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_10_01_preview.ComputeOperationValue;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final ComputeManager manager;

    OperationsImpl(ComputeManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ComputeOperationValue> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<List<ComputeOperationValueInner>, Observable<ComputeOperationValueInner>>() {
            @Override
            public Observable<ComputeOperationValueInner> call(List<ComputeOperationValueInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ComputeOperationValueInner, ComputeOperationValue>() {
            @Override
            public ComputeOperationValue call(ComputeOperationValueInner inner) {
                return new ComputeOperationValueImpl(inner, manager());
            }
        });
    }

}
