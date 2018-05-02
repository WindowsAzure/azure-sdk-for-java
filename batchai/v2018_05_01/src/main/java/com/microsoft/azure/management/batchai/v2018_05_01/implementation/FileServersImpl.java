/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.batchai.v2018_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.batchai.v2018_05_01.FileServers;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.batchai.v2018_05_01.FileServer;

class FileServersImpl extends WrapperImpl<FileServersInner> implements FileServers {
    private final BatchAIManager manager;

    FileServersImpl(BatchAIManager manager) {
        super(manager.inner().fileServers());
        this.manager = manager;
    }

    public BatchAIManager manager() {
        return this.manager;
    }

    @Override
    public FileServerImpl define(String name) {
        return new FileServerImpl(name, this.manager());
    }

    private FileServerImpl wrapModel(FileServerInner inner) {
        return  new FileServerImpl(inner, manager());
    }

    private Observable<Page<FileServerInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        FileServersInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<FileServerInner>, Observable<Page<FileServerInner>>>() {
            @Override
            public Observable<Page<FileServerInner>> call(Page<FileServerInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<FileServer> listAsync() {
        FileServersInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<FileServerInner>, Observable<Page<FileServerInner>>>() {
            @Override
            public Observable<Page<FileServerInner>> call(Page<FileServerInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<FileServerInner>, Iterable<FileServerInner>>() {
            @Override
            public Iterable<FileServerInner> call(Page<FileServerInner> page) {
                return page.items();
            }
       })
        .map(new Func1<FileServerInner, FileServer>() {
            @Override
            public FileServer call(FileServerInner inner) {
                return new FileServerImpl(inner, manager());
            }
       });
    }

    private Observable<Page<FileServerInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        FileServersInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<FileServerInner>, Observable<Page<FileServerInner>>>() {
            @Override
            public Observable<Page<FileServerInner>> call(Page<FileServerInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<FileServer> listByResourceGroupAsync(final String resourceGroupName) {
        FileServersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<FileServerInner>, Observable<Page<FileServerInner>>>() {
            @Override
            public Observable<Page<FileServerInner>> call(Page<FileServerInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<FileServerInner>, Iterable<FileServerInner>>() {
            @Override
            public Iterable<FileServerInner> call(Page<FileServerInner> page) {
                return page.items();
            }
       })
        .map(new Func1<FileServerInner, FileServer>() {
            @Override
            public FileServer call(FileServerInner inner) {
                return new FileServerImpl(inner, manager());
            }
       });
    }

    private Observable<Page<FileServerInner>> listByWorkspaceNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        FileServersInner client = this.inner();
        return client.listByWorkspaceNextAsync(nextLink)
        .flatMap(new Func1<Page<FileServerInner>, Observable<Page<FileServerInner>>>() {
            @Override
            public Observable<Page<FileServerInner>> call(Page<FileServerInner> page) {
                return Observable.just(page).concatWith(listByWorkspaceNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<FileServer> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName) {
        FileServersInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName)
        .flatMap(new Func1<Page<FileServerInner>, Observable<Page<FileServerInner>>>() {
            @Override
            public Observable<Page<FileServerInner>> call(Page<FileServerInner> page) {
                return listByWorkspaceNextInnerPageAsync(page.nextPageLink());
            }
        })
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
    public Observable<FileServer> getByWorkspaceAsync(String resourceGroupName, String workspaceName, String fileServerName) {
        FileServersInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, fileServerName)
        .map(new Func1<FileServerInner, FileServer>() {
            @Override
            public FileServer call(FileServerInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteByWorkspaceAsync(String resourceGroupName, String workspaceName, String fileServerName) {
        FileServersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, fileServerName).toCompletable();
    }

}
