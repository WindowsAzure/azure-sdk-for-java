/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Azure Function activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFunctionActivity")
@JsonFlatten
public class AzureFunctionActivity extends ExecutionActivity {
    /**
     * Rest API method for target endpoint. Possible values include: 'GET',
     * 'POST', 'PUT', 'DELETE', 'OPTIONS', 'HEAD', 'TRACE'.
     */
    @JsonProperty(value = "typeProperties.method", required = true)
    private AzureFunctionActivityMethod method;

    /**
     * Name of the Function that the Azure Function Activity will call. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.functionName", required = true)
    private Object functionName;

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
     * Get rest API method for target endpoint. Possible values include: 'GET', 'POST', 'PUT', 'DELETE', 'OPTIONS', 'HEAD', 'TRACE'.
     *
     * @return the method value
     */
    public AzureFunctionActivityMethod method() {
        return this.method;
    }

    /**
     * Set rest API method for target endpoint. Possible values include: 'GET', 'POST', 'PUT', 'DELETE', 'OPTIONS', 'HEAD', 'TRACE'.
     *
     * @param method the method value to set
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withMethod(AzureFunctionActivityMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get name of the Function that the Azure Function Activity will call. Type: string (or Expression with resultType string).
     *
     * @return the functionName value
     */
    public Object functionName() {
        return this.functionName;
    }

    /**
     * Set name of the Function that the Azure Function Activity will call. Type: string (or Expression with resultType string).
     *
     * @param functionName the functionName value to set
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withFunctionName(Object functionName) {
        this.functionName = functionName;
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
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withHeaders(Object headers) {
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
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withBody(Object body) {
        this.body = body;
        return this;
    }

}
