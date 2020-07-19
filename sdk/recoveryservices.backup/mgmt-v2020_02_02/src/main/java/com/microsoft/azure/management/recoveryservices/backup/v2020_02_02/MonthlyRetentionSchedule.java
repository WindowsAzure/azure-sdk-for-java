/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Monthly retention schedule.
 */
public class MonthlyRetentionSchedule {
    /**
     * Retention schedule format type for monthly retention policy. Possible
     * values include: 'Invalid', 'Daily', 'Weekly'.
     */
    @JsonProperty(value = "retentionScheduleFormatType")
    private RetentionScheduleFormat retentionScheduleFormatType;

    /**
     * Daily retention format for monthly retention policy.
     */
    @JsonProperty(value = "retentionScheduleDaily")
    private DailyRetentionFormat retentionScheduleDaily;

    /**
     * Weekly retention format for monthly retention policy.
     */
    @JsonProperty(value = "retentionScheduleWeekly")
    private WeeklyRetentionFormat retentionScheduleWeekly;

    /**
     * Retention times of retention policy.
     */
    @JsonProperty(value = "retentionTimes")
    private List<DateTime> retentionTimes;

    /**
     * Retention duration of retention Policy.
     */
    @JsonProperty(value = "retentionDuration")
    private RetentionDuration retentionDuration;

    /**
     * Get retention schedule format type for monthly retention policy. Possible values include: 'Invalid', 'Daily', 'Weekly'.
     *
     * @return the retentionScheduleFormatType value
     */
    public RetentionScheduleFormat retentionScheduleFormatType() {
        return this.retentionScheduleFormatType;
    }

    /**
     * Set retention schedule format type for monthly retention policy. Possible values include: 'Invalid', 'Daily', 'Weekly'.
     *
     * @param retentionScheduleFormatType the retentionScheduleFormatType value to set
     * @return the MonthlyRetentionSchedule object itself.
     */
    public MonthlyRetentionSchedule withRetentionScheduleFormatType(RetentionScheduleFormat retentionScheduleFormatType) {
        this.retentionScheduleFormatType = retentionScheduleFormatType;
        return this;
    }

    /**
     * Get daily retention format for monthly retention policy.
     *
     * @return the retentionScheduleDaily value
     */
    public DailyRetentionFormat retentionScheduleDaily() {
        return this.retentionScheduleDaily;
    }

    /**
     * Set daily retention format for monthly retention policy.
     *
     * @param retentionScheduleDaily the retentionScheduleDaily value to set
     * @return the MonthlyRetentionSchedule object itself.
     */
    public MonthlyRetentionSchedule withRetentionScheduleDaily(DailyRetentionFormat retentionScheduleDaily) {
        this.retentionScheduleDaily = retentionScheduleDaily;
        return this;
    }

    /**
     * Get weekly retention format for monthly retention policy.
     *
     * @return the retentionScheduleWeekly value
     */
    public WeeklyRetentionFormat retentionScheduleWeekly() {
        return this.retentionScheduleWeekly;
    }

    /**
     * Set weekly retention format for monthly retention policy.
     *
     * @param retentionScheduleWeekly the retentionScheduleWeekly value to set
     * @return the MonthlyRetentionSchedule object itself.
     */
    public MonthlyRetentionSchedule withRetentionScheduleWeekly(WeeklyRetentionFormat retentionScheduleWeekly) {
        this.retentionScheduleWeekly = retentionScheduleWeekly;
        return this;
    }

    /**
     * Get retention times of retention policy.
     *
     * @return the retentionTimes value
     */
    public List<DateTime> retentionTimes() {
        return this.retentionTimes;
    }

    /**
     * Set retention times of retention policy.
     *
     * @param retentionTimes the retentionTimes value to set
     * @return the MonthlyRetentionSchedule object itself.
     */
    public MonthlyRetentionSchedule withRetentionTimes(List<DateTime> retentionTimes) {
        this.retentionTimes = retentionTimes;
        return this;
    }

    /**
     * Get retention duration of retention Policy.
     *
     * @return the retentionDuration value
     */
    public RetentionDuration retentionDuration() {
        return this.retentionDuration;
    }

    /**
     * Set retention duration of retention Policy.
     *
     * @param retentionDuration the retentionDuration value to set
     * @return the MonthlyRetentionSchedule object itself.
     */
    public MonthlyRetentionSchedule withRetentionDuration(RetentionDuration retentionDuration) {
        this.retentionDuration = retentionDuration;
        return this;
    }

}
