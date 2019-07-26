/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DatasetInner;

/**
 * A file in an HTTP web server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HttpFile")
@JsonFlatten
public class HttpDataset extends DatasetInner {
    /**
     * The relative URL based on the URL in the HttpLinkedService refers to an
     * HTTP file Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.relativeUrl")
    private Object relativeUrl;

    /**
     * The HTTP method for the HTTP request. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.requestMethod")
    private Object requestMethod;

    /**
     * The body for the HTTP request. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.requestBody")
    private Object requestBody;

    /**
     * The headers for the HTTP Request. e.g.
     * request-header-name-1:request-header-value-1
     * ...
     * request-header-name-n:request-header-value-n Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.additionalHeaders")
    private Object additionalHeaders;

    /**
     * The format of files.
     */
    @JsonProperty(value = "typeProperties.format")
    private DatasetStorageFormat format;

    /**
     * The data compression method used on files.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /**
     * Get the relative URL based on the URL in the HttpLinkedService refers to an HTTP file Type: string (or Expression with resultType string).
     *
     * @return the relativeUrl value
     */
    public Object relativeUrl() {
        return this.relativeUrl;
    }

    /**
     * Set the relative URL based on the URL in the HttpLinkedService refers to an HTTP file Type: string (or Expression with resultType string).
     *
     * @param relativeUrl the relativeUrl value to set
     * @return the HttpDataset object itself.
     */
    public HttpDataset withRelativeUrl(Object relativeUrl) {
        this.relativeUrl = relativeUrl;
        return this;
    }

    /**
     * Get the HTTP method for the HTTP request. Type: string (or Expression with resultType string).
     *
     * @return the requestMethod value
     */
    public Object requestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the HTTP method for the HTTP request. Type: string (or Expression with resultType string).
     *
     * @param requestMethod the requestMethod value to set
     * @return the HttpDataset object itself.
     */
    public HttpDataset withRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the body for the HTTP request. Type: string (or Expression with resultType string).
     *
     * @return the requestBody value
     */
    public Object requestBody() {
        return this.requestBody;
    }

    /**
     * Set the body for the HTTP request. Type: string (or Expression with resultType string).
     *
     * @param requestBody the requestBody value to set
     * @return the HttpDataset object itself.
     */
    public HttpDataset withRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the headers for the HTTP Request. e.g. request-header-name-1:request-header-value-1
     ...
     request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     *
     * @return the additionalHeaders value
     */
    public Object additionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the headers for the HTTP Request. e.g. request-header-name-1:request-header-value-1
     ...
     request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     *
     * @param additionalHeaders the additionalHeaders value to set
     * @return the HttpDataset object itself.
     */
    public HttpDataset withAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the format of files.
     *
     * @return the format value
     */
    public DatasetStorageFormat format() {
        return this.format;
    }

    /**
     * Set the format of files.
     *
     * @param format the format value to set
     * @return the HttpDataset object itself.
     */
    public HttpDataset withFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the data compression method used on files.
     *
     * @return the compression value
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the data compression method used on files.
     *
     * @param compression the compression value to set
     * @return the HttpDataset object itself.
     */
    public HttpDataset withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

}
