// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.fluent.models.RoleDefinitionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Role definition list operation result. */
@Fluent
public final class RoleDefinitionListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoleDefinitionListResult.class);

    /*
     * Role definition list.
     */
    @JsonProperty(value = "value")
    private List<RoleDefinitionInner> value;

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
    public List<RoleDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Role definition list.
     *
     * @param value the value value to set.
     * @return the RoleDefinitionListResult object itself.
     */
    public RoleDefinitionListResult withValue(List<RoleDefinitionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RoleDefinitionListResult object itself.
     */
    public RoleDefinitionListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
