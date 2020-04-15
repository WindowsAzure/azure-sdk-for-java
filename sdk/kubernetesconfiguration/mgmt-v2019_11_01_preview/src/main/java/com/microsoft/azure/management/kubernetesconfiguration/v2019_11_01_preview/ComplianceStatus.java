/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kubernetesconfiguration.v2019_11_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Compliance Status details.
 */
public class ComplianceStatus {
    /**
     * The compliance state of the configuration. Possible values include:
     * 'Pending', 'Compliant', 'Noncompliant'.
     */
    @JsonProperty(value = "complianceState", access = JsonProperty.Access.WRITE_ONLY)
    private ComplianceState complianceState;

    /**
     * Datetime the configuration was last applied.
     */
    @JsonProperty(value = "lastConfigApplied")
    private DateTime lastConfigApplied;

    /**
     * Message from when the configuration was applied.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Level of the message. Possible values include: 'Error', 'Warning',
     * 'Information'.
     */
    @JsonProperty(value = "messageLevel")
    private MessageLevel messageLevel;

    /**
     * Get the compliance state of the configuration. Possible values include: 'Pending', 'Compliant', 'Noncompliant'.
     *
     * @return the complianceState value
     */
    public ComplianceState complianceState() {
        return this.complianceState;
    }

    /**
     * Get datetime the configuration was last applied.
     *
     * @return the lastConfigApplied value
     */
    public DateTime lastConfigApplied() {
        return this.lastConfigApplied;
    }

    /**
     * Set datetime the configuration was last applied.
     *
     * @param lastConfigApplied the lastConfigApplied value to set
     * @return the ComplianceStatus object itself.
     */
    public ComplianceStatus withLastConfigApplied(DateTime lastConfigApplied) {
        this.lastConfigApplied = lastConfigApplied;
        return this;
    }

    /**
     * Get message from when the configuration was applied.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set message from when the configuration was applied.
     *
     * @param message the message value to set
     * @return the ComplianceStatus object itself.
     */
    public ComplianceStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get level of the message. Possible values include: 'Error', 'Warning', 'Information'.
     *
     * @return the messageLevel value
     */
    public MessageLevel messageLevel() {
        return this.messageLevel;
    }

    /**
     * Set level of the message. Possible values include: 'Error', 'Warning', 'Information'.
     *
     * @param messageLevel the messageLevel value to set
     * @return the ComplianceStatus object itself.
     */
    public ComplianceStatus withMessageLevel(MessageLevel messageLevel) {
        this.messageLevel = messageLevel;
        return this;
    }

}
