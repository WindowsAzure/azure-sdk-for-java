/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.RequestReportRecordContract;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;

class RequestReportRecordContractImpl extends WrapperImpl<RequestReportRecordContractInner> implements RequestReportRecordContract {
    private final ApiManagementManager manager;
    RequestReportRecordContractImpl(RequestReportRecordContractInner inner, ApiManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public String apiId() {
        return this.inner().apiId();
    }

    @Override
    public String apiRegion() {
        return this.inner().apiRegion();
    }

    @Override
    public Double apiTime() {
        return this.inner().apiTime();
    }

    @Override
    public String backendResponseCode() {
        return this.inner().backendResponseCode();
    }

    @Override
    public String cache() {
        return this.inner().cache();
    }

    @Override
    public String ipAddress() {
        return this.inner().ipAddress();
    }

    @Override
    public String method() {
        return this.inner().method();
    }

    @Override
    public String operationId() {
        return this.inner().operationId();
    }

    @Override
    public String productId() {
        return this.inner().productId();
    }

    @Override
    public String requestId() {
        return this.inner().requestId();
    }

    @Override
    public Integer requestSize() {
        return this.inner().requestSize();
    }

    @Override
    public Integer responseCode() {
        return this.inner().responseCode();
    }

    @Override
    public Integer responseSize() {
        return this.inner().responseSize();
    }

    @Override
    public Double serviceTime() {
        return this.inner().serviceTime();
    }

    @Override
    public String subscriptionId() {
        return this.inner().subscriptionId();
    }

    @Override
    public DateTime timestamp() {
        return this.inner().timestamp();
    }

    @Override
    public String url() {
        return this.inner().url();
    }

    @Override
    public String userId() {
        return this.inner().userId();
    }

}
