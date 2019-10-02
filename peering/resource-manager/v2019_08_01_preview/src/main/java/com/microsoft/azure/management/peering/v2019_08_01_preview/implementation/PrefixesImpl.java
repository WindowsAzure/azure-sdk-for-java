/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.peering.v2019_08_01_preview.Prefixes;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.peering.v2019_08_01_preview.PeeringServicePeeringServicePrefixModel;

class PrefixesImpl extends WrapperImpl<PrefixesInner> implements Prefixes {
    private final PeeringManager manager;

    PrefixesImpl(PeeringManager manager) {
        super(manager.inner().prefixes());
        this.manager = manager;
    }

    public PeeringManager manager() {
        return this.manager;
    }

    private PeeringServicePeeringServicePrefixModelImpl wrapModel(PeeringServicePrefixInner inner) {
        return  new PeeringServicePeeringServicePrefixModelImpl(inner, manager());
    }

    @Override
    public Observable<PeeringServicePeeringServicePrefixModel> listByPeeringServiceAsync(final String resourceGroupName, final String peeringServiceName) {
        PrefixesInner client = this.inner();
        return client.listByPeeringServiceAsync(resourceGroupName, peeringServiceName)
        .flatMapIterable(new Func1<Page<PeeringServicePrefixInner>, Iterable<PeeringServicePrefixInner>>() {
            @Override
            public Iterable<PeeringServicePrefixInner> call(Page<PeeringServicePrefixInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PeeringServicePrefixInner, PeeringServicePeeringServicePrefixModel>() {
            @Override
            public PeeringServicePeeringServicePrefixModel call(PeeringServicePrefixInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
