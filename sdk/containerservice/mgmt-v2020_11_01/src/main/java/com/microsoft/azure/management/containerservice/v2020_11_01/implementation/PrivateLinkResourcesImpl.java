/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.containerservice.v2020_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerservice.v2020_11_01.PrivateLinkResources;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.containerservice.v2020_11_01.PrivateLinkResourcesListResult;

class PrivateLinkResourcesImpl extends WrapperImpl<PrivateLinkResourcesInner> implements PrivateLinkResources {
    private final ContainerServiceManager manager;

    PrivateLinkResourcesImpl(ContainerServiceManager manager) {
        super(manager.inner().privateLinkResources());
        this.manager = manager;
    }

    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateLinkResourcesListResult> listAsync(String resourceGroupName, String resourceName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.listAsync(resourceGroupName, resourceName)
        .map(new Func1<PrivateLinkResourcesListResultInner, PrivateLinkResourcesListResult>() {
            @Override
            public PrivateLinkResourcesListResult call(PrivateLinkResourcesListResultInner inner) {
                return new PrivateLinkResourcesListResultImpl(inner, manager());
            }
        });
    }

}
