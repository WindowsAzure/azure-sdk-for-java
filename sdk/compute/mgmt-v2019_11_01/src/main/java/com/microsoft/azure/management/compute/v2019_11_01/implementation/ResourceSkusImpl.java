/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2019_11_01.ResourceSkus;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2019_11_01.ResourceSku;

class ResourceSkusImpl extends WrapperImpl<ResourceSkusInner> implements ResourceSkus {
    private final ComputeManager manager;

    ResourceSkusImpl(ComputeManager manager) {
        super(manager.inner().resourceSkus());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ResourceSku> listAsync() {
        ResourceSkusInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ResourceSkuInner>, Iterable<ResourceSkuInner>>() {
            @Override
            public Iterable<ResourceSkuInner> call(Page<ResourceSkuInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceSkuInner, ResourceSku>() {
            @Override
            public ResourceSku call(ResourceSkuInner inner) {
                return new ResourceSkuImpl(inner, manager());
            }
        });
    }

}
