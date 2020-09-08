// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TrafficManagerNameAvailability model. */
@Fluent
public final class TrafficManagerNameAvailabilityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TrafficManagerNameAvailabilityInner.class);

    /*
     * The relative name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Traffic Manager profile resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Describes whether the relative name is available or not.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /*
     * The reason why the name is not available, when applicable.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /*
     * Descriptive message that explains why the name is not available, when
     * applicable.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the name property: The relative name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The relative name.
     *
     * @param name the name value to set.
     * @return the TrafficManagerNameAvailabilityInner object itself.
     */
    public TrafficManagerNameAvailabilityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Traffic Manager profile resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Traffic Manager profile resource type.
     *
     * @param type the type value to set.
     * @return the TrafficManagerNameAvailabilityInner object itself.
     */
    public TrafficManagerNameAvailabilityInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the nameAvailable property: Describes whether the relative name is available or not.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Describes whether the relative name is available or not.
     *
     * @param nameAvailable the nameAvailable value to set.
     * @return the TrafficManagerNameAvailabilityInner object itself.
     */
    public TrafficManagerNameAvailabilityInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: The reason why the name is not available, when applicable.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason why the name is not available, when applicable.
     *
     * @param reason the reason value to set.
     * @return the TrafficManagerNameAvailabilityInner object itself.
     */
    public TrafficManagerNameAvailabilityInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: Descriptive message that explains why the name is not available, when applicable.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Descriptive message that explains why the name is not available, when applicable.
     *
     * @param message the message value to set.
     * @return the TrafficManagerNameAvailabilityInner object itself.
     */
    public TrafficManagerNameAvailabilityInner withMessage(String message) {
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
