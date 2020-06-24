/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.Gateways;
import rx.Completable;

class GatewaysImpl extends WrapperImpl<GatewaysInner> implements Gateways {
    private final LogAnalyticsManager manager;

    GatewaysImpl(LogAnalyticsManager manager) {
        super(manager.inner().gateways());
        this.manager = manager;
    }

    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String gatewayId) {
        return manager().gateways().deleteAsync(resourceGroupName, workspaceName, gatewayId);
    }
}
