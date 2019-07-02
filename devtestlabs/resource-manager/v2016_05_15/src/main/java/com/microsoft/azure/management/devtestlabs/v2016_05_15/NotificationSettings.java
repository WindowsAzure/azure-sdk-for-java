/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Notification settings for a schedule.
 */
public class NotificationSettings {
    /**
     * If notifications are enabled for this schedule (i.e. Enabled, Disabled).
     * Possible values include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "status")
    private NotificationStatus status;

    /**
     * Time in minutes before event at which notification will be sent.
     */
    @JsonProperty(value = "timeInMinutes")
    private Integer timeInMinutes;

    /**
     * The webhook URL to which the notification will be sent.
     */
    @JsonProperty(value = "webhookUrl")
    private String webhookUrl;

    /**
     * Get if notifications are enabled for this schedule (i.e. Enabled, Disabled). Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the status value
     */
    public NotificationStatus status() {
        return this.status;
    }

    /**
     * Set if notifications are enabled for this schedule (i.e. Enabled, Disabled). Possible values include: 'Disabled', 'Enabled'.
     *
     * @param status the status value to set
     * @return the NotificationSettings object itself.
     */
    public NotificationSettings withStatus(NotificationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get time in minutes before event at which notification will be sent.
     *
     * @return the timeInMinutes value
     */
    public Integer timeInMinutes() {
        return this.timeInMinutes;
    }

    /**
     * Set time in minutes before event at which notification will be sent.
     *
     * @param timeInMinutes the timeInMinutes value to set
     * @return the NotificationSettings object itself.
     */
    public NotificationSettings withTimeInMinutes(Integer timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
        return this;
    }

    /**
     * Get the webhook URL to which the notification will be sent.
     *
     * @return the webhookUrl value
     */
    public String webhookUrl() {
        return this.webhookUrl;
    }

    /**
     * Set the webhook URL to which the notification will be sent.
     *
     * @param webhookUrl the webhookUrl value to set
     * @return the NotificationSettings object itself.
     */
    public NotificationSettings withWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

}
