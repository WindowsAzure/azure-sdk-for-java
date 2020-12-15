// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Instance view status. */
@Immutable
public final class MachineExtensionInstanceViewStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MachineExtensionInstanceViewStatus.class);

    /*
     * The status code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * The level code.
     */
    @JsonProperty(value = "level", access = JsonProperty.Access.WRITE_ONLY)
    private StatusLevelTypes level;

    /*
     * The short localizable label for the status.
     */
    @JsonProperty(value = "displayStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String displayStatus;

    /*
     * The detailed status message, including for alerts and error messages.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The time of the status.
     */
    @JsonProperty(value = "time", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime time;

    /**
     * Get the code property: The status code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the level property: The level code.
     *
     * @return the level value.
     */
    public StatusLevelTypes level() {
        return this.level;
    }

    /**
     * Get the displayStatus property: The short localizable label for the status.
     *
     * @return the displayStatus value.
     */
    public String displayStatus() {
        return this.displayStatus;
    }

    /**
     * Get the message property: The detailed status message, including for alerts and error messages.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the time property: The time of the status.
     *
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
