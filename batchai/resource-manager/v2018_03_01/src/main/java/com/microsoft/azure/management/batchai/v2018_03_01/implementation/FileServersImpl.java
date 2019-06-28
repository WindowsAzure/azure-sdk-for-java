/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.batchai.v2018_03_01.FileServers;
import com.microsoft.azure.management.batchai.v2018_03_01.FileServer;
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

class FileServersImpl extends GroupableResourcesCoreImpl<FileServer, FileServerImpl, FileServerInner, FileServersInner, BatchAIManager>  implements FileServers {
    protected FileServersImpl(BatchAIManager manager) {
        super(manager.inner().fileServers(), manager);
    }

    @Override
    protected Observable<FileServerInner> getInnerAsync(String resourceGroupName, String name) {
        FileServersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        FileServersInner client = this.inner();
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
    public PagedList<FileServer> listByResourceGroup(String resourceGroupName) {
        FileServersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<FileServer> listByResourceGroupAsync(String resourceGroupName) {
        FileServersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<FileServerInner>, Iterable<FileServerInner>>() {
            @Override
            public Iterable<FileServerInner> call(Page<FileServerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FileServerInner, FileServer>() {
            @Override
            public FileServer call(FileServerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<FileServer> list() {
        FileServersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<FileServer> listAsync() {
        FileServersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<FileServerInner>, Iterable<FileServerInner>>() {
            @Override
            public Iterable<FileServerInner> call(Page<FileServerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FileServerInner, FileServer>() {
            @Override
            public FileServer call(FileServerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public FileServerImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected FileServerImpl wrapModel(FileServerInner inner) {
        return  new FileServerImpl(inner.name(), inner, manager());
    }

    @Override
    protected FileServerImpl wrapModel(String name) {
        return new FileServerImpl(name, new FileServerInner(), this.manager());
    }

}
