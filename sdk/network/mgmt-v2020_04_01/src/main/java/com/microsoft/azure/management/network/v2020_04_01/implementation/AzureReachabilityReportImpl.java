/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.management.network.v2020_04_01.AzureReachabilityReport;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_04_01.AzureReachabilityReportLocation;
import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.AzureReachabilityReportItem;

class AzureReachabilityReportImpl extends WrapperImpl<AzureReachabilityReportInner> implements AzureReachabilityReport {
    private final NetworkManager manager;
    AzureReachabilityReportImpl(AzureReachabilityReportInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public String aggregationLevel() {
        return this.inner().aggregationLevel();
    }

    @Override
    public AzureReachabilityReportLocation providerLocation() {
        return this.inner().providerLocation();
    }

    @Override
    public List<AzureReachabilityReportItem> reachabilityReport() {
        return this.inner().reachabilityReport();
    }

}
