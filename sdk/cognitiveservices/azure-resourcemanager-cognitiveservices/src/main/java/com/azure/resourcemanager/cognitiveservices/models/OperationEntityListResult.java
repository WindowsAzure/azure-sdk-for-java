// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.fluent.models.OperationEntityInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of cognitive services accounts operation response. */
@Fluent
public final class OperationEntityListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationEntityListResult.class);

    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of operations.
     */
    @JsonProperty(value = "value")
    private List<OperationEntityInner> value;

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the OperationEntityListResult object itself.
     */
    public OperationEntityListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of operations.
     *
     * @return the value value.
     */
    public List<OperationEntityInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of operations.
     *
     * @param value the value value to set.
     * @return the OperationEntityListResult object itself.
     */
    public OperationEntityListResult withValue(List<OperationEntityInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
