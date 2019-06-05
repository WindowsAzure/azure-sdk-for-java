/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Body of the error response returned from the API.
 */
public class ErrorEntity {
    /**
     * Type of error.
     */
    @JsonProperty(value = "extendedCode")
    private String extendedCode;

    /**
     * Message template.
     */
    @JsonProperty(value = "messageTemplate")
    private String messageTemplate;

    /**
     * Parameters for the template.
     */
    @JsonProperty(value = "parameters")
    private List<String> parameters;

    /**
     * Inner errors.
     */
    @JsonProperty(value = "innerErrors")
    private List<ErrorEntity> innerErrors;

    /**
     * Basic error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Any details of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get type of error.
     *
     * @return the extendedCode value
     */
    public String extendedCode() {
        return this.extendedCode;
    }

    /**
     * Set type of error.
     *
     * @param extendedCode the extendedCode value to set
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withExtendedCode(String extendedCode) {
        this.extendedCode = extendedCode;
        return this;
    }

    /**
     * Get message template.
     *
     * @return the messageTemplate value
     */
    public String messageTemplate() {
        return this.messageTemplate;
    }

    /**
     * Set message template.
     *
     * @param messageTemplate the messageTemplate value to set
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withMessageTemplate(String messageTemplate) {
        this.messageTemplate = messageTemplate;
        return this;
    }

    /**
     * Get parameters for the template.
     *
     * @return the parameters value
     */
    public List<String> parameters() {
        return this.parameters;
    }

    /**
     * Set parameters for the template.
     *
     * @param parameters the parameters value to set
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withParameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get inner errors.
     *
     * @return the innerErrors value
     */
    public List<ErrorEntity> innerErrors() {
        return this.innerErrors;
    }

    /**
     * Set inner errors.
     *
     * @param innerErrors the innerErrors value to set
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withInnerErrors(List<ErrorEntity> innerErrors) {
        this.innerErrors = innerErrors;
        return this;
    }

    /**
     * Get basic error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set basic error code.
     *
     * @param code the code value to set
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get any details of the error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set any details of the error.
     *
     * @param message the message value to set
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withMessage(String message) {
        this.message = message;
        return this;
    }

}
