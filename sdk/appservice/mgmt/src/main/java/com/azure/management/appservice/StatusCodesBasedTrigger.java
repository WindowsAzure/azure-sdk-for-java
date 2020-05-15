// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StatusCodesBasedTrigger model. */
@Fluent
public final class StatusCodesBasedTrigger {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StatusCodesBasedTrigger.class);

    /*
     * HTTP status code.
     */
    @JsonProperty(value = "status")
    private Integer status;

    /*
     * Request Sub Status.
     */
    @JsonProperty(value = "subStatus")
    private Integer subStatus;

    /*
     * Win32 error code.
     */
    @JsonProperty(value = "win32Status")
    private Integer win32Status;

    /*
     * Request Count.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * Time interval.
     */
    @JsonProperty(value = "timeInterval")
    private String timeInterval;

    /**
     * Get the status property: HTTP status code.
     *
     * @return the status value.
     */
    public Integer status() {
        return this.status;
    }

    /**
     * Set the status property: HTTP status code.
     *
     * @param status the status value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get the subStatus property: Request Sub Status.
     *
     * @return the subStatus value.
     */
    public Integer subStatus() {
        return this.subStatus;
    }

    /**
     * Set the subStatus property: Request Sub Status.
     *
     * @param subStatus the subStatus value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withSubStatus(Integer subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /**
     * Get the win32Status property: Win32 error code.
     *
     * @return the win32Status value.
     */
    public Integer win32Status() {
        return this.win32Status;
    }

    /**
     * Set the win32Status property: Win32 error code.
     *
     * @param win32Status the win32Status value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withWin32Status(Integer win32Status) {
        this.win32Status = win32Status;
        return this;
    }

    /**
     * Get the count property: Request Count.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Request Count.
     *
     * @param count the count value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the timeInterval property: Time interval.
     *
     * @return the timeInterval value.
     */
    public String timeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval property: Time interval.
     *
     * @param timeInterval the timeInterval value to set.
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
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
