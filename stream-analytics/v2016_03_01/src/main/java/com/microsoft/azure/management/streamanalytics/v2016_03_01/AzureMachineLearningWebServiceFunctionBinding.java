/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The binding to an Azure Machine Learning web service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Microsoft.MachineLearning/WebService")
@JsonFlatten
public class AzureMachineLearningWebServiceFunctionBinding extends FunctionBinding {
    /**
     * The Request-Response execute endpoint of the Azure Machine Learning web
     * service. Find out more here:
     * https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs.
     */
    @JsonProperty(value = "properties.endpoint")
    private String endpoint;

    /**
     * The API key used to authenticate with Request-Response endpoint.
     */
    @JsonProperty(value = "properties.apiKey")
    private String apiKey;

    /**
     * The inputs for the Azure Machine Learning web service endpoint.
     */
    @JsonProperty(value = "properties.inputs")
    private AzureMachineLearningWebServiceInputs inputs;

    /**
     * A list of outputs from the Azure Machine Learning web service endpoint
     * execution.
     */
    @JsonProperty(value = "properties.outputs")
    private List<AzureMachineLearningWebServiceOutputColumn> outputs;

    /**
     * Number between 1 and 10000 describing maximum number of rows for every
     * Azure ML RRS execute request. Default is 1000.
     */
    @JsonProperty(value = "properties.batchSize")
    private Integer batchSize;

    /**
     * Get the endpoint value.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint value.
     *
     * @param endpoint the endpoint value to set
     * @return the AzureMachineLearningWebServiceFunctionBinding object itself.
     */
    public AzureMachineLearningWebServiceFunctionBinding withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the apiKey value.
     *
     * @return the apiKey value
     */
    public String apiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey value.
     *
     * @param apiKey the apiKey value to set
     * @return the AzureMachineLearningWebServiceFunctionBinding object itself.
     */
    public AzureMachineLearningWebServiceFunctionBinding withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get the inputs value.
     *
     * @return the inputs value
     */
    public AzureMachineLearningWebServiceInputs inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs value.
     *
     * @param inputs the inputs value to set
     * @return the AzureMachineLearningWebServiceFunctionBinding object itself.
     */
    public AzureMachineLearningWebServiceFunctionBinding withInputs(AzureMachineLearningWebServiceInputs inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get the outputs value.
     *
     * @return the outputs value
     */
    public List<AzureMachineLearningWebServiceOutputColumn> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs value.
     *
     * @param outputs the outputs value to set
     * @return the AzureMachineLearningWebServiceFunctionBinding object itself.
     */
    public AzureMachineLearningWebServiceFunctionBinding withOutputs(List<AzureMachineLearningWebServiceOutputColumn> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the batchSize value.
     *
     * @return the batchSize value
     */
    public Integer batchSize() {
        return this.batchSize;
    }

    /**
     * Set the batchSize value.
     *
     * @param batchSize the batchSize value to set
     * @return the AzureMachineLearningWebServiceFunctionBinding object itself.
     */
    public AzureMachineLearningWebServiceFunctionBinding withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

}
