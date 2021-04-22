// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** A Rest service dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("RestResource")
@JsonFlatten
@Fluent
public class RestResourceDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestResourceDataset.class);

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
    public Object relativeUrl() {
        return this.relativeUrl;
    }

    /**
     * Set the relativeUrl property: The relative URL to the resource that the RESTful API provides. Type: string (or
     * Expression with resultType string).
     *
     * @param relativeUrl the relativeUrl value to set.
     * @return the RestResourceDataset object itself.
     */
    public RestResourceDataset withRelativeUrl(Object relativeUrl) {
        this.relativeUrl = relativeUrl;
        return this;
    }

    /**
     * Get the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @return the requestMethod value.
     */
    public Object requestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @param requestMethod the requestMethod value to set.
     * @return the RestResourceDataset object itself.
     */
    public RestResourceDataset withRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @return the requestBody value.
     */
    public Object requestBody() {
        return this.requestBody;
    }

    /**
     * Set the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @param requestBody the requestBody value to set.
     * @return the RestResourceDataset object itself.
     */
    public RestResourceDataset withRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @return the additionalHeaders value.
     */
    public Object additionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @param additionalHeaders the additionalHeaders value to set.
     * @return the RestResourceDataset object itself.
     */
    public RestResourceDataset withAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the paginationRules property: The pagination rules to compose next page requests. Type: string (or Expression
     * with resultType string).
     *
     * @return the paginationRules value.
     */
    public Object paginationRules() {
        return this.paginationRules;
    }

    /**
     * Set the paginationRules property: The pagination rules to compose next page requests. Type: string (or Expression
     * with resultType string).
     *
     * @param paginationRules the paginationRules value to set.
     * @return the RestResourceDataset object itself.
     */
    public RestResourceDataset withPaginationRules(Object paginationRules) {
        this.paginationRules = paginationRules;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestResourceDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestResourceDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestResourceDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestResourceDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestResourceDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestResourceDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestResourceDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}