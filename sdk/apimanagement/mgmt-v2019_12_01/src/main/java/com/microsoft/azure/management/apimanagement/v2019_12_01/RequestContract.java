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
 * Operation request details.
 */
public class RequestContract {
    /**
     * Operation request description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Collection of operation request query parameters.
     */
    @JsonProperty(value = "queryParameters")
    private List<ParameterContract> queryParameters;

    /**
     * Collection of operation request headers.
     */
    @JsonProperty(value = "headers")
    private List<ParameterContract> headers;

    /**
     * Collection of operation request representations.
     */
    @JsonProperty(value = "representations")
    private List<RepresentationContract> representations;

    /**
     * Get operation request description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set operation request description.
     *
     * @param description the description value to set
     * @return the RequestContract object itself.
     */
    public RequestContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get collection of operation request query parameters.
     *
     * @return the queryParameters value
     */
    public List<ParameterContract> queryParameters() {
        return this.queryParameters;
    }

    /**
     * Set collection of operation request query parameters.
     *
     * @param queryParameters the queryParameters value to set
     * @return the RequestContract object itself.
     */
    public RequestContract withQueryParameters(List<ParameterContract> queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

    /**
     * Get collection of operation request headers.
     *
     * @return the headers value
     */
    public List<ParameterContract> headers() {
        return this.headers;
    }

    /**
     * Set collection of operation request headers.
     *
     * @param headers the headers value to set
     * @return the RequestContract object itself.
     */
    public RequestContract withHeaders(List<ParameterContract> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get collection of operation request representations.
     *
     * @return the representations value
     */
    public List<RepresentationContract> representations() {
        return this.representations;
    }

    /**
     * Set collection of operation request representations.
     *
     * @param representations the representations value to set
     * @return the RequestContract object itself.
     */
    public RequestContract withRepresentations(List<RepresentationContract> representations) {
        this.representations = representations;
        return this;
    }

}
