/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the validation result.
 */
public class ValidationResultProperties {
    /**
     * Result Level.
     */
    @JsonProperty(value = "level", access = JsonProperty.Access.WRITE_ONLY)
    private String level;

    /**
     * Result Code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The validation message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get result Level.
     *
     * @return the level value
     */
    public String level() {
        return this.level;
    }

    /**
     * Get result Code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the validation message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
