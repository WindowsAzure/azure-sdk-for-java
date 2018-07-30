/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.containerinstance.v2018_02_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerinstance.v2018_02_01_preview.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.containerinstance.v2018_02_01_preview.OperationListResult;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final ContainerInstanceManager manager;

    OperationsImpl(ContainerInstanceManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public ContainerInstanceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OperationListResult> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .map(new Func1<OperationListResultInner, OperationListResult>() {
            @Override
            public OperationListResult call(OperationListResultInner inner) {
                return new OperationListResultImpl(inner, manager());
            }
        });
    }

}
