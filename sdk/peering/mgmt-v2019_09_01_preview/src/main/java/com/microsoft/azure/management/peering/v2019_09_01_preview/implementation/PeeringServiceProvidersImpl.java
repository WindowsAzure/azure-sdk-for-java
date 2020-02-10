/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.peering.v2019_09_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.peering.v2019_09_01_preview.PeeringServiceProviders;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.peering.v2019_09_01_preview.PeeringServiceProvider;

class PeeringServiceProvidersImpl extends WrapperImpl<PeeringServiceProvidersInner> implements PeeringServiceProviders {
    private PagedListConverter<PeeringServiceProviderInner, PeeringServiceProvider> converter;
    private final PeeringManager manager;

    PeeringServiceProvidersImpl(PeeringManager manager) {
        super(manager.inner().peeringServiceProviders());
        this.manager = manager;
        this.converter = new PagedListConverter<PeeringServiceProviderInner, PeeringServiceProvider>() {
            @Override
            public Observable<PeeringServiceProvider> typeConvertAsync(PeeringServiceProviderInner inner) {
                return Observable.just((PeeringServiceProvider) wrapModel(inner));
            }
        };
    }

    public PeeringManager manager() {
        return this.manager;
    }

    private PeeringServiceProviderImpl wrapModel(PeeringServiceProviderInner inner) {
        return  new PeeringServiceProviderImpl(inner, manager());
    }

    @Override
    public PagedList<PeeringServiceProvider> list() {
        PeeringServiceProvidersInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<PeeringServiceProvider> listAsync() {
        PeeringServiceProvidersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<PeeringServiceProviderInner>, Iterable<PeeringServiceProviderInner>>() {
            @Override
            public Iterable<PeeringServiceProviderInner> call(Page<PeeringServiceProviderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PeeringServiceProviderInner, PeeringServiceProvider>() {
            @Override
            public PeeringServiceProvider call(PeeringServiceProviderInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
