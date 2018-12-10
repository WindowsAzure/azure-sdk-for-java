/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01.implementation;

import com.microsoft.azure.management.iothub.v2018_12_01.EndpointHealthData;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iothub.v2018_12_01.EndpointHealthStatus;

class EndpointHealthDataImpl extends WrapperImpl<EndpointHealthDataInner> implements EndpointHealthData {
    private final DevicesManager manager;
    EndpointHealthDataImpl(EndpointHealthDataInner inner, DevicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevicesManager manager() {
        return this.manager;
    }

    @Override
    public String endpointId() {
        return this.inner().endpointId();
    }

    @Override
    public EndpointHealthStatus healthStatus() {
        return this.inner().healthStatus();
    }

}
