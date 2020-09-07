// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RoleDefinitionListResult model. */
@Fluent
public final class RoleDefinitionListResult {
    /*
     * Role definition list.
     */
    @JsonProperty(value = "value")
    private List<RoleDefinition> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Role definition list.
     *
     * @return the value value.
     */
    public List<RoleDefinition> getValue() {
        return this.value;
    }

    /**
     * Set the value property: Role definition list.
     *
     * @param value the value value to set.
     * @return the RoleDefinitionListResult object itself.
     */
    public RoleDefinitionListResult setValue(List<RoleDefinition> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RoleDefinitionListResult object itself.
     */
    public RoleDefinitionListResult setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
