// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A Rest service dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("RestResource")
@JsonFlatten
@Fluent
public class RestResourceDataset extends Dataset {
    /*
     * The relative URL to the resource that the RESTful API provides. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.relativeUrl")
    private Object relativeUrl;

    /*
     * The HTTP method used to call the RESTful API. The default is GET. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.requestMethod")
    private Object requestMethod;

    /*
     * The HTTP request body to the RESTful API if requestMethod is POST. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.requestBody")
    private Object requestBody;

    /*
     * The additional HTTP headers in the request to the RESTful API. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.additionalHeaders")
    private Object additionalHeaders;

    /*
     * The pagination rules to compose next page requests. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.paginationRules")
    private Object paginationRules;

    /**
     * Get the relativeUrl property: The relative URL to the resource that the RESTful API provides. Type: string (or
     * Expression with resultType string).
     *
     * @return the relativeUrl value.
     */
    public Object getRelativeUrl() {
        return this.relativeUrl;
    }

    /**
     * Set the relativeUrl property: The relative URL to the resource that the RESTful API provides. Type: string (or
     * Expression with resultType string).
     *
     * @param relativeUrl the relativeUrl value to set.
     * @return the RestResourceDataset object itself.
     */
    public RestResourceDataset setRelativeUrl(Object relativeUrl) {
        this.relativeUrl = relativeUrl;
        return this;
    }

    /**
     * Get the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @return the requestMethod value.
     */
    public Object getRequestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @param requestMethod the requestMethod value to set.
     * @return the RestResourceDataset object itself.
     */
    public RestResourceDataset setRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @return the requestBody value.
     */
    public Object getRequestBody() {
        return this.requestBody;
    }

    /**
     * Set the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @param requestBody the requestBody value to set.
     * @return the RestResourceDataset object itself.
     */
    public RestResourceDataset setRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @return the additionalHeaders value.
     */
    public Object getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @param additionalHeaders the additionalHeaders value to set.
     * @return the RestResourceDataset object itself.
     */
    public RestResourceDataset setAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the paginationRules property: The pagination rules to compose next page requests. Type: string (or Expression
     * with resultType string).
     *
     * @return the paginationRules value.
     */
    public Object getPaginationRules() {
        return this.paginationRules;
    }

    /**
     * Set the paginationRules property: The pagination rules to compose next page requests. Type: string (or Expression
     * with resultType string).
     *
     * @param paginationRules the paginationRules value to set.
     * @return the RestResourceDataset object itself.
     */
    public RestResourceDataset setPaginationRules(Object paginationRules) {
        this.paginationRules = paginationRules;
        return this;
    }
}
