/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01.implementation;

import com.microsoft.azure.management.iothub.v2020_03_01.RegistryStatistics;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class RegistryStatisticsImpl extends WrapperImpl<RegistryStatisticsInner> implements RegistryStatistics {
    private final DevicesManager manager;
    RegistryStatisticsImpl(RegistryStatisticsInner inner, DevicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevicesManager manager() {
        return this.manager;
    }

    @Override
    public Long disabledDeviceCount() {
        return this.inner().disabledDeviceCount();
    }

    @Override
    public Long enabledDeviceCount() {
        return this.inner().enabledDeviceCount();
    }

    @Override
    public Long totalDeviceCount() {
        return this.inner().totalDeviceCount();
    }

}
