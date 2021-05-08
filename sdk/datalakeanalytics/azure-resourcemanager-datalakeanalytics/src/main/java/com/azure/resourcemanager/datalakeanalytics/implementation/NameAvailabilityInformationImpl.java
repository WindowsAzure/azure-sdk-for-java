// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.resourcemanager.datalakeanalytics.fluent.models.NameAvailabilityInformationInner;
import com.azure.resourcemanager.datalakeanalytics.models.NameAvailabilityInformation;

public final class NameAvailabilityInformationImpl implements NameAvailabilityInformation {
    private NameAvailabilityInformationInner innerObject;

    private final com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager;

    NameAvailabilityInformationImpl(
        NameAvailabilityInformationInner innerObject,
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public NameAvailabilityInformationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }
}
