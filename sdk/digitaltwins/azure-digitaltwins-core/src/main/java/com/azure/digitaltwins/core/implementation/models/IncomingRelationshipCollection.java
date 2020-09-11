// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.digitaltwins.core.models.IncomingRelationship;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The IncomingRelationshipCollection model. */
@Fluent
public final class IncomingRelationshipCollection {
    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<IncomingRelationship> value;

    /*
     * A URI to retrieve the next page of objects.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<IncomingRelationship> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the IncomingRelationshipCollection object itself.
     */
    public IncomingRelationshipCollection setValue(List<IncomingRelationship> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A URI to retrieve the next page of objects.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A URI to retrieve the next page of objects.
     *
     * @param nextLink the nextLink value to set.
     * @return the IncomingRelationshipCollection object itself.
     */
    public IncomingRelationshipCollection setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValue() != null) {
            getValue().forEach(e -> e.validate());
        }
    }
}
