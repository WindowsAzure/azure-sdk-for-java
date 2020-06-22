/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.FlowLogInformation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_05_01.TrafficAnalyticsProperties;
import com.microsoft.azure.management.network.v2020_05_01.FlowLogFormatParameters;
import com.microsoft.azure.management.network.v2020_05_01.RetentionPolicyParameters;

class FlowLogInformationImpl extends WrapperImpl<FlowLogInformationInner> implements FlowLogInformation {
    private final NetworkManager manager;
    FlowLogInformationImpl(FlowLogInformationInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public TrafficAnalyticsProperties flowAnalyticsConfiguration() {
        return this.inner().flowAnalyticsConfiguration();
    }

    @Override
    public FlowLogFormatParameters format() {
        return this.inner().format();
    }

    @Override
    public RetentionPolicyParameters retentionPolicy() {
        return this.inner().retentionPolicy();
    }

    @Override
    public String storageId() {
        return this.inner().storageId();
    }

    @Override
    public String targetResourceId() {
        return this.inner().targetResourceId();
    }

}
