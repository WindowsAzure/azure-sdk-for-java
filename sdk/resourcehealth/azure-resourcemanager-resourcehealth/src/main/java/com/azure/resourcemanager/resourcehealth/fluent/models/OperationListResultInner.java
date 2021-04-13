// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcehealth.models.Operation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Lists the operations response. */
@Fluent
public final class OperationListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationListResultInner.class);

    /*
     * List of operations available in the resourcehealth resource provider.
     */
    @JsonProperty(value = "value", required = true)
    private List<Operation> value;

    /**
     * Get the value property: List of operations available in the resourcehealth resource provider.
     *
     * @return the value value.
     */
    public List<Operation> value() {
        return this.value;
    }

    /**
     * Set the value property: List of operations available in the resourcehealth resource provider.
     *
     * @param value the value value to set.
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withValue(List<Operation> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model OperationListResultInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
