/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountMaps;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2019_05_01.GetCallbackUrlParameters;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountMap;

class IntegrationAccountMapsImpl extends WrapperImpl<IntegrationAccountMapsInner> implements IntegrationAccountMaps {
    private final LogicManager manager;

    IntegrationAccountMapsImpl(LogicManager manager) {
        super(manager.inner().integrationAccountMaps());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountMapImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationAccountMapImpl wrapModel(IntegrationAccountMapInner inner) {
        return  new IntegrationAccountMapImpl(inner, manager());
    }

    private IntegrationAccountMapImpl wrapModel(String name) {
        return new IntegrationAccountMapImpl(name, this.manager());
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String mapName, GetCallbackUrlParameters listContentCallbackUrl) {
        IntegrationAccountMapsInner client = this.inner();
        return client.listContentCallbackUrlAsync(resourceGroupName, integrationAccountName, mapName, listContentCallbackUrl)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<IntegrationAccountMap> listAsync(final String resourceGroupName, final String integrationAccountName) {
        IntegrationAccountMapsInner client = this.inner();
        return client.listAsync(resourceGroupName, integrationAccountName)
        .flatMapIterable(new Func1<Page<IntegrationAccountMapInner>, Iterable<IntegrationAccountMapInner>>() {
            @Override
            public Iterable<IntegrationAccountMapInner> call(Page<IntegrationAccountMapInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IntegrationAccountMapInner, IntegrationAccountMap>() {
            @Override
            public IntegrationAccountMap call(IntegrationAccountMapInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<IntegrationAccountMap> getAsync(String resourceGroupName, String integrationAccountName, String mapName) {
        IntegrationAccountMapsInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, mapName)
        .map(new Func1<IntegrationAccountMapInner, IntegrationAccountMap>() {
            @Override
            public IntegrationAccountMap call(IntegrationAccountMapInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String mapName) {
        IntegrationAccountMapsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, mapName).toCompletable();
    }

}
