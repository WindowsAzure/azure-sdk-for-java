/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A request.
 */
public class Request {
    /**
     * A list of all the headers attached to the request.
     */
    @JsonProperty(value = "headers")
    private Object headers;

    /**
     * The destination for the request.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * The HTTP method used for the request.
     */
    @JsonProperty(value = "method")
    private String method;

    /**
     * Get a list of all the headers attached to the request.
     *
     * @return the headers value
     */
    public Object headers() {
        return this.headers;
    }

    /**
     * Set a list of all the headers attached to the request.
     *
     * @param headers the headers value to set
     * @return the Request object itself.
     */
    public Request withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the destination for the request.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the destination for the request.
     *
     * @param uri the uri value to set
     * @return the Request object itself.
     */
    public Request withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the HTTP method used for the request.
     *
     * @return the method value
     */
    public String method() {
        return this.method;
    }

    /**
     * Set the HTTP method used for the request.
     *
     * @param method the method value to set
     * @return the Request object itself.
     */
    public Request withMethod(String method) {
        this.method = method;
        return this;
    }

}
