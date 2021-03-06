// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update identifier and the number of devices for which the update is applicable. */
@Fluent
public final class UpdatableDevices {
    /*
     * Update identity.
     */
    @JsonProperty(value = "updateId", required = true)
    private UpdateId updateId;

    /*
     * Total number of devices for which the update is applicable.
     */
    @JsonProperty(value = "deviceCount", required = true)
    private int deviceCount;

    /**
     * Get the updateId property: Update identity.
     *
     * @return the updateId value.
     */
    public UpdateId getUpdateId() {
        return this.updateId;
    }

    /**
     * Set the updateId property: Update identity.
     *
     * @param updateId the updateId value to set.
     * @return the UpdatableDevices object itself.
     */
    public UpdatableDevices setUpdateId(UpdateId updateId) {
        this.updateId = updateId;
        return this;
    }

    /**
     * Get the deviceCount property: Total number of devices for which the update is applicable.
     *
     * @return the deviceCount value.
     */
    public int getDeviceCount() {
        return this.deviceCount;
    }

    /**
     * Set the deviceCount property: Total number of devices for which the update is applicable.
     *
     * @param deviceCount the deviceCount value to set.
     * @return the UpdatableDevices object itself.
     */
    public UpdatableDevices setDeviceCount(int deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
}
