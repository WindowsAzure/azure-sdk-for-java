/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.monitor.v2018_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2018_01_01.Metrics;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.monitor.v2018_01_01.Response;

class MetricsImpl extends WrapperImpl<MetricsInner> implements Metrics {
    private final MonitorManager manager;

    MetricsImpl(MonitorManager manager) {
        super(manager.inner().metrics());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Response> listAsync(String resourceUri) {
        MetricsInner client = this.inner();
        return client.listAsync(resourceUri)
        .map(new Func1<ResponseInner, Response>() {
            @Override
            public Response call(ResponseInner inner) {
                return new ResponseImpl(inner, manager());
            }
        });
    }

}
