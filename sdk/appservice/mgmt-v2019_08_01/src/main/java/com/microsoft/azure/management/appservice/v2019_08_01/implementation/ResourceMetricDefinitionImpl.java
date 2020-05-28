/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.ResourceMetricDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.appservice.v2019_08_01.ResourceMetricAvailability;
import java.util.Map;

class ResourceMetricDefinitionImpl extends WrapperImpl<ResourceMetricDefinitionInner> implements ResourceMetricDefinition {
    private final CertificateRegistrationManager manager;

    ResourceMetricDefinitionImpl(ResourceMetricDefinitionInner inner,  CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
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
    public List<ResourceMetricAvailability> metricAvailabilities() {
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
    public Map<String, String> properties() {
        return this.inner().properties();
    }

    @Override
    public String resourceUri() {
        return this.inner().resourceUri();
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
