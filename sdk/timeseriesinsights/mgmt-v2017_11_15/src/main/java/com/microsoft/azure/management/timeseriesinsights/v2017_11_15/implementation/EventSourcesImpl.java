/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.EventSources;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.EventSourceListResponse;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.EventSourceResource;

class EventSourcesImpl extends WrapperImpl<EventSourcesInner> implements EventSources {
    private final TimeSeriesInsightsManager manager;

    EventSourcesImpl(TimeSeriesInsightsManager manager) {
        super(manager.inner().eventSources());
        this.manager = manager;
    }

    public TimeSeriesInsightsManager manager() {
        return this.manager;
    }

    @Override
    public EventSourceResourceImpl define(String name) {
        return wrapModel(name);
    }

    private EventSourceResourceImpl wrapModel(EventSourceResourceInner inner) {
        return  new EventSourceResourceImpl(inner, manager());
    }

    private EventSourceResourceImpl wrapModel(String name) {
        return new EventSourceResourceImpl(name, this.manager());
    }

    @Override
    public Observable<EventSourceListResponse> listByEnvironmentAsync(String resourceGroupName, String environmentName) {
        EventSourcesInner client = this.inner();
        return client.listByEnvironmentAsync(resourceGroupName, environmentName)
        .map(new Func1<EventSourceListResponseInner, EventSourceListResponse>() {
            @Override
            public EventSourceListResponse call(EventSourceListResponseInner inner) {
                return new EventSourceListResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSourceResource> getAsync(String resourceGroupName, String environmentName, String eventSourceName) {
        EventSourcesInner client = this.inner();
        return client.getAsync(resourceGroupName, environmentName, eventSourceName)
        .flatMap(new Func1<EventSourceResourceInner, Observable<EventSourceResource>>() {
            @Override
            public Observable<EventSourceResource> call(EventSourceResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((EventSourceResource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String environmentName, String eventSourceName) {
        EventSourcesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, environmentName, eventSourceName).toCompletable();
    }

}
