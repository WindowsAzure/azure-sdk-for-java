// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of the Data property of an EventGridEvent for a device life cycle event (DeviceCreated, DeviceDeleted). */
@Fluent
public class DeviceLifeCycleEventProperties {
    /*
     * The unique identifier of the device. This case-sensitive string can be
     * up to 128 characters long, and supports ASCII 7-bit alphanumeric
     * characters plus the following special characters: - : . + % _ &#35; * ?
     * ! ( ) , = @ ; $ '.
     */
    @JsonProperty(value = "deviceId")
    private String deviceId;

    /*
     * Name of the IoT Hub where the device was created or deleted.
     */
    @JsonProperty(value = "hubName")
    private String hubName;

    /*
     * Information about the device twin, which is the cloud representation of
     * application device metadata.
     */
    @JsonProperty(value = "twin")
    private DeviceTwinInfo twin;

    /**
     * Get the deviceId property: The unique identifier of the device. This case-sensitive string can be up to 128
     * characters long, and supports ASCII 7-bit alphanumeric characters plus the following special characters: - : . +
     * % _ &amp;#35; * ? ! ( ) , = @ ; $ '.
     *
     * @return the deviceId value.
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: The unique identifier of the device. This case-sensitive string can be up to 128
     * characters long, and supports ASCII 7-bit alphanumeric characters plus the following special characters: - : . +
     * % _ &amp;#35; * ? ! ( ) , = @ ; $ '.
     *
     * @param deviceId the deviceId value to set.
     * @return the DeviceLifeCycleEventProperties object itself.
     */
    public DeviceLifeCycleEventProperties setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the hubName property: Name of the IoT Hub where the device was created or deleted.
     *
     * @return the hubName value.
     */
    public String getHubName() {
        return this.hubName;
    }

    /**
     * Set the hubName property: Name of the IoT Hub where the device was created or deleted.
     *
     * @param hubName the hubName value to set.
     * @return the DeviceLifeCycleEventProperties object itself.
     */
    public DeviceLifeCycleEventProperties setHubName(String hubName) {
        this.hubName = hubName;
        return this;
    }

    /**
     * Get the twin property: Information about the device twin, which is the cloud representation of application device
     * metadata.
     *
     * @return the twin value.
     */
    public DeviceTwinInfo getTwin() {
        return this.twin;
    }

    /**
     * Set the twin property: Information about the device twin, which is the cloud representation of application device
     * metadata.
     *
     * @param twin the twin value to set.
     * @return the DeviceLifeCycleEventProperties object itself.
     */
    public DeviceLifeCycleEventProperties setTwin(DeviceTwinInfo twin) {
        this.twin = twin;
        return this;
    }
}
