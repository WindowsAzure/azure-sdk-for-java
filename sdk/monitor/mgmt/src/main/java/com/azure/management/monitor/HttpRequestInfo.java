// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HttpRequestInfo model. */
@Fluent
public final class HttpRequestInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HttpRequestInfo.class);

    /*
     * the client request id.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /*
     * the client Ip Address
     */
    @JsonProperty(value = "clientIpAddress")
    private String clientIpAddress;

    /*
     * the Http request method.
     */
    @JsonProperty(value = "method")
    private String method;

    /*
     * the Uri.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Get the clientRequestId property: the client request id.
     *
     * @return the clientRequestId value.
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: the client request id.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the HttpRequestInfo object itself.
     */
    public HttpRequestInfo withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the clientIpAddress property: the client Ip Address.
     *
     * @return the clientIpAddress value.
     */
    public String clientIpAddress() {
        return this.clientIpAddress;
    }

    /**
     * Set the clientIpAddress property: the client Ip Address.
     *
     * @param clientIpAddress the clientIpAddress value to set.
     * @return the HttpRequestInfo object itself.
     */
    public HttpRequestInfo withClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
        return this;
    }

    /**
     * Get the method property: the Http request method.
     *
     * @return the method value.
     */
    public String method() {
        return this.method;
    }

    /**
     * Set the method property: the Http request method.
     *
     * @param method the method value to set.
     * @return the HttpRequestInfo object itself.
     */
    public HttpRequestInfo withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get the uri property: the Uri.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: the Uri.
     *
     * @param uri the uri value to set.
     * @return the HttpRequestInfo object itself.
     */
    public HttpRequestInfo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
