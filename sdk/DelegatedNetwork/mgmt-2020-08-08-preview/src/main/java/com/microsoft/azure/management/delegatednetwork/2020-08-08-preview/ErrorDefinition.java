/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error definition.
 */
public class ErrorDefinition {
    /**
     * Service specific error code which serves as the substatus for the HTTP
     * error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Description of the error.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Internal error details.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorDefinition> details;

    /**
     * Get service specific error code which serves as the substatus for the HTTP error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get description of the error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get internal error details.
     *
     * @return the details value
     */
    public List<ErrorDefinition> details() {
        return this.details;
    }

}
