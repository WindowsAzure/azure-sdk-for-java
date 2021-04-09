// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metadata of IoT device/IoT Edge device to be configured. */
@Fluent
public final class IoTDeviceInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IoTDeviceInfo.class);

    /*
     * ID of the IoT device/edge device.
     */
    @JsonProperty(value = "deviceId", required = true)
    private String deviceId;

    /*
     * Host name for the IoT hub associated to the device.
     */
    @JsonProperty(value = "ioTHostHub", required = true)
    private String ioTHostHub;

    /*
     * Id for the IoT hub associated to the device.
     */
    @JsonProperty(value = "ioTHostHubId")
    private String ioTHostHubId;

    /*
     * IoT device authentication info.
     */
    @JsonProperty(value = "authentication")
    private Authentication authentication;

    /**
     * Get the deviceId property: ID of the IoT device/edge device.
     *
     * @return the deviceId value.
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: ID of the IoT device/edge device.
     *
     * @param deviceId the deviceId value to set.
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the ioTHostHub property: Host name for the IoT hub associated to the device.
     *
     * @return the ioTHostHub value.
     */
    public String ioTHostHub() {
        return this.ioTHostHub;
    }

    /**
     * Set the ioTHostHub property: Host name for the IoT hub associated to the device.
     *
     * @param ioTHostHub the ioTHostHub value to set.
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withIoTHostHub(String ioTHostHub) {
        this.ioTHostHub = ioTHostHub;
        return this;
    }

    /**
     * Get the ioTHostHubId property: Id for the IoT hub associated to the device.
     *
     * @return the ioTHostHubId value.
     */
    public String ioTHostHubId() {
        return this.ioTHostHubId;
    }

    /**
     * Set the ioTHostHubId property: Id for the IoT hub associated to the device.
     *
     * @param ioTHostHubId the ioTHostHubId value to set.
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withIoTHostHubId(String ioTHostHubId) {
        this.ioTHostHubId = ioTHostHubId;
        return this;
    }

    /**
     * Get the authentication property: IoT device authentication info.
     *
     * @return the authentication value.
     */
    public Authentication authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: IoT device authentication info.
     *
     * @param authentication the authentication value to set.
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deviceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property deviceId in model IoTDeviceInfo"));
        }
        if (ioTHostHub() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ioTHostHub in model IoTDeviceInfo"));
        }
        if (authentication() != null) {
            authentication().validate();
        }
    }
}
