/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.ResourceSkus;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.ResourceSku;

class ResourceSkusImpl extends WrapperImpl<ResourceSkusInner> implements ResourceSkus {
    private final CognitiveServicesManager manager;

    ResourceSkusImpl(CognitiveServicesManager manager) {
        super(manager.inner().resourceSkus());
        this.manager = manager;
    }

    public CognitiveServicesManager manager() {
        return this.manager;
    }

    private Observable<Page<ResourceSkuInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ResourceSkusInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<ResourceSkuInner>, Observable<Page<ResourceSkuInner>>>() {
            @Override
            public Observable<Page<ResourceSkuInner>> call(Page<ResourceSkuInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<ResourceSku> listAsync() {
        ResourceSkusInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<ResourceSkuInner>, Observable<Page<ResourceSkuInner>>>() {
            @Override
            public Observable<Page<ResourceSkuInner>> call(Page<ResourceSkuInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
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
