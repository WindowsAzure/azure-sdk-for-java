/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Properties for creating a schedule.
 */
@JsonFlatten
public class ScheduleCreationParameterFragment {
    /**
     * The status of the schedule (i.e. Enabled, Disabled). Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.status")
    private EnableStatus status;

    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     */
    @JsonProperty(value = "properties.taskType")
    private String taskType;

    /**
     * If the schedule will occur only some days of the week, specify the
     * weekly recurrence.
     */
    @JsonProperty(value = "properties.weeklyRecurrence")
    private WeekDetailsFragment weeklyRecurrence;

    /**
     * If the schedule will occur once each day of the week, specify the daily
     * recurrence.
     */
    @JsonProperty(value = "properties.dailyRecurrence")
    private DayDetailsFragment dailyRecurrence;

    /**
     * If the schedule will occur multiple times a day, specify the hourly
     * recurrence.
     */
    @JsonProperty(value = "properties.hourlyRecurrence")
    private HourDetailsFragment hourlyRecurrence;

    /**
     * The time zone ID (e.g. Pacific Standard time).
     */
    @JsonProperty(value = "properties.timeZoneId")
    private String timeZoneId;

    /**
     * Notification settings.
     */
    @JsonProperty(value = "properties.notificationSettings")
    private NotificationSettingsFragment notificationSettings;

    /**
     * The resource ID to which the schedule belongs.
     */
    @JsonProperty(value = "properties.targetResourceId")
    private String targetResourceId;

    /**
     * The name of the virtual machine or environment.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The location of the new virtual machine or environment.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The tags of the resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the status of the schedule (i.e. Enabled, Disabled). Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public EnableStatus status() {
        return this.status;
    }

    /**
     * Set the status of the schedule (i.e. Enabled, Disabled). Possible values include: 'Enabled', 'Disabled'.
     *
     * @param status the status value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withStatus(EnableStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     *
     * @return the taskType value
     */
    public String taskType() {
        return this.taskType;
    }

    /**
     * Set the task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     *
     * @param taskType the taskType value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * Get if the schedule will occur only some days of the week, specify the weekly recurrence.
     *
     * @return the weeklyRecurrence value
     */
    public WeekDetailsFragment weeklyRecurrence() {
        return this.weeklyRecurrence;
    }

    /**
     * Set if the schedule will occur only some days of the week, specify the weekly recurrence.
     *
     * @param weeklyRecurrence the weeklyRecurrence value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withWeeklyRecurrence(WeekDetailsFragment weeklyRecurrence) {
        this.weeklyRecurrence = weeklyRecurrence;
        return this;
    }

    /**
     * Get if the schedule will occur once each day of the week, specify the daily recurrence.
     *
     * @return the dailyRecurrence value
     */
    public DayDetailsFragment dailyRecurrence() {
        return this.dailyRecurrence;
    }

    /**
     * Set if the schedule will occur once each day of the week, specify the daily recurrence.
     *
     * @param dailyRecurrence the dailyRecurrence value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withDailyRecurrence(DayDetailsFragment dailyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
        return this;
    }

    /**
     * Get if the schedule will occur multiple times a day, specify the hourly recurrence.
     *
     * @return the hourlyRecurrence value
     */
    public HourDetailsFragment hourlyRecurrence() {
        return this.hourlyRecurrence;
    }

    /**
     * Set if the schedule will occur multiple times a day, specify the hourly recurrence.
     *
     * @param hourlyRecurrence the hourlyRecurrence value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withHourlyRecurrence(HourDetailsFragment hourlyRecurrence) {
        this.hourlyRecurrence = hourlyRecurrence;
        return this;
    }

    /**
     * Get the time zone ID (e.g. Pacific Standard time).
     *
     * @return the timeZoneId value
     */
    public String timeZoneId() {
        return this.timeZoneId;
    }

    /**
     * Set the time zone ID (e.g. Pacific Standard time).
     *
     * @param timeZoneId the timeZoneId value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    /**
     * Get notification settings.
     *
     * @return the notificationSettings value
     */
    public NotificationSettingsFragment notificationSettings() {
        return this.notificationSettings;
    }

    /**
     * Set notification settings.
     *
     * @param notificationSettings the notificationSettings value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withNotificationSettings(NotificationSettingsFragment notificationSettings) {
        this.notificationSettings = notificationSettings;
        return this;
    }

    /**
     * Get the resource ID to which the schedule belongs.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the resource ID to which the schedule belongs.
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the name of the virtual machine or environment.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the virtual machine or environment.
     *
     * @param name the name value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location of the new virtual machine or environment.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the new virtual machine or environment.
     *
     * @param location the location value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags of the resource.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags of the resource.
     *
     * @param tags the tags value to set
     * @return the ScheduleCreationParameterFragment object itself.
     */
    public ScheduleCreationParameterFragment withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
