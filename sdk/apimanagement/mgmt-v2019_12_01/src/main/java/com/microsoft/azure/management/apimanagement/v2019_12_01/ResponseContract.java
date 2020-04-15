/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation response details.
 */
public class ResponseContract {
    /**
     * Operation response HTTP status code.
     */
    @JsonProperty(value = "statusCode", required = true)
    private int statusCode;

    /**
     * Operation response description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Collection of operation response representations.
     */
    @JsonProperty(value = "representations")
    private List<RepresentationContract> representations;

    /**
     * Collection of operation response headers.
     */
    @JsonProperty(value = "headers")
    private List<ParameterContract> headers;

    /**
     * Get operation response HTTP status code.
     *
     * @return the statusCode value
     */
    public int statusCode() {
        return this.statusCode;
    }

    /**
     * Set operation response HTTP status code.
     *
     * @param statusCode the statusCode value to set
     * @return the ResponseContract object itself.
     */
    public ResponseContract withStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get operation response description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set operation response description.
     *
     * @param description the description value to set
     * @return the ResponseContract object itself.
     */
    public ResponseContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get collection of operation response representations.
     *
     * @return the representations value
     */
    public List<RepresentationContract> representations() {
        return this.representations;
    }

    /**
     * Set collection of operation response representations.
     *
     * @param representations the representations value to set
     * @return the ResponseContract object itself.
     */
    public ResponseContract withRepresentations(List<RepresentationContract> representations) {
        this.representations = representations;
        return this;
    }

    /**
     * Get collection of operation response headers.
     *
     * @return the headers value
     */
    public List<ParameterContract> headers() {
        return this.headers;
    }

    /**
     * Set collection of operation response headers.
     *
     * @param headers the headers value to set
     * @return the ResponseContract object itself.
     */
    public ResponseContract withHeaders(List<ParameterContract> headers) {
        this.headers = headers;
        return this;
    }

}
