// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.RequestReportRecordContractInner;
import com.azure.resourcemanager.apimanagement.models.RequestReportRecordContract;
import java.time.OffsetDateTime;

public final class RequestReportRecordContractImpl implements RequestReportRecordContract {
    private RequestReportRecordContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    RequestReportRecordContractImpl(
        RequestReportRecordContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String apiId() {
        return this.innerModel().apiId();
    }

    public String operationId() {
        return this.innerModel().operationId();
    }

    public String productId() {
        return this.innerModel().productId();
    }

    public String userId() {
        return this.innerModel().userId();
    }

    public String method() {
        return this.innerModel().method();
    }

    public String url() {
        return this.innerModel().url();
    }

    public String ipAddress() {
        return this.innerModel().ipAddress();
    }

    public String backendResponseCode() {
        return this.innerModel().backendResponseCode();
    }

    public Integer responseCode() {
        return this.innerModel().responseCode();
    }

    public Integer responseSize() {
        return this.innerModel().responseSize();
    }

    public OffsetDateTime timestamp() {
        return this.innerModel().timestamp();
    }

    public String cache() {
        return this.innerModel().cache();
    }

    public Double apiTime() {
        return this.innerModel().apiTime();
    }

    public Double serviceTime() {
        return this.innerModel().serviceTime();
    }

    public String apiRegion() {
        return this.innerModel().apiRegion();
    }

    public String subscriptionId() {
        return this.innerModel().subscriptionId();
    }

    public String requestId() {
        return this.innerModel().requestId();
    }

    public Integer requestSize() {
        return this.innerModel().requestSize();
    }

    public RequestReportRecordContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
