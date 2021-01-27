// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** workingHours. */
@Fluent
public final class MicrosoftGraphWorkingHours {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphWorkingHours.class);

    /*
     * The days of the week on which the user works.
     */
    @JsonProperty(value = "daysOfWeek")
    private List<MicrosoftGraphDayOfWeek> daysOfWeek;

    /*
     * The time of the day that the user stops working.
     */
    @JsonProperty(value = "endTime")
    private String endTime;

    /*
     * The time of the day that the user starts working.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /*
     * timeZoneBase
     */
    @JsonProperty(value = "timeZone")
    private MicrosoftGraphTimeZoneBase timeZone;

    /*
     * workingHours
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the daysOfWeek property: The days of the week on which the user works.
     *
     * @return the daysOfWeek value.
     */
    public List<MicrosoftGraphDayOfWeek> daysOfWeek() {
        return this.daysOfWeek;
    }

    /**
     * Set the daysOfWeek property: The days of the week on which the user works.
     *
     * @param daysOfWeek the daysOfWeek value to set.
     * @return the MicrosoftGraphWorkingHours object itself.
     */
    public MicrosoftGraphWorkingHours withDaysOfWeek(List<MicrosoftGraphDayOfWeek> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    /**
     * Get the endTime property: The time of the day that the user stops working.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The time of the day that the user stops working.
     *
     * @param endTime the endTime value to set.
     * @return the MicrosoftGraphWorkingHours object itself.
     */
    public MicrosoftGraphWorkingHours withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the startTime property: The time of the day that the user starts working.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The time of the day that the user starts working.
     *
     * @param startTime the startTime value to set.
     * @return the MicrosoftGraphWorkingHours object itself.
     */
    public MicrosoftGraphWorkingHours withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the timeZone property: timeZoneBase.
     *
     * @return the timeZone value.
     */
    public MicrosoftGraphTimeZoneBase timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: timeZoneBase.
     *
     * @param timeZone the timeZone value to set.
     * @return the MicrosoftGraphWorkingHours object itself.
     */
    public MicrosoftGraphWorkingHours withTimeZone(MicrosoftGraphTimeZoneBase timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the additionalProperties property: workingHours.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workingHours.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkingHours object itself.
     */
    public MicrosoftGraphWorkingHours withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timeZone() != null) {
            timeZone().validate();
        }
    }
}
