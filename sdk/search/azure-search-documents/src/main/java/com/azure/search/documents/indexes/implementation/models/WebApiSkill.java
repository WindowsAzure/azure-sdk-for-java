// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;
import java.util.List;
import java.util.Map;

/** The WebApiSkill model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Skills.Custom.WebApiSkill")
@JsonFlatten
@Fluent
public class WebApiSkill extends SearchIndexerSkill {
    /*
     * The url for the Web API.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /*
     * The headers required to make the http request.
     */
    @JsonProperty(value = "httpHeaders")
    private Map<String, String> httpHeaders;

    /*
     * The method for the http request.
     */
    @JsonProperty(value = "httpMethod")
    private String httpMethod;

    /*
     * The desired timeout for the request. Default is 30 seconds.
     */
    @JsonProperty(value = "timeout")
    private Duration timeout;

    /*
     * The desired batch size which indicates number of documents.
     */
    @JsonProperty(value = "batchSize")
    private Integer batchSize;

    /*
     * If set, the number of parallel calls that can be made to the Web API.
     */
    @JsonProperty(value = "degreeOfParallelism")
    private Integer degreeOfParallelism;

    /** Creates an instance of WebApiSkill class. */
    @JsonCreator
    public WebApiSkill(
            @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
            @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs,
            @JsonProperty(value = "uri", required = true) String uri) {
        super(inputs, outputs);
        this.uri = uri;
    }

    /**
     * Get the uri property: The url for the Web API.
     *
     * @return the uri value.
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * Set the uri property: The url for the Web API.
     *
     * @param uri the uri value to set.
     * @return the WebApiSkill object itself.
     */
    /**
     * Get the httpHeaders property: The headers required to make the http request.
     *
     * @return the httpHeaders value.
     */
    public Map<String, String> getHttpHeaders() {
        return this.httpHeaders;
    }

    /**
     * Set the httpHeaders property: The headers required to make the http request.
     *
     * @param httpHeaders the httpHeaders value to set.
     * @return the WebApiSkill object itself.
     */
    public WebApiSkill setHttpHeaders(Map<String, String> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    /**
     * Get the httpMethod property: The method for the http request.
     *
     * @return the httpMethod value.
     */
    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * Set the httpMethod property: The method for the http request.
     *
     * @param httpMethod the httpMethod value to set.
     * @return the WebApiSkill object itself.
     */
    public WebApiSkill setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * Get the timeout property: The desired timeout for the request. Default is 30 seconds.
     *
     * @return the timeout value.
     */
    public Duration getTimeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: The desired timeout for the request. Default is 30 seconds.
     *
     * @param timeout the timeout value to set.
     * @return the WebApiSkill object itself.
     */
    public WebApiSkill setTimeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the batchSize property: The desired batch size which indicates number of documents.
     *
     * @return the batchSize value.
     */
    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * Set the batchSize property: The desired batch size which indicates number of documents.
     *
     * @param batchSize the batchSize value to set.
     * @return the WebApiSkill object itself.
     */
    public WebApiSkill setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Get the degreeOfParallelism property: If set, the number of parallel calls that can be made to the Web API.
     *
     * @return the degreeOfParallelism value.
     */
    public Integer getDegreeOfParallelism() {
        return this.degreeOfParallelism;
    }

    /**
     * Set the degreeOfParallelism property: If set, the number of parallel calls that can be made to the Web API.
     *
     * @param degreeOfParallelism the degreeOfParallelism value to set.
     * @return the WebApiSkill object itself.
     */
    public WebApiSkill setDegreeOfParallelism(Integer degreeOfParallelism) {
        this.degreeOfParallelism = degreeOfParallelism;
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
        if (getUri() == null) {
            throw new IllegalArgumentException("Missing required property uri in model WebApiSkill");
        }
    }
}
