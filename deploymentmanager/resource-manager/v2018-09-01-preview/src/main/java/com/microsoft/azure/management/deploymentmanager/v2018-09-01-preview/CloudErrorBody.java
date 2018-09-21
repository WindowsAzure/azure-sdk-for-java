/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detailed error information of any failure.
 */
public class CloudErrorBody {
    /**
     * Error code string.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Descriptive error information.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Error target.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * More detailed error information.
     */
    @JsonProperty(value = "details")
    private List<CloudErrorBody> details;

    /**
     * Get error code string.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get descriptive error information.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get error target.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set error target.
     *
     * @param target the target value to set
     * @return the CloudErrorBody object itself.
     */
    public CloudErrorBody withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get more detailed error information.
     *
     * @return the details value
     */
    public List<CloudErrorBody> details() {
        return this.details;
    }

    /**
     * Set more detailed error information.
     *
     * @param details the details value to set
     * @return the CloudErrorBody object itself.
     */
    public CloudErrorBody withDetails(List<CloudErrorBody> details) {
        this.details = details;
        return this;
    }

}
