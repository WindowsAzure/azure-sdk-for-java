// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentQuotaStatusInner;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentQuotaStatus;

public final class ApplicationInsightsComponentQuotaStatusImpl implements ApplicationInsightsComponentQuotaStatus {
    private ApplicationInsightsComponentQuotaStatusInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    ApplicationInsightsComponentQuotaStatusImpl(
        ApplicationInsightsComponentQuotaStatusInner innerObject,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String appId() {
        return this.innerModel().appId();
    }

    public Boolean shouldBeThrottled() {
        return this.innerModel().shouldBeThrottled();
    }

    public String expirationTime() {
        return this.innerModel().expirationTime();
    }

    public ApplicationInsightsComponentQuotaStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
