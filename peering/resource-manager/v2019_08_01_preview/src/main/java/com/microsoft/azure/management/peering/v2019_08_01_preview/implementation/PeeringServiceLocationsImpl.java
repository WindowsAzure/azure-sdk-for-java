/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.peering.v2019_08_01_preview.PeeringServiceLocations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.peering.v2019_08_01_preview.PeeringServiceLocation;

class PeeringServiceLocationsImpl extends WrapperImpl<PeeringServiceLocationsInner> implements PeeringServiceLocations {
    private PagedListConverter<PeeringServiceLocationInner, PeeringServiceLocation> converter;
    private final PeeringManager manager;

    PeeringServiceLocationsImpl(PeeringManager manager) {
        super(manager.inner().peeringServiceLocations());
        this.manager = manager;
        this.converter = new PagedListConverter<PeeringServiceLocationInner, PeeringServiceLocation>() {
            @Override
            public Observable<PeeringServiceLocation> typeConvertAsync(PeeringServiceLocationInner inner) {
                return Observable.just((PeeringServiceLocation) wrapModel(inner));
            }
        };
    }

    public PeeringManager manager() {
        return this.manager;
    }

    private PeeringServiceLocationImpl wrapModel(PeeringServiceLocationInner inner) {
        return  new PeeringServiceLocationImpl(inner, manager());
    }

    @Override
    public PagedList<PeeringServiceLocation> list() {
        PeeringServiceLocationsInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<PeeringServiceLocation> listAsync() {
        PeeringServiceLocationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<PeeringServiceLocationInner>, Iterable<PeeringServiceLocationInner>>() {
            @Override
            public Iterable<PeeringServiceLocationInner> call(Page<PeeringServiceLocationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PeeringServiceLocationInner, PeeringServiceLocation>() {
            @Override
            public PeeringServiceLocation call(PeeringServiceLocationInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
