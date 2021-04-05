// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;

/** Event data for Microsoft.Devices.DeviceDeleted event. */
@Immutable
public final class IotHubDeviceDeletedEventData extends DeviceLifeCycleEventProperties {
    /** {@inheritDoc} */
    @Override
    public IotHubDeviceDeletedEventData setDeviceId(String deviceId) {
        super.setDeviceId(deviceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceDeletedEventData setHubName(String hubName) {
        super.setHubName(hubName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceDeletedEventData setTwin(DeviceTwinInfo twin) {
        super.setTwin(twin);
        return this;
    }
}
