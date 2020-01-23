/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.EventHubConnections;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.EventHubConnection;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.EventHubConnectionValidationListResult;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.EventHubConnectionValidation;

class EventHubConnectionsImpl extends WrapperImpl<EventHubConnectionsInner> implements EventHubConnections {
    private final KustoManager manager;

    EventHubConnectionsImpl(KustoManager manager) {
        super(manager.inner().eventHubConnections());
        this.manager = manager;
    }

    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public EventHubConnectionImpl define(String name) {
        return wrapModel(name);
    }

    private EventHubConnectionImpl wrapModel(EventHubConnectionInner inner) {
        return  new EventHubConnectionImpl(inner, manager());
    }

    private EventHubConnectionImpl wrapModel(String name) {
        return new EventHubConnectionImpl(name, this.manager());
    }

    @Override
    public Observable<EventHubConnection> listByDatabaseAsync(String resourceGroupName, String clusterName, String databaseName) {
        EventHubConnectionsInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, clusterName, databaseName)
        .flatMap(new Func1<List<EventHubConnectionInner>, Observable<EventHubConnectionInner>>() {
            @Override
            public Observable<EventHubConnectionInner> call(List<EventHubConnectionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<EventHubConnectionInner, EventHubConnection>() {
            @Override
            public EventHubConnection call(EventHubConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<EventHubConnection> getAsync(String resourceGroupName, String clusterName, String databaseName, String eventHubConnectionName) {
        EventHubConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, clusterName, databaseName, eventHubConnectionName)
        .flatMap(new Func1<EventHubConnectionInner, Observable<EventHubConnection>>() {
            @Override
            public Observable<EventHubConnection> call(EventHubConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((EventHubConnection)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String clusterName, String databaseName, String eventHubConnectionName) {
        EventHubConnectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, clusterName, databaseName, eventHubConnectionName).toCompletable();
    }

    @Override
    public Observable<EventHubConnectionValidationListResult> eventhubConnectionValidationAsync(String resourceGroupName, String clusterName, String databaseName, EventHubConnectionValidation parameters) {
        EventHubConnectionsInner client = this.inner();
        return client.eventhubConnectionValidationAsync(resourceGroupName, clusterName, databaseName, parameters)
        .map(new Func1<EventHubConnectionValidationListResultInner, EventHubConnectionValidationListResult>() {
            @Override
            public EventHubConnectionValidationListResult call(EventHubConnectionValidationListResultInner inner) {
                return new EventHubConnectionValidationListResultImpl(inner, manager());
            }
        });
    }

}
