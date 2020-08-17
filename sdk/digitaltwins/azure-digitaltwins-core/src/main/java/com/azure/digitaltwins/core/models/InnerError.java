// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InnerError model. */
@Fluent
public final class InnerError {
    /*
     * A more specific error code than was provided by the containing error.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * An object containing more specific information than the current object
     * about the error.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * Get the code property: A more specific error code than was provided by the containing error.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: A more specific error code than was provided by the containing error.
     *
     * @param code the code value to set.
     * @return the InnerError object itself.
     */
    public InnerError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the innererror property: An object containing more specific information than the current object about the
     * error.
     *
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: An object containing more specific information than the current object about the
     * error.
     *
     * @param innererror the innererror value to set.
     * @return the InnerError object itself.
     */
    public InnerError setInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }
}
