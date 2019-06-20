/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualNetworksByPCs;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.PrivateCloudLocationVirtualNetwork;

class VirtualNetworksByPCsImpl extends WrapperImpl<VirtualNetworksByPCsInner> implements VirtualNetworksByPCs {
    private final VMwareCloudSimpleManager manager;

    VirtualNetworksByPCsImpl(VMwareCloudSimpleManager manager) {
        super(manager.inner().virtualNetworksByPCs());
        this.manager = manager;
    }

    public VMwareCloudSimpleManager manager() {
        return this.manager;
    }

    private PrivateCloudLocationVirtualNetworkImpl wrapModel(VirtualNetworkInner inner) {
        return  new PrivateCloudLocationVirtualNetworkImpl(inner, manager());
    }

    @Override
    public Observable<PrivateCloudLocationVirtualNetwork> listAsync(final String pcName, final String resourcePoolName) {
        VirtualNetworksByPCsInner client = this.inner();
        return client.listAsync(pcName, resourcePoolName)
        .flatMapIterable(new Func1<Page<VirtualNetworkInner>, Iterable<VirtualNetworkInner>>() {
            @Override
            public Iterable<VirtualNetworkInner> call(Page<VirtualNetworkInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkInner, PrivateCloudLocationVirtualNetwork>() {
            @Override
            public PrivateCloudLocationVirtualNetwork call(VirtualNetworkInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
