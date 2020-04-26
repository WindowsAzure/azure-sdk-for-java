/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.kubernetesconfiguration.v2019_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.kubernetesconfiguration.v2019_11_01_preview.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.kubernetesconfiguration.v2019_11_01_preview.ResourceProviderOperation;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final KubernetesConfigurationManager manager;

    OperationsImpl(KubernetesConfigurationManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public KubernetesConfigurationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ResourceProviderOperation> listAsync(final String apiVersion) {
        OperationsInner client = this.inner();
        return client.listAsync(apiVersion)
        .flatMapIterable(new Func1<Page<ResourceProviderOperationInner>, Iterable<ResourceProviderOperationInner>>() {
            @Override
            public Iterable<ResourceProviderOperationInner> call(Page<ResourceProviderOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceProviderOperationInner, ResourceProviderOperation>() {
            @Override
            public ResourceProviderOperation call(ResourceProviderOperationInner inner) {
                return new ResourceProviderOperationImpl(inner, manager());
            }
        });
    }

}
