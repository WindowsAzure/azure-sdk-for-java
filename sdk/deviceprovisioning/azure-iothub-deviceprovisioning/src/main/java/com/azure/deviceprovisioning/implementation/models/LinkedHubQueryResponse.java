// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.deviceprovisioning.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LinkedHubQueryResponse model. */
@Immutable
public final class LinkedHubQueryResponse {
    /*
     * The query results.
     */
    @JsonProperty(value = "values", access = JsonProperty.Access.WRITE_ONLY)
    private List<LinkedHub> values;

    /*
     * The continuation token for requesting the next page of results for this
     * query.
     */
    @JsonProperty(value = "continuationToken", access = JsonProperty.Access.WRITE_ONLY)
    private String continuationToken;

    /**
     * Get the values property: The query results.
     *
     * @return the values value.
     */
    public List<LinkedHub> getValues() {
        return this.values;
    }

    /**
     * Get the continuationToken property: The continuation token for requesting the next page of results for this
     * query.
     *
     * @return the continuationToken value.
     */
    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValues() != null) {
            getValues().forEach(e -> e.validate());
        }
    }
}
