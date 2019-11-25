/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.Updates;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.Update;

class UpdatesImpl extends WrapperImpl<UpdatesInner> implements Updates {
    private final MaintenanceManager manager;

    UpdatesImpl(MaintenanceManager manager) {
        super(manager.inner().updates());
        this.manager = manager;
    }

    public MaintenanceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Update> listParentAsync(String resourceGroupName, String providerName, String resourceParentType, String resourceParentName, String resourceType, String resourceName) {
        UpdatesInner client = this.inner();
        return client.listParentAsync(resourceGroupName, providerName, resourceParentType, resourceParentName, resourceType, resourceName)
        .flatMap(new Func1<List<UpdateInner>, Observable<UpdateInner>>() {
            @Override
            public Observable<UpdateInner> call(List<UpdateInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<UpdateInner, Update>() {
            @Override
            public Update call(UpdateInner inner) {
                return new UpdateImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Update> listAsync(String resourceGroupName, String providerName, String resourceType, String resourceName) {
        UpdatesInner client = this.inner();
        return client.listAsync(resourceGroupName, providerName, resourceType, resourceName)
        .flatMap(new Func1<List<UpdateInner>, Observable<UpdateInner>>() {
            @Override
            public Observable<UpdateInner> call(List<UpdateInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<UpdateInner, Update>() {
            @Override
            public Update call(UpdateInner inner) {
                return new UpdateImpl(inner, manager());
            }
        });
    }

}
