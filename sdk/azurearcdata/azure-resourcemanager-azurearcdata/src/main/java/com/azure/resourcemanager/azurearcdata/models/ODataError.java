// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about an error. */
@Fluent
public final class ODataError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ODataError.class);

    /*
     * A language-independent error name.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The target of the error (for example, the name of the property in
     * error).
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * The error details.
     */
    @JsonProperty(value = "details")
    private List<ODataError> details;

    /**
     * Get the code property: A language-independent error name.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: A language-independent error name.
     *
     * @param code the code value to set.
     * @return the ODataError object itself.
     */
    public ODataError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     *
     * @param message the message value to set.
     * @return the ODataError object itself.
     */
    public ODataError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: The target of the error (for example, the name of the property in error).
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target of the error (for example, the name of the property in error).
     *
     * @param target the target value to set.
     * @return the ODataError object itself.
     */
    public ODataError withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the details property: The error details.
     *
     * @return the details value.
     */
    public List<ODataError> details() {
        return this.details;
    }

    /**
     * Set the details property: The error details.
     *
     * @param details the details value to set.
     * @return the ODataError object itself.
     */
    public ODataError withDetails(List<ODataError> details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }
}
