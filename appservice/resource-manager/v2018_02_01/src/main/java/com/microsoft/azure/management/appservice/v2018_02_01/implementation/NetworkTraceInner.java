/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network trace.
 */
public class NetworkTraceInner {
    /**
     * Local file path for the captured network trace file.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Current status of the network trace operation, same as Operation.Status
     * (InProgress/Succeeded/Failed).
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Detailed message of a network trace operation, e.g. error message in
     * case of failure.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get local file path for the captured network trace file.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set local file path for the captured network trace file.
     *
     * @param path the path value to set
     * @return the NetworkTraceInner object itself.
     */
    public NetworkTraceInner withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get current status of the network trace operation, same as Operation.Status (InProgress/Succeeded/Failed).
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set current status of the network trace operation, same as Operation.Status (InProgress/Succeeded/Failed).
     *
     * @param status the status value to set
     * @return the NetworkTraceInner object itself.
     */
    public NetworkTraceInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get detailed message of a network trace operation, e.g. error message in case of failure.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set detailed message of a network trace operation, e.g. error message in case of failure.
     *
     * @param message the message value to set
     * @return the NetworkTraceInner object itself.
     */
    public NetworkTraceInner withMessage(String message) {
        this.message = message;
        return this;
    }

}
