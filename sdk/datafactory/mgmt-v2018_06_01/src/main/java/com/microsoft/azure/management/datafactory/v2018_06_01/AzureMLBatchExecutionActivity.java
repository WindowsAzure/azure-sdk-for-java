/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Azure ML Batch Execution activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureMLBatchExecutionActivity.class)
@JsonTypeName("AzureMLBatchExecution")
@JsonFlatten
public class AzureMLBatchExecutionActivity extends ExecutionActivity {
    /**
     * Key,Value pairs to be passed to the Azure ML Batch Execution Service
     * endpoint. Keys must match the names of web service parameters defined in
     * the published Azure ML web service. Values will be passed in the
     * GlobalParameters property of the Azure ML batch execution request.
     */
    @JsonProperty(value = "typeProperties.globalParameters")
    private Map<String, Object> globalParameters;

    /**
     * Key,Value pairs, mapping the names of Azure ML endpoint's Web Service
     * Outputs to AzureMLWebServiceFile objects specifying the output Blob
     * locations. This information will be passed in the WebServiceOutputs
     * property of the Azure ML batch execution request.
     */
    @JsonProperty(value = "typeProperties.webServiceOutputs")
    private Map<String, AzureMLWebServiceFile> webServiceOutputs;

    /**
     * Key,Value pairs, mapping the names of Azure ML endpoint's Web Service
     * Inputs to AzureMLWebServiceFile objects specifying the input Blob
     * locations.. This information will be passed in the WebServiceInputs
     * property of the Azure ML batch execution request.
     */
    @JsonProperty(value = "typeProperties.webServiceInputs")
    private Map<String, AzureMLWebServiceFile> webServiceInputs;

    /**
     * Get key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint. Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be passed in the GlobalParameters property of the Azure ML batch execution request.
     *
     * @return the globalParameters value
     */
    public Map<String, Object> globalParameters() {
        return this.globalParameters;
    }

    /**
     * Set key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint. Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be passed in the GlobalParameters property of the Azure ML batch execution request.
     *
     * @param globalParameters the globalParameters value to set
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity withGlobalParameters(Map<String, Object> globalParameters) {
        this.globalParameters = globalParameters;
        return this;
    }

    /**
     * Get key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the WebServiceOutputs property of the Azure ML batch execution request.
     *
     * @return the webServiceOutputs value
     */
    public Map<String, AzureMLWebServiceFile> webServiceOutputs() {
        return this.webServiceOutputs;
    }

    /**
     * Set key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the WebServiceOutputs property of the Azure ML batch execution request.
     *
     * @param webServiceOutputs the webServiceOutputs value to set
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity withWebServiceOutputs(Map<String, AzureMLWebServiceFile> webServiceOutputs) {
        this.webServiceOutputs = webServiceOutputs;
        return this;
    }

    /**
     * Get key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the WebServiceInputs property of the Azure ML batch execution request.
     *
     * @return the webServiceInputs value
     */
    public Map<String, AzureMLWebServiceFile> webServiceInputs() {
        return this.webServiceInputs;
    }

    /**
     * Set key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the WebServiceInputs property of the Azure ML batch execution request.
     *
     * @param webServiceInputs the webServiceInputs value to set
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity withWebServiceInputs(Map<String, AzureMLWebServiceFile> webServiceInputs) {
        this.webServiceInputs = webServiceInputs;
        return this;
    }

}
