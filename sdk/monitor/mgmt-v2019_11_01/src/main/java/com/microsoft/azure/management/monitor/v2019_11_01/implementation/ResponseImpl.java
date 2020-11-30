/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.management.monitor.v2019_11_01.Response;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.Period;
import java.util.List;

class ResponseImpl extends WrapperImpl<ResponseInner> implements Response {
    private final MonitorManager manager;
    ResponseImpl(ResponseInner inner, MonitorManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public Double cost() {
        return this.inner().cost();
    }

    @Override
    public Period interval() {
        return this.inner().interval();
    }

    @Override
    public String namespace() {
        return this.inner().namespace();
    }

    @Override
    public String resourceregion() {
        return this.inner().resourceregion();
    }

    @Override
    public String timespan() {
        return this.inner().timespan();
    }

    @Override
    public List<MetricInner> value() {
        return this.inner().value();
    }

}
