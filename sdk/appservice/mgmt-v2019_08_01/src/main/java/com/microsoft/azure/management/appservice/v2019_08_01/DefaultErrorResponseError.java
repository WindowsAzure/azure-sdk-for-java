/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error model.
 */
public class DefaultErrorResponseError {
    /**
     * Standardized string to programmatically identify the error.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Detailed error description and debugging information.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Detailed error description and debugging information.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /**
     * The details property.
     */
    @JsonProperty(value = "details")
    private List<DefaultErrorResponseErrorDetailsItem> details;

    /**
     * More information to debug error.
     */
    @JsonProperty(value = "innererror", access = JsonProperty.Access.WRITE_ONLY)
    private String innererror;

    /**
     * Get standardized string to programmatically identify the error.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get detailed error description and debugging information.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get detailed error description and debugging information.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public List<DefaultErrorResponseErrorDetailsItem> details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the DefaultErrorResponseError object itself.
     */
    public DefaultErrorResponseError withDetails(List<DefaultErrorResponseErrorDetailsItem> details) {
        this.details = details;
        return this;
    }

    /**
     * Get more information to debug error.
     *
     * @return the innererror value
     */
    public String innererror() {
        return this.innererror;
    }

}
