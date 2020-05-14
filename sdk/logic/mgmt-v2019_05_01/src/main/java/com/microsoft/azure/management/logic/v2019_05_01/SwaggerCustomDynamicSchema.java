/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The swagger custom dynamic schema.
 */
public class SwaggerCustomDynamicSchema {
    /**
     * The operation id to fetch dynamic schema.
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /**
     * Json pointer to the dynamic schema on the response body.
     */
    @JsonProperty(value = "valuePath")
    private String valuePath;

    /**
     * The operation parameters.
     */
    @JsonProperty(value = "parameters")
    private Map<String, Object> parameters;

    /**
     * Get the operation id to fetch dynamic schema.
     *
     * @return the operationId value
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set the operation id to fetch dynamic schema.
     *
     * @param operationId the operationId value to set
     * @return the SwaggerCustomDynamicSchema object itself.
     */
    public SwaggerCustomDynamicSchema withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get json pointer to the dynamic schema on the response body.
     *
     * @return the valuePath value
     */
    public String valuePath() {
        return this.valuePath;
    }

    /**
     * Set json pointer to the dynamic schema on the response body.
     *
     * @param valuePath the valuePath value to set
     * @return the SwaggerCustomDynamicSchema object itself.
     */
    public SwaggerCustomDynamicSchema withValuePath(String valuePath) {
        this.valuePath = valuePath;
        return this;
    }

    /**
     * Get the operation parameters.
     *
     * @return the parameters value
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set the operation parameters.
     *
     * @param parameters the parameters value to set
     * @return the SwaggerCustomDynamicSchema object itself.
     */
    public SwaggerCustomDynamicSchema withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

}
