/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.messaging.eventgrid.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for a device telemetry
 * event (DeviceTelemetry).
 */
public class DeviceTelemetryEventProperties {
    /**
     * The content of the message from the device.
     */
    @JsonProperty(value = "body")
    private Object body;

    /**
     * Application properties are user-defined strings that can be added to the
     * message. These fields are optional.
     */
    @JsonProperty(value = "properties")
    private Map<String, String> properties;

    /**
     * System properties help identify contents and source of the messages.
     */
    @JsonProperty(value = "systemProperties")
    private Map<String, String> systemProperties;

    /**
     * Get the content of the message from the device.
     *
     * @return the body value
     */
    public Object body() {
        return this.body;
    }

    /**
     * Set the content of the message from the device.
     *
     * @param body the body value to set
     * @return the DeviceTelemetryEventProperties object itself.
     */
    public DeviceTelemetryEventProperties withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Get application properties are user-defined strings that can be added to the message. These fields are optional.
     *
     * @return the properties value
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set application properties are user-defined strings that can be added to the message. These fields are optional.
     *
     * @param properties the properties value to set
     * @return the DeviceTelemetryEventProperties object itself.
     */
    public DeviceTelemetryEventProperties withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get system properties help identify contents and source of the messages.
     *
     * @return the systemProperties value
     */
    public Map<String, String> systemProperties() {
        return this.systemProperties;
    }

    /**
     * Set system properties help identify contents and source of the messages.
     *
     * @param systemProperties the systemProperties value to set
     * @return the DeviceTelemetryEventProperties object itself.
     */
    public DeviceTelemetryEventProperties withSystemProperties(Map<String, String> systemProperties) {
        this.systemProperties = systemProperties;
        return this;
    }

}
