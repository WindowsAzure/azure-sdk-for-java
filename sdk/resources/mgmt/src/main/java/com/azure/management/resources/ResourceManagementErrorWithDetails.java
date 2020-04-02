// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.resources;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The detailed error message of resource management.
 */
public class ResourceManagementErrorWithDetails {
    /**
     * The error code returned when exporting the template.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The error message describing the export error.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The target of the error.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /**
     * Validation error.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceManagementErrorWithDetails> details;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the target value.
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
    public List<ResourceManagementErrorWithDetails> details() {
        return this.details;
    }

}
