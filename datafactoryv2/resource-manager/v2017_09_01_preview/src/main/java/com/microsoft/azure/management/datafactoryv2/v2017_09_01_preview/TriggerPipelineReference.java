/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pipeline that needs to be triggered with the given parameters.
 */
public class TriggerPipelineReference {
    /**
     * Pipeline reference.
     */
    @JsonProperty(value = "pipelineReference")
    private PipelineReference pipelineReference;

    /**
     * Pipeline parameters.
     */
    @JsonProperty(value = "parameters")
    private Map<String, Object> parameters;

    /**
     * Get pipeline reference.
     *
     * @return the pipelineReference value
     */
    public PipelineReference pipelineReference() {
        return this.pipelineReference;
    }

    /**
     * Set pipeline reference.
     *
     * @param pipelineReference the pipelineReference value to set
     * @return the TriggerPipelineReference object itself.
     */
    public TriggerPipelineReference withPipelineReference(PipelineReference pipelineReference) {
        this.pipelineReference = pipelineReference;
        return this;
    }

    /**
     * Get pipeline parameters.
     *
     * @return the parameters value
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set pipeline parameters.
     *
     * @param parameters the parameters value to set
     * @return the TriggerPipelineReference object itself.
     */
    public TriggerPipelineReference withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

}
