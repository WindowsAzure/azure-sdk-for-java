/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.OperationDetail;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final AppPlatformManager manager;

    OperationsImpl(AppPlatformManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OperationDetail> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<OperationDetailInner>, Iterable<OperationDetailInner>>() {
            @Override
            public Iterable<OperationDetailInner> call(Page<OperationDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OperationDetailInner, OperationDetail>() {
            @Override
            public OperationDetail call(OperationDetailInner inner) {
                return new OperationDetailImpl(inner, manager());
            }
        });
    }

}
