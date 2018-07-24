/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01.implementation;

import com.microsoft.azure.management.iotcentral.v2018_09_01.AppNameAvailabilityInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iotcentral.v2018_09_01.AppNameUnavailabilityReason;

class AppNameAvailabilityInfoImpl extends WrapperImpl<AppNameAvailabilityInfoInner> implements AppNameAvailabilityInfo {
    private final IoTCentralManager manager;
    AppNameAvailabilityInfoImpl(AppNameAvailabilityInfoInner inner, IoTCentralManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public IoTCentralManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public Boolean nameAvailable() {
        return this.inner().nameAvailable();
    }

    @Override
    public AppNameUnavailabilityReason reason() {
        return this.inner().reason();
    }

}
