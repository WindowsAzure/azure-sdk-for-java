/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.MetricDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.MetricAvailabilily;

class MetricDefinitionImpl extends WrapperImpl<MetricDefinitionInner> implements MetricDefinition {
    private final CertificateRegistrationManager manager;
    MetricDefinitionImpl(MetricDefinitionInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public List<MetricAvailabilily> metricAvailabilities() {
        return this.inner().metricAvailabilities();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String primaryAggregationType() {
        return this.inner().primaryAggregationType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
