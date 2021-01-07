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
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/** recurrenceRange. */
@Fluent
public final class MicrosoftGraphRecurrenceRange {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphRecurrenceRange.class);

    /*
     * The date to stop applying the recurrence pattern. Depending on the
     * recurrence pattern of the event, the last occurrence of the meeting may
     * not be this date. Required if type is endDate.
     */
    @JsonProperty(value = "endDate")
    private LocalDate endDate;

    /*
     * The number of times to repeat the event. Required and must be positive
     * if type is numbered.
     */
    @JsonProperty(value = "numberOfOccurrences")
    private Integer numberOfOccurrences;

    /*
     * Time zone for the startDate and endDate properties. Optional. If not
     * specified, the time zone of the event is used.
     */
    @JsonProperty(value = "recurrenceTimeZone")
    private String recurrenceTimeZone;

    /*
     * The date to start applying the recurrence pattern. The first occurrence
     * of the meeting may be this date or later, depending on the recurrence
     * pattern of the event. Must be the same value as the start property of
     * the recurring event. Required.
     */
    @JsonProperty(value = "startDate")
    private LocalDate startDate;

    /*
     * The type property.
     */
    @JsonProperty(value = "type")
    private MicrosoftGraphRecurrenceRangeType type;

    /*
     * recurrenceRange
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the endDate property: The date to stop applying the recurrence pattern. Depending on the recurrence pattern
     * of the event, the last occurrence of the meeting may not be this date. Required if type is endDate.
     *
     * @return the endDate value.
     */
    public LocalDate endDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: The date to stop applying the recurrence pattern. Depending on the recurrence pattern
     * of the event, the last occurrence of the meeting may not be this date. Required if type is endDate.
     *
     * @param endDate the endDate value to set.
     * @return the MicrosoftGraphRecurrenceRange object itself.
     */
    public MicrosoftGraphRecurrenceRange withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the numberOfOccurrences property: The number of times to repeat the event. Required and must be positive if
     * type is numbered.
     *
     * @return the numberOfOccurrences value.
     */
    public Integer numberOfOccurrences() {
        return this.numberOfOccurrences;
    }

    /**
     * Set the numberOfOccurrences property: The number of times to repeat the event. Required and must be positive if
     * type is numbered.
     *
     * @param numberOfOccurrences the numberOfOccurrences value to set.
     * @return the MicrosoftGraphRecurrenceRange object itself.
     */
    public MicrosoftGraphRecurrenceRange withNumberOfOccurrences(Integer numberOfOccurrences) {
        this.numberOfOccurrences = numberOfOccurrences;
        return this;
    }

    /**
     * Get the recurrenceTimeZone property: Time zone for the startDate and endDate properties. Optional. If not
     * specified, the time zone of the event is used.
     *
     * @return the recurrenceTimeZone value.
     */
    public String recurrenceTimeZone() {
        return this.recurrenceTimeZone;
    }

    /**
     * Set the recurrenceTimeZone property: Time zone for the startDate and endDate properties. Optional. If not
     * specified, the time zone of the event is used.
     *
     * @param recurrenceTimeZone the recurrenceTimeZone value to set.
     * @return the MicrosoftGraphRecurrenceRange object itself.
     */
    public MicrosoftGraphRecurrenceRange withRecurrenceTimeZone(String recurrenceTimeZone) {
        this.recurrenceTimeZone = recurrenceTimeZone;
        return this;
    }

    /**
     * Get the startDate property: The date to start applying the recurrence pattern. The first occurrence of the
     * meeting may be this date or later, depending on the recurrence pattern of the event. Must be the same value as
     * the start property of the recurring event. Required.
     *
     * @return the startDate value.
     */
    public LocalDate startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The date to start applying the recurrence pattern. The first occurrence of the
     * meeting may be this date or later, depending on the recurrence pattern of the event. Must be the same value as
     * the start property of the recurring event. Required.
     *
     * @param startDate the startDate value to set.
     * @return the MicrosoftGraphRecurrenceRange object itself.
     */
    public MicrosoftGraphRecurrenceRange withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public MicrosoftGraphRecurrenceRangeType type() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the MicrosoftGraphRecurrenceRange object itself.
     */
    public MicrosoftGraphRecurrenceRange withType(MicrosoftGraphRecurrenceRangeType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the additionalProperties property: recurrenceRange.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: recurrenceRange.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphRecurrenceRange object itself.
     */
    public MicrosoftGraphRecurrenceRange withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    }
}
