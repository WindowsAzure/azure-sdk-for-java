/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.signalr.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.signalr.v2020_05_01.SignalRPrivateLinkResources;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.signalr.v2020_05_01.PrivateLinkResource;

class SignalRPrivateLinkResourcesImpl extends WrapperImpl<SignalRPrivateLinkResourcesInner> implements SignalRPrivateLinkResources {
    private final SignalRServiceManager manager;

    SignalRPrivateLinkResourcesImpl(SignalRServiceManager manager) {
        super(manager.inner().signalRPrivateLinkResources());
        this.manager = manager;
    }

    public SignalRServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateLinkResource> listAsync(final String resourceGroupName, final String resourceName) {
        SignalRPrivateLinkResourcesInner client = this.inner();
        return client.listAsync(resourceGroupName, resourceName)
        .flatMapIterable(new Func1<Page<PrivateLinkResourceInner>, Iterable<PrivateLinkResourceInner>>() {
            @Override
            public Iterable<PrivateLinkResourceInner> call(Page<PrivateLinkResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateLinkResourceInner, PrivateLinkResource>() {
            @Override
            public PrivateLinkResource call(PrivateLinkResourceInner inner) {
                return new PrivateLinkResourceImpl(inner, manager());
            }
        });
    }

}
