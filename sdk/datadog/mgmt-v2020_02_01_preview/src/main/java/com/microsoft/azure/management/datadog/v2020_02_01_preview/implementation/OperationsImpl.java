/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.OperationResult;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final DatadogManager manager;

    OperationsImpl(DatadogManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public DatadogManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OperationResult> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<OperationResultInner>, Iterable<OperationResultInner>>() {
            @Override
            public Iterable<OperationResultInner> call(Page<OperationResultInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OperationResultInner, OperationResult>() {
            @Override
            public OperationResult call(OperationResultInner inner) {
                return new OperationResultImpl(inner, manager());
            }
        });
    }

}
