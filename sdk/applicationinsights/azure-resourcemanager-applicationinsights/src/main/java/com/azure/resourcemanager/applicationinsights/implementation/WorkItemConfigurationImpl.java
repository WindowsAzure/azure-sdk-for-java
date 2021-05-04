// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.resourcemanager.applicationinsights.fluent.models.WorkItemConfigurationInner;
import com.azure.resourcemanager.applicationinsights.models.WorkItemConfiguration;

public final class WorkItemConfigurationImpl implements WorkItemConfiguration {
    private WorkItemConfigurationInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    WorkItemConfigurationImpl(
        WorkItemConfigurationInner innerObject,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String connectorId() {
        return this.innerModel().connectorId();
    }

    public String configDisplayName() {
        return this.innerModel().configDisplayName();
    }

    public Boolean isDefault() {
        return this.innerModel().isDefault();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String configProperties() {
        return this.innerModel().configProperties();
    }

    public WorkItemConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
