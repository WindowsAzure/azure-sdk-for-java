/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01.implementation;

import com.microsoft.azure.management.iothub.v2020_03_01.IotHubNameUnavailabilityReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties indicating whether a given IoT hub name is available.
 */
public class IotHubNameAvailabilityInfoInner {
    /**
     * The value which indicates whether the provided name is available.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /**
     * The reason for unavailability. Possible values include: 'Invalid',
     * 'AlreadyExists'.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private IotHubNameUnavailabilityReason reason;

    /**
     * The detailed reason message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the value which indicates whether the provided name is available.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the reason for unavailability. Possible values include: 'Invalid', 'AlreadyExists'.
     *
     * @return the reason value
     */
    public IotHubNameUnavailabilityReason reason() {
        return this.reason;
    }

    /**
     * Get the detailed reason message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the detailed reason message.
     *
     * @param message the message value to set
     * @return the IotHubNameAvailabilityInfoInner object itself.
     */
    public IotHubNameAvailabilityInfoInner withMessage(String message) {
        this.message = message;
        return this;
    }

}
