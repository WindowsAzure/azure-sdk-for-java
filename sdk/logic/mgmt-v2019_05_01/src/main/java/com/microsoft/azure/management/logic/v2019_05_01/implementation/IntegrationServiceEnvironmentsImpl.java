/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationServiceEnvironments;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationServiceEnvironment;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class IntegrationServiceEnvironmentsImpl extends GroupableResourcesCoreImpl<IntegrationServiceEnvironment, IntegrationServiceEnvironmentImpl, IntegrationServiceEnvironmentInner, IntegrationServiceEnvironmentsInner, LogicManager>  implements IntegrationServiceEnvironments {
    protected IntegrationServiceEnvironmentsImpl(LogicManager manager) {
        super(manager.inner().integrationServiceEnvironments(), manager);
    }

    @Override
    protected Observable<IntegrationServiceEnvironmentInner> getInnerAsync(String resourceGroupName, String name) {
        IntegrationServiceEnvironmentsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        IntegrationServiceEnvironmentsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<IntegrationServiceEnvironment> listByResourceGroup(String resourceGroupName) {
        IntegrationServiceEnvironmentsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<IntegrationServiceEnvironment> listByResourceGroupAsync(String resourceGroupName) {
        IntegrationServiceEnvironmentsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<IntegrationServiceEnvironmentInner>, Iterable<IntegrationServiceEnvironmentInner>>() {
            @Override
            public Iterable<IntegrationServiceEnvironmentInner> call(Page<IntegrationServiceEnvironmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IntegrationServiceEnvironmentInner, IntegrationServiceEnvironment>() {
            @Override
            public IntegrationServiceEnvironment call(IntegrationServiceEnvironmentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<IntegrationServiceEnvironment> list() {
        IntegrationServiceEnvironmentsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<IntegrationServiceEnvironment> listAsync() {
        IntegrationServiceEnvironmentsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<IntegrationServiceEnvironmentInner>, Iterable<IntegrationServiceEnvironmentInner>>() {
            @Override
            public Iterable<IntegrationServiceEnvironmentInner> call(Page<IntegrationServiceEnvironmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IntegrationServiceEnvironmentInner, IntegrationServiceEnvironment>() {
            @Override
            public IntegrationServiceEnvironment call(IntegrationServiceEnvironmentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public IntegrationServiceEnvironmentImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable restartAsync(String resourceGroup, String integrationServiceEnvironmentName) {
        IntegrationServiceEnvironmentsInner client = this.inner();
        return client.restartAsync(resourceGroup, integrationServiceEnvironmentName).toCompletable();
    }

    @Override
    protected IntegrationServiceEnvironmentImpl wrapModel(IntegrationServiceEnvironmentInner inner) {
        return  new IntegrationServiceEnvironmentImpl(inner.name(), inner, manager());
    }

    @Override
    protected IntegrationServiceEnvironmentImpl wrapModel(String name) {
        return new IntegrationServiceEnvironmentImpl(name, new IntegrationServiceEnvironmentInner(), this.manager());
    }

}
