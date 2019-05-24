/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview.implementation;

import com.microsoft.azure.management.iothub.v2019_03_22_preview.EndpointHealthStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The health data for an endpoint.
 */
public class EndpointHealthDataInner {
    /**
     * Id of the endpoint.
     */
    @JsonProperty(value = "endpointId")
    private String endpointId;

    /**
     * Health statuses have following meanings. The 'healthy' status shows that
     * the endpoint is accepting messages as expected. The 'unhealthy' status
     * shows that the endpoint is not accepting messages as expected and IoT
     * Hub is retrying to send data to this endpoint. The status of an
     * unhealthy endpoint will be updated to healthy when IoT Hub has
     * established an eventually consistent state of health. The 'dead' status
     * shows that the endpoint is not accepting messages, after IoT Hub retried
     * sending messages for the retrial period. See IoT Hub metrics to identify
     * errors and monitor issues with endpoints. The 'unknown' status shows
     * that the IoT Hub has not established a connection with the endpoint. No
     * messages have been delivered to or rejected from this endpoint. Possible
     * values include: 'unknown', 'healthy', 'unhealthy', 'dead'.
     */
    @JsonProperty(value = "healthStatus")
    private EndpointHealthStatus healthStatus;

    /**
     * Get id of the endpoint.
     *
     * @return the endpointId value
     */
    public String endpointId() {
        return this.endpointId;
    }

    /**
     * Set id of the endpoint.
     *
     * @param endpointId the endpointId value to set
     * @return the EndpointHealthDataInner object itself.
     */
    public EndpointHealthDataInner withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * Get health statuses have following meanings. The 'healthy' status shows that the endpoint is accepting messages as expected. The 'unhealthy' status shows that the endpoint is not accepting messages as expected and IoT Hub is retrying to send data to this endpoint. The status of an unhealthy endpoint will be updated to healthy when IoT Hub has established an eventually consistent state of health. The 'dead' status shows that the endpoint is not accepting messages, after IoT Hub retried sending messages for the retrial period. See IoT Hub metrics to identify errors and monitor issues with endpoints. The 'unknown' status shows that the IoT Hub has not established a connection with the endpoint. No messages have been delivered to or rejected from this endpoint. Possible values include: 'unknown', 'healthy', 'unhealthy', 'dead'.
     *
     * @return the healthStatus value
     */
    public EndpointHealthStatus healthStatus() {
        return this.healthStatus;
    }

    /**
     * Set health statuses have following meanings. The 'healthy' status shows that the endpoint is accepting messages as expected. The 'unhealthy' status shows that the endpoint is not accepting messages as expected and IoT Hub is retrying to send data to this endpoint. The status of an unhealthy endpoint will be updated to healthy when IoT Hub has established an eventually consistent state of health. The 'dead' status shows that the endpoint is not accepting messages, after IoT Hub retried sending messages for the retrial period. See IoT Hub metrics to identify errors and monitor issues with endpoints. The 'unknown' status shows that the IoT Hub has not established a connection with the endpoint. No messages have been delivered to or rejected from this endpoint. Possible values include: 'unknown', 'healthy', 'unhealthy', 'dead'.
     *
     * @param healthStatus the healthStatus value to set
     * @return the EndpointHealthDataInner object itself.
     */
    public EndpointHealthDataInner withHealthStatus(EndpointHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

}
