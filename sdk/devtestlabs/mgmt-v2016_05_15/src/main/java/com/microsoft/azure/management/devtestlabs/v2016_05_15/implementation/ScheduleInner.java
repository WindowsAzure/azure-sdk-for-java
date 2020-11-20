/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2016_05_15.EnableStatus;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.WeekDetails;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.DayDetails;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.HourDetails;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.NotificationSettings;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A schedule.
 */
@JsonFlatten
@SkipParentValidation
public class ScheduleInner extends Resource {
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
    private WeekDetails weeklyRecurrence;

    /**
     * If the schedule will occur once each day of the week, specify the daily
     * recurrence.
     */
    @JsonProperty(value = "properties.dailyRecurrence")
    private DayDetails dailyRecurrence;

    /**
     * If the schedule will occur multiple times a day, specify the hourly
     * recurrence.
     */
    @JsonProperty(value = "properties.hourlyRecurrence")
    private HourDetails hourlyRecurrence;

    /**
     * The time zone ID (e.g. Pacific Standard time).
     */
    @JsonProperty(value = "properties.timeZoneId")
    private String timeZoneId;

    /**
     * Notification settings.
     */
    @JsonProperty(value = "properties.notificationSettings")
    private NotificationSettings notificationSettings;

    /**
     * The creation date of the schedule.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdDate;

    /**
     * The resource ID to which the schedule belongs.
     */
    @JsonProperty(value = "properties.targetResourceId")
    private String targetResourceId;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

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
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withStatus(EnableStatus status) {
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
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * Get if the schedule will occur only some days of the week, specify the weekly recurrence.
     *
     * @return the weeklyRecurrence value
     */
    public WeekDetails weeklyRecurrence() {
        return this.weeklyRecurrence;
    }

    /**
     * Set if the schedule will occur only some days of the week, specify the weekly recurrence.
     *
     * @param weeklyRecurrence the weeklyRecurrence value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withWeeklyRecurrence(WeekDetails weeklyRecurrence) {
        this.weeklyRecurrence = weeklyRecurrence;
        return this;
    }

    /**
     * Get if the schedule will occur once each day of the week, specify the daily recurrence.
     *
     * @return the dailyRecurrence value
     */
    public DayDetails dailyRecurrence() {
        return this.dailyRecurrence;
    }

    /**
     * Set if the schedule will occur once each day of the week, specify the daily recurrence.
     *
     * @param dailyRecurrence the dailyRecurrence value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withDailyRecurrence(DayDetails dailyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
        return this;
    }

    /**
     * Get if the schedule will occur multiple times a day, specify the hourly recurrence.
     *
     * @return the hourlyRecurrence value
     */
    public HourDetails hourlyRecurrence() {
        return this.hourlyRecurrence;
    }

    /**
     * Set if the schedule will occur multiple times a day, specify the hourly recurrence.
     *
     * @param hourlyRecurrence the hourlyRecurrence value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withHourlyRecurrence(HourDetails hourlyRecurrence) {
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
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    /**
     * Get notification settings.
     *
     * @return the notificationSettings value
     */
    public NotificationSettings notificationSettings() {
        return this.notificationSettings;
    }

    /**
     * Set notification settings.
     *
     * @param notificationSettings the notificationSettings value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withNotificationSettings(NotificationSettings notificationSettings) {
        this.notificationSettings = notificationSettings;
        return this;
    }

    /**
     * Get the creation date of the schedule.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
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
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the unique immutable identifier of a resource (Guid).
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

}
