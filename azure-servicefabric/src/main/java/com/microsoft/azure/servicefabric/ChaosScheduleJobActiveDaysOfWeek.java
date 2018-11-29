/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the days of the week that a Chaos Schedule Job will run for.
 */
public class ChaosScheduleJobActiveDaysOfWeek {
    /**
     * Indicates if the Chaos Schedule Job will run on Sunday.
     */
    @JsonProperty(value = "Sunday")
    private Boolean sunday;

    /**
     * Indicates if the Chaos Schedule Job will run on Monday.
     */
    @JsonProperty(value = "Monday")
    private Boolean monday;

    /**
     * Indicates if the Chaos Schedule Job will run on Tuesday.
     */
    @JsonProperty(value = "Tuesday")
    private Boolean tuesday;

    /**
     * Indicates if the Chaos Schedule Job will run on Wednesday.
     */
    @JsonProperty(value = "Wednesday")
    private Boolean wednesday;

    /**
     * Indicates if the Chaos Schedule Job will run on Thursday.
     */
    @JsonProperty(value = "Thursday")
    private Boolean thursday;

    /**
     * Indicates if the Chaos Schedule Job will run on Friday.
     */
    @JsonProperty(value = "Friday")
    private Boolean friday;

    /**
     * Indicates if the Chaos Schedule Job will run on Saturday.
     */
    @JsonProperty(value = "Saturday")
    private Boolean saturday;

    /**
     * Get indicates if the Chaos Schedule Job will run on Sunday.
     *
     * @return the sunday value
     */
    public Boolean sunday() {
        return this.sunday;
    }

    /**
     * Set indicates if the Chaos Schedule Job will run on Sunday.
     *
     * @param sunday the sunday value to set
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek withSunday(Boolean sunday) {
        this.sunday = sunday;
        return this;
    }

    /**
     * Get indicates if the Chaos Schedule Job will run on Monday.
     *
     * @return the monday value
     */
    public Boolean monday() {
        return this.monday;
    }

    /**
     * Set indicates if the Chaos Schedule Job will run on Monday.
     *
     * @param monday the monday value to set
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek withMonday(Boolean monday) {
        this.monday = monday;
        return this;
    }

    /**
     * Get indicates if the Chaos Schedule Job will run on Tuesday.
     *
     * @return the tuesday value
     */
    public Boolean tuesday() {
        return this.tuesday;
    }

    /**
     * Set indicates if the Chaos Schedule Job will run on Tuesday.
     *
     * @param tuesday the tuesday value to set
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek withTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    /**
     * Get indicates if the Chaos Schedule Job will run on Wednesday.
     *
     * @return the wednesday value
     */
    public Boolean wednesday() {
        return this.wednesday;
    }

    /**
     * Set indicates if the Chaos Schedule Job will run on Wednesday.
     *
     * @param wednesday the wednesday value to set
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek withWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
        return this;
    }

    /**
     * Get indicates if the Chaos Schedule Job will run on Thursday.
     *
     * @return the thursday value
     */
    public Boolean thursday() {
        return this.thursday;
    }

    /**
     * Set indicates if the Chaos Schedule Job will run on Thursday.
     *
     * @param thursday the thursday value to set
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek withThursday(Boolean thursday) {
        this.thursday = thursday;
        return this;
    }

    /**
     * Get indicates if the Chaos Schedule Job will run on Friday.
     *
     * @return the friday value
     */
    public Boolean friday() {
        return this.friday;
    }

    /**
     * Set indicates if the Chaos Schedule Job will run on Friday.
     *
     * @param friday the friday value to set
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek withFriday(Boolean friday) {
        this.friday = friday;
        return this;
    }

    /**
     * Get indicates if the Chaos Schedule Job will run on Saturday.
     *
     * @return the saturday value
     */
    public Boolean saturday() {
        return this.saturday;
    }

    /**
     * Set indicates if the Chaos Schedule Job will run on Saturday.
     *
     * @param saturday the saturday value to set
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek withSaturday(Boolean saturday) {
        this.saturday = saturday;
        return this;
    }

}
