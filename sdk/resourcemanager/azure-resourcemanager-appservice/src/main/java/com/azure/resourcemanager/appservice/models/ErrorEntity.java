// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Body of the error response returned from the API. */
@Fluent
public final class ErrorEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ErrorEntity.class);

    /*
     * Type of error.
     */
    @JsonProperty(value = "extendedCode")
    private String extendedCode;

    /*
     * Message template.
     */
    @JsonProperty(value = "messageTemplate")
    private String messageTemplate;

    /*
     * Parameters for the template.
     */
    @JsonProperty(value = "parameters")
    private List<String> parameters;

    /*
     * Inner errors.
     */
    @JsonProperty(value = "innerErrors")
    private List<ErrorEntity> innerErrors;

    /*
     * Basic error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Any details of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the extendedCode property: Type of error.
     *
     * @return the extendedCode value.
     */
    public String extendedCode() {
        return this.extendedCode;
    }

    /**
     * Set the extendedCode property: Type of error.
     *
     * @param extendedCode the extendedCode value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withExtendedCode(String extendedCode) {
        this.extendedCode = extendedCode;
        return this;
    }

    /**
     * Get the messageTemplate property: Message template.
     *
     * @return the messageTemplate value.
     */
    public String messageTemplate() {
        return this.messageTemplate;
    }

    /**
     * Set the messageTemplate property: Message template.
     *
     * @param messageTemplate the messageTemplate value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withMessageTemplate(String messageTemplate) {
        this.messageTemplate = messageTemplate;
        return this;
    }

    /**
     * Get the parameters property: Parameters for the template.
     *
     * @return the parameters value.
     */
    public List<String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters for the template.
     *
     * @param parameters the parameters value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withParameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the innerErrors property: Inner errors.
     *
     * @return the innerErrors value.
     */
    public List<ErrorEntity> innerErrors() {
        return this.innerErrors;
    }

    /**
     * Set the innerErrors property: Inner errors.
     *
     * @param innerErrors the innerErrors value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withInnerErrors(List<ErrorEntity> innerErrors) {
        this.innerErrors = innerErrors;
        return this;
    }

    /**
     * Get the code property: Basic error code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Basic error code.
     *
     * @param code the code value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Any details of the error.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Any details of the error.
     *
     * @param message the message value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerErrors() != null) {
            innerErrors().forEach(e -> e.validate());
        }
    }
}
