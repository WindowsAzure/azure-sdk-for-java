// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The swagger custom dynamic schema. */
@Fluent
public final class SwaggerCustomDynamicSchema {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SwaggerCustomDynamicSchema.class);

    /*
     * The operation id to fetch dynamic schema.
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /*
     * Json pointer to the dynamic schema on the response body.
     */
    @JsonProperty(value = "valuePath")
    private String valuePath;

    /*
     * The operation parameters.
     */
    @JsonProperty(value = "parameters")
    private Map<String, Object> parameters;

    /**
     * Get the operationId property: The operation id to fetch dynamic schema.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The operation id to fetch dynamic schema.
     *
     * @param operationId the operationId value to set.
     * @return the SwaggerCustomDynamicSchema object itself.
     */
    public SwaggerCustomDynamicSchema withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the valuePath property: Json pointer to the dynamic schema on the response body.
     *
     * @return the valuePath value.
     */
    public String valuePath() {
        return this.valuePath;
    }

    /**
     * Set the valuePath property: Json pointer to the dynamic schema on the response body.
     *
     * @param valuePath the valuePath value to set.
     * @return the SwaggerCustomDynamicSchema object itself.
     */
    public SwaggerCustomDynamicSchema withValuePath(String valuePath) {
        this.valuePath = valuePath;
        return this;
    }

    /**
     * Get the parameters property: The operation parameters.
     *
     * @return the parameters value.
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The operation parameters.
     *
     * @param parameters the parameters value to set.
     * @return the SwaggerCustomDynamicSchema object itself.
     */
    public SwaggerCustomDynamicSchema withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
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
