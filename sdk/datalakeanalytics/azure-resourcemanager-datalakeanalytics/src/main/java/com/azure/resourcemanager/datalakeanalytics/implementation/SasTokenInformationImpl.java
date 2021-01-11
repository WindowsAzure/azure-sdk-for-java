// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.SasTokenInformationInner;
import com.azure.resourcemanager.datalakeanalytics.models.SasTokenInformation;

public final class SasTokenInformationImpl implements SasTokenInformation {
    private SasTokenInformationInner innerObject;

    private final DataLakeAnalyticsManager serviceManager;

    SasTokenInformationImpl(SasTokenInformationInner innerObject, DataLakeAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String accessToken() {
        return this.innerModel().accessToken();
    }

    public SasTokenInformationInner innerModel() {
        return this.innerObject;
    }

    private DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }
}
