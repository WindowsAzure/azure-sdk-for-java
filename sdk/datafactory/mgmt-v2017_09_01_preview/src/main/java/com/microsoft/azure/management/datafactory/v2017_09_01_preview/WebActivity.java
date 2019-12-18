/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Web activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = WebActivity.class)
@JsonTypeName("WebActivity")
@JsonFlatten
public class WebActivity extends ExecutionActivity {
    /**
     * Rest API method for target endpoint. Possible values include: 'GET',
     * 'POST', 'PUT', 'DELETE'.
     */
    @JsonProperty(value = "typeProperties.method", required = true)
    private WebActivityMethod method;

    /**
     * Web activity target endpoint and path. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /**
     * Represents the headers that will be sent to the request. For example, to
     * set the language and type on a request: "headers" : { "Accept-Language":
     * "en-us", "Content-Type": "application/json" }. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.headers")
    private Object headers;

    /**
     * Represents the payload that will be sent to the endpoint. Required for
     * POST/PUT method, not allowed for GET method Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.body")
    private Object body;

    /**
     * Authentication method used for calling the endpoint.
     */
    @JsonProperty(value = "typeProperties.authentication")
    private WebActivityAuthentication authentication;

    /**
     * List of datasets passed to web endpoint.
     */
    @JsonProperty(value = "typeProperties.datasets")
    private List<DatasetReference> datasets;

    /**
     * List of linked services passed to web endpoint.
     */
    @JsonProperty(value = "typeProperties.linkedServices")
    private List<LinkedServiceReference> linkedServices;

    /**
     * Get rest API method for target endpoint. Possible values include: 'GET', 'POST', 'PUT', 'DELETE'.
     *
     * @return the method value
     */
    public WebActivityMethod method() {
        return this.method;
    }

    /**
     * Set rest API method for target endpoint. Possible values include: 'GET', 'POST', 'PUT', 'DELETE'.
     *
     * @param method the method value to set
     * @return the WebActivity object itself.
     */
    public WebActivity withMethod(WebActivityMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get web activity target endpoint and path. Type: string (or Expression with resultType string).
     *
     * @return the url value
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set web activity target endpoint and path. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set
     * @return the WebActivity object itself.
     */
    public WebActivity withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     *
     * @return the headers value
     */
    public Object headers() {
        return this.headers;
    }

    /**
     * Set represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     *
     * @param headers the headers value to set
     * @return the WebActivity object itself.
     */
    public WebActivity withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @return the body value
     */
    public Object body() {
        return this.body;
    }

    /**
     * Set represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @param body the body value to set
     * @return the WebActivity object itself.
     */
    public WebActivity withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Get authentication method used for calling the endpoint.
     *
     * @return the authentication value
     */
    public WebActivityAuthentication authentication() {
        return this.authentication;
    }

    /**
     * Set authentication method used for calling the endpoint.
     *
     * @param authentication the authentication value to set
     * @return the WebActivity object itself.
     */
    public WebActivity withAuthentication(WebActivityAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get list of datasets passed to web endpoint.
     *
     * @return the datasets value
     */
    public List<DatasetReference> datasets() {
        return this.datasets;
    }

    /**
     * Set list of datasets passed to web endpoint.
     *
     * @param datasets the datasets value to set
     * @return the WebActivity object itself.
     */
    public WebActivity withDatasets(List<DatasetReference> datasets) {
        this.datasets = datasets;
        return this;
    }

    /**
     * Get list of linked services passed to web endpoint.
     *
     * @return the linkedServices value
     */
    public List<LinkedServiceReference> linkedServices() {
        return this.linkedServices;
    }

    /**
     * Set list of linked services passed to web endpoint.
     *
     * @param linkedServices the linkedServices value to set
     * @return the WebActivity object itself.
     */
    public WebActivity withLinkedServices(List<LinkedServiceReference> linkedServices) {
        this.linkedServices = linkedServices;
        return this;
    }

}
