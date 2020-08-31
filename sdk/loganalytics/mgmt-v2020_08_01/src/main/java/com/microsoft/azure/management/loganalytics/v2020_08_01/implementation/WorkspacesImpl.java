/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.loganalytics.v2020_08_01.Workspaces;
import com.microsoft.azure.management.loganalytics.v2020_08_01.Workspace;
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

class WorkspacesImpl extends GroupableResourcesCoreImpl<Workspace, WorkspaceImpl, WorkspaceInner, WorkspacesInner, LogAnalyticsManager>  implements Workspaces {
    protected WorkspacesImpl(LogAnalyticsManager manager) {
        super(manager.inner().workspaces(), manager);
    }

    @Override
    protected Observable<WorkspaceInner> getInnerAsync(String resourceGroupName, String name) {
        WorkspacesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        WorkspacesInner client = this.inner();
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
    public PagedList<Workspace> listByResourceGroup(String resourceGroupName) {
        WorkspacesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Workspace> listByResourceGroupAsync(String resourceGroupName) {
        WorkspacesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<WorkspaceInner>, Observable<WorkspaceInner>>() {
            @Override
            public Observable<WorkspaceInner> call(Page<WorkspaceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<WorkspaceInner, Workspace>() {
            @Override
            public Workspace call(WorkspaceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Workspace> list() {
        WorkspacesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Workspace> listAsync() {
        WorkspacesInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<WorkspaceInner>, Observable<WorkspaceInner>>() {
            @Override
            public Observable<WorkspaceInner> call(Page<WorkspaceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<WorkspaceInner, Workspace>() {
            @Override
            public Workspace call(WorkspaceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public WorkspaceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected WorkspaceImpl wrapModel(WorkspaceInner inner) {
        return  new WorkspaceImpl(inner.name(), inner, manager());
    }

    @Override
    protected WorkspaceImpl wrapModel(String name) {
        return new WorkspaceImpl(name, new WorkspaceInner(), this.manager());
    }

}
