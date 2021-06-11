// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response to a batch query. */
@Fluent
public final class BatchResponse {
    /*
     * An array of responses corresponding to each individual request in a
     * batch.
     */
    @JsonProperty(value = "responses")
    private List<BatchQueryResponse> responses;

    /**
     * Get the responses property: An array of responses corresponding to each individual request in a batch.
     *
     * @return the responses value.
     */
    public List<BatchQueryResponse> getResponses() {
        return this.responses;
    }

    /**
     * Set the responses property: An array of responses corresponding to each individual request in a batch.
     *
     * @param responses the responses value to set.
     * @return the BatchResponse object itself.
     */
    public BatchResponse setResponses(List<BatchQueryResponse> responses) {
        this.responses = responses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getResponses() != null) {
            getResponses().forEach(e -> e.validate());
        }
    }
}
