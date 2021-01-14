/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the HTTP configuration.
 */
public class ConnectionMonitorHttpConfiguration {
    /**
     * The port to connect to.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * The HTTP method to use. Possible values include: 'Get', 'Post'.
     */
    @JsonProperty(value = "method")
    private HTTPConfigurationMethod method;

    /**
     * The path component of the URI. For instance, "/dir1/dir2".
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * The HTTP headers to transmit with the request.
     */
    @JsonProperty(value = "requestHeaders")
    private List<HTTPHeader> requestHeaders;

    /**
     * HTTP status codes to consider successful. For instance,
     * "2xx,301-304,418".
     */
    @JsonProperty(value = "validStatusCodeRanges")
    private List<String> validStatusCodeRanges;

    /**
     * Value indicating whether HTTPS is preferred over HTTP in cases where the
     * choice is not explicit.
     */
    @JsonProperty(value = "preferHTTPS")
    private Boolean preferHTTPS;

    /**
     * Get the port to connect to.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port to connect to.
     *
     * @param port the port value to set
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the HTTP method to use. Possible values include: 'Get', 'Post'.
     *
     * @return the method value
     */
    public HTTPConfigurationMethod method() {
        return this.method;
    }

    /**
     * Set the HTTP method to use. Possible values include: 'Get', 'Post'.
     *
     * @param method the method value to set
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withMethod(HTTPConfigurationMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the path component of the URI. For instance, "/dir1/dir2".
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path component of the URI. For instance, "/dir1/dir2".
     *
     * @param path the path value to set
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the HTTP headers to transmit with the request.
     *
     * @return the requestHeaders value
     */
    public List<HTTPHeader> requestHeaders() {
        return this.requestHeaders;
    }

    /**
     * Set the HTTP headers to transmit with the request.
     *
     * @param requestHeaders the requestHeaders value to set
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withRequestHeaders(List<HTTPHeader> requestHeaders) {
        this.requestHeaders = requestHeaders;
        return this;
    }

    /**
     * Get hTTP status codes to consider successful. For instance, "2xx,301-304,418".
     *
     * @return the validStatusCodeRanges value
     */
    public List<String> validStatusCodeRanges() {
        return this.validStatusCodeRanges;
    }

    /**
     * Set hTTP status codes to consider successful. For instance, "2xx,301-304,418".
     *
     * @param validStatusCodeRanges the validStatusCodeRanges value to set
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withValidStatusCodeRanges(List<String> validStatusCodeRanges) {
        this.validStatusCodeRanges = validStatusCodeRanges;
        return this;
    }

    /**
     * Get value indicating whether HTTPS is preferred over HTTP in cases where the choice is not explicit.
     *
     * @return the preferHTTPS value
     */
    public Boolean preferHTTPS() {
        return this.preferHTTPS;
    }

    /**
     * Set value indicating whether HTTPS is preferred over HTTP in cases where the choice is not explicit.
     *
     * @param preferHTTPS the preferHTTPS value to set
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withPreferHTTPS(Boolean preferHTTPS) {
        this.preferHTTPS = preferHTTPS;
        return this;
    }

}
