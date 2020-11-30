/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Instance view status.
 */
public class InstanceViewStatus {
    /**
     * The status code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The level code. Possible values include: 'Info', 'Warning', 'Error'.
     */
    @JsonProperty(value = "level")
    private StatusLevelTypes level;

    /**
     * The short localizable label for the status.
     */
    @JsonProperty(value = "displayStatus")
    private String displayStatus;

    /**
     * The detailed status message, including for alerts and error messages.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The time of the status.
     */
    @JsonProperty(value = "time")
    private DateTime time;

    /**
     * Get the status code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the status code.
     *
     * @param code the code value to set
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the level code. Possible values include: 'Info', 'Warning', 'Error'.
     *
     * @return the level value
     */
    public StatusLevelTypes level() {
        return this.level;
    }

    /**
     * Set the level code. Possible values include: 'Info', 'Warning', 'Error'.
     *
     * @param level the level value to set
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withLevel(StatusLevelTypes level) {
        this.level = level;
        return this;
    }

    /**
     * Get the short localizable label for the status.
     *
     * @return the displayStatus value
     */
    public String displayStatus() {
        return this.displayStatus;
    }

    /**
     * Set the short localizable label for the status.
     *
     * @param displayStatus the displayStatus value to set
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    /**
     * Get the detailed status message, including for alerts and error messages.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the detailed status message, including for alerts and error messages.
     *
     * @param message the message value to set
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the time of the status.
     *
     * @return the time value
     */
    public DateTime time() {
        return this.time;
    }

    /**
     * Set the time of the status.
     *
     * @param time the time value to set
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withTime(DateTime time) {
        this.time = time;
        return this;
    }

}
