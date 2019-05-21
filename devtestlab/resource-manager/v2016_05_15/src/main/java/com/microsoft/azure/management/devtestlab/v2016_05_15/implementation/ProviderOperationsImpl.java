/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2016_05_15.ProviderOperations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2016_05_15.OperationMetadata;

class ProviderOperationsImpl extends WrapperImpl<ProviderOperationsInner> implements ProviderOperations {
    private final DevTestLabManager manager;

    ProviderOperationsImpl(DevTestLabManager manager) {
        super(manager.inner().providerOperations());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OperationMetadata> listAsync() {
        ProviderOperationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<OperationMetadataInner>, Iterable<OperationMetadataInner>>() {
            @Override
            public Iterable<OperationMetadataInner> call(Page<OperationMetadataInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OperationMetadataInner, OperationMetadata>() {
            @Override
            public OperationMetadata call(OperationMetadataInner inner) {
                return new OperationMetadataImpl(inner, manager());
            }
        });
    }

}
