/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties indicating whether a given IoT Central application
 * information is available.
 */
public class AppAvailabilityInfoInner {
    /**
     * The value which indicates whether the provided name is available.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /**
     * The value which indicates whether the provided subdomain is available.
     */
    @JsonProperty(value = "subdomain", access = JsonProperty.Access.WRITE_ONLY)
    private String subdomain;

    /**
     * The reason for unavailability.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private String reason;

    /**
     * The detailed reason message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
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
     * Get the value which indicates whether the provided subdomain is available.
     *
     * @return the subdomain value
     */
    public String subdomain() {
        return this.subdomain;
    }

    /**
     * Get the reason for unavailability.
     *
     * @return the reason value
     */
    public String reason() {
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

}
