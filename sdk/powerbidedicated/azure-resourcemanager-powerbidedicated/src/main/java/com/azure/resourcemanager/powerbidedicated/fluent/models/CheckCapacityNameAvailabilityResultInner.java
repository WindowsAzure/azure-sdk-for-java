// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The checking result of capacity name availability. */
@Fluent
public final class CheckCapacityNameAvailabilityResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckCapacityNameAvailabilityResultInner.class);

    /*
     * Indicator of availability of the capacity name.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /*
     * The reason of unavailability.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /*
     * The detailed message of the request unavailability.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the nameAvailable property: Indicator of availability of the capacity name.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Indicator of availability of the capacity name.
     *
     * @param nameAvailable the nameAvailable value to set.
     * @return the CheckCapacityNameAvailabilityResultInner object itself.
     */
    public CheckCapacityNameAvailabilityResultInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: The reason of unavailability.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason of unavailability.
     *
     * @param reason the reason value to set.
     * @return the CheckCapacityNameAvailabilityResultInner object itself.
     */
    public CheckCapacityNameAvailabilityResultInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: The detailed message of the request unavailability.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The detailed message of the request unavailability.
     *
     * @param message the message value to set.
     * @return the CheckCapacityNameAvailabilityResultInner object itself.
     */
    public CheckCapacityNameAvailabilityResultInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
