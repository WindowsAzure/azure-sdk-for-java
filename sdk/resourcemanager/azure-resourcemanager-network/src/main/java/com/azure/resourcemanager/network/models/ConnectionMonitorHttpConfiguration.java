// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the HTTP configuration. */
@Fluent
public final class ConnectionMonitorHttpConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorHttpConfiguration.class);

    /*
     * The port to connect to.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * The HTTP method to use.
     */
    @JsonProperty(value = "method")
    private HttpConfigurationMethod method;

    /*
     * The path component of the URI. For instance, "/dir1/dir2".
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * The HTTP headers to transmit with the request.
     */
    @JsonProperty(value = "requestHeaders")
    private List<HttpHeader> requestHeaders;

    /*
     * HTTP status codes to consider successful. For instance,
     * "2xx,301-304,418".
     */
    @JsonProperty(value = "validStatusCodeRanges")
    private List<String> validStatusCodeRanges;

    /*
     * Value indicating whether HTTPS is preferred over HTTP in cases where the
     * choice is not explicit.
     */
    @JsonProperty(value = "preferHTTPS")
    private Boolean preferHttps;

    /**
     * Get the port property: The port to connect to.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port to connect to.
     *
     * @param port the port value to set.
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the method property: The HTTP method to use.
     *
     * @return the method value.
     */
    public HttpConfigurationMethod method() {
        return this.method;
    }

    /**
     * Set the method property: The HTTP method to use.
     *
     * @param method the method value to set.
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withMethod(HttpConfigurationMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the path property: The path component of the URI. For instance, "/dir1/dir2".
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path component of the URI. For instance, "/dir1/dir2".
     *
     * @param path the path value to set.
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the requestHeaders property: The HTTP headers to transmit with the request.
     *
     * @return the requestHeaders value.
     */
    public List<HttpHeader> requestHeaders() {
        return this.requestHeaders;
    }

    /**
     * Set the requestHeaders property: The HTTP headers to transmit with the request.
     *
     * @param requestHeaders the requestHeaders value to set.
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withRequestHeaders(List<HttpHeader> requestHeaders) {
        this.requestHeaders = requestHeaders;
        return this;
    }

    /**
     * Get the validStatusCodeRanges property: HTTP status codes to consider successful. For instance,
     * "2xx,301-304,418".
     *
     * @return the validStatusCodeRanges value.
     */
    public List<String> validStatusCodeRanges() {
        return this.validStatusCodeRanges;
    }

    /**
     * Set the validStatusCodeRanges property: HTTP status codes to consider successful. For instance,
     * "2xx,301-304,418".
     *
     * @param validStatusCodeRanges the validStatusCodeRanges value to set.
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withValidStatusCodeRanges(List<String> validStatusCodeRanges) {
        this.validStatusCodeRanges = validStatusCodeRanges;
        return this;
    }

    /**
     * Get the preferHttps property: Value indicating whether HTTPS is preferred over HTTP in cases where the choice is
     * not explicit.
     *
     * @return the preferHttps value.
     */
    public Boolean preferHttps() {
        return this.preferHttps;
    }

    /**
     * Set the preferHttps property: Value indicating whether HTTPS is preferred over HTTP in cases where the choice is
     * not explicit.
     *
     * @param preferHttps the preferHttps value to set.
     * @return the ConnectionMonitorHttpConfiguration object itself.
     */
    public ConnectionMonitorHttpConfiguration withPreferHttps(Boolean preferHttps) {
        this.preferHttps = preferHttps;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (requestHeaders() != null) {
            requestHeaders().forEach(e -> e.validate());
        }
    }
}
