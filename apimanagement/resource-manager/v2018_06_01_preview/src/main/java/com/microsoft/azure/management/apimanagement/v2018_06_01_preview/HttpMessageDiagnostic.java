/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Http message diagnostic settings.
 */
public class HttpMessageDiagnostic {
    /**
     * Array of HTTP Headers to log.
     */
    @JsonProperty(value = "headers")
    private List<String> headers;

    /**
     * Body logging settings.
     */
    @JsonProperty(value = "body")
    private BodyDiagnosticSettings body;

    /**
     * Get array of HTTP Headers to log.
     *
     * @return the headers value
     */
    public List<String> headers() {
        return this.headers;
    }

    /**
     * Set array of HTTP Headers to log.
     *
     * @param headers the headers value to set
     * @return the HttpMessageDiagnostic object itself.
     */
    public HttpMessageDiagnostic withHeaders(List<String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get body logging settings.
     *
     * @return the body value
     */
    public BodyDiagnosticSettings body() {
        return this.body;
    }

    /**
     * Set body logging settings.
     *
     * @param body the body value to set
     * @return the HttpMessageDiagnostic object itself.
     */
    public HttpMessageDiagnostic withBody(BodyDiagnosticSettings body) {
        this.body = body;
        return this;
    }

}
