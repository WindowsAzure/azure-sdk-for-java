/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Name availability result payload.
 */
public class NameAvailabilityInner {
    /**
     * Indicates whether the name is available.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /**
     * Reason why the name is not available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Message why the name is not available.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get indicates whether the name is available.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set indicates whether the name is available.
     *
     * @param nameAvailable the nameAvailable value to set
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get reason why the name is not available.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set reason why the name is not available.
     *
     * @param reason the reason value to set
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get message why the name is not available.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set message why the name is not available.
     *
     * @param message the message value to set
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withMessage(String message) {
        this.message = message;
        return this;
    }

}
