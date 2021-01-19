// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** Request contract for compose operation. */
@Fluent
public final class ComposeRequest {
    /*
     * List of model ids to compose.
     */
    @JsonProperty(value = "modelIds", required = true)
    private List<UUID> modelIds;

    /*
     * Optional user defined model name (max length: 1024).
     */
    @JsonProperty(value = "modelName")
    private String modelName;

    /**
     * Get the modelIds property: List of model ids to compose.
     *
     * @return the modelIds value.
     */
    public List<UUID> getModelIds() {
        return this.modelIds;
    }

    /**
     * Set the modelIds property: List of model ids to compose.
     *
     * @param modelIds the modelIds value to set.
     * @return the ComposeRequest object itself.
     */
    public ComposeRequest setModelIds(List<UUID> modelIds) {
        this.modelIds = modelIds;
        return this;
    }

    /**
     * Get the modelName property: Optional user defined model name (max length: 1024).
     *
     * @return the modelName value.
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * Set the modelName property: Optional user defined model name (max length: 1024).
     *
     * @param modelName the modelName value to set.
     * @return the ComposeRequest object itself.
     */
    public ComposeRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
}
