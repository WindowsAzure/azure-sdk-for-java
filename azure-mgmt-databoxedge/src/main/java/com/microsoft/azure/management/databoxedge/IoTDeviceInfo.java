/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata of IoT device/IoT Edge device to be configured.
 */
public class IoTDeviceInfo {
    /**
     * ID of the IoT device/edge device.
     */
    @JsonProperty(value = "deviceId", required = true)
    private String deviceId;

    /**
     * Host name for the IoT hub associated to the device.
     */
    @JsonProperty(value = "ioTHostHub", required = true)
    private String ioTHostHub;

    /**
     * Id for the IoT hub associated to the device.
     */
    @JsonProperty(value = "ioTHostHubId")
    private String ioTHostHubId;

    /**
     * Encrypted IoT device/IoT edge device connection string.
     */
    @JsonProperty(value = "authentication")
    private Authentication authentication;

    /**
     * Get iD of the IoT device/edge device.
     *
     * @return the deviceId value
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Set iD of the IoT device/edge device.
     *
     * @param deviceId the deviceId value to set
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get host name for the IoT hub associated to the device.
     *
     * @return the ioTHostHub value
     */
    public String ioTHostHub() {
        return this.ioTHostHub;
    }

    /**
     * Set host name for the IoT hub associated to the device.
     *
     * @param ioTHostHub the ioTHostHub value to set
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withIoTHostHub(String ioTHostHub) {
        this.ioTHostHub = ioTHostHub;
        return this;
    }

    /**
     * Get id for the IoT hub associated to the device.
     *
     * @return the ioTHostHubId value
     */
    public String ioTHostHubId() {
        return this.ioTHostHubId;
    }

    /**
     * Set id for the IoT hub associated to the device.
     *
     * @param ioTHostHubId the ioTHostHubId value to set
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withIoTHostHubId(String ioTHostHubId) {
        this.ioTHostHubId = ioTHostHubId;
        return this;
    }

    /**
     * Get encrypted IoT device/IoT edge device connection string.
     *
     * @return the authentication value
     */
    public Authentication authentication() {
        return this.authentication;
    }

    /**
     * Set encrypted IoT device/IoT edge device connection string.
     *
     * @param authentication the authentication value to set
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

}
