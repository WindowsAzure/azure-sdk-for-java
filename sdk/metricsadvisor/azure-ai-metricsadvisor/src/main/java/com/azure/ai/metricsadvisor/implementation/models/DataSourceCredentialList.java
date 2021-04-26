// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DataSourceCredentialList model. */
@Immutable
public final class DataSourceCredentialList {
    /*
     * The @nextLink property.
     */
    @JsonProperty(value = "@nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * The value property.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataSourceCredential> value;

    /**
     * Get the nextLink property: The @nextLink property.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<DataSourceCredential> getValue() {
        return this.value;
    }
}
