/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mysql.v2020_01_01.PrivateLinkResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mysql.v2020_01_01.PrivateLinkResource;

class PrivateLinkResourcesImpl extends WrapperImpl<PrivateLinkResourcesInner> implements PrivateLinkResources {
    private final MySQLManager manager;

    PrivateLinkResourcesImpl(MySQLManager manager) {
        super(manager.inner().privateLinkResources());
        this.manager = manager;
    }

    public MySQLManager manager() {
        return this.manager;
    }

    private PrivateLinkResourceImpl wrapModel(PrivateLinkResourceInner inner) {
        return  new PrivateLinkResourceImpl(inner, manager());
    }

    @Override
    public Observable<PrivateLinkResource> listByServerAsync(final String resourceGroupName, final String serverName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMapIterable(new Func1<Page<PrivateLinkResourceInner>, Iterable<PrivateLinkResourceInner>>() {
            @Override
            public Iterable<PrivateLinkResourceInner> call(Page<PrivateLinkResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateLinkResourceInner, PrivateLinkResource>() {
            @Override
            public PrivateLinkResource call(PrivateLinkResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<PrivateLinkResource> getAsync(String resourceGroupName, String serverName, String groupName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, groupName)
        .flatMap(new Func1<PrivateLinkResourceInner, Observable<PrivateLinkResource>>() {
            @Override
            public Observable<PrivateLinkResource> call(PrivateLinkResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PrivateLinkResource)wrapModel(inner));
                }
            }
       });
    }

}
