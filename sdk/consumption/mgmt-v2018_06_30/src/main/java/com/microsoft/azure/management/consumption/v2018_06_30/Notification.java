/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_06_30;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The notification associated with a budget.
 */
public class Notification {
    /**
     * The notification is enabled or not.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * The comparison operator. Possible values include: 'EqualTo',
     * 'GreaterThan', 'GreaterThanOrEqualTo'.
     */
    @JsonProperty(value = "operator", required = true)
    private OperatorType operator;

    /**
     * Threshold value associated with a notification. Notification is sent
     * when the cost exceeded the threshold. It is always percent and has to be
     * between 0 and 1000.
     */
    @JsonProperty(value = "threshold", required = true)
    private BigDecimal threshold;

    /**
     * Email addresses to send the budget notification to when the threshold is
     * exceeded.
     */
    @JsonProperty(value = "contactEmails", required = true)
    private List<String> contactEmails;

    /**
     * Contact roles to send the budget notification to when the threshold is
     * exceeded.
     */
    @JsonProperty(value = "contactRoles")
    private List<String> contactRoles;

    /**
     * Action groups to send the budget notification to when the threshold is
     * exceeded.
     */
    @JsonProperty(value = "contactGroups")
    private List<String> contactGroups;

    /**
     * Get the notification is enabled or not.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the notification is enabled or not.
     *
     * @param enabled the enabled value to set
     * @return the Notification object itself.
     */
    public Notification withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the comparison operator. Possible values include: 'EqualTo', 'GreaterThan', 'GreaterThanOrEqualTo'.
     *
     * @return the operator value
     */
    public OperatorType operator() {
        return this.operator;
    }

    /**
     * Set the comparison operator. Possible values include: 'EqualTo', 'GreaterThan', 'GreaterThanOrEqualTo'.
     *
     * @param operator the operator value to set
     * @return the Notification object itself.
     */
    public Notification withOperator(OperatorType operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get threshold value associated with a notification. Notification is sent when the cost exceeded the threshold. It is always percent and has to be between 0 and 1000.
     *
     * @return the threshold value
     */
    public BigDecimal threshold() {
        return this.threshold;
    }

    /**
     * Set threshold value associated with a notification. Notification is sent when the cost exceeded the threshold. It is always percent and has to be between 0 and 1000.
     *
     * @param threshold the threshold value to set
     * @return the Notification object itself.
     */
    public Notification withThreshold(BigDecimal threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get email addresses to send the budget notification to when the threshold is exceeded.
     *
     * @return the contactEmails value
     */
    public List<String> contactEmails() {
        return this.contactEmails;
    }

    /**
     * Set email addresses to send the budget notification to when the threshold is exceeded.
     *
     * @param contactEmails the contactEmails value to set
     * @return the Notification object itself.
     */
    public Notification withContactEmails(List<String> contactEmails) {
        this.contactEmails = contactEmails;
        return this;
    }

    /**
     * Get contact roles to send the budget notification to when the threshold is exceeded.
     *
     * @return the contactRoles value
     */
    public List<String> contactRoles() {
        return this.contactRoles;
    }

    /**
     * Set contact roles to send the budget notification to when the threshold is exceeded.
     *
     * @param contactRoles the contactRoles value to set
     * @return the Notification object itself.
     */
    public Notification withContactRoles(List<String> contactRoles) {
        this.contactRoles = contactRoles;
        return this;
    }

    /**
     * Get action groups to send the budget notification to when the threshold is exceeded.
     *
     * @return the contactGroups value
     */
    public List<String> contactGroups() {
        return this.contactGroups;
    }

    /**
     * Set action groups to send the budget notification to when the threshold is exceeded.
     *
     * @param contactGroups the contactGroups value to set
     * @return the Notification object itself.
     */
    public Notification withContactGroups(List<String> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }

}
