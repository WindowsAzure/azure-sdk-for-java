/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.ServerfarmResourceMetric;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.ResourceMetricValue;
import com.microsoft.azure.management.appservice.v2018_02_01.ResourceMetricName;
import com.microsoft.azure.management.appservice.v2018_02_01.ResourceMetricProperty;

class ServerfarmResourceMetricImpl extends WrapperImpl<ResourceMetricInner> implements ServerfarmResourceMetric {
    private final CertificateRegistrationManager manager;

    ServerfarmResourceMetricImpl(ResourceMetricInner inner,  CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }



    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<ResourceMetricValue> metricValues() {
        return this.inner().metricValues();
    }

    @Override
    public ResourceMetricName name() {
        return this.inner().name();
    }

    @Override
    public List<ResourceMetricProperty> properties() {
        return this.inner().properties();
    }

    @Override
    public String resourceId() {
        return this.inner().resourceId();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public String timeGrain() {
        return this.inner().timeGrain();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
