// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.datadog.fluent.models.DatadogAgreementResourceInner;
import com.azure.resourcemanager.datadog.models.DatadogAgreementProperties;
import com.azure.resourcemanager.datadog.models.DatadogAgreementResource;

public final class DatadogAgreementResourceImpl implements DatadogAgreementResource {
    private DatadogAgreementResourceInner innerObject;

    private final com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager;

    DatadogAgreementResourceImpl(
        DatadogAgreementResourceInner innerObject,
        com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public DatadogAgreementProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DatadogAgreementResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datadog.MicrosoftDatadogManager manager() {
        return this.serviceManager;
    }
}
