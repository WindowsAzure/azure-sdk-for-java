/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details for a search error.
 */
public class SearchError {
    /**
     * The error type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the error type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the error type.
     *
     * @param type the type value to set
     * @return the SearchError object itself.
     */
    public SearchError withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the error message.
     *
     * @param message the message value to set
     * @return the SearchError object itself.
     */
    public SearchError withMessage(String message) {
        this.message = message;
        return this;
    }

}
