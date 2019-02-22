/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description about the errors happen while performing migration validation.
 */
public class ValidationError {
    /**
     * Error Text.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Severity of the error. Possible values include: 'Message', 'Warning',
     * 'Error'.
     */
    @JsonProperty(value = "severity")
    private Severity severity;

    /**
     * Get error Text.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set error Text.
     *
     * @param text the text value to set
     * @return the ValidationError object itself.
     */
    public ValidationError withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get severity of the error. Possible values include: 'Message', 'Warning', 'Error'.
     *
     * @return the severity value
     */
    public Severity severity() {
        return this.severity;
    }

    /**
     * Set severity of the error. Possible values include: 'Message', 'Warning', 'Error'.
     *
     * @param severity the severity value to set
     * @return the ValidationError object itself.
     */
    public ValidationError withSeverity(Severity severity) {
        this.severity = severity;
        return this;
    }

}
