/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ARM inner exception class.
 */
public class ARMException {
    /**
     * Gets HTTP status code for the error.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Gets exception message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Gets exception target.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Gets service based error details.
     */
    @JsonProperty(value = "details")
    private List<ARMExceptionDetails> details;

    /**
     * Gets private data for service debugging.
     */
    @JsonProperty(value = "innererror")
    private ARMInnerError innererror;

    /**
     * Get gets HTTP status code for the error.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set gets HTTP status code for the error.
     *
     * @param code the code value to set
     * @return the ARMException object itself.
     */
    public ARMException withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get gets exception message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set gets exception message.
     *
     * @param message the message value to set
     * @return the ARMException object itself.
     */
    public ARMException withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get gets exception target.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set gets exception target.
     *
     * @param target the target value to set
     * @return the ARMException object itself.
     */
    public ARMException withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get gets service based error details.
     *
     * @return the details value
     */
    public List<ARMExceptionDetails> details() {
        return this.details;
    }

    /**
     * Set gets service based error details.
     *
     * @param details the details value to set
     * @return the ARMException object itself.
     */
    public ARMException withDetails(List<ARMExceptionDetails> details) {
        this.details = details;
        return this;
    }

    /**
     * Get gets private data for service debugging.
     *
     * @return the innererror value
     */
    public ARMInnerError innererror() {
        return this.innererror;
    }

    /**
     * Set gets private data for service debugging.
     *
     * @param innererror the innererror value to set
     * @return the ARMException object itself.
     */
    public ARMException withInnererror(ARMInnerError innererror) {
        this.innererror = innererror;
        return this;
    }

}
