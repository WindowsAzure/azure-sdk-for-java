/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.search.v2020_03_13.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.search.v2020_03_13.PrivateLinkResources;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.search.v2020_03_13.PrivateLinkResource;

class PrivateLinkResourcesImpl extends WrapperImpl<PrivateLinkResourcesInner> implements PrivateLinkResources {
    private final SearchManager manager;

    PrivateLinkResourcesImpl(SearchManager manager) {
        super(manager.inner().privateLinkResources());
        this.manager = manager;
    }

    public SearchManager manager() {
        return this.manager;
    }

    private PrivateLinkResourceImpl wrapModel(PrivateLinkResourceInner inner) {
        return  new PrivateLinkResourceImpl(inner, manager());
    }

    @Override
    public Observable<PrivateLinkResource> listSupportedAsync(String resourceGroupName, String searchServiceName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.listSupportedAsync(resourceGroupName, searchServiceName)
        .flatMap(new Func1<List<PrivateLinkResourceInner>, Observable<PrivateLinkResourceInner>>() {
            @Override
            public Observable<PrivateLinkResourceInner> call(List<PrivateLinkResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<PrivateLinkResourceInner, PrivateLinkResource>() {
            @Override
            public PrivateLinkResource call(PrivateLinkResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
