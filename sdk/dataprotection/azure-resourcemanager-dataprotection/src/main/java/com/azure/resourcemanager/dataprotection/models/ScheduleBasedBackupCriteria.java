// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** Schedule based backup criteria. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("ScheduleBasedBackupCriteria")
@Fluent
public final class ScheduleBasedBackupCriteria extends BackupCriteria {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScheduleBasedBackupCriteria.class);

    /*
     * it contains absolute values like "AllBackup" / "FirstOfDay" /
     * "FirstOfWeek" / "FirstOfMonth"
     * and should be part of AbsoluteMarker enum
     */
    @JsonProperty(value = "absoluteCriteria")
    private List<AbsoluteMarker> absoluteCriteria;

    /*
     * This is day of the month from 1 to 28 other wise last of month
     */
    @JsonProperty(value = "daysOfMonth")
    private List<Day> daysOfMonth;

    /*
     * It should be Sunday/Monday/T..../Saturday
     */
    @JsonProperty(value = "daysOfTheWeek")
    private List<DayOfWeek> daysOfTheWeek;

    /*
     * It should be January/February/....../December
     */
    @JsonProperty(value = "monthsOfYear")
    private List<Month> monthsOfYear;

    /*
     * List of schedule times for backup
     */
    @JsonProperty(value = "scheduleTimes")
    private List<OffsetDateTime> scheduleTimes;

    /*
     * It should be First/Second/Third/Fourth/Last
     */
    @JsonProperty(value = "weeksOfTheMonth")
    private List<WeekNumber> weeksOfTheMonth;

    /**
     * Get the absoluteCriteria property: it contains absolute values like "AllBackup" / "FirstOfDay" / "FirstOfWeek" /
     * "FirstOfMonth" and should be part of AbsoluteMarker enum.
     *
     * @return the absoluteCriteria value.
     */
    public List<AbsoluteMarker> absoluteCriteria() {
        return this.absoluteCriteria;
    }

    /**
     * Set the absoluteCriteria property: it contains absolute values like "AllBackup" / "FirstOfDay" / "FirstOfWeek" /
     * "FirstOfMonth" and should be part of AbsoluteMarker enum.
     *
     * @param absoluteCriteria the absoluteCriteria value to set.
     * @return the ScheduleBasedBackupCriteria object itself.
     */
    public ScheduleBasedBackupCriteria withAbsoluteCriteria(List<AbsoluteMarker> absoluteCriteria) {
        this.absoluteCriteria = absoluteCriteria;
        return this;
    }

    /**
     * Get the daysOfMonth property: This is day of the month from 1 to 28 other wise last of month.
     *
     * @return the daysOfMonth value.
     */
    public List<Day> daysOfMonth() {
        return this.daysOfMonth;
    }

    /**
     * Set the daysOfMonth property: This is day of the month from 1 to 28 other wise last of month.
     *
     * @param daysOfMonth the daysOfMonth value to set.
     * @return the ScheduleBasedBackupCriteria object itself.
     */
    public ScheduleBasedBackupCriteria withDaysOfMonth(List<Day> daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
        return this;
    }

    /**
     * Get the daysOfTheWeek property: It should be Sunday/Monday/T..../Saturday.
     *
     * @return the daysOfTheWeek value.
     */
    public List<DayOfWeek> daysOfTheWeek() {
        return this.daysOfTheWeek;
    }

    /**
     * Set the daysOfTheWeek property: It should be Sunday/Monday/T..../Saturday.
     *
     * @param daysOfTheWeek the daysOfTheWeek value to set.
     * @return the ScheduleBasedBackupCriteria object itself.
     */
    public ScheduleBasedBackupCriteria withDaysOfTheWeek(List<DayOfWeek> daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
        return this;
    }

    /**
     * Get the monthsOfYear property: It should be January/February/....../December.
     *
     * @return the monthsOfYear value.
     */
    public List<Month> monthsOfYear() {
        return this.monthsOfYear;
    }

    /**
     * Set the monthsOfYear property: It should be January/February/....../December.
     *
     * @param monthsOfYear the monthsOfYear value to set.
     * @return the ScheduleBasedBackupCriteria object itself.
     */
    public ScheduleBasedBackupCriteria withMonthsOfYear(List<Month> monthsOfYear) {
        this.monthsOfYear = monthsOfYear;
        return this;
    }

    /**
     * Get the scheduleTimes property: List of schedule times for backup.
     *
     * @return the scheduleTimes value.
     */
    public List<OffsetDateTime> scheduleTimes() {
        return this.scheduleTimes;
    }

    /**
     * Set the scheduleTimes property: List of schedule times for backup.
     *
     * @param scheduleTimes the scheduleTimes value to set.
     * @return the ScheduleBasedBackupCriteria object itself.
     */
    public ScheduleBasedBackupCriteria withScheduleTimes(List<OffsetDateTime> scheduleTimes) {
        this.scheduleTimes = scheduleTimes;
        return this;
    }

    /**
     * Get the weeksOfTheMonth property: It should be First/Second/Third/Fourth/Last.
     *
     * @return the weeksOfTheMonth value.
     */
    public List<WeekNumber> weeksOfTheMonth() {
        return this.weeksOfTheMonth;
    }

    /**
     * Set the weeksOfTheMonth property: It should be First/Second/Third/Fourth/Last.
     *
     * @param weeksOfTheMonth the weeksOfTheMonth value to set.
     * @return the ScheduleBasedBackupCriteria object itself.
     */
    public ScheduleBasedBackupCriteria withWeeksOfTheMonth(List<WeekNumber> weeksOfTheMonth) {
        this.weeksOfTheMonth = weeksOfTheMonth;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (daysOfMonth() != null) {
            daysOfMonth().forEach(e -> e.validate());
        }
    }
}
