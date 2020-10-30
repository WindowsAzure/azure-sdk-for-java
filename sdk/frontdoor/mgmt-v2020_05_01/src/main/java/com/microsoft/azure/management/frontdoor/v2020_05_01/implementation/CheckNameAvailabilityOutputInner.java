/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import com.microsoft.azure.management.frontdoor.v2020_05_01.Availability;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Output of check name availability API.
 */
public class CheckNameAvailabilityOutputInner {
    /**
     * Indicates whether the name is available. Possible values include:
     * 'Available', 'Unavailable'.
     */
    @JsonProperty(value = "nameAvailability", access = JsonProperty.Access.WRITE_ONLY)
    private Availability nameAvailability;

    /**
     * The reason why the name is not available.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private String reason;

    /**
     * The detailed error message describing why the name is not available.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get indicates whether the name is available. Possible values include: 'Available', 'Unavailable'.
     *
     * @return the nameAvailability value
     */
    public Availability nameAvailability() {
        return this.nameAvailability;
    }

    /**
     * Get the reason why the name is not available.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Get the detailed error message describing why the name is not available.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
