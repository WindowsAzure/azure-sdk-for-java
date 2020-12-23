// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Time in a week. */
@Fluent
public final class TimeInWeek {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TimeInWeek.class);

    /*
     * A day in a week.
     */
    @JsonProperty(value = "day")
    private WeekDay day;

    /*
     * hour slots in a day.
     */
    @JsonProperty(value = "hourSlots")
    private List<Integer> hourSlots;

    /**
     * Get the day property: A day in a week.
     *
     * @return the day value.
     */
    public WeekDay day() {
        return this.day;
    }

    /**
     * Set the day property: A day in a week.
     *
     * @param day the day value to set.
     * @return the TimeInWeek object itself.
     */
    public TimeInWeek withDay(WeekDay day) {
        this.day = day;
        return this;
    }

    /**
     * Get the hourSlots property: hour slots in a day.
     *
     * @return the hourSlots value.
     */
    public List<Integer> hourSlots() {
        return this.hourSlots;
    }

    /**
     * Set the hourSlots property: hour slots in a day.
     *
     * @param hourSlots the hourSlots value to set.
     * @return the TimeInWeek object itself.
     */
    public TimeInWeek withHourSlots(List<Integer> hourSlots) {
        this.hourSlots = hourSlots;
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
