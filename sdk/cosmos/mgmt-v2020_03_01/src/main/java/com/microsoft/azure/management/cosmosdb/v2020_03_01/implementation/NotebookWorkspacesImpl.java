/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.NotebookWorkspaces;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.NotebookWorkspaceConnectionInfoResult;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.NotebookWorkspace;

class NotebookWorkspacesImpl extends WrapperImpl<NotebookWorkspacesInner> implements NotebookWorkspaces {
    private final CosmosDBManager manager;

    NotebookWorkspacesImpl(CosmosDBManager manager) {
        super(manager.inner().notebookWorkspaces());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public NotebookWorkspaceImpl define(String name) {
        return wrapModel(name);
    }

    private NotebookWorkspaceImpl wrapModel(NotebookWorkspaceInner inner) {
        return  new NotebookWorkspaceImpl(inner, manager());
    }

    private NotebookWorkspaceImpl wrapModel(String name) {
        return new NotebookWorkspaceImpl(name, this.manager());
    }

    @Override
    public Observable<NotebookWorkspaceConnectionInfoResult> listConnectionInfoAsync(String resourceGroupName, String accountName) {
        NotebookWorkspacesInner client = this.inner();
        return client.listConnectionInfoAsync(resourceGroupName, accountName)
        .map(new Func1<NotebookWorkspaceConnectionInfoResultInner, NotebookWorkspaceConnectionInfoResult>() {
            @Override
            public NotebookWorkspaceConnectionInfoResult call(NotebookWorkspaceConnectionInfoResultInner inner) {
                return new NotebookWorkspaceConnectionInfoResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable regenerateAuthTokenAsync(String resourceGroupName, String accountName) {
        NotebookWorkspacesInner client = this.inner();
        return client.regenerateAuthTokenAsync(resourceGroupName, accountName).toCompletable();
    }

    @Override
    public Completable startAsync(String resourceGroupName, String accountName) {
        NotebookWorkspacesInner client = this.inner();
        return client.startAsync(resourceGroupName, accountName).toCompletable();
    }

    @Override
    public Observable<NotebookWorkspace> listByDatabaseAccountAsync(String resourceGroupName, String accountName) {
        NotebookWorkspacesInner client = this.inner();
        return client.listByDatabaseAccountAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<NotebookWorkspaceInner>, Observable<NotebookWorkspaceInner>>() {
            @Override
            public Observable<NotebookWorkspaceInner> call(List<NotebookWorkspaceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<NotebookWorkspaceInner, NotebookWorkspace>() {
            @Override
            public NotebookWorkspace call(NotebookWorkspaceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<NotebookWorkspace> getAsync(String resourceGroupName, String accountName) {
        NotebookWorkspacesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName)
        .flatMap(new Func1<NotebookWorkspaceInner, Observable<NotebookWorkspace>>() {
            @Override
            public Observable<NotebookWorkspace> call(NotebookWorkspaceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((NotebookWorkspace)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName) {
        NotebookWorkspacesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName).toCompletable();
    }

}
