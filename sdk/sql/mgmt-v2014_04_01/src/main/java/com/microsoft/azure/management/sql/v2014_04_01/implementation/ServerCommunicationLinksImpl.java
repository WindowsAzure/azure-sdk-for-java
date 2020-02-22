/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.ServerCommunicationLinks;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.ServerCommunicationLink;

class ServerCommunicationLinksImpl extends WrapperImpl<ServerCommunicationLinksInner> implements ServerCommunicationLinks {
    private final SqlManager manager;

    ServerCommunicationLinksImpl(SqlManager manager) {
        super(manager.inner().serverCommunicationLinks());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ServerCommunicationLinkImpl define(String name) {
        return wrapModel(name);
    }

    private ServerCommunicationLinkImpl wrapModel(ServerCommunicationLinkInner inner) {
        return  new ServerCommunicationLinkImpl(inner, manager());
    }

    private ServerCommunicationLinkImpl wrapModel(String name) {
        return new ServerCommunicationLinkImpl(name, this.manager());
    }

    @Override
    public Observable<ServerCommunicationLink> listByServerAsync(String resourceGroupName, String serverName) {
        ServerCommunicationLinksInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<ServerCommunicationLinkInner>, Observable<ServerCommunicationLinkInner>>() {
            @Override
            public Observable<ServerCommunicationLinkInner> call(List<ServerCommunicationLinkInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ServerCommunicationLinkInner, ServerCommunicationLink>() {
            @Override
            public ServerCommunicationLink call(ServerCommunicationLinkInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerCommunicationLink> getAsync(String resourceGroupName, String serverName, String communicationLinkName) {
        ServerCommunicationLinksInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, communicationLinkName)
        .flatMap(new Func1<ServerCommunicationLinkInner, Observable<ServerCommunicationLink>>() {
            @Override
            public Observable<ServerCommunicationLink> call(ServerCommunicationLinkInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ServerCommunicationLink)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String communicationLinkName) {
        ServerCommunicationLinksInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, communicationLinkName).toCompletable();
    }

}
