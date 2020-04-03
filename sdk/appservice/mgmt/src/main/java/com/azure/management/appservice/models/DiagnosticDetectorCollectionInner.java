// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DiagnosticDetectorCollection model.
 */
@Fluent
public final class DiagnosticDetectorCollectionInner {
    /*
     * Collection of resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<DetectorDefinitionInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Collection of resources.
     * 
     * @return the value value.
     */
    public List<DetectorDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     * 
     * @param value the value value to set.
     * @return the DiagnosticDetectorCollectionInner object itself.
     */
    public DiagnosticDetectorCollectionInner withValue(List<DetectorDefinitionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }
}
