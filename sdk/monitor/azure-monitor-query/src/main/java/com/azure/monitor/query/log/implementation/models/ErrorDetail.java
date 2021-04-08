// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Error details. */
@Fluent
public final class ErrorDetail {
    /*
     * The error's code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * A human readable error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Indicates which property in the request is responsible for the error.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Indicates which value in 'target' is responsible for the error.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Indicates resources which were responsible for the error.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /*
     * Any object
     */
    @JsonProperty(value = "additionalProperties")
    private Object additionalProperties;

    /**
     * Creates an instance of ErrorDetail class.
     *
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @JsonCreator
    public ErrorDetail(
            @JsonProperty(value = "code", required = true) String code,
            @JsonProperty(value = "message", required = true) String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: The error's code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human readable error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: Indicates which property in the request is responsible for the error.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Indicates which property in the request is responsible for the error.
     *
     * @param target the target value to set.
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the value property: Indicates which value in 'target' is responsible for the error.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: Indicates which value in 'target' is responsible for the error.
     *
     * @param value the value value to set.
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the resources property: Indicates resources which were responsible for the error.
     *
     * @return the resources value.
     */
    public List<String> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: Indicates resources which were responsible for the error.
     *
     * @param resources the resources value to set.
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail setResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the additionalProperties property: Any object.
     *
     * @return the additionalProperties value.
     */
    public Object getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Any object.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail setAdditionalProperties(Object additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getCode() == null) {
            throw new IllegalArgumentException("Missing required property code in model ErrorDetail");
        }
        if (getMessage() == null) {
            throw new IllegalArgumentException("Missing required property message in model ErrorDetail");
        }
    }
}
