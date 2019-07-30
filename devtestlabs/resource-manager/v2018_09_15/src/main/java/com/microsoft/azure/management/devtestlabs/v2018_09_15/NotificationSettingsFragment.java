/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Notification settings for a schedule.
 */
public class NotificationSettingsFragment {
    /**
     * If notifications are enabled for this schedule (i.e. Enabled, Disabled).
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "status")
    private EnableStatus status;

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
     * The email recipient to send notifications to (can be a list of
     * semi-colon separated email addresses).
     */
    @JsonProperty(value = "emailRecipient")
    private String emailRecipient;

    /**
     * The locale to use when sending a notification (fallback for unsupported
     * languages is EN).
     */
    @JsonProperty(value = "notificationLocale")
    private String notificationLocale;

    /**
     * Get if notifications are enabled for this schedule (i.e. Enabled, Disabled). Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public EnableStatus status() {
        return this.status;
    }

    /**
     * Set if notifications are enabled for this schedule (i.e. Enabled, Disabled). Possible values include: 'Enabled', 'Disabled'.
     *
     * @param status the status value to set
     * @return the NotificationSettingsFragment object itself.
     */
    public NotificationSettingsFragment withStatus(EnableStatus status) {
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
     * @return the NotificationSettingsFragment object itself.
     */
    public NotificationSettingsFragment withTimeInMinutes(Integer timeInMinutes) {
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
     * @return the NotificationSettingsFragment object itself.
     */
    public NotificationSettingsFragment withWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    /**
     * Get the email recipient to send notifications to (can be a list of semi-colon separated email addresses).
     *
     * @return the emailRecipient value
     */
    public String emailRecipient() {
        return this.emailRecipient;
    }

    /**
     * Set the email recipient to send notifications to (can be a list of semi-colon separated email addresses).
     *
     * @param emailRecipient the emailRecipient value to set
     * @return the NotificationSettingsFragment object itself.
     */
    public NotificationSettingsFragment withEmailRecipient(String emailRecipient) {
        this.emailRecipient = emailRecipient;
        return this;
    }

    /**
     * Get the locale to use when sending a notification (fallback for unsupported languages is EN).
     *
     * @return the notificationLocale value
     */
    public String notificationLocale() {
        return this.notificationLocale;
    }

    /**
     * Set the locale to use when sending a notification (fallback for unsupported languages is EN).
     *
     * @param notificationLocale the notificationLocale value to set
     * @return the NotificationSettingsFragment object itself.
     */
    public NotificationSettingsFragment withNotificationLocale(String notificationLocale) {
        this.notificationLocale = notificationLocale;
        return this;
    }

}
