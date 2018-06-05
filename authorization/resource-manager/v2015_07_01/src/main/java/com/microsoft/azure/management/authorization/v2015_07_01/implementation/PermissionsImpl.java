/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.authorization.v2015_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.authorization.v2015_07_01.Permissions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.authorization.v2015_07_01.Permission;

class PermissionsImpl extends WrapperImpl<PermissionsInner> implements Permissions {
    private final AuthorizationManager manager;

    PermissionsImpl(AuthorizationManager manager) {
        super(manager.inner().permissions());
        this.manager = manager;
    }

    public AuthorizationManager manager() {
        return this.manager;
    }

    private Observable<Page<PermissionInner>> listForResourceNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        PermissionsInner client = this.inner();
        return client.listForResourceNextAsync(nextLink)
        .flatMap(new Func1<Page<PermissionInner>, Observable<Page<PermissionInner>>>() {
            @Override
            public Observable<Page<PermissionInner>> call(Page<PermissionInner> page) {
                return Observable.just(page).concatWith(listForResourceNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Permission> listForResourceAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName) {
        PermissionsInner client = this.inner();
        return client.listForResourceAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName)
        .flatMap(new Func1<Page<PermissionInner>, Observable<Page<PermissionInner>>>() {
            @Override
            public Observable<Page<PermissionInner>> call(Page<PermissionInner> page) {
                return listForResourceNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<PermissionInner>, Iterable<PermissionInner>>() {
            @Override
            public Iterable<PermissionInner> call(Page<PermissionInner> page) {
                return page.items();
            }
        })    .map(new Func1<PermissionInner, Permission>() {
            @Override
            public Permission call(PermissionInner inner) {
                return new PermissionImpl(inner, manager());
            }
        });
    }

    private Observable<Page<PermissionInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        PermissionsInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<PermissionInner>, Observable<Page<PermissionInner>>>() {
            @Override
            public Observable<Page<PermissionInner>> call(Page<PermissionInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Permission> listByResourceGroupAsync(final String resourceGroupName) {
        PermissionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<PermissionInner>, Observable<Page<PermissionInner>>>() {
            @Override
            public Observable<Page<PermissionInner>> call(Page<PermissionInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<PermissionInner>, Iterable<PermissionInner>>() {
            @Override
            public Iterable<PermissionInner> call(Page<PermissionInner> page) {
                return page.items();
            }
        })    .map(new Func1<PermissionInner, Permission>() {
            @Override
            public Permission call(PermissionInner inner) {
                return new PermissionImpl(inner, manager());
            }
        });
    }

}
