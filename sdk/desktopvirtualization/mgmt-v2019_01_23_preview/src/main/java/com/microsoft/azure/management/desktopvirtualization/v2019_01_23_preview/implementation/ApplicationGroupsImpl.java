/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.ApplicationGroups;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.ApplicationGroup;
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

class ApplicationGroupsImpl extends GroupableResourcesCoreImpl<ApplicationGroup, ApplicationGroupImpl, ApplicationGroupInner, ApplicationGroupsInner, DesktopVirtualizationManager>  implements ApplicationGroups {
    protected ApplicationGroupsImpl(DesktopVirtualizationManager manager) {
        super(manager.inner().applicationGroups(), manager);
    }

    @Override
    protected Observable<ApplicationGroupInner> getInnerAsync(String resourceGroupName, String name) {
        ApplicationGroupsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ApplicationGroupsInner client = this.inner();
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
    public PagedList<ApplicationGroup> listByResourceGroup(String resourceGroupName) {
        ApplicationGroupsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ApplicationGroup> listByResourceGroupAsync(String resourceGroupName) {
        ApplicationGroupsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ApplicationGroupInner>, Iterable<ApplicationGroupInner>>() {
            @Override
            public Iterable<ApplicationGroupInner> call(Page<ApplicationGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationGroupInner, ApplicationGroup>() {
            @Override
            public ApplicationGroup call(ApplicationGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ApplicationGroup> list() {
        ApplicationGroupsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ApplicationGroup> listAsync() {
        ApplicationGroupsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ApplicationGroupInner>, Iterable<ApplicationGroupInner>>() {
            @Override
            public Iterable<ApplicationGroupInner> call(Page<ApplicationGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationGroupInner, ApplicationGroup>() {
            @Override
            public ApplicationGroup call(ApplicationGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ApplicationGroupImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ApplicationGroupImpl wrapModel(ApplicationGroupInner inner) {
        return  new ApplicationGroupImpl(inner.name(), inner, manager());
    }

    @Override
    protected ApplicationGroupImpl wrapModel(String name) {
        return new ApplicationGroupImpl(name, new ApplicationGroupInner(), this.manager());
    }

}
