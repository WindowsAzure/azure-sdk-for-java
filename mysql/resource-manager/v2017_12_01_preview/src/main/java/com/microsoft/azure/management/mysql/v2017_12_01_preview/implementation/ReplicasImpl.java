/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mysql.v2017_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.Replicas;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.ServerServer;

class ReplicasImpl extends WrapperImpl<ReplicasInner> implements Replicas {
    private final MySQLManager manager;

    ReplicasImpl(MySQLManager manager) {
        super(manager.inner().replicas());
        this.manager = manager;
    }

    public MySQLManager manager() {
        return this.manager;
    }

    private ServerServerImpl wrapModel(ServerInner inner) {
        return  new ServerServerImpl(inner, manager());
    }

    @Override
    public Observable<ServerServer> listByServerAsync(String resourceGroupName, String serverName) {
        ReplicasInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<ServerInner>, Observable<ServerInner>>() {
            @Override
            public Observable<ServerInner> call(List<ServerInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ServerInner, ServerServer>() {
            @Override
            public ServerServer call(ServerInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
