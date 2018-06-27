/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.OperationDefinition;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final ContainerRegistryManager manager;

    OperationsImpl(ContainerRegistryManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OperationDefinition> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<OperationDefinitionInner>, Iterable<OperationDefinitionInner>>() {
            @Override
            public Iterable<OperationDefinitionInner> call(Page<OperationDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OperationDefinitionInner, OperationDefinition>() {
            @Override
            public OperationDefinition call(OperationDefinitionInner inner) {
                return new OperationDefinitionImpl(inner, manager());
            }
        });
    }

}
