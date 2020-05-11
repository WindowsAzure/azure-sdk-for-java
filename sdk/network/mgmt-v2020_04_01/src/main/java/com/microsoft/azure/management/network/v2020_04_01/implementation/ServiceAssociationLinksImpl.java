/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_04_01.ServiceAssociationLinks;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_04_01.ServiceAssociationLinksListResult;

class ServiceAssociationLinksImpl extends WrapperImpl<ServiceAssociationLinksInner> implements ServiceAssociationLinks {
    private final NetworkManager manager;

    ServiceAssociationLinksImpl(NetworkManager manager) {
        super(manager.inner().serviceAssociationLinks());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServiceAssociationLinksListResult> listAsync(String resourceGroupName, String virtualNetworkName, String subnetName) {
        ServiceAssociationLinksInner client = this.inner();
        return client.listAsync(resourceGroupName, virtualNetworkName, subnetName)
        .map(new Func1<ServiceAssociationLinksListResultInner, ServiceAssociationLinksListResult>() {
            @Override
            public ServiceAssociationLinksListResult call(ServiceAssociationLinksListResultInner inner) {
                return new ServiceAssociationLinksListResultImpl(inner, manager());
            }
        });
    }

}
